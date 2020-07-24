define(function () {
    angular.module('app').controller('bas.maprep1',
        function ($rootScope, $scope, $location, uiGridConstants, utils, path, settings,
            $timeout, dialog, toastr, ngDialog, qwsys, $http) {
            var scope = $scope;
            scope.filter = {};
            scope.model = {
                records: 0,
                content: []
            }
            scope.datapage = {
                page: 0,
                size: 20,
                sort: "created,desc"
            }
            scope.promise = null;
            scope.listUrl = "plugins/bas/templates/list.html";
            scope.config = {
                gridkey: "maprep1",
                title: "客戶清冊列印",
                listoperation: {
                    add: {
                        name: "新增",
                        icon: "fa-calendar-check-o",
                        action: function (event, scope) {
                            scope.action.add();
                        }
                    }
                },
                headers: {
                    "cus_nbr": {
                        displayName: "客戶編號",
                        width: 120
                    },
                    "cus_name": {
                        displayName: "客戶名稱",
                        width: 120
                    },
                    "cus_alias": {
                        displayName: "客戶簡稱",
                        width: 120
                    },
                    "big_key": {
                        displayName: "譯音碼",
                        width: 120
                    },
                    "cus_addr": {
                        displayName: "客戶地址",
                        width: 120
                    },
                    "ivc_addr": {
                        displayName: "發票地址",
                        width: 120
                    },
                    "area_nbr": {
                        displayName: "地區名稱",
                        width: 120
                    },
                    "sale_nbr": {
                        displayName: "業務員",
                        width: 120
                    },
                    "cus_gun": {
                        displayName: "統一編號",
                        width: 120
                    },
                    "attname": {
                        displayName: "負責人",
                        width: 120
                    },
                    "cus_tel1": {
                        displayName: "客戶電話1",
                        width: 120
                    },
                    "cus_tel2": {
                        displayName: "客戶電話2",
                        width: 120
                    },
                    "cus_fax": {
                        displayName: "傳真機號碼",
                        width: 120
                    },
                    "sale_inv": {
                        displayName: "營業項目",
                        width: 120
                    },
                    "l_shpdate": {
                        displayName: "最近交易日期",
                        width: 120
                    },
                    "ddate": {
                        displayName: "開始交易日",
                        width: 120
                    },
                    "l_update": {
                        displayName: "最近異動日期",
                        width: 120
                    },
                    "attname1": {
                        displayName: "連絡人1",
                        width: 120
                    },
                    "cus_oth1": {
                        displayName: "分機1",
                        width: 120
                    },
                    "attname2": {
                        displayName: "連絡人2",
                        width: 120
                    },
                    "cus_oth2": {
                        displayName: "分機2",
                        width: 120
                    },
                    "cellphone": {
                        displayName: "手機號碼",
                        width: 120
                    },
                    "acounter": {
                        displayName: "會計",
                        width: 120
                    },
                    "a_tel": {
                        displayName: "電話3",
                        width: 120
                    },
                    "a_oth": {
                        displayName: "分機3",
                        width: 120
                    },
                    "shp_desc": {
                        displayName: "業務性質",
                        width: 120
                    }
                },
                filterItems: {
                    cus_nbr: {
                        type: "basLov",
                        lovtype: "get_cus",
                        name: "cus_nbr",
                        label: "客戶編號F"
                    },
                    cus_nbrb: {   //虛擬欄位
                        type: "basLov",
                        lovtype: "get_cus",
                        name: "cus_nbrb",
                        label: "客戶編號T"
                    },
                    area_nbr: {
                        type: "basLov",
                        lovtype: "get_are",
                        name: "area_nbr",
                        label: "地區名稱F"
                    },
                    area_nbrb: { //虛擬欄位
                        type: "basLov",
                        lovtype: "get_are",
                        name: "area_nbrb",
                        label: "地區名稱T"
                    },
                    sale_nbr: {
                        type: "basLov",
                        lovtype: "get_sal",
                        name: "sale_nbr",
                        label: "業務員F"
                    },
                    sale_nbrb: {  //虛擬欄位
                        type: "basLov",
                        lovtype: "get_sal",
                        name: "sale_nbrb",
                        label: "業務員T"
                    },
                    l_shpdate: {
                        type: "basEsydatetime",
                        name: "l_shpdate",
                        label: "最近交易日期F"
                    },
                    l_shpdateb: {   //虛擬欄位
                        type: "basEsydatetime",
                        name: "l_shpdateb",
                        label: "最近交易日期T"
                    },
                    shp_desc: {
                        type: "basLov",
                        lovtype: "get_word",
                        name: "shp_desc",
                        label: "業務性質"
                    }
                }
            }

            scope.action = {
                add: function () {
                    $rootScope.uid = "";
                    scope.action.opendetail();
                },

                load: function () {

                    scope.promise = utils.ajax({
                        method: 'POST',
                        url: "bas/cuscus/query?page=" + scope.datapage.page + "&size=" + scope.datapage.size + "&sort=" + scope.datapage.sort,
                        mockUrl: "plugins/base/data/orderlines.json",
                        data: scope.filter
                    }).then(function (res) {
                        scope.model = res.data.body;
                    });

                },
                reset: function () {
                    scope.filter = {

                    };

                },
                changepage: function (page, size, sort) {
                    scope.datapage.page = page;
                    scope.datapage.size = size;
                    if (sort) {
                        scope.datapage.sort = sort;
                    }
                    scope.action.load();
                },
                rowclick: function (entity) {
                    $rootScope.uid = entity.uid;
                    scope.action.opendetail();
                },
                opendetail: function () {
                    var node = {
                        name: "",
                        url: 'bas/maprep1.detail'
                    }
                    $scope.$emit('opencusdetail', node);
                }
            }
            $scope.$on('refreshcuscus', function (event, message) {
                scope.action.load()
            });
            scope.action.load();
        });

});
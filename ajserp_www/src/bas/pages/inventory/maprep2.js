define(function () {
    angular.module('app').controller('bas.maprep2',
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
                gridkey: "maprep2",
                title: "廠商清冊列印",
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
                    "ven_nbr": {
                        displayName: "廠商編號",
                        width: 120
                    },
                    "ven_name": {
                        displayName: "廠商名稱",
                        width: 120
                    },
                    "ven_alias": {
                        displayName: "廠商簡稱",
                        width: 120
                    },
                    "big_key": {
                        displayName: "譯音碼",
                        width: 120
                    },
                    "chk_desc": {
                        displayName: "票據抬頭",
                        width: 120
                    },
                    "sen_addr": {
                        displayName: "廠商地址",
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
                    "ven_gun": {
                        displayName: "統一編號",
                        width: 120
                    },
                    "attname": {
                        displayName: "負責人",
                        width: 120
                    },
                    "attname1": {
                        displayName: "連絡人1",
                        width: 120
                    },
                    "attname2": {
                        displayName: "連絡人2",
                        width: 120
                    },
                    "ven_tel1": {
                        displayName: "廠商電話1",
                        width: 120
                    },
                    "ven_tel2": {
                        displayName: "廠商電話2",
                        width: 120
                    },
                    "pur_oth1": {
                        displayName: "分機1",
                        width: 120
                    },
                    "pur_oth2": {
                        displayName: "分機2",
                        width: 120
                    },
                    "cellphone": {
                        displayName: "手機",
                        width: 120
                    },
                    "acounter": {
                        displayName: "會計",
                        width: 120
                    },
                    "ven_fax": {
                        displayName: "傳真機號碼",
                        width: 120
                    },
                    "sale_inv": {
                        displayName: "營業項目",
                        width: 120
                    },
                    "shp_desc": {
                        displayName: "業務性質",
                        width: 120
                    },
                    "l_shpdate": {
                        displayName: "開始交易日",
                        width: 120
                    },
                    "l_update": {
                        displayName: "最近異動日",
                        width: 120
                    }
                },
                filterItems: {
                    ven_nbr: {
                        type: "basLov",
                        lovtype: "get_ven",
                        name: "ven_nbr",
                        label: "廠商編號F"
                    },
                    ven_nbrb: {
                        type: "basLov",
                        lovtype: "get_ven",
                        name: "ven_nbrb",
                        label: "廠商編號T"
                    },
                    area_nbr: {
                        type: "basLov",
                        lovtype: "get_are",
                        name: "area_nbr",
                        label: "地區名稱F"
                    },
                    area_nbrb: {
                        type: "basLov",
                        lovtype: "get_are",
                        name: "area_nbrb",
                        label: "地區名稱T"
                    },
                    l_shpdate: {
                        type: "basEsydatetime",
                        lovtype: "",
                        name: "l_shpdate",
                        label: "最近交易日期F"
                    },
                    l_shpdateb: {
                        type: "basEsydatetime",
                        lovtype: "",
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
                        url: "bas/purven/query?page=" + scope.datapage.page + "&size=" + scope.datapage.size + "&sort=" + scope.datapage.sort,
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
                        url: 'bas/maprep2.detail'
                    }
                    $scope.$emit('opencusdetail', node);
                }
            }
            $scope.$on('refreshpurven', function (event, message) {
                scope.action.load()
            });
            scope.action.load();
        });

});
define(function() {
    angular.module('app').controller('bas.map12',
        function($rootScope, $scope, $location, uiGridConstants, utils, path, settings,
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
                title: "廠商維護",
                listoperation: {
                    add: {
                        name: "新增",
                        icon: "fa-calendar-check-o",
                        action: function(event, scope) {
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
                    "cellphone": {
                        displayName: "手機",
                        width: 120
                    },
                    "ven_tel1": {
                        displayName: "廠商電話1",
                        width: 120
                    },
                    "attname1": {
                        displayName: "連絡人1",
                        width: 120
                    },
                    "ven_fax": {
                        displayName: "傳真機號碼",
                        width: 120
                    },
                    "shp_desc": {
                        displayName: "業務性質",
                        width: 120
                    },
                    "ven_addr": {
                        displayName: "公司地址",
                        width: 120
                    },
                    "l_shpdate": {
                        displayName: "最近交易日期",
                        width: 120
                    },
                    "remark": {
                        displayName: "備註",
                        width: 120
                    },
                },
                filterItems: {
                    ven_nbr: {
                        type: "input",
                        name: "ven_nbr",
                        label: "廠商編號"
                    },
                    ven_name: {
                        type: "input",
                        lovtype: "",
                        name: "ven_name",
                        label: "廠商名稱"
                    },
                    ven_alias: {
                        type: "input",
                        lovtype: "",
                        name: "ven_alias",
                        label: "廠商簡稱"
                    },
                    big_key: {
                        type: "basDefault",
                        lovtype: "",
                        name: "big_key",
                        label: "譯音碼"
                    }
                },
                filtermoreItems: {
                    ven_tel: {
                        type: "basDefault",
                        lovtype: "",
                        name: "ven_tel",
                        label: "廠商電話"
                    },
                    remark: {
                        type: "basDefault",
                        lovtype: "",
                        name: "remark",
                        label: "備註"
                    },
                    shp_desc: {
                        type: "input",
                        lovtype: "",
                        name: "shp_desc",
                        label: "業務性質"
                    },
                    attname: {
                        type: "basDefault",
                        lovtype: "",
                        name: "attname1",
                        label: "連絡人1"
                    },
                    l_shpdate: {
                        type: "basDefault",
                        lovtype: "",
                        name: "l_shpdate",
                        label: "最近交易日期"
                    }
                }
            }

            scope.action = {
                add: function() {
                    $rootScope.uid = "";
                    scope.action.opendetail();
                },

                load: function() {

                    scope.promise = utils.ajax({
                        method: 'POST',
                        url: "bas/purven/query?page=" + scope.datapage.page + "&size=" + scope.datapage.size + "&sort=" + scope.datapage.sort,
                        mockUrl: "plugins/base/data/orderlines.json",
                        data: scope.filter
                    }).then(function(res) {
                        scope.model = res.data.body;
                    });

                },
                reset: function() {
                    scope.filter = {

                    };

                },
                changepage: function(page, size, sort) {
                    scope.datapage.page = page;
                    scope.datapage.size = size;
                    scope.datapage.sort = sort;
                    scope.action.load();
                },
                rowclick: function(entity) {
                    $rootScope.uid = entity.uid;
                    scope.action.opendetail();
                },
                opendetail: function() {
                    var node = {
                        name: "廠商明細",
                        url: 'bas/map12.detail'
                    }
                    $scope.$emit('opencusdetail', node);
                }
            }
            $scope.$on('refreshpurven', function(event, message) {
                scope.action.load()
            });
            scope.action.load();
        });

});
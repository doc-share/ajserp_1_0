define(function () {
    angular.module('app').controller('acr.map78',
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
                gridkey: "map78",
                title: "應收帳款查詢",
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
                        displayName: "客戶代號",
                        width: 120
                    },
                    "cus_alias": {
                        displayName: "客戶簡稱",
                        width: 120
                    },
                    "bal_amt": {
                        displayName: "前期餘額",
                        width: 120
                    },
                    "shp_amt": {
                        displayName: "本月出貨金額",
                        type: "number",
                        ondblclick: function (entity) {
                            $rootScope.shpbah = {
                                cus_nbr: entity.cus_nbr,
                                acr_mon: entity.acr_mon,
                                is_sure: "Y"
                            };
                            scope.action.opendetail();
                        },
                        width: 120
                    },
                    "rshp_amt": {
                        displayName: "本月退貨金額",
                        type: "number",
                        ondblclick: function (entity) {
                            $rootScope.shpbah = {
                                cus_nbr: entity.cus_nbr,
                                acr_mon: entity.acr_mon,
                                is_sure: "Y"
                            };
                            scope.action.opendetail();
                        },
                        width: 120
                    },
                    "tax_amt": {
                        displayName: "稅額",
                        ondblclick: function (entity) {
                            $rootScope.shpbah = {
                                cus_nbr: entity.cus_nbr,
                                acr_mon: entity.acr_mon,
                                is_sure: "Y"
                            };
                            scope.action.opendetail();
                        },
                        width: 120
                    },
                    "rec_amt": {
                        displayName: "已沖款金額",
                        width: 120
                    }
                },
                filterItems: {
                    acr_mon: {
                        type: "basEsydatetime",
                        format: "YYYYMM",
                        name: "acr_mon",
                        label: "結帳月份"
                    },
                    cus_nbr: {
                        type: "basLov",
                        lovtype: "get_cus",
                        name: "cus_nbr",
                        label: "客戶代號"
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
                        url: "acr/acrbal/query?page=" + scope.datapage.page + "&size=" + scope.datapage.size + "&sort=" + scope.datapage.sort,
                        mockUrl: "plugins/base/data/orderlines.json",
                        data: scope.filter
                    }).then(function (res) {
                        scope.model = res.data.body;
                        scope.model.content.forEach(function (element) {
                            element.tax_amt = element.tax_amt - element.rtax_amt
                            element.tot_amt = element.bal_amt + element.shp_amt + element.tax_amt - element.rshp_amt - element.rec_amt;
                        }, this);
                    });

                },
                reset: function () {
                    scope.filter = {
                        acr_mon: qwsys.getAcrmon(new Date())
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
                        name: "出貨查詢",
                        url: 'shp/map44.detail'
                    }
                    $scope.$emit('opencusdetail', node);
                }
            }
            $scope.$on('refreshacrbal', function (event, message) {
                scope.action.load()
            });
            scope.action.load();
        });

});
define(function () {
    angular.module('app').controller('pur.map21',
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
                gridkey: "map21",
                title: "採購資料",
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
                    "nbr": {
                        displayName: "單據號碼",
                        width: 120
                    },
                    "nbrdate": {
                        displayName: "日期",
                        width: 120
                    },
                    "tot_amt": {
                        displayName: "總金額",
                        width: 120
                    },
                    "ven_nbr": {
                        displayName: "供應商代號",
                        width: 120
                    },
                    "plan_date": {
                        displayName: "預定到貨日",
                        width: 120
                    },
                    "pay_term": {
                        displayName: "交易方式",
                        width: 120
                    },
                    "ven_nbr1": {
                        displayName: "指送廠商",
                        width: 120
                    },
                    "cus_ord": {
                        displayName: "客戶訂單據號碼",
                        width: 120
                    },
                    "coin_nbr": {
                        displayName: "幣別",
                        width: 120
                    },
                    "sale_nbr": {
                        displayName: "業務員",
                        width: 120
                    },
                    "coin_per": {
                        displayName: "匯率",
                        width: 120
                    },
                    "ord_nbr": {
                        displayName: "訂單單據號碼",
                        width: 120
                    },
                    "status": {
                        displayName: "狀態",
                        width: 120
                    },
                    "remark": {
                        displayName: "備註",
                        width: 120
                    },
                    "isord": {
                        displayName: " 是否轉單",
                        width: 120
                    }
                },
                filterItems: {
                    nbr: {
                        type: "basDefault",
                        lovtype: "",
                        name: "nbr",
                        label: "單據號碼"
                    },
                    cus_ord: {
                        type: "basDefault",
                        lovtype: "",
                        name: "cus_ord",
                        label: "客戶訂單據號碼"
                    },
                    nbrdate: {
                        type: "basEsydatetime",
                        lovtype: "",
                        name: "nbrdate",
                        label: "日期"
                    },
                    ven_nbr: {
                        type: "basLov",
                        lovtype: "get_ven",
                        name: "ven_nbr",
                        label: "供應商代號"
                    },
                    ven_nbr1: {
                        type: "basLov",
                        lovtype: "get_ven",
                        name: "ven_nbr1",
                        label: "指送廠商"
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
                        url: "pur/purbah/query?page=" + scope.datapage.page + "&size=" + scope.datapage.size + "&sort=" + scope.datapage.sort,
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
                        name: "採購資料明細",
                        url: 'pur/map21.detail'
                    }
                    $scope.$emit('opencusdetail', node);
                }
            }
            $scope.$on('refreshpurbah', function (event, message) {
                scope.action.load()
            });
            scope.action.load();
        });

});
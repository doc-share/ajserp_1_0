define(function () {
    angular.module('app').controller('shp.map44',
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
                gridkey: "map44",
                title: "出貨單資料",
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
                    "cus_nbr": {
                        displayName: "請款客戶",
                        width: 120
                    },
                    "nbrdate": {
                        displayName: "日期",
                        width: 120
                    },
                    "cen_cus": {
                        displayName: "指定客戶",
                        width: 120
                    },
                    "acr_mon": {
                        displayName: "結帳月份",
                        width: 120
                    },
                    "sale_nbr": {
                        displayName: "業務員代號",
                        width: 120
                    },
                    "pay_term":{
                        displayName: "付款方式",
                        width: 120
                    },
                    "attname1": {
                        displayName: "連絡人1",
                        width: 120
                    },
                    "tax_type": {
                        displayName: "稅別",
                        width: 120
                    },
                    "tax_amt": {
                        displayName: "稅額",
                        width: 120
                    },
                    "coin_nbr": {
                        displayName: "幣別",
                        width: 120
                    },
                    "coin_per": {
                        displayName: "匯率",
                        width: 120
                    },
                    "ware_nbr": {
                        displayName: "倉庫",
                        width: 120
                    },
                    "rec_amt": {     //欄位名稱待確認，先用rec_amt
                        displayName: "未稅總額",
                        width: 120
                    },
                    "ivc_nbr": {
                        displayName: "發票號碼",
                        width: 120
                    },
                    "tot_amt": {   //欄位名稱待確認，先用tot_amt
                        displayName: "出貨總額",
                        width: 120
                    },
                    "status": {
                        displayName: "狀態",
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
                    cus_nbr: {
                        type: "basLov",
                        lovtype: "get_cus",
                        name: "cus_nbr",
                        label: "客戶代號"
                    },
                    nbrdate: {
                        type: "basEsydatetime",
                        lovtype: "",
                        name: "nbrdate",
                        label: "日期"
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
                        url: "ord/shpbah/query?page=" + scope.datapage.page + "&size=" + scope.datapage.size + "&sort=" + scope.datapage.sort,
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
                        name: "出貨單資料明細",
                        url: 'shp/map44.detail'
                    }
                    $scope.$emit('opencusdetail', node);
                }
            }
            $scope.$on('refreshordbah', function (event, message) {
                scope.action.load()
            });
            scope.action.load();
        });

});
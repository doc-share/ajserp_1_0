define(function() {
    angular.module('app').controller('acr.acrbah',
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
                gridkey: "acrbah",
                title: "應收帳款",
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
                    "nbr": {
                        displayName: "收款單號",
                        width: 120
                    },
                    "date": {
                        displayName: "收款日期",
                        width: 120
                    },
                    "cus_nbr": {
                        displayName: "客戶代號",
                        width: 120
                    },
                    "acr_mon": {
                        displayName: "结帳月份",
                        width: 120
                    },
                    "tot_acr": {
                        displayName: "本月應收",
                        width: 120
                    },
                    "pre_amt": {
                        displayName: "計入預收金額",
                        width: 120
                    },
                    "aft_amt": {
                        displayName: "累計應收餘額",
                        width: 120
                    },
                    "tot_amt": {
                        displayName: "可用沖款之金額",
                        width: 120
                    },
                    "tax_amt": {
                        displayName: "代扣稅額",
                        width: 120
                    },
                    "wait_amt": {
                        displayName: "實際沖款金額",
                        width: 120
                    },
                    "other_amt": {
                        displayName: "匯費、郵資",
                        width: 120
                    },
                    "cash_amt": {
                        displayName: "現金金額",
                        width: 120
                    },
                    "chk_amt": {
                        displayName: "票據金額",
                        width: 120
                    },
                    "cut_amt": {
                        displayName: "折讓金額",
                        width: 120
                    },
                    "other_amt": {
                        displayName: "其他金額",
                        width: 120
                    },
                    "other_amt": {
                        displayName: "抵扣金額",
                        width: 120
                    },
                    "status": {
                        displayName: "狀態",
                        width: 120
                    }
                },
                filterItems: {
                    nbr:{
                        label: "收款單號",
                        name: "nbr",
                        type: "basDefault"
                    },
                    group_nbr: {
                        label: "客戶代號", 
                        name: "group_nbr",
                        type: "basLov",
                        lovtype:"getcus"
                    },
                    acr_mon: {
                        label: "结帳月份", 
                        name: "group_nbr",
                        type: "basEsydatetime",
                        format: "YYYYMM"
                    },
                },
            };
            scope.action = {
                add: function() {
                    $rootScope.uid = "";
                    scope.action.opendetail();
                },

                load: function() {

                    scope.promise = utils.ajax({
                        method: 'POST',
                        url: "bas/basgroup/query?page=" + scope.datapage.page + "&size=" + scope.datapage.size + "&sort=" + scope.datapage.sort,
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
                    if (sort) {
                        scope.datapage.sort = sort;
                    }
                    scope.action.load();
                },
                rowclick: function(entity) {
                    $rootScope.uid = entity.uid;
                    scope.action.opendetail();
                },
                opendetail: function() {
                    var node = {
                        name: "應收帳款明細",
                        url: 'bas/basgroup.detail'
                    }
                    $scope.$emit('opencusdetail', node);
                }
            }
            $scope.$on('refreshbasgroup', function(event, message) {
                scope.action.load()
            });
            scope.action.load();
        });

});
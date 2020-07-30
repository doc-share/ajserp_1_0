define(function () {
    angular.module('app').controller('acp.map83',
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
                gridkey: "map83",
                title: "應付帳款資料",
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
                    "status": {
                        displayName: "狀態",
                        width: 120
                    },
                    "acr_mon": {
                        displayName: "結帳月份",
                        width: 120
                    },
                    "ven_nbr": {
                        displayName: "廠商代號",
                        width: 120
                    },
                    "nbr": {
                        displayName: "付款單代號",
                        width: 120
                    },
                    "nbrdate": {
                        displayName: "付款日期",
                        width: 120
                    },
                    "tot_amt": {
                        displayName: "可用沖款金額",
                        width: 120
                    }
                },
                filterItems: {
                    ven_nbr: {
                        type: "basLov",
                        lovtype: "get_ven",
                        name: "ven_nbr",
                        label: "廠商代號"
                    },
                    nbr: {
                        type: "basDefault",
                        lovtype: "",
                        name: "nbr",
                        label: "付款單代號"
                    },
                    acr_mon: {
                        type: "basEsydatetime",
                        format:"YYYYMM",
                        name: "acr_mon",
                        label: "結帳月份"
                    },
                    nbrdate: {
                        type: "basEsydatetime",
                        lovtype: "",
                        name: "nbrdate",
                        label: "付款日期"
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
                        url: "acp/acpbah/query?page=" + scope.datapage.page + "&size=" + scope.datapage.size + "&sort=" + scope.datapage.sort,
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
                        name: "應付帳款資料明細",
                        url: 'acp/map83.detail'
                    }
                    $scope.$emit('opencusdetail', node);
                }
            }
            $scope.$on('refreshacpbah', function (event, message) {
                scope.action.load()
            });
            scope.action.load();
        });

});
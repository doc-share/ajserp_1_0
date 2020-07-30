define(function () {
    angular.module('app').controller('nms.mapz1',
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
                gridkey: "mapz1",
                title: "銀行資料",
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
                    "b_nbr": {
                        displayName: "銀行代號",
                        width: 120
                    },
                    "b_name": {
                        displayName: "銀行名稱",
                        width: 120
                    },
                    "b_alias": {
                        displayName: "銀行簡稱",
                        width: 120
                    },
                    "b_code": {
                        displayName: "銀行帳號",
                        width: 120
                    },
                    "b_tel1": {
                        displayName: "銀行電話1",
                        width: 120
                    },
                    "b_fax": {
                        displayName: "傳真機號碼",
                        width: 120
                    },
                    "b_addr": {
                        displayName: "銀行地址",
                        width: 120
                    },
                    "nbrdate": {
                        displayName: "開帳日期",
                        width: 120
                    },
                    "b_amt": {
                        displayName: "開帳金額",
                        width: 120
                    },
                    "bal_amt": {
                        displayName: "餘 額",
                        width: 120
                    },
                    "remark": {
                        displayName: "備註",
                        width: 120
                    }
                },
                filterItems: {
                    b_nbr: {
                        type: "basDefault",
                        lovtype: "",
                        name: "b_nbr",
                        label: "銀行代號"
                    },
                    b_name: {
                        type: "basDefault",
                        lovtype: "",
                        name: "b_name",
                        label: "銀行名稱"
                    },
                    bal_amt: {
                        type: "basNumber",
                        lovtype: "",
                        name: "bal_amt",
                        label: "餘 額"
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
                        url: "bas/basbank/query?page=" + scope.datapage.page + "&size=" + scope.datapage.size + "&sort=" + scope.datapage.sort,
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
                        name: "銀行資料明細",
                        url: 'nms/mapz1.detail'
                    }
                    $scope.$emit('opencusdetail', node);
                }
            }
            $scope.$on('refreshbasbank', function (event, message) {
                scope.action.load()
            });
            scope.action.load();
        });

});
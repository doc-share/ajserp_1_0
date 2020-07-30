define(function () {
    angular.module('app').controller('nms.mapz2',
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
                gridkey: "mapz2",
                title: "現金資料",
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
                    "io_p": {
                        displayName: "單據類別",
                        width: 120
                    },
                    "nbrdate": {
                        displayName: "日期",
                        width: 120
                    },
                    "amt": {
                        displayName: "金 額",
                        width: 120
                    },
                    "acc_id": {
                        displayName: "會計子目",
                        width: 120
                    },
                    "b_nbr": {
                        displayName: "銀行代號",
                        width: 120
                    },
                    "cus_nbr": {
                        displayName: "往來客戶",
                        width: 120
                    },
                    "ven_nbr": {
                        displayName: "往來廠商",
                        width: 120
                    },
                    "remark": {
                        displayName: "備 註",
                        width: 120
                    },
                    "acr_nbr": {
                        displayName: "帳款單號",
                        width: 120
                    },
                    "status": {
                        displayName: "狀 態",
                        width: 120
                    },
                    "chk_nbr": {
                        displayName: "支票",
                        width: 120
                    },
                    "Sstatus": {
                        displayName: "單據狀態",
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
                    io_p: {
                        type: 'basLov',
                        lovtype: 'select',
                        titleMap:[
                            {value:"1",name:"收入"},
                            {value:"2",name:"支出"}
                        ],
                        name: "io_p",
                        label: "單據類別"
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
                        url: "nms/cashbook/query?page=" + scope.datapage.page + "&size=" + scope.datapage.size + "&sort=" + scope.datapage.sort,
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
                        name: "現金資料明細",
                        url: 'nms/mapz2.detail'
                    }
                    $scope.$emit('opencusdetail', node);
                }
            }
            $scope.$on('refreshcashbook', function (event, message) {
                scope.action.load()
            });
            scope.action.load();
        });

});
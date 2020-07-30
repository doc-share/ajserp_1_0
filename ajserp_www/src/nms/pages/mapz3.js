define(function () {
    angular.module('app').controller('nms.mapz3',
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
                gridkey: "mapz3",
                title: "票據資料",
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
                    "io_p": {
                        displayName: "單據類別",
                        width: 120
                    },
                    "chk_no": {
                        displayName: "支票號碼",
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
                    "amt": {
                        displayName: "支票金額",
                        width: 120
                    },
                    "chk_date": {
                        displayName: "到期日期",
                        width: 120
                    },
                    "status":{
                        displayName: "狀態",
                        width: 120
                    }
                   
                },
                filterItems: {
                    b_nbr: {
                        type: "basLov",
                        lovtype: "get_bank",
                        name: "b_nbr",
                        label: "銀行代號"
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
                    w_date: {
                        type: "basEsydatetime",
                        lovtype: "",
                        name: "w_date",
                        label: "收開日期"
                    },
                    chk_no: {
                        type: "basDefault",
                        lovtype: "",
                        name: "chk_no",
                        label: "支票號碼"
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
                        url: "nms/chkbook/query?page=" + scope.datapage.page + "&size=" + scope.datapage.size + "&sort=" + scope.datapage.sort,
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
                        name: "票據資料明細",
                        url: 'nms/mapz3.detail'
                    }
                    $scope.$emit('opencusdetail', node);
                }
            }
            $scope.$on('refreshchkbook', function (event, message) {
                scope.action.load()
            });
            scope.action.load();
        });

});
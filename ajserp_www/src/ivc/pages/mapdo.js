define(function () {
    angular.module('app').controller('ivc.mapdo',
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
                gridkey: "mapdo",
                title: "銷項發票",
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
                    "ivc_name": {
                        displayName: "抬頭名稱",
                        width: 120
                    },
                    "acr_mon": {
                        displayName: "結帳月份",
                        width: 120
                    },
                    "ivc_pur": {
                        displayName: "發票開立人",
                        width: 120
                    },
                    "cus_gun": {
                        displayName: "統一編號",
                        width: 120
                    },
                    "ivc_nbr": {
                        displayName: "發票號碼",
                        width: 120
                    },
                    "tg_fs": {
                        displayName: "通關方式",
                        width: 120
                    },
                    "remark": {
                        displayName: "備註",
                        width: 120
                    },
                    "up_status": {
                        displayName: "上傳狀態",
                        width: 120
                    },
                    "status": {
                        displayName: "狀態",
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
                    "rec_amt": {
                        displayName: "未稅總額",
                        width: 120
                    },
                    "tot_amt": {
                        displayName: "出貨總額",
                        width: 120
                    }
                },
                filterItems: {
                    io_p: {
                        type: 'basLov',
                        lovtype: 'select',
                        titleMap:[
                            {value:"1",name:"銷項發票"},
                            {value:"2",name:"折讓單"}
                        ],
                        name: "io_p",
                        label: "單據類別"
                    },
                    cus_nbr: {
                        type: "basLov",
                        lovtype: "get_cus",
                        name: "cus_nbr",
                        label: "請款客戶"
                    },
                    nbr: {
                        type: "basDefault",
                        lovtype: "",
                        name: "nbr",
                        label: "單據號碼"
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
                        url: "ivc/oivcbah/query?page=" + scope.datapage.page + "&size=" + scope.datapage.size + "&sort=" + scope.datapage.sort,
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
                        name: "銷項發票明細",
                        url: 'ivc/mapdo.detail'
                    }
                    $scope.$emit('opencusdetail', node);
                }
            }
            $scope.$on('refreshoivcbah', function (event, message) {
                scope.action.load()
            });
            scope.action.load();
        });

});
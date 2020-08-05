define(function () {
    angular.module('app').controller('shp.map4a',
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
                gridkey: "map4a",
                title: "客戶產品調價作業",
                listoperation: {
                    add: {
                        name: "新增",
                        icon: "fa-calendar-check-o",
                        action: function (event, scope) {
                            scope.action.add();
                        }
                    },
                    export: {
                        name: "列印",
                        icon: "fa-share",
                        action: function(event, scope) {
                            scope.action.export();
                        }
                    },
                },
                headers: {
                    "nbr": {
                        displayName: "單據編號",
                        width: 120
                    },
                    "nbrdate": {
                        displayName: "調價日期",
                        width: 120
                    },
                    "chk_type": {
                        displayName: "調整類號",
                        width: 120
                    },
                    "cus_nbr": {
                        displayName: "客戶代號",
                        width: 120
                    },
                    "chk_proc": {
                        displayName: "調整方式",
                        width: 120
                    },
                    "chk_ratio": {
                        displayName: "比率",
                        width: 120
                    },
                    "item_nbrf": {
                        displayName: "產品代號(起)",
                        width: 120
                    },
                    "item_nbrt": {
                        displayName: "產品代號(迄)",
                        width: 120
                    },
                    "remark": {
                        displayName: "備註",
                        width: 120
                    }
                },
                filterItems: {
                    nbr: {
                        type: "basDefault",
                        lovtype: "",
                        name: "nbr",
                        label: "單據編號"
                    },
                    nbrdate: {
                        type: "basEsydatetime",
                        lovtype: "",
                        name: "nbrdate",
                        label: "調價日期"
                    },
                    cus_nbr: {
                        type: "basLov",
                        lovtype: "get_cus",
                        name: "cus_nbr",
                        label: "客戶代號F"
                    },
                    cus_nbrb: {
                        type: "basLov",
                        lovtype: "get_cus",
                        name: "cus_nbrb",
                        label: "客戶代號T"
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
                        url: "ord/cuschkbah/query?page=" + scope.datapage.page + "&size=" + scope.datapage.size + "&sort=" + scope.datapage.sort,
                        mockUrl: "plugins/base/data/orderlines.json",
                        data: scope.filter
                    }).then(function (res) {
                        scope.model = res.data.body;
                    });

                },
                export: function() {
                    var page = {
                        size: 60000,
                        page: 0,
                        sort: scope.datapage.sort
                    }
                    scope.loadmessage = "EXCEL生成中....";
                    scope.promise = qwsys.exportExcel("ord/cuschkbah/export", scope.config.headers, scope.filter, page, "訂單跟催")

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
                        name: "客戶產品調價作業明細",
                        url: 'shp/map4a.detail'
                    }
                    $scope.$emit('opencusdetail', node);
                }
            }
            $scope.$on('refreshcuschkbah', function (event, message) {
                scope.action.load()
            });
            scope.action.load();
        });

});
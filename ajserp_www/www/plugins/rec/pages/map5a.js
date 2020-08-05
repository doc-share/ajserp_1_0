define(function () {
    angular.module('app').controller('rec.map5a',
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
                gridkey: "map5a",
                title: "廠商產品調價作業",
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
                    "ven_nbr": {
                        displayName: "廠商代號",
                        width: 120
                    },
                    "chk_proc": {
                        displayName: "調整方式",
                        width: 120
                    },
                    "chk_ratio": {
                        displayName: "比率 %",
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
                    ven_nbr: {
                        type: "basLov",
                        lovtype: "get_ven",
                        name: "ven_nbr",
                        label: "廠商代號F"
                    },
                    ven_nbrb: {
                        type: "basLov",
                        lovtype: "get_ven",
                        name: "ven_nbrb",
                        label: "廠商代號T"
                    },
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
                        url: "pur/venchkbah/query?page=" + scope.datapage.page + "&size=" + scope.datapage.size + "&sort=" + scope.datapage.sort,
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
                        name: "廠商產品調價作業明細",
                        url: 'rec/map5a.detail'
                    }
                    $scope.$emit('opencusdetail', node);
                }
            }
            $scope.$on('refreshvenchkbah', function (event, message) {
                scope.action.load()
            });
            scope.action.load();
        });

});
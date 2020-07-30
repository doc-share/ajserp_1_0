define(function () {
    angular.module('app').controller('fac.mapfac11',
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
                gridkey: "mapfac11",
                title: "會計介面",
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
                    "itemdesc": {
                        displayName: "說明",
                        width: 120
                    },
                    "acc_id": {
                        displayName: "科目代號",
                        width: 120
                    },
                    "dept_id": {
                        displayName: "會計部門代號",
                        width: 120
                    },
                    "is_tran": {
                        displayName: "是否轉對象",
                        width: 120
                    }
                },
                filterItems: {
                    acc_id: {
                        type: "basDefault",
                        lovtype: "",
                        name: "acc_id",
                        label: "科目代號"
                    },
                    itemdesc: {
                        type: "basDefault",
                        lovtype: "",
                        name: "itemdesc",
                        label: "說明"
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
                        url: "acc/basfac/query?page=" + scope.datapage.page + "&size=" + scope.datapage.size + "&sort=" + scope.datapage.sort,
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
                        name: "會計介面明細",
                        url: 'fac/mapfac11.detail'
                    }
                    $scope.$emit('opencusdetail', node);
                }
            }
            $scope.$on('refreshbasfac', function (event, message) {
                scope.action.load()
            });
            scope.action.load();
        });

});
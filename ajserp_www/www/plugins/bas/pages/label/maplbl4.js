define(function () {
    angular.module('app').controller('bas.maplbl4',
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
                gridkey: "maplbl4",
                title: "產品標籤列印",
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
                    "item_nbr": {
                        displayName: "產品編號",
                        width: 120
                    },
                    "item_name": {
                        displayName: "產品名稱",
                        width: 120
                    },
                    "item_desc": {
                        displayName: "規格說明",
                        width: 120
                    },
                    "bz_desc": {
                        displayName: "包裝說明",
                        width: 120
                    },
                    "l_update": {
                        displayName: "日期",
                        width: 120
                    }
                },
                filterItems: {
                    item_nbr: {
                        type: "basLov",
                        lovtype: "get_itm",
                        name: "item_nbr",
                        label: "產品代號F"
                    },
                    item_nbrb: {
                        type: "basLov",
                        lovtype: "get_itm",
                        name: "item_nbrb",
                        label: "產品代號T"
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
                        url: "bas/invitm/query?page=" + scope.datapage.page + "&size=" + scope.datapage.size + "&sort=" + scope.datapage.sort,
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
                        name: "",
                        url: 'bas/maplbl4.detail'
                    }
                    $scope.$emit('opencusdetail', node);
                }
            }
            $scope.$on('refreshinvitm', function (event, message) {
                scope.action.load()
            });
            scope.action.load();
        });

});
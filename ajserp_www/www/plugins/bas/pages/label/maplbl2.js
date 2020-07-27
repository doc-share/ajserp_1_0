define(function () {
    angular.module('app').controller('bas.maplbl2',
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
                gridkey: "maplbl2",
                title: "廠商標籤列印",
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
                    "ven_nbr": {
                        displayName: "廠商編號",
                        width: 120
                    },
                    "ven_alias": {
                        displayName: "廠商簡稱",
                        width: 120
                    },
                    "ven_addr": {
                        displayName: "公司地址",
                        width: 120
                    }
                },
                filterItems: {
                    shp_desc: {
                        type: "basLov",
                        lovtype: "get_word",
                        name: "shp_desc",
                        label: "業務性質"
                    },
                    vne_nbr: {
                        type: "basLov",
                        lovtype: "get_ven",
                        name: "vne_nbr",
                        label: "廠商代號F"
                    },
                    vne_nbrb: {
                        type: "basLov",
                        lovtype: "get_ven",
                        name: "vne_nbrb",
                        label: "廠商代號T"
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
                        url: "bas/purven/query?page=" + scope.datapage.page + "&size=" + scope.datapage.size + "&sort=" + scope.datapage.sort,
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
                        url: 'bas/maplbl2.detail'
                    }
                    $scope.$emit('opencusdetail', node);
                }
            }
            $scope.$on('refreshpurven', function (event, message) {
                scope.action.load()
            });
            scope.action.load();
        });

});
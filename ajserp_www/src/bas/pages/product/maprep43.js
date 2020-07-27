define(function () {
    angular.module('app').controller('bas.maprep43',
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
                gridkey: "maprep43",
                title: "產品清冊-外銷",
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
                    "eng_name": {
                        displayName: "英文名稱",
                        width: 120
                    },
                    "item_desc": {
                        displayName: "規格說明",
                        width: 120
                    },
                    "in_box": {
                        displayName: "內盒",
                        width: 120
                    },
                    "qty_pbox": {
                        displayName: "外箱內盒數",
                        width: 120
                    },
                    "cuft": {
                        displayName: "才數",
                        width: 120
                    },
                    "n_wight": {
                        displayName: "淨重",
                        width: 120
                    },
                    "g_wight": {
                        displayName: "毛重",
                        width: 120
                    },
                    "remark": {
                        displayName: "備註",
                        width: 120
                    },
                    "shp_desc": {
                        displayName: "業務性質",
                        width: 120
                    }
                },
                filterItems: {
                    m_type: {
                        type: "basLov",
                        lovtype: "get_type",
                        name: "m_type",
                        label: "類別代號F"
                    },
                    m_typeb: {
                        type: "basLov",
                        lovtype: "get_type",
                        name: "m_typeb",
                        label: "類別代號T"
                    },
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
                        url: 'bas/maprep43.detail'
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
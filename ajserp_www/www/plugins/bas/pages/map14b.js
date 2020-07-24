define(function () {
    angular.module('app').controller('bas.map14b',
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
                gridkey: "map14b",
                title: "產品調價作業",
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
                    "i_type": {
                        displayName: "料品來源",
                        width: 120
                    },
                    "newdate": {
                        displayName: "新價實施日",
                        width: 120
                    },
                    "m_type": {
                        displayName: "料品類別",
                        width: 120
                    },
                    "item_type": {
                        displayName: "料品型態",
                        width: 120
                    },
                    "m_type": {
                        displayName: "料品類別",
                        width: 120
                    },
                    "item_name": {
                        displayName: "產品名稱",
                        width: 120
                    },
                    "item_desc": {
                        displayName: "品名規格",
                        width: 120
                    },
                    "item_nbr1": {
                        displayName: "原料代號",
                        width: 120
                    },
                    "bot_price": {
                        displayName: "最低售價",
                        width: 120
                    },
                    "unit_cost": {
                        displayName: "總成本",
                        width: 120
                    },
                    "unit_price": {
                        displayName: "標準售價",
                        width: 120
                    },
                    "price_1": {
                        displayName: "等級 1",
                        width: 120
                    },
                    "price_2": {
                        displayName: "等級 2",
                        width: 120
                    },
                    "price_3": {
                        displayName: "等級 3",
                        width: 120
                    },
                    "price_4": {
                        displayName: "等級 4",
                        width: 120
                    },
                    "price_5": {
                        displayName: "等級 5",
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
                    m_typeb: {   //虛擬欄位
                        type: "basLov",
                        lovtype: "get_type",
                        name: "m_typeb",
                        label: "類別代號T"
                    },
                    item_nbr: {
                        type: "basLov",
                        lovtype: "get_itm",
                        name: "item_nbr",
                        label: "產品編號F"
                    },
                    item_nbrb: {//虛擬欄位
                        type: "basLov",
                        lovtype: "get_itm",
                        name: "item_nbrb",
                        label: "產品編號T"
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
                        name: "產品調價作業明細",
                        url: 'bas/map14b.detail'
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
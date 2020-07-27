define(function () {
    angular.module('app').controller('bas.maprep44',
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
                gridkey: "maprep44",
                title: "產品清冊-成本",
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
                    "item_un": {
                        displayName: "庫存單位",
                        width: 120
                    },
                    "matl_cost": {
                        displayName: "原料成本",
                        width: 120
                    },
                    "labor_cost": {
                        displayName: "製程成本",
                        width: 120
                    },
                    "other_cost": {
                        displayName: "其他成本",
                        width: 120
                    },
                    "unit_cost": {
                        displayName: "總成本",
                        width: 120
                    },
                    "bar_code": {
                        displayName: "條碼編號",
                        width: 120
                    },
                    "pri_type": {
                        displayName: "售價依據",
                        width: 120
                    },
                    "unit_price": {
                        displayName: "標準售價",
                        width: 120
                    },
                    "bot_price": {
                        displayName: "最低售價",
                        width: 120
                    },
                    "newdate": {
                        displayName: "新價實施日",
                        width: 120
                    },
                    "price_1": {
                        displayName: "等級售價 1",
                        width: 120
                    },
                    "price_2": {
                        displayName: "等級售價 2",
                        width: 120
                    },
                    "price_3": {
                        displayName: "等級售價 3",
                        width: 120
                    },
                    "price_4": {
                        displayName: "等級售價 4",
                        width: 120
                    },
                    "price_5": {
                        displayName: "等級售價 5",
                        width: 120
                    },
                    "oh_qty": {
                        displayName: "庫存量",
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
                        url: 'bas/maprep44.detail'
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
define(function () {
    angular.module('app').controller('bas.maprep4',
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
                gridkey: "maprep4",
                title: "產品清冊-業務",
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
                    "q_code": {
                        displayName: "查詢碼",
                        width: 120
                    },
                    "m_type": {
                        displayName: "類別代號",
                        width: 120
                    },
                    "itemdesc": {
                        displayName: "類別名稱",
                        width: 120
                    },
                    "bar_code": {
                        displayName: "條碼編號",
                        width: 120
                    },
                    "bar_code2": {
                        displayName: "自編碼",
                        width: 120
                    },
                    "sales_un": {
                        displayName: "銷售單位",
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
                    "price_1": {
                        displayName: "1等級售價",
                        width: 120
                    },
                    "price_2": {
                        displayName: "2等級售價",
                        width: 120
                    },
                    "price_3": {
                        displayName: "3等級售價",
                        width: 120
                    },
                    "price_4": {
                        displayName: "4等級售價",
                        width: 120
                    },
                    "price_5": {
                        displayName: "5等級售價",
                        width: 120
                    },
                    "i_type": {
                        displayName: "料品來源",
                        width: 120
                    },
                    "newdate": {
                        displayName: "新價實施日",
                        width: 120
                    },
                    "remark": {
                        displayName: "備註",
                        width: 120
                    },
                    "shp_desc": {
                        displayName: "業務性質",
                        width: 120
                    },
                    "status": {
                        displayName: "狀態",
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
                        label: "產品編號F"
                    },
                    item_nbrb: {
                        type: "basLov",
                        lovtype: "get_itm",
                        name: "item_nbrb",
                        label: "產品編號T"
                    },
                    l_recdate: {
                        type: "basEsydatetime",
                        lovtype: "",
                        name: "l_recdate",
                        label: "最近進貨日F"
                    },
                    l_recdateb: {
                        type: "basEsydatetime",
                        lovtype: "",
                        name: "l_recdateb",
                        label: "最近進貨日T"
                    },
                    shp_desc: {
                        type: "basLov",
                        lovtype: "get_word",
                        name: "shp_desc",
                        label: "業務性質"
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
                        url: 'bas/maprep4.detail'
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
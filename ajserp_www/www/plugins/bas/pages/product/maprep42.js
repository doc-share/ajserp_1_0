define(function () {
    angular.module('app').controller('bas.maprep42',
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
                gridkey: "maprep42",
                title: "產品清冊-庫存",
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
                    "safety_qty": {
                        displayName: "安全存量",
                        width: 120
                    },
                    "ud_oh_ctl": {
                        displayName: "異動庫存",
                        width: 120
                    },
                    "l_update": {
                        displayName: "最近異動",
                        width: 120
                    },
                    "l_shpdate": {
                        displayName: "最後交易日",
                        width: 120
                    },
                    "item_nbr1": {
                        displayName: "原料代號",
                        width: 120
                    },
                    "pro_nbr": {
                        displayName: "原料製程",
                        width: 120
                    },
                    "mat_un": {
                        displayName: "原料耗用單位",
                        width: 120
                    },
                    "mat_qty": {
                        displayName: "原料耗用量",
                        width: 120
                    },
                    "cyc_time": {
                        displayName: "總加工時間",
                        width: 120
                    },
                    "oh_qty": {
                        displayName: "庫存量",
                        width: 120
                    },
                    "remark": {
                        displayName: "備註",
                        width: 120
                    },
                    "sys_type": {
                        displayName: "料號共用種類",
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
                    item_nbr1: {
                        type: "basLov",
                        lovtype: "get_itm",
                        name: "item_nbr1",
                        label: "料品代號F"
                    },
                    item_nbr1b: {
                        type: "basLov",
                        lovtype: "get_itm",
                        name: "item_nbr1b",
                        label: "料品代號T"
                    },
                    ware_nbr: {
                        type: "basLov",
                        lovtype: "get_war",
                        name: "ware_nbr",
                        label: "倉庫代號F"
                    },
                    ware_nbrb: {
                        type: "basLov",
                        lovtype: "get_war",
                        name: "ware_nbrb",
                        label: "倉庫代號T"
                    },
                    l_mjdate: {
                        type: "basEsydatetime",
                        lovtype: "",
                        name: "l_mjdate",
                        label: " 最近出貨日F"
                    },
                    l_mjdateb: {
                        type: "basEsydatetime",
                        lovtype: "",
                        name: "l_mjdateb",
                        label: " 最近出貨日T"
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
                        url: 'bas/maprep42.detail'
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
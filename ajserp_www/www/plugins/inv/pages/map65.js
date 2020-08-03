define(function() {
    angular.module('app').controller('inv.map65',
        function($rootScope, $scope, $location, uiGridConstants, utils, path, settings,
            $timeout, dialog, toastr, ngDialog, qwsys, $http) {
            var scope = $scope;
            scope.filter = {
                // war_type: "2",
                // un_type: "1",
                // qty_type: "1"
            };
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
                gridkey: "invbal",
                title: "庫存狀況表",
                // listoperation: {
                //     add: {
                //         name: "新增",
                //         icon: "fa-calendar-check-o",
                //         action: function(event, scope) {
                //             scope.action.add();
                //         }
                //     }
                // },
                headers: {
                    "item_nbr": {
                        displayName: "產品代號",
                        width: 120
                    },
                    "item_name": {
                        displayName: "產品名稱 ",
                        width: 120
                    },
                    "item_desc":{
                        displayName: "規格說明",
                        width: 120
                    }, 
                    "pro_nbr": {
                        displayName: "製程代號",
                        width: 60
                    },
                    "pro_desc": {
                        displayName: "製程名稱",
                        width: 80
                    },
                    "unit": {
                        displayName: "單位",
                        width: 60
                    },
                    "un_desc": {
                        displayName: "單位名稱",
                        width: 80
                    },
                    "ware_nbr": {
                        displayName: "倉庫代號",
                        hidestatus: {
                            relation: "and",
                            filedlist: [
                                { field: "war_type", status: "1" }, //表單新增狀態
                            ]
                        },
                        width: 120
                    },
                    "ware_desc": {
                        displayName: "倉庫名稱",
                        hidestatus: {
                            relation: "and",
                            filedlist: [
                                { field: "war_type", status: "1" }, //表單新增狀態
                            ]
                        },
                        width: 120
                    },
                    "oh_qty": {
                        type: "number",
                        displayName: "庫存數量",
                        ondblclick: function(entity) {
                            $rootScope.invtra = {
                                ware_nbr: entity.ware_nbr,
                                item_nbr: entity.item_nbr,
                                pro_nbr: entity.pro_nbr,
                                unit: entity.unit,
                                filterfields: "pro_nbr"
                            }
                            scope.action.opendetail();
                        },
                        width: 60
                    },
                    "last_date": {
                        displayName: "最近交易日",
                        width: 120,
                        type:"basEsydatetime"
                    },

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
                        label: "產品代號T",
                        
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
                    war_type: {
                        type: "basRadiosinline",
                        css: "cell2",
                        titleMap: [
                            { value: "1", name: "1. 不同倉庫數量合併" },
                            { value: "2", name: "2. 不同倉庫數量分開" }
                        ],
                        onchange: function(item) {
                            if (scope.filter.war_type == "1") {
                                scope.filter.ware_nbr = "";
                            }

                        },
                        name: "war_type",
                        label: "合併方式:"
                    },
                    qty_type: {
                        type: "basRadiosinline",
                        css: "cell2",
                        titleMap: [
                            { value: "1", name: "1. 庫存為零要列印" },
                            { value: "2", name: "2. 庫存為零不列印" }
                        ],
                        name: "qty_type",
                        label: "零庫存:"
                    },
                    un_type: {
                        type: "basRadiosinline",
                        css: "cell2",
                        titleMap: [
                            { value: "1", name: "1. 收料單位" },
                            { value: "2", name: "2. 庫存單位" },
                            { value: "3", name: "3. 銷售單位" },
                            { value: "4", name: "4. 全部" }
                        ],
                        name: "un_type",
                        label: "顯示單位:"
                    }

                }
            }

            scope.action = {
                add: function() {
                    $rootScope.uid = "";
                    scope.action.opendetail();
                },

                load: function() {

                    scope.promise = utils.ajax({
                        method: 'POST',
                        url: "inv/invbal/query?page=" + scope.datapage.page + "&size=" + scope.datapage.size + "&sort=" + scope.datapage.sort,
                        mockUrl: "plugins/base/data/orderlines.json",
                        data: scope.filter
                    }).then(function(res) {
                        scope.model = res.data.body;
                    });

                },
                reset: function() {
                    scope.filter = {
                        war_type: "2",
                        un_type: "1",
                        qty_type: "1"
                    };

                },
                changepage: function(page, size, sort) {
                    scope.datapage.page = page;
                    scope.datapage.size = size;
                    scope.datapage.sort = sort;
                    scope.action.load();
                },
                // rowclick: function(entity) {
                //     $rootScope.invtra = {
                //         ware_nbr: entity.ware_nbr,
                //         item_nbr: entity.item_nbr,
                //         pro_nbr: entity.pro_nbr,
                //         unit: entity.unit,
                //         filterfields: "pro_nbr"
                //     }
                //     scope.action.opendetail();
                // },
                opendetail: function() {
                    var node = {
                        name: "庫存交易明細表",
                        url: 'inv/invtra'
                    }
                    $scope.$emit('opencusdetail', node);
                }
            }
            $scope.$on('refreshinvbal', function(event, message) {
                scope.action.load()
            });
            scope.action.load();
        });

});
define(function() {
    angular.module('app').controller('bas.map14',
        function($rootScope, $scope, $location, uiGridConstants, utils, path, settings,
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
                title: "產品維護",
                listoperation: {
                    add: {
                        name: "新增",
                        icon: "fa-calendar-check-o",
                        action: function(event, scope) {
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
                    "item_alias": {
                        displayName: "產品簡稱",
                        width: 120
                    },
                    "safety_qty": {
                        displayName: "安全存量",
                        width: 120
                    },
                    "l_shpdate": {
                        displayName: "最後交易日",
                        width: 120
                    },
                    "other_cost": {
                        displayName: "其他成本",
                        width: 120
                    },
                    "stock_desc": {
                        displayName: "儲位",
                        width: 120
                    },
                    "item_desc": {
                        displayName: "產品描述",
                        width: 120
                    },
                    "pro_nbr": {
                        displayName: "原料制程",
                        width: 120
                    },
                    "ven_nbr": {
                        displayName: "採購廠商",
                        width: 120
                    },
                    "remark": {
                        displayName: "備註",
                        width: 120
                    },
                    "l_crtdate": {
                        displayName: "最近建立日",
                        width: 120
                    },
                    "bar_code": {
                        displayName: "條碼編號",
                        width: 120
                    },
                    "l_update": {
                        displayName: "最近異動日期",
                        width: 120
                    },
                    "ware_nbr": {
                        displayName: "儲存倉庫",
                        width: 120
                    },
                    "q_code": {
                        displayName: "查詢碼",
                        width: 120
                    },
                    "l_recdate": {
                        displayName: "最後進貨日",
                        width: 120
                    },
                    "last_price": {
                        displayName: "最近進價",
                        width: 120
                    },
                    "item_nbr1": {
                        displayName: "原料代號",
                        width: 120
                    },
                    "oh_qty": {
                        displayName: "庫存量",
                        width: 120
                    },
                    "i_type": {
                        displayName: "料品來源",
                        width: 120
                    },
                    "big_key": {
                        displayName: "譯音碼",
                        width: 120
                    }
                },
                filterItems: {
                    item_nbr: {
                        type: "basDefault",
                        lovtype: "",
                        name: "item_nbr",
                        label: "產品編號"
                    },
                    item_name: {
                        type: "input",
                        lovtype: "",
                        name: "item_name",
                        label: "產品名稱"
                    }
                    
                },
                filtermoreItems: {
                    item_alias: {
                        type: "input",
                        lovtype: "",
                        name: "item_alias",
                        label: "產品簡稱"
                    },
                    item_desc: {
                        type: "input",
                        lovtype: "",
                        name: "item_desc",
                        label: "產品描述"
                    },
                    ud_oh_ctl: {
                        name: "ud_oh_ctl",
                        titleMap: [
                            { value: "Y", name: "是" },
                            { value: "N", name: "否" }

                        ],
                        type: 'basLov',
                        lovtype: "select",
                        label: "異動庫存"
                    },
                    item_type: {
                        type: "basLov",
                        lovtype: "getmtype",
                        name: "item_type",
                        label: "料品型態"
                    },
                    stock_desc: {
                        type: "basDefault",
                        lovtype: "",
                        name: "stock_desc",
                        label: "儲位"
                    },
                    ware_nbr: {
                        type: "basLov",
                        lovtype: "getwar",
                        name: "ware_nbr",
                        label: "儲存倉庫"
                    },
                    last_ven: {
                        type: "basLov",
                        lovtype: "getven",
                        name: "last_ven",
                        label: "采購廠商"
                    },
                    l_crtdate: {
                        type: "basEsydatetime",
                        lovtype: "",
                        name: "l_crtdate",
                        label: "最近建立日"
                    },
                    l_shpdate: {
                        type: "basEsydatetime",
                        lovtype: "",
                        name: "l_shpdate",
                        label: "最後交易日"
                    },
                    l_edtdate: {
                        type: "basEsydatetime",
                        lovtype: "",
                        name: "l_edtdate",
                        label: "最近修改日"
                    },
                    ven_nbr: {
                        type: "basLov",
                        lovtype: "getven",
                        name: "ven_nbr",
                        label: "採購廠商"
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
                        url: "bas/invitm/query?page=" + scope.datapage.page + "&size=" + scope.datapage.size + "&sort= " + scope.datapage.sort,
                        mockUrl: "plugins/base/data/orderlines.json",
                        data: scope.filter
                    }).then(function(res) {
                        scope.model = res.data.body;
                    });

                },
                reset: function() {
                    scope.filter = {

                    };

                },
                changepage: function(page, size, sort) {
                    scope.datapage.page = page;
                    scope.datapage.size = size;
                    scope.datapage.sort = sort;
                    scope.action.load();
                },
                rowclick: function(entity) {
                    $rootScope.uid = entity.uid;
                    scope.action.opendetail();
                },
                opendetail: function() {
                    var node = {
                        name: "產品資料明細",
                        url: 'bas/map14.detail'
                    }
                    $scope.$emit('opencusdetail', node);
                }
            }
            $scope.$on('refreshinvitm', function(event, message) {
                scope.action.load()
            });
            scope.action.load();
        });

});
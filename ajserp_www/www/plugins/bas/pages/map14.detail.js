define(function() {
    angular.module('app').controller('bas.map14.detail',
        function($rootScope, $scope, $location, utils, path, getSingleView, settings,
            $timeout, dialog, toastr, ngDialog, uiGridConstants, qwsys) {
            var scope = $scope;
            scope.uid = "";
            if ($rootScope.uid) {
                scope.uid = $rootScope.uid;
                $rootScope.uid = "";
            };
            scope.model = {
                formstatus: "add" //edit,view
            };
            scope.promise = null;
            scope.detailUrl = "plugins/bas/templates/detail.html";
            scope.config = {
                listoperation: {
                    add: {
                        name: "新增",
                        icon: "fa-plus",
                        readonlystatus: {
                            relation: "and",
                            filedlist: [
                                { field: "formstatus", status: "add,edit,read" } //表單新增狀態
                            ]
                        },
                        action: function(event, form) {
                            scope.action.add(event);
                        }
                    },
                    save: {
                        name: "保存",
                        icon: "fa-save",
                        editstatus: {
                            relation: "and",
                            filedlist: [
                                { field: "formstatus", status: "add,edit" }, //表單為新增，修改狀態
                            ]
                        },
                        action: function(event, form) {
                            scope.action.save(event, form);
                        }
                    },
                    undo: {
                        name: "取消",
                        icon: "fa-undo",
                        editstatus: {
                            relation: "and",
                            filedlist: [
                                { field: "formstatus", status: "add,edit" }, //表單為新增，修改狀態
                            ]
                        },
                        action: function(event, form) {
                            scope.action.undo(event);
                        }
                    },
                    edit: {
                        name: "修改",
                        icon: "fa-edit",
                        editstatus: {
                            relation: "and",
                            filedlist: [
                                { field: "formstatus", status: "view" } //查詢狀態                              
                            ]
                        },
                        action: function(event, form) {
                            scope.action.edit(event);
                        }
                    },
                    del: { //分配狀態下還可以刪除
                        name: "刪除",
                        icon: "fa-remove",
                        htmlClass: "deletestyle",
                        editstatus: {
                            relation: "and",
                            filedlist: [
                                { field: "formstatus", status: "view" } //表單查詢狀態                             
                            ]
                        },
                        action: function(event, form) {
                            scope.action.del(event);
                        }
                    },
                    refresh: {
                        name: "刷新",
                        icon: "fa-refresh",
                        htmlClass: "refresh",
                        editstatus: {
                            relation: "and",
                            filedlist: [
                                { field: "formstatus", status: "view" }, //表單為新增，修改狀態
                            ]
                        },
                        action: function(event, form) {
                            scope.action.load();
                        }
                    }
                },
                form: {
                    schema: {
                        "type": "object",
                        "properties": {
                            "item_nbr": {
                                "title": "產品編號",
                                "type": "string"
                            },
                            "big_key": {
                                "title": "譯音碼",
                                "type": "string"
                            },
                            "q_code": {
                                "title": "查詢碼",
                                "type": "string"
                            },
                            "item_desc": {
                                "title": "產品描述",
                                "type": "string"
                            },
                            "item_name": {
                                "title": "產品名稱",
                                "type": "string"
                            },
                            "item_alias": {
                                "title": "產品簡稱",
                                "type": "string"
                            },
                            "eng_name": {
                                "title": "英文說明",
                                "type": "string"
                            },
                            "rec_un": {
                                "title": "進貨單位",
                                "type": "string"
                            },
                            "item_un": {
                                "title": "庫存單位",
                                "type": "string"
                            },
                            "sales_un": {
                                "title": "銷售單位",
                                "type": "string"
                            },
                            "ud_oh_ctl": {
                                "title": "異動庫存",
                                "type": "string"
                            },
                            "safety_qty": {
                                "title": "安全存量",
                                "type": "number"
                            },
                            "ware_nbr": {
                                "title": "儲存倉庫",
                                "type": "string"
                            },
                            "item_type": {
                                "title": "料品型態",
                                "type": "string"
                            },
                            "m_type": {
                                "title": "料品類別",
                                "type": "string"
                            },
                            "i_type": {
                                "title": "料品來源",
                                "type": "string"
                            },
                            "a_in_qty": {
                                "title": "采購單位量",
                                "type": "number"
                            },
                            "ven_nbr": {
                                "title": "采購廠商",
                                "type": "string"
                            },
                            "item_nbr1": {
                                "title": "原料代號",
                                "type": "string"
                            },
                            "pro_nbr": {
                                "title": "原料制程",
                                "type": "string"
                            },
                            "mat_qty": {
                                "title": "原料耗用量",
                                "type": "number"
                            },
                            "mat_un": {
                                "title": "原料耗用單位",
                                "type": "string"
                            },
                            "unit_price": {
                                "title": "標準售價",
                                "type": "number"
                            },
                            "bot_price": {
                                "title": "最低售價",
                                "type": "number"
                            },
                            "pri_type": {
                                "title": "售價方式",
                                "type": "string"
                            },
                            "price_1": {
                                "title": "1級客戶售價",
                                "type": "number"
                            },
                            "price_2": {
                                "title": "2級客戶售價",
                                "type": "number"
                            },
                            "price_3": {
                                "title": "3級客戶售價",
                                "type": "number"
                            },
                            "price_4": {
                                "title": "4級客戶售價",
                                "type": "number"
                            },
                            "price_5": {
                                "title": "5級客戶售價",
                                "type": "number"
                            },
                            "unit_cost": {
                                "title": "總成本",
                                "type": "number"
                            },
                            "matl_cost": {
                                "title": "原料成本",
                                "type": "number"
                            },
                            "labor_cost": {
                                "title": "制造成本",
                                "type": "number"
                            },
                            "other_cost": {
                                "title": "其他成本",
                                "type": "number"
                            },
                            "in_box": {
                                "title": "內盒",
                                "type": "number"
                            },
                            "qty_pbox": {
                                "title": "外箱",
                                "type": "number"
                            },
                            "cuft": {
                                "title": "才數",
                                "type": "number"
                            },
                            "n_wight": {
                                "title": "凈重",
                                "type": "number"
                            },
                            "g_wight": {
                                "title": "毛重",
                                "type": "number"
                            },
                            "remark": {
                                "title": "備注",
                                "type": "string"
                            },
                            "oh_qty": {
                                "title": "庫存量",
                                "type": "number"
                            },
                            "pur_qty": {
                                "title": "已定未進量",
                                "type": "number"
                            },
                            "ord_qty": {
                                "title": "已接單未出貨量",
                                "type": "number"
                            },
                            "sub_qty": {
                                "title": "已委外未收回量",
                                "type": "number"
                            },
                            "newdate": {
                                "title": "新價實施日",
                                "type": "string"
                            },
                            "l_shpdate": {
                                "title": "最後交易日",
                                "type": "string"
                            },
                            "l_update": {
                                "title": "最近異動日期",
                                "type": "string"
                            },
                            "image": {
                                "title": "圖檔",
                                "type": "String"
                            },
                            "status": {
                                "title": "狀態",
                                "type": "number"
                            },
                            "shp_desc": {
                                "title": "業務性質",
                                "type": "string"
                            },
                            "isedit": {
                                "title": "選取",
                                "type": "boolean"
                            },
                            "p_weight": {
                                "title": "產品單重",
                                "type": "string"
                            },
                            "cyc_time": {
                                "title": "加工總數",
                                "type": "number"
                            },
                            "item_ctl": {
                                "title": "種類",
                                "type": "string"
                            },
                            "cadfile": {
                                "title": "CAD文件",
                                "type": "string"
                            },
                            "l_edtdate": {
                                "title": "最近修改日",
                                "type": "string"
                            },
                            "l_crtdate": {
                                "title": "最近建立日",
                                "type": "string"
                            },
                            "sys_type": {
                                "title": "料號共用種類",
                                "type": "string"
                            },
                            "stock_desc": {
                                "title": "儲位",
                                "type": "string"
                            },
                            "bar_code": {
                                "title": "條碼編號",
                                "type": "string"
                            },
                            "bar_code2": {
                                "title": "自編碼",
                                "type": "string"
                            },
                            "l_recdate": {
                                "title": "最後交易日",
                                "type": "string"
                            },
                            "last_price": {
                                "title": "最近進價",
                                "type": "number"
                            },
                            "last_ven": {
                                "title": "采購廠商",
                                "type": "string"
                            },
                            "itmdm": {
                                type: 'basDefault',
                                title: "產品DM"
                            }
                        }
                    },
                    form: [{
                            title: "基本信息",
                            type: "region",
                            css: "max-4",
                            items: [{
                                    title: "產品編號",
                                    placeholder: "編號自動產生",
                                    readonly:true,
                                    key: 'item_nbr',
                                    type: 'basString'
                                },
                                {
                                    title: "產品簡稱",
                                    editstatus: {
                                        relation: "and",
                                        filedlist: [
                                            { field: "formstatus", status: "add,edit" } //表單為新增，修改狀態
                                        ]
                                    },
                                    key: 'item_alias',
                                    type: 'basDefault'
                                },
                                {
                                    title: "產品名稱",
                                    editstatus: {
                                        relation: "and",
                                        filedlist: [
                                            { field: "formstatus", status: "add,edit" } //表單為新增，修改狀態
                                        ]
                                    },
                                    key: 'item_name',
                                    type: 'basDefault'
                                },
                                {
                                    title: "譯音碼",
                                    editstatus: {
                                        relation: "and",
                                        filedlist: [
                                            { field: "formstatus", status: "add,edit" } //表單為新增，修改狀態
                                        ]
                                    },
                                    key: 'big_key',
                                    type: 'basDefault'
                                },
                                {
                                    title: "英文名稱",
                                    editstatus: {
                                        relation: "and",
                                        filedlist: [
                                            { field: "formstatus", status: "add,edit" } //表單為新增，修改狀態
                                        ]
                                    },
                                    key: 'eng_name',
                                    type: 'basDefault'
                                },
                                {
                                    title: "查詢碼",
                                    editstatus: {
                                        relation: "and",
                                        filedlist: [
                                            { field: "formstatus", status: "add,edit" } //表單為新增，修改狀態
                                        ]
                                    },
                                    key: 'q_code',
                                    type: 'basDefault'
                                },
                                {
                                    title: "規格說明",
                                    editstatus: {
                                        relation: "and",
                                        filedlist: [
                                            { field: "formstatus", status: "add,edit" } //表單為新增，修改狀態
                                        ]
                                    },
                                    key: 'item_desc',
                                    css:"cell2",
                                    type: 'basTextarea'
                                },
                                {
                                    title: "進貨單位",
                                    editstatus: {
                                        relation: "and",
                                        filedlist: [
                                            { field: "formstatus", status: "add,edit" } //表單為新增，修改狀態
                                        ]
                                    },
                                    key: 'rec_un',
                                    relationfield: [{findfield: "un_desc",tofield: "un_desc"}],
                                    additionalField: {
                                        key: "un_desc",
                                        readonly: true,
                                        type: "basString"
                                    },
                                    type: "basLov",
                                    lovtype: 'get_un',
                                },
                                {
                                    title: "售價依據",
                                    editstatus: {
                                        relation: "and",
                                        filedlist: [
                                            { field: "formstatus", status: "add,edit" } //表單為新增，修改狀態
                                        ]
                                    },
                                    key: 'pri_type',
                                    type: "basLov",
                                    lovtype: 'select',
                                    titleMap: [
                                        { value: "1", name: "1  料品(實價)" },
                                        { value: "2", name: "2  類別(折數)"}
                                    ],
                                },
                                {
                                    title: "銷售單位",
                                    editstatus: {
                                        relation: "and",
                                        filedlist: [
                                            { field: "formstatus", status: "add,edit" } //表單為新增，修改狀態
                                        ]
                                    },
                                    key: 'sales_un',
                                    relationfield: [{
                                        findfield: "un_desc",
                                        tofield: "un_desc1"      //un_desc1虛擬欄位  避免互相影響
                                    }],
                                    additionalField: {
                                        key: "un_desc1",
                                        readonly: true,
                                        type: "basString"
                                    },
                                    type: "basLov",
                                    lovtype: 'get_un',
                                },
                                {
                                    title: "料品來源",
                                    editstatus: {
                                        relation: "and",
                                        filedlist: [
                                            { field: "formstatus", status: "add,edit" } //表單為新增，修改狀態
                                        ]
                                    },
                                    key: 'i_type',
                                    type: "basLov",
                                    lovtype: 'select',
                                    titleMap: [
                                        { value: "1", name: "1  成品(組合件)" },
                                        { value: "2", name: "2  原料(零件)"}
                                    ],
                                },
                                {
                                    title: "標準售價",
                                    editstatus: {
                                        relation: "and",
                                        filedlist: [
                                            { field: "formstatus", status: "add,edit" } //表單為新增，修改狀態
                                        ]
                                    },
                                    key: 'unit_price',
                                    type: 'basNumber'
                                },
                                {
                                    title: "新價實施日",
                                    key: 'newdate',
                                    editstatus: {
                                        relation: "and",
                                        filedlist: [
                                            { field: "formstatus", status: "add,edit" } //表單為新增，修改狀態
                                        ]
                                    },
                                    type: 'basEsydatetime'
                                },
                                {
                                    title: "最低售價",
                                    key: 'bot_price',
                                    editstatus: {
                                        relation: "and",
                                        filedlist: [
                                            { field: "formstatus", status: "add,edit" } //表單為新增，修改狀態
                                        ]
                                    },
                                    type: 'basNumber'
                                },
                                {
                                    title: "料品類別",
                                    editstatus: {
                                        relation: "and",
                                        filedlist: [
                                            { field: "formstatus", status: "add,edit" } //表單為新增，修改狀態
                                        ]
                                    },
                                    key: 'm_type',
                                    relationfield: [{
                                        findfield: "type_desc",
                                        tofield: "type_desc"
                                    }],
                                    additionalField: {
                                        key: "type_desc",
                                        readonly: true,
                                        type: "basString"
                                    },
                                    type: "basLov",
                                    lovtype: 'get_type',
                                }
                            ]
                        },
                        {
                            type: "basTabs",
                            css: "max-4",
                            tabs: [{
                                    title: "一般",
                                    items: [
                                        {
                                            title: "條碼編號",
                                            key: 'bar_code',
                                            editstatus: {
                                                relation: "and",
                                                filedlist: [
                                                    { field: "formstatus", status: "add,edit" } //表單為新增，修改狀態
                                                ]
                                            },
                                            type: 'basString'
                                        },
                                        {
                                            title: "自編碼",
                                            key: 'bar_code2',
                                            editstatus: {
                                                relation: "and",
                                                filedlist: [
                                                    { field: "formstatus", status: "add,edit" } //表單為新增，修改狀態
                                                ]
                                            },
                                            type: 'basString'
                                        },
                                        {
                                            title: "備註",
                                            key: 'remark',
                                            editstatus: {
                                                relation: "and",
                                                filedlist: [
                                                    { field: "formstatus", status: "add,edit" } //表單為新增，修改狀態
                                                ]
                                            },
                                            css:"cell2",
                                            type: 'basLov',
                                            lovtype:"get_rem"
                                        },
                                        {
                                            title: "最後出貨日",
                                            key: 'l_shpdate',
                                            editstatus: {
                                                relation: "and",
                                                filedlist: [
                                                    { field: "formstatus", status: "add,edit" } //表單為新增，修改狀態
                                                ]
                                            },
                                            type: 'basEsydatetime'
                                        },
                                        {
                                            title: "最近異動日期",
                                            key: 'updated',
                                            readonly: true,
                                            type: 'basEsydatetime'
                                        },
                                        {
                                            title: "狀態",
                                            key: 'status',
                                            editstatus: {
                                                relation: "and",
                                                filedlist: [
                                                    { field: "formstatus", status: "add,edit" } //表單為新增，修改狀態
                                                ]
                                            },
                                            css: "cell2",
                                            titleMap: [
                                                { value: 1, name: "正常供貨" },
                                                { value: 2, name: "缺貨中" },
                                                { value: 3, name: "即將停產" },
                                                { value: 4, name: "停產" }
                                            ],
                                            type: 'basRadiosinline'
                                        },
                                        {
                                            title: "業務性質",
                                            editstatus: {
                                                relation: "and",
                                                filedlist: [{
                                                        field: "formstatus",
                                                        status: "add,edit"
                                                    } //表單為新增，修改狀態
                                                ]
                                            },
                                            key: 'shp_desc',
                                            type: 'basLov',
                                            lovtype: "get_word"
                                        },
                                        {
                                            title: "建檔日期",
                                            key: 'created',
                                            readonly: true,
                                            type: 'basEsydatetime'
                                        },
                                        {
                                            title: "產品週轉率",
                                            key: 'zz_per',
                                            editstatus: {
                                                relation: "and",
                                                filedlist: [
                                                    { field: "formstatus", status: "add,edit" } //表單為新增，修改狀態
                                                ]
                                            },
                                            type: 'basNumber'
                                        },
                                        {
                                            title: "發票品",
                                            key: 'isivc_itm',
                                            editstatus: {
                                                relation: "and",
                                                filedlist: [
                                                    { field: "formstatus", status: "add,edit" } //表單為新增，修改狀態
                                                ]
                                            },
                                            type: 'basCheckbox'
                                        },
                                    ]
                                },
                                {
                                    title: "製程",
                                    items: [
                                        {
                                            title: "原料代號",
                                            key: 'item_nbr1',
                                            editstatus: {
                                                relation: "and",
                                                filedlist: [
                                                    { field: "formstatus", status: "add,edit" } //表單為新增，修改狀態
                                                ]
                                            },
                                            relationfield: [
                                                { findfield: "item_desc", tofield: "item_desc" },
                                            ],
                                            additionalField: {
                                                key: "item_desc", 
                                                type: "string",
                                                readonly: true,
                                            },
                                            type: 'basLov',
                                            lovtype: "get_itm"
                                        },
                                        {
                                            title: "耗用單位",
                                            editstatus: {
                                                relation: "and",
                                                filedlist: [
                                                    { field: "formstatus", status: "add,edit" } //表單為新增，修改狀態
                                                ]
                                            },
                                            key: 'mat_un',
                                            relationfield: [{
                                                findfield: "un_desc",
                                                tofield: "un_desc2"    //un_desc2虛擬欄位  避免互相影響
                                            }],
                                            additionalField: {
                                                key: "un_desc2",
                                                readonly: true,
                                                type: "basString"
                                            },
                                            type: "basLov",
                                            lovtype: 'get_un',
                                        },
                                        {
                                            title: "製程代號",
                                            key: 'pro_nbr',
                                            editstatus: {
                                                relation: "and",
                                                filedlist: [
                                                    { field: "formstatus", status: "add,edit" } //表單為新增，修改狀態
                                                ]
                                            },
                                            type: 'basLov',
                                            lovtype: "get_pro",
                                            relationfield: [{
                                                findfield: "pro_desc",
                                                tofield: "pro_desc"
                                            }],
                                            additionalField: {
                                                key: "pro_desc",
                                                readonly: true,
                                                type: "basString"
                                            }
                                        },
                                        {
                                            title: "耗用數量",
                                            editstatus: {
                                                relation: "and",
                                                filedlist: [
                                                    { field: "formstatus", status: "add,edit" } //表單為新增，修改狀態
                                                ]
                                            },
                                            key: 'mat_qty',
                                            type: 'basNumber'
                                        },
                                        {
                                            title: "總加工天數",
                                            editstatus: {
                                                relation: "and",
                                                filedlist: [
                                                    { field: "formstatus", status: "add,edit" } //表單為新增，修改狀態
                                                ]
                                            },
                                            key: 'cyc_time',
                                            type: 'basNumber'
                                        },
                                        {
                                            title: "模具編號",
                                            editstatus: {
                                                relation: "and",
                                                filedlist: [
                                                    { field: "formstatus", status: "add,edit" } //表單為新增，修改狀態
                                                ]
                                            },
                                            key: 'mj_nbr',
                                            type: 'basLov',
                                            lovtype: "get_mj",
                                            relationfield: [{
                                                findfield: "mj_name",
                                                tofield: "mj_name"
                                            }],
                                            additionalField: {
                                                key: "mj_name",
                                                readonly: true,
                                                type: "basString"
                                            }
                                        },
                                        {
                                            title: "原料成本",
                                            editstatus: {
                                                relation: "and",
                                                filedlist: [
                                                    { field: "formstatus", status: "add,edit" } //表單為新增，修改狀態
                                                ]
                                            },
                                            key: 'matl_cost',
                                            type: 'basNumber'
                                        },
                                        {
                                            title: "製程成本",
                                            editstatus: {
                                                relation: "and",
                                                filedlist: [
                                                    { field: "formstatus", status: "add,edit" } //表單為新增，修改狀態
                                                ]
                                            },
                                            key: 'labor_cost',
                                            type: 'basNumber'
                                        },
                                        {
                                            title: "其他成本",
                                            editstatus: {
                                                relation: "and",
                                                filedlist: [
                                                    { field: "formstatus", status: "add,edit" } //表單為新增，修改狀態
                                                ]
                                            },
                                            key: 'other_cost',
                                            type: 'basNumber'
                                        }

                                    ]
                                },
                                {
                                    title: "外銷",
                                    items: [
                                        {
                                            title: "內盒數",
                                            editstatus: {
                                                relation: "and",
                                                filedlist: [
                                                    { field: "formstatus", status: "add,edit" } //表單為新增，修改狀態
                                                ]
                                            },
                                            key: 'in_box',
                                            type: 'basDefault'
                                        },
                                        {
                                            title: "材積",
                                            editstatus: {
                                                relation: "and",
                                                filedlist: [
                                                    { field: "formstatus", status: "add,edit" } //表單為新增，修改狀態
                                                ]
                                            },
                                            key: 'cuft',
                                            type: 'basDefault'
                                        },
                                        {
                                            title: "淨重",
                                            editstatus: {
                                                relation: "and",
                                                filedlist: [
                                                    { field: "formstatus", status: "add,edit" } //表單為新增，修改狀態
                                                ]
                                            },
                                            key: 'n_wight',
                                            type: 'basDefault'
                                        },
                                        {
                                            title: "毛重",
                                            editstatus: {
                                                relation: "and",
                                                filedlist: [
                                                    { field: "formstatus", status: "add,edit" } //表單為新增，修改狀態
                                                ]
                                            },
                                            key: 'g_wight',
                                            type: 'basDefault'
                                        },
                                        {
                                            title: "外箱內盒數",
                                            editstatus: {
                                                relation: "and",
                                                filedlist: [
                                                    { field: "formstatus", status: "add,edit" } //表單為新增，修改狀態
                                                ]
                                            },
                                            key: 'qty_pbox',
                                            type: 'basDefault'
                                        },
                                        {
                                            title: "包裝說明",
                                            editstatus: {
                                                relation: "and",
                                                filedlist: [
                                                    { field: "formstatus", status: "add,edit" } //表單為新增，修改狀態
                                                ]
                                            },
                                            key: 'itemdesc',
                                            type: 'basTextarea'
                                        },
                                        {
                                            title: "英文規格說明",
                                            editstatus: {
                                                relation: "and",
                                                filedlist: [
                                                    { field: "formstatus", status: "add,edit" } //表單為新增，修改狀態
                                                ]
                                            },
                                            key: 'edesc',
                                            type: 'basTextarea'
                                        },

                                    ]
                                },
                                {
                                    title: "庫存",
                                    items: [
                                        {
                                            title: "庫存代號",
                                            editstatus: {
                                                relation: "and",
                                                filedlist: [
                                                    { field: "formstatus", status: "add,edit" } //表單為新增，修改狀態
                                                ]
                                            },
                                            key: 'item_un',
                                            relationfield: [{
                                                findfield: "un_desc",
                                                tofield: "un_desc3" //un_desc3虛擬欄位  避免互相影響
                                            }],
                                            additionalField: {
                                                key: "un_desc3",
                                                readonly: true,
                                                type: "basString"
                                            },
                                            type: "basLov",
                                            lovtype: 'get_un',
                                        },
                                        {
                                            title: "倉庫代號",
                                            key: 'ware_nbr',
                                            editstatus: {
                                                relation: "and",
                                                filedlist: [
                                                    { field: "formstatus", status: "add,edit" } //表單為新增，修改狀態
                                                ]
                                            },
                                            relationfield: [{
                                                findfield: "ware_desc",
                                                tofield: "ware_desc"
                                            }],
                                            additionalField: {
                                                key: "ware_desc",
                                                readonly: true,
                                                type: "basString"
                                            },
                                            type: 'basLov',
                                            lovtype: "get_war"
                                        },
                                        {
                                            title: "安全存量",
                                            key: 'safety_qty',
                                            editstatus: {
                                                relation: "and",
                                                filedlist: [
                                                    { field: "formstatus", status: "add,edit" } //表單為新增，修改狀態
                                                ]
                                            },
                                            type: 'basNumber'
                                        },
                                        {
                                            title: "類品來源",
                                            editstatus: {
                                                relation: "and",
                                                filedlist: [
                                                    { field: "formstatus", status: "add,edit" } //表單為新增，修改狀態
                                                ]
                                            },
                                            key: 'm_type',
                                            titleMap: [
                                                { value: "1", name: "採購品" },
                                                { value: "2", name: "製成品" }

                                            ],
                                            type: 'basLov',
                                            lovtype: "select"
                                        },
                                        {
                                            title: "每次採購量",
                                            editstatus: {
                                                relation: "and",
                                                filedlist: [
                                                    { field: "formstatus", status: "add,edit" } //表單為新增，修改狀態
                                                ]
                                            },
                                            key: 'a_in_qty',
                                            type: 'basNumber'
                                        },
                                        {
                                            title: "採購廠商",
                                            editstatus: {
                                                relation: "and",
                                                filedlist: [
                                                    { field: "formstatus", status: "add,edit" } //表單為新增，修改狀態
                                                ]
                                            },
                                            relationfield: [{
                                                findfield: "ven_name",
                                                tofield: "ven_name"
                                            }],
                                            additionalField: {
                                                key: "ven_name",
                                                readonly: true,
                                                type: "basString"
                                            },
                                            key: 'ven_nbr',
                                            type: 'basLov',
                                            lovtype: "get_ven"
                                        },
                                        {
                                            title: "異動庫存",
                                            editstatus: {
                                                relation: "and",
                                                filedlist: [
                                                    { field: "formstatus", status: "add,edit" } //表單為新增，修改狀態
                                                ]
                                            },
                                            key: 'ud_oh_ctl',
                                            titleMap: [
                                                { value: "Y", name: "是" },
                                                { value: "N", name: "否" }

                                            ],
                                            type: 'basLov',
                                            lovtype: "select"
                                        },
                                        {
                                            title: "總成本",
                                            editstatus: {
                                                relation: "and",
                                                filedlist: [
                                                    { field: "formstatus", status: "add,edit" } //表單為新增，修改狀態
                                                ]
                                            },
                                            key: 'unit_cost',
                                            type: 'basNumber'
                                        },
                                        {
                                            title: "儲位",
                                            editstatus: {
                                                relation: "and",
                                                filedlist: [
                                                    { field: "formstatus", status: "add,edit" } //表單為新增，修改狀態
                                                ]
                                            },
                                            key: 'stock_desc',
                                            type: 'basDefault'
                                        },
                                        {
                                            title: "資料別",
                                            editstatus: {
                                                relation: "and",
                                                filedlist: [
                                                    { field: "formstatus", status: "add,edit" } //表單為新增，修改狀態
                                                ]
                                            },
                                            key: 'item_type',
                                            titleMap: [
                                                { value: "1", name: "1  所有公司公用料號" },
                                                { value: "2", name: "2  各自公司私用料號" }

                                            ],
                                            type: 'basLov',
                                            lovtype: "select"
                                        },
                                        {
                                            title: "最近進價",
                                            editstatus: {
                                                relation: "and",
                                                filedlist: [
                                                    { field: "formstatus", status: "add,edit" } //表單為新增，修改狀態
                                                ]
                                            },
                                            key: 'last_price',
                                            type: 'basNumber'
                                        },
                                        {
                                            title: "最近進貨日",
                                            editstatus: {
                                                relation: "and",
                                                filedlist: [
                                                    { field: "formstatus", status: "add,edit" } //表單為新增，修改狀態
                                                ]
                                            },
                                            key: 'l_recdate',
                                            type: 'basEsydatetime'
                                        },
                                        {
                                            title: "最近進貨廠商",
                                            editstatus: {
                                                relation: "and",
                                                filedlist: [
                                                    { field: "formstatus", status: "add,edit" } //表單為新增，修改狀態
                                                ]
                                            },
                                            relationfield: [{
                                                findfield: "ven_name",
                                                tofield: "ven_name1"  //ven_name1 虛擬欄位 避免互相影響
                                            }],
                                            additionalField: {
                                                key: "ven_name1",
                                                readonly: true,
                                                type: "basString"
                                            },
                                            key: 'last_ven',
                                            type: 'basLov',
                                            lovtype: "get_ven"
                                        },
                                    ]
                                },
                                {
                                    title: "圖示",
                                    items: [
                                        {
                                        title: "產品圖檔",
                                        key: "image",
                                        css: "cell100",
                                        editstatus: {
                                            relation: "and",
                                            filedlist: [
                                                { field: "formstatus", status: "add,edit" } //表單為新增，修改狀態
                                            ]
                                        },
                                        type: "basGetgallery",
                                        options: {
                                            multiple: 5,
                                            maxMB: 20
                                        }
                                    }]
                                },
                                {    //加了整個會無法存檔，要存檔看可以先註解掉
                                    title: "售價記錄",  //cus_itm的表
                                    items:[{
                                        title: "明細行",
                                        key: 'map14',
                                        type: "basEditgrid",
                                        gridkey: "bas.map14.detail",
                                        css: "cell100",
                                        // action: {
                                        //     add: {
                                        //         editstatus: {
                                        //             relation: "or",
                                        //             editstatus: {
                                        //                 relation: "and",
                                        //                 filedlist: [
                                        //                     {field: "formstatus", status: "add,edit"}, //表單為新增，修改狀態
                                        //                 ]
                                        //             },
                                        //             filedlist: [
                                        //                 {field: "formstatus", status: "add,edit"}, //表單新增狀態
                                        //             ]
                                        //         },
                                        //         click: function () {
                                        //             var item = {
                                        //                 isdel: false
                                        //             }
                                        //             scope.model.cuscus.push(item);
                                        //         }
                                        //     },
                                        //     del: {
                                        //         editstatus: {
                                        //             relation: "or",
                                        //             filedlist: [
                                        //                 {field: "formstatus", status: "add,edit"}, //表單新增狀態
                                        //             ]
                                        //         },
                                        //         click: function (item) {
                                        //             item.isdel = true;
                                        //             scope.counttot_amt();
                                        //         }
                                        //     }
                                        // },
                                        headers: {
                                            "cus_nbr": {
                                                displayName: "客戶編號",
                                                type: "basDefault",
                                                width: 110
                                            },
                                            "cus_alias": {
                                                displayName: "客戶簡稱",
                                                type: 'basDefault',
                                                width: 110
                                            },
                                            "cus_item": {
                                                displayName: "客戶產品編號",
                                                type: 'basDefault',
                                                width: 110,
                                            },
                                            "unit": {
                                                displayName: "單位",
                                                type: 'basDefault',
                                                width: 110
                                            },
                                            "coin_nbr": {
                                                displayName: "幣別",
                                                type: 'basDefault',
                                                width: 110
                                            },
                                            "qty": {
                                                displayName: "數量",
                                                type: 'basDefault',
                                                width: 110
                                            },
                                            "price": {
                                                displayName: "最近價格",
                                                type: 'basDefault',
                                                width: 110
                                            },
                                            "last_date": {
                                                displayName: "最近價格日期",
                                                type: 'basEsydatetime',
                                                width: 110
                                            }
                                        }
            
                                    },
                                ]
                                },
                                {    //加了整個會無法存檔，要存檔看可以先註解掉
                                    title: "進價記錄",  //ven_itm的表
                                    items:[{
                                        title: "明細行",
                                        key: 'map14',
                                        type: "basEditgrid",
                                        gridkey: "bas.map14.detail",
                                        css: "cell100",
                                        // action: {
                                        //     add: {
                                        //         editstatus: {
                                        //             relation: "or",
                                        //             editstatus: {
                                        //                 relation: "and",
                                        //                 filedlist: [
                                        //                     {field: "formstatus", status: "add,edit"}, //表單為新增，修改狀態
                                        //                 ]
                                        //             },
                                        //             filedlist: [
                                        //                 {field: "formstatus", status: "add,edit"}, //表單新增狀態
                                        //             ]
                                        //         },
                                        //         click: function () {
                                        //             var item = {
                                        //                 isdel: false
                                        //             }
                                        //             scope.model.cuscus.push(item);
                                        //         }
                                        //     },
                                        //     del: {
                                        //         editstatus: {
                                        //             relation: "or",
                                        //             filedlist: [
                                        //                 {field: "formstatus", status: "add,edit"}, //表單新增狀態
                                        //             ]
                                        //         },
                                        //         click: function (item) {
                                        //             item.isdel = true;
                                        //             scope.counttot_amt();
                                        //         }
                                        //     }
                                        // },
                                        headers: {
                                            "ven_nbr": {
                                                displayName: "廠商編號",
                                                type: "basDefault",
                                                width: 110
                                            },
                                            "ven_alias": {
                                                displayName: "廠商簡稱",
                                                type: "basDefault",
                                                width: 110
                                            },
                                            "pro_nbr": {
                                                displayName: "製程",
                                                type: 'basDefault',
                                                width: 110
                                            },
                                            "unit": {
                                                displayName: "單位",
                                                type: 'basDefault',
                                                width: 110
                                            },
                                            "qty": {
                                                displayName: "數量",
                                                type: 'basDefault',
                                                width: 110
                                            },
                                            "price": {
                                                displayName: "最近價格",
                                                type: 'basDefault',
                                                width: 110
                                            },
                                            "last_date": {
                                                displayName: "最近交易日",
                                                type: 'basDefault',
                                                width: 110
                                            },
                                            "jprice": {
                                                displayName: "加工單價",
                                                type: 'basDefault',
                                                width: 110
                                            },
                                            "last_jdate": {
                                                displayName: "最近加工日",
                                                type: 'basDefault',
                                                width: 110
                                            }
                                        }
            
                                    },
                                ]
                                },
                                {    //加了整個會無法存檔，要存檔看可以先註解掉
                                    title: "計價轉換",  //pro_rate的表
                                    items:[{
                                        title: "明細行",
                                        key: 'map14',
                                        type: "basEditgrid",
                                        gridkey: "bas.map14.detail",
                                        css: "cell100",
                                        headers: {
                                            "pro_nbr": {
                                                displayName: "製程代號",
                                                type: "basDefault",
                                                width: 110
                                            },
                                            "pro_desc": {
                                                displayName: "製程說明",
                                                type: 'basDefault',
                                                width: 110
                                            },
                                            "unit1": {
                                                displayName: "單位1",
                                                type: 'basDefault',
                                                width: 110,
                                            },
                                            "factor1": {
                                                displayName: "轉換係數1",
                                                type: 'basDefault',
                                                width: 110
                                            },
                                            "unit2": {
                                                displayName: "單位2",
                                                type: 'basDefault',
                                                width: 110
                                            },
                                            "factor2": {
                                                displayName: "轉換係數2",
                                                type: 'basDefault',
                                                width: 110
                                            }
                                        }
            
                                    },
                                ]
                                },
                                {    //加了整個會無法存檔，要存檔看可以先註解掉
                                    title: "產品文件",  //bmp_bat的表
                                    items:[{
                                        title: "明細行",
                                        key: 'map14',
                                        type: "basEditgrid",
                                        gridkey: "bas.map14.detail",
                                        css: "cell100",
                                        headers: {
                                            "item_nbr": {
                                                displayName: "文件路徑",
                                                type: "basUploader",
                                                width: 250
                                            },
                                            "item_desc": {
                                                displayName: "文件說明",
                                                type: 'basDefault',
                                                width: 110
                                            },
                                            "load": {
                                                displayName: "讀檔",
                                                type: 'basUploader',
                                                width: 110,
                                            },
                                            "del": {
                                                displayName: "刪除",
                                                type: 'basDefault',
                                                width: 110
                                            }
                                        }
            
                                    },
                                ]
                                },
                                {    //加了整個會無法存檔，要存檔看可以先註解掉
                                    title: "參考號碼",  //inv_oth的表
                                    items:[{
                                        title: "明細行",
                                        key: 'map14',
                                        type: "basEditgrid",
                                        gridkey: "bas.map14.detail",
                                        css: "cell100",
                                        headers: {
                                            "cus_item": {
                                                displayName: "參考號碼",
                                                type: "basDefault",
                                                width: 110
                                            },
                                            "company": {
                                                displayName: "廠牌",
                                                type: 'basDefault',
                                                width: 110
                                            },
                                            "cus_alias": {
                                                displayName: "客戶簡稱",
                                                type: 'basDefault',
                                                width: 110,
                                            },
                                            "remark": {
                                                displayName: "備註",
                                                type: 'basDefault',
                                                width: 110
                                            }
                                        }
            
                                    },
                                ]
                                },
                            ]
                        }

                    ],
                }
            };
            scope.changebasuns = function() {
                    var basunsmap = [];
                    if (scope.model.item_un) {
                        var item = {
                            value: scope.model.item_un,
                            name: scope.model.item_un_desc
                        }
                        basunsmap.push(item);
                    }
                    scope.model.basunss.forEach(function(element) {
                        var item = {
                            value: element.unit,
                            name: element.un_desc
                        }
                        basunsmap.push(item);

                    }, this);

                    scope.config.form.form[1].tabs[0].items[3].titleMap = basunsmap;
                    scope.config.form.form[1].tabs[0].items[4].titleMap = basunsmap;
                }
                // scope.$watch("model.basunss", function(newvalue, oldvalue) {
                //     scope.changebasuns();

            // })
            scope.action = {
                add: function(event) {
                    $scope.$broadcast('schemaFormRedraw');
                    scope.model = {
                        formstatus: "add", //edit,view
                    }
                },
                edit: function() {
                    scope.model.formstatus = "edit"
                    scope.$broadcast("GridRedraw");
                },
                del: function() {
                    dialog.confirm('確定刪除當前數據?').then(function() {
                        scope.promise = utils.ajax({
                            method: 'DELETE',
                            url: "bas/invitm/" + scope.model.uid,
                            mockUrl: "plugins/data/map14.detail.json"
                        }).then(function(res) {
                            toastr.info("數據刪除成功!!!");
                            scope.uid = "";
                            scope.model = {
                                formstatus: "add",
                            }
                            scope.refreshtab("refreshinvitm", {});

                        });
                    });
                },
                undo: function() {
                    if (scope.model.formstatus == "add") {
                        scope.model = angular.copy(scope.bakmodel);
                    } else {
                        scope.model = angular.copy(scope.bakmodel);
                        scope.$broadcast("GridRedraw");
                    }
                    scope.model.formstatus = "view";
                },
                load: function() {
                    if (scope.uid) {
                        scope.promise = utils.ajax({
                            method: 'GET',
                            url: "bas/invitm/" + scope.uid,
                            mockUrl: "plugins/data/map14.detail.json"
                        }).then(function(res) {
                            var data = res.data;
                            scope.model = data.body;
                            scope.model.formstatus = "view";
                            for (var p in scope.model) {
                                if (scope.model[p] === null) {
                                    delete scope.model[p];
                                }
                            }
                            scope.bakmodel = angular.copy(scope.model);
                            scope.changebasuns();
                        });
                    } else {
                        scope.action.add();
                        scope.bakmodel = angular.copy(scope.model);
                    }

                },
                save: function(event, form) {
                    for (var p in scope.model) {
                        if (scope.model[p] === null) {
                            delete scope.model[p];
                        }
                    }
                    scope.$broadcast("schemaFormValidate");
                    if (!form.base_form.$valid) {
                        toastr.warning("請輸入必填項！");
                        return
                    }
                    var type = scope.model.uid ? "edit" : "add";
                    var bakstatus = scope.model.formstatus
                    scope.model.formstatus = "read";
                    scope.promise = utils.ajax({
                        method: "POST",
                        url: "bas/invitm",
                        mockUrl: "plugins/data/map14.detail.json",
                        data: scope.model
                    }).then(function(res) {
                        scope.uid = res.data.body.uid
                        if (type == "add") {
                            toastr.info("新增成功！");
                        } else {
                            toastr.info("修改成功！");
                        }
                        scope.action.load();
                        $scope.$broadcast('schemaFormRedraw');
                        scope.refreshtab("refreshinvitm", {});

                    }, function(error) {
                        $timeout(function() {
                            scope.model.formstatus = bakstatus
                        }, 100);

                    });
                }
            };
            scope.action.load();
        });

});
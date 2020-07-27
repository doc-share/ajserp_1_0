define(function() {
    angular.module('app').controller('bas.map12.detail',
        function($rootScope, $scope, $location, utils, path, getSingleView, settings,
            $timeout, dialog, toastr, ngDialog, uiGridConstants, qwsys, sysconstant) {
            var scope = $scope;
            scope.uid = "";
            if ($rootScope.uid) {
                scope.uid = $rootScope.uid;
                $rootScope.uid = "";
            };
            scope.ven_nbr = "";
            if ($rootScope.ven_nbr) {
                scope.ven_nbr = $rootScope.ven_nbr;
                $rootScope.ven_nbr = "";
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
                            "ven_nbr": {
                                "title": "廠商編號",
                                "type": "string"
                            },
                            "big_key": {
                                "title": "譯音碼",
                                "type": "string"
                            },
                            "ven_alias": {
                                "title": "廠商簡稱",
                                "type": "string"
                            },
                            "area_nbr": {
                                "title": "地區名稱",
                                "type": "string"
                            },
                            "ven_name": {
                                "title": "廠商名稱",
                                "type": "string"
                            },
                            "ven_addr": {
                                "title": "公司地址",
                                "type": "string"
                            },
                            "sen_addr": {
                                "title": "工廠地址",
                                "type": "string"
                            },
                            "ivc_addr": {
                                "title": "發票地址",
                                "type": "string"
                            },
                            "ven_gun": {
                                "title": "統一編號",
                                "type": "string"
                            },
                            "ven_num": {
                                "title": "營利事業登記證",
                                "type": "string"
                            },
                            "cellphone": {
                                "title": "手機",
                                "type": "string"
                            },
                            "acounter": {
                                "title": "會計",
                                "type": "string"
                            },
                            "http": {
                                "title": "網站",
                                "type": "string"
                            },
                            "ven_fax": {
                                "title": "傳真機號碼",
                                "type": "string"
                            },
                            "staffs": {
                                "title": "員工人數",
                                "type": "number"
                            },
                            "attname": {
                                "title": "負責人",
                                "type": "string"
                            },
                            "attname1": {
                                "title": "連絡人1",
                                "type": "string"
                            },
                            "attname2": {
                                "title": "連絡人2",
                                "type": "string"
                            },
                            "oew_amt": {
                                "title": "資本額",
                                "type": "number"
                            },
                            "acc_amt": {
                                "title": "年營業額",
                                "type": "number"
                            },
                            "ven_bank": {
                                "title": "往來銀行&帳號",
                                "type": "string"
                            },
                            "remark7": {
                                "title": "付款方式",
                                "type": "string"
                            },
                            "pay_term": {
                                "title": "交易方式",
                                "type": "string"
                            },
                            "tax_type": {
                                "title": "稅別",
                                "type": "string"
                            },
                            "pro_nbr": {
                                "title": "主要制程",
                                "type": "string"
                            },
                            "sale_inv": {
                                "title": "營業項目",
                                "type": "string"
                            },
                            "remark": {
                                "title": "備注",
                                "type": "string"
                            },
                            "ware_nbr": {
                                "title": "委外倉庫",
                                "type": "string"
                            },
                            "l_update": {
                                "title": "最近異動日期",
                                "type": "string"
                            },
                            "l_shpdate": {
                                "title": "最近交易日期",
                                "type": "string"
                            },

                            "email_addr": {
                                "title": "E-MAIL地址",
                                "type": "string"
                            },
                            "mail_nbr": {
                                "title": "郵遞區號",
                                "type": "string"
                            },
                            "mail_no1": {
                                "title": "郵遞區號",
                                "type": "string"
                            },
                            "mail_no2": {
                                "title": "郵遞區號",
                                "type": "string"
                            },
                            "shp_desc": {
                                "title": "業務性質",
                                "type": "string"
                            },
                            "chk_desc": {
                                "title": "票據抬頭",
                                "type": "string"
                            }
                        }
                    },
                    form: [
                        {
                            title: "廠商信息",
                            type: "region",
                            css: "max-4",
                            items: [
                                {
                                    title: "廠商編號",
                                    placeholder: "編號自動產生",
                                    key: 'ven_nbr',
                                    readonly:true,
                                    type: 'basString'
                                },
                                {
                                    title: "廠商名稱",
                                    required: true,
                                    key: 'ven_name',
                                    editstatus: {
                                        relation: "and",
                                        filedlist: [
                                            { field: "formstatus", status: "add,edit" } //表單為新增，修改狀態
                                        ]
                                    },
                                    type: 'basString'
                                },
                                {
                                    title: "廠商簡稱",
                                    required: true,
                                    editstatus: {
                                        relation: "and",
                                        filedlist: [
                                            { field: "formstatus", status: "add,edit" } //表單為新增，修改狀態
                                        ]
                                    },
                                    key: 'ven_alias',
                                    type: 'basString'
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
                                    type: 'basString'
                                },
                                {
                                    title: "票據抬頭",
                                    editstatus: {
                                        relation: "and",
                                        filedlist: [
                                            { field: "formstatus", status: "add,edit" } //表單為新增，修改狀態
                                        ]
                                    },
                                    key: 'chk_desc',
                                    type: 'basString'
                                }

                            ]
                        },
                        {
                            title: "基本信息",
                            type: "tabs",
                            css: "max-4",
                            tabs: [{
                                    title: "基本信息",
                                    items: [{
                                            title: "負責人",
                                            key: 'attname',
                                            editstatus: {
                                                relation: "and",
                                                filedlist: [
                                                    { field: "formstatus", status: "add,edit" } //表單為新增，修改狀態
                                                ]
                                            },
                                            type: 'basString'
                                        },
                                        {
                                            title: "連絡人1",
                                            key: 'attname1',
                                            editstatus: {
                                                relation: "and",
                                                filedlist: [
                                                    { field: "formstatus", status: "add,edit" } //表單為新增，修改狀態
                                                ]
                                            },
                                            type: 'basString'
                                        },
                                        {
                                            title: "營業項目",
                                            key: 'sale_inv',
                                            editstatus: {
                                                relation: "and",
                                                filedlist: [
                                                    { field: "formstatus", status: "add,edit" } //表單為新增，修改狀態
                                                ]
                                            },
                                            css: "cell2",
                                            type: 'basString'
                                        },
                                        {
                                            title: "連絡人2",
                                            key: 'attname2',
                                            editstatus: {
                                                relation: "and",
                                                filedlist: [
                                                    { field: "formstatus", status: "add,edit" } //表單為新增，修改狀態
                                                ]
                                            },
                                            type: 'basString'
                                        },
                                        {
                                            title: "廠商電話1",
                                            editstatus: {
                                                relation: "and",
                                                filedlist: [
                                                    { field: "formstatus", status: "add,edit" } //表單為新增，修改狀態
                                                ]
                                            },
                                            key: 'ven_tel1',
                                            type: 'basString'
                                        },
                                        {
                                            title: "分機1",
                                            key: 'pur_oth1',
                                            editstatus: {
                                                relation: "and",
                                                filedlist: [
                                                    { field: "formstatus", status: "add,edit" } //表單為新增，修改狀態
                                                ]
                                            },
                                            type: 'basString'
                                        },
                                        {
                                            title: "廠商電話2",
                                            editstatus: {
                                                relation: "and",
                                                filedlist: [
                                                    { field: "formstatus", status: "add,edit" } //表單為新增，修改狀態
                                                ]
                                            },
                                            key: 'ven_tel2',
                                            type: 'basString'
                                        },
                                        {
                                            title: "分機2",
                                            key: 'pur_oth2',
                                            editstatus: {
                                                relation: "and",
                                                filedlist: [
                                                    { field: "formstatus", status: "add,edit" } //表單為新增，修改狀態
                                                ]
                                            },
                                            type: 'basString'
                                        },
                                        {
                                            title: "手機",
                                            editstatus: {
                                                relation: "and",
                                                filedlist: [
                                                    { field: "formstatus", status: "add,edit" } //表單為新增，修改狀態
                                                ]
                                            },
                                            key: 'cellphone',
                                            type: 'basString'
                                        },
                                        {
                                            title: "傳真機號碼",
                                            key: 'ven_fax',
                                            editstatus: {
                                                relation: "and",
                                                filedlist: [
                                                    { field: "formstatus", status: "add,edit" } //表單為新增，修改狀態
                                                ]
                                            },
                                            type: 'basString'
                                        },
                                        {
                                            title: "最近交易日期",
                                            key: 'l_shpdate',
                                            editstatus: {
                                                relation: "and",
                                                filedlist: [{
                                                        field: "formstatus",
                                                        status: "add,edit"
                                                    } //表單為新增，修改狀態
                                                ]
                                            },
                                            type: 'basEsydatetime'
                                        },
                                        {
                                            title: "會計人員",
                                            key: 'acounter',
                                            editstatus: {
                                                relation: "and",
                                                filedlist: [{
                                                        field: "formstatus",
                                                        status: "add,edit"
                                                    } //表單為新增，修改狀態
                                                ]
                                            },
                                            type: 'basString'
                                        },
                                        {
                                            title: "最近異動日期",
                                            readonly: true,
                                            key: 'updated',
                                            type: 'basEsydatetime'
                                        },
                                        {
                                            title: "建檔日期",
                                            key: 'created',
                                            readonly: true,
                                            type: 'basString'
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
                                        }
                                       
                                    ]
                                },
                                {
                                    title: "進階",
                                    items: [{
                                            title: "資本額",
                                            editstatus: {
                                                relation: "and",
                                                filedlist: [
                                                    { field: "formstatus", status: "add,edit" } //表單為新增，修改狀態
                                                ]
                                            },
                                            key: 'oew_amt',
                                            type: 'basNumber'
                                        },
                                        {
                                            title: "營利事業登記證",
                                            editstatus: {
                                                relation: "and",
                                                filedlist: [
                                                    { field: "formstatus", status: "add,edit" } //表單為新增，修改狀態
                                                ]
                                            },
                                            key: 'ven_num',
                                            type: 'basString'
                                        },
                                        {
                                            title: "年營業額",
                                            editstatus: {
                                                relation: "and",
                                                filedlist: [
                                                    { field: "formstatus", status: "add,edit" } //表單為新增，修改狀態
                                                ]
                                            },
                                            key: 'acc_amt',
                                            type: 'basNumber'
                                        },
                                        {
                                            title: "員工人數",
                                            editstatus: {
                                                relation: "and",
                                                filedlist: [
                                                    { field: "formstatus", status: "add,edit" } //表單為新增，修改狀態
                                                ]
                                            },
                                            key: 'staffs',
                                            type: 'basNumber'
                                        }


                                    ]
                                },
                                {
                                    title: "地址/備註",
                                    items: [
                                        {
                                            title: "客戶郵區",
                                            key: 'mail_nbr',
                                            editstatus: {
                                                relation: "and",
                                                filedlist: [{
                                                        field: "formstatus",
                                                        status: "add,edit"
                                                    } //表單為新增，修改狀態
                                                ]
                                            },
                                            type: 'basString'
                                        },
                                        {
                                            title: "客戶地址",
                                            key: 'cus_addr',
                                            css: "cell2",
                                            editstatus: {
                                                relation: "and",
                                                filedlist: [{
                                                        field: "formstatus",
                                                        status: "add,edit"
                                                    } //表單為新增，修改狀態
                                                ]
                                            },
                                            type: 'basString'
                                        },
                                        {
                                            title: "送貨郵區",
                                            key: 'mail_no1',
                                            editstatus: {
                                                relation: "and",
                                                filedlist: [{
                                                        field: "formstatus",
                                                        status: "add,edit"
                                                    } //表單為新增，修改狀態
                                                ]
                                            },
                                            type: 'basString'
                                        },
                                        {
                                            title: "送貨地址",
                                            css: "cell2",
                                            key: 'sen_addr',
                                            editstatus: {
                                                relation: "and",
                                                filedlist: [{
                                                        field: "formstatus",
                                                        status: "add,edit"
                                                    } //表單為新增，修改狀態
                                                ]
                                            },
                                            type: 'basString'
                                        },
                                        {
                                            title: "發票區號",
                                            key: 'mail_no2',
                                            editstatus: {
                                                relation: "and",
                                                filedlist: [{
                                                        field: "formstatus",
                                                        status: "add,edit"
                                                    } //表單為新增，修改狀態
                                                ]
                                            },
                                            type: 'basString'
                                        },
                                        {
                                            title: "發票地址",
                                            key: 'ivc_addr',
                                            css: "cell2",
                                            editstatus: {
                                                relation: "and",
                                                filedlist: [{
                                                        field: "formstatus",
                                                        status: "add,edit"
                                                    } //表單為新增，修改狀態
                                                ]
                                            },
                                            type: 'basString'
                                        },
                                        {
                                            title: "E-MAIL地址",
                                            key: 'email_addr',
                                            css: "cell2",
                                            editstatus: {
                                                relation: "and",
                                                filedlist: [{
                                                        field: "formstatus",
                                                        status: "add,edit"
                                                    } //表單為新增，修改狀態
                                                ]
                                            },
                                            type: 'basString'
                                        },
                                        {
                                            title: "網站",
                                            css: "cell2",
                                            key: 'http',
                                            editstatus: {
                                                relation: "and",
                                                filedlist: [{
                                                        field: "formstatus",
                                                        status: "add,edit"
                                                    } //表單為新增，修改狀態
                                                ]
                                            },
                                            type: 'basString'
                                        },
                                        {   //虛擬欄位
                                            title: "地區碼",
                                            key: 'area',
                                            editstatus: {
                                                relation: "and",
                                                filedlist: [{
                                                        field: "formstatus",
                                                        status: "add,edit"
                                                    } //表單為新增，修改狀態
                                                ]
                                            },
                                            type: 'basLov',
                                            lovtype: "get_are",
                                            relationfield: [{
                                                findfield: "area_desc",
                                                tofield: "area_desc"
                                            }],
                                            additionalField: {
                                                key: "area_desc",
                                                readonly: true,
                                                type: "basString"
                                            }
                                        },
                                        {
                                            title: "備註",
                                            key: 'remark',
                                            css: "cell100",
                                            editstatus: {
                                                relation: "and",
                                                filedlist: [{
                                                        field: "formstatus",
                                                        status: "add,edit"
                                                    } //表單為新增，修改狀態
                                                ]
                                            },
                                            type: 'basTextarea'
                                        }



                                    ]
                                },
                                {
                                    title: "交易",
                                    items: [
                                        {
                                            title: "稅別",
                                            key: 'tax_type',
                                            editstatus: {
                                                relation: "and",
                                                filedlist: [{
                                                        field: "formstatus",
                                                        status: "add,edit"
                                                    } //表單為新增，修改狀態
                                                ]
                                            },
                                            type: "basLov",
                                            lovtype: 'select',
                                            titleMap: [
                                                { value: "1", name: "A  外加" },
                                                { value: "2", name: "I  內含" },
                                                { value: "3", name: "N  稅額不計" },
                                                { value: "4", name: "O  零稅" }
                                            ],
                                        },
                                        {
                                            title: "統一編號",
                                            key: 'ven_gun',
                                            editstatus: {
                                                relation: "and",
                                                filedlist: [
                                                    { field: "formstatus", status: "add,edit" } //表單為新增，修改狀態
                                                ]
                                            },
                                            type: 'basString'
                                        },
                                        {
                                            title: "付款條件",
                                            key: 'pay_term',
                                            editstatus: {
                                                relation: "and",
                                                filedlist: [{
                                                        field: "formstatus",
                                                        status: "add,edit"
                                                    } //表單為新增，修改狀態
                                                ]
                                            },
                                            type: "basLov",
                                            lovtype: 'select',
                                            titleMap: [
                                                { value: "1", name: "1  票據" },
                                                { value: "2", name: "2  現金"},
                                                { value: "3", name: "3  匯款" },
                                            ],
                                        },
                                        {
                                            title: "往來銀行",
                                            key: 'ven_bank',
                                            editstatus: {
                                                relation: "and",
                                                filedlist: [
                                                    { field: "formstatus", status: "add,edit" } //表單為新增，修改狀態
                                                ]
                                            },
                                            type: 'basString'
                                        },
                                        {
                                            title: "付款方式",
                                            key: 'remark7',
                                            editstatus: {
                                                relation: "and",
                                                filedlist: [
                                                    { field: "formstatus", status: "add,edit" } //表單為新增，修改狀態
                                                ]
                                            },
                                            type: 'basString'
                                        },
                                        {
                                            title: "月結日",
                                            key: 'days',
                                            editstatus: {
                                                relation: "and",
                                                filedlist: [{
                                                        field: "formstatus",
                                                        status: "add,edit"
                                                    } //表單為新增，修改狀態
                                                ]
                                            },
                                            type: 'basString'
                                        }
                                    ]
                                },
                                {
                                    title: "倉庫/制程",
                                    items: [{
                                            title: "委外倉庫",
                                            key: 'ware_nbr',
                                            editstatus: {
                                                relation: "and",
                                                filedlist: [
                                                    { field: "formstatus", status: "add,edit" } //表單為新增，修改狀態
                                                ]
                                            },
                                            type: 'basLov',
                                            lovtype: "get_war",
                                            relationfield: [{
                                                findfield: "ware_desc",
                                                tofield: "ware_desc"
                                            }],
                                            additionalField: {
                                                key: "ware_desc",
                                                readonly: true,
                                                type: "basString"
                                            }
                                        },
                                        {
                                            title: "主要制程",
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
                                        }
                                    ]
                                },
                                {    //加了整個會無法存檔，要存檔看可以先註解掉
                                    title: "料品單價記錄",  //ven_itm的表
                                    items:[{
                                        title: "明細行",
                                        key: 'map12',
                                        type: "basEditgrid",
                                        gridkey: "bas.map12.detail",
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
                                            "item_nbr": {
                                                displayName: "產品編號",
                                                type: "basDefault",
                                                width: 110
                                            },
                                            "item_name": { 
                                                displayName: "產品名稱",
                                                type: 'basDefault',
                                                width: 110,
                                            },
                                            "item_desc": {   
                                                displayName: "規格說明",//inv_itm表--欄位
                                                type: 'basDefault',
                                                width: 110,
                                               
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
                                            "price": {
                                                displayName: "歷史單價",
                                                type: 'basDefault',
                                                width: 110
                                            },
                                            "last_date": {
                                                displayName: "最近交易日",
                                                type: 'basEsydatetime',
                                                width: 110
                                            },
                                            "jprice": {
                                                displayName: "加工單價",
                                                type: 'basDefault',
                                                width: 110
                                            },
                                            "last_jdate": {
                                                displayName: "最近加工日",
                                                type: 'basEsydatetime',
                                                width: 110
                                            }
                                        }
            
                                    },
                                ]
                                },
                                {    //加了整個會無法存檔，要存檔看可以先註解掉
                                    title: "聯絡人",
                                    items:[{
                                        title: "明細行",
                                        key: 'map12',
                                        type: "basEditgrid",
                                        gridkey: "bas.map12.detail",
                                        css: "cell100",
                                        action: {
                                            add: {
                                                editstatus: {
                                                    relation: "or",
                                                    editstatus: {
                                                        relation: "and",
                                                        filedlist: [
                                                            {field: "formstatus", status: "add,edit"}, //表單為新增，修改狀態
                                                        ]
                                                    },
                                                    filedlist: [
                                                        {field: "formstatus", status: "add,edit"}, //表單新增狀態
                                                    ]
                                                },
                                                click: function () {
                                                    var item = {
                                                        isdel: false
                                                    }
                                                    scope.model.map12.push(item);
                                                }
                                            },
                                            del: {
                                                editstatus: {
                                                    relation: "or",
                                                    filedlist: [
                                                        {field: "formstatus", status: "add,edit"}, //表單新增狀態
                                                    ]
                                                },
                                                click: function (item) {
                                                    item.isdel = true;
                                                    scope.model.map11.splice();
                                                }
                                            }
                                        },
                                        headers: {
                                            "attname": {
                                                displayName: "連絡人",
                                                type: "basDefault",
                                                width: 110
                                            },
                                            "chunwei": {
                                                displayName: "稱謂",
                                                type: 'basDefault',
                                                width: 110
                                            },
                                            "dept_id": {
                                                displayName: "部門",
                                                type: 'basDefault',
                                                width: 110,
                                            },
                                            "t_desc": {
                                                displayName: "職稱",
                                                type: 'basDefault',
                                                width: 110
                                            },
                                            "att_tel": {
                                                displayName: "電話",
                                                type: 'basDefault',
                                                width: 110,
                                               
                                            },
                                            "att_toh": {
                                                displayName: "分機",
                                                type: 'basDefault',
                                                width: 110
                                            },
                                            "att_fax": {
                                                displayName: "傳真",
                                                type: 'basDefault',
                                                width: 110
                                            },
                                            "cellphone": {
                                                displayName: "手機",
                                                type: 'basDefault',
                                                width: 110
                                            },
                                            "e-mail": {
                                                displayName: "E-MAIL",
                                                type: 'basDefault',
                                                width: 110
                                            },
                                            "remark": {
                                                displayName: "備註",
                                                type: 'basDefault',
                                                width: 110
                                            },
                                        }
            
                                    },
                                ]
                                }
                            ]
                        }
                    ],
                }
            };
            scope.action = {
                add: function(event) {
                    $scope.$broadcast('schemaFormRedraw');
                    scope.model = {
                        formstatus: "add", //edit,view
                        coin_nbr: sysconstant.SYS_COIN,
                        tax_type: sysconstant.SYS_TAX,
                        pay_term: sysconstant.SYS_PAY
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
                            url: "bas/purven/" + scope.model.uid,
                            mockUrl: "plugins/data/map12.detail.json"
                        }).then(function(res) {
                            toastr.info("數據刪除成功!!!");
                            scope.uid = "";
                            scope.model = {
                                formstatus: "add",
                            }
                            scope.refreshtab("refreshpurven", {});

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
                    if (scope.ven_nbr) {
                        scope.promise = utils.ajax({
                            method: 'GET',
                            url: "bas/purven/getbyvennbr/" + scope.ven_nbr,
                            mockUrl: "plugins/data/map12.detail.json"
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
                        });
                    } else if (scope.uid) {
                        scope.promise = utils.ajax({
                            method: 'GET',
                            url: "bas/purven/" + scope.uid,
                            mockUrl: "plugins/data/map12.detail.json"
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
                        });
                    } else {
                        scope.action.add();
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
                        url: "bas/purven",
                        mockUrl: "plugins/data/map12.detail.json",
                        data: scope.model
                    }).then(function(res) {
                        scope.uid = res.data.body.uid
                        scope.ven_nbr = "";
                        if (type == "add") {
                            toastr.info("新增成功！");
                        } else {
                            toastr.info("修改成功！");
                        }
                        scope.action.load();
                        $scope.$broadcast('schemaFormRedraw');
                        scope.refreshtab("refreshpurven", {});

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
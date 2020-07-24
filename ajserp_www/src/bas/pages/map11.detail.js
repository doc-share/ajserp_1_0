define(function () {
    angular.module('app').controller('bas.map11.detail',
        function ($rootScope, $scope, $location, utils, path, getSingleView, settings,
            $timeout, dialog, toastr, ngDialog, uiGridConstants, qwsys, sysconstant) {
            var scope = $scope;
            scope.uid = "";
            if ($rootScope.uid) {
                scope.uid = $rootScope.uid;
                $rootScope.uid = "";
            };
            if ($rootScope.cus_nbr) {
                scope.cus_nbr = $rootScope.cus_nbr;
                $rootScope.cus_nbr = "";
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
                            filedlist: [{
                                    field: "formstatus",
                                    status: "add,edit,read"
                                } //表單新增狀態
                            ]
                        },
                        action: function (event, form) {
                            scope.action.add(event);
                        }
                    },
                    save: {
                        name: "保存",
                        icon: "fa-save",
                        editstatus: {
                            relation: "and",
                            filedlist: [{
                                    field: "formstatus",
                                    status: "add,edit"
                                }, //表單為新增，修改狀態
                            ]
                        },
                        action: function (event, form) {
                            scope.action.save(event, form);
                        }
                    },
                    undo: {
                        name: "取消",
                        icon: "fa-undo",
                        editstatus: {
                            relation: "and",
                            filedlist: [{
                                    field: "formstatus",
                                    status: "add,edit"
                                }, //表單為新增，修改狀態
                            ]
                        },
                        action: function (event, form) {
                            scope.action.undo(event);
                        }
                    },
                    edit: {
                        name: "修改",
                        icon: "fa-edit",
                        editstatus: {
                            relation: "and",
                            filedlist: [{
                                    field: "formstatus",
                                    status: "view"
                                } //查詢狀態                              
                            ]
                        },
                        action: function (event, form) {
                            scope.action.edit(event);
                        }
                    },
                    del: { //分配狀態下還可以刪除
                        name: "刪除",
                        icon: "fa-remove",
                        htmlClass: "deletestyle",
                        editstatus: {
                            relation: "and",
                            filedlist: [{
                                    field: "formstatus",
                                    status: "view"
                                } //表單查詢狀態                             
                            ]
                        },
                        action: function (event, form) {
                            scope.action.del(event);
                        }
                    },
                    refresh: {
                        name: "刷新",
                        icon: "fa-refresh",
                        htmlClass: "refresh",
                        editstatus: {
                            relation: "and",
                            filedlist: [{
                                    field: "formstatus",
                                    status: "view"
                                }, //表單為新增，修改狀態
                            ]
                        },
                        action: function (event, form) {
                            scope.action.load();
                        }
                    }
                },
                form: {
                    schema: {
                        "type": "object",
                        "properties": {
                            "cus_nbr": {
                                "title": "客戶編號",
                                "type": "string"
                            },
                            "big_key": {
                                "title": "譯音碼",
                                "type": "string"
                            },
                            "area_nbr": {
                                "title": "地區名稱",
                                "type": "string"
                            },
                            "cus_alias": {
                                "title": "客戶簡稱",
                                "type": "string"
                            },
                            "cus_name": {
                                "title": "客戶名稱",
                                "type": "string"
                            },
                            "cus_addr": {
                                "title": "客戶地址",
                                "type": "string"
                            },
                            "sen_addr": {
                                "title": "送貨地址",
                                "type": "string"
                            },
                            "ivc_addr": {
                                "title": "发票地址",
                                "type": "string"
                            },
                            "email_addr": {
                                "title": "E-MAIL地址",
                                "type": "string"
                            },
                            "eng_name": {
                                "title": "英文名稱",
                                "type": "string"
                            },
                            "addr_e": {
                                "title": "英文地址",
                                "type": "string"
                            },
                            "cus_gun": {
                                "title": "統一編號",
                                "type": "string"
                            },
                            "cus_fax": {
                                "title": "傳真機號碼",
                                "type": "string"
                            },
                            "attname": {
                                "title": "負責人",
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
                            "beg_date": {
                                "title": "創立日期",
                                "type": "datePicker"
                            },
                            "remark1": {
                                "title": "訂貨習慣",
                                "type": "string"
                            },
                            "remark2": {
                                "title": "客戶評等",
                                "type": "string"
                            },
                            "remark3": {
                                "title": "廠商性質",
                                "type": "string"
                            },
                            "remark4": {
                                "title": "廠商類別",
                                "type": "string"
                            },
                            "remark5": {
                                "title": "開发票方式",
                                "type": "string"
                            },
                            "remark6": {
                                "title": "業種別",
                                "type": "string"
                            },
                            "remark7": {
                                "title": "收款方式",
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
                            "days": {
                                "title": "月結日",
                                "type": "string"
                            },
                            "days1": {
                                "title": "付票票期",
                                "type": "string"
                            },
                            "days2": {
                                "title": "請款日",
                                "type": "string"
                            },
                            "days3": {
                                "title": "付款日",
                                "type": "string"
                            },
                            "ddate": {
                                "title": "開始交易日",
                                "type": "datePicker"
                            },
                            "sale_inv": {
                                "title": "營業項目",
                                "type": "string"
                            },
                            "cus_lev": {
                                "title": "單價等級",
                                "type": "string"
                            },
                            "sale_nbr": {
                                "title": "業務員",
                                "type": "string"
                            },
                            "tot_amt": {
                                "title": "授信額度",
                                "type": "number"
                            },
                            "remark": {
                                "title": "備注",
                                "type": "string"
                            },
                            "l_update": {
                                "title": "最近異動日期",
                                "type": "datePicker"
                            },
                            "l_shpdate": {
                                "title": "最近交易日期",
                                "type": "datePicker"
                            },

                            "m_date": {
                                "title": "嘜頭最後編輯日期",
                                "type": "datePicker"
                            },
                            "logtype": {
                                "title": "嘜頭LOG圖形",
                                "type": "string"
                            },
                            "logtxt": {
                                "title": "嘜頭LOG文字",
                                "type": "string"
                            },
                            "fmiltle": {
                                "title": "正嘜頭",
                                "type": "string"
                            },
                            "dmiltle": {
                                "title": "側嘜頭",
                                "type": "string"
                            },
                            "cellphone": {
                                "title": "大哥大",
                                "type": "string"
                            },
                            "acounter": {
                                "title": "會計",
                                "type": "string"
                            },
                            "a_tel": {
                                "title": "電話3",
                                "type": "string"
                            },
                            "a_oth": {
                                "title": "分機3",
                                "type": "string"
                            },
                            "http": {
                                "title": "網站",
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
                            "shp_1": {
                                "title": "業務說明",
                                "type": "string"
                            },
                            "service_tp": {
                                "title": "服務別",
                                "type": "string"
                            },
                            "tax_cal": {
                                "title": "稅額計算方式",
                                "type": "number"
                            }

                        }
                    },
                    form: [{
                            title: "基本信息",
                            type: "region",
                            css: "max-4",
                            items: [{
                                    title: "客戶編號",
                                    key: 'cus_nbr',
                                    placeholder: "自動產生",
                                    readonly: true,
                                    type: 'basString'
                                },
                                {
                                    title: "客戶名稱",
                                    editstatus: {
                                        relation: "and",
                                        filedlist: [{
                                                field: "formstatus",
                                                status: "add,edit"
                                            } //表單為新增，修改狀態
                                        ]
                                    },
                                    key: 'cus_name',
                                    type: 'basString'
                                },
                                {
                                    title: "客戶簡稱",
                                    key: 'cus_alias',
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
                                    title: "譯音碼",
                                    key: 'big_key',
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
                                    title: "業務員",
                                    key: 'sale_nbr',
                                    editstatus: {
                                        relation: "and",
                                        filedlist: [{
                                                field: "formstatus",
                                                status: "add,edit"
                                            } //表單為新增，修改狀態
                                        ]
                                    },
                                    type: 'basLov',
                                    lovtype: "get_sal",
                                    relationfield: [{
                                        findfield: "sale_name",
                                        tofield: "sale_name"
                                    }],
                                    additionalField: {
                                        key: "sale_name",
                                        readonly: true,
                                        type: "basString"
                                    }

                                },
                                {
                                    title: "連絡人1",
                                    key: 'attname1',
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
                                    title: "客戶電話1",
                                    key: 'cus_tel1',
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
                                    title: "分機1",
                                    key: 'cus_oth1',
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
                            title: "基本信息",
                            type: "tabs",
                            css: "max-4",
                            tabs: [{
                                    title: "基本資料",
                                    items: [{
                                            title: "負責人",
                                            key: 'attname',
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
                                            title: "連絡人2",
                                            key: 'attname2',
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
                                            title: "客戶電話2",
                                            key: 'cus_tel2',
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
                                            title: "分機2",
                                            key: 'cus_oth2',
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
                                            title: "營業項目",
                                            key: 'sale_inv',
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
                                            title: "手機",
                                            key: 'cellphone',
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
                                            title: "開始交易日",
                                            key: 'ddate',
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
                                            title: "電話",
                                            key: 'a_tel',
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
                                            title: "分機",
                                            key: 'a_oth',
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
                                            key: 'updated',
                                            readonly:true,
                                            type: 'basEsydatetime'
                                        },
                                        {
                                            title: "傳真機號碼",
                                            key: 'cus_fax',
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
                                            title: "建檔日期",
                                            key: 'created',
                                            readonly: true,
                                            type: 'basEsydatetime'
                                        }, 
                                        {
                                            title: "發票開立方式",
                                            key: 'remark5',
                                            editstatus: {
                                                relation: "and",
                                                filedlist: [{
                                                        field: "formstatus",
                                                        status: "add,edit"
                                                    } //表單為新增，修改狀態
                                                ]
                                            },
                                            type: 'basRadiosinline',
                                            titleMap: [
                                                {value: "1",name: "隨貨發票"},
                                                {value: "2",name: "月結發票"}
                                            ],
                                        },
                                        {
                                            title: "使用電子發票交換",
                                            editstatus: {
                                                relation: "and",
                                                filedlist: [{
                                                        field: "formstatus",
                                                        status: "add,edit"
                                                    } //表單為新增，修改狀態
                                                ]
                                            },
                                            key: 'isdz_jf',
                                            type: 'basCheckbox',
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
                                            title: "開發票方式",
                                            key: 'remark5',
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
                                            title: "統一編號",
                                            key: 'cus_gun',
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
                                            title: "收款方式",
                                            key: 'remark7',
                                            editstatus: {
                                                relation: "and",
                                                filedlist: [{
                                                        field: "formstatus",
                                                        status: "add,edit"
                                                    } //表單為新增，修改狀態
                                                ]
                                            },
                                            type: 'basNumber'
                                        },
                                        {
                                            title: "授信額度",
                                            key: 'tot_amt',
                                            editstatus: {
                                                relation: "and",
                                                filedlist: [{
                                                        field: "formstatus",
                                                        status: "add,edit"
                                                    } //表單為新增，修改狀態
                                                ]
                                            },
                                            type: 'basNumber'
                                        },
                                        {
                                            title: "票期天數",
                                            key: 'days1',
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
                                        },
                                        {
                                            title: "請款日",
                                            key: 'days2',
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
                                            title: "付款日",
                                            key: 'days3',
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
                                            title: "單價等級",
                                            key: 'cus_lev',
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
                                                { value: "1", name: "1" },
                                                { value: "2", name: "2"},
                                                { value: "3", name: "3" },
                                                { value: "4", name: "4"},
                                                { value: "5", name: "5" }
                                            ],
                                        },
                                        {
                                            title: "幣別",
                                            key: 'coin_nbr',
                                            editstatus: {
                                                relation: "and",
                                                filedlist: [{
                                                        field: "formstatus",
                                                        status: "add,edit"
                                                    } //表單為新增，修改狀態
                                                ]
                                            },
                                            relationfield: [{
                                                findfield: "coin_desc",
                                                tofield: "coin_desc"
                                            }],
                                            additionalField: {
                                                key: "coin_desc",
                                                readonly: true,
                                                type: "basString"
                                            },
                                            type: "basLov",
                                            lovtype: 'get_coin',
                                            
                                        }
                                    ]
                                },
                                {
                                    title: "進階",
                                    items: [
                                        {
                                            title: "創立日期",
                                            key: 'beg_date',
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
                                            title: "資本額",
                                            key: 'oew_amt',
                                            editstatus: {
                                                relation: "and",
                                                filedlist: [{
                                                        field: "formstatus",
                                                        status: "add,edit"
                                                    } //表單為新增，修改狀態
                                                ]
                                            },
                                            type: 'basNumber'
                                        },
                                        {
                                            title: "年營業額",
                                            key: 'acc_amt',
                                            editstatus: {
                                                relation: "and",
                                                filedlist: [{
                                                        field: "formstatus",
                                                        status: "add,edit"
                                                    } //表單為新增，修改狀態
                                                ]
                                            },
                                            type: 'basNumber'
                                        },
                                        {
                                            title: "訂貨習慣",
                                            key: 'remark1',
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
                                            title: "客戶評等",
                                            key: 'remark2',
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
                                            title: "客戶性質",
                                            key: 'remark3',
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
                                            title: "客戶類別",
                                            key: 'remark4',
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
                                            title: "業種別",
                                            key: 'remark6',
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
                                            title: "服務別",
                                            key: 'service_tp',
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
                                    title: "貿易",
                                    items: [
                                        {
                                            title: "英文名稱",
                                            key: 'eng_name',
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
                                        },
                                        {
                                            title: "英文地址",
                                            key: 'addr_e',
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
                                {    //加了整個會無法存檔，要存檔看可以先註解掉
                                    title: "產品單價記錄",  //cus_itm的表
                                    items:[{
                                        title: "明細行",
                                        key: 'map11',
                                        type: "basEditgrid",
                                        gridkey: "bas.map11.detail",
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
                                            "cus_item": {
                                                displayName: "客戶料品編號",
                                                type: 'basDefault',
                                                width: 110
                                            },
                                            "item_name": {
                                                displayName: "產品名稱",
                                                type: 'basDefault',
                                                width: 110,
                                            },
                                            "pro_nbr": {
                                                displayName: "製程",
                                                type: 'basDefault',
                                                width: 110
                                            },
                                            "item_desc": {   
                                                displayName: "規格說明",//inv_itm表--欄位
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
                                            "price": {
                                                displayName: "歷史單價",
                                                type: 'basDefault',
                                                width: 110
                                            },
                                            "last_date": {
                                                displayName: "最近價格日期",
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
                                        key: 'map11',
                                        type: "basEditgrid",
                                        gridkey: "bas.map11.detail",
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
                                                    scope.model.cuscus.push(item);
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
                                                    scope.counttot_amt();
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
                                },
                            ]
                        }
                    ],
                }
            };
            scope.action = {
                add: function (event) {
                    scope.model = {
                        formstatus: "add", //edit,view
                        coin_nbr: sysconstant.SYS_COIN,
                        tax_type: sysconstant.SYS_TAX,
                        pay_term: sysconstant.SYS_PAY,
                        days: 31,
                    }
                    $scope.$broadcast('schemaFormRedraw');
                },
                edit: function () {
                    scope.model.formstatus = "edit"
                    scope.$broadcast("GridRedraw");
                },
                del: function () {
                    dialog.confirm('確定刪除當前數據?').then(function () {
                        scope.promise = utils.ajax({
                            method: 'DELETE',
                            url: "bas/cuscus/" + scope.model.uid,
                            mockUrl: "plugins/data/cuscus.detail.json"
                        }).then(function (res) {
                            toastr.info("數據刪除成功!!!");
                            scope.uid = "";
                            scope.model = {
                                formstatus: "add",
                            }
                            scope.refreshtab("refreshcuscus", {});

                        });
                    });
                },
                undo: function () {
                    if (scope.model.formstatus == "add") {
                        scope.model = angular.copy(scope.bakmodel);
                    } else {
                        scope.model = angular.copy(scope.bakmodel);
                        scope.$broadcast("GridRedraw");
                    }
                    scope.model.formstatus = "view";
                },
                load: function () {
                    if (scope.cus_nbr) {
                        scope.promise = utils.ajax({
                            method: 'GET',
                            url: "bas/cuscus/getbycusnbr/" + scope.cus_nbr,
                            mockUrl: "plugins/data/map11.detail.json"
                        }).then(function (res) {
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
                            url: "bas/cuscus/" + scope.uid,
                            mockUrl: "plugins/data/map11.detail.json"
                        }).then(function (res) {
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
                save: function (event, form) {
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
                        url: "bas/cuscus",
                        mockUrl: "plugins/data/map11.detail.json",
                        data: scope.model
                    }).then(function (res) {
                        scope.cus_nbr = "";
                        scope.uid = res.data.body.uid
                        if (type == "add") {
                            toastr.info("新增成功！");
                        } else {
                            toastr.info("修改成功！");
                        }
                        scope.action.load();
                        $scope.$broadcast('schemaFormRedraw');
                        scope.refreshtab("refreshcuscus", {});

                    }, function (error) {
                        $timeout(function () {
                            scope.model.formstatus = bakstatus
                        }, 100);

                    });
                }
            };
            scope.action.load();
        });

});
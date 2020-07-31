define(function () {
    angular.module('app').controller('shp.map44.detail',
        function ($rootScope, $scope, $location, utils, path, getSingleView, settings,
            $timeout, dialog, toastr, ngDialog, uiGridConstants, qwsys, sysconstant) {
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
                            filedlist: [{
                                    field: "formstatus",
                                    status: "add,edit,read"
                                } //表单新增状态
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
                                }, //表单为新增，修改状态
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
                                }, //表单为新增，修改状态
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
                                } //查询状态                              
                            ]
                        },
                        action: function (event, form) {
                            scope.action.edit(event);
                        }
                    },
                    del: { //分配状态下还可以删除
                        name: "删除",
                        icon: "fa-remove",
                        htmlClass: "deletestyle",
                        editstatus: {
                            relation: "and",
                            filedlist: [{
                                    field: "formstatus",
                                    status: "view"
                                } //表单查询状态                             
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
                                }, //表单为新增，修改状态
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
                            "nbr": {
                                "title": "單據號碼",
                                "type": "String"
                            },
                        }
                    },
                    form: [
                        {
                            type: "group",
                            title: "",
                            items: [
                                {
                                    title: "單據號碼",
                                    key: 'nbr',
                                    readonly:true,
                                    type: 'basDefault',
                                },
                                {
                                    title: "稅別",
                                    key: 'tax_type',
                                    editstatus: {
                                        relation: "and",
                                        filedlist: [{
                                                field: "formstatus",
                                                status: "add,edit"
                                            } //表单为新增，修改状态
                                        ]
                                    },
                                    relationfield: [{
                                        findfield: "tax_desc",
                                        tofield: "tax_desc"
                                    }],
                                    additionalField: {
                                        key: "tax_desc",
                                        readonly: true,
                                        type: "basString"
                                    },
                                    type: 'basLov',
                                    lovtype: 'get_tax'
                                },
                                {
                                    title: "稅額",
                                    key: 'tax_amt',
                                    editstatus: {
                                        relation: "and",
                                        filedlist: [{
                                                field: "formstatus",
                                                status: "add,edit"
                                            } //表单为新增，修改状态
                                        ]
                                    },
                                    type: 'basNumber',
                                },
                                {
                                    title: "請款客戶",
                                    key: 'cus_nbr',
                                    editstatus: {
                                        relation: "and",
                                        filedlist: [{
                                                field: "formstatus",
                                                status: "add,edit"
                                            } //表单为新增，修改状态
                                        ]
                                    },
                                    relationfield: [{
                                        findfield: "cus_name",
                                        tofield: "cus_name"
                                    }],
                                    additionalField: {
                                        key: "cus_name",
                                        readonly: true,
                                        type: "basString"
                                    },
                                    type: 'basLov',
                                    lovtype: 'get_cus'
                                },
                                {
                                    title: "日期",
                                    key: 'nbrdate',
                                    editstatus: {
                                        relation: "and",
                                        filedlist: [{
                                                field: "formstatus",
                                                status: "add,edit"
                                            } //表单为新增，修改状态
                                        ]
                                    },
                                    type: 'basEsydatetime',
                                },
                                {
                                    title: "幣別",
                                    key: 'coin_nbr',
                                    editstatus: {
                                        relation: "and",
                                        filedlist: [{
                                                field: "formstatus",
                                                status: "add,edit"
                                            } //表单为新增，修改状态
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
                                    type: 'basLov',
                                    lovtype: 'get_coin'
                                },
                                {
                                    title: "匯率",
                                    key: 'coin_per',
                                    editstatus: {
                                        relation: "and",
                                        filedlist: [{
                                                field: "formstatus",
                                                status: "add,edit"
                                            } //表单为新增，修改状态
                                        ]
                                    },
                                    type: 'basNumber',
                                },
                                {
                                    title: "指定客戶",
                                    key: 'cen_cus',
                                    editstatus: {
                                        relation: "and",
                                        filedlist: [{
                                                field: "formstatus",
                                                status: "add,edit"
                                            } //表单为新增，修改状态
                                        ]
                                    },
                                    relationfield: [{
                                        findfield: "cus_name",   
                                        tofield: "cus_name1"   //使用cus_name1避免與請款客戶衝突
                                    }],
                                    additionalField: {
                                        key: "cus_name1",
                                        readonly: true,
                                        type: "basString"
                                    },
                                    type: 'basLov',
                                    lovtype: 'get_cus'
                                },
                                {
                                    title: "結帳月份",
                                    key: 'acr_mon',
                                    editstatus: {
                                        relation: "and",
                                        filedlist: [{
                                                field: "formstatus",
                                                status: "add,edit"
                                            } //表单为新增，修改状态
                                        ]
                                    },
                                    type: 'basEsydatetime',
                                    format:"YYYYMM"
                                },
                                {
                                    title: "倉庫",
                                    key: 'ware_nbr',
                                    editstatus: {
                                        relation: "and",
                                        filedlist: [{
                                                field: "formstatus",
                                                status: "add,edit"
                                            } //表单为新增，修改状态
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
                                    lovtype: 'get_war'
                                },
                                {
                                    title: "未稅總額",
                                    key: 'rec_amt',
                                    editstatus: {
                                        relation: "and",
                                        filedlist: [{
                                                field: "formstatus",
                                                status: "add,edit"
                                            } //表单为新增，修改状态
                                        ]
                                    },
                                    type: 'basNumber',
                                },
                                {
                                    title: "業務員代號",
                                    key: 'sale_nbr',
                                    editstatus: {
                                        relation: "and",
                                        filedlist: [{
                                                field: "formstatus",
                                                status: "add,edit"
                                            } //表单为新增，修改状态
                                        ]
                                    },
                                    relationfield: [{
                                        findfield: "sale_name",
                                        tofield: "sale_name"
                                    }],
                                    additionalField: {
                                        key: "sale_name",
                                        readonly: true,
                                        type: "basString"
                                    },
                                    type: 'basLov',
                                    lovtype: 'get_sal'
                                },
                                {
                                    title: "付款方式",
                                    key: 'pay_term',
                                    editstatus: {
                                        relation: "and",
                                        filedlist: [{
                                                field: "formstatus",
                                                status: "add,edit"
                                            } //表单为新增，修改状态
                                        ]
                                    },
                                    type: 'basLov',
                                    lovtype:"select",
                                    titleMap: [
                                        {value: "1",name: "票據"},
                                        {value: "2",name: "現金"},
                                        {value: "3",name: "匯款"}
                                    ],
                                },
                                {
                                    title: "發票號碼",
                                    key: 'ivc_nbr',
                                    editstatus: {
                                        relation: "and",
                                        filedlist: [{
                                                field: "formstatus",
                                                status: "add,edit"
                                            } //表单为新增，修改状态
                                        ]
                                    },
                                    type: 'basDefault',
                                },
                                {
                                    title: "出貨總額",
                                    key: 'tot_amt',
                                    editstatus: {
                                        relation: "and",
                                        filedlist: [{
                                                field: "formstatus",
                                                status: "add,edit"
                                            } //表单为新增，修改状态
                                        ]
                                    },
                                    type: 'basNumber',
                                },
                                {
                                    title: "連絡人1",
                                    key: 'attname1',
                                    editstatus: {
                                        relation: "and",
                                        filedlist: [{
                                                field: "formstatus",
                                                status: "add,edit"
                                            } //表单为新增，修改状态
                                        ]
                                    },
                                    type: 'basDefault',
                                },
                                {
                                    title: "狀態",
                                    key: 'status',
                                    editstatus: {
                                        relation: "and",
                                        filedlist: [{
                                                field: "formstatus",
                                                status: "add,edit"
                                            } //表单为新增，修改状态
                                        ]
                                    },
                                    type: 'basStatus',
                                    titleMap: [
                                        {value: "10",name: "【未沖款】"},
                                        {value: "20",name: "【應收部分沖款】"},
                                        {value: "30",name: "【應收已沖款】"}
                                    ],
                                }
                            ]
                        },
                        //下面为页签
                        {
                            type: "basTabs",
                            css: "max-4",
                            tabs: [
                                //下面为页签A
                                {    //加了整個會無法存檔，要存檔看可以先註解掉
                                    title: "明細",  //shpbat的表
                                    items:[
                                        {
                                        title: "明細行",
                                        key: 'shpbats',
                                        type: "basEditgrid",
                                        gridkey: "bas.map44.detail",
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
                                                    scope.model.shpbats.push(item);
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
                                                    scope.model.shpbats.splice();
                                                }
                                            }
                                        },
                                        headers: {
                                            "ivc_nbr": {
                                                displayName: "發票號碼",
                                                type: "basDefault",
                                                width: 110
                                            },
                                            "desc_no": {
                                                displayName: "客戶訂單號碼",
                                                type: 'basDefault',
                                                width: 110
                                            },
                                            "cus_item": {
                                                displayName: "客戶產品編號",
                                                type: 'basDefault',
                                                width: 110,
                                            },
                                            "ord_nbr": {
                                                displayName: "訂單單據號碼",
                                                type: 'basDefault',
                                                width: 110
                                            },
                                            "item_nbr": {   
                                                displayName: "產品編號",
                                                type: 'basDefault',
                                                width: 110,
                                               
                                            },
                                            "item_desc": {
                                                displayName: "規格說明",
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
                                            "t_qty": {
                                                displayName: "計價數量",
                                                type: 'basDefault',
                                                width: 110
                                            },
                                            "t_unit": {
                                                displayName: "計價單位",
                                                type: 'basDefault',
                                                width: 110
                                            },
                                            "price": {
                                                displayName: "單價",
                                                type: 'basDefault',
                                                width: 110
                                            },
                                            "amt": {
                                                displayName: "金額",
                                                type: 'basNumber',
                                                width: 110
                                            },
                                            "ware_nbr": {
                                                displayName: "倉庫",
                                                type: 'basEsydatetime',
                                                width: 110
                                            },
                                            "n_wight": {   
                                                displayName: "淨重",
                                                type: 'basDefault',
                                                width: 110,
                                               
                                            },
                                            "remark": {
                                                displayName: "備註",
                                                type: 'basDefault',
                                                width: 180
                                            },
                                            "g_wight": {
                                                displayName: "毛重",
                                                type: 'basDefault',
                                                width: 110
                                            },
                                            
                                            "cuft": {
                                                displayName: "材積",
                                                type: 'basDefault',
                                                width: 110
                                            },
                                            "in_box": {
                                                displayName: "內盒",
                                                type: 'basDefault',
                                                width: 110
                                            },
                                            "qty_pbox": {
                                                displayName: "外箱",
                                                type: 'basDefault',
                                                width: 110
                                            }
                                        }
                                        },
                                    ]
                                },
                                //下面为页签B
                                {
                                    title: "備註",
                                    items: [{
                                        title: "備註",
                                        key: 'remark',
                                        editstatus: {
                                            relation: "and",
                                            filedlist: [{
                                                    field: "formstatus",
                                                    status: "add,edit"
                                                } //表单为新增，修改状态
                                            ]
                                        },
                                        type: 'basTextarea',
                                        css:"cell100"
                                    }]
                                },
                                {
                                    title: "貨運資料",
                                    items: [
                                        {
                                            title: "貨品資料",
                                            key: 'item_desc',
                                            editstatus: {
                                                relation: "and",
                                                filedlist: [
                                                    {
                                                        field: "formstatus",
                                                        status: "add,edit"
                                                    } //表单为新增，修改状态
                                                ]
                                            },
                                            type: 'basDefault',
                                        },
                                        {
                                            title: "目的地",
                                            key: 'shp_07',
                                            editstatus: {
                                                relation: "and",
                                                filedlist: [
                                                    {
                                                        field: "formstatus",
                                                        status: "add,edit"
                                                    } //表单为新增，修改状态
                                                ]
                                            },
                                            type: 'basDefault',
                                        },
                                        {
                                            title: "交貨地點",
                                            key: 'shp_01',
                                            editstatus: {
                                                relation: "and",
                                                filedlist: [
                                                    {
                                                        field: "formstatus",
                                                        status: "add,edit"
                                                    } //表单为新增，修改状态
                                                ]
                                            },
                                            type: 'basDefault',
                                        },
                                        {
                                            title: "報關行",
                                            key: 'shp_08',
                                            editstatus: {
                                                relation: "and",
                                                filedlist: [
                                                    {
                                                        field: "formstatus",
                                                        status: "add,edit"
                                                    } //表单为新增，修改状态
                                                ]
                                            },
                                            type: 'basDefault',
                                        },
                                        {
                                            title: "貨櫃場",
                                            key: 'shp_02',
                                            editstatus: {
                                                relation: "and",
                                                filedlist: [
                                                    {
                                                        field: "formstatus",
                                                        status: "add,edit"
                                                    } //表单为新增，修改状态
                                                ]
                                            },
                                            type: 'basDefault',
                                        },
                                        {
                                            title: "卸貨時間",
                                            key: 's_time',
                                            editstatus: {
                                                relation: "and",
                                                filedlist: [
                                                    {
                                                        field: "formstatus",
                                                        status: "add,edit"
                                                    } //表单为新增，修改状态
                                                ]
                                            },
                                            type: 'basEsydatetime',
                                        },
                                        {
                                            title: "船公司",
                                            key: 'shp_03',
                                            editstatus: {
                                                relation: "and",
                                                filedlist: [
                                                    {
                                                        field: "formstatus",
                                                        status: "add,edit"
                                                    } //表单为新增，修改状态
                                                ]
                                            },
                                            type: 'basDefault',
                                        },
                                        {
                                            title: "承運公司",
                                            key: 'shp_09',
                                            editstatus: {
                                                relation: "and",
                                                filedlist: [
                                                    {
                                                        field: "formstatus",
                                                        status: "add,edit"
                                                    } //表单为新增，修改状态
                                                ]
                                            },
                                            type: 'basDefault',
                                        },
                                        {
                                            title: "船 名",
                                            key: 'shp_04',
                                            editstatus: {
                                                relation: "and",
                                                filedlist: [
                                                    {
                                                        field: "formstatus",
                                                        status: "add,edit"
                                                    } //表单为新增，修改状态
                                                ]
                                            },
                                            type: 'basDefault',
                                        },
                                        {
                                            title: "貨櫃長度",
                                            key: 'shp_10',
                                            editstatus: {
                                                relation: "and",
                                                filedlist: [
                                                    {
                                                        field: "formstatus",
                                                        status: "add,edit"
                                                    } //表单为新增，修改状态
                                                ]
                                            },
                                            type: 'basDefault',
                                        },
                                        {
                                            title: "船 次",
                                            key: 'shp_05',
                                            editstatus: {
                                                relation: "and",
                                                filedlist: [
                                                    {
                                                        field: "formstatus",
                                                        status: "add,edit"
                                                    } //表单为新增，修改状态
                                                ]
                                            },
                                            type: 'basDefault',
                                        },
                                        {
                                            title: "領櫃地點",
                                            key: 'shp_11',
                                            editstatus: {
                                                relation: "and",
                                                filedlist: [
                                                    {
                                                        field: "formstatus",
                                                        status: "add,edit"
                                                    } //表单为新增，修改状态
                                                ]
                                            },
                                            type: 'basDefault',
                                        },
                                        {
                                            title: "S/O NO",
                                            key: 'shp_06',
                                            editstatus: {
                                                relation: "and",
                                                filedlist: [
                                                    {
                                                        field: "formstatus",
                                                        status: "add,edit"
                                                    } //表单为新增，修改状态
                                                ]
                                            },
                                            type: 'basDefault',
                                        },
                                        {
                                            title: "填表人",
                                            key: 'writer',
                                            editstatus: {
                                                relation: "and",
                                                filedlist: [
                                                    {
                                                        field: "formstatus",
                                                        status: "add,edit"
                                                    } //表单为新增，修改状态
                                                ]
                                            },
                                            relationfield: [{
                                                findfield: "sale_name",
                                                tofield: "sale_name1"  //使用sal_name1避免與業務員衝突
                                            }],
                                            additionalField: {
                                                key: "sale_name1",
                                                readonly: true,
                                                type: "basString"
                                            },
                                            type: 'basLov',
                                            lovtype: 'get_sal'
                                        },
                                        
                                    ]
                                }

                            ]
                        }


                    ]
                }
            };
            scope.action = {
                add: function (event) {
                    $scope.$broadcast('schemaFormRedraw');
                    scope.model = {
                        formstatus: "add", //edit,view
                        status: "10",
                        nbrdate: qwsys.gettoday(),   //獲取當天時間
                        coin_per: 1.000,
                        // coin_per: qwsys.getsysvar(),  //獲取匯率
                    }
                },
                edit: function () {
                    scope.model.formstatus = "edit"
                    $scope.$broadcast('schemaFormRedraw');
                },
                del: function () {
                    dialog.confirm('确定删除当前数据?').then(function () {
                        scope.promise = utils.ajax({
                            method: 'DELETE',
                            url: "ord/shpbah/" + scope.model.uid,
                            mockUrl: "plugins/data/map44.detail.json"
                        }).then(function (res) {
                            toastr.info("数据删除成功!!!");
                            scope.uid = "";
                            scope.action.add();
                            scope.refreshtab("refreshordbah", {});

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
                    if (scope.uid) {
                        scope.promise = utils.ajax({
                            method: 'GET',
                            url: "ord/shpbah/" + scope.uid,
                            mockUrl: "plugins/data/map44.detail.json"
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
                        toastr.warning("请输入必填项！");
                        return
                    }
                    var type = scope.model.uid ? "edit" : "add";
                    var bakstatus = scope.model.formstatus
                    scope.model.formstatus = "read";
                    scope.promise = utils.ajax({
                        method: "POST",
                        url: "ord/shpbah",
                        mockUrl: "plugins/data/map44.detail.json",
                        data: scope.model
                    }).then(function (res) {
                        scope.uid = res.data.body.uid
                        if (type == "add") {
                            toastr.info("新增成功！");
                        } else {
                            toastr.info("修改成功！");
                        }
                        scope.action.load();
                        $scope.$broadcast('schemaFormRedraw');
                        scope.refreshtab("refreshordbah", {});

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
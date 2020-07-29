define(function () {
    angular.module('app').controller('rec.map54.detail',
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
                            "io_p": {
                                "title": "單據類別",
                                "type": "String"
                            },
                            "nbr": {
                                "title": "單據號碼",
                                "type": "String"
                            },
                            "tax_type": {
                                "title": "稅別",
                                "type": "String"
                            },
                            "ven_nbr": {
                                "title": "付款廠商",
                                "type": "String"
                            },
                            "nbrdate": {
                                "title": "日期",
                                "type": "Date"
                            },
                            "coin_nbr": {
                                "title": "幣別",
                                "type": "String"
                            },
                            "pay_term": {
                                "title": "付款方式",
                                "type": "String"
                            },
                            "acr_mon": {
                                "title": "結帳月份",
                                "type": "String"
                            },
                            "coin_per": {
                                "title": "匯率",
                                "type": "Double"
                            },
                            "ware_nbr": {
                                "title": "倉庫",
                                "type": "String"
                            },
                            "ivc_nbr": {
                                "title": "發票號碼",
                                "type": "String"
                            },
                            "tax_amt": {
                                "title": "稅額",
                                "type": "integer"
                            },
                            "remark": {
                                "title": "備註",
                                "type": "String"
                            },
                            "status": {
                                "title": "狀態",
                                "type": "String"
                            },
                            "attname1": {
                                "title": "連絡人1",
                                "type": "String"
                            }
                        }
                    },
                    form: [{
                            type: "group",
                            title: "",
                            items: [{
                                    title: "單據類別",
                                    key: 'io_p',
                                    editstatus: {
                                        relation: "and",
                                        filedlist: [{
                                                field: "formstatus",
                                                status: "add,edit"
                                            } //表单为新增，修改状态
                                        ]
                                    },
                                    type: 'basLov',
                                    lovtype: 'select',
                                    titleMap:[
                                        {value:"1",name:"進貨單"},
                                        {value:"2",name:"退貨單"},
                                    ]

                                },
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
                                    title: "付款廠商",
                                    key: 'ven_nbr',
                                    editstatus: {
                                        relation: "and",
                                        filedlist: [{
                                                field: "formstatus",
                                                status: "add,edit"
                                            } //表单为新增，修改状态
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
                                    type: 'basLov',
                                    lovtype: 'get_ven'
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
                                    title: "倉庫代號",
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
                                    type: 'basLov',
                                    lovtype: 'get_rem'
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
                                    type: 'basLov',
                                    type: 'basStatus',
                                    titleMap: [
                                        {value: "10",name: "【未沖款】"},
                                        {value: "20",name: "【應收部分沖款】"},
                                        {value: "30",name: "【應收已沖款】"}
                                    ],
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
                                    title: "進貨總額",
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
                                }
                            ]
                        },
                        //下面为页签
                        {
                            type: "basTabs",
                            css: "max-4",
                            tabs: [
                                {    //加了整個會無法存檔，要存檔看可以先註解掉
                                    title: "明細",  
                                    items:[//recbat的表
                                        {
                                        title: "明細行",
                                        key: 'recbats',
                                        type: "basEditgrid",
                                        gridkey: "bas.map54.detail",
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
                                                    scope.model.recbats.push(item);
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
                                                    scope.model.recbats.splice();
                                                }
                                            }
                                        },
                                        headers: {
                                            "item_nbr": {   
                                                displayName: "產品編號",
                                                type: 'basDefault',
                                                width: 110,
                                            },
                                            "pur_nbr": {
                                                displayName: "採購單號",
                                                type: "basDefault",
                                                width: 110
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
                                            "stock_desc": {   
                                                displayName: "儲位",
                                                type: 'basDefault',
                                                width: 110,
                                               
                                            },
                                            "remark": {
                                                displayName: "備註",
                                                type: 'basDefault',
                                                width: 180
                                            }
                                        }
            
                                    }]
                                },
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
                        nbrdate: qwsys.gettoday(),
                        coin_per: 1.000,
                        status: "10"
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
                            url: "pur/recbah/" + scope.model.uid,
                            mockUrl: "plugins/data/map54.detail.json"
                        }).then(function (res) {
                            toastr.info("数据删除成功!!!");
                            scope.uid = "";
                            scope.action.add();
                            scope.refreshtab("refreshrecbah", {});

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
                            url: "pur/recbah/" + scope.uid,
                            mockUrl: "plugins/data/map54.detail.json"
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
                        url: "pur/recbah",
                        mockUrl: "plugins/data/map54.detail.json",
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
                        scope.refreshtab("refreshrecbah", {});

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
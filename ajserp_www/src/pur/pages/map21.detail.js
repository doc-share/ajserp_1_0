define(function () {
    angular.module('app').controller('pur.map21.detail',
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
                            "nbrdate": {
                                "title": "日期",
                                "type": "Date"
                            },
                            "tot_amt": {
                                "title": "總金額",
                                "type": "Double"
                            },
                            "ven_nbr": {
                                "title": "供應商代號",
                                "type": "String"
                            },
                            "plan_date": {
                                "title": "預定到貨日",
                                "type": "Date"
                            },
                            "pay_term": {
                                "title": "交易方式",
                                "type": "String"
                            },
                            "ven_nbr1": {
                                "title": "指送廠商",
                                "type": "String"
                            },
                            "cus_ord": {
                                "title": "客戶訂單據號碼",
                                "type": "String"
                            },
                            "coin_nbr": {
                                "title": "幣別",
                                "type": "String"
                            },
                            "sale_nbr": {
                                "title": "業務員",
                                "type": "String"
                            },
                            "coin_per": {
                                "title": "匯率",
                                "type": "Double"
                            },
                            "remark": {
                                "title": "備註",
                                "type": "String"
                            },
                            "status": {
                                "title": "狀態",
                                "type": "String"
                            },
                            "ord_nbr": {
                                "title": "訂單單據號碼",
                                "type": "String"
                            },
                            "isord": {
                                "title": "是否轉單",
                                "type": "String"
                            },
                            "itemdesc": {
                                "title": "採購描述",
                                "type": "String"
                            }
                        }
                    },
                    form: [{
                            type: "group",
                            title: "",
                            items: [{
                                    title: "單據號碼",
                                    key: 'nbr',
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
                                    title: "採購總額",
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
                                    title: "預計到廠日",
                                    key: 'plan_date',
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
                                    title: "指送廠商",
                                    key: 'ven_nbr1',
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
                                        tofield: "ven_name1"   //使用ven_name1避免與付款廠商衝突
                                    }],
                                    additionalField: {
                                        key: "ven_name1",
                                        readonly: true,
                                        type: "basString"
                                    },
                                    type: 'basLov',
                                    lovtype: 'get_ven'
                                },
                                {
                                    title: "客戶訂單編號",
                                    key: 'cus_ord',
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
                                    title: "採購人員",
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
                                    type: 'basStatus',
                                    titleMap:[
                                        {value:"10",name:"【未收料】"},
                                        {value:"20",name:"【收料中】"},
                                        {value:"30",name:"【已結案】"},
                                        {value:"40",name:"【手動結案】"}
                                    ]
                                },
                                {
                                    title: "訂單單據號碼",
                                    key: 'ord_nbr',
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
                                    title: " 轉單狀態",
                                    key: 'isord',
                                    editstatus: {
                                        relation: "and",
                                        filedlist: [{
                                                field: "formstatus",
                                                status: "add,edit"
                                            } //表单为新增，修改状态
                                        ]
                                    },
                                    type: 'basStatus',
                                    titleMap:[
                                        {value:"N",name:"【未轉單】"},
                                        {value:"Y",name:"【已轉單】"},
                                    ]
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
                                    title: "明細",  //purbat的表
                                    items:[{
                                        title: "明細行",
                                        key: 'purbats',
                                        type: "basEditgrid",
                                        gridkey: "bas.map21.detail",
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
                                                    scope.model.purbats.push(item);
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
                                                    scope.model.purbats.splice();
                                                }
                                            }
                                        },
                                        headers: {
                                            "desc_no": {
                                                displayName: "客戶訂單號碼",
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
                                            "ioqty": {
                                                displayName: "已收料量",
                                                type: 'basDefault',
                                                width: 110
                                            },
                                            "safe_qty": {
                                                displayName: "最低訂購量",
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
                                            "plan_date": {   
                                                displayName: "預定交貨日",
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
                                //下面为页签B
                                {
                                    title: "採購描述",
                                    items: [{
                                        title: "採購描述",
                                        key: 'itemdesc',
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
                        isord: "N",
                        coin_per: 1.000,
                        nbrdate: qwsys.gettoday()
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
                            url: "pur/purbah/" + scope.model.uid,
                            mockUrl: "plugins/data/map21.detail.json"
                        }).then(function (res) {
                            toastr.info("数据删除成功!!!");
                            scope.uid = "";
                            scope.action.add();
                            scope.refreshtab("refreshpurbah", {});

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
                            url: "pur/purbah/" + scope.uid,
                            mockUrl: "plugins/data/map21.detail.json"
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
                        url: "pur/purbah",
                        mockUrl: "plugins/data/map21.detail.json",
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
                        scope.refreshtab("refreshpurbah", {});

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
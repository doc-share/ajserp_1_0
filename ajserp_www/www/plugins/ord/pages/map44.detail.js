define(function () {
    angular.module('app').controller('ord.map44.detail',
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
                            "cus_nbr": {
                                "title": "客戶代號",
                                "type": "String"
                            },
                            "attname1": {
                                "title": "連絡人1",
                                "type": "String"
                            },
                            "coin_nbr": {
                                "title": "幣別",
                                "type": "String"
                            },
                            "coin_per": {
                                "title": "匯率",
                                "type": "Double"
                            },
                            "sale_nbr": {
                                "title": "業務員代號",
                                "type": "String"
                            },
                            "sure": {
                                "title": "核准狀態",
                                "type": " String"
                            },
                            "plan_date": {
                                "title": "預計出貨日",
                                "type": "Date"
                            },
                            "cus_ord": {
                                "title": "客戶訂單據號碼",
                                "type": "String"
                            },
                            "status": {
                                "title": "狀態",
                                "type": "String"
                            },
                            "cus_ord": {
                                "title": "客戶訂單據號碼",
                                "type": "String"
                            },
                            "remark": {
                                "title": "備註",
                                "type": "String"
                            }
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
                                    title: "總金額",
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
                                    title: "客戶代號",
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
                                    title: "核准狀態",
                                    key: 'sure',
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
                                        {value: "N",name: "【未審核】"},
                                        {value: "Y", name: "【已審核】"}
                                    ],
                                },
                                {
                                    title: "預計出貨日",
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
                                    title: "客戶訂單據號碼",
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
                                        {value: "10",name: "【未出貨】"},
                                        {value: "20",name: "【出貨中】"},
                                        {value: "30",name: "【已結案】"},
                                        {value: "40",name: "【手動結案】"}
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
                                    title: "明細",  //cus_itm的表
                                    items:[
                                        {
                                        title: "明細行",
                                        key: 'ordbats',
                                        type: "basEditgrid",
                                        gridkey: "bas.map31.detail",
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
                                                    scope.model.ordbats.push(item);
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
                                                    scope.model.ordbats.splice();
                                                }
                                            }
                                        },
                                        headers: {
                                            "cus_ord": {
                                                displayName: "客戶訂單編號",
                                                type: "basDefault",
                                                width: 110
                                            },
                                            "cus_item": {
                                                displayName: "客戶產品編號",
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
                                                displayName: "製程",//inv_itm表--欄位
                                                type: 'basDefault',
                                                width: 110,
                                               
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
                                            "t_unit": {
                                                displayName: "計價單位",
                                                type: 'basDefault',
                                                width: 110
                                            },
                                            "plan_date": {
                                                displayName: "預計出貨日",
                                                type: 'basEsydatetime',
                                                width: 110
                                            },
                                            "pack_qty": {   
                                                displayName: "總箱數",
                                                type: 'basDefault',
                                                width: 110,
                                               
                                            },
                                            "ioqty": {
                                                displayName: "已出貨數量",
                                                type: 'basDefault',
                                                width: 110
                                            },
                                            "remark": {
                                                displayName: "備註",
                                                type: 'basDefault',
                                                width: 110
                                            },
                                            "no_t": {
                                                displayName: "箱子編號抬頭",
                                                type: 'basDefault',
                                                width: 110
                                            },
                                            "no1": {
                                                displayName: "箱子編號起",
                                                type: 'basDefault',
                                                width: 110
                                            },
                                            "no2": {
                                                displayName: "箱子編號迄",
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
                        sure: "N",
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
                            url: "ord/ordbah/" + scope.model.uid,
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
                            url: "ord/ordbah/" + scope.uid,
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
                        url: "ord/ordbah",
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
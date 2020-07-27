define(function () {
    angular.module('app').controller('quo.mapa1.detail',
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
                            "tax_type": {
                                "title": "稅別",
                                "type": "String"
                            },
                            "cus_nbr": {
                                "title": "客戶代號",
                                "type": "String"
                            },
                            "over_date": {
                                "title": "有效日期",
                                "type": "Date"
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
                                "title": "業務員",
                                "type": "String"
                            },
                            "pay_term": {
                                "title": "付款方式",
                                "type": "String"
                            },
                            "tax_amt": {
                                "title": "稅額",
                                "type": "integer"
                            },
                            "tot_amt": {
                                "title": "報價總額",
                                "type": "Double"
                            },
                            "attname1": {
                                "title": "連絡人1",
                                "type": "String"
                            },
                            "status": {
                                "title": "狀態",
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
                            items: [{
                                    title: "單據號碼",
                                    key: 'nbr',
                                    readonly:true,
                                    placeholder:"號碼自動產生",
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
                                    title: "有效日期",
                                    key: 'over_date',
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
                                    title: "業務員",
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
                                    lovtype: 'select',
                                    titleMap:[
                                        {value:"1",name:"票據"},
                                        {value:"2",name:"現金"},
                                        {value:"3",name:"匯款"}
                                    ]
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
                                    type: 'basDefault',
                                }
                            ]
                        },
                        //下面为页签
                        {
                            type: "basTabs",
                            css: "max-4",
                            tabs: [
                                //下面為頁簽A
                                {    //加了整個會無法存檔，要存檔看可以先註解掉
                                    title: "明細",
                                    items:[{
                                        title: "明細行",
                                        key: 'quobats',
                                        type: "basEditgrid",
                                        gridkey: "bas.mapa1.detail",
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
                                                    scope.model.mapa1.push(item);
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
                                                    scope.model.mapa1.splice();
                                                }
                                            }
                                        },
                                        headers: {
                                            "cus_item": {
                                                displayName: "客戶產品編號",
                                                type: "basDefault",
                                                width: 110
                                            },
                                            "item_nbr": {
                                                displayName: "產品編號",
                                                type: 'basDefault',
                                                width: 110
                                            },
                                            "cus_item1": {
                                                displayName: "參考號碼",
                                                type: 'basDefault',
                                                width: 110,
                                            },
                                            "item_desc": {
                                                displayName: "產品規格",
                                                type: 'basDefault',
                                                width: 110
                                            },
                                            "unit": {
                                                displayName: "單位",
                                                type: 'basDefault',
                                                width: 110,
                                               
                                            },
                                            "qty": {
                                                displayName: "數量",
                                                type: 'basDefault',
                                                width: 110
                                            },
                                            "price": {
                                                displayName: "金額",
                                                type: 'basDefault',
                                                width: 110
                                            },
                                            "t_unit": {
                                                displayName: "計價單位",
                                                type: 'basDefault',
                                                width: 110
                                            },
                                            "in_box": {
                                                displayName: "內盒",
                                                type: 'basDefault',
                                                width: 110
                                            },
                                            "t_qty": {
                                                displayName: "計價數量",
                                                type: 'basDefault',
                                                width: 110
                                            },
                                            "qty_pbox": {
                                                displayName: "外箱",
                                                type: 'basDefault',
                                                width: 110
                                            },
                                            "n_wight": {
                                                displayName: "淨重",
                                                type: 'basDefault',
                                                width: 110
                                            },
                                            "remark": {
                                                displayName: "備註",
                                                type: 'basDefault',
                                                width: 110
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
                                        }
            
                                    },
                                ]
                                },
                                //下面為頁簽B
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
                                //下面為頁簽C
                                // {
                                //     title: "英文報價資料",
                                //     items: [ 
                                //         {
                                //         title: "",
                                //         key: '',
                                //         editstatus: {
                                //             relation: "and",
                                //             filedlist: [{
                                //                     field: "formstatus",
                                //                     status: "add,edit"
                                //                 } //表单为新增，修改状态
                                //             ]
                                //         },
                                //         type: 'basDefault'
                                //     }]
                                // }
                            ]
                        }


                    ]
                }
            };
            scope.action = {
                add: function (event) {
                    $scope.$broadcast('schemaFormRedraw');
                    scope.model = {
                        coin_per: 1.000,
                        formstatus: "add" //edit,view
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
                            url: "ord/quobah/" + scope.model.uid,
                            mockUrl: "plugins/data/mapa1.detail.json"
                        }).then(function (res) {
                            toastr.info("数据删除成功!!!");
                            scope.uid = "";
                            scope.action.add();
                            scope.refreshtab("refreshquobah", {});

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
                            url: "ord/quobah/" + scope.uid,
                            mockUrl: "plugins/data/mapa1.detail.json"
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
                        url: "ord/quobah",
                        mockUrl: "plugins/data/mapa1.detail.json",
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
                        scope.refreshtab("refreshquobah", {});

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
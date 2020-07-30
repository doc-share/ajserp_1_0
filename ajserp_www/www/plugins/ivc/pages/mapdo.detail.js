define(function () {
    angular.module('app').controller('ivc.mapdo.detail',
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
                            "status": {
                                "title": "狀態",
                                "type": "String"
                            },
                            "cus_nbr": {
                                "title": "請款客戶",
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
                            "ivc_name": {
                                "title": "抬頭名稱",
                                "type": "String"
                            },
                            "acr_mon": {
                                "title": "結帳月份",
                                "type": "String"
                            },
                            "tax_amt": {
                                "title": "稅額",
                                "type": "integer"
                            },
                            "ivc_pur": {
                                "title": "發票開立人",
                                "type": "String"
                            },
                            "cus_gun": {
                                "title": "統一編號",
                                "type": "String"
                            },
                            "rec_amt": {
                                "title": "未稅總額",
                                "type": "Double"
                            },
                            "ivc_nbr": {
                                "title": "發票號碼",
                                "type": "String"
                            },
                            "tot_amt": {
                                "title": "出貨總額",
                                "type": "Double"
                            },
                            "tg_fs": {
                                "title": "通關方式",
                                "type": "String"
                            },
                            "remark": {
                                "title": "備註",
                                "type": "String"
                            },
                            "up_status": {
                                "title": "上傳狀態",
                                "type": "String"
                            },
                            "item_nbr": {
                                "title": "產品編號",
                                "type": "String"
                            },
                            "item_desc": {
                                "title": "產品名稱",
                                "type": "String"
                            },
                            "itemname": {
                                "title": "規格說明",
                                "type": "String"
                            },
                            "unit": {
                                "title": "單位",
                                "type": "String"
                            },
                            "qty": {
                                "title": "數量",
                                "type": "Double"
                            },
                            "price": {
                                "title": "單價",
                                "type": "Double"
                            },
                            "amt": {
                                "title": "金額",
                                "type": "Double"
                            },
                            "remark": {
                                "title": "備註",
                                "type": "String"
                            }
                        }
                    },
                    form: [{
                            type: "group",
                            title: "基本訊息",
                            items: [
                                {
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
                                        {value:"1",name:"銷項發票"},
                                        {value:"2",name:"折讓單"}
                                    ],
                                },
                                {
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
                                    title: "狀態",
                                    key: 'status',
                                    readonly:true,
                                    type: 'basStatus',
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
                                    relationfield: [
                                        {findfield: "cus_name",tofield: "cus_name"},
                                        {findfield: "cus_name",tofield: "ivc_name"}   //關聯抬頭名稱
                                    ],
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
                                    title: "抬頭名稱",
                                    key: 'ivc_name',
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
                                    title: "發票開立人",
                                    key: 'ivc_pur',
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
                                    title: "統一編號",
                                    key: 'cus_gun',
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
                                    title: "通關方式",
                                    key: 'tg_fs',
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
                                    titleMap:[
                                        {value:"0",name:"空白"},
                                        {value:"1",name:"非經海關出口"},
                                        {value:"2",name:"經海關出口"}
                                    ],
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
                                    title: "上傳狀態",
                                    key: 'up_status',
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
                                        {value:"10",name:"銷項發票未上傳"},
                                        {value:"20",name:"銷項發票已上傳"}
                                    ],
                                }
                            ]
                        },
                        //下面为行明细
                        {
                            type: 'basLine',
                            css: "cell100 ",
                            title: ""
                        },
                        {
                            title: "",
                            key: 'oivcbats',
                            type: "basEditgrid",
                            gridkey: "ivc.mapdo.detail",
                            css: "cell100",
                            action: {
                                add: {
                                    editstatus: {
                                        relation: "or",
                                        editstatus: {
                                            relation: "and",
                                            filedlist: [{
                                                    field: "formstatus",
                                                    status: "add,edit"
                                                }, //表单为新增，修改状态
                                            ]
                                        }
                                    },
                                    click: function () {
                                        var item = {
                                            isdel: false
                                        }
                                        scope.model.oivcbats.push(item);
                                    }
                                },
                                del: {
                                    editstatus: {
                                        relation: "or",
                                        filedlist: [{
                                                field: "formstatus",
                                                status: "add,edit"
                                            }, //表单新增状态
                                        ]
                                    },
                                    click: function (item) {
                                        item.isdel = true;
                                    }
                                }
                            },
                            headers: {
                                "item_nbr": {
                                    displayName: "產品編號",
                                    readonlystatus: {
                                        relation: "and",
                                        filedlist: [{
                                                field: "formstatus",
                                                status: "view"
                                            }, //表单新增状态
                                        ]
                                    },
                                    type: 'basDefault',
                                    lovtype: '',
                                    width: 110
                                },
                                "item_desc": {
                                    displayName: "產品名稱",
                                    readonlystatus: {
                                        relation: "and",
                                        filedlist: [{
                                                field: "formstatus",
                                                status: "view"
                                            }, //表单新增状态
                                        ]
                                    },
                                    type: 'basDefault',
                                    lovtype: '',
                                    width: 110
                                },
                                "itemname": {
                                    displayName: "規格說明",
                                    readonlystatus: {
                                        relation: "and",
                                        filedlist: [{
                                                field: "formstatus",
                                                status: "view"
                                            }, //表单新增状态
                                        ]
                                    },
                                    type: 'basDefault',
                                    lovtype: '',
                                    width: 110
                                },
                                "unit": {
                                    displayName: "單位",
                                    readonlystatus: {
                                        relation: "and",
                                        filedlist: [{
                                                field: "formstatus",
                                                status: "view"
                                            }, //表单新增状态
                                        ]
                                    },
                                    type: 'basDefault',
                                    lovtype: '',
                                    width: 110
                                },
                                "qty": {
                                    displayName: "數量",
                                    readonlystatus: {
                                        relation: "and",
                                        filedlist: [{
                                                field: "formstatus",
                                                status: "view"
                                            }, //表单新增状态
                                        ]
                                    },
                                    type: 'basDefault',
                                    lovtype: '',
                                    width: 110
                                },
                                "price": {
                                    displayName: "單價",
                                    readonlystatus: {
                                        relation: "and",
                                        filedlist: [{
                                                field: "formstatus",
                                                status: "view"
                                            }, //表单新增状态
                                        ]
                                    },
                                    type: 'basNumber',
                                    lovtype: '',
                                    width: 110
                                },
                                "amt": {
                                    displayName: "金額",
                                    readonlystatus: {
                                        relation: "and",
                                        filedlist: [{
                                                field: "formstatus",
                                                status: "view"
                                            }, //表单新增状态
                                        ]
                                    },
                                    type: 'basNumber',
                                    lovtype: '',
                                    width: 110
                                },
                                "remark": {
                                    displayName: "備註",
                                    readonlystatus: {
                                        relation: "and",
                                        filedlist: [{
                                                field: "formstatus",
                                                status: "view"
                                            }, //表单新增状态
                                        ]
                                    },
                                    type: 'basDefault',
                                    lovtype: '',
                                    width: 110
                                }
                            }

                        }


                    ]
                }
            };
            scope.action = {
                add: function (event) {
                    $scope.$broadcast('schemaFormRedraw');
                    scope.model = {
                        formstatus: "add", //edit,view
                        up_status:"10"
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
                            url: "ivc/oivcbah/" + scope.model.uid,
                            mockUrl: "plugins/data/mapdo.detail.json"
                        }).then(function (res) {
                            toastr.info("数据删除成功!!!");
                            scope.uid = "";
                            scope.action.add();
                            scope.refreshtab("refreshoivcbah", {});

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
                            url: "ivc/oivcbah/" + scope.uid,
                            mockUrl: "plugins/data/mapdo.detail.json"
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
                        url: "ivc/oivcbah",
                        mockUrl: "plugins/data/mapdo.detail.json",
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
                        scope.refreshtab("refreshoivcbah", {});

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
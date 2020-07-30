define(function () {
    angular.module('app').controller('sub.mape4.detail',
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
                                "title": "加工總額",
                                "type": "Double"
                            },
                            "ven_nbr": {
                                "title": "加工廠商",
                                "type": "String"
                            },
                            "ware_nbri": {
                                "title": "委外倉庫",
                                "type": "String"
                            },
                            "plan_date": {
                                "title": "預計完工日",
                                "type": "Date"
                            },
                            "ven_nbr1": {
                                "title": "指送廠商",
                                "type": "String"
                            },
                            "ware_nbro": {
                                "title": "撥料倉庫",
                                "type": "String"
                            },
                            "sale_nbr": {
                                "title": "承辦人員",
                                "type": "String"
                            },
                            "ord_nbr": {
                                "title": "訂單單據號碼",
                                "type": "String"
                            },
                            "status": {
                                "title": "狀態",
                                "type": "String"
                            },
                            "sure": {
                                "title": "核准狀態",
                                "type": " integer"
                            },
                            "remark": {
                                "title": "備註",
                                "type": "String"
                            },
                            "pps_nbr": {
                                "title": "生產批號",
                                "type": "String"
                            },
                            "item_nbr": {
                                "title": "料品代號",
                                "type": "String"
                            },
                            "nbr": {
                                "title": "訂單單號",
                                "type": "String"
                            },
                            "item_desc": {
                                "title": "規格說明",
                                "type": "String"
                            },
                            "ots_nbr": {
                                "title": "委外單號",
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
                            "ots_ioseq": {
                                "title": "委外序號",
                                "type": "String"
                            },
                            "price": {
                                "title": "單價",
                                "type": "Double"
                            },
                            "amt": {
                                "title": "金額",
                                "type": "Double"
                            },
                            "plan_date": {
                                "title": "預計完工日",
                                "type": "Date"
                            },
                            "remark": {
                                "title": "備註",
                                "type": "String"
                            },
                            "item_nbr": {
                                "title": "生產批號",
                                "type": "String"
                            },
                            "item_desc": {
                                "title": "規格說明",
                                "type": "String"
                            },
                            "pro_nbr": {
                                "title": "製程",
                                "type": "String"
                            },
                            "unit": {
                                "title": "單位",
                                "type": "String"
                            },
                            "ware_nbr": {
                                "title": "倉庫",
                                "type": "String"
                            },
                            "qty": {
                                "title": "數量",
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
                                    lovtype: ''
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
                                    lovtype: ''
                                },
                                {
                                    title: "加工總額",
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
                                    lovtype: ''
                                },
                                {
                                    title: "加工廠商",
                                    key: 'ven_nbr',
                                    editstatus: {
                                        relation: "and",
                                        filedlist: [{
                                                field: "formstatus",
                                                status: "add,edit"
                                            } //表单为新增，修改状态
                                        ]
                                    },
                                    type: 'basLov',
                                    lovtype: 'get_ven'
                                },
                                {
                                    title: "委外倉庫",
                                    key: 'ware_nbri',
                                    editstatus: {
                                        relation: "and",
                                        filedlist: [{
                                                field: "formstatus",
                                                status: "add,edit"
                                            } //表单为新增，修改状态
                                        ]
                                    },
                                    type: 'basLov',
                                    lovtype: 'get_war'
                                },
                                {
                                    title: "預定到廠日",
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
                                    lovtype: ''
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
                                    type: 'basLov',
                                    lovtype: 'get_ven'
                                },
                                {
                                    title: "撥料倉庫",
                                    key: 'ware_nbro',
                                    editstatus: {
                                        relation: "and",
                                        filedlist: [{
                                                field: "formstatus",
                                                status: "add,edit"
                                            } //表单为新增，修改状态
                                        ]
                                    },
                                    type: 'basLov',
                                    lovtype: 'get_war'
                                },
                                {
                                    title: "承辦員代號",
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
                                    lovtype: ''
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
                                    lovtype: ''
                                },
                                {
                                    title: "核准",
                                    key: 'sure',
                                    editstatus: {
                                        relation: "and",
                                        filedlist: [{
                                                field: "formstatus",
                                                status: "add,edit"
                                            } //表单为新增，修改状态
                                        ]
                                    },
                                    type: 'basLov',
                                    lovtype: ''
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
                                }
                            ]
                        },
                        //下面为页签
                        {
                            type: "basTabs",
                            css: "max-4",
                            tabs: [
                                //下面为页签A
                                {
                                    title: "委外加工",
                                    items: [{
                                            title: "生產工號",
                                            key: 'pps_nbr',
                                            editstatus: {
                                                relation: "and",
                                                filedlist: [{
                                                        field: "formstatus",
                                                        status: "add,edit"
                                                    } //表单为新增，修改状态
                                                ]
                                            },
                                            type: 'basDefault'
                                        },
                                        {
                                            title: "產品編號",
                                            key: 'item_nbr',
                                            editstatus: {
                                                relation: "and",
                                                filedlist: [{
                                                        field: "formstatus",
                                                        status: "add,edit"
                                                    } //表单为新增，修改状态
                                                ]
                                            },
                                            type: 'basDefault'
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
                                            type: 'basDefault'
                                        },
                                        {
                                            title: "產品規格",
                                            key: 'item_desc',
                                            editstatus: {
                                                relation: "and",
                                                filedlist: [{
                                                        field: "formstatus",
                                                        status: "add,edit"
                                                    } //表单为新增，修改状态
                                                ]
                                            },
                                            type: 'basDefault'
                                        },
                                        {
                                            title: "單據號碼",
                                            key: 'ots_nbr',
                                            editstatus: {
                                                relation: "and",
                                                filedlist: [{
                                                        field: "formstatus",
                                                        status: "add,edit"
                                                    } //表单为新增，修改状态
                                                ]
                                            },
                                            type: 'basDefault'
                                        },
                                        {
                                            title: "單位",
                                            key: 'unit',
                                            editstatus: {
                                                relation: "and",
                                                filedlist: [{
                                                        field: "formstatus",
                                                        status: "add,edit"
                                                    } //表单为新增，修改状态
                                                ]
                                            },
                                            type: 'basDefault'
                                        },
                                        {
                                            title: "數量",
                                            key: 'qty',
                                            editstatus: {
                                                relation: "and",
                                                filedlist: [{
                                                        field: "formstatus",
                                                        status: "add,edit"
                                                    } //表单为新增，修改状态
                                                ]
                                            },
                                            type: 'basDefault'
                                        },
                                        {
                                            title: "加工單序號",
                                            key: 'ots_ioseq',
                                            editstatus: {
                                                relation: "and",
                                                filedlist: [{
                                                        field: "formstatus",
                                                        status: "add,edit"
                                                    } //表单为新增，修改状态
                                                ]
                                            },
                                            type: 'basDefault'
                                        },
                                        {
                                            title: "單價",
                                            key: 'price',
                                            editstatus: {
                                                relation: "and",
                                                filedlist: [{
                                                        field: "formstatus",
                                                        status: "add,edit"
                                                    } //表单为新增，修改状态
                                                ]
                                            },
                                            type: 'basNumber'
                                        },
                                        {
                                            title: "金額",
                                            key: 'amt',
                                            editstatus: {
                                                relation: "and",
                                                filedlist: [{
                                                        field: "formstatus",
                                                        status: "add,edit"
                                                    } //表单为新增，修改状态
                                                ]
                                            },
                                            type: 'basNumber'
                                        },
                                        {
                                            title: "預定到廠日",
                                            key: 'plan_date',
                                            editstatus: {
                                                relation: "and",
                                                filedlist: [{
                                                        field: "formstatus",
                                                        status: "add,edit"
                                                    } //表单为新增，修改状态
                                                ]
                                            },
                                            type: 'basEsydatetime'
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
                                            type: 'basDefault'
                                        }
                                    ]
                                }
                                //下面为页签B
                                ,
                                {
                                    title: "委外撥料",
                                    items: [{
                                            title: "產品編號",
                                            key: 'item_nbr',
                                            editstatus: {
                                                relation: "and",
                                                filedlist: [{
                                                        field: "formstatus",
                                                        status: "add,edit"
                                                    } //表单为新增，修改状态
                                                ]
                                            },
                                            type: 'basDefault'
                                        },
                                        {
                                            title: "產品規格",
                                            key: 'item_desc',
                                            editstatus: {
                                                relation: "and",
                                                filedlist: [{
                                                        field: "formstatus",
                                                        status: "add,edit"
                                                    } //表单为新增，修改状态
                                                ]
                                            },
                                            type: 'basDefault'
                                        },
                                        {
                                            title: "製程代號",
                                            key: 'pro_nbr',
                                            editstatus: {
                                                relation: "and",
                                                filedlist: [{
                                                        field: "formstatus",
                                                        status: "add,edit"
                                                    } //表单为新增，修改状态
                                                ]
                                            },
                                            type: 'basLov',
                                            lovtype: 'get_pro'
                                        },
                                        {
                                            title: "單位",
                                            key: 'unit',
                                            editstatus: {
                                                relation: "and",
                                                filedlist: [{
                                                        field: "formstatus",
                                                        status: "add,edit"
                                                    } //表单为新增，修改状态
                                                ]
                                            },
                                            type: 'basDefault'
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
                                            type: 'basLov',
                                            lovtype: 'get_war'
                                        },
                                        {
                                            title: "數量",
                                            key: 'qty',
                                            editstatus: {
                                                relation: "and",
                                                filedlist: [{
                                                        field: "formstatus",
                                                        status: "add,edit"
                                                    } //表单为新增，修改状态
                                                ]
                                            },
                                            type: 'basDefault'
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
                                            type: 'basDefault'
                                        }
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
                            url: "sub/subbah/" + scope.model.uid,
                            mockUrl: "plugins/data/mape4.detail.json"
                        }).then(function (res) {
                            toastr.info("数据删除成功!!!");
                            scope.uid = "";
                            scope.action.add();
                            scope.refreshtab("refreshsubbah", {});

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
                            url: "sub/subbah/" + scope.uid,
                            mockUrl: "plugins/data/mape4.detail.json"
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
                        url: "sub/subbah",
                        mockUrl: "plugins/data/mape4.detail.json",
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
                        scope.refreshtab("refreshsubbah", {});

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
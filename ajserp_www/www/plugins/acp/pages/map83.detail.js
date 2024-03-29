define(function () {
    angular.module('app').controller('acp.map83.detail',
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
                                "title": "付款單代號",
                                "type": "String"
                            }
                        }
                    },
                    form: [{
                        type: "group",
                        title: "",
                        items: [
                            {
                                title: "付款單號",
                                readonly:true,
                                key: 'nbr',
                                type: 'basString',
                            },
                            {
                                title: "付款日期",
                                key: 'date',
                                type: 'basEsydatetime',
                            },
                            {
                                title: "廠商代號",
                                key: 'ven_nbr',
                                relationfield: [{
                                    findfield: "ven_name",
                                    tofield: "ven_name"
                                }, ],
                                additionalField: {
                                    key: "ven_name",
                                    readonly: true,
                                    type: "basString"
                                },
                                nameField: "ven_name",
                                type: 'basLov',
                                lovtype: 'get_ven',
                            },
                            {
                                title: "结帳月份",
                                key: 'acr_mon',
                                type: "basEsydatetime",
                                format: "YYYYMM"
                            },
                            {
                                title: "本月應收",
                                key: 'tot_acr',
                                type: 'basNumber',
                            },
                            {
                                title: "計入預收金額",
                                key: 'pre_amt',
                                type: 'basNumber',
                            },
                            {
                                title: "累計應收餘額",
                                key: 'aft_amt',
                                type: 'basNumber',
                            },

                            {
                                title: "可用沖款之金額",
                                key: 'tot_amt',
                                type: 'basNumber',
                            },
                            {
                                title: "代扣稅額",
                                key: 'tax_amt',
                                type: 'basNumber',
                            },
                            {
                                title: "實際沖款金額",
                                key: 'wait_amt',
                                type: 'basNumber',
                            },
                            {
                                title: "匯費、郵資",
                                key: 'other_amt',
                                type: 'basNumber',
                            },
                        ]
                    },
                    {
                        type: "group",
                        title: "",
                        css: "max-1",
                        items: [{
                                title: "現金金額",
                                key: 'cash_amt',
                                type: 'basNumber',
                            }, {
                                title: "票據金額",
                                key: 'chk_amt',
                                type: 'basNumber',
                            }, {
                                title: "折讓金額",
                                key: 'cut_amt',
                                type: 'basNumber',
                            }, {
                                title: "其他金額",
                                key: 'other_amt',
                                type: 'basNumber',
                            }, {
                                title: "抵扣金額",
                                key: 'other_amt',
                                type: 'basNumber',
                            },
                            {
                                title: "狀態",
                                key: 'status',
                                readonly: true,
                                titleMap: [{
                                        value: "10",
                                        name: "【未審核】"
                                    },
                                    {
                                        value: "30",
                                        name: "【已審核】"
                                    }
                                ],
                                type: 'basStatus'
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
                                title: "明細",
                                items: [{
                                    key: 'acpbats',
                                    type: "basEditgrid",
                                    gridkey: "acr.map73.detail",
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
                                                scope.model.acpbats.push(item);
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
                                            //列表刪除後更新金額
                                            click: function (item) {
                                                item.isdel = true;
                                                //scope.model.acpbats.splice();
                                            }
                                        }
                                    },
                                    headers: {
                                        "status": {
                                            displayName: "科目",
                                            type: 'basstring',
                                            width: 110
                                        },
                                        "desc": {
                                            displayName: "說明",
                                            type: 'basstring',
                                            width: 110
                                        },
                                        "ar_amt":{
                                            displayName: "金額",
                                            type: 'basNumber',
                                            width: 110
                                        },
                                        "chk_date": {
                                            displayName: "票據到期日",
                                            type: 'basEsydatetime',
                                            width: 110
                                        },
                                        "chk_nbr": {
                                            displayName: "票據號碼",
                                            type: 'basstring',
                                            width: 110
                                        },
                                        "remark": {
                                            displayName: "摘要",
                                            type: 'basstring',
                                            width: 110
                                        },
                                        "b_nbr": {
                                            displayName: "銀行",
                                            readonlystatus: {
                                                relation: "and",
                                                filedlist: [{
                                                        field: "formstatus",
                                                        status: "view"
                                                    }, //表单新增状态
                                                ]
                                            },
                                            relationfield: [{
                                                findfield: "b_name",
                                                tofield: "b_name"
                                            }],
                                            additionalField: {
                                                key: "b_name",
                                                readonly: true,
                                                type: "basString"
                                            },
                                            type: 'basLov',
                                            lovtype: 'get_bank',
                                            width: 110
                                        },
                                        "b_name": {
                                            displayName: "銀行名稱",
                                            readonly:true,
                                            type: 'basDefault',
                                            width: 110
                                        },
                                        "pay_bank": {
                                            displayName: "付款行庫",
                                            type: 'basstring',
                                            width: 110
                                        }
                                    }
                                }]
                            },
                            //下面为页签B
                            {
                                title: "沖款",
                                items: [{
                                    key: 'acpdiss',
                                    type: "basEditgrid",
                                    gridkey: "acr.map73.detail",
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
                                                scope.model.acpdiss.push(item);
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
                                            //列表刪除後更新金額
                                            click: function (item) {
                                                item.isdel = true;
                                                //scope.model.acpdiss.splice();
                                                scope.counttot_amt();
                                            }
                                        }
                                    },
                                    headers: {
                                        "nbr": {
                                            displayName: "單據號碼",
                                            type: 'basstring',
                                            width: 110
                                        },
                                        "io_p": {
                                            displayName: "進退",
                                            type: 'basstring',
                                            width: 110
                                        },
                                        "nbrdate":{
                                            displayName: "日期",
                                            type: 'basEsydateyime',
                                            width: 110
                                        },
                                        "tot_amt": {
                                            displayName: "可沖金額",
                                            type: 'basNumber',
                                            width: 110
                                        },
                                        "wait_amt": {
                                            displayName: "實沖金額",
                                            type: 'basNumber',
                                            width: 110
                                        },
                                    }
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
                            url: "acp/acpbah/" + scope.model.uid,
                            mockUrl: "plugins/data/map83.detail.json"
                        }).then(function (res) {
                            toastr.info("数据删除成功!!!");
                            scope.uid = "";
                            scope.action.add();
                            scope.refreshtab("refreshacpbah", {});

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
                            url: "acp/acpbah/" + scope.uid,
                            mockUrl: "plugins/data/map83.detail.json"
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
                        url: "acp/acpbah",
                        mockUrl: "plugins/data/map83.detail.json",
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
                        scope.refreshtab("refreshacpbah", {});

                    }, function (error) {
                        $timeout(function () {
                            scope.model.formstatus = bakstatus
                        }, 100);

                    });
                }
            };
            scope.counttot_amt = function () {
                let tot_amt = 0;
                scope.model.acpdiss.forEach(function (item) {
                    if (!item.isdel) {
                        tot_amt = tot_amt + (item.amt ? item.amt : 0);
                        // rec_amt = rec_amt + (item.rec_amt ? item.rec_amt:0);
                    }
                }, this);
                // scope.model.tot_amt = rec_amt;
                scope.model.amt = tot_amt;
            };
            scope.action.load();
        });

});
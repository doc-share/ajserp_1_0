define(function () {
    angular.module('app').controller('rec.map5a.detail',
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
                                "title": "單據編號",
                                "type": "string"
                            },
                            "nbrdate": {
                                "title": "調價日期",
                                "type": "string"
                            },
                            "chk_type": {
                                "title": "調整類號",
                                "type": "string"
                            },
                            "ven_nbr": {
                                "title": "廠商代號",
                                "type": "string"
                            },
                            "chk_proc": {
                                "title": "調整方式",
                                "type": "string"
                            },
                            "chk_ratio": {
                                "title": "比率 %",
                                "type": "number"
                            },
                            "item_nbrf": {
                                "title": "產品代號(起)",
                                "type": "string"
                            },
                            "item_nbrt": {
                                "title": "產品代號(迄)",
                                "type": "string"
                            },
                            "pri_pict": {
                                "title": "單價小數位數",
                                "type": "String"
                            },
                            "remark": {
                                "title": "備註",
                                "type": "string"
                            },
                            "item_nbr": {
                                "title": "產品編號",
                                "type": "string"
                            },
                            "item_name": {
                                "title": "產品名稱",
                                "type": "string"
                            },
                            "item_desc": {
                                "title": "規格說明",
                                "type": "String"
                            },
                            "chk_item": {
                                "title": "廠商產品編號",
                                "type": "string"
                            },
                            "unit": {
                                "title": "單位",
                                "type": "string"
                            },
                            "coin_nbr": {
                                "title": "幣別",
                                "type": "string"
                            },
                            "old_price": {
                                "title": "原單價",
                                "type": "number"
                            },
                            "price": {
                                "title": "新單價",
                                "type": "number"
                            },
                            "remark": {
                                "title": "備註",
                                "type": "string"
                            }
                        }
                    },
                    form: [{
                            type: "group",
                            title: "基本訊息",
                            items: [
                                {
                                    title: "單據編號",
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
                                    title: "調價日期",
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
                                    title: "調整類別",
                                    key: 'chk_type',
                                    editstatus: {
                                        relation: "and",
                                        filedlist: [{
                                                field: "formstatus",
                                                status: "add,edit"
                                            } //表单为新增，修改状态
                                        ]
                                    },
                                    type: "basRadiosinline",
                                    titleMap:[
                                        {value:"1",name:"依產品"},
                                        {value:"2",name:"依類別"},
                                    ],
                                },
                                {
                                    title: "廠商代號",
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
                                    title: "調整方式",
                                    key: 'chk_proc',
                                    editstatus: {
                                        relation: "and",
                                        filedlist: [{
                                                field: "formstatus",
                                                status: "add,edit"
                                            } //表单为新增，修改状态
                                        ]
                                    },
                                    type: "basRadiosinline",
                                    titleMap:[
                                        {value:"1",name:"調升"},
                                        {value:"2",name:"調降"},
                                    ],
                                },
                                {
                                    title: "比率 %",
                                    key: 'chk_ratio',
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
                                    title: "產品代號(起)",
                                    key: 'item_nbrf',
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
                                    title: "產品代號(迄)",
                                    key: 'item_nbrt',
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
                                    title: "單價小數位數",
                                    key: 'pri_pict',
                                    placeholder:"※調價時單價四捨五入位數",
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
                                    type: 'basDefault',
                                    css:"cell2"
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
                            key: 'venchkbats',
                            type: "basEditgrid",
                            gridkey: "rec.map5a.detail",
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
                                        scope.model.venchkbats.push(item);
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
                                "item_name": {
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
                                "item_desc": {
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
                                "chk_item": {
                                    displayName: "廠商產品代號",
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
                                "coin_nbr": {
                                    displayName: "幣別",
                                    readonlystatus: {
                                        relation: "and",
                                        filedlist: [{
                                                field: "formstatus",
                                                status: "view"
                                            }, //表单新增状态
                                        ]
                                    },
                                    type: 'basLov',
                                    lovtype: 'get_coin',
                                    width: 110
                                },
                                "old_price": {
                                    displayName: "原單價",
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
                                "price": {
                                    displayName: "新單價",
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
                            url: "pur/venchkbah/" + scope.model.uid,
                            mockUrl: "plugins/data/map5a.detail.json"
                        }).then(function (res) {
                            toastr.info("数据删除成功!!!");
                            scope.uid = "";
                            scope.action.add();
                            scope.refreshtab("refreshvenchkbah", {});

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
                            url: "pur/venchkbah/" + scope.uid,
                            mockUrl: "plugins/data/map5a.detail.json"
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
                        url: "pur/venchkbah",
                        mockUrl: "plugins/data/map5a.detail.json",
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
                        scope.refreshtab("refreshvenchkbah", {});

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
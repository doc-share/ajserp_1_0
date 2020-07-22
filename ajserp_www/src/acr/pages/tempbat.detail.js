define(function() {
    angular.module('app').controller('acr.tempbat.detail',
        function($rootScope, $scope, $location, utils, path, getSingleView, settings,
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
                        action: function(event, form) {
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
                        action: function(event, form) {
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
                        action: function(event, form) {
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
                        action: function(event, form) {
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
                        action: function(event, form) {
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
                        action: function(event, form) {
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
                            "nbr": {
                                "title": "合約編號",
                                "type": "string"
                            },
                            "temp_nbr": {
                                "title": "項目編號",
                                "type": "string"
                            },
                            "temp_desc": {
                                "title": "內容",
                                "type": "string"
                            },
                            "amt": {
                                "title": "金額",
                                "type": "number"
                            },
                            "acr_mon": {
                                "title": "請款月份",
                                "type": "string"
                            },
                            "status": {
                                "title": "狀態",
                                "type": "string"
                            }
                        }
                    },
                    form: [{
                            type: "group",
                            title: "",
                            items: [{
                                    title: "客戶編號",
                                    key: 'cus_nbr',
                                    editstatus: {
                                        relation: "and",
                                        filedlist: [{
                                                field: "formstatus",
                                                status: "add,edit"
                                            } //表单为新增，修改状态
                                        ]
                                    },
                                    onchange: function() {
                                        scope.action.getbat();

                                    },
                                    type: 'basLov',
                                    lovtype: 'getcus'
                                },
                                // {  //虛擬欄位
                                //     title: "客戶名稱",
                                //     key: 'cus_name',
                                //     editstatus: {
                                //         relation: "and",
                                //         filedlist: [{
                                //                 field: "formstatus",
                                //                 status: "add,edit"
                                //             } //表单为新增，修改状态
                                //         ]
                                //     },
                                //     type: 'basLov',
                                //     lovtype: 'getcus'
                                // },
                                {
                                    title: "合約編號",
                                    key: 'nbr',
                                    // readonly:true,
                                    type: 'basLov',
                                    onchange: function() {
                                        scope.action.getbat();

                                    },
                                    lovtype: 'getcontract'
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
                            key: 'tempbats',
                            type: "basEditgrid",
                            gridkey: "acr.tempbats.detail",
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
                                    click: function() {
                                        var item = {
                                            isdel: false
                                        }
                                        scope.model.tempbats.push(item);
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
                                    click: function(item) {
                                        item.isdel = true;
                                    }
                                }
                            },
                            headers: {
                                "temp_nbr": {
                                    displayName: "項目編號",
                                    readonlystatus: {
                                        relation: "and",
                                        filedlist: [{
                                                field: "formstatus",
                                                status: "view"
                                            }, //表单新增状态
                                        ]
                                    },
                                    type: 'basLov',
                                    lovtype: 'gettemp',
                                    width: 110
                                },
                                "temp_desc": {
                                    displayName: "代墊內容",
                                    readonlystatus: {
                                        relation: "and",
                                        filedlist: [{
                                                field: "formstatus",
                                                status: "view"
                                            }, //表单新增状态
                                        ]
                                    },
                                    type: 'basLov',
                                    lovtype: 'gettemp',
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
                                "acr_mon": {
                                    displayName: "請款月份",
                                    readonlystatus: {
                                        relation: "and",
                                        filedlist: [{
                                                field: "formstatus",
                                                status: "view"
                                            }, //表单新增状态
                                        ]
                                    },
                                    type: 'basEsydatetime',
                                    format: "YYYYMM",
                                    width: 110
                                },
                                "status": {
                                    displayName: "狀態",
                                    readonlystatus: {
                                        relation: "and",
                                        filedlist: [{
                                                field: "formstatus",
                                                status: "view"
                                            }, //表单新增状态
                                        ]
                                    },
                                    type: 'basLov',
                                    lovtype: 'select',
                                    titleMap: [
                                        { value: "1", name: "已付" },
                                        { value: "2", name: "未付" },
                                    ],
                                    width: 110
                                }
                            }

                        }


                    ]
                }
            };
            scope.action = {
                add: function(event) {
                    $scope.$broadcast('schemaFormRedraw');
                    scope.model = {
                        formstatus: "add" //edit,view
                    }
                },
                edit: function() {
                    scope.model.formstatus = "edit"
                    $scope.$broadcast('schemaFormRedraw');
                },
                del: function() {
                    dialog.confirm('确定删除当前数据?').then(function() {
                        scope.promise = utils.ajax({
                            method: 'DELETE',
                            url: "acr/tempbat/" + scope.model.uid,
                            mockUrl: "plugins/data/tempbat.detail.json"
                        }).then(function(res) {
                            toastr.info("数据删除成功!!!");
                            scope.uid = "";
                            scope.action.add();
                            scope.refreshtab("refreshtempbat", {});

                        });
                    });
                },
                undo: function() {
                    if (scope.model.formstatus == "add") {
                        scope.model = angular.copy(scope.bakmodel);
                    } else {
                        scope.model = angular.copy(scope.bakmodel);
                        scope.$broadcast("GridRedraw");
                    }
                    scope.model.formstatus = "view";
                },
                getbat: function() {
                    if (!scope.model.cus_nbr || !scope.model.nbr) {
                        return;
                    }
                    var para = {
                        cus_nbr: scope.model.cus_nbr,
                        nbr: scope.model.nbr
                    }
                    scope.promise = utils.ajax({
                        method: "POST",
                        url: "acr/tempbat/getbat",
                        mockUrl: "plugins/data/tempbat.detail.json",
                        data: para
                    }).then(function(res) {
                        var tempbats = res.data.body;
                        tempbats.forEach(element => {
                            scope.model.tempbats.push(element);
                        });
                    });
                },
                load: function() {
                    if (scope.uid) {
                        scope.promise = utils.ajax({
                            method: 'GET',
                            url: "acr/tempbat/" + scope.uid,
                            mockUrl: "plugins/data/tempbat.detail.json"
                        }).then(function(res) {
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
                save: function(event, form) {
                    console.log(scope.model);
                    var tempbats = scope.model.tempbats;
                    tempbats.forEach(element => {
                        element.cus_nbr = scope.model.cus_nbr;
                        element.nbr = scope.model.nbr;
                    });
                    console.log(tempbats);

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
                        url: "acr/tempbat",
                        mockUrl: "plugins/data/tempbat.detail.json",
                        data: scope.model
                    }).then(function(res) {
                        scope.uid = res.data.body.uid
                        if (type == "add") {
                            toastr.info("新增成功！");
                        } else {
                            toastr.info("修改成功！");
                        }
                        scope.action.load();
                        $scope.$broadcast('schemaFormRedraw');
                        scope.refreshtab("refreshtempbat", {});

                    }, function(error) {
                        $timeout(function() {
                            scope.model.formstatus = bakstatus
                        }, 100);

                    });
                }
            };
            scope.action.load();
        });

});
define(function() {
    angular.module('app').controller('bas.mapsalt.detail',
        function($rootScope, $scope, $location, utils, path, getSingleView, settings,
            $timeout, dialog, toastr, ngDialog, uiGridConstants, qwsys,sysconstant) {
            var scope = $scope;
            scope.uid = "";
            if ($rootScope.uid) {
                scope.uid = $rootScope.uid;
                $rootScope.uid = "";
            };
            scope.model = {
                formstatus: "add" //edit,view
            };
            scope.promise=null;
            scope.detailUrl = "plugins/bas/templates/detail.html";
            scope.config = {
                listoperation: {
                    add: {
                        name: "新增",
                        icon: "fa-plus",
                        readonlystatus: {
                            relation: "and",
                            filedlist: [
                                { field: "formstatus", status: "add,edit,read" } //表单新增状态
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
                            filedlist: [
                                { field: "formstatus", status: "add,edit" }, //表单为新增，修改状态
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
                            filedlist: [
                                { field: "formstatus", status: "add,edit" }, //表单为新增，修改状态
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
                            filedlist: [
                                { field: "formstatus", status: "view" } //查询状态                              
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
                            filedlist: [
                                { field: "formstatus", status: "view" } //表单查询状态                             
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
                            filedlist: [
                                { field: "formstatus", status: "view" }, //表单为新增，修改状态
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
                            "emp_nbr": {
                                "title": "員工編號",
                                "type": "String"
                            }
                     ,
                            "emp_name": {
                                "title": "中文姓名",
                                "type": "String"
                            }
                     ,
                            "birth_date": {
                                "title": "出生年月日",
                                "type": "Date"
                            }
                     ,
                            "id_code": {
                                "title": "身份證字號",
                                "type": "String"
                            }
                     ,
                            "native_addr": {
                                "title": "籍貫",
                                "type": "String"
                            }
                     ,
                            "tel_no": {
                                "title": "電話號碼",
                                "type": "String"
                            }
                     ,
                            "bbc_no": {
                                "title": "B.B. Call",
                                "type": "String"
                            }
                     ,
                            "alarm_name": {
                                "title": "緊急連絡人",
                                "type": "String"
                            }
                     ,
                            "address1": {
                                "title": "戶籍所在地",
                                "type": "String"
                            }
                     ,
                            "address2": {
                                "title": "通訊地址",
                                "type": "String"
                            }
                     ,
                            "empl_date": {
                                "title": "到職日期",
                                "type": "Date"
                            }
                     ,
                            "ins_eff": {
                                "title": "勞保生效日期",
                                "type": "Date"
                            }
                     ,
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
                                title: "員工編號",
                                key: 'emp_nbr',
                                editstatus: {
                                    relation: "and",
                                    filedlist: [
                                        { field: "formstatus", status: "add,edit" } //表单为新增，修改状态
                                    ]
                                },
                                type: 'basDefault',
                                lovtype: ''
                            }
                     ,
                           {
                                title: "中文姓名",
                                key: 'emp_name',
                                editstatus: {
                                    relation: "and",
                                    filedlist: [
                                        { field: "formstatus", status: "add,edit" } //表单为新增，修改状态
                                    ]
                                },
                                type: 'basDefault',
                                lovtype: ''
                            }
                     ,
                           {
                                title: "出生年月日",
                                key: 'birth_date',
                                editstatus: {
                                    relation: "and",
                                    filedlist: [
                                        { field: "formstatus", status: "add,edit" } //表单为新增，修改状态
                                    ]
                                },
                                type: 'basEsydatetime',
                                lovtype: ''
                            }
                     ,
                           {
                                title: "身份證字號",
                                key: 'id_code',
                                editstatus: {
                                    relation: "and",
                                    filedlist: [
                                        { field: "formstatus", status: "add,edit" } //表单为新增，修改状态
                                    ]
                                },
                                type: 'basDefault',
                                lovtype: ''
                            }
                     ,
                           {
                                title: "籍貫",
                                key: 'native_addr',
                                editstatus: {
                                    relation: "and",
                                    filedlist: [
                                        { field: "formstatus", status: "add,edit" } //表单为新增，修改状态
                                    ]
                                },
                                type: 'basDefault',
                                lovtype: ''
                            }
                     ,
                           {
                                title: "電話號碼",
                                key: 'tel_no',
                                editstatus: {
                                    relation: "and",
                                    filedlist: [
                                        { field: "formstatus", status: "add,edit" } //表单为新增，修改状态
                                    ]
                                },
                                type: 'basDefault',
                                lovtype: ''
                            }
                     ,
                           {
                                title: "B.B. Call",
                                key: 'bbc_no',
                                editstatus: {
                                    relation: "and",
                                    filedlist: [
                                        { field: "formstatus", status: "add,edit" } //表单为新增，修改状态
                                    ]
                                },
                                type: 'basDefault',
                                lovtype: ''
                            }
                     ,
                           {
                                title: "緊急連絡人",
                                key: 'alarm_name',
                                editstatus: {
                                    relation: "and",
                                    filedlist: [
                                        { field: "formstatus", status: "add,edit" } //表单为新增，修改状态
                                    ]
                                },
                                type: 'basDefault',
                                lovtype: ''
                            }
                     ,
                           {
                                title: "戶籍所在地",
                                key: 'address1',
                                editstatus: {
                                    relation: "and",
                                    filedlist: [
                                        { field: "formstatus", status: "add,edit" } //表单为新增，修改状态
                                    ]
                                },
                                type: 'basDefault',
                                lovtype: ''
                            }
                     ,
                           {
                                title: "通訊地址",
                                key: 'address2',
                                editstatus: {
                                    relation: "and",
                                    filedlist: [
                                        { field: "formstatus", status: "add,edit" } //表单为新增，修改状态
                                    ]
                                },
                                type: 'basDefault',
                                lovtype: ''
                            }
                     ,
                           {
                                title: "到職日期",
                                key: 'empl_date',
                                editstatus: {
                                    relation: "and",
                                    filedlist: [
                                        { field: "formstatus", status: "add,edit" } //表单为新增，修改状态
                                    ]
                                },
                                type: 'basEsydatetime',
                                lovtype: ''
                            }
                     ,
                           {
                                title: "勞保生效日期",
                                key: 'ins_eff',
                                editstatus: {
                                    relation: "and",
                                    filedlist: [
                                        { field: "formstatus", status: "add,edit" } //表单为新增，修改状态
                                    ]
                                },
                                type: 'basEsydatetime',
                                lovtype: ''
                            }
                     ,
                           {
                                title: "備註",
                                key: 'remark',
                                editstatus: {
                                    relation: "and",
                                    filedlist: [
                                        { field: "formstatus", status: "add,edit" } //表单为新增，修改状态
                                    ]
                                },
                                type: 'basTextarea',
                                lovtype: ''
                            }
                        ]
                     }
//下面为分组B
//下面为分组C
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
                        scope.promise=utils.ajax({
                            method: 'DELETE',
                            url: "bas/pnlemp/" + scope.model.uid,
                            mockUrl: "plugins/data/mapsalt.detail.json"
                        }).then(function(res) {
                            toastr.info("数据删除成功!!!");
                            scope.uid = "";
                            scope.action.add();
                            scope.refreshtab("refreshpnlemp", {});

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
                load: function() {
                    if (scope.uid) {
                        scope.promise=utils.ajax({
                            method: 'GET',
                            url: "bas/pnlemp/" + scope.uid,
                            mockUrl: "plugins/data/mapsalt.detail.json"
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
                    scope.promise=utils.ajax({
                        method: "POST",
                        url: "bas/pnlemp",
                        mockUrl: "plugins/data/mapsalt.detail.json",
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
                        scope.refreshtab("refreshpnlemp", {});

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

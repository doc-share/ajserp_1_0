define(function () {
    angular.module('app').controller('mak.mapm1.detail',
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
                            "sale_nbr": {
                                "title": "承辦人",
                                "type": "String"
                            },
                            "plan_date": {
                                "title": "預計完工日",
                                "type": "Date"
                            },
                            "mark_date": {
                                "title": "排程日期",
                                "type": "Date"
                            },
                            "sure_nbr": {
                                "title": "核准人",
                                "type": "String"
                            },
                            "ord_nbr": {
                                "title": "接案單號",
                                "type": "String"
                            },
                            "status": {
                                "title": "狀態",
                                "type": "String"
                            },
                            "ctl": {
                                "title": "核准狀態",
                                "type": "String"
                            },
                            "remark": {
                                "title": "備註",
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
                                    title: "承辦人",
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
                                    title: "預計完工日",
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
                                    title: "排程日期",
                                    key: 'mark_date',
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
                                    title: "核准人",
                                    key: 'sure_nbr',
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
                                        tofield: "sale_name1"  //這裡用sale_name1避免與承辦人衝突
                                    }],
                                    additionalField: {
                                        key: "sale_name1",
                                        readonly: true,
                                        type: "basString"
                                    },
                                    type: 'basLov',
                                    lovtype: 'get_sal'
                                },
                                {
                                    title: "接案單號",
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
                                        {value: "1",name: "本單未結案"},
                                        {value: "2",name: "本單已結案"}
                                    ],
                                },
                                {
                                    title: "核准狀態",
                                    key: 'ctl',
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
                                        {value: "1",name: "未核准"},
                                        {value: "2",name: "已核准"}
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
                                    items: [
                                        {
                                            key: 'makbats',
                                            type: "basEditgrid",
                                            gridkey: "bas.map44.detail",
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
                                                        scope.model.makbats.push(item);
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
                                                        scope.model.makbats.splice();
                                                    }
                                                }
                                            },
                                            headers: {
                                                "ord_nbr": {
                                                    displayName: "接單案號",
                                                    type: "basDefault",
                                                    width: 110
                                                },
                                                "item_nbr": {
                                                    displayName: "產品編號",
                                                    type: 'basDefault',
                                                    width: 110
                                                },
                                                "item_name": {
                                                    displayName: "產品名稱",
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
                                                "plan_date": {
                                                    displayName: "預計完工日",
                                                    type: 'basEsydatetime',
                                                    width: 110
                                                },
                                                "actu_date": {
                                                    displayName: "實際完工日",
                                                    type: 'basEsydatetime',
                                                    width: 110
                                                },
                                                "remark": {
                                                    displayName: "備註",
                                                    type: 'basDefault',
                                                    width: 180
                                                }
                                            }
                                        },
                                    ]
                                } ,
                                //下面为页签B
                                {
                                    title: "用料明細",
                                    items: [
                                        {
                                            key: 'makbat1s',
                                            type: "basEditgrid",
                                            gridkey: "bas.map44.detail",
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
                                                        scope.model.makbat1s.push(item);
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
                                                        scope.model.makbat1s.splice();
                                                    }
                                                }
                                            },
                                            headers: {
                                                "item_nbr": {
                                                    displayName: "貨品編號",
                                                    type: "basDefault",
                                                    width: 110
                                                },
                                                "item_name": {
                                                    displayName: "產品名稱",
                                                    type: 'basDefault',
                                                    width: 110,
                                                },
                                                "seq": {
                                                    displayName: "序號",
                                                    type: 'basDefault',
                                                    width: 110
                                                },
                                                "item_desc": {
                                                    displayName: "規格說明",
                                                    type: 'basDefault',
                                                    width: 110
                                                },
                                                "pro_nbr": {   
                                                    displayName: "製程",
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
                                                "ioqty": {
                                                    displayName: "已領數量",
                                                    type: 'basEsydatetime',
                                                    width: 110
                                                },
                                                "remark": {
                                                    displayName: "備註",
                                                    type: 'basDefault',
                                                    width: 180
                                                },
                                                "mark_date": {
                                                    displayName: "需求日期",
                                                    type: 'basDefault',
                                                    width: 180
                                                }
                                            }
                                        },
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
                        formstatus: "add", //edit,view
                        status:"1",
                        ctl:"1",
                        nbrdate:qwsys.gettoday()
                        
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
                            url: "mak/makbah/" + scope.model.uid,
                            mockUrl: "plugins/data/mapm1.detail.json"
                        }).then(function (res) {
                            toastr.info("数据删除成功!!!");
                            scope.uid = "";
                            scope.action.add();
                            scope.refreshtab("refreshmakbah", {});

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
                            url: "mak/makbah/" + scope.uid,
                            mockUrl: "plugins/data/mapm1.detail.json"
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
                        url: "mak/makbah",
                        mockUrl: "plugins/data/mapm1.detail.json",
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
                        scope.refreshtab("refreshmakbah", {});

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
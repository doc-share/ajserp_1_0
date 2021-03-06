define(['plugins/base/directives/tree.application', 'plugins/base/pages/people.selector'], function() {
    "use strict";
    angular.module('app')
        .controller('app.page.appAuthority', ['$scope', '$rootScope', '$timeout','ngDialog', '$location', '$http', 'utils', 'toastr', 'settings', 'dialog',
            function($scope, $rootScope, $timeout, ngDialog, $location, $http, utils, toastr, settings, dialog) {

				/**
                 * 高度自适应
                 */
                $timeout(function  () {
                	var height = document.documentElement.clientHeight
	    			document.getElementById("con").style.height = height-175+"px"; 
	                document.getElementById("conn").style.height = height-244+"px"; 
                },200);

                $scope.myfilter = function(item) {
                    var val = $scope.memberSearch;
                    if ((val == null) || (val == undefined)) {
                        val = "";
                        return true;
                    }

                    if (item.showType.indexOf(val) != -1 || item.value.indexOf(val) != -1 || item.show.indexOf(val) != -1) {
                        return true
                    }
                };

                var self = $scope;
                self.result = [];
                self.title = "应用权限";

                function loadEnterprise() {
                    if ($rootScope.myEnterprise) {
                        self.showEnterpriseName = $rootScope.myEnterprise.cname;
                        self.selectedEnterprise = $rootScope.myEnterprise;
                        self.enterpriseNode = angular.copy($rootScope.myEnterpriseNode);
                    } else {
                        utils.async("get", "base/enterprise/getenterprises").then(function(res) {
                            res.data.body.Enterprises.forEach(function(item) {
                                if (item.eid == res.data.body.eid) {
                                    $rootScope.myEnterprise = item;
                                    self.showEnterpriseName = item.cname;
                                    self.selectedEnterprise = item;
                                }
                                item.name = item.cname;
                                item.parent = item.pid;
                                item.uid = item.no;
                            });
                            var menus = utils.setIteration("", res.data.body.Enterprises);
                            self.enterpriseNode = { "children": menus, isRoot: true };
                            $rootScope.myEnterpriseNode = angular.copy(self.enterpriseNode);
                        }, function(error) {
                            //toastr.warning(error.message);
                        });
                    }
                }

                loadEnterprise();

                function onEnterpriseChange(enterprise) {
                    if (!enterprise) {
                        enterprise = { eid: "" };
                    }
                    self.current = null;
                    self.appAuthoritys = null;
                    self.peopleMembers = null;
                    utils.async("get", "base/appGroup", { "eid": enterprise.eid, "count": 9999 }).then(function(res) {
                        utils.async("get", "base/appGroupMember", {
                            "eid": enterprise.eid,
                            "count": 9999
                        }).then(function(res2) {
                            res.data.body.items.forEach(function(item) {
                                item.parent = item.pid;
                                item.uid = item.agid;
                            });
                            res2.data.body.items.forEach(function(item) {
                                item.parent = item.agid;
                                item.name = item.show;
                                item.isApp = true;
                            });
                            var menus = utils.setIteration("", res2.data.body.items.concat(res.data.body.items));
                            self.node = { "children": menus, isRoot: true };

                        }, function(error2) {
                            toastr.warning(error2.message);
                        });

                    }, function(error) {
                        //toastr.warning(error.message);
                    });
                }

                onEnterpriseChange();

                var filter = self.filter = {
                    "start": 0,
                    "count": 999
                };

                var typeMap = {
                    "A": "账号",
                    "AT": "账号类型",
                    "E": "企业",
                    "ET": "企业类型",
                    "O": "组织",
                    "PN": "职务",
                    "PT": "岗位",
                    "P": "人员",
                    "G": "群组"
                };

                function loadDetail() {
                    filter["aid$eq"] = self.current.appid;
                    if (self.selectedEnterprise) {
                        filter.eid = self.selectedEnterprise.eid;
                    }
                    utils.async("get", "base/appAuthority", filter).then(function(res) {
                        self.appAuthoritys = res.data.body.items;
                        self.appAuthoritys.forEach(function(item) {
                            item.showType = typeMap[item.type];
                        });
                    }, function(error) {
                        //toastr.warning(error.message);
                    });
                }

                self.nowPage2 = 1;
                self.sumPage2 = 1;
                self.filter2 = {
                    "start": 0,
                    "count": 17
                };

                function loadDetailPeople() {
                    self.filter2.start = (self.nowPage2 - 1) * self.filter2.count;
                    if (self.selectedEnterprise) {
                        self.filter2.eid = self.selectedEnterprise.eid;
                    }
                    self.filter2["aid$eq"] = self.current.appid;
                    utils.async("get", "base/appAuthority/people", self.filter2).then(function(res) {
                        var count = res.data.body.count;
                        self.peopleMembers = res.data.body.items;
                        self.sumPage2 = Math.floor((count - 1) / self.filter2.count) + 1;
                        if (self.sumPage2 == 0) {
                            self.sumPage2 = 1;
                        }
                        if (self.sumPage2 < self.nowPage2) {
                            self.action.prevPage2();
                        }
                    }, function(error) {});
                }


                //打开组织树
                self.openOrgTree = function(addtype, theScope) {
                    ngDialog.open({
                        template: 'plugins/base/pages/tree.selector.html',
                        controller: function($scope) {
                                var me = $scope;
                                var eid = self.selectedEnterprise ? self.selectedEnterprise.eid : "";
                                me.showtype = true;
                                me.showGroupOrg = true;
                                //加载组织类型 
                                function loadorytypes() {
                                    utils.async("get", "base/organization/getroots", {
                                        "eid": eid
                                    }).then(function(res) {
                                        var types = [];
                                        res.data.body.forEach(function(item) {
                                            types.push({
                                                "name": item.name,
                                                "value": item.value
                                            });
                                        });
                                        me.types = types;
                                        if (me.types.length > 0)
                                            me.orgType = me.types[0].value;
                                        else
                                            me.orgType = '';
                                        me.action.orgtypechanged();
                                    }, function(error) {
                                        //toastr.warning(error.message);
                                    });
                                }

                                var getSelecteds = function(tree, selecteds) {
                                    angular.forEach(tree, function(node) {
                                        if (node.selected) {
                                            selecteds.push(node);
                                        }
                                        if (node.children) {
                                            getSelecteds(node.children, selecteds);
                                        }
                                    });
                                };

                                //加载所有的组织
                                function loadallorgs() {
                                    utils.async("get", "base/organization", {
                                        "eid": eid,
                                        "enable$eq": true,
                                        "count": 9999
                                    }).then(function(res) {
                                        res.data.body.items.forEach(function(item) {
                                            item.ttype = item.type;
                                            item.tuid = item.uid;
                                            item.parent = item.pid; //父节点id
                                            item.uid = item.oid; //本身id
                                        });
                                        me.tempitems = angular.copy(res.data.body.items); //备份整理
                                        loadorytypes();
                                    }, function(error) {
                                        //toastr.warning(error.message);
                                    });
                                }
                                loadallorgs();

                                $scope.title = "选择组织";
                                $scope.multiple = false;
                                $scope.showConfirm = true;

                                $scope.action = {
                                    onSelect: function(organization) {
                                        //
                                    },
                                    confirm: function() {
                                        var selecteds = [];
                                        getSelecteds(me.node.children, selecteds);
                                        var ids = [],
                                            names = [],
                                            showids = [],
                                            selectedOrg = null;
                                        selecteds.forEach(function(en) {
                                            if (en.oid && en.name) {
                                                ids.push(en.buid);
                                                names.push(en.name);
                                                showids.push(en.showid);
                                                selectedOrg = en;
                                            }
                                        });
                                        if (ids.length) {
                                            if (addtype == "O") { //选择组织
                                               utils.async("post", "base/appAuthority", {
                                                    "eid": self.selectedEnterprise.eid,
                                                    "aid": self.current.appid,
                                                    "type": "O",
                                                    "value": ids.toString(),
                                                    "showid": showids.toString(),
                                                    "show": names.toString()
                                                }).then(function(res) {
                                                    loadDetail();
                                                    loadDetailPeople();
                                                    ngDialog.closeAll();
                                                }, function(error) {
                                                    //toastr.warning(error.message);
                                                });
                                            } else if (addtype == "PT" || addtype == "PN") { //职务，岗位
                                                theScope.result.organization = selectedOrg;
                                                theScope.action.onDetailOrganizationChange();
                                            }
                                            me.closeThisDialog();
                                        } else {
                                            toastr.warning("请选择组织");
                                        }
                                    },
                                    close: function() {
                                        me.closeThisDialog();
                                    },
                                    orgtypechanged: function(context) {
                                        context = context || { showGroupOrg: true };
                                        var type = me.orgType;
                                        if (context.orgType != undefined)
                                            type = context.orgType;
                                        var items = angular.copy(me.tempitems);
                                        var newitems = [];

                                        //过滤                     
                                        if (type != undefined && type != null && type != '') {
                                            items.forEach(function(item) {
                                                var ttype = item.ttype + ",";
                                                if ((ttype.indexOf(type) > -1))
                                                    newitems.push(item);
                                            });
                                        } else {
                                            newitems = angular.copy(items);
                                        }

                                        //过滤后重组树 
                                        function getParentId(node) {
                                            var result = "";
                                            if (node.parent == '')
                                                return result;
                                            var vitems = angular.copy(newitems);
                                            vitems.forEach(function(item) {
                                                if (item.uid == node.parent) {
                                                    if (!item.isGroup) {
                                                        result = item.uid;
                                                        return result;
                                                    } else {
                                                        getParentId(item.uid);
                                                    }
                                                }
                                            });
                                            return result;
                                        }

                                        function setChildrenPid(node) {
                                            var pid = node.uid;
                                            newitems.forEach(function(item) {
                                                if (item.parent == pid) {
                                                    item.parent = node.vuid;
                                                }
                                            });
                                        }

                                        if (!context.showGroupOrg) {
                                            for (var i = 0; i < newitems.length; i++) {
                                                var item = newitems[i];
                                                if (item.isGroup) {
                                                    item.deleted = true;
                                                    var pid = getParentId(item);
                                                    item.vuid = pid;
                                                    setChildrenPid(item);
                                                } else {
                                                    item.deleted = false;
                                                }
                                            }
                                        }

                                        var realitems = [];
                                        newitems.forEach(function(item) {
                                            if (!item.deleted) {
                                                realitems.push(item);
                                            }
                                        });

                                        //构造树  
                                        var menus = utils.setIteration("", realitems);
                                        realitems.forEach(function(item) {
                                            item.uid = item.tuid;
                                            item.type = item.ttype;
                                        });

                                        items.forEach(function(item) {
                                            item.uid = item.tuid;
                                            item.type = item.ttype;
                                        });
                                        me.node = { "children": menus, isRoot: true };
                                    }
                                }
                            } //controller
                    });
                }

                self.action = {
                    changeEnterprise: function() {
                        ngDialog.open({
                            template: 'plugins/base/pages/tree.selector.html',
                            controller: function($scope) {
                                $scope.title = "企业列表";
                                $scope.node = self.enterpriseNode;
                                $scope.action = {
                                    onSelect: function(enterprise) {
                                        if (enterprise.eid != self.selectedEnterprise.eid) {
                                            self.selectedEnterprise = enterprise;
                                            self.showEnterpriseName = enterprise.cname;
                                            onEnterpriseChange(enterprise);
                                        }
                                        $scope.closeThisDialog();
                                    }
                                }
                            }
                        });
                    },
                    addmember: function(type) {
                        if (!self.current) {
                            toastr.warning("请选择应用!");
                            return;
                        }
                        if (type == "A") {
                            ngDialog.open({
                                template: "plugins/base/pages/selector.html",
                                className: "ngdialog-theme-default ngdialog-theme-custom my-selector-dialog",
                                controller: function($scope, $translate) {
                                    $scope.current = {
                                        "name": "base",
                                        "page": "account"
                                    };
                                    $scope.config = {
                                        operations: {
                                            'confirm': {
                                                icon: "fa-save",
                                                name: "确认",
                                                action: function() {
                                                    var rows = $scope.gridApi.selection.getSelectedRows() || [];
                                                    if (rows.length < 1) {
                                                        toastr.warning("请选择要添加的账号");
                                                        return;
                                                    } else {
                                                        var ids = [],
                                                            names = [];
                                                        rows.forEach(function(en) {
                                                            if (en.aid && en.name) {
                                                                ids.push(en.aid);
                                                                names.push(en.name);
                                                            }
                                                        });
                                                        utils.async("post", "base/appAuthority", {
                                                            "eid": self.selectedEnterprise.eid,
                                                            "aid": self.current.appid,
                                                            "value": ids.toString(),
                                                            "show": names.toString(),
                                                            "showid": ids.toString(),
                                                            "type": "A"
                                                        }).then(function(res) {
                                                            loadDetail();
                                                            loadDetailPeople();
                                                            ngDialog.closeAll();
                                                        }, function(error) {
                                                            //toastr.warning(error.message);
                                                        });
                                                    }
                                                }
                                            }
                                        },
                                        filters: [{
                                            type: "input",
                                            name: "name$match",
                                            label: "名称"
                                        }, {
                                            type: "input",
                                            name: "aid$match",
                                            label: "账号"
                                        }, {
                                            type: "select",
                                            name: "enable$eq",
                                            label: "状态",
                                            titleMap: [{
                                                value: '1',
                                                name: "已启用"
                                            }, {
                                                value: '0',
                                                name: "未启用"
                                            }]
                                        }],
                                        headers: {
                                            "name": {
                                                displayName: "名称",
                                                minWidth: 100
                                            },
                                            "aid": {
                                                displayName: "账号",
                                                minWidth: 70
                                            },
                                            "mail": {
                                                displayName: "电子邮箱",
                                                minWidth: 150
                                            },
                                            "enable": {
                                                displayName: "已启用",
                                                width: 70,
                                                cellTemplate: "<div class='ui-grid-cell-contents'>{{row.entity.enable?'已启用':'未启用' | translate}}</div>"
                                            }
                                        }
                                    };
                                }
                            });
                        } else if (type == "E") {
                            ngDialog.open({
                                template: "plugins/base/pages/selector.html",
                                className: "ngdialog-theme-default ngdialog-theme-custom my-selector-dialog",
                                controller: function($scope, $translate) {
                                    $scope.current = {
                                        "specialUrl": "base/enterprise/getchildren",
                                        "param": {
//                                            "pid": self.selectedEnterprise.no,
//                                            "enable$eq": true
                                            "enable$eq": true,
                                            "eid$match": self.selectedEnterprise.eid,
                                            "includeeid":true
                                        }
                                    };
                                    $scope.config = {
                                        operations: {
                                            'confirm': {
                                                icon: "fa-save",
                                                name: "确认",
                                                action: function() {
                                                    var rows = $scope.gridApi.selection.getSelectedRows() || [];
                                                    if (rows.length < 1) {
                                                        toastr.warning("请选择要添加的企业");
                                                        return;
                                                    } else {
                                                        var ids = [],
                                                            names = [];
                                                        rows.forEach(function(en) {
                                                            if (en.no && en.cname) {
                                                                ids.push(en.no);
                                                                names.push(en.cname);
                                                            }
                                                        });
                                                        utils.async("post", "base/appAuthority", {
                                                            "eid": self.selectedEnterprise.eid,
                                                            "type": "E",
                                                            "value": ids.toString(),
                                                            "show": names.toString(),
                                                            "showid": ids.toString(),
                                                            "aid": self.current.appid
                                                        }).then(function(res) {
                                                            loadDetail();
                                                            loadDetailPeople();
                                                            ngDialog.closeAll();
                                                        }, function(error) {
                                                            //toastr.warning(error.message);
                                                        });
                                                    }
                                                }
                                            }
                                        },
                                        filters: [{
                                            type: "input",
                                            name: "cname$match",
                                            label: "名称"
                                        }, {
                                            type: "input",
                                            name: "no$match",
                                            label: "编号"
                                        }],
                                        headers: {
                                            "cname": {
                                                displayName: "企业名称"
                                            },
                                            "no": {
                                                displayName: "编号"
                                            },
                                            "taxNo": {
                                                displayName: "税号"
                                            },
                                            "enable": {
                                                displayName: "已启用",
                                                width: 70,
                                                cellTemplate: "<div class='ui-grid-cell-contents'>{{row.entity.enable?'已启用':'未启用' | translate}}</div>"
                                            },
                                            "legalPerson": {
                                                displayName: "法定代表人"
                                            }
                                        }
                                    };
                                }
                            });
                        } else if (type == "O") {
                            self.openOrgTree(type,null);
                        } else if (type == "PN" || type == "PT") {
                              ngDialog.open({
                                template: 'plugins/base/pages/organization.member.selector.html',
                                controller: function($scope) {
                                    var memberSelf = $scope;
                                    memberSelf.showConfirm = true;

                                    memberSelf.result = {};
                                    if (type == "PN") {
                                        memberSelf.title = "选择职务";
                                    } else {
                                        memberSelf.title = "选择岗位";
                                    }

                                    memberSelf.organizations = []; //组织列表
                                    memberSelf.result = {}; //选中的组织
                                    utils.async("get", "base/organization", {
                                        "eid": self.selectedEnterprise.eid,
                                        "enable$eq": true,
                                        "count": 9999
                                    }).then(function(res) {
                                        res.data.body.items.forEach(function(item) {
                                            memberSelf.organizations.push(item);
                                        });
                                    }, function(error) {

                                    });

                                    memberSelf.action = {
                                        onDetailOrganizationChange: function() {
                                            var uriname = "position/parentpositions";
                                            if (type == "PT") {
                                                uriname = "post/parentposts";
                                            }
                                            utils.async("get", "base/" + uriname, {
                                                "count": 999,
                                                "enable": true,
                                                "oid": memberSelf.result.organization.oid,
                                                "path": memberSelf.result.organization.path,
                                                "rootpid": memberSelf.result.organization.type,
                                                "eid": self.selectedEnterprise.eid
                                            }).then(function(res) {
                                                var titleMap = [];
                                                res.data.body.forEach(function(item) {
                                                    titleMap.push({ "name": item.name, "value": item.pid ,"showid":item.showid});
                                                });
                                                memberSelf.members = titleMap;
                                                memberSelf.result.member = [];
                                            }, function(error) {
                                                //toastr.warning(error.message);
                                            });
                                        },
                                        dialog: function() {
                                            //职位/岗位弹出选择组织
                                            self.openOrgTree(type, memberSelf);
                                        },
                                        confirm: function() {
                                            if (!(memberSelf.result.organization && memberSelf.result.organization.oid)) {
                                                toastr.warning("请先选择组织");
                                                return false;
                                            }
                                            if (memberSelf.result.member.length == 0) {
                                                toastr.warning("请" + memberSelf.title);
                                                return false;
                                            }
                                            var ids=[],names=[],showids=[];
                                            memberSelf.result.member.forEach(function(item){
                                                ids.push(item.value);
                                                names.push(item.name);
                                                showids.push(item.showid);
                                            })

                                            utils.async("post", "base/appAuthority", {
                                                "eid": self.selectedEnterprise.eid,
                                                "aid": self.current.appid,
                                                "type": type,
                                                "value": ids.toString(),                                              
                                                "show": names.toString(),
                                                "showid":ids.toString(), 
                                                "value2": memberSelf.result.organization.buid,
                                                "show2": memberSelf.result.organization.name,
                                                "showid2":memberSelf.result.organization.showid
                                            }).then(function(res) {
                                                //self.action.selectAppAuthority(self.current);
                                                loadDetail();
                                                loadDetailPeople();
                                                memberSelf.closeThisDialog();
                                            }, function(error) {
                                                //toastr.warning(error.message);
                                            });
                                        },
                                        close: function() {
                                            memberSelf.closeThisDialog();
                                        }
                                    }
                                }
                            });
                        } else if (type == "P") {
                            ngDialog.open({
                                className: 'ngdialog-theme-default dialog-people-selector',
                                template: 'plugins/base/pages/people.selector.html',
                                controller: function($scope) {
                                    $scope.eid = self.selectedEnterprise.eid;
                                    $scope.callback = function(justPersons, selects) {
                                        if (justPersons.length > 0) {
                                            var ids = [],
                                                names = [];
                                            justPersons.forEach(function(person) {
                                                if (person.pid && person.cname) {
                                                    ids.push(person.pid);
                                                    names.push(person.cname);
                                                }
                                            });
                                            utils.async("post", "base/appAuthority", {
                                                "eid": self.selectedEnterprise.eid,
                                                "aid": self.current.appid,
                                                "type": "P",
                                                "value": ids.toString(),
                                                "showid": ids.toString(),
                                                "show": names.toString()
                                            }).then(function(res) {
                                                loadDetail();
                                                loadDetailPeople();
                                                ngDialog.closeAll();
                                            }, function(error) {
                                                //toastr.warning(error.message);
                                            });
                                        } else {
                                            ngDialog.closeAll();
                                        }
                                    };
                                }
                            });
                        } else if (type == "ET") {
                            ngDialog.open({
                                template: 'plugins/base/pages/tree.selector.html',
                                controller: function($scope) {
                                    utils.async("get", "base/dicdetail/detail", {
                                        "type": "ENT",
                                        "id": "ENTCLASSIFY",
                                        "eid": self.selectedEnterprise.eid,
                                        "count": 999
                                    }).then(function(res) {
                                        res.data.body.items.forEach(function(item) {
                                            item.name = item.value;
                                            item.value = item.id;
                                        });
                                        $scope.node = { "children": res.data.body.items, isRoot: true };
                                    }, function(error) {
                                        //toastr.warning(error.message);
                                    });
                                    $scope.title = "选择企业类型";
                                    $scope.multiple = true;
                                    $scope.showConfirm = true;

                                    var getSelecteds = function(tree, selecteds) {
                                        angular.forEach(tree, function(node) {
                                            if (node.selected) {
                                                selecteds.push(node);
                                            }
                                            if (node.children) {
                                                getSelecteds(node.children, selecteds);
                                            }
                                        });
                                    };

                                    $scope.action = {
                                        onSelect: function(selected) {},
                                        confirm: function() {
                                            var selecteds = [];
                                            getSelecteds($scope.node.children, selecteds);
                                            var ids = [],
                                                names = [];
                                            selecteds.forEach(function(en) {
                                                if (en.id && en.name) {
                                                    ids.push(en.id);
                                                    names.push(en.name);
                                                }
                                            });
                                            if (ids.length) {
                                                utils.async("post", "base/appAuthority", {
                                                    "eid": self.selectedEnterprise.eid,
                                                    "aid": self.current.appid,
                                                    "type": "ET",
                                                    "value": ids.toString(),
                                                    "showid": ids.toString(),
                                                    "show": names.toString()
                                                }).then(function(res) {
                                                    loadDetail();
                                                    ngDialog.closeAll();
                                                }, function(error) {
                                                    //toastr.warning(error.message);
                                                });
                                                $scope.closeThisDialog();
                                            } else {
                                                toastr.warning("请选择企业类型");
                                            }
                                        },
                                        close: function() {
                                            $scope.closeThisDialog();
                                        }
                                    }
                                }
                            });
                        }
                    },
                    searchKeyUp: function(e) {
                        var keycode = window.event ? e.keyCode : e.which;
                        if (keycode == 13) {
                            loadDetail();
                        }
                    },
                    selectAppAuthority: function(app) {
                        self.filter.search$match = "";
                        if (app.isApp) {
                            self.current = app;
                            loadDetail();
                            self.nowPage2 = 1;
                            loadDetailPeople();
                        } else {
                            self.appAuthoritys = [];
                            self.current = null;
                            app.selected = false;
                            app.collapsed = !app.collapsed;
                        }
                    },
                    remove: function(appAuthority) {
                        dialog.confirm('确定删除该条记录?').then(function() {
                            utils.async("delete", "base/appAuthority/" + appAuthority.uid).then(function(res) {
                                loadDetail();
                            }, function(error) {
                                //toastr.warning(error.message);
                            });
                        });
                    },
                    nextPage2: function() {
                        if (self.current) {
                            if (self.nowPage2 + 1 <= self.sumPage2) {
                                self.peopleMembers = [];
                                self.nowPage2 = self.nowPage2 + 1;
                                loadDetailPeople();
                            }
                        }
                    },
                    prevPage2: function() {
                        if (self.current) {
                            if (self.nowPage2 - 1 > 0) {
                                self.peopleMembers = [];
                                self.nowPage2 = self.nowPage2 - 1;
                                loadDetailPeople();
                            }
                        }
                    },
                    searchKeyUpPeople: function(e) {
                        if (self.current) {
                            var keycode = window.event ? e.keyCode : e.which;
                            if (keycode == 13) {
                                self.nowPage2 = 1;
                                loadDetailPeople(self.current);
                            }
                        }
                    }
                }

            }
        ]);
});

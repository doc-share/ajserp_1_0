define(function() {
    angular.module('app').controller('bas.mapsalt',
        function($rootScope, $scope, $location, uiGridConstants, utils, path, settings,
            $timeout, dialog, toastr, ngDialog, qwsys, $http) {
            var scope = $scope;
            scope.filter = {};
            scope.model = {
                records: 0,
                content: []
            }
            scope.datapage = {
                page: 0,
                size: 20,
                sort: "created,desc"
            }
            scope.promise = null;
            scope.listUrl = "plugins/bas/templates/list.html";
            scope.config = {
                gridkey: "mapsalt",
                title: "員工資料",
                listoperation: {
                    add: {
                        name: "新增",
                        icon: "fa-calendar-check-o",
                        action: function(event, scope) {
                            scope.action.add();
                        }
                    }
                },
                headers: {
                    "emp_nbr": {
                        displayName: "員工編號",
                        width: 120
                    }
                     ,
                    "emp_name": {
                        displayName: "中文姓名",
                        width: 120
                    }
                     ,
                    "birth_date": {
                        displayName: "出生年月日",
                        width: 120
                    }
                     ,
                    "id_code": {
                        displayName: "身份證字號",
                        width: 120
                    }
                     ,
                    "native_addr": {
                        displayName: "籍貫",
                        width: 120
                    }
                     ,
                    "tel_no": {
                        displayName: "電話號碼",
                        width: 120
                    }
                     ,
                    "alarm_name": {
                        displayName: "緊急連絡人",
                        width: 120
                    }
                     ,
                    "address2": {
                        displayName: "通訊地址",
                        width: 120
                    }
                     ,
                    "address1": {
                        displayName: "戶籍所在地",
                        width: 120
                    }
                     ,
                    "empl_date": {
                        displayName: "到職日期",
                        width: 120
                    }
                     ,
                    "remark": {
                        displayName: "備註",
                        width: 120
                    }
                },
                filterItems: {
                    emp_nbr: {
                        type: "basDefault",
                        lovtype:"",
                        name: "emp_nbr",
                        label: "員工編號"
                    }
                     ,
                    emp_name: {
                        type: "basDefault",
                        lovtype:"",
                        name: "emp_name",
                        label: "中文姓名"
                    }
                     ,
                    tel_no: {
                        type: "basDefault",
                        lovtype:"",
                        name: "tel_no",
                        label: "電話號碼"
                    }
                }
            }

            scope.action = {
                add: function() {
                    $rootScope.uid = "";
                    scope.action.opendetail();
                },

                load: function() {

                    scope.promise=utils.ajax({
                        method: 'POST',
                        url: "bas/pnlemp/query?page=" + scope.datapage.page + "&size=" + scope.datapage.size + "&sort="+ scope.datapage.sort,
                        mockUrl: "plugins/base/data/orderlines.json",
                        data: scope.filter
                    }).then(function(res) {
                        scope.model = res.data.body;
                    });

                },
                reset: function() {
                    scope.filter = {

                    };

                },
                changepage: function(page, size,sort) {
                    scope.datapage.page = page;
                    scope.datapage.size = size;
                    if (sort){
                       scope.datapage.sort = sort;
                    }
                    scope.action.load();
                },
                rowclick: function(entity) {
                    $rootScope.uid = entity.uid;
                    scope.action.opendetail();
                },
                opendetail: function() {
                    var node = {
                        name: "員工資料明細",
                        url: 'bas/mapsalt.detail'
                    }
                    $scope.$emit('opencusdetail', node);
                }
            }
            $scope.$on('refreshpnlemp', function(event, message) {
                scope.action.load()
            });
            scope.action.load();
        });

});

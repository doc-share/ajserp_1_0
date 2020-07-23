define(function() {
    angular.module('app').controller('bas.map153',
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
                gridkey: "map153",
                title: "單位建檔",
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
                    "unit": {
                        displayName: "單位代號",
                        width: 120
                    }
                     ,
                    "un_desc": {
                        displayName: "單位說明",
                        width: 120
                    }
                     ,
                    "un_edesc": {
                        displayName: "英文說明",
                        width: 120
                    }
                },
                filterItems: {
                    unit: {
                        type: "basDefault",
                        lovtype:"",
                        name: "unit",
                        label: "單位代號"
                    }
                     ,
                    un_desc: {
                        type: "basDefault",
                        lovtype:"",
                        name: "un_desc",
                        label: "單位說明"
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
                        url: "bas/basun/query?page=" + scope.datapage.page + "&size=" + scope.datapage.size + "&sort="+ scope.datapage.sort,
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
                        name: "單位建檔明細",
                        url: 'bas/map153.detail'
                    }
                    $scope.$emit('opencusdetail', node);
                }
            }
            $scope.$on('refreshbasun', function(event, message) {
                scope.action.load()
            });
            scope.action.load();
        });

});

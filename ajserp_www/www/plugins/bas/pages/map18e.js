define(function() {
    angular.module('app').controller('bas.map18e',
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
                gridkey: "map18e",
                title: "製程資料",
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
                    "pro_nbr": {
                        displayName: "製程代號",
                        width: 120
                    }
                     ,
                    "pro_desc": {
                        displayName: "製程說明",
                        width: 120
                    }
                     ,
                    "pro_days": {
                        displayName: "製程天數",
                        width: 120
                    }
                     ,
                    "pro_rmk": {
                        displayName: "加工說明",
                        width: 120
                    }
                },
                filterItems: {
                    pro_nbr: {
                        type: "basDefault",
                        lovtype:"",
                        name: "pro_nbr",
                        label: "製程代號"
                    }
                     ,
                    pro_desc: {
                        type: "basDefault",
                        lovtype:"",
                        name: "pro_desc",
                        label: "製程說明"
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
                        url: "bas/baspro/query?page=" + scope.datapage.page + "&size=" + scope.datapage.size + "&sort="+ scope.datapage.sort,
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
                        name: "製程資料明細",
                        url: 'bas/map18e.detail'
                    }
                    $scope.$emit('opencusdetail', node);
                }
            }
            $scope.$on('refreshbaspro', function(event, message) {
                scope.action.load()
            });
            scope.action.load();
        });

});

define(function() {
    angular.module('app').controller('bas.map16',
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
                gridkey: "map16",
                title: "業務員資料",
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
                    "sale_nbr": {
                        displayName: "業務代號",
                        width: 120
                    }
                     ,
                    "sale_name": {
                        displayName: "業務名稱",
                        width: 120
                    }
                     ,
                    "esale_name": {
                        displayName: "業務英文名稱",
                        width: 120
                    }
                     ,
                    "title_code": {
                        displayName: "職位等級",
                        width: 120
                    }
                },
                filterItems: {
                    sale_nbr: {
                        type: "basDefault",
                        lovtype:"",
                        name: "sale_nbr",
                        label: "業務代號"
                    }
                     ,
                    sale_name: {
                        type: "basDefault",
                        lovtype:"",
                        name: "sale_name",
                        label: "業務名稱"
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
                        url: "bas/bassal/query?page=" + scope.datapage.page + "&size=" + scope.datapage.size + "&sort="+ scope.datapage.sort,
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
                        name: "業務員資料明細",
                        url: 'bas/map16.detail'
                    }
                    $scope.$emit('opencusdetail', node);
                }
            }
            $scope.$on('refreshbassal', function(event, message) {
                scope.action.load()
            });
            scope.action.load();
        });

});

define(function() {
    angular.module('app').controller('bas.map1e',
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
                gridkey: "map1e",
                title: "稅別資料",
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
                    "tax_type": {
                        displayName: "稅別代號",
                        width: 120
                    }
                     ,
                    "tax_desc": {
                        displayName: "稅別說明",
                        width: 120
                    }
                     ,
                    "tax_per": {
                        displayName: "稅率",
                        width: 120
                    }
                     ,
                    "tax_log": {
                        displayName: "計算方式",
                        width: 120
                    }
                     ,
                    "etax_type": {
                        displayName: "電子發票稅碼",
                        width: 120
                    }
                },
                filterItems: {
                    tax_type: {
                        type: "basDefault",
                        lovtype:"",
                        name: "tax_type",
                        label: "稅別代號"
                    }
                     ,
                    tax_desc: {
                        type: "basDefault",
                        lovtype:"",
                        name: "tax_desc",
                        label: "稅別說明"
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
                        url: "bas/bastax/query?page=" + scope.datapage.page + "&size=" + scope.datapage.size + "&sort="+ scope.datapage.sort,
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
                        name: "稅別資料明細",
                        url: 'bas/map1e.detail'
                    }
                    $scope.$emit('opencusdetail', node);
                }
            }
            $scope.$on('refreshbastax', function(event, message) {
                scope.action.load()
            });
            scope.action.load();
        });

});

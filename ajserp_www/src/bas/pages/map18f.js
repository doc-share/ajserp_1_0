define(function() {
    angular.module('app').controller('bas.map18f',
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
                gridkey: "map18f",
                title: "幣別資料",
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
                    "coin_nbr": {
                        displayName: "幣別代號",
                        width: 120
                    }
                     ,
                    "coin_desc": {
                        displayName: "幣別說明",
                        width: 120
                    }
                     ,
                    "ecoin_desc": {
                        displayName: "幣別英文說明",
                        width: 120
                    }
                },
                filterItems: {
                    coin_nbr: {
                        type: "basDefault",
                        lovtype:"",
                        name: "coin_nbr",
                        label: "幣別代號"
                    }
                     ,
                    coin_desc: {
                        type: "basDefault",
                        lovtype:"",
                        name: "coin_desc",
                        label: "幣別說明"
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
                        url: "bas/bascoin/query?page=" + scope.datapage.page + "&size=" + scope.datapage.size + "&sort="+ scope.datapage.sort,
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
                        name: "幣別資料明細",
                        url: 'bas/map18f.detail'
                    }
                    $scope.$emit('opencusdetail', node);
                }
            }
            $scope.$on('refreshbascoin', function(event, message) {
                scope.action.load()
            });
            scope.action.load();
        });

});

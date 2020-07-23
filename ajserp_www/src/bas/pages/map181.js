define(function() {
    angular.module('app').controller('bas.map181',
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
                gridkey: "map181",
                title: "備註資料",
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
                    "type_nbr": {
                        displayName: "備註類別代號",
                        width: 120
                    }
                     ,
                    "rem_nbr": {
                        displayName: "備註代號",
                        width: 120
                    }
                     ,
                    "rem_desc": {
                        displayName: "備註說明",
                        width: 120
                    }
                     ,
                    "rem_memo": {
                        displayName: "備註明細",
                        width: 120
                    }
                },
                filterItems: {
                    rem_nbr: {
                        type: "basDefault",
                        lovtype:"",
                        name: "rem_nbr",
                        label: "備註代號"
                    }
                     ,
                    rem_desc: {
                        type: "basDefault",
                        lovtype:"",
                        name: "rem_desc",
                        label: "備註說明"
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
                        url: "bas/basrem/query?page=" + scope.datapage.page + "&size=" + scope.datapage.size + "&sort="+ scope.datapage.sort,
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
                        name: "備註資料明細",
                        url: 'bas/map181.detail'
                    }
                    $scope.$emit('opencusdetail', node);
                }
            }
            $scope.$on('refreshbasrem', function(event, message) {
                scope.action.load()
            });
            scope.action.load();
        });

});

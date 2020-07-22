define(function() {
    angular.module('app').controller('acr.annual_contract',
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
                gridkey: "annual_contract",
                title: "??????",
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
                    "cus_nbr": {
                        displayName: "????",
                        width: 120
                    }
                     ,
                    "date": {
                        displayName: "??",
                        width: 120
                    }
                     ,
                    "plan_date": {
                        displayName: "??????",
                        width: 120
                    }
                     ,
                    "items_desc": {
                        displayName: "????",
                        width: 120
                    }
                     ,
                    "amt": {
                        displayName: "????",
                        width: 120
                    }
                     ,
                    "tot_amt": {
                        displayName: "????",
                        width: 120
                    }
                },
                filterItems: {
                    date: {
                        type: "basEsydatetime",
                        lovtype:"",
                        name: "date",
                        label: "??"
                    }
                     ,
                    cus_nbr: {
                        type: "basLov",
                        lovtype:"",
                        name: "cus_nbr",
                        label: "????"
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
                        url: "acr/contbah/query?page=" + scope.datapage.page + "&size=" + scope.datapage.size + "&sort="+ scope.datapage.sort,
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
                        name: "",
                        url: ''
                    }
                    $scope.$emit('opencusdetail', node);
                }
            }
            $scope.$on('refreshcontbah', function(event, message) {
                scope.action.load()
            });
            scope.action.load();
        });

});

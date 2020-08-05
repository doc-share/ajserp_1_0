define(function () {
    angular.module('app').controller('rec.map5o',
        function ($rootScope, $scope, $location, uiGridConstants, utils, path, settings,
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
                gridkey: "map5o",
                title: "收料補金額",
                listoperation: {
                    add: {
                        name: "新增",
                        icon: "fa-calendar-check-o",
                        action: function (event, scope) {
                            scope.action.add();
                        }
                    }
                },
                headers: {
                    "ven_nbr": {
                        displayName: "廠商代號",
                        width: 120
                    },
                    "ven_alias": {
                        displayName: "廠商簡稱",
                        width: 120
                    },
                    "nbrdate": {
                        displayName: "收料日期",
                        width: 120
                    },
                    "nbr": {
                        displayName: "單據號碼",
                        width: 120
                    },
                    "io_p": {
                        displayName: "收/退",
                        width: 120
                    },
                    "item_nbr": {
                        displayName: "產品編號",
                        width: 120
                    },
                    "item_name": {
                        displayName: "產品名稱",
                        width: 120
                    },
                    "item_desc": {
                        displayName: "規格說明",
                        width: 120
                    },
                    "pro_nbr": {
                        displayName: "製程",
                        width: 120
                    },
                    "coin_nbr": {
                        displayName: "幣別",
                        width: 120
                    },
                    "t_unit": {
                        displayName: "$單位",
                        width: 120
                    },
                    "t_qty": {
                        displayName: "$數量",
                        width: 120
                    },
                    "price": {
                        displayName: "單價",
                        width: 120
                    },
                    "cost": {
                        displayName: "成本",
                        width: 120
                    },
                    "remark": {
                        displayName: "備註",
                        width: 120
                    }
                },
                filterItems: {
                    acr_mon: {
                        type: "basEsydatetime",
                        format:"YYYYMM",
                        name: "acr_mon",
                        label: "結帳月份"
                    },
                    ven_nbr: {
                        type: "basLov",
                        lovtype: "get_ven",
                        name: "ven_nbr",
                        label: "廠商代號F"
                    },
                    ven_nbrb: {
                        type: "basLov",
                        lovtype: "get_ven",
                        name: "ven_nbrb",
                        label: "廠商代號T"
                    },
                    nbr_type: {
                        type: "basRadiosinline",
                        titleMap:[
                            {valu:"1",name:"全部"},
                            {valu:"2",name:"未輸入金額"},
                        ],
                        name: "nbr_type",
                        label: "單據類別"
                    },
        
                }
            }

            scope.action = {
                add: function () {
                    $rootScope.uid = "";
                    scope.action.opendetail();
                },

                load: function () {

                    scope.promise = utils.ajax({
                        method: 'POST',
                        url: "pur/recbat/query?page=" + scope.datapage.page + "&size=" + scope.datapage.size + "&sort=" + scope.datapage.sort,
                        mockUrl: "plugins/base/data/orderlines.json",
                        data: scope.filter
                    }).then(function (res) {
                        scope.model = res.data.body;
                    });

                },
                reset: function () {
                    scope.filter = {

                    };

                },
                changepage: function (page, size, sort) {
                    scope.datapage.page = page;
                    scope.datapage.size = size;
                    if (sort) {
                        scope.datapage.sort = sort;
                    }
                    scope.action.load();
                },
                rowclick: function (entity) {
                    $rootScope.uid = entity.uid;
                    scope.action.opendetail();
                },
                opendetail: function () {
                    var node = {
                        name: "",
                        url: 'rec/map5o.detail'
                    }
                    $scope.$emit('opencusdetail', node);
                }
            }
            $scope.$on('refreshrecbat', function (event, message) {
                scope.action.load()
            });
            scope.action.load();
        });

});
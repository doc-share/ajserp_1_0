define(function () {
    angular.module('app').controller('ord.map33',
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
                gridkey: "map33",
                title: "訂單查詢",
                listoperation: {
                    // add: {
                    //     name: "新增",
                    //     icon: "fa-calendar-check-o",
                    //     action: function (event, scope) {
                    //         scope.action.add();
                    //     }
                    // },
                    export: {
                        name: "列印",
                        icon: "fa-share",
                        action: function(event, scope) {
                            scope.action.export();
                        }
                    },
                },
                headers: {
                    "nbrdate": {
                        displayName: "訂單日期",
                        width: 120
                    },
                    "nbr": {
                        displayName: "單據號碼",
                        width: 120
                    },
                    "cus_nbr": {
                        displayName: "客戶代號",
                        width: 120
                    },
                    "cus_alias": {
                        displayName: "客戶簡稱",
                        width: 120
                    },
                    "cus_ord": {
                        displayName: "客戶訂單號碼",
                        width: 120
                    },
                    "sale_nbr": {
                        displayName: "業務員",
                        width: 120
                    },
                    "sale_name": {
                        displayName: "業務員姓名",
                        width: 120
                    },
                    "plan_date": {
                        displayName: "預計出貨日",
                        width: 120
                    },
                    "amt": {
                        displayName: "訂單總額",
                        width: 120
                    },
                    "tot_amt": {
                        displayName: "出貨總額",
                        width: 120
                    },
                    "pay_term": {
                        displayName: "交易條件",
                        width: 120
                    },
                    "remark": {
                        displayName: "備註",
                        width: 120
                    }
                },
                filterItems: {
                    nbr: {
                        type: "basDefault",
                        lovtype: "",
                        name: "nbr",
                        label: "單據號碼F"
                    },
                    nbrb: {
                        type: "basDefault",
                        lovtype: "",
                        name: "nbrb",
                        label: "單據號碼T"
                    },
                    cus_nbr: {
                        type: "basLov",
                        lovtype: "get_cus",
                        name: "cus_nbr",
                        label: "客戶代號F"
                    },
                    cus_nbrb: {
                        type: "basLov",
                        lovtype: "get_cus",
                        name: "cus_nbrb",
                        label: "客戶代號T"
                    },
                    nbrdate: {
                        type: "basEsydatetime",
                        lovtype: "",
                        name: "nbrdate",
                        label: "訂單日期F"
                    },
                    nbrdateb: {
                        type: "basEsydatetime",
                        lovtype: "",
                        name: "nbrdateb",
                        label: "訂單日期T"
                    }
                },
                filtermoreItems: {
                    nbr:{
                        type: "basDefault",
                        lovtype: "",
                        name: "nbr",
                        label: "單據號碼F"
                    },
                    nbrb:{
                        type: "basDefault",
                        lovtype: "",
                        name: "nbrb",
                        label: "單據號碼T"
                    },
                    cus_nbr: {
                        type: "basLov",
                        lovtype: "get_cus",
                        name: "cus_nbr",
                        label: "客戶代號F"
                    },
                    cus_nbrb: {
                        type: "basLov",
                        lovtype: "get_cus",
                        name: "cus_nbrb",
                        label: "客戶代號T"
                    },
                    sale_nbr: {
                        type: "basEsydatetime",
                        lovtype: "",
                        name: "sale_nbr",
                        label: "業務員F"
                    },
                    sale_nbrb: {
                        type: "basEsydatetime",
                        lovtype: "",
                        name: "sale_nbrb",
                        label: "業務員T"
                    },
                    nbrdate: {
                        type: "basEsydatetime",
                        lovtype: "",
                        name: "nbrdate",
                        label: "訂單日期F"
                    },
                    nbrdateb: {
                        type: "basEsydatetime",
                        lovtype: "",
                        name: "nbrdateb",
                        label: "訂單日期T"
                    },
                    plan_date: {
                        type: "basEsydatetime",
                        lovtype: "",
                        name: "plan_date",
                        label: "預計出貨日F"
                    },
                    plan_dateb: {
                        type: "basEsydatetime",
                        lovtype: "",
                        name: "plan_dateb",
                        label: "預計出貨日T"
                    },
                    status:{
                        type: "basRadiosinline",
                        titleMap:[
                            {value:"1",name:"未出貨"},
                            {value:"2",name:"含部分出貨"},
                            {value:"3",name:"已結案"},
                            {value:"4",name:"全部"},
                        ],
                        css:"cell2",
                        name:"status",
                        label:"出貨狀況"
                    },
                    ord_data:{   //欄位名稱暫定
                        type: "basRadiosinline",
                        titleMap:[
                            {value:"1",name:"全部訂單"},
                            {value:"2",name:"僅顯示個人管理的訂單"}
                        ],
                        css:"cell2",
                        name:"ord_data",
                        label:"訂單資料"
                    }
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
                        url: "ord/ordbah/query?page=" + scope.datapage.page + "&size=" + scope.datapage.size + "&sort=" + scope.datapage.sort,
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
                export: function() {
                    var page = {
                        size: 60000,
                        page: 0,
                        sort: scope.datapage.sort,
                        
                    }
                    scope.loadmessage = "EXCEL生成中....";
                    scope.promise = qwsys.exportExcel("ord/ordbah/export", scope.config.headers, scope.filter, page, "訂單")

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
                        url: 'ord/map33.detail'
                    }
                    $scope.$emit('opencusdetail', node);
                }
            }
            $scope.$on('refreshordbah', function (event, message) {
                scope.action.load()
            });
            scope.action.load();
        });

});
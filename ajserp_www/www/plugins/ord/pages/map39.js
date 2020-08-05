define(function () {
    angular.module('app').controller('ord.map39',
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
                gridkey: "map39",
                title: "訂單跟催作業",
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
                    "cus_item": {
                        displayName: "客戶產品編號",
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
                    "unit": {
                        displayName: "單位",
                        width: 120
                    },
                    "pro_nbr": {
                        displayName: "製程",
                        width: 120
                    },
                    "oqty1": {
                        displayName: "訂單數量",
                        width: 120
                    },
                    "ioqty": {
                        displayName: "已出貨數量",
                        width: 120
                    },
                    "ord_qty": {
                        displayName: "未出貨數量",
                        width: 120
                    },
                    "oh_qty": {
                        displayName: "目前庫存",
                        width: 120
                    },
                    "remark": {
                        displayName: "備註",
                        width: 120
                    }
                },
                filterItems: {
                    sort_method: {
                        type: "basRadiosinline",
                        titleMap:[
                            {value:"1",name:"依預計出貨日+客戶"},
                            {value:"2",name:"依客戶+預設出貨日"},
                            {value:"3",name:"依產品+預設出貨日"}
                        ],
                        css: "cell100",
                        name: "sort_method",
                        label: "排序方式"
                    },
                    date_scope: {
                        type: "basRadiosinline",
                        titleMap:[
                            {value:"1",name:"全部"},
                            {value:"2",name:"當日"},
                            {value:"3",name:"近三日"},
                            {value:"4",name:"近一周"},
                            {value:"5",name:"近二周"}
                        ],
                        css: "cell100",
                        name: "date_scope",
                        label: "預計出貨"
                    },
                    content1:{   //欄位名稱暫定
                        type:"basString", 
                        placeholder:"請輸入主要關鍵字",
                        name:"content1"
                    },
                    content2:{   //欄位名稱暫定
                        type:"basDefault",
                        placeholder:"請輸入次要關鍵字",
                        name:"content2"
                    },
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
                    item_nbr: {
                        type: "basDefault",
                        lovtype: "",
                        name: "item_nbr",
                        label: "料品代號F"
                    },
                    item_nbrb: {
                        type: "basDefault",
                        lovtype: "",
                        name: "item_nbrb",
                        label: "料品代號T"
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
                        url: "ord/ordbat/query?page=" + scope.datapage.page + "&size=" + scope.datapage.size + "&sort=" + scope.datapage.sort,
                        mockUrl: "plugins/base/data/orderlines.json",
                        data: scope.filter
                    }).then(function (res) {
                        console.log(res.data);
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
                        sort: scope.datapage.sort
                    }
                    scope.loadmessage = "EXCEL生成中....";
                    scope.promise = qwsys.exportExcel("ord/ordbat/export", scope.config.headers, scope.filter, page, "訂單跟催")

                },
                changepage: function (page, size, sort) {
                    scope.datapage.page = page;
                    scope.datapage.size = size;
                    if (sort) {
                        scope.datapage.sort = sort;
                    }
                    scope.action.load();
                },
                // rowclick: function (entity) {
                //     $rootScope.uid = entity.uid;
                //     scope.action.opendetail();
                // },
                // opendetail: function () {
                //     var node = {
                //         name: "",
                //         url: 'ord/map39.detail'
                //     }
                //     $scope.$emit('opencusdetail', node);
                // }
            }
            $scope.$on('refreshordbat', function (event, message) {
                scope.action.load()
            });
            scope.action.load();
        });

});
define(function () {
    angular.module('app').controller('shp.map48',
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
                gridkey: "map48",
                title: "出貨明細查詢",
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
                        displayName: "出貨日期",
                        width: 120
                    },
                    "nbr": {
                        displayName: "單據號碼",
                        width: 120
                    },
                    "io_p": {
                        displayName: "出退別",
                        width: 120
                    },
                    "acr_mon": {
                        displayName: "結帳月份",
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
                    "desc_no": {
                        displayName: "客戶訂單號碼",
                        width: 120
                    },
                    "cus_item": {
                        displayName: "客戶產品代號",
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
                    "coin_nbr": {
                        displayName: "幣別",
                        width: 120
                    },
                    "unit": {
                        displayName: "單位",
                        width: 120
                    },
                    "qty": {
                        displayName: "數量",
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
                    "amt": {
                        displayName: "金額",
                        width: 120
                    },
                    "remark": {
                        displayName: "備註",
                        width: 120
                    }
                    
                },
                filterItems: {
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
                        label: "產品代號F"
                    },
                    item_nbrb: {
                        type: "basDefault",
                        lovtype: "",
                        name: "item_nbrb",
                        label: "產品代號T"
                    },
                    nbrdate: {
                        type: "basEsydatetime",
                        lovtype: "",
                        name: "nbrdate",
                        label: "出貨日期F"
                    },
                    nbrdateb: {
                        type: "basEsydatetime",
                        lovtype: "",
                        name: "nbrdateb",
                        label: "出貨日期T"
                    },
                    space:{ css:"cell100"},
                    content1:{   //欄位名稱暫定
                        type:"basDefault",
                        name:"content1"
                    },
                    content2:{   //欄位名稱暫定
                        type:"basDefault",
                        name:"content2"
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
                        type: "basLov",
                        lovtype: "get_sal",
                        name: "sale_nbr",
                        label: "業務員F"
                    },
                    sale_nbrb: {
                        type: "basLov",
                        lovtype: "get_sal",
                        name: "sale_nbrb",
                        label: "業務員T"
                    },
                    nbrdate: {
                        type: "basEsydatetime",
                        lovtype: "",
                        name: "nbrdate",
                        label: "出貨日期F"
                    },
                    nbrdateb: {
                        type: "basEsydatetime",
                        lovtype: "",
                        name: "nbrdateb",
                        label: "出貨日期T"
                    },
                    acr_mon: {
                        type: "basEsydatetime",
                        format:"YYYYMM",
                        name: "acr_mon",
                        label: "結帳月份F"
                    },
                    acr_monb: {
                        type: "basEsydatetime",
                        format:"YYYYMM",
                        name: "acr_monb",
                        label: "結帳月份T"
                    },
                    io_p:{
                        type: "basRadiosinline",
                        titleMap:[
                            {value:"1",name:"全部"},
                            {value:"2",name:"出貨單"},
                            {value:"3",name:"退貨單"}
                        ],
                        css:"cell2",
                        name:"io_p",
                        label:"出貨類別"
                    },
                    ord_data:{   //欄位名稱暫定
                        type: "basRadiosinline",
                        titleMap:[
                            {value:"1",name:"全部出貨單"},
                            {value:"2",name:"僅顯示個人管理的出貨單"}
                        ],
                        css:"cell2",
                        name:"ord_data",
                        label:"單據資料"
                    }
                },
                filterPrint:{
                    print:{
                        type: "basRadiosinline",
                        titleMap:[
                            {value:"1",name:"依客戶+日期"},
                            {value:"2",name:"依產品+日期"},
                            {value:"3",name:"依日期+產品"},
                            {value:"4",name:"依月份+客戶"},
                            {value:"5",name:"依客戶+月份"},
                            {value:"6",name:"依客戶+產品"},
                            {value:"7",name:"依客戶+產品+日期"},
                        ],
                        css:"cell2",
                        name:"print",
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
                        url: "ord/shpbat/query?page=" + scope.datapage.page + "&size=" + scope.datapage.size + "&sort=" + scope.datapage.sort,
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
                export: function() {
                    var page = {
                        size: 60000,
                        page: 0,
                        sort: scope.datapage.sort
                    }
                    scope.loadmessage = "EXCEL生成中....";
                    scope.promise = qwsys.exportExcel("shp/shpbat/export", scope.config.headers, scope.filter, page, "訂單跟催")

                },
                // rowclick: function (entity) {
                //     $rootScope.uid = entity.uid;
                //     scope.action.opendetail();
                // },
                // opendetail: function () {
                //     var node = {
                //         name: "",
                //         url: 'shp/map48aa.detail'
                //     }
                //     $scope.$emit('opencusdetail', node);
                // }
            }
            $scope.$on('refreshshpbat', function (event, message) {
                scope.action.load()
            });
            scope.action.load();
        });

});
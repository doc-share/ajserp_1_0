define(function () {
    angular.module('app').controller('rec.map57',
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
                gridkey: "map57",
                title: "收料彙總查詢",
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
                    "acr_mon": {
                        displayName: "結帳月份",
                        width: 120
                    },
                    "ven_nbr": {
                        displayName: "廠商代號",
                        width: 120
                    },
                    "ven_alias": {
                        displayName: "廠商簡稱",
                        width: 120
                    },
                    "ivc_nbr": {
                        displayName: "發票號碼",
                        width: 120
                    },
                    "sale_nbr": {
                        displayName: "採購員",
                        width: 120
                    },
                    "plan_date": {
                        displayName: "預計到貨日",
                        width: 120
                    },
                    "coin_nbr": {
                        displayName: "幣別",
                        width: 120
                    },
                    "c_amt": {
                        displayName: "幣別合計",
                        width: 120
                    },
                    "ctax_amt": {
                        displayName: "幣別稅額",
                        width: 120
                    },
                    "ctot_amt": {
                        displayName: "幣別總額",
                        width: 120
                    },
                    "tot_amt": {
                        displayName: "合計金額",
                        width: 120
                    },
                    "tax_amt": {
                        displayName: "稅額",
                        width: 120
                    },
                    "rec_amt": {
                        displayName: "收料總額",
                        width: 120
                    },
                    "shp_amt": {
                        displayName: "付款總額",
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
                    nbrdate: {
                        type: "basEsydatetime",
                        lovtype: "",
                        name: "nbrdate",
                        label: "收料日期F"
                    },
                    nbrdateb: {
                        type: "basEsydatetime",
                        lovtype: "",
                        name: "nbrdateb",
                        label: "收料日期T"
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
                    nbrdate: {
                        type: "basEsydatetime",
                        lovtype: "",
                        name: "nbrdate",
                        label: "收料日期F"
                    },
                    nbrdateb: {
                        type: "basEsydatetime",
                        lovtype: "",
                        name: "nbrdateb",
                        label: "收料日期T"
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
                    coin_nbr: {
                        type: "basLov",
                        lovtype: "get_coin",
                        name: "coin_nbr",
                        label: "幣別F"
                    },
                    coin_nbrb: {
                        type: "basLov",
                        lovtype: "get_coin",
                        name: "coin_nbrb",
                        label: "幣別T"
                    },
                    io_p:{
                        type: "basRadiosinline",
                        titleMap:[
                            {value:"1",name:"全部"},
                            {value:"2",name:"收料單"},
                            {value:"3",name:"退料單"}
                        ],
                        css:"cell2",
                        name:"io_p",
                        label:"收料類別"
                    },
                    ord_data:{   //欄位名稱暫定
                        type: "basRadiosinline",
                        titleMap:[
                            {value:"1",name:"全部收料單"},
                            {value:"2",name:"僅顯示個人管理的收料單"}
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
                            {value:"1",name:"依廠商排序"},
                            {value:"2",name:"依單據"},
                            {value:"3",name:"依日期"},
                            {value:"4",name:"依結帳月份"},
                            {value:"5",name:"依廠商+月份"},
                            {value:"6",name:"依月份+發票"},
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
                        url: "pur/recbah/query?page=" + scope.datapage.page + "&size=" + scope.datapage.size + "&sort=" + scope.datapage.sort,
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
                        url: 'rec/recbah.detail'
                    }
                    $scope.$emit('opencusdetail', node);
                }
            }
            $scope.$on('refreshrecbah', function (event, message) {
                scope.action.load()
            });
            scope.action.load();
        });

});
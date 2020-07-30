angular.module('app.core.proconfig', [])
    .factory('proconfig', ['utils', 'ngDialog', 'settings', '$sce',
        function(utils, ngDialog, settings, $sce) {
            return {
                lov: {
                    get_add: {
                        title: "常用地址檔",
                        queryUrl: "bas/address1/query", //查詢地址
                        initLoad: false, //加載時是否初始化數據
                        small: true, //速查是否顯示編號
                        showField: { //速查基本欄位
                            valueField: "addr1no",
                            nameField: "addr1no",
                            smallField: "addr1nm"
                        },
                        dialogConfig:"seladd1"
                    },
                    get_war: {
                        title: "倉庫主檔",
                        queryUrl: "bas/baswar/query", //查詢地址
                        initLoad: false, //加載時是否初始化數據
                        small: true, //速查是否顯示編號
                        showField: { //速查基本欄位
                            valueField: "ware_nbr",
                            nameField: "ware_nbr",
                            smallField: "ware_desc"
                        }
                    },
                    get_unt: {
                        title: "單位轉換檔",
                        queryUrl: "bas/basunt/query", //查詢地址
                        initLoad: false, //加載時是否初始化數據
                        small: false, //速查是否顯示編號
                        showField: { //速查基本欄位
                            valueField: "unit1",
                            nameField: "factor1"
                        },
                        dialogConfig:"selunt"
                    },
                    get_un: {
                        title: "獲取單位",
                        queryUrl: "bas/basun/query", //查詢地址
                        initLoad: false, //加載時是否初始化數據
                        small: true, //速查是否顯示編號
                        showField: { //速查基本欄位
                            valueField: "unit",
                            nameField: "unit",
                            smallField: "un_desc"
                        }
                    },
                    get_pro: {
                        title: "製成基本檔",
                        queryUrl: "bas/baspro/query", //查詢地址
                        initLoad: true, //加載時是否初始化數據
                        small: true, //速查是否顯示編號
                        showField: { //速查基本欄位
                            valueField: "pro_nbr",
                            nameField: "pro_nbr",
                            smallField: "pro_desc"
                        },
                        dialogConfig:"selpro"
                    },
                    get_att: {
                        title: "連絡人",
                        queryUrl: "bas/cusatt/invpro", //查詢地址
                        initLoad: false, //加載時是否初始化數據
                        small: true, //速查是否顯示編號
                        showField: { //速查基本欄位
                            valueField: "cus_nbr",
                            nameField: "cus_nbr",
                            smallField: "attname"
                        },
                        dialogConfig:"selcus_att"
                    },
                    get_word: {
                        title: "業務性質",
                        queryUrl: "bas/basword/query", //查詢地址
                        initLoad: true, //加載時是否初始化數據
                        small: false, //速查是否顯示編號
                        showField: { //速查基本欄位
                            valueField: "shp_desc",
                            nameField: "shp_desc"
                        }
                    },
                    get_are: {
                        title: "地區碼檔",
                        queryUrl: "bas/basare/query", //查詢地址
                        initLoad: true, //加載時是否初始化數據
                        small: true, //速查是否顯示編號
                        showField: { //速查基本欄位
                            valueField: "area_nbr",
                            nameField: "area_nbr",
                            smallField: "area_desc"

                        }
                    },
                    get_tax: {
                        title: "稅別主檔",
                        queryUrl: "bas/bastax/query", //查詢地址
                        initLoad: true, //加載時是否初始化數據
                        small: true, //速查是否顯示編號
                        showField: { //速查基本欄位
                            valueField: "tax_type",
                            nameField: "tax_type",
                            smallField: "tax_desc"
                        }
                    },
                    get_pay: {
                        title: "付款行庫",
                        queryUrl: "bas/selpay/query", //查詢地址
                        initLoad: true, //加載時是否初始化數據
                        small: true, //速查是否顯示編號
                        showField: { //速查基本欄位
                            valueField: "pay_nbr",
                            nameField: "pay_nbr",
                            smallField: "pay_name"
                        }
                    },
                    get_coin: {
                        title: "幣別主檔",
                        queryUrl: "bas/bascoin/query", //查詢地址
                        initLoad: true, //加載時是否初始化數據
                        small: true, //速查是否顯示編號
                        showField: { //速查基本欄位
                            valueField: "coin_nbr",
                            nameField: "coin_nbr",
                            smallField: "coin_desc"
                        }
                    },
                    get_type: {
                        title: "類別查詢",
                        queryUrl: "bas/bastype/query", //查詢地址
                        initLoad: true, //加載時是否初始化數據
                        small: true, //速查是否顯示編號
                        showField: { //速查基本欄位
                            valueField: "m_type",
                            nameField: "m_type",
                            smallField: "type_desc"
                        }
                    },
                    get_itm: {
                        title: "料品基本檔",
                        queryUrl: "bas/invitm/query", //查詢地址
                        initLoad: false, //加載時是否初始化數據
                        small: true, //速查是否顯示編號
                        showField: { //速查基本欄位
                            valueField: "item_nbr",
                            nameField: "item_nbr",
                            smallField: "item_desc"
                        },
                        dialogConfig:"selitm1"
                    },
                    get_ven: {
                        title: "廠商主檔",
                        queryUrl: "bas/purven/query", //查詢地址
                        initLoad: true, //加載時是否初始化數據
                        small: true, //速查是否顯示編號
                        showField: { //速查基本欄位
                            valueField: "ven_nbr",
                            nameField: "ven_nbr",
                            smallField: "ven_name"
                        },
                        dialogConfig:"selven"
                    },
                    get_cus: {
                        title: "客戶主檔",
                        queryUrl: "bas/cuscus/query", //查詢地址
                        initLoad: false, //加載時是否初始化數據
                        small: true, //速查是否顯示編號
                        showField: { //速查基本欄位
                            valueField: "cus_nbr",
                            nameField: "cus_nbr",
                            smallField: "cus_name"
                        },
                        dialogConfig: "selcus",

                    },
                    get_bank: {
                        title: "銀行基本資料檔",
                        queryUrl: "bas/basbank/query", //查詢地址
                        initLoad: false, //加載時是否初始化數據
                        small: true, //速查是否顯示編號
                        showField: { //速查基本欄位
                            valueField: "b_nbr",
                            nameField: "b_nbr",
                            smallField: "b_name"
                        },
                        dialogConfig: "selbank"

                    },
                    get_code: {
                        title: "原因碼存放檔",
                        queryUrl: "bas/bascode/query", //查詢地址
                        initLoad: false, //加載時是否初始化數據
                        small: true, //速查是否顯示編號
                        showField: { //速查基本欄位
                            valueField: "code",
                            nameField: "code",
                            smallField: "code_desc"
                        }
                    },
                    get_dept: {
                        title: "原因碼存放檔",
                        queryUrl: "bas/accdept/query", //查詢地址
                        initLoad: false, //加載時是否初始化數據
                        small: true, //速查是否顯示編號
                        showField: { //速查基本欄位
                            valueField: "dept_id",
                            nameField: "dept_id",
                            smallField: "dept_name"
                        }
                    },
                    get_emp: {
                        title: "員工主檔",
                        queryUrl: "bas/pnlemp/query", //查詢地址
                        initLoad: false, //加載時是否初始化數據
                        small: true, //速查是否顯示編號
                        showField: { //速查基本欄位
                            valueField: "emp_nbr",
                            nameField: "emp_nbr",
                            smallField: "emp_name"
                        },
                        dialogConfig:"selstaff"
                    },
                    get_mj: {
                        title: "模具資料",
                        queryUrl: "bas/basmj/query", //查詢地址
                        initLoad: false, //加載時是否初始化數據
                        small: true, //速查是否顯示編號
                        showField: { //速查基本欄位
                            valueField: "mj_nbr",
                            nameField: "mj_nbr",
                            smallField: "mj_name"
                        },
                        dialogConfig:"selmj"
                    },
                    get_oth: {
                        title: "產品參考號碼檔",
                        queryUrl: "bas/invoth/query", //查詢地址
                        initLoad: false, //加載時是否初始化數據
                        small: false, //速查是否顯示編號
                        showField: { //速查基本欄位
                            valueField: "item_nbr",
                            nameField: "item_nbr",
                        },
                        dialogConfig:"seloth"
                    },
                    get_rem: {
                        title: "備註主檔",
                        queryUrl: "bas/basrem/query", //查詢地址
                        initLoad: false, //加載時是否初始化數據
                        small: false, //速查是否顯示編號
                        showField: { //速查基本欄位
                            valueField: "rem_nbr",
                            nameField: "rem_desc",
                        },
                        dialogConfig:"selrem"
                    },
                    get_rep: {
                        title: "模具維修記錄",
                        queryUrl: "bas/mjrep/query", //查詢地址
                        initLoad: false, //加載時是否初始化數據
                        small: true, //速查是否顯示編號
                        showField: { //速查基本欄位
                            valueField: "mj_nbr",
                            nameField: "mj_nbr",
                            smallField: "rep_desc"
                        }
                    },
                    get_sal: {
                        title: "業務員主檔",
                        queryUrl: "bas/bassal/query", //查詢地址
                        initLoad: false, //加載時是否初始化數據
                        small: true, //速查是否顯示編號
                        showField: { //速查基本欄位
                            valueField: "sale_nbr",
                            nameField: "sale_nbr",
                            smallField: "sale_name"
                        }
                    },
                    get_ship: {
                        title: "運輸方式維護檔",
                        queryUrl: "bas/basship/query", //查詢地址
                        initLoad: false, //加載時是否初始化數據
                        small: true, //速查是否顯示編號
                        showField: { //速查基本欄位
                            valueField: "ship_nbr",
                            nameField: "ship_nbr",
                            smallField: "ship_desc"
                        }
                    },
                    get_term: {
                        title: "運輸方式",
                        queryUrl: "bas/basterm/query", //查詢地址
                        initLoad: false, //加載時是否初始化數據
                        small: true, //速查是否顯示編號
                        showField: { //速查基本欄位
                            valueField: "term_nbr",
                            nameField: "term_nbr",
                            smallField: "term_desc"
                        }
                    }
                },
                dialog: {
                    seladd1: {
                        title: "常用地址檔",
                        ngdialogSize: "ngdialog-md", //視窗大小 ngdialog-xs 特小 ngdialog-sm 小,ngdialog-md 大,ngdialog-lg特大
                        queryUrl: "bas/address1/query", //查詢地址
                        headers: {
                        },
                        filterItems: {
                        }
                    },
                    selbank: {
                        title: "銀行基本資料檔",
                        ngdialogSize: "ngdialog-md", //視窗大小 ngdialog-xs 特小 ngdialog-sm 小,ngdialog-md 大,ngdialog-lg特大
                        queryUrl: "bas/basbank/query", //查詢地址
                        headers: {
                            "b_nbr": {
                                displayName: "銀行代號",
                                width: 120
                            },
                            "b_name": {
                                displayName: "銀行名稱",
                                width: 120
                            },
                            "b_code": {
                                displayName: "銀行帳號",
                                width: 120
                            },
                        },
                        filterItems: {
                            b_name: {
                                type: "input",
                                name: "b_name",
                                label: "銀行名稱"
                            }
                        }
                    },
                    selcus: {
                        title: "客戶主檔",
                        ngdialogSize: "ngdialog-md", //視窗大小 ngdialog-xs 特小 ngdialog-sm 小,ngdialog-md 大,ngdialog-lg特大
                        queryUrl: "bas/cuscus/query", //查詢地址
                        headers: {
                            "cus_nbr": {
                                displayName: "客戶編號",
                                width: 120
                            },
                            "cus_name": {
                                displayName: "客戶名稱",
                                width: 120
                            },
                            "cus_tel1": {
                                displayName: "客戶電話1",
                                width: 120
                            },
                            "cus_fax": {
                                displayName: "傳真機號碼",
                                width: 120
                            },
                            "attname1": {
                                displayName: "連絡人1",
                                width: 120
                            },
                            "cellphone": {
                                displayName: "手機",
                                width: 120
                            },
                            "shp_desc": {
                                displayName: "業務性質",
                                width: 120
                            },
                            "big_key": {
                                displayName: "譯音碼",
                                width: 120
                            }
                        },
                        filterItems: {
                            cus_name: {
                                type: "input",
                                name: "cus_name",
                                label: "客戶名稱"
                            },
                            cus_tel1: {
                                type: "input",
                                name: "cus_tel1",
                                label: "客戶電話1"
                            }
                        }
                    },
                    selcus_att: {
                        title: "連絡人",
                        ngdialogSize: "ngdialog-md", //視窗大小 ngdialog-xs 特小 ngdialog-sm 小,ngdialog-md 大,ngdialog-lg特大
                        queryUrl: "bas/cusatt/query", //查詢地址
                        headers: {
                            "attname": {
                                displayName: "連絡人",
                                width: 120
                            },
                            "chunwei": {
                                displayName: "稱謂",
                                width: 120
                            },
                            "dept_id": {
                                displayName: "部門代號",
                                width: 120
                            },
                            "t_nbr": {
                                displayName: "職稱編號",
                                width: 120
                            },
                            "att_tel": {
                                displayName: "電話",
                                width: 120
                            },
                            "att_oth": {
                                displayName: "分機",
                                width: 120
                            },
                            "att_fax": {
                                displayName: "傳真",
                                width: 120
                            },
                            "cellphone": {
                                displayName: "手機",
                                width: 120
                            },
                            "email": {
                                displayName: "EMAIL",
                                width: 120
                            },
                            "remark": {
                                displayName: "備註",
                                width: 120
                            },
                        },
                        filterItems: {
                            attname: {
                                type: "input",
                                name: "attname",
                                label: "連絡人"
                            }
                        }
                    },
                    selitm1: {
                        title: "料品基本檔",
                        ngdialogSize: "ngdialog-md", //視窗大小 ngdialog-xs 特小 ngdialog-sm 小,ngdialog-md 大,ngdialog-lg特大
                        queryUrl: "bas/invitm/query", //查詢地址
                        headers: {
                            "item_nbr": {
                                displayName: "產品編號",
                                width: 120
                            },
                            "item_alias": {
                                displayName: "產品簡稱",
                                width: 120
                            },
                            "item_desc": {
                                displayName: "品名規格",
                                width: 120
                            },
                            "q_code": {
                                displayName: "查詢碼",
                                width: 120
                            },
                            "big_key": {
                                displayName: "譯音碼",
                                width: 120
                            },
                            "status": {
                                displayName: "狀態",
                                width: 120
                            },
                            "shp_desc": {
                                displayName: "業務性質",
                                width: 120
                            },
                            "unit_price": {
                                displayName: "標準售價",
                                width: 120
                            },
                            "unit_cost": {
                                displayName: "總成本",
                                width: 120
                            }
                        },
                        filterItems: {
                            item_nbr: {
                                type: "input",
                                name: "item_nbr",
                                label: "產品編號"
                            },
                            item_alias: {
                                type: "input",
                                name: "item_alias",
                                label: "產品簡稱"
                            }
                        }
                    },
                    selmj: {
                        title: "模具資料",
                        ngdialogSize: "ngdialog-md", //視窗大小 ngdialog-xs 特小 ngdialog-sm 小,ngdialog-md 大,ngdialog-lg特大
                        queryUrl: "bas/basmj/query", //查詢地址
                        headers: {
                            "mj_nbr": {
                                displayName: "印版代號",
                                width: 120
                            },
                            "mj_name": {
                                displayName: "模具名稱",
                                width: 120
                            },
                            "mj_type": {
                                displayName: "印版",
                                width: 120
                            },
                            "ven_nbr": {
                                displayName: "廠商代號",
                                width: 120
                            },
                            "inv_type": {
                                displayName: "所有權",
                                width: 120
                            },
                            "cus_nbr": {
                                displayName: "客戶代號",
                                width: 120
                            },
                            "remark": {
                                displayName: "備註",
                                width: 120
                            }
                        },
                        filterItems: {
                            mj_name: {
                                type: "input",
                                name: "mj_name",
                                label: "模具名稱"
                            }
                        }
                        
                    },
                    seloth: {
                        title: "產品參考號碼檔",
                        ngdialogSize: "ngdialog-md", //視窗大小 ngdialog-xs 特小 ngdialog-sm 小,ngdialog-md 大,ngdialog-lg特大
                        queryUrl: "bas/invoth/query", //查詢地址
                        headers: {
                            "cus_item": {
                                displayName: "參考號碼",
                                width: 120
                            },
                            "item_nbr": {
                                displayName: "產品編號",
                                width: 120
                            },
                            "company": {
                                displayName: "使用產牌",
                                width: 120
                            },
                            "car_nbr": {
                                displayName: "車型型號",
                                width: 120
                            },
                            "cus_nbr": {
                                displayName: "客戶編號",
                                width: 120
                            },
                            "remark": {
                                displayName: "備註",
                                width: 120
                            }
                        },
                        filterItems: {
                            item_nbr: {
                                type: "input",
                                name: "item_nbr",
                                label: "產品編號"
                            }
                        }
                    },
                    selpro: {
                        title: "製成基本檔",
                        ngdialogSize: "ngdialog-md", //視窗大小 ngdialog-xs 特小 ngdialog-sm 小,ngdialog-md 大,ngdialog-lg特大
                        queryUrl: "bas/baspro/query", //查詢地址
                        headers: {
                            "pro_nbr": {
                                displayName: "製程代號",
                                width: 120
                            },
                            "pro_desc": {
                                displayName: "製程說明",
                                width: 120
                            },
                            "pro_days": {
                                displayName: "製程天數",
                                width: 120
                            }
                        },
                        filterItems: {
                            pro_nbr: {
                                type: "input",
                                name: "pro_nbr",
                                label: "製程代號"
                            }
                        }
                        
                    },
                    selven: {
                        title: "廠商主檔",
                        ngdialogSize: "ngdialog-md", //視窗大小 ngdialog-xs 特小 ngdialog-sm 小,ngdialog-md 大,ngdialog-lg特大
                        queryUrl: "bas/purven/query", //查詢地址
                        headers: {
                            "ven_nbr": {
                                displayName: "廠商編號",
                                width: 120
                            },
                            "ven_name": {
                                displayName: "廠商名稱",
                                width: 120
                            },
                            "ven_tel1": {
                                displayName: "廠商電話1",
                                width: 120
                            },
                            "ven_fax": {
                                displayName: "傳真機號碼",
                                width: 120
                            },
                            "shp_desc": {
                                displayName: "業務性質",
                                width: 120
                            },
                            "ven_gun": {
                                displayName: "統一編號",
                                width: 120
                            },
                            "big_key": {
                                displayName: "譯音碼",
                                width: 120
                            },
                            "sen_addr": {
                                displayName: "工廠地址",
                                width: 120
                            }
                        },
                        filterItems: {
                            ven_name: {
                                type: "input",
                                name: "ven_name",
                                label: "廠商名稱"
                            },
                            ven_tel1: {
                                type: "input",
                                name: "ven_tel1",
                                label: "廠商電話1"
                            }
                        }
                    },
                    selrem: {
                        title: "備註主檔",
                        ngdialogSize: "ngdialog-md", //視窗大小 ngdialog-xs 特小 ngdialog-sm 小,ngdialog-md 大,ngdialog-lg特大
                        queryUrl: "bas/basrem/query", //查詢地址
                        headers: {
                            "rem_nbr": {
                                displayName: "備註代號",
                                width: 120
                            },
                            "rem_desc": {
                                displayName: "備註說明",
                                width: 120
                            },
                            "rem_memo": {
                                displayName: "備註明細",
                                width: 120
                            }
                        },
                        filterItems: {
                            rem_nbr: {
                                type: "input",
                                name: "rem_nbr",
                                label: "備註代號"
                            }
                        }
                    },
                    selstaff: {
                        title: "員工主檔",
                        ngdialogSize: "ngdialog-md", //視窗大小 ngdialog-xs 特小 ngdialog-sm 小,ngdialog-md 大,ngdialog-lg特大
                        queryUrl: "bas/pnlemp/query", //查詢地址
                        headers: {
                            "emp_nbr": {
                                displayName: "員工編號",
                                width: 120
                            },
                            "emp_name": {
                                displayName: "中文姓名",
                                width: 120
                            },
                            "tel_no": {
                                displayName: "電話號碼",
                                width: 120
                            },
                            "alarm_name": {
                                displayName: "緊急連絡人",
                                width: 120
                            },
                            "address1": {
                                displayName: "戶籍所在地",
                                width: 120
                            },
                            "address2": {
                                displayName: "通訊地址",
                                width: 120
                            }
                        },
                        filterItems: {
                            emp_name: {
                                type: "input",
                                name: "emp_name",
                                label: "中文姓名"
                            }
                        }
                    },
                    selunt: {
                        title: "單位轉換檔",
                        ngdialogSize: "ngdialog-md", //視窗大小 ngdialog-xs 特小 ngdialog-sm 小,ngdialog-md 大,ngdialog-lg特大
                        queryUrl: "bas/basunt/query", //查詢地址
                        headers: {
                            "unit1": {
                                displayName: "單位代碼1",
                                width: 120
                            },
                            "factor1": {
                                displayName: "單位轉換係數1",
                                width: 120
                            },
                            "unit2": {
                                displayName: "單位代碼2",
                                width: 120
                            },
                            "factor2": {
                                displayName: "單位轉換係數2",
                                width: 120
                            }
                        },
                        filterItems: {
                            unit1: {
                                type: "input",
                                name: "unit1",
                                label: "單位代碼1"
                            }
                        }
                    },
                }
            }
        }
    ]
);
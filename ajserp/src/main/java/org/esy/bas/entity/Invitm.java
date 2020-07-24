package org.esy.bas.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Index;
import javax.persistence.Table;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.esy.base.annotation.EntityInfo;
import org.esy.base.annotation.FieldInfo;
import org.esy.base.core.BaseProperties;
import org.esy.base.annotation.FilterInfo;



/**
 *  实体类
 * 
 * @author <a href="mailto:ardui@163.com"ardui</a
 *  @date Fri Jul 24 12:59:12 CST 2020
 */
@Entity
@Table(name = "inv_itm" ,indexes = { @Index(name = "created", columnList = "created"), 
@Index(name = "updated", columnList = "updated")})
@EntityInfo("料品基本檔")
public class Invitm extends BaseProperties {

	private static final long serialVersionUID = 1L;

	@FieldInfo("產品編號")
	@FilterInfo(ListValue = "")
	@Column(name = "item_nbr", length =32  )
	private String item_nbr ;

	@FieldInfo("產品名稱")
	@FilterInfo(ListValue = "")
	@Column(name = "item_name", length =32  )
	private String item_name ;

	@FieldInfo("譯音碼")
	@FilterInfo(ListValue = "")
	@Column(name = "big_key", length =32  )
	private String big_key ;

	@FieldInfo("查詢碼")
	@FilterInfo(ListValue = "")
	@Column(name = "q_code", length =32  )
	private String q_code ;

	@FieldInfo("品名規格")
	@FilterInfo(ListValue = "")
	@Column(name = "item_desc", columnDefinition = "TEXT")
	private String item_desc;

	@FieldInfo("產品簡稱")
	@FilterInfo(ListValue = "")
	@Column(name = "item_alias", length =32  )
	private String item_alias ;

	@FieldInfo("英文說明")
	@FilterInfo(ListValue = "")
	@Column(name = "eng_name", length =128  )
	private String eng_name ;

	@FieldInfo("進貨單位")
	@FilterInfo(ListValue = "")
	@Column(name = "rec_un", length =32  )
	private String rec_un ;

	@FieldInfo("庫存單位")
	@FilterInfo(ListValue = "")
	@Column(name = "item_un", length =32  )
	private String item_un ;

	@FieldInfo("銷售單位")
	@FilterInfo(ListValue = "")
	@Column(name = "sales_un", length =32  )
	private String sales_un ;

	@FieldInfo("異動庫存")
	@FilterInfo(ListValue = "")
	@Column(name = "ud_oh_ctl", length =32  )
	private String ud_oh_ctl ;

	@FieldInfo("安全存量")
	@FilterInfo(ListValue = "")
	@Column(name = "safety_qty")
	private Double safety_qty;

	@FieldInfo("儲存倉庫")
	@FilterInfo(ListValue = "")
	@Column(name = "ware_nbr", length =32  )
	private String ware_nbr ;

	@FieldInfo("料品型態")
	@FilterInfo(ListValue = "")
	@Column(name = "item_type", length =32  )
	private String item_type ;

	@FieldInfo("料品類別")
	@FilterInfo(ListValue = "")
	@Column(name = "m_type", length =32  )
	private String m_type ;

	@FieldInfo("料品來源")
	@FilterInfo(ListValue = "")
	@Column(name = "i_type", length =32  )
	private String i_type ;

	@FieldInfo("採購單位量")
	@FilterInfo(ListValue = "")
	@Column(name = "a_in_qty")
	private Double a_in_qty;

	@FieldInfo("採購廠商")
	@FilterInfo(ListValue = "")
	@Column(name = "ven_nbr", length =32  )
	private String ven_nbr ;

	@FieldInfo("原料代號")
	@FilterInfo(ListValue = "")
	@Column(name = "item_nbr1", length =32  )
	private String item_nbr1 ;

	@FieldInfo("原料製程")
	@FilterInfo(ListValue = "")
	@Column(name = "pro_nbr", length =32  )
	private String pro_nbr ;

	@FieldInfo("原料耗用量")
	@FilterInfo(ListValue = "")
	@Column(name = "mat_qty")
	private Double mat_qty;

	@FieldInfo("原料耗用單位")
	@FilterInfo(ListValue = "")
	@Column(name = "mat_un", length =32  )
	private String mat_un ;

	@FieldInfo("標準售價")
	@FilterInfo(ListValue = "")
	@Column(name = "unit_price")
	private Double unit_price;

	@FieldInfo("最低售價")
	@FilterInfo(ListValue = "")
	@Column(name = "bot_price")
	private Double bot_price;

	@FieldInfo("售價方式")
	@FilterInfo(ListValue = "")
	@Column(name = "pri_type", length =32  )
	private String pri_type ;

	@FieldInfo("1 級客戶售價")
	@FilterInfo(ListValue = "")
	@Column(name = "price_1")
	private Double price_1;

	@FieldInfo("2 級客戶售價")
	@FilterInfo(ListValue = "")
	@Column(name = "price_2")
	private Double price_2;

	@FieldInfo("3 級客戶售價")
	@FilterInfo(ListValue = "")
	@Column(name = "price_3")
	private Double price_3;

	@FieldInfo("4 級客戶售價")
	@FilterInfo(ListValue = "")
	@Column(name = "price_4")
	private Double price_4;

	@FieldInfo("5 級客戶售價")
	@FilterInfo(ListValue = "")
	@Column(name = "price_5")
	private Double price_5;

	@FieldInfo("總成本")
	@FilterInfo(ListValue = "")
	@Column(name = "unit_cost")
	private Double unit_cost;

	@FieldInfo("原料成本")
	@FilterInfo(ListValue = "")
	@Column(name = "matl_cost")
	private Double matl_cost;

	@FieldInfo("製造成本")
	@FilterInfo(ListValue = "")
	@Column(name = "labor_cost")
	private Double labor_cost;

	@FieldInfo("其他成本")
	@FilterInfo(ListValue = "")
	@Column(name = "other_cost")
	private Double other_cost;

	@FieldInfo("內盒")
	@FilterInfo(ListValue = "")
	@Column(name = "in_box")
	private Integer in_box;

	@FieldInfo("外箱")
	@FilterInfo(ListValue = "")
	@Column(name = "qty_pbox")
	private Integer qty_pbox;

	@FieldInfo("才數")
	@FilterInfo(ListValue = "")
	@Column(name = "cuft")
	private Double cuft;

	@FieldInfo("淨重")
	@FilterInfo(ListValue = "")
	@Column(name = "n_wight")
	private Double n_wight;

	@FieldInfo("毛重")
	@FilterInfo(ListValue = "")
	@Column(name = "g_wight")
	private Double g_wight;

	@FieldInfo("備註")
	@FilterInfo(ListValue = "")
	@Column(name = "remark", columnDefinition = "TEXT")
	private String remark;

	@FieldInfo("庫存量")
	@FilterInfo(ListValue = "")
	@Column(name = "oh_qty")
	private Double oh_qty;

	@FieldInfo("已定未進量")
	@FilterInfo(ListValue = "")
	@Column(name = "pur_qty")
	private Double pur_qty;

	@FieldInfo("已接單未出貨量")
	@FilterInfo(ListValue = "")
	@Column(name = "ord_qty")
	private Double ord_qty;

	@FieldInfo("已委外未收回量")
	@FilterInfo(ListValue = "")
	@Column(name = "sub_qty")
	private Double sub_qty;

	@FieldInfo("新價實施日")
	@FilterInfo(ListValue = "")
	@Column(name = "newdate")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date newdate;

	@FieldInfo("最後交易日")
	@FilterInfo(ListValue = "")
	@Column(name = "l_shpdate")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date l_shpdate;

	@FieldInfo("最近異動日期")
	@FilterInfo(ListValue = "")
	@Column(name = "l_update")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date l_update;

	@FieldInfo("圖檔")
	@FilterInfo(ListValue = "")
	@Column(name = "image", length =128  )
	private String image ;

	@FieldInfo("產品描述")
	@FilterInfo(ListValue = "")
	@Column(name = "itemdesc", columnDefinition = "TEXT")
	private String itemdesc;

	@FieldInfo("英文產品描述")
	@FilterInfo(ListValue = "")
	@Column(name = "edesc", columnDefinition = "TEXT")
	private String edesc;

	@FieldInfo("狀態")
	@FilterInfo(ListValue = "")
	@Column(name = "status")
	private Integer status;

	@FieldInfo("業務性質")
	@FilterInfo(ListValue = "")
	@Column(name = "shp_desc", length =128  )
	private String shp_desc ;

	@FieldInfo("選取")
	@FilterInfo(ListValue = "")
	@Column(name = "isedit")
	private Integer isedit;

	@FieldInfo("產品單重")
	@FilterInfo(ListValue = "")
	@Column(name = "p_weight", length =32  )
	private String p_weight ;

	@FieldInfo("加工總數")
	@FilterInfo(ListValue = "")
	@Column(name = "cyc_time")
	private Double cyc_time;

	@FieldInfo("種類")
	@FilterInfo(ListValue = "")
	@Column(name = "item_ctl", length =32  )
	private String item_ctl ;

	@FieldInfo("CAD文件")
	@FilterInfo(ListValue = "")
	@Column(name = "cadfile", length =128  )
	private String cadfile ;

	@FieldInfo("最近修改日")
	@FilterInfo(ListValue = "")
	@Column(name = "l_edtdate")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date l_edtdate;

	@FieldInfo("最近建立日")
	@FilterInfo(ListValue = "")
	@Column(name = "l_crtdate")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date l_crtdate;

	@FieldInfo("料號共用種類")
	@FilterInfo(ListValue = "")
	@Column(name = "sys_type", length =32  )
	private String sys_type ;

	@FieldInfo("儲位")
	@FilterInfo(ListValue = "")
	@Column(name = "stock_desc", length =32  )
	private String stock_desc ;

	@FieldInfo("條碼編號")
	@FilterInfo(ListValue = "")
	@Column(name = "bar_code", length =32  )
	private String bar_code ;

	@FieldInfo("自編碼")
	@FilterInfo(ListValue = "")
	@Column(name = "bar_code2", length =32  )
	private String bar_code2 ;

	@FieldInfo("模具編號")
	@FilterInfo(ListValue = "")
	@Column(name = "mj_nbr", length =32  )
	private String mj_nbr ;

	@FieldInfo(" 最後使用日")
	@FilterInfo(ListValue = "")
	@Column(name = "l_mjdate")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date l_mjdate;

	@FieldInfo("最後進貨日")
	@FilterInfo(ListValue = "")
	@Column(name = "l_recdate")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date l_recdate;

	@FieldInfo("最近進價")
	@FilterInfo(ListValue = "")
	@Column(name = "last_price")
	private Double last_price;

	@FieldInfo("採購廠商")
	@FilterInfo(ListValue = "")
	@Column(name = "last_ven", length =32  )
	private String last_ven ;

	@FieldInfo("建檔日期")
	@FilterInfo(ListValue = "")
	@Column(name = "cre_date")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date cre_date;

	@FieldInfo("建檔日期")
	@FilterInfo(ListValue = "")
	@Column(name = "crt_date")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date crt_date;

	@FieldInfo("建檔人員")
	@FilterInfo(ListValue = "")
	@Column(name = "crt_user", length =32  )
	private String crt_user ;

	@FieldInfo("最近修改日期")
	@FilterInfo(ListValue = "")
	@Column(name = "edit_date")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date edit_date;

	@FieldInfo("最近修改人員")
	@FilterInfo(ListValue = "")
	@Column(name = "edit_user", length =32  )
	private String edit_user ;

	@FieldInfo("周轉率")
	@FilterInfo(ListValue = "")
	@Column(name = "zz_per")
	private Double zz_per;

	@FieldInfo("發票產編")
	@FilterInfo(ListValue = "")
	@Column(name = "ivc_itm", length =32  )
	private String ivc_itm ;

	@FieldInfo("是否發票品")
	@FilterInfo(ListValue = "")
	@Column(name = "isivc_itm")
	private Integer isivc_itm;

	@FieldInfo("車型型號")
	@FilterInfo(ListValue = "")
	@Column(name = "car_nbr", length =128  )
	private String car_nbr ;

	@FieldInfo("序號起始碼")
	@FilterInfo(ListValue = "")
	@Column(name = "begin_nbr", length =32  )
	private String begin_nbr ;

	@FieldInfo("序號碼數")
	@FilterInfo(ListValue = "")
	@Column(name = "nbr_seq")
	private Integer nbr_seq;

	@FieldInfo("包裝說明")
	@FilterInfo(ListValue = "")
	@Column(name = "bz_desc", length =32  )
	private String bz_desc ;

	@FieldInfo("轉出狀態")
	@FilterInfo(ListValue = "")
	@Column(name = "tranok", length =32  )
	private String tranok ;

	@FieldInfo("操作類型")
	@FilterInfo(ListValue = "")
	@Column(name = "tranop", length =32  )
	private String tranop ;

	@FieldInfo("轉出次數")
	@FilterInfo(ListValue = "")
	@Column(name = "trancnt")
	private Integer trancnt;


     /**
	 *
	 * 构造函数
	 *
	 */
	public Invitm() {
		super();
	}
	
	/**
	 *
	 * 构造函数
	 *
	 	 * @param item_nbr
	 *		  產品編號
	 * 
	 	 * @param item_name
	 *		  產品名稱
	 * 
	 	 * @param big_key
	 *		  譯音碼
	 * 
	 	 * @param q_code
	 *		  查詢碼
	 * 
	 	 * @param item_desc
	 *		  品名規格
	 * 
	 	 * @param item_alias
	 *		  產品簡稱
	 * 
	 	 * @param eng_name
	 *		  英文說明
	 * 
	 	 * @param rec_un
	 *		  進貨單位
	 * 
	 	 * @param item_un
	 *		  庫存單位
	 * 
	 	 * @param sales_un
	 *		  銷售單位
	 * 
	 	 * @param ud_oh_ctl
	 *		  異動庫存
	 * 
	 	 * @param safety_qty
	 *		  安全存量
	 * 
	 	 * @param ware_nbr
	 *		  儲存倉庫
	 * 
	 	 * @param item_type
	 *		  料品型態
	 * 
	 	 * @param m_type
	 *		  料品類別
	 * 
	 	 * @param i_type
	 *		  料品來源
	 * 
	 	 * @param a_in_qty
	 *		  採購單位量
	 * 
	 	 * @param ven_nbr
	 *		  採購廠商
	 * 
	 	 * @param item_nbr1
	 *		  原料代號
	 * 
	 	 * @param pro_nbr
	 *		  原料製程
	 * 
	 	 * @param mat_qty
	 *		  原料耗用量
	 * 
	 	 * @param mat_un
	 *		  原料耗用單位
	 * 
	 	 * @param unit_price
	 *		  標準售價
	 * 
	 	 * @param bot_price
	 *		  最低售價
	 * 
	 	 * @param pri_type
	 *		  售價方式
	 * 
	 	 * @param price_1
	 *		  1 級客戶售價
	 * 
	 	 * @param price_2
	 *		  2 級客戶售價
	 * 
	 	 * @param price_3
	 *		  3 級客戶售價
	 * 
	 	 * @param price_4
	 *		  4 級客戶售價
	 * 
	 	 * @param price_5
	 *		  5 級客戶售價
	 * 
	 	 * @param unit_cost
	 *		  總成本
	 * 
	 	 * @param matl_cost
	 *		  原料成本
	 * 
	 	 * @param labor_cost
	 *		  製造成本
	 * 
	 	 * @param other_cost
	 *		  其他成本
	 * 
	 	 * @param in_box
	 *		  內盒
	 * 
	 	 * @param qty_pbox
	 *		  外箱
	 * 
	 	 * @param cuft
	 *		  才數
	 * 
	 	 * @param n_wight
	 *		  淨重
	 * 
	 	 * @param g_wight
	 *		  毛重
	 * 
	 	 * @param remark
	 *		  備註
	 * 
	 	 * @param oh_qty
	 *		  庫存量
	 * 
	 	 * @param pur_qty
	 *		  已定未進量
	 * 
	 	 * @param ord_qty
	 *		  已接單未出貨量
	 * 
	 	 * @param sub_qty
	 *		  已委外未收回量
	 * 
	 	 * @param newdate
	 *		  新價實施日
	 * 
	 	 * @param l_shpdate
	 *		  最後交易日
	 * 
	 	 * @param l_update
	 *		  最近異動日期
	 * 
	 	 * @param image
	 *		  圖檔
	 * 
	 	 * @param itemdesc
	 *		  產品描述
	 * 
	 	 * @param edesc
	 *		  英文產品描述
	 * 
	 	 * @param status
	 *		  狀態
	 * 
	 	 * @param shp_desc
	 *		  業務性質
	 * 
	 	 * @param isedit
	 *		  選取
	 * 
	 	 * @param p_weight
	 *		  產品單重
	 * 
	 	 * @param cyc_time
	 *		  加工總數
	 * 
	 	 * @param item_ctl
	 *		  種類
	 * 
	 	 * @param cadfile
	 *		  CAD文件
	 * 
	 	 * @param l_edtdate
	 *		  最近修改日
	 * 
	 	 * @param l_crtdate
	 *		  最近建立日
	 * 
	 	 * @param sys_type
	 *		  料號共用種類
	 * 
	 	 * @param stock_desc
	 *		  儲位
	 * 
	 	 * @param bar_code
	 *		  條碼編號
	 * 
	 	 * @param bar_code2
	 *		  自編碼
	 * 
	 	 * @param mj_nbr
	 *		  模具編號
	 * 
	 	 * @param l_mjdate
	 *		   最後使用日
	 * 
	 	 * @param l_recdate
	 *		  最後進貨日
	 * 
	 	 * @param last_price
	 *		  最近進價
	 * 
	 	 * @param last_ven
	 *		  採購廠商
	 * 
	 	 * @param cre_date
	 *		  建檔日期
	 * 
	 	 * @param crt_date
	 *		  建檔日期
	 * 
	 	 * @param crt_user
	 *		  建檔人員
	 * 
	 	 * @param edit_date
	 *		  最近修改日期
	 * 
	 	 * @param edit_user
	 *		  最近修改人員
	 * 
	 	 * @param zz_per
	 *		  周轉率
	 * 
	 	 * @param ivc_itm
	 *		  發票產編
	 * 
	 	 * @param isivc_itm
	 *		  是否發票品
	 * 
	 	 * @param car_nbr
	 *		  車型型號
	 * 
	 	 * @param begin_nbr
	 *		  序號起始碼
	 * 
	 	 * @param nbr_seq
	 *		  序號碼數
	 * 
	 	 * @param bz_desc
	 *		  包裝說明
	 * 
	 	 * @param tranok
	 *		  轉出狀態
	 * 
	 	 * @param tranop
	 *		  操作類型
	 * 
	 	 * @param trancnt
	 *		  轉出次數
	 * 
	 	 */
    	public Invitm( String item_nbr, String item_name, String big_key, String q_code, String item_desc, String item_alias, String eng_name, String rec_un, String item_un, String sales_un, String ud_oh_ctl, Double safety_qty, String ware_nbr, String item_type, String m_type, String i_type, Double a_in_qty, String ven_nbr, String item_nbr1, String pro_nbr, Double mat_qty, String mat_un, Double unit_price, Double bot_price, String pri_type, Double price_1, Double price_2, Double price_3, Double price_4, Double price_5, Double unit_cost, Double matl_cost, Double labor_cost, Double other_cost, Integer in_box, Integer qty_pbox, Double cuft, Double n_wight, Double g_wight, String remark, Double oh_qty, Double pur_qty, Double ord_qty, Double sub_qty, Date newdate, Date l_shpdate, Date l_update, String image, String itemdesc, String edesc, Integer status, String shp_desc, Integer isedit, String p_weight, Double cyc_time, String item_ctl, String cadfile, Date l_edtdate, Date l_crtdate, String sys_type, String stock_desc, String bar_code, String bar_code2, String mj_nbr, Date l_mjdate, Date l_recdate, Double last_price, String last_ven, Date cre_date, Date crt_date, String crt_user, Date edit_date, String edit_user, Double zz_per, String ivc_itm, Integer isivc_itm, String car_nbr, String begin_nbr, Integer nbr_seq, String bz_desc, String tranok, String tranop, Integer trancnt ) {
		super();
				this.item_nbr = item_nbr;
				this.item_name = item_name;
				this.big_key = big_key;
				this.q_code = q_code;
				this.item_desc = item_desc;
				this.item_alias = item_alias;
				this.eng_name = eng_name;
				this.rec_un = rec_un;
				this.item_un = item_un;
				this.sales_un = sales_un;
				this.ud_oh_ctl = ud_oh_ctl;
				this.safety_qty = safety_qty;
				this.ware_nbr = ware_nbr;
				this.item_type = item_type;
				this.m_type = m_type;
				this.i_type = i_type;
				this.a_in_qty = a_in_qty;
				this.ven_nbr = ven_nbr;
				this.item_nbr1 = item_nbr1;
				this.pro_nbr = pro_nbr;
				this.mat_qty = mat_qty;
				this.mat_un = mat_un;
				this.unit_price = unit_price;
				this.bot_price = bot_price;
				this.pri_type = pri_type;
				this.price_1 = price_1;
				this.price_2 = price_2;
				this.price_3 = price_3;
				this.price_4 = price_4;
				this.price_5 = price_5;
				this.unit_cost = unit_cost;
				this.matl_cost = matl_cost;
				this.labor_cost = labor_cost;
				this.other_cost = other_cost;
				this.in_box = in_box;
				this.qty_pbox = qty_pbox;
				this.cuft = cuft;
				this.n_wight = n_wight;
				this.g_wight = g_wight;
				this.remark = remark;
				this.oh_qty = oh_qty;
				this.pur_qty = pur_qty;
				this.ord_qty = ord_qty;
				this.sub_qty = sub_qty;
				this.newdate = newdate;
				this.l_shpdate = l_shpdate;
				this.l_update = l_update;
				this.image = image;
				this.itemdesc = itemdesc;
				this.edesc = edesc;
				this.status = status;
				this.shp_desc = shp_desc;
				this.isedit = isedit;
				this.p_weight = p_weight;
				this.cyc_time = cyc_time;
				this.item_ctl = item_ctl;
				this.cadfile = cadfile;
				this.l_edtdate = l_edtdate;
				this.l_crtdate = l_crtdate;
				this.sys_type = sys_type;
				this.stock_desc = stock_desc;
				this.bar_code = bar_code;
				this.bar_code2 = bar_code2;
				this.mj_nbr = mj_nbr;
				this.l_mjdate = l_mjdate;
				this.l_recdate = l_recdate;
				this.last_price = last_price;
				this.last_ven = last_ven;
				this.cre_date = cre_date;
				this.crt_date = crt_date;
				this.crt_user = crt_user;
				this.edit_date = edit_date;
				this.edit_user = edit_user;
				this.zz_per = zz_per;
				this.ivc_itm = ivc_itm;
				this.isivc_itm = isivc_itm;
				this.car_nbr = car_nbr;
				this.begin_nbr = begin_nbr;
				this.nbr_seq = nbr_seq;
				this.bz_desc = bz_desc;
				this.tranok = tranok;
				this.tranop = tranop;
				this.trancnt = trancnt;
			}

		/**
	 * @return item_nbr
	 *			產品編號
	 */
	public String getItem_nbr() {
		return item_nbr;
	}

	/**
	 * @param item_nbr
	 *			產品編號
	 */
	public void setItem_nbr(String Item_nbr) {
		this.item_nbr = Item_nbr;
	}
		/**
	 * @return item_name
	 *			產品名稱
	 */
	public String getItem_name() {
		return item_name;
	}

	/**
	 * @param item_name
	 *			產品名稱
	 */
	public void setItem_name(String Item_name) {
		this.item_name = Item_name;
	}
		/**
	 * @return big_key
	 *			譯音碼
	 */
	public String getBig_key() {
		return big_key;
	}

	/**
	 * @param big_key
	 *			譯音碼
	 */
	public void setBig_key(String Big_key) {
		this.big_key = Big_key;
	}
		/**
	 * @return q_code
	 *			查詢碼
	 */
	public String getQ_code() {
		return q_code;
	}

	/**
	 * @param q_code
	 *			查詢碼
	 */
	public void setQ_code(String Q_code) {
		this.q_code = Q_code;
	}
		/**
	 * @return item_desc
	 *			品名規格
	 */
	public String getItem_desc() {
		return item_desc;
	}

	/**
	 * @param item_desc
	 *			品名規格
	 */
	public void setItem_desc(String Item_desc) {
		this.item_desc = Item_desc;
	}
		/**
	 * @return item_alias
	 *			產品簡稱
	 */
	public String getItem_alias() {
		return item_alias;
	}

	/**
	 * @param item_alias
	 *			產品簡稱
	 */
	public void setItem_alias(String Item_alias) {
		this.item_alias = Item_alias;
	}
		/**
	 * @return eng_name
	 *			英文說明
	 */
	public String getEng_name() {
		return eng_name;
	}

	/**
	 * @param eng_name
	 *			英文說明
	 */
	public void setEng_name(String Eng_name) {
		this.eng_name = Eng_name;
	}
		/**
	 * @return rec_un
	 *			進貨單位
	 */
	public String getRec_un() {
		return rec_un;
	}

	/**
	 * @param rec_un
	 *			進貨單位
	 */
	public void setRec_un(String Rec_un) {
		this.rec_un = Rec_un;
	}
		/**
	 * @return item_un
	 *			庫存單位
	 */
	public String getItem_un() {
		return item_un;
	}

	/**
	 * @param item_un
	 *			庫存單位
	 */
	public void setItem_un(String Item_un) {
		this.item_un = Item_un;
	}
		/**
	 * @return sales_un
	 *			銷售單位
	 */
	public String getSales_un() {
		return sales_un;
	}

	/**
	 * @param sales_un
	 *			銷售單位
	 */
	public void setSales_un(String Sales_un) {
		this.sales_un = Sales_un;
	}
		/**
	 * @return ud_oh_ctl
	 *			異動庫存
	 */
	public String getUd_oh_ctl() {
		return ud_oh_ctl;
	}

	/**
	 * @param ud_oh_ctl
	 *			異動庫存
	 */
	public void setUd_oh_ctl(String Ud_oh_ctl) {
		this.ud_oh_ctl = Ud_oh_ctl;
	}
		/**
	 * @return safety_qty
	 *			安全存量
	 */
	public Double getSafety_qty() {
		return safety_qty;
	}

	/**
	 * @param safety_qty
	 *			安全存量
	 */
	public void setSafety_qty(Double Safety_qty) {
		this.safety_qty = Safety_qty;
	}
		/**
	 * @return ware_nbr
	 *			儲存倉庫
	 */
	public String getWare_nbr() {
		return ware_nbr;
	}

	/**
	 * @param ware_nbr
	 *			儲存倉庫
	 */
	public void setWare_nbr(String Ware_nbr) {
		this.ware_nbr = Ware_nbr;
	}
		/**
	 * @return item_type
	 *			料品型態
	 */
	public String getItem_type() {
		return item_type;
	}

	/**
	 * @param item_type
	 *			料品型態
	 */
	public void setItem_type(String Item_type) {
		this.item_type = Item_type;
	}
		/**
	 * @return m_type
	 *			料品類別
	 */
	public String getM_type() {
		return m_type;
	}

	/**
	 * @param m_type
	 *			料品類別
	 */
	public void setM_type(String M_type) {
		this.m_type = M_type;
	}
		/**
	 * @return i_type
	 *			料品來源
	 */
	public String getI_type() {
		return i_type;
	}

	/**
	 * @param i_type
	 *			料品來源
	 */
	public void setI_type(String I_type) {
		this.i_type = I_type;
	}
		/**
	 * @return a_in_qty
	 *			採購單位量
	 */
	public Double getA_in_qty() {
		return a_in_qty;
	}

	/**
	 * @param a_in_qty
	 *			採購單位量
	 */
	public void setA_in_qty(Double A_in_qty) {
		this.a_in_qty = A_in_qty;
	}
		/**
	 * @return ven_nbr
	 *			採購廠商
	 */
	public String getVen_nbr() {
		return ven_nbr;
	}

	/**
	 * @param ven_nbr
	 *			採購廠商
	 */
	public void setVen_nbr(String Ven_nbr) {
		this.ven_nbr = Ven_nbr;
	}
		/**
	 * @return item_nbr1
	 *			原料代號
	 */
	public String getItem_nbr1() {
		return item_nbr1;
	}

	/**
	 * @param item_nbr1
	 *			原料代號
	 */
	public void setItem_nbr1(String Item_nbr1) {
		this.item_nbr1 = Item_nbr1;
	}
		/**
	 * @return pro_nbr
	 *			原料製程
	 */
	public String getPro_nbr() {
		return pro_nbr;
	}

	/**
	 * @param pro_nbr
	 *			原料製程
	 */
	public void setPro_nbr(String Pro_nbr) {
		this.pro_nbr = Pro_nbr;
	}
		/**
	 * @return mat_qty
	 *			原料耗用量
	 */
	public Double getMat_qty() {
		return mat_qty;
	}

	/**
	 * @param mat_qty
	 *			原料耗用量
	 */
	public void setMat_qty(Double Mat_qty) {
		this.mat_qty = Mat_qty;
	}
		/**
	 * @return mat_un
	 *			原料耗用單位
	 */
	public String getMat_un() {
		return mat_un;
	}

	/**
	 * @param mat_un
	 *			原料耗用單位
	 */
	public void setMat_un(String Mat_un) {
		this.mat_un = Mat_un;
	}
		/**
	 * @return unit_price
	 *			標準售價
	 */
	public Double getUnit_price() {
		return unit_price;
	}

	/**
	 * @param unit_price
	 *			標準售價
	 */
	public void setUnit_price(Double Unit_price) {
		this.unit_price = Unit_price;
	}
		/**
	 * @return bot_price
	 *			最低售價
	 */
	public Double getBot_price() {
		return bot_price;
	}

	/**
	 * @param bot_price
	 *			最低售價
	 */
	public void setBot_price(Double Bot_price) {
		this.bot_price = Bot_price;
	}
		/**
	 * @return pri_type
	 *			售價方式
	 */
	public String getPri_type() {
		return pri_type;
	}

	/**
	 * @param pri_type
	 *			售價方式
	 */
	public void setPri_type(String Pri_type) {
		this.pri_type = Pri_type;
	}
		/**
	 * @return price_1
	 *			1 級客戶售價
	 */
	public Double getPrice_1() {
		return price_1;
	}

	/**
	 * @param price_1
	 *			1 級客戶售價
	 */
	public void setPrice_1(Double Price_1) {
		this.price_1 = Price_1;
	}
		/**
	 * @return price_2
	 *			2 級客戶售價
	 */
	public Double getPrice_2() {
		return price_2;
	}

	/**
	 * @param price_2
	 *			2 級客戶售價
	 */
	public void setPrice_2(Double Price_2) {
		this.price_2 = Price_2;
	}
		/**
	 * @return price_3
	 *			3 級客戶售價
	 */
	public Double getPrice_3() {
		return price_3;
	}

	/**
	 * @param price_3
	 *			3 級客戶售價
	 */
	public void setPrice_3(Double Price_3) {
		this.price_3 = Price_3;
	}
		/**
	 * @return price_4
	 *			4 級客戶售價
	 */
	public Double getPrice_4() {
		return price_4;
	}

	/**
	 * @param price_4
	 *			4 級客戶售價
	 */
	public void setPrice_4(Double Price_4) {
		this.price_4 = Price_4;
	}
		/**
	 * @return price_5
	 *			5 級客戶售價
	 */
	public Double getPrice_5() {
		return price_5;
	}

	/**
	 * @param price_5
	 *			5 級客戶售價
	 */
	public void setPrice_5(Double Price_5) {
		this.price_5 = Price_5;
	}
		/**
	 * @return unit_cost
	 *			總成本
	 */
	public Double getUnit_cost() {
		return unit_cost;
	}

	/**
	 * @param unit_cost
	 *			總成本
	 */
	public void setUnit_cost(Double Unit_cost) {
		this.unit_cost = Unit_cost;
	}
		/**
	 * @return matl_cost
	 *			原料成本
	 */
	public Double getMatl_cost() {
		return matl_cost;
	}

	/**
	 * @param matl_cost
	 *			原料成本
	 */
	public void setMatl_cost(Double Matl_cost) {
		this.matl_cost = Matl_cost;
	}
		/**
	 * @return labor_cost
	 *			製造成本
	 */
	public Double getLabor_cost() {
		return labor_cost;
	}

	/**
	 * @param labor_cost
	 *			製造成本
	 */
	public void setLabor_cost(Double Labor_cost) {
		this.labor_cost = Labor_cost;
	}
		/**
	 * @return other_cost
	 *			其他成本
	 */
	public Double getOther_cost() {
		return other_cost;
	}

	/**
	 * @param other_cost
	 *			其他成本
	 */
	public void setOther_cost(Double Other_cost) {
		this.other_cost = Other_cost;
	}
		/**
	 * @return in_box
	 *			內盒
	 */
	public Integer getIn_box() {
		return in_box;
	}

	/**
	 * @param in_box
	 *			內盒
	 */
	public void setIn_box(Integer In_box) {
		this.in_box = In_box;
	}
		/**
	 * @return qty_pbox
	 *			外箱
	 */
	public Integer getQty_pbox() {
		return qty_pbox;
	}

	/**
	 * @param qty_pbox
	 *			外箱
	 */
	public void setQty_pbox(Integer Qty_pbox) {
		this.qty_pbox = Qty_pbox;
	}
		/**
	 * @return cuft
	 *			才數
	 */
	public Double getCuft() {
		return cuft;
	}

	/**
	 * @param cuft
	 *			才數
	 */
	public void setCuft(Double Cuft) {
		this.cuft = Cuft;
	}
		/**
	 * @return n_wight
	 *			淨重
	 */
	public Double getN_wight() {
		return n_wight;
	}

	/**
	 * @param n_wight
	 *			淨重
	 */
	public void setN_wight(Double N_wight) {
		this.n_wight = N_wight;
	}
		/**
	 * @return g_wight
	 *			毛重
	 */
	public Double getG_wight() {
		return g_wight;
	}

	/**
	 * @param g_wight
	 *			毛重
	 */
	public void setG_wight(Double G_wight) {
		this.g_wight = G_wight;
	}
		/**
	 * @return remark
	 *			備註
	 */
	public String getRemark() {
		return remark;
	}

	/**
	 * @param remark
	 *			備註
	 */
	public void setRemark(String Remark) {
		this.remark = Remark;
	}
		/**
	 * @return oh_qty
	 *			庫存量
	 */
	public Double getOh_qty() {
		return oh_qty;
	}

	/**
	 * @param oh_qty
	 *			庫存量
	 */
	public void setOh_qty(Double Oh_qty) {
		this.oh_qty = Oh_qty;
	}
		/**
	 * @return pur_qty
	 *			已定未進量
	 */
	public Double getPur_qty() {
		return pur_qty;
	}

	/**
	 * @param pur_qty
	 *			已定未進量
	 */
	public void setPur_qty(Double Pur_qty) {
		this.pur_qty = Pur_qty;
	}
		/**
	 * @return ord_qty
	 *			已接單未出貨量
	 */
	public Double getOrd_qty() {
		return ord_qty;
	}

	/**
	 * @param ord_qty
	 *			已接單未出貨量
	 */
	public void setOrd_qty(Double Ord_qty) {
		this.ord_qty = Ord_qty;
	}
		/**
	 * @return sub_qty
	 *			已委外未收回量
	 */
	public Double getSub_qty() {
		return sub_qty;
	}

	/**
	 * @param sub_qty
	 *			已委外未收回量
	 */
	public void setSub_qty(Double Sub_qty) {
		this.sub_qty = Sub_qty;
	}
		/**
	 * @return newdate
	 *			新價實施日
	 */
	public Date getNewdate() {
		return newdate;
	}

	/**
	 * @param newdate
	 *			新價實施日
	 */
	public void setNewdate(Date Newdate) {
		this.newdate = Newdate;
	}
		/**
	 * @return l_shpdate
	 *			最後交易日
	 */
	public Date getL_shpdate() {
		return l_shpdate;
	}

	/**
	 * @param l_shpdate
	 *			最後交易日
	 */
	public void setL_shpdate(Date L_shpdate) {
		this.l_shpdate = L_shpdate;
	}
		/**
	 * @return l_update
	 *			最近異動日期
	 */
	public Date getL_update() {
		return l_update;
	}

	/**
	 * @param l_update
	 *			最近異動日期
	 */
	public void setL_update(Date L_update) {
		this.l_update = L_update;
	}
		/**
	 * @return image
	 *			圖檔
	 */
	public String getImage() {
		return image;
	}

	/**
	 * @param image
	 *			圖檔
	 */
	public void setImage(String Image) {
		this.image = Image;
	}
		/**
	 * @return itemdesc
	 *			產品描述
	 */
	public String getItemdesc() {
		return itemdesc;
	}

	/**
	 * @param itemdesc
	 *			產品描述
	 */
	public void setItemdesc(String Itemdesc) {
		this.itemdesc = Itemdesc;
	}
		/**
	 * @return edesc
	 *			英文產品描述
	 */
	public String getEdesc() {
		return edesc;
	}

	/**
	 * @param edesc
	 *			英文產品描述
	 */
	public void setEdesc(String Edesc) {
		this.edesc = Edesc;
	}
		/**
	 * @return status
	 *			狀態
	 */
	public Integer getStatus() {
		return status;
	}

	/**
	 * @param status
	 *			狀態
	 */
	public void setStatus(Integer Status) {
		this.status = Status;
	}
		/**
	 * @return shp_desc
	 *			業務性質
	 */
	public String getShp_desc() {
		return shp_desc;
	}

	/**
	 * @param shp_desc
	 *			業務性質
	 */
	public void setShp_desc(String Shp_desc) {
		this.shp_desc = Shp_desc;
	}
		/**
	 * @return isedit
	 *			選取
	 */
	public Integer getIsedit() {
		return isedit;
	}

	/**
	 * @param isedit
	 *			選取
	 */
	public void setIsedit(Integer Isedit) {
		this.isedit = Isedit;
	}
		/**
	 * @return p_weight
	 *			產品單重
	 */
	public String getP_weight() {
		return p_weight;
	}

	/**
	 * @param p_weight
	 *			產品單重
	 */
	public void setP_weight(String P_weight) {
		this.p_weight = P_weight;
	}
		/**
	 * @return cyc_time
	 *			加工總數
	 */
	public Double getCyc_time() {
		return cyc_time;
	}

	/**
	 * @param cyc_time
	 *			加工總數
	 */
	public void setCyc_time(Double Cyc_time) {
		this.cyc_time = Cyc_time;
	}
		/**
	 * @return item_ctl
	 *			種類
	 */
	public String getItem_ctl() {
		return item_ctl;
	}

	/**
	 * @param item_ctl
	 *			種類
	 */
	public void setItem_ctl(String Item_ctl) {
		this.item_ctl = Item_ctl;
	}
		/**
	 * @return cadfile
	 *			CAD文件
	 */
	public String getCadfile() {
		return cadfile;
	}

	/**
	 * @param cadfile
	 *			CAD文件
	 */
	public void setCadfile(String Cadfile) {
		this.cadfile = Cadfile;
	}
		/**
	 * @return l_edtdate
	 *			最近修改日
	 */
	public Date getL_edtdate() {
		return l_edtdate;
	}

	/**
	 * @param l_edtdate
	 *			最近修改日
	 */
	public void setL_edtdate(Date L_edtdate) {
		this.l_edtdate = L_edtdate;
	}
		/**
	 * @return l_crtdate
	 *			最近建立日
	 */
	public Date getL_crtdate() {
		return l_crtdate;
	}

	/**
	 * @param l_crtdate
	 *			最近建立日
	 */
	public void setL_crtdate(Date L_crtdate) {
		this.l_crtdate = L_crtdate;
	}
		/**
	 * @return sys_type
	 *			料號共用種類
	 */
	public String getSys_type() {
		return sys_type;
	}

	/**
	 * @param sys_type
	 *			料號共用種類
	 */
	public void setSys_type(String Sys_type) {
		this.sys_type = Sys_type;
	}
		/**
	 * @return stock_desc
	 *			儲位
	 */
	public String getStock_desc() {
		return stock_desc;
	}

	/**
	 * @param stock_desc
	 *			儲位
	 */
	public void setStock_desc(String Stock_desc) {
		this.stock_desc = Stock_desc;
	}
		/**
	 * @return bar_code
	 *			條碼編號
	 */
	public String getBar_code() {
		return bar_code;
	}

	/**
	 * @param bar_code
	 *			條碼編號
	 */
	public void setBar_code(String Bar_code) {
		this.bar_code = Bar_code;
	}
		/**
	 * @return bar_code2
	 *			自編碼
	 */
	public String getBar_code2() {
		return bar_code2;
	}

	/**
	 * @param bar_code2
	 *			自編碼
	 */
	public void setBar_code2(String Bar_code2) {
		this.bar_code2 = Bar_code2;
	}
		/**
	 * @return mj_nbr
	 *			模具編號
	 */
	public String getMj_nbr() {
		return mj_nbr;
	}

	/**
	 * @param mj_nbr
	 *			模具編號
	 */
	public void setMj_nbr(String Mj_nbr) {
		this.mj_nbr = Mj_nbr;
	}
		/**
	 * @return l_mjdate
	 *			 最後使用日
	 */
	public Date getL_mjdate() {
		return l_mjdate;
	}

	/**
	 * @param l_mjdate
	 *			 最後使用日
	 */
	public void setL_mjdate(Date L_mjdate) {
		this.l_mjdate = L_mjdate;
	}
		/**
	 * @return l_recdate
	 *			最後進貨日
	 */
	public Date getL_recdate() {
		return l_recdate;
	}

	/**
	 * @param l_recdate
	 *			最後進貨日
	 */
	public void setL_recdate(Date L_recdate) {
		this.l_recdate = L_recdate;
	}
		/**
	 * @return last_price
	 *			最近進價
	 */
	public Double getLast_price() {
		return last_price;
	}

	/**
	 * @param last_price
	 *			最近進價
	 */
	public void setLast_price(Double Last_price) {
		this.last_price = Last_price;
	}
		/**
	 * @return last_ven
	 *			採購廠商
	 */
	public String getLast_ven() {
		return last_ven;
	}

	/**
	 * @param last_ven
	 *			採購廠商
	 */
	public void setLast_ven(String Last_ven) {
		this.last_ven = Last_ven;
	}
		/**
	 * @return cre_date
	 *			建檔日期
	 */
	public Date getCre_date() {
		return cre_date;
	}

	/**
	 * @param cre_date
	 *			建檔日期
	 */
	public void setCre_date(Date Cre_date) {
		this.cre_date = Cre_date;
	}
		/**
	 * @return crt_date
	 *			建檔日期
	 */
	public Date getCrt_date() {
		return crt_date;
	}

	/**
	 * @param crt_date
	 *			建檔日期
	 */
	public void setCrt_date(Date Crt_date) {
		this.crt_date = Crt_date;
	}
		/**
	 * @return crt_user
	 *			建檔人員
	 */
	public String getCrt_user() {
		return crt_user;
	}

	/**
	 * @param crt_user
	 *			建檔人員
	 */
	public void setCrt_user(String Crt_user) {
		this.crt_user = Crt_user;
	}
		/**
	 * @return edit_date
	 *			最近修改日期
	 */
	public Date getEdit_date() {
		return edit_date;
	}

	/**
	 * @param edit_date
	 *			最近修改日期
	 */
	public void setEdit_date(Date Edit_date) {
		this.edit_date = Edit_date;
	}
		/**
	 * @return edit_user
	 *			最近修改人員
	 */
	public String getEdit_user() {
		return edit_user;
	}

	/**
	 * @param edit_user
	 *			最近修改人員
	 */
	public void setEdit_user(String Edit_user) {
		this.edit_user = Edit_user;
	}
		/**
	 * @return zz_per
	 *			周轉率
	 */
	public Double getZz_per() {
		return zz_per;
	}

	/**
	 * @param zz_per
	 *			周轉率
	 */
	public void setZz_per(Double Zz_per) {
		this.zz_per = Zz_per;
	}
		/**
	 * @return ivc_itm
	 *			發票產編
	 */
	public String getIvc_itm() {
		return ivc_itm;
	}

	/**
	 * @param ivc_itm
	 *			發票產編
	 */
	public void setIvc_itm(String Ivc_itm) {
		this.ivc_itm = Ivc_itm;
	}
		/**
	 * @return isivc_itm
	 *			是否發票品
	 */
	public Integer getIsivc_itm() {
		return isivc_itm;
	}

	/**
	 * @param isivc_itm
	 *			是否發票品
	 */
	public void setIsivc_itm(Integer Isivc_itm) {
		this.isivc_itm = Isivc_itm;
	}
		/**
	 * @return car_nbr
	 *			車型型號
	 */
	public String getCar_nbr() {
		return car_nbr;
	}

	/**
	 * @param car_nbr
	 *			車型型號
	 */
	public void setCar_nbr(String Car_nbr) {
		this.car_nbr = Car_nbr;
	}
		/**
	 * @return begin_nbr
	 *			序號起始碼
	 */
	public String getBegin_nbr() {
		return begin_nbr;
	}

	/**
	 * @param begin_nbr
	 *			序號起始碼
	 */
	public void setBegin_nbr(String Begin_nbr) {
		this.begin_nbr = Begin_nbr;
	}
		/**
	 * @return nbr_seq
	 *			序號碼數
	 */
	public Integer getNbr_seq() {
		return nbr_seq;
	}

	/**
	 * @param nbr_seq
	 *			序號碼數
	 */
	public void setNbr_seq(Integer Nbr_seq) {
		this.nbr_seq = Nbr_seq;
	}
		/**
	 * @return bz_desc
	 *			包裝說明
	 */
	public String getBz_desc() {
		return bz_desc;
	}

	/**
	 * @param bz_desc
	 *			包裝說明
	 */
	public void setBz_desc(String Bz_desc) {
		this.bz_desc = Bz_desc;
	}
		/**
	 * @return tranok
	 *			轉出狀態
	 */
	public String getTranok() {
		return tranok;
	}

	/**
	 * @param tranok
	 *			轉出狀態
	 */
	public void setTranok(String Tranok) {
		this.tranok = Tranok;
	}
		/**
	 * @return tranop
	 *			操作類型
	 */
	public String getTranop() {
		return tranop;
	}

	/**
	 * @param tranop
	 *			操作類型
	 */
	public void setTranop(String Tranop) {
		this.tranop = Tranop;
	}
		/**
	 * @return trancnt
	 *			轉出次數
	 */
	public Integer getTrancnt() {
		return trancnt;
	}

	/**
	 * @param trancnt
	 *			轉出次數
	 */
	public void setTrancnt(Integer Trancnt) {
		this.trancnt = Trancnt;
	}
	
}

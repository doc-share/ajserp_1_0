package org.esy.shp.entity;

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
 *  @date Tue Jul 28 13:58:38 CST 2020
 */
@Entity
@Table(name = "shp_bat" ,indexes = { @Index(name = "created", columnList = "created"), 
@Index(name = "updated", columnList = "updated")})
@EntityInfo("出貨明細檔")
public class Shpbat extends BaseProperties {

	private static final long serialVersionUID = 1L;

	
	@FieldInfo("表头uid")
	@FilterInfo(ListValue = "eq")
	@Column(name = "huid", length = 32)
	private String huid;
	
	public String getHuid() {
		return huid;
	}

	public void setHuid(String huid) {
		this.huid = huid;
	}

	@FieldInfo("單據號碼")
	@FilterInfo(ListValue = "")
	@Column(name = "nbr", length =32  )
	private String nbr ;

	@FieldInfo("序號")
	@FilterInfo(ListValue = "")
	@Column(name = "seq")
	private Integer seq;

	@FieldInfo("庫存交易序")
	@FilterInfo(ListValue = "")
	@Column(name = "ioseq", length =32  )
	private String ioseq ;

	@FieldInfo("發票號碼")
	@FilterInfo(ListValue = "")
	@Column(name = "ivc_nbr", length =32  )
	private String ivc_nbr ;

	@FieldInfo("訂單單據號碼")
	@FilterInfo(ListValue = "")
	@Column(name = "ord_nbr", length =32  )
	private String ord_nbr ;

	@FieldInfo("訂單序號")
	@FilterInfo(ListValue = "")
	@Column(name = "ord_ioseq", length =32  )
	private String ord_ioseq ;

	@FieldInfo("客戶訂單號碼")
	@FilterInfo(ListValue = "")
	@Column(name = "desc_no", length =32  )
	private String desc_no ;

	@FieldInfo("產品編號")
	@FilterInfo(ListValue = "")
	@Column(name = "item_nbr", length =32  )
	private String item_nbr ;

	@FieldInfo("產品規格")
	@FilterInfo(ListValue = "")
	@Column(name = "item_desc", length =32  )
	private String item_desc ;

	@FieldInfo("製程")
	@FilterInfo(ListValue = "")
	@Column(name = "pro_nbr", length =32  )
	private String pro_nbr ;

	@FieldInfo("倉庫代號")
	@FilterInfo(ListValue = "")
	@Column(name = "ware_nbr", length =32  )
	private String ware_nbr ;

	@FieldInfo("單位")
	@FilterInfo(ListValue = "")
	@Column(name = "unit", length =32  )
	private String unit ;

	@FieldInfo("出貨數量")
	@FilterInfo(ListValue = "")
	@Column(name = "qty")
	private Double qty;

	@FieldInfo("計價單位")
	@FilterInfo(ListValue = "")
	@Column(name = "t_unit", length =32  )
	private String t_unit ;

	@FieldInfo("計價數量")
	@FilterInfo(ListValue = "")
	@Column(name = "t_qty")
	private Double t_qty;

	@FieldInfo(" 庫存批號1")
	@FilterInfo(ListValue = "")
	@Column(name = "kcnbr1", length =32  )
	private String kcnbr1 ;

	@FieldInfo(" 庫存批號2")
	@FilterInfo(ListValue = "")
	@Column(name = "kcnbr2", length =32  )
	private String kcnbr2 ;

	@FieldInfo(" 件數")
	@FilterInfo(ListValue = "")
	@Column(name = "jqty")
	private Double jqty;

	@FieldInfo("標準售價")
	@FilterInfo(ListValue = "")
	@Column(name = "unit_price")
	private Double unit_price;

	@FieldInfo("折數")
	@FilterInfo(ListValue = "")
	@Column(name = "cut")
	private Double cut;

	@FieldInfo("單價")
	@FilterInfo(ListValue = "")
	@Column(name = "price")
	private Double price;

	@FieldInfo("金額")
	@FilterInfo(ListValue = "")
	@Column(name = "amt")
	private Double amt;

	@FieldInfo("幣別單價")
	@FilterInfo(ListValue = "")
	@Column(name = "c_price")
	private Double c_price;

	@FieldInfo("幣別金額")
	@FilterInfo(ListValue = "")
	@Column(name = "c_amt")
	private Double c_amt;

	@FieldInfo("成本")
	@FilterInfo(ListValue = "")
	@Column(name = "cost")
	private Double cost;

	@FieldInfo("成本金額")
	@FilterInfo(ListValue = "")
	@Column(name = "cost_amt")
	private Double cost_amt;

	@FieldInfo("備註")
	@FilterInfo(ListValue = "")
	@Column(name = "remark", columnDefinition = "TEXT")
	private String remark;

	@FieldInfo("日期")
	@FilterInfo(ListValue = "")
	@Column(name = "nbrdate")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date nbrdate;

	@FieldInfo("客戶產品編號")
	@FilterInfo(ListValue = "")
	@Column(name = "cus_item", length =32  )
	private String cus_item ;

	@FieldInfo("參考號碼")
	@FilterInfo(ListValue = "")
	@Column(name = "cus_item1", length =32  )
	private String cus_item1 ;

	@FieldInfo("內盒")
	@FilterInfo(ListValue = "")
	@Column(name = "in_box")
	private Integer in_box;

	@FieldInfo("外箱")
	@FilterInfo(ListValue = "")
	@Column(name = "qty_pbox")
	private Integer qty_pbox;

	@FieldInfo("箱數")
	@FilterInfo(ListValue = "")
	@Column(name = "pack_qty")
	private Integer pack_qty;

	@FieldInfo("箱號抬頭")
	@FilterInfo(ListValue = "")
	@Column(name = "no_t", length =32  )
	private String no_t ;

	@FieldInfo("編號起")
	@FilterInfo(ListValue = "")
	@Column(name = "no1")
	private Integer no1;

	@FieldInfo("編號迄")
	@FilterInfo(ListValue = "")
	@Column(name = "no2")
	private Integer no2;

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

	@FieldInfo("是否特殊警告")
	@FilterInfo(ListValue = "")
	@Column(name = "ts_sure")
	private Integer ts_sure;

	@FieldInfo("是否MAP44修改過")
	@FilterInfo(ListValue = "")
	@Column(name = "ismap44")
	private Integer ismap44;

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
	public Shpbat() {
		super();
	}
	
	/**
	 *
	 * 构造函数
	 *
	 	 * @param nbr
	 *		  單據號碼
	 * 
	 	 * @param seq
	 *		  序號
	 * 
	 	 * @param ioseq
	 *		  庫存交易序
	 * 
	 	 * @param ivc_nbr
	 *		  發票號碼
	 * 
	 	 * @param ord_nbr
	 *		  訂單單據號碼
	 * 
	 	 * @param ord_ioseq
	 *		  訂單序號
	 * 
	 	 * @param desc_no
	 *		  客戶訂單號碼
	 * 
	 	 * @param item_nbr
	 *		  產品編號
	 * 
	 	 * @param item_desc
	 *		  產品規格
	 * 
	 	 * @param pro_nbr
	 *		  製程
	 * 
	 	 * @param ware_nbr
	 *		  倉庫代號
	 * 
	 	 * @param unit
	 *		  單位
	 * 
	 	 * @param qty
	 *		  出貨數量
	 * 
	 	 * @param t_unit
	 *		  計價單位
	 * 
	 	 * @param t_qty
	 *		  計價數量
	 * 
	 	 * @param kcnbr1
	 *		   庫存批號1
	 * 
	 	 * @param kcnbr2
	 *		   庫存批號2
	 * 
	 	 * @param jqty
	 *		   件數
	 * 
	 	 * @param unit_price
	 *		  標準售價
	 * 
	 	 * @param cut
	 *		  折數
	 * 
	 	 * @param price
	 *		  單價
	 * 
	 	 * @param amt
	 *		  金額
	 * 
	 	 * @param c_price
	 *		  幣別單價
	 * 
	 	 * @param c_amt
	 *		  幣別金額
	 * 
	 	 * @param cost
	 *		  成本
	 * 
	 	 * @param cost_amt
	 *		  成本金額
	 * 
	 	 * @param remark
	 *		  備註
	 * 
	 	 * @param nbrdate
	 *		  日期
	 * 
	 	 * @param cus_item
	 *		  客戶產品編號
	 * 
	 	 * @param cus_item1
	 *		  參考號碼
	 * 
	 	 * @param in_box
	 *		  內盒
	 * 
	 	 * @param qty_pbox
	 *		  外箱
	 * 
	 	 * @param pack_qty
	 *		  箱數
	 * 
	 	 * @param no_t
	 *		  箱號抬頭
	 * 
	 	 * @param no1
	 *		  編號起
	 * 
	 	 * @param no2
	 *		  編號迄
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
	 	 * @param ts_sure
	 *		  是否特殊警告
	 * 
	 	 * @param ismap44
	 *		  是否MAP44修改過
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
    	public Shpbat( String nbr, Integer seq, String ioseq, String ivc_nbr, String ord_nbr, String ord_ioseq, String desc_no, String item_nbr, String item_desc, String pro_nbr, String ware_nbr, String unit, Double qty, String t_unit, Double t_qty, String kcnbr1, String kcnbr2, Double jqty, Double unit_price, Double cut, Double price, Double amt, Double c_price, Double c_amt, Double cost, Double cost_amt, String remark, Date nbrdate, String cus_item, String cus_item1, Integer in_box, Integer qty_pbox, Integer pack_qty, String no_t, Integer no1, Integer no2, Double cuft, Double n_wight, Double g_wight, Integer ts_sure, Integer ismap44, String tranok, String tranop, Integer trancnt ) {
		super();
				this.nbr = nbr;
				this.seq = seq;
				this.ioseq = ioseq;
				this.ivc_nbr = ivc_nbr;
				this.ord_nbr = ord_nbr;
				this.ord_ioseq = ord_ioseq;
				this.desc_no = desc_no;
				this.item_nbr = item_nbr;
				this.item_desc = item_desc;
				this.pro_nbr = pro_nbr;
				this.ware_nbr = ware_nbr;
				this.unit = unit;
				this.qty = qty;
				this.t_unit = t_unit;
				this.t_qty = t_qty;
				this.kcnbr1 = kcnbr1;
				this.kcnbr2 = kcnbr2;
				this.jqty = jqty;
				this.unit_price = unit_price;
				this.cut = cut;
				this.price = price;
				this.amt = amt;
				this.c_price = c_price;
				this.c_amt = c_amt;
				this.cost = cost;
				this.cost_amt = cost_amt;
				this.remark = remark;
				this.nbrdate = nbrdate;
				this.cus_item = cus_item;
				this.cus_item1 = cus_item1;
				this.in_box = in_box;
				this.qty_pbox = qty_pbox;
				this.pack_qty = pack_qty;
				this.no_t = no_t;
				this.no1 = no1;
				this.no2 = no2;
				this.cuft = cuft;
				this.n_wight = n_wight;
				this.g_wight = g_wight;
				this.ts_sure = ts_sure;
				this.ismap44 = ismap44;
				this.tranok = tranok;
				this.tranop = tranop;
				this.trancnt = trancnt;
			}

		/**
	 * @return nbr
	 *			單據號碼
	 */
	public String getNbr() {
		return nbr;
	}

	/**
	 * @param nbr
	 *			單據號碼
	 */
	public void setNbr(String Nbr) {
		this.nbr = Nbr;
	}
		/**
	 * @return seq
	 *			序號
	 */
	public Integer getSeq() {
		return seq;
	}

	/**
	 * @param seq
	 *			序號
	 */
	public void setSeq(Integer Seq) {
		this.seq = Seq;
	}
		/**
	 * @return ioseq
	 *			庫存交易序
	 */
	public String getIoseq() {
		return ioseq;
	}

	/**
	 * @param ioseq
	 *			庫存交易序
	 */
	public void setIoseq(String Ioseq) {
		this.ioseq = Ioseq;
	}
		/**
	 * @return ivc_nbr
	 *			發票號碼
	 */
	public String getIvc_nbr() {
		return ivc_nbr;
	}

	/**
	 * @param ivc_nbr
	 *			發票號碼
	 */
	public void setIvc_nbr(String Ivc_nbr) {
		this.ivc_nbr = Ivc_nbr;
	}
		/**
	 * @return ord_nbr
	 *			訂單單據號碼
	 */
	public String getOrd_nbr() {
		return ord_nbr;
	}

	/**
	 * @param ord_nbr
	 *			訂單單據號碼
	 */
	public void setOrd_nbr(String Ord_nbr) {
		this.ord_nbr = Ord_nbr;
	}
		/**
	 * @return ord_ioseq
	 *			訂單序號
	 */
	public String getOrd_ioseq() {
		return ord_ioseq;
	}

	/**
	 * @param ord_ioseq
	 *			訂單序號
	 */
	public void setOrd_ioseq(String Ord_ioseq) {
		this.ord_ioseq = Ord_ioseq;
	}
		/**
	 * @return desc_no
	 *			客戶訂單號碼
	 */
	public String getDesc_no() {
		return desc_no;
	}

	/**
	 * @param desc_no
	 *			客戶訂單號碼
	 */
	public void setDesc_no(String Desc_no) {
		this.desc_no = Desc_no;
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
	 * @return item_desc
	 *			產品規格
	 */
	public String getItem_desc() {
		return item_desc;
	}

	/**
	 * @param item_desc
	 *			產品規格
	 */
	public void setItem_desc(String Item_desc) {
		this.item_desc = Item_desc;
	}
		/**
	 * @return pro_nbr
	 *			製程
	 */
	public String getPro_nbr() {
		return pro_nbr;
	}

	/**
	 * @param pro_nbr
	 *			製程
	 */
	public void setPro_nbr(String Pro_nbr) {
		this.pro_nbr = Pro_nbr;
	}
		/**
	 * @return ware_nbr
	 *			倉庫代號
	 */
	public String getWare_nbr() {
		return ware_nbr;
	}

	/**
	 * @param ware_nbr
	 *			倉庫代號
	 */
	public void setWare_nbr(String Ware_nbr) {
		this.ware_nbr = Ware_nbr;
	}
		/**
	 * @return unit
	 *			單位
	 */
	public String getUnit() {
		return unit;
	}

	/**
	 * @param unit
	 *			單位
	 */
	public void setUnit(String Unit) {
		this.unit = Unit;
	}
		/**
	 * @return qty
	 *			出貨數量
	 */
	public Double getQty() {
		return qty;
	}

	/**
	 * @param qty
	 *			出貨數量
	 */
	public void setQty(Double Qty) {
		this.qty = Qty;
	}
		/**
	 * @return t_unit
	 *			計價單位
	 */
	public String getT_unit() {
		return t_unit;
	}

	/**
	 * @param t_unit
	 *			計價單位
	 */
	public void setT_unit(String T_unit) {
		this.t_unit = T_unit;
	}
		/**
	 * @return t_qty
	 *			計價數量
	 */
	public Double getT_qty() {
		return t_qty;
	}

	/**
	 * @param t_qty
	 *			計價數量
	 */
	public void setT_qty(Double T_qty) {
		this.t_qty = T_qty;
	}
		/**
	 * @return kcnbr1
	 *			 庫存批號1
	 */
	public String getKcnbr1() {
		return kcnbr1;
	}

	/**
	 * @param kcnbr1
	 *			 庫存批號1
	 */
	public void setKcnbr1(String Kcnbr1) {
		this.kcnbr1 = Kcnbr1;
	}
		/**
	 * @return kcnbr2
	 *			 庫存批號2
	 */
	public String getKcnbr2() {
		return kcnbr2;
	}

	/**
	 * @param kcnbr2
	 *			 庫存批號2
	 */
	public void setKcnbr2(String Kcnbr2) {
		this.kcnbr2 = Kcnbr2;
	}
		/**
	 * @return jqty
	 *			 件數
	 */
	public Double getJqty() {
		return jqty;
	}

	/**
	 * @param jqty
	 *			 件數
	 */
	public void setJqty(Double Jqty) {
		this.jqty = Jqty;
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
	 * @return cut
	 *			折數
	 */
	public Double getCut() {
		return cut;
	}

	/**
	 * @param cut
	 *			折數
	 */
	public void setCut(Double Cut) {
		this.cut = Cut;
	}
		/**
	 * @return price
	 *			單價
	 */
	public Double getPrice() {
		return price;
	}

	/**
	 * @param price
	 *			單價
	 */
	public void setPrice(Double Price) {
		this.price = Price;
	}
		/**
	 * @return amt
	 *			金額
	 */
	public Double getAmt() {
		return amt;
	}

	/**
	 * @param amt
	 *			金額
	 */
	public void setAmt(Double Amt) {
		this.amt = Amt;
	}
		/**
	 * @return c_price
	 *			幣別單價
	 */
	public Double getC_price() {
		return c_price;
	}

	/**
	 * @param c_price
	 *			幣別單價
	 */
	public void setC_price(Double C_price) {
		this.c_price = C_price;
	}
		/**
	 * @return c_amt
	 *			幣別金額
	 */
	public Double getC_amt() {
		return c_amt;
	}

	/**
	 * @param c_amt
	 *			幣別金額
	 */
	public void setC_amt(Double C_amt) {
		this.c_amt = C_amt;
	}
		/**
	 * @return cost
	 *			成本
	 */
	public Double getCost() {
		return cost;
	}

	/**
	 * @param cost
	 *			成本
	 */
	public void setCost(Double Cost) {
		this.cost = Cost;
	}
		/**
	 * @return cost_amt
	 *			成本金額
	 */
	public Double getCost_amt() {
		return cost_amt;
	}

	/**
	 * @param cost_amt
	 *			成本金額
	 */
	public void setCost_amt(Double Cost_amt) {
		this.cost_amt = Cost_amt;
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
	 * @return nbrdate
	 *			日期
	 */
	public Date getNbrdate() {
		return nbrdate;
	}

	/**
	 * @param nbrdate
	 *			日期
	 */
	public void setNbrdate(Date Nbrdate) {
		this.nbrdate = Nbrdate;
	}
		/**
	 * @return cus_item
	 *			客戶產品編號
	 */
	public String getCus_item() {
		return cus_item;
	}

	/**
	 * @param cus_item
	 *			客戶產品編號
	 */
	public void setCus_item(String Cus_item) {
		this.cus_item = Cus_item;
	}
		/**
	 * @return cus_item1
	 *			參考號碼
	 */
	public String getCus_item1() {
		return cus_item1;
	}

	/**
	 * @param cus_item1
	 *			參考號碼
	 */
	public void setCus_item1(String Cus_item1) {
		this.cus_item1 = Cus_item1;
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
	 * @return pack_qty
	 *			箱數
	 */
	public Integer getPack_qty() {
		return pack_qty;
	}

	/**
	 * @param pack_qty
	 *			箱數
	 */
	public void setPack_qty(Integer Pack_qty) {
		this.pack_qty = Pack_qty;
	}
		/**
	 * @return no_t
	 *			箱號抬頭
	 */
	public String getNo_t() {
		return no_t;
	}

	/**
	 * @param no_t
	 *			箱號抬頭
	 */
	public void setNo_t(String No_t) {
		this.no_t = No_t;
	}
		/**
	 * @return no1
	 *			編號起
	 */
	public Integer getNo1() {
		return no1;
	}

	/**
	 * @param no1
	 *			編號起
	 */
	public void setNo1(Integer No1) {
		this.no1 = No1;
	}
		/**
	 * @return no2
	 *			編號迄
	 */
	public Integer getNo2() {
		return no2;
	}

	/**
	 * @param no2
	 *			編號迄
	 */
	public void setNo2(Integer No2) {
		this.no2 = No2;
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
	 * @return ts_sure
	 *			是否特殊警告
	 */
	public Integer getTs_sure() {
		return ts_sure;
	}

	/**
	 * @param ts_sure
	 *			是否特殊警告
	 */
	public void setTs_sure(Integer Ts_sure) {
		this.ts_sure = Ts_sure;
	}
		/**
	 * @return ismap44
	 *			是否MAP44修改過
	 */
	public Integer getIsmap44() {
		return ismap44;
	}

	/**
	 * @param ismap44
	 *			是否MAP44修改過
	 */
	public void setIsmap44(Integer Ismap44) {
		this.ismap44 = Ismap44;
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

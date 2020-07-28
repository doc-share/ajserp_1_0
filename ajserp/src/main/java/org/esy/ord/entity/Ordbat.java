package org.esy.ord.entity;

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
 *  @date Tue Jul 28 11:22:38 CST 2020
 */
@Entity
@Table(name = "ord_bat" ,indexes = { @Index(name = "created", columnList = "created"), 
@Index(name = "updated", columnList = "updated")})
@EntityInfo("訂單明細檔")
public class Ordbat extends BaseProperties {

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

	@FieldInfo("單據編號")
	@FilterInfo(ListValue = "")
	@Column(name = "nbr", length =32  )
	private String nbr ;

	@FieldInfo("序號")
	@FilterInfo(ListValue = "")
	@Column(name = "seq")
	private Integer seq;

	@FieldInfo("出貨單連結序")
	@FilterInfo(ListValue = "")
	@Column(name = "ioseq", length =32  )
	private String ioseq ;

	@FieldInfo("報價單據號碼")
	@FilterInfo(ListValue = "")
	@Column(name = "quo_nbr", length =32  )
	private String quo_nbr ;

	@FieldInfo("報價序號")
	@FilterInfo(ListValue = "")
	@Column(name = "quo_ioseq", length =32  )
	private String quo_ioseq ;

	@FieldInfo("客戶訂單編號")
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

	@FieldInfo("倉庫代號")
	@FilterInfo(ListValue = "")
	@Column(name = "ware_nbr", length =32  )
	private String ware_nbr ;

	@FieldInfo("製程")
	@FilterInfo(ListValue = "")
	@Column(name = "pro_nbr", length =32  )
	private String pro_nbr ;

	@FieldInfo("單位")
	@FilterInfo(ListValue = "")
	@Column(name = "unit", length =32  )
	private String unit ;

	@FieldInfo("折數")
	@FilterInfo(ListValue = "")
	@Column(name = "cut")
	private Double cut;

	@FieldInfo("數量")
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

	@FieldInfo("標準售價")
	@FilterInfo(ListValue = "")
	@Column(name = "unit_price")
	private Double unit_price;

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

	@FieldInfo("預計出貨日")
	@FilterInfo(ListValue = "")
	@Column(name = "plan_date")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date plan_date;

	@FieldInfo("已出貨數量")
	@FilterInfo(ListValue = "")
	@Column(name = "ioqty")
	private Double ioqty;

	@FieldInfo("備註")
	@FilterInfo(ListValue = "")
	@Column(name = "remark", columnDefinition = "TEXT")
	private String remark;

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

	@FieldInfo("是否已轉採購單")
	@FilterInfo(ListValue = "")
	@Column(name = "pur_ctl", length =32  )
	private String pur_ctl ;

	@FieldInfo("已轉命令單數量")
	@FilterInfo(ListValue = "")
	@Column(name = "mioqty")
	private Double mioqty;

	@FieldInfo("特殊警告")
	@FilterInfo(ListValue = "")
	@Column(name = "ts_sure")
	private Integer ts_sure;

	@FieldInfo(" T核准回 復")
	@FilterInfo(ListValue = "")
	@Column(name = "issub")
	private Integer issub;

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

	@FieldInfo("已出貨數量")
	@FilterInfo(ListValue = "")
	@Column(name = "tioqty")
	private Double tioqty;


     /**
	 *
	 * 构造函数
	 *
	 */
	public Ordbat() {
		super();
	}
	
	/**
	 *
	 * 构造函数
	 *
	 	 * @param nbr
	 *		  單據編號
	 * 
	 	 * @param seq
	 *		  序號
	 * 
	 	 * @param ioseq
	 *		  出貨單連結序
	 * 
	 	 * @param quo_nbr
	 *		  報價單據號碼
	 * 
	 	 * @param quo_ioseq
	 *		  報價序號
	 * 
	 	 * @param desc_no
	 *		  客戶訂單編號
	 * 
	 	 * @param item_nbr
	 *		  產品編號
	 * 
	 	 * @param item_desc
	 *		  產品規格
	 * 
	 	 * @param ware_nbr
	 *		  倉庫代號
	 * 
	 	 * @param pro_nbr
	 *		  製程
	 * 
	 	 * @param unit
	 *		  單位
	 * 
	 	 * @param cut
	 *		  折數
	 * 
	 	 * @param qty
	 *		  數量
	 * 
	 	 * @param t_unit
	 *		  計價單位
	 * 
	 	 * @param t_qty
	 *		  計價數量
	 * 
	 	 * @param unit_price
	 *		  標準售價
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
	 	 * @param plan_date
	 *		  預計出貨日
	 * 
	 	 * @param ioqty
	 *		  已出貨數量
	 * 
	 	 * @param remark
	 *		  備註
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
	 	 * @param pur_ctl
	 *		  是否已轉採購單
	 * 
	 	 * @param mioqty
	 *		  已轉命令單數量
	 * 
	 	 * @param ts_sure
	 *		  特殊警告
	 * 
	 	 * @param issub
	 *		   T核准回 復
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
	 	 * @param tioqty
	 *		  已出貨數量
	 * 
	 	 */
    	public Ordbat( String nbr, Integer seq, String ioseq, String quo_nbr, String quo_ioseq, String desc_no, String item_nbr, String item_desc, String ware_nbr, String pro_nbr, String unit, Double cut, Double qty, String t_unit, Double t_qty, Double unit_price, Double price, Double amt, Double c_price, Double c_amt, Double cost, Double cost_amt, Date plan_date, Double ioqty, String remark, String cus_item, String cus_item1, Integer in_box, Integer qty_pbox, Integer pack_qty, String no_t, Integer no1, Integer no2, Double cuft, Double n_wight, Double g_wight, String pur_ctl, Double mioqty, Integer ts_sure, Integer issub, String tranok, String tranop, Integer trancnt, Double tioqty ) {
		super();
				this.nbr = nbr;
				this.seq = seq;
				this.ioseq = ioseq;
				this.quo_nbr = quo_nbr;
				this.quo_ioseq = quo_ioseq;
				this.desc_no = desc_no;
				this.item_nbr = item_nbr;
				this.item_desc = item_desc;
				this.ware_nbr = ware_nbr;
				this.pro_nbr = pro_nbr;
				this.unit = unit;
				this.cut = cut;
				this.qty = qty;
				this.t_unit = t_unit;
				this.t_qty = t_qty;
				this.unit_price = unit_price;
				this.price = price;
				this.amt = amt;
				this.c_price = c_price;
				this.c_amt = c_amt;
				this.cost = cost;
				this.cost_amt = cost_amt;
				this.plan_date = plan_date;
				this.ioqty = ioqty;
				this.remark = remark;
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
				this.pur_ctl = pur_ctl;
				this.mioqty = mioqty;
				this.ts_sure = ts_sure;
				this.issub = issub;
				this.tranok = tranok;
				this.tranop = tranop;
				this.trancnt = trancnt;
				this.tioqty = tioqty;
			}

		public Ordbat(String uid) {
		// TODO Auto-generated constructor stub
	}

		/**
	 * @return nbr
	 *			單據編號
	 */
	public String getNbr() {
		return nbr;
	}

	/**
	 * @param nbr
	 *			單據編號
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
	 *			出貨單連結序
	 */
	public String getIoseq() {
		return ioseq;
	}

	/**
	 * @param ioseq
	 *			出貨單連結序
	 */
	public void setIoseq(String Ioseq) {
		this.ioseq = Ioseq;
	}
		/**
	 * @return quo_nbr
	 *			報價單據號碼
	 */
	public String getQuo_nbr() {
		return quo_nbr;
	}

	/**
	 * @param quo_nbr
	 *			報價單據號碼
	 */
	public void setQuo_nbr(String Quo_nbr) {
		this.quo_nbr = Quo_nbr;
	}
		/**
	 * @return quo_ioseq
	 *			報價序號
	 */
	public String getQuo_ioseq() {
		return quo_ioseq;
	}

	/**
	 * @param quo_ioseq
	 *			報價序號
	 */
	public void setQuo_ioseq(String Quo_ioseq) {
		this.quo_ioseq = Quo_ioseq;
	}
		/**
	 * @return desc_no
	 *			客戶訂單編號
	 */
	public String getDesc_no() {
		return desc_no;
	}

	/**
	 * @param desc_no
	 *			客戶訂單編號
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
	 * @return qty
	 *			數量
	 */
	public Double getQty() {
		return qty;
	}

	/**
	 * @param qty
	 *			數量
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
	 * @return plan_date
	 *			預計出貨日
	 */
	public Date getPlan_date() {
		return plan_date;
	}

	/**
	 * @param plan_date
	 *			預計出貨日
	 */
	public void setPlan_date(Date Plan_date) {
		this.plan_date = Plan_date;
	}
		/**
	 * @return ioqty
	 *			已出貨數量
	 */
	public Double getIoqty() {
		return ioqty;
	}

	/**
	 * @param ioqty
	 *			已出貨數量
	 */
	public void setIoqty(Double Ioqty) {
		this.ioqty = Ioqty;
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
	 * @return pur_ctl
	 *			是否已轉採購單
	 */
	public String getPur_ctl() {
		return pur_ctl;
	}

	/**
	 * @param pur_ctl
	 *			是否已轉採購單
	 */
	public void setPur_ctl(String Pur_ctl) {
		this.pur_ctl = Pur_ctl;
	}
		/**
	 * @return mioqty
	 *			已轉命令單數量
	 */
	public Double getMioqty() {
		return mioqty;
	}

	/**
	 * @param mioqty
	 *			已轉命令單數量
	 */
	public void setMioqty(Double Mioqty) {
		this.mioqty = Mioqty;
	}
		/**
	 * @return ts_sure
	 *			特殊警告
	 */
	public Integer getTs_sure() {
		return ts_sure;
	}

	/**
	 * @param ts_sure
	 *			特殊警告
	 */
	public void setTs_sure(Integer Ts_sure) {
		this.ts_sure = Ts_sure;
	}
		/**
	 * @return issub
	 *			 T核准回 復
	 */
	public Integer getIssub() {
		return issub;
	}

	/**
	 * @param issub
	 *			 T核准回 復
	 */
	public void setIssub(Integer Issub) {
		this.issub = Issub;
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
		/**
	 * @return tioqty
	 *			已出貨數量
	 */
	public Double getTioqty() {
		return tioqty;
	}

	/**
	 * @param tioqty
	 *			已出貨數量
	 */
	public void setTioqty(Double Tioqty) {
		this.tioqty = Tioqty;
	}
	
}

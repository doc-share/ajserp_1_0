package org.esy.pur.entity;

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
 *  @date Wed Jul 29 11:40:38 CST 2020
 */
@Entity
@Table(name = "rec_bat" ,indexes = { @Index(name = "created", columnList = "created"), 
@Index(name = "updated", columnList = "updated")})
@EntityInfo("收料明細檔")
public class Recbat extends BaseProperties {

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

	@FieldInfo("採購單據號碼")
	@FilterInfo(ListValue = "")
	@Column(name = "pur_nbr", length =32  )
	private String pur_nbr ;

	@FieldInfo("訂單序號")
	@FilterInfo(ListValue = "")
	@Column(name = "pur_ioseq", length =32  )
	private String pur_ioseq ;

	@FieldInfo("廠商採購號碼")
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

	@FieldInfo("倉庫")
	@FilterInfo(ListValue = "")
	@Column(name = "ware_nbr", length =32  )
	private String ware_nbr ;

	@FieldInfo("單位")
	@FilterInfo(ListValue = "")
	@Column(name = "unit", length =32  )
	private String unit ;

	@FieldInfo("計價單位")
	@FilterInfo(ListValue = "")
	@Column(name = "t_unit", length =32  )
	private String t_unit ;

	@FieldInfo("數量")
	@FilterInfo(ListValue = "")
	@Column(name = "qty")
	private Double qty;

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

	@FieldInfo("計價數量")
	@FilterInfo(ListValue = "")
	@Column(name = "t_qty")
	private Double t_qty;

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

	@FieldInfo("備註")
	@FilterInfo(ListValue = "")
	@Column(name = "remark", length =32  )
	private String remark ;

	@FieldInfo("日期")
	@FilterInfo(ListValue = "")
	@Column(name = "nbrdate")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date nbrdate;

	@FieldInfo("回 復 計價數量")
	@FilterInfo(ListValue = "")
	@Column(name = "ot_qty")
	private Double ot_qty;

	@FieldInfo("單據號碼")
	@FilterInfo(ListValue = "")
	@Column(name = "ord_nbr", length =32  )
	private String ord_nbr ;

	@FieldInfo("加工單序號")
	@FilterInfo(ListValue = "")
	@Column(name = "ord_ioseq", length =32  )
	private String ord_ioseq ;

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

	@FieldInfo("儲位")
	@FilterInfo(ListValue = "")
	@Column(name = "stock_desc", length =32  )
	private String stock_desc ;


     /**
	 *
	 * 构造函数
	 *
	 */
	public Recbat() {
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
	 	 * @param pur_nbr
	 *		  採購單據號碼
	 * 
	 	 * @param pur_ioseq
	 *		  訂單序號
	 * 
	 	 * @param desc_no
	 *		  廠商採購號碼
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
	 *		  倉庫
	 * 
	 	 * @param unit
	 *		  單位
	 * 
	 	 * @param t_unit
	 *		  計價單位
	 * 
	 	 * @param qty
	 *		  數量
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
	 	 * @param t_qty
	 *		  計價數量
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
	 	 * @param remark
	 *		  備註
	 * 
	 	 * @param nbrdate
	 *		  日期
	 * 
	 	 * @param ot_qty
	 *		  回 復 計價數量
	 * 
	 	 * @param ord_nbr
	 *		  單據號碼
	 * 
	 	 * @param ord_ioseq
	 *		  加工單序號
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
	 	 * @param stock_desc
	 *		  儲位
	 * 
	 	 */
    	public Recbat( String nbr, Integer seq, String ioseq, String pur_nbr, String pur_ioseq, String desc_no, String item_nbr, String item_desc, String pro_nbr, String ware_nbr, String unit, String t_unit, Double qty, String kcnbr1, String kcnbr2, Double jqty, Double t_qty, Double unit_price, Double cut, Double price, Double amt, Double c_price, Double c_amt, String remark, Date nbrdate, Double ot_qty, String ord_nbr, String ord_ioseq, String tranok, String tranop, Integer trancnt, String stock_desc ) {
		super();
				this.nbr = nbr;
				this.seq = seq;
				this.ioseq = ioseq;
				this.pur_nbr = pur_nbr;
				this.pur_ioseq = pur_ioseq;
				this.desc_no = desc_no;
				this.item_nbr = item_nbr;
				this.item_desc = item_desc;
				this.pro_nbr = pro_nbr;
				this.ware_nbr = ware_nbr;
				this.unit = unit;
				this.t_unit = t_unit;
				this.qty = qty;
				this.kcnbr1 = kcnbr1;
				this.kcnbr2 = kcnbr2;
				this.jqty = jqty;
				this.t_qty = t_qty;
				this.unit_price = unit_price;
				this.cut = cut;
				this.price = price;
				this.amt = amt;
				this.c_price = c_price;
				this.c_amt = c_amt;
				this.remark = remark;
				this.nbrdate = nbrdate;
				this.ot_qty = ot_qty;
				this.ord_nbr = ord_nbr;
				this.ord_ioseq = ord_ioseq;
				this.tranok = tranok;
				this.tranop = tranop;
				this.trancnt = trancnt;
				this.stock_desc = stock_desc;
			}

		public Recbat(String uid) {
		// TODO Auto-generated constructor stub
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
	 * @return pur_nbr
	 *			採購單據號碼
	 */
	public String getPur_nbr() {
		return pur_nbr;
	}

	/**
	 * @param pur_nbr
	 *			採購單據號碼
	 */
	public void setPur_nbr(String Pur_nbr) {
		this.pur_nbr = Pur_nbr;
	}
		/**
	 * @return pur_ioseq
	 *			訂單序號
	 */
	public String getPur_ioseq() {
		return pur_ioseq;
	}

	/**
	 * @param pur_ioseq
	 *			訂單序號
	 */
	public void setPur_ioseq(String Pur_ioseq) {
		this.pur_ioseq = Pur_ioseq;
	}
		/**
	 * @return desc_no
	 *			廠商採購號碼
	 */
	public String getDesc_no() {
		return desc_no;
	}

	/**
	 * @param desc_no
	 *			廠商採購號碼
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
	 *			倉庫
	 */
	public String getWare_nbr() {
		return ware_nbr;
	}

	/**
	 * @param ware_nbr
	 *			倉庫
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
	 * @return ot_qty
	 *			回 復 計價數量
	 */
	public Double getOt_qty() {
		return ot_qty;
	}

	/**
	 * @param ot_qty
	 *			回 復 計價數量
	 */
	public void setOt_qty(Double Ot_qty) {
		this.ot_qty = Ot_qty;
	}
		/**
	 * @return ord_nbr
	 *			單據號碼
	 */
	public String getOrd_nbr() {
		return ord_nbr;
	}

	/**
	 * @param ord_nbr
	 *			單據號碼
	 */
	public void setOrd_nbr(String Ord_nbr) {
		this.ord_nbr = Ord_nbr;
	}
		/**
	 * @return ord_ioseq
	 *			加工單序號
	 */
	public String getOrd_ioseq() {
		return ord_ioseq;
	}

	/**
	 * @param ord_ioseq
	 *			加工單序號
	 */
	public void setOrd_ioseq(String Ord_ioseq) {
		this.ord_ioseq = Ord_ioseq;
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
	
}

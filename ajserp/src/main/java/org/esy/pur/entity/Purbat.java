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
 *  @date Wed Jul 29 09:44:56 CST 2020
 */
@Entity
@Table(name = "pur_bat" ,indexes = { @Index(name = "created", columnList = "created"), 
@Index(name = "updated", columnList = "updated")})
@EntityInfo("採購明細檔")
public class Purbat extends BaseProperties {

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

	@FieldInfo("出貨單連結序")
	@FilterInfo(ListValue = "")
	@Column(name = "ioseq", length =32  )
	private String ioseq ;

	@FieldInfo("客戶訂單編號")
	@FilterInfo(ListValue = "")
	@Column(name = "desc_no", length =32  )
	private String desc_no ;

	@FieldInfo("訂單單據號碼")
	@FilterInfo(ListValue = "")
	@Column(name = "ord_nbr", length =32  )
	private String ord_nbr ;

	@FieldInfo("訂單序號")
	@FilterInfo(ListValue = "")
	@Column(name = "ord_ioseq", length =32  )
	private String ord_ioseq ;

	@FieldInfo("訂單單據號碼")
	@FilterInfo(ListValue = "")
	@Column(name = "mtp_nbr", length =32  )
	private String mtp_nbr ;

	@FieldInfo("訂單序號")
	@FilterInfo(ListValue = "")
	@Column(name = "mtp_ioseq", length =32  )
	private String mtp_ioseq ;

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

	@FieldInfo("單位")
	@FilterInfo(ListValue = "")
	@Column(name = "unit", length =32  )
	private String unit ;

	@FieldInfo("計價單位")
	@FilterInfo(ListValue = "")
	@Column(name = "t_unit", length =32  )
	private String t_unit ;

	@FieldInfo("折數")
	@FilterInfo(ListValue = "")
	@Column(name = "cut")
	private Double cut;

	@FieldInfo("標準售價")
	@FilterInfo(ListValue = "")
	@Column(name = "unit_price")
	private Double unit_price;

	@FieldInfo("數量")
	@FilterInfo(ListValue = "")
	@Column(name = "qty")
	private Double qty;

	@FieldInfo("計價數量")
	@FilterInfo(ListValue = "")
	@Column(name = "t_qty")
	private Double t_qty;

	@FieldInfo("最少訂購量")
	@FilterInfo(ListValue = "")
	@Column(name = "safe_qty")
	private Double safe_qty;

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

	@FieldInfo("預定到廠日")
	@FilterInfo(ListValue = "")
	@Column(name = "plan_date")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date plan_date;

	@FieldInfo("已進貨數量")
	@FilterInfo(ListValue = "")
	@Column(name = "ioqty")
	private Double ioqty;

	@FieldInfo("備註")
	@FilterInfo(ListValue = "")
	@Column(name = "remark", columnDefinition = "TEXT")
	private String remark;

	@FieldInfo("上皆有料")
	@FilterInfo(ListValue = "")
	@Column(name = "assy_nbr", length =32  )
	private String assy_nbr ;

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
	public Purbat() {
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
	 *		  出貨單連結序
	 * 
	 	 * @param desc_no
	 *		  客戶訂單編號
	 * 
	 	 * @param ord_nbr
	 *		  訂單單據號碼
	 * 
	 	 * @param ord_ioseq
	 *		  訂單序號
	 * 
	 	 * @param mtp_nbr
	 *		  訂單單據號碼
	 * 
	 	 * @param mtp_ioseq
	 *		  訂單序號
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
	 	 * @param unit
	 *		  單位
	 * 
	 	 * @param t_unit
	 *		  計價單位
	 * 
	 	 * @param cut
	 *		  折數
	 * 
	 	 * @param unit_price
	 *		  標準售價
	 * 
	 	 * @param qty
	 *		  數量
	 * 
	 	 * @param t_qty
	 *		  計價數量
	 * 
	 	 * @param safe_qty
	 *		  最少訂購量
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
	 	 * @param plan_date
	 *		  預定到廠日
	 * 
	 	 * @param ioqty
	 *		  已進貨數量
	 * 
	 	 * @param remark
	 *		  備註
	 * 
	 	 * @param assy_nbr
	 *		  上皆有料
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
    	public Purbat( String nbr, Integer seq, String ioseq, String desc_no, String ord_nbr, String ord_ioseq, String mtp_nbr, String mtp_ioseq, String item_nbr, String item_desc, String pro_nbr, String unit, String t_unit, Double cut, Double unit_price, Double qty, Double t_qty, Double safe_qty, Double price, Double amt, Double c_price, Double c_amt, Date plan_date, Double ioqty, String remark, String assy_nbr, String tranok, String tranop, Integer trancnt ) {
		super();
				this.nbr = nbr;
				this.seq = seq;
				this.ioseq = ioseq;
				this.desc_no = desc_no;
				this.ord_nbr = ord_nbr;
				this.ord_ioseq = ord_ioseq;
				this.mtp_nbr = mtp_nbr;
				this.mtp_ioseq = mtp_ioseq;
				this.item_nbr = item_nbr;
				this.item_desc = item_desc;
				this.pro_nbr = pro_nbr;
				this.unit = unit;
				this.t_unit = t_unit;
				this.cut = cut;
				this.unit_price = unit_price;
				this.qty = qty;
				this.t_qty = t_qty;
				this.safe_qty = safe_qty;
				this.price = price;
				this.amt = amt;
				this.c_price = c_price;
				this.c_amt = c_amt;
				this.plan_date = plan_date;
				this.ioqty = ioqty;
				this.remark = remark;
				this.assy_nbr = assy_nbr;
				this.tranok = tranok;
				this.tranop = tranop;
				this.trancnt = trancnt;
			}

		public Purbat(String uid) {
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
	 * @return mtp_nbr
	 *			訂單單據號碼
	 */
	public String getMtp_nbr() {
		return mtp_nbr;
	}

	/**
	 * @param mtp_nbr
	 *			訂單單據號碼
	 */
	public void setMtp_nbr(String Mtp_nbr) {
		this.mtp_nbr = Mtp_nbr;
	}
		/**
	 * @return mtp_ioseq
	 *			訂單序號
	 */
	public String getMtp_ioseq() {
		return mtp_ioseq;
	}

	/**
	 * @param mtp_ioseq
	 *			訂單序號
	 */
	public void setMtp_ioseq(String Mtp_ioseq) {
		this.mtp_ioseq = Mtp_ioseq;
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
	 * @return safe_qty
	 *			最少訂購量
	 */
	public Double getSafe_qty() {
		return safe_qty;
	}

	/**
	 * @param safe_qty
	 *			最少訂購量
	 */
	public void setSafe_qty(Double Safe_qty) {
		this.safe_qty = Safe_qty;
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
	 * @return plan_date
	 *			預定到廠日
	 */
	public Date getPlan_date() {
		return plan_date;
	}

	/**
	 * @param plan_date
	 *			預定到廠日
	 */
	public void setPlan_date(Date Plan_date) {
		this.plan_date = Plan_date;
	}
		/**
	 * @return ioqty
	 *			已進貨數量
	 */
	public Double getIoqty() {
		return ioqty;
	}

	/**
	 * @param ioqty
	 *			已進貨數量
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
	 * @return assy_nbr
	 *			上皆有料
	 */
	public String getAssy_nbr() {
		return assy_nbr;
	}

	/**
	 * @param assy_nbr
	 *			上皆有料
	 */
	public void setAssy_nbr(String Assy_nbr) {
		this.assy_nbr = Assy_nbr;
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

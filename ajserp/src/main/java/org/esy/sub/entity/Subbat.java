package org.esy.sub.entity;

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
 *  @date Fri Jul 31 09:39:52 CST 2020
 */
@Entity
@Table(name = "sub_bat" ,indexes = { @Index(name = "created", columnList = "created"), 
@Index(name = "updated", columnList = "updated")})
@EntityInfo("委外加工明細檔")
public class Subbat extends BaseProperties {

	private static final long serialVersionUID = 1L;

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

	@FieldInfo("批號")
	@FilterInfo(ListValue = "")
	@Column(name = "desc_no", length =32  )
	private String desc_no ;

	@FieldInfo("生產工號")
	@FilterInfo(ListValue = "")
	@Column(name = "pps_nbr", length =32  )
	private String pps_nbr ;

	@FieldInfo("生產工序號")
	@FilterInfo(ListValue = "")
	@Column(name = "pps_ioseq", length =32  )
	private String pps_ioseq ;

	@FieldInfo("產品編號")
	@FilterInfo(ListValue = "")
	@Column(name = "item_nbr", length =32  )
	private String item_nbr ;

	@FieldInfo("產品規格")
	@FilterInfo(ListValue = "")
	@Column(name = "item_desc", length =32  )
	private String item_desc ;

	@FieldInfo("製程代號")
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

	@FieldInfo("單價")
	@FilterInfo(ListValue = "")
	@Column(name = "price")
	private Double price;

	@FieldInfo("金額")
	@FilterInfo(ListValue = "")
	@Column(name = "amt")
	private Double amt;

	@FieldInfo("預定到廠日")
	@FilterInfo(ListValue = "")
	@Column(name = "plan_date")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date plan_date;

	@FieldInfo("已收進數量")
	@FilterInfo(ListValue = "")
	@Column(name = "ioqty")
	private Double ioqty;

	@FieldInfo("已損壞數量")
	@FilterInfo(ListValue = "")
	@Column(name = "errqty")
	private Double errqty;

	@FieldInfo("備註")
	@FilterInfo(ListValue = "")
	@Column(name = "remark", length =32  )
	private String remark ;

	@FieldInfo("*已展開BOM數量")
	@FilterInfo(ListValue = "")
	@Column(name = "isbom")
	private Double isbom;

	@FieldInfo("單據號碼")
	@FilterInfo(ListValue = "")
	@Column(name = "ots_nbr", length =32  )
	private String ots_nbr ;

	@FieldInfo("加工單序號")
	@FilterInfo(ListValue = "")
	@Column(name = "ots_ioseq", length =32  )
	private String ots_ioseq ;

	@FieldInfo("單據號碼")
	@FilterInfo(ListValue = "")
	@Column(name = "ord_nbr", length =32  )
	private String ord_nbr ;

	@FieldInfo("加工單序號")
	@FilterInfo(ListValue = "")
	@Column(name = "ord_ioseq", length =32  )
	private String ord_ioseq ;

	@FieldInfo("單據號碼")
	@FilterInfo(ListValue = "")
	@Column(name = "sub_nbr", length =32  )
	private String sub_nbr ;

	@FieldInfo("加工單序號")
	@FilterInfo(ListValue = "")
	@Column(name = "sub_ioseq", length =32  )
	private String sub_ioseq ;

	@FieldInfo("單據號碼")
	@FilterInfo(ListValue = "")
	@Column(name = "oem_nbr", length =32  )
	private String oem_nbr ;

	@FieldInfo("加工單序號")
	@FilterInfo(ListValue = "")
	@Column(name = "oem_ioseq", length =32  )
	private String oem_ioseq ;

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
	public Subbat() {
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
	 *		  批號
	 * 
	 	 * @param pps_nbr
	 *		  生產工號
	 * 
	 	 * @param pps_ioseq
	 *		  生產工序號
	 * 
	 	 * @param item_nbr
	 *		  產品編號
	 * 
	 	 * @param item_desc
	 *		  產品規格
	 * 
	 	 * @param pro_nbr
	 *		  製程代號
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
	 	 * @param price
	 *		  單價
	 * 
	 	 * @param amt
	 *		  金額
	 * 
	 	 * @param plan_date
	 *		  預定到廠日
	 * 
	 	 * @param ioqty
	 *		  已收進數量
	 * 
	 	 * @param errqty
	 *		  已損壞數量
	 * 
	 	 * @param remark
	 *		  備註
	 * 
	 	 * @param isbom
	 *		  *已展開BOM數量
	 * 
	 	 * @param ots_nbr
	 *		  單據號碼
	 * 
	 	 * @param ots_ioseq
	 *		  加工單序號
	 * 
	 	 * @param ord_nbr
	 *		  單據號碼
	 * 
	 	 * @param ord_ioseq
	 *		  加工單序號
	 * 
	 	 * @param sub_nbr
	 *		  單據號碼
	 * 
	 	 * @param sub_ioseq
	 *		  加工單序號
	 * 
	 	 * @param oem_nbr
	 *		  單據號碼
	 * 
	 	 * @param oem_ioseq
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
	 	 */
    	public Subbat( String nbr, Integer seq, String ioseq, String desc_no, String pps_nbr, String pps_ioseq, String item_nbr, String item_desc, String pro_nbr, String unit, String t_unit, Double qty, String kcnbr1, String kcnbr2, Double jqty, Double t_qty, Double price, Double amt, Date plan_date, Double ioqty, Double errqty, String remark, Double isbom, String ots_nbr, String ots_ioseq, String ord_nbr, String ord_ioseq, String sub_nbr, String sub_ioseq, String oem_nbr, String oem_ioseq, String tranok, String tranop, Integer trancnt ) {
		super();
				this.nbr = nbr;
				this.seq = seq;
				this.ioseq = ioseq;
				this.desc_no = desc_no;
				this.pps_nbr = pps_nbr;
				this.pps_ioseq = pps_ioseq;
				this.item_nbr = item_nbr;
				this.item_desc = item_desc;
				this.pro_nbr = pro_nbr;
				this.unit = unit;
				this.t_unit = t_unit;
				this.qty = qty;
				this.kcnbr1 = kcnbr1;
				this.kcnbr2 = kcnbr2;
				this.jqty = jqty;
				this.t_qty = t_qty;
				this.price = price;
				this.amt = amt;
				this.plan_date = plan_date;
				this.ioqty = ioqty;
				this.errqty = errqty;
				this.remark = remark;
				this.isbom = isbom;
				this.ots_nbr = ots_nbr;
				this.ots_ioseq = ots_ioseq;
				this.ord_nbr = ord_nbr;
				this.ord_ioseq = ord_ioseq;
				this.sub_nbr = sub_nbr;
				this.sub_ioseq = sub_ioseq;
				this.oem_nbr = oem_nbr;
				this.oem_ioseq = oem_ioseq;
				this.tranok = tranok;
				this.tranop = tranop;
				this.trancnt = trancnt;
			}

		public Subbat(String uid) {
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
	 *			批號
	 */
	public String getDesc_no() {
		return desc_no;
	}

	/**
	 * @param desc_no
	 *			批號
	 */
	public void setDesc_no(String Desc_no) {
		this.desc_no = Desc_no;
	}
		/**
	 * @return pps_nbr
	 *			生產工號
	 */
	public String getPps_nbr() {
		return pps_nbr;
	}

	/**
	 * @param pps_nbr
	 *			生產工號
	 */
	public void setPps_nbr(String Pps_nbr) {
		this.pps_nbr = Pps_nbr;
	}
		/**
	 * @return pps_ioseq
	 *			生產工序號
	 */
	public String getPps_ioseq() {
		return pps_ioseq;
	}

	/**
	 * @param pps_ioseq
	 *			生產工序號
	 */
	public void setPps_ioseq(String Pps_ioseq) {
		this.pps_ioseq = Pps_ioseq;
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
	 *			製程代號
	 */
	public String getPro_nbr() {
		return pro_nbr;
	}

	/**
	 * @param pro_nbr
	 *			製程代號
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
	 *			已收進數量
	 */
	public Double getIoqty() {
		return ioqty;
	}

	/**
	 * @param ioqty
	 *			已收進數量
	 */
	public void setIoqty(Double Ioqty) {
		this.ioqty = Ioqty;
	}
		/**
	 * @return errqty
	 *			已損壞數量
	 */
	public Double getErrqty() {
		return errqty;
	}

	/**
	 * @param errqty
	 *			已損壞數量
	 */
	public void setErrqty(Double Errqty) {
		this.errqty = Errqty;
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
	 * @return isbom
	 *			*已展開BOM數量
	 */
	public Double getIsbom() {
		return isbom;
	}

	/**
	 * @param isbom
	 *			*已展開BOM數量
	 */
	public void setIsbom(Double Isbom) {
		this.isbom = Isbom;
	}
		/**
	 * @return ots_nbr
	 *			單據號碼
	 */
	public String getOts_nbr() {
		return ots_nbr;
	}

	/**
	 * @param ots_nbr
	 *			單據號碼
	 */
	public void setOts_nbr(String Ots_nbr) {
		this.ots_nbr = Ots_nbr;
	}
		/**
	 * @return ots_ioseq
	 *			加工單序號
	 */
	public String getOts_ioseq() {
		return ots_ioseq;
	}

	/**
	 * @param ots_ioseq
	 *			加工單序號
	 */
	public void setOts_ioseq(String Ots_ioseq) {
		this.ots_ioseq = Ots_ioseq;
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
	 * @return sub_nbr
	 *			單據號碼
	 */
	public String getSub_nbr() {
		return sub_nbr;
	}

	/**
	 * @param sub_nbr
	 *			單據號碼
	 */
	public void setSub_nbr(String Sub_nbr) {
		this.sub_nbr = Sub_nbr;
	}
		/**
	 * @return sub_ioseq
	 *			加工單序號
	 */
	public String getSub_ioseq() {
		return sub_ioseq;
	}

	/**
	 * @param sub_ioseq
	 *			加工單序號
	 */
	public void setSub_ioseq(String Sub_ioseq) {
		this.sub_ioseq = Sub_ioseq;
	}
		/**
	 * @return oem_nbr
	 *			單據號碼
	 */
	public String getOem_nbr() {
		return oem_nbr;
	}

	/**
	 * @param oem_nbr
	 *			單據號碼
	 */
	public void setOem_nbr(String Oem_nbr) {
		this.oem_nbr = Oem_nbr;
	}
		/**
	 * @return oem_ioseq
	 *			加工單序號
	 */
	public String getOem_ioseq() {
		return oem_ioseq;
	}

	/**
	 * @param oem_ioseq
	 *			加工單序號
	 */
	public void setOem_ioseq(String Oem_ioseq) {
		this.oem_ioseq = Oem_ioseq;
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

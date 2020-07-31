package org.esy.mak.entity;

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
 *  @date Fri Jul 31 14:34:04 CST 2020
 */
@Entity
@Table(name = "mak_bat" ,indexes = { @Index(name = "created", columnList = "created"), 
@Index(name = "updated", columnList = "updated")})
@EntityInfo("製造命令單明細")
public class Makbat extends BaseProperties {

	private static final long serialVersionUID = 1L;

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

	@FieldInfo("日期")
	@FilterInfo(ListValue = "")
	@Column(name = "nbrdate")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date nbrdate;

	@FieldInfo("製程")
	@FilterInfo(ListValue = "")
	@Column(name = "pro_nbr", length =32  )
	private String pro_nbr ;

	@FieldInfo("單位")
	@FilterInfo(ListValue = "")
	@Column(name = "unit", length =32  )
	private String unit ;

	@FieldInfo("數量")
	@FilterInfo(ListValue = "")
	@Column(name = "qty")
	private Double qty;

	@FieldInfo("已出貨數量")
	@FilterInfo(ListValue = "")
	@Column(name = "ioqty")
	private Double ioqty;

	@FieldInfo("預計出貨日")
	@FilterInfo(ListValue = "")
	@Column(name = "plan_date")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date plan_date;

	@FieldInfo("實際完工日")
	@FilterInfo(ListValue = "")
	@Column(name = "actu_date")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date actu_date;

	@FieldInfo("原實際完工日期")
	@FilterInfo(ListValue = "")
	@Column(name = "olddate")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date olddate;

	@FieldInfo("備註")
	@FilterInfo(ListValue = "")
	@Column(name = "remark", length =32  )
	private String remark ;

	@FieldInfo("Y已轉採購")
	@FilterInfo(ListValue = "")
	@Column(name = "pur_ctl", length =32  )
	private String pur_ctl ;

	@FieldInfo("生產工號")
	@FilterInfo(ListValue = "")
	@Column(name = "pps_nbr", length =32  )
	private String pps_nbr ;

	@FieldInfo("生產工單序號")
	@FilterInfo(ListValue = "")
	@Column(name = "pps_ioseq", length =32  )
	private String pps_ioseq ;

	@FieldInfo("*已展開BOM數量")
	@FilterInfo(ListValue = "")
	@Column(name = "isbom")
	private Double isbom;

	@FieldInfo("單據號碼")
	@FilterInfo(ListValue = "")
	@Column(name = "pur_nbr", length =32  )
	private String pur_nbr ;

	@FieldInfo("出貨單連結序")
	@FilterInfo(ListValue = "")
	@Column(name = "pur_ioseq", length =32  )
	private String pur_ioseq ;

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

	@FieldInfo("生產工時")
	@FilterInfo(ListValue = "")
	@Column(name = "hours")
	private Double hours;

	@FieldInfo("訂單編號")
	@FilterInfo(ListValue = "")
	@Column(name = "ord_nbr1", length =32  )
	private String ord_nbr1 ;

	@FieldInfo("製程數量")
	@FilterInfo(ListValue = "")
	@Column(name = "pro_qty")
	private Double pro_qty;

	@FieldInfo("制程完工數量")
	@FilterInfo(ListValue = "")
	@Column(name = "pro_ioqty")
	private Double pro_ioqty;

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


     /**
	 *
	 * 构造函数
	 *
	 */
	public Makbat() {
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
	 	 * @param nbrdate
	 *		  日期
	 * 
	 	 * @param pro_nbr
	 *		  製程
	 * 
	 	 * @param unit
	 *		  單位
	 * 
	 	 * @param qty
	 *		  數量
	 * 
	 	 * @param ioqty
	 *		  已出貨數量
	 * 
	 	 * @param plan_date
	 *		  預計出貨日
	 * 
	 	 * @param actu_date
	 *		  實際完工日
	 * 
	 	 * @param olddate
	 *		  原實際完工日期
	 * 
	 	 * @param remark
	 *		  備註
	 * 
	 	 * @param pur_ctl
	 *		  Y已轉採購
	 * 
	 	 * @param pps_nbr
	 *		  生產工號
	 * 
	 	 * @param pps_ioseq
	 *		  生產工單序號
	 * 
	 	 * @param isbom
	 *		  *已展開BOM數量
	 * 
	 	 * @param pur_nbr
	 *		  單據號碼
	 * 
	 	 * @param pur_ioseq
	 *		  出貨單連結序
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
	 	 * @param hours
	 *		  生產工時
	 * 
	 	 * @param ord_nbr1
	 *		  訂單編號
	 * 
	 	 * @param pro_qty
	 *		  製程數量
	 * 
	 	 * @param pro_ioqty
	 *		  制程完工數量
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
	 	 */
    	public Makbat( String nbr, Integer seq, String ioseq, String ord_nbr, String ord_ioseq, String desc_no, String item_nbr, String item_desc, Date nbrdate, String pro_nbr, String unit, Double qty, Double ioqty, Date plan_date, Date actu_date, Date olddate, String remark, String pur_ctl, String pps_nbr, String pps_ioseq, Double isbom, String pur_nbr, String pur_ioseq, String tranok, String tranop, Integer trancnt, Double hours, String ord_nbr1, Double pro_qty, Double pro_ioqty, String kcnbr1, String kcnbr2, Double jqty ) {
		super();
				this.nbr = nbr;
				this.seq = seq;
				this.ioseq = ioseq;
				this.ord_nbr = ord_nbr;
				this.ord_ioseq = ord_ioseq;
				this.desc_no = desc_no;
				this.item_nbr = item_nbr;
				this.item_desc = item_desc;
				this.nbrdate = nbrdate;
				this.pro_nbr = pro_nbr;
				this.unit = unit;
				this.qty = qty;
				this.ioqty = ioqty;
				this.plan_date = plan_date;
				this.actu_date = actu_date;
				this.olddate = olddate;
				this.remark = remark;
				this.pur_ctl = pur_ctl;
				this.pps_nbr = pps_nbr;
				this.pps_ioseq = pps_ioseq;
				this.isbom = isbom;
				this.pur_nbr = pur_nbr;
				this.pur_ioseq = pur_ioseq;
				this.tranok = tranok;
				this.tranop = tranop;
				this.trancnt = trancnt;
				this.hours = hours;
				this.ord_nbr1 = ord_nbr1;
				this.pro_qty = pro_qty;
				this.pro_ioqty = pro_ioqty;
				this.kcnbr1 = kcnbr1;
				this.kcnbr2 = kcnbr2;
				this.jqty = jqty;
			}

		public Makbat(String uid) {
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
	 * @return actu_date
	 *			實際完工日
	 */
	public Date getActu_date() {
		return actu_date;
	}

	/**
	 * @param actu_date
	 *			實際完工日
	 */
	public void setActu_date(Date Actu_date) {
		this.actu_date = Actu_date;
	}
		/**
	 * @return olddate
	 *			原實際完工日期
	 */
	public Date getOlddate() {
		return olddate;
	}

	/**
	 * @param olddate
	 *			原實際完工日期
	 */
	public void setOlddate(Date Olddate) {
		this.olddate = Olddate;
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
	 * @return pur_ctl
	 *			Y已轉採購
	 */
	public String getPur_ctl() {
		return pur_ctl;
	}

	/**
	 * @param pur_ctl
	 *			Y已轉採購
	 */
	public void setPur_ctl(String Pur_ctl) {
		this.pur_ctl = Pur_ctl;
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
	 *			生產工單序號
	 */
	public String getPps_ioseq() {
		return pps_ioseq;
	}

	/**
	 * @param pps_ioseq
	 *			生產工單序號
	 */
	public void setPps_ioseq(String Pps_ioseq) {
		this.pps_ioseq = Pps_ioseq;
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
	 * @return pur_nbr
	 *			單據號碼
	 */
	public String getPur_nbr() {
		return pur_nbr;
	}

	/**
	 * @param pur_nbr
	 *			單據號碼
	 */
	public void setPur_nbr(String Pur_nbr) {
		this.pur_nbr = Pur_nbr;
	}
		/**
	 * @return pur_ioseq
	 *			出貨單連結序
	 */
	public String getPur_ioseq() {
		return pur_ioseq;
	}

	/**
	 * @param pur_ioseq
	 *			出貨單連結序
	 */
	public void setPur_ioseq(String Pur_ioseq) {
		this.pur_ioseq = Pur_ioseq;
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
	 * @return hours
	 *			生產工時
	 */
	public Double getHours() {
		return hours;
	}

	/**
	 * @param hours
	 *			生產工時
	 */
	public void setHours(Double Hours) {
		this.hours = Hours;
	}
		/**
	 * @return ord_nbr1
	 *			訂單編號
	 */
	public String getOrd_nbr1() {
		return ord_nbr1;
	}

	/**
	 * @param ord_nbr1
	 *			訂單編號
	 */
	public void setOrd_nbr1(String Ord_nbr1) {
		this.ord_nbr1 = Ord_nbr1;
	}
		/**
	 * @return pro_qty
	 *			製程數量
	 */
	public Double getPro_qty() {
		return pro_qty;
	}

	/**
	 * @param pro_qty
	 *			製程數量
	 */
	public void setPro_qty(Double Pro_qty) {
		this.pro_qty = Pro_qty;
	}
		/**
	 * @return pro_ioqty
	 *			制程完工數量
	 */
	public Double getPro_ioqty() {
		return pro_ioqty;
	}

	/**
	 * @param pro_ioqty
	 *			制程完工數量
	 */
	public void setPro_ioqty(Double Pro_ioqty) {
		this.pro_ioqty = Pro_ioqty;
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
	
}

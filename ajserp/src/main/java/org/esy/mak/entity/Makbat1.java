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
 *  @date Fri Jul 31 14:34:25 CST 2020
 */
@Entity
@Table(name = "mak_bat1" ,indexes = { @Index(name = "created", columnList = "created"), 
@Index(name = "updated", columnList = "updated")})
@EntityInfo("製造命令單BOM用料檔")
public class Makbat1 extends BaseProperties {

	private static final long serialVersionUID = 1L;

	@FieldInfo("命令單號碼")
	@FilterInfo(ListValue = "")
	@Column(name = "nbr", length =32  )
	private String nbr ;

	@FieldInfo("連結序")
	@FilterInfo(ListValue = "")
	@Column(name = "seq")
	private Integer seq;

	@FieldInfo("庫存交易序")
	@FilterInfo(ListValue = "")
	@Column(name = "ioseq", length =32  )
	private String ioseq ;

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

	@FieldInfo("單位")
	@FilterInfo(ListValue = "")
	@Column(name = "unit", length =32  )
	private String unit ;

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

	@FieldInfo("入庫倉庫")
	@FilterInfo(ListValue = "")
	@Column(name = "ware_nbr", length =32  )
	private String ware_nbr ;

	@FieldInfo("日期")
	@FilterInfo(ListValue = "")
	@Column(name = "nbrdate")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date nbrdate;

	@FieldInfo("Y已轉採購")
	@FilterInfo(ListValue = "")
	@Column(name = "pur_ctl", length =32  )
	private String pur_ctl ;

	@FieldInfo("備注")
	@FilterInfo(ListValue = "")
	@Column(name = "remark", length =32  )
	private String remark ;

	@FieldInfo("需求日期")
	@FilterInfo(ListValue = "")
	@Column(name = "mark_date")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date mark_date;

	@FieldInfo("已領料數量")
	@FilterInfo(ListValue = "")
	@Column(name = "ioqty")
	private Double ioqty;

	@FieldInfo("產品編號")
	@FilterInfo(ListValue = "")
	@Column(name = "item_nbr1", length =32  )
	private String item_nbr1 ;

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

	@FieldInfo("庫存交易序")
	@FilterInfo(ListValue = "")
	@Column(name = "bat_ioseq", length =32  )
	private String bat_ioseq ;

	@FieldInfo("母件代號")
	@FilterInfo(ListValue = "")
	@Column(name = "assy_nbr", length =32  )
	private String assy_nbr ;


     /**
	 *
	 * 构造函数
	 *
	 */
	public Makbat1() {
		super();
	}
	
	/**
	 *
	 * 构造函数
	 *
	 	 * @param nbr
	 *		  命令單號碼
	 * 
	 	 * @param seq
	 *		  連結序
	 * 
	 	 * @param ioseq
	 *		  庫存交易序
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
	 	 * @param unit
	 *		  單位
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
	 	 * @param ware_nbr
	 *		  入庫倉庫
	 * 
	 	 * @param nbrdate
	 *		  日期
	 * 
	 	 * @param pur_ctl
	 *		  Y已轉採購
	 * 
	 	 * @param remark
	 *		  備注
	 * 
	 	 * @param mark_date
	 *		  需求日期
	 * 
	 	 * @param ioqty
	 *		  已領料數量
	 * 
	 	 * @param item_nbr1
	 *		  產品編號
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
	 	 * @param bat_ioseq
	 *		  庫存交易序
	 * 
	 	 * @param assy_nbr
	 *		  母件代號
	 * 
	 	 */
    	public Makbat1( String nbr, Integer seq, String ioseq, String desc_no, String item_nbr, String item_desc, String pro_nbr, String unit, Double qty, String kcnbr1, String kcnbr2, Double jqty, String ware_nbr, Date nbrdate, String pur_ctl, String remark, Date mark_date, Double ioqty, String item_nbr1, String tranok, String tranop, Integer trancnt, String bat_ioseq, String assy_nbr ) {
		super();
				this.nbr = nbr;
				this.seq = seq;
				this.ioseq = ioseq;
				this.desc_no = desc_no;
				this.item_nbr = item_nbr;
				this.item_desc = item_desc;
				this.pro_nbr = pro_nbr;
				this.unit = unit;
				this.qty = qty;
				this.kcnbr1 = kcnbr1;
				this.kcnbr2 = kcnbr2;
				this.jqty = jqty;
				this.ware_nbr = ware_nbr;
				this.nbrdate = nbrdate;
				this.pur_ctl = pur_ctl;
				this.remark = remark;
				this.mark_date = mark_date;
				this.ioqty = ioqty;
				this.item_nbr1 = item_nbr1;
				this.tranok = tranok;
				this.tranop = tranop;
				this.trancnt = trancnt;
				this.bat_ioseq = bat_ioseq;
				this.assy_nbr = assy_nbr;
			}

		public Makbat1(String uid) {
		// TODO Auto-generated constructor stub
	}

		/**
	 * @return nbr
	 *			命令單號碼
	 */
	public String getNbr() {
		return nbr;
	}

	/**
	 * @param nbr
	 *			命令單號碼
	 */
	public void setNbr(String Nbr) {
		this.nbr = Nbr;
	}
		/**
	 * @return seq
	 *			連結序
	 */
	public Integer getSeq() {
		return seq;
	}

	/**
	 * @param seq
	 *			連結序
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
	 * @return ware_nbr
	 *			入庫倉庫
	 */
	public String getWare_nbr() {
		return ware_nbr;
	}

	/**
	 * @param ware_nbr
	 *			入庫倉庫
	 */
	public void setWare_nbr(String Ware_nbr) {
		this.ware_nbr = Ware_nbr;
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
	 * @return remark
	 *			備注
	 */
	public String getRemark() {
		return remark;
	}

	/**
	 * @param remark
	 *			備注
	 */
	public void setRemark(String Remark) {
		this.remark = Remark;
	}
		/**
	 * @return mark_date
	 *			需求日期
	 */
	public Date getMark_date() {
		return mark_date;
	}

	/**
	 * @param mark_date
	 *			需求日期
	 */
	public void setMark_date(Date Mark_date) {
		this.mark_date = Mark_date;
	}
		/**
	 * @return ioqty
	 *			已領料數量
	 */
	public Double getIoqty() {
		return ioqty;
	}

	/**
	 * @param ioqty
	 *			已領料數量
	 */
	public void setIoqty(Double Ioqty) {
		this.ioqty = Ioqty;
	}
		/**
	 * @return item_nbr1
	 *			產品編號
	 */
	public String getItem_nbr1() {
		return item_nbr1;
	}

	/**
	 * @param item_nbr1
	 *			產品編號
	 */
	public void setItem_nbr1(String Item_nbr1) {
		this.item_nbr1 = Item_nbr1;
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
	 * @return bat_ioseq
	 *			庫存交易序
	 */
	public String getBat_ioseq() {
		return bat_ioseq;
	}

	/**
	 * @param bat_ioseq
	 *			庫存交易序
	 */
	public void setBat_ioseq(String Bat_ioseq) {
		this.bat_ioseq = Bat_ioseq;
	}
		/**
	 * @return assy_nbr
	 *			母件代號
	 */
	public String getAssy_nbr() {
		return assy_nbr;
	}

	/**
	 * @param assy_nbr
	 *			母件代號
	 */
	public void setAssy_nbr(String Assy_nbr) {
		this.assy_nbr = Assy_nbr;
	}
	
}

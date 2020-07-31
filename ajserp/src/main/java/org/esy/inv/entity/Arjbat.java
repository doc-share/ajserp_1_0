package org.esy.inv.entity;

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
 *  @date Fri Jul 31 17:24:38 CST 2020
 */
@Entity
@Table(name = "arj_bat" ,indexes = { @Index(name = "created", columnList = "created"), 
@Index(name = "updated", columnList = "updated")})
@EntityInfo("庫存調整單明細檔")
public class Arjbat extends BaseProperties {

	private static final long serialVersionUID = 1L;

	@FieldInfo("單據編號")
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

	@FieldInfo("倉庫")
	@FilterInfo(ListValue = "")
	@Column(name = "ware_nbr", length =32  )
	private String ware_nbr ;

	@FieldInfo("單位")
	@FilterInfo(ListValue = "")
	@Column(name = "unit", length =32  )
	private String unit ;

	@FieldInfo("調整前數量")
	@FilterInfo(ListValue = "")
	@Column(name = "be_qty")
	private Double be_qty;

	@FieldInfo("調整後數量")
	@FilterInfo(ListValue = "")
	@Column(name = "af_qty")
	private Double af_qty;

	@FieldInfo("差異數量")
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

	@FieldInfo(" 調整前件數")
	@FilterInfo(ListValue = "")
	@Column(name = "be_jqty")
	private Double be_jqty;

	@FieldInfo(" 調整後件數")
	@FilterInfo(ListValue = "")
	@Column(name = "af_jqty")
	private Double af_jqty;

	@FieldInfo(" 件數")
	@FilterInfo(ListValue = "")
	@Column(name = "jqty")
	private Double jqty;

	@FieldInfo("日期")
	@FilterInfo(ListValue = "")
	@Column(name = "nbrdate")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date nbrdate;

	@FieldInfo("+,入,-出")
	@FilterInfo(ListValue = "")
	@Column(name = "io_p", length =32  )
	private String io_p ;

	@FieldInfo("備註")
	@FilterInfo(ListValue = "")
	@Column(name = "remark", length =128  )
	private String remark ;

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
	public Arjbat() {
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
	 *		  庫存交易序
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
	 	 * @param ware_nbr
	 *		  倉庫
	 * 
	 	 * @param unit
	 *		  單位
	 * 
	 	 * @param be_qty
	 *		  調整前數量
	 * 
	 	 * @param af_qty
	 *		  調整後數量
	 * 
	 	 * @param qty
	 *		  差異數量
	 * 
	 	 * @param kcnbr1
	 *		   庫存批號1
	 * 
	 	 * @param kcnbr2
	 *		   庫存批號2
	 * 
	 	 * @param be_jqty
	 *		   調整前件數
	 * 
	 	 * @param af_jqty
	 *		   調整後件數
	 * 
	 	 * @param jqty
	 *		   件數
	 * 
	 	 * @param nbrdate
	 *		  日期
	 * 
	 	 * @param io_p
	 *		  +,入,-出
	 * 
	 	 * @param remark
	 *		  備註
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
    	public Arjbat( String nbr, Integer seq, String ioseq, String item_nbr, String item_desc, String pro_nbr, String ware_nbr, String unit, Double be_qty, Double af_qty, Double qty, String kcnbr1, String kcnbr2, Double be_jqty, Double af_jqty, Double jqty, Date nbrdate, String io_p, String remark, String tranok, String tranop, Integer trancnt, String stock_desc ) {
		super();
				this.nbr = nbr;
				this.seq = seq;
				this.ioseq = ioseq;
				this.item_nbr = item_nbr;
				this.item_desc = item_desc;
				this.pro_nbr = pro_nbr;
				this.ware_nbr = ware_nbr;
				this.unit = unit;
				this.be_qty = be_qty;
				this.af_qty = af_qty;
				this.qty = qty;
				this.kcnbr1 = kcnbr1;
				this.kcnbr2 = kcnbr2;
				this.be_jqty = be_jqty;
				this.af_jqty = af_jqty;
				this.jqty = jqty;
				this.nbrdate = nbrdate;
				this.io_p = io_p;
				this.remark = remark;
				this.tranok = tranok;
				this.tranop = tranop;
				this.trancnt = trancnt;
				this.stock_desc = stock_desc;
			}

		public Arjbat(String uid) {
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
	 * @return be_qty
	 *			調整前數量
	 */
	public Double getBe_qty() {
		return be_qty;
	}

	/**
	 * @param be_qty
	 *			調整前數量
	 */
	public void setBe_qty(Double Be_qty) {
		this.be_qty = Be_qty;
	}
		/**
	 * @return af_qty
	 *			調整後數量
	 */
	public Double getAf_qty() {
		return af_qty;
	}

	/**
	 * @param af_qty
	 *			調整後數量
	 */
	public void setAf_qty(Double Af_qty) {
		this.af_qty = Af_qty;
	}
		/**
	 * @return qty
	 *			差異數量
	 */
	public Double getQty() {
		return qty;
	}

	/**
	 * @param qty
	 *			差異數量
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
	 * @return be_jqty
	 *			 調整前件數
	 */
	public Double getBe_jqty() {
		return be_jqty;
	}

	/**
	 * @param be_jqty
	 *			 調整前件數
	 */
	public void setBe_jqty(Double Be_jqty) {
		this.be_jqty = Be_jqty;
	}
		/**
	 * @return af_jqty
	 *			 調整後件數
	 */
	public Double getAf_jqty() {
		return af_jqty;
	}

	/**
	 * @param af_jqty
	 *			 調整後件數
	 */
	public void setAf_jqty(Double Af_jqty) {
		this.af_jqty = Af_jqty;
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
	 * @return io_p
	 *			+,入,-出
	 */
	public String getIo_p() {
		return io_p;
	}

	/**
	 * @param io_p
	 *			+,入,-出
	 */
	public void setIo_p(String Io_p) {
		this.io_p = Io_p;
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

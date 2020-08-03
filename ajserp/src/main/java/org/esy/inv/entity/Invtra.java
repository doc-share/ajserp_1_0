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
 *  @date Mon Aug 03 10:12:58 CST 2020
 */
@Entity
@Table(name = "inv_tra" ,indexes = { @Index(name = "created", columnList = "created"), 
@Index(name = "updated", columnList = "updated")})
@EntityInfo("庫存交易明細檔")
public class Invtra extends BaseProperties {

	private static final long serialVersionUID = 1L;

	@FieldInfo("交易檔名")
	@FilterInfo(ListValue = "")
	@Column(name = "file_nbr", length =32  )
	private String file_nbr ;

	@FieldInfo("日期")
	@FilterInfo(ListValue = "")
	@Column(name = "nbrdate")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date nbrdate;

	@FieldInfo("單據號碼")
	@FilterInfo(ListValue = "")
	@Column(name = "nbr", length =32  )
	private String nbr ;

	@FieldInfo("庫存交易序")
	@FilterInfo(ListValue = "")
	@Column(name = "ioseq", length =32  )
	private String ioseq ;

	@FieldInfo("料品代號")
	@FilterInfo(ListValue = "")
	@Column(name = "item_nbr", length =32  )
	private String item_nbr ;

	@FieldInfo("倉庫代號")
	@FilterInfo(ListValue = "")
	@Column(name = "ware_nbr", length =32  )
	private String ware_nbr ;

	@FieldInfo("製程代號")
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

	@FieldInfo("單價")
	@FilterInfo(ListValue = "")
	@Column(name = "price")
	private Double price;

	@FieldInfo("單價")
	@FilterInfo(ListValue = "")
	@Column(name = "amt")
	private Double amt;

	@FieldInfo("交易說明")
	@FilterInfo(ListValue = "")
	@Column(name = "tra_desc", length =32  )
	private String tra_desc ;

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
	public Invtra() {
		super();
	}
	
	/**
	 *
	 * 构造函数
	 *
	 	 * @param file_nbr
	 *		  交易檔名
	 * 
	 	 * @param nbrdate
	 *		  日期
	 * 
	 	 * @param nbr
	 *		  單據號碼
	 * 
	 	 * @param ioseq
	 *		  庫存交易序
	 * 
	 	 * @param item_nbr
	 *		  料品代號
	 * 
	 	 * @param ware_nbr
	 *		  倉庫代號
	 * 
	 	 * @param pro_nbr
	 *		  製程代號
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
	 	 * @param price
	 *		  單價
	 * 
	 	 * @param amt
	 *		  單價
	 * 
	 	 * @param tra_desc
	 *		  交易說明
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
    	public Invtra( String file_nbr, Date nbrdate, String nbr, String ioseq, String item_nbr, String ware_nbr, String pro_nbr, String unit, Double qty, String kcnbr1, String kcnbr2, Double jqty, Double price, Double amt, String tra_desc, String tranok, String tranop, Integer trancnt ) {
		super();
				this.file_nbr = file_nbr;
				this.nbrdate = nbrdate;
				this.nbr = nbr;
				this.ioseq = ioseq;
				this.item_nbr = item_nbr;
				this.ware_nbr = ware_nbr;
				this.pro_nbr = pro_nbr;
				this.unit = unit;
				this.qty = qty;
				this.kcnbr1 = kcnbr1;
				this.kcnbr2 = kcnbr2;
				this.jqty = jqty;
				this.price = price;
				this.amt = amt;
				this.tra_desc = tra_desc;
				this.tranok = tranok;
				this.tranop = tranop;
				this.trancnt = trancnt;
			}

		/**
	 * @return file_nbr
	 *			交易檔名
	 */
	public String getFile_nbr() {
		return file_nbr;
	}

	/**
	 * @param file_nbr
	 *			交易檔名
	 */
	public void setFile_nbr(String File_nbr) {
		this.file_nbr = File_nbr;
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
	 *			料品代號
	 */
	public String getItem_nbr() {
		return item_nbr;
	}

	/**
	 * @param item_nbr
	 *			料品代號
	 */
	public void setItem_nbr(String Item_nbr) {
		this.item_nbr = Item_nbr;
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
	 *			單價
	 */
	public Double getAmt() {
		return amt;
	}

	/**
	 * @param amt
	 *			單價
	 */
	public void setAmt(Double Amt) {
		this.amt = Amt;
	}
		/**
	 * @return tra_desc
	 *			交易說明
	 */
	public String getTra_desc() {
		return tra_desc;
	}

	/**
	 * @param tra_desc
	 *			交易說明
	 */
	public void setTra_desc(String Tra_desc) {
		this.tra_desc = Tra_desc;
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

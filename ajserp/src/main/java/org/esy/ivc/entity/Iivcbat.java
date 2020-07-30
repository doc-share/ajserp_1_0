package org.esy.ivc.entity;

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
 *  @date Thu Jul 30 16:25:04 CST 2020
 */
@Entity
@Table(name = "iivc_bat" ,indexes = { @Index(name = "created", columnList = "created"), 
@Index(name = "updated", columnList = "updated")})
@EntityInfo("進項發票明細檔")
public class Iivcbat extends BaseProperties {

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

	@FieldInfo("產品編號")
	@FilterInfo(ListValue = "")
	@Column(name = "item_nbr", length =32  )
	private String item_nbr ;

	@FieldInfo("產品名稱")
	@FilterInfo(ListValue = "")
	@Column(name = "item_desc", length =128  )
	private String item_desc ;

	@FieldInfo("產品名稱")
	@FilterInfo(ListValue = "")
	@Column(name = "itemname", length =128  )
	private String itemname ;

	@FieldInfo("發票料品單位")
	@FilterInfo(ListValue = "")
	@Column(name = "unit", length =32  )
	private String unit ;

	@FieldInfo("發票料品數量")
	@FilterInfo(ListValue = "")
	@Column(name = "qty")
	private Double qty;

	@FieldInfo("單價")
	@FilterInfo(ListValue = "")
	@Column(name = "price")
	private Double price;

	@FieldInfo("發票金額")
	@FilterInfo(ListValue = "")
	@Column(name = "amt")
	private Double amt;

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
	public Iivcbat() {
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
	 	 * @param item_nbr
	 *		  產品編號
	 * 
	 	 * @param item_desc
	 *		  產品名稱
	 * 
	 	 * @param itemname
	 *		  產品名稱
	 * 
	 	 * @param unit
	 *		  發票料品單位
	 * 
	 	 * @param qty
	 *		  發票料品數量
	 * 
	 	 * @param price
	 *		  單價
	 * 
	 	 * @param amt
	 *		  發票金額
	 * 
	 	 * @param nbrdate
	 *		  日期
	 * 
	 	 * @param io_p
	 *		  +,入,-出
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
    	public Iivcbat( String nbr, Integer seq, String ioseq, String item_nbr, String item_desc, String itemname, String unit, Double qty, Double price, Double amt, Date nbrdate, String io_p, String tranok, String tranop, Integer trancnt ) {
		super();
				this.nbr = nbr;
				this.seq = seq;
				this.ioseq = ioseq;
				this.item_nbr = item_nbr;
				this.item_desc = item_desc;
				this.itemname = itemname;
				this.unit = unit;
				this.qty = qty;
				this.price = price;
				this.amt = amt;
				this.nbrdate = nbrdate;
				this.io_p = io_p;
				this.tranok = tranok;
				this.tranop = tranop;
				this.trancnt = trancnt;
			}

		public Iivcbat(String uid) {
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
	 *			產品名稱
	 */
	public String getItem_desc() {
		return item_desc;
	}

	/**
	 * @param item_desc
	 *			產品名稱
	 */
	public void setItem_desc(String Item_desc) {
		this.item_desc = Item_desc;
	}
		/**
	 * @return itemname
	 *			產品名稱
	 */
	public String getItemname() {
		return itemname;
	}

	/**
	 * @param itemname
	 *			產品名稱
	 */
	public void setItemname(String Itemname) {
		this.itemname = Itemname;
	}
		/**
	 * @return unit
	 *			發票料品單位
	 */
	public String getUnit() {
		return unit;
	}

	/**
	 * @param unit
	 *			發票料品單位
	 */
	public void setUnit(String Unit) {
		this.unit = Unit;
	}
		/**
	 * @return qty
	 *			發票料品數量
	 */
	public Double getQty() {
		return qty;
	}

	/**
	 * @param qty
	 *			發票料品數量
	 */
	public void setQty(Double Qty) {
		this.qty = Qty;
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
	 *			發票金額
	 */
	public Double getAmt() {
		return amt;
	}

	/**
	 * @param amt
	 *			發票金額
	 */
	public void setAmt(Double Amt) {
		this.amt = Amt;
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

package org.esy.inv.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Index;
import javax.persistence.Table;
import org.esy.base.annotation.EntityInfo;
import org.esy.base.annotation.FieldInfo;
import org.esy.base.core.BaseProperties;
import org.esy.base.annotation.FilterInfo;



/**
 *  实体类
 * 
 * @author <a href="mailto:ardui@163.com"ardui</a
 *  @date Mon Aug 03 09:09:21 CST 2020
 */
@Entity
@Table(name = "trn_bat" ,indexes = { @Index(name = "created", columnList = "created"), 
@Index(name = "updated", columnList = "updated")})
@EntityInfo("庫存調撥明細檔")
public class Trnbat extends BaseProperties {

	private static final long serialVersionUID = 1L;

	@FieldInfo("憑單號碼")
	@FilterInfo(ListValue = "")
	@Column(name = "nbr", length =32  )
	private String nbr ;

	@FieldInfo("連結序")
	@FilterInfo(ListValue = "")
	@Column(name = "ioseq", length =32  )
	private String ioseq ;

	@FieldInfo("序號")
	@FilterInfo(ListValue = "")
	@Column(name = "seq")
	private Integer seq;

	@FieldInfo("產品編號")
	@FilterInfo(ListValue = "")
	@Column(name = "item_nbr", length =32  )
	private String item_nbr ;

	@FieldInfo("製程代號")
	@FilterInfo(ListValue = "")
	@Column(name = "pro_nbr", length =32  )
	private String pro_nbr ;

	@FieldInfo("產品規格")
	@FilterInfo(ListValue = "")
	@Column(name = "item_desc", length =32  )
	private String item_desc ;

	@FieldInfo("調出倉庫")
	@FilterInfo(ListValue = "")
	@Column(name = "ware_nbro", length =32  )
	private String ware_nbro ;

	@FieldInfo("調入倉庫")
	@FilterInfo(ListValue = "")
	@Column(name = "ware_nbri", length =32  )
	private String ware_nbri ;

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
	public Trnbat() {
		super();
	}
	
	/**
	 *
	 * 构造函数
	 *
	 	 * @param nbr
	 *		  憑單號碼
	 * 
	 	 * @param ioseq
	 *		  連結序
	 * 
	 	 * @param seq
	 *		  序號
	 * 
	 	 * @param item_nbr
	 *		  產品編號
	 * 
	 	 * @param pro_nbr
	 *		  製程代號
	 * 
	 	 * @param item_desc
	 *		  產品規格
	 * 
	 	 * @param ware_nbro
	 *		  調出倉庫
	 * 
	 	 * @param ware_nbri
	 *		  調入倉庫
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
    	public Trnbat( String nbr, String ioseq, Integer seq, String item_nbr, String pro_nbr, String item_desc, String ware_nbro, String ware_nbri, String unit, Double qty, String kcnbr1, String kcnbr2, Double jqty, String tranok, String tranop, Integer trancnt ) {
		super();
				this.nbr = nbr;
				this.ioseq = ioseq;
				this.seq = seq;
				this.item_nbr = item_nbr;
				this.pro_nbr = pro_nbr;
				this.item_desc = item_desc;
				this.ware_nbro = ware_nbro;
				this.ware_nbri = ware_nbri;
				this.unit = unit;
				this.qty = qty;
				this.kcnbr1 = kcnbr1;
				this.kcnbr2 = kcnbr2;
				this.jqty = jqty;
				this.tranok = tranok;
				this.tranop = tranop;
				this.trancnt = trancnt;
			}

		public Trnbat(String uid) {
		// TODO Auto-generated constructor stub
	}

		/**
	 * @return nbr
	 *			憑單號碼
	 */
	public String getNbr() {
		return nbr;
	}

	/**
	 * @param nbr
	 *			憑單號碼
	 */
	public void setNbr(String Nbr) {
		this.nbr = Nbr;
	}
		/**
	 * @return ioseq
	 *			連結序
	 */
	public String getIoseq() {
		return ioseq;
	}

	/**
	 * @param ioseq
	 *			連結序
	 */
	public void setIoseq(String Ioseq) {
		this.ioseq = Ioseq;
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
	 * @return ware_nbro
	 *			調出倉庫
	 */
	public String getWare_nbro() {
		return ware_nbro;
	}

	/**
	 * @param ware_nbro
	 *			調出倉庫
	 */
	public void setWare_nbro(String Ware_nbro) {
		this.ware_nbro = Ware_nbro;
	}
		/**
	 * @return ware_nbri
	 *			調入倉庫
	 */
	public String getWare_nbri() {
		return ware_nbri;
	}

	/**
	 * @param ware_nbri
	 *			調入倉庫
	 */
	public void setWare_nbri(String Ware_nbri) {
		this.ware_nbri = Ware_nbri;
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

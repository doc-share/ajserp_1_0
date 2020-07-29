package org.esy.acr.entity;

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
 *  @date Wed Jul 29 16:10:01 CST 2020
 */
@Entity
@Table(name = "acr_bal" ,indexes = { @Index(name = "created", columnList = "created"), 
@Index(name = "updated", columnList = "updated")})
@EntityInfo("應收餘額檔")
public class Acrbal extends BaseProperties {

	private static final long serialVersionUID = 1L;

	@FieldInfo("客戶代號")
	@FilterInfo(ListValue = "")
	@Column(name = "cus_nbr", length =32  )
	private String cus_nbr ;

	@FieldInfo("結帳月份")
	@FilterInfo(ListValue = "")
	@Column(name = "acr_mon", length =32  )
	private String acr_mon ;

	@FieldInfo("前期餘額")
	@FilterInfo(ListValue = "")
	@Column(name = "bal_amt")
	private Double bal_amt;

	@FieldInfo("本月出貨金額")
	@FilterInfo(ListValue = "")
	@Column(name = "shp_amt")
	private Double shp_amt;

	@FieldInfo("本月出貨稅額")
	@FilterInfo(ListValue = "")
	@Column(name = "tax_amt")
	private Double tax_amt;

	@FieldInfo("本月退貨金額")
	@FilterInfo(ListValue = "")
	@Column(name = "rshp_amt")
	private Double rshp_amt;

	@FieldInfo("本月退貨稅額")
	@FilterInfo(ListValue = "")
	@Column(name = "rtax_amt")
	private Double rtax_amt;

	@FieldInfo("現金金額")
	@FilterInfo(ListValue = "")
	@Column(name = "cah_amt")
	private Double cah_amt;

	@FieldInfo("票據金額")
	@FilterInfo(ListValue = "")
	@Column(name = "nms_amt")
	private Double nms_amt;

	@FieldInfo("折讓金額")
	@FilterInfo(ListValue = "")
	@Column(name = "cut_amt")
	private Double cut_amt;

	@FieldInfo("超收金額(抵扣)")
	@FilterInfo(ListValue = "")
	@Column(name = "pre_amt")
	private Double pre_amt;

	@FieldInfo("沖款金額")
	@FilterInfo(ListValue = "")
	@Column(name = "rec_amt")
	private Double rec_amt;

	@FieldInfo("計算異動標示")
	@FilterInfo(ListValue = "")
	@Column(name = "iop", length =32  )
	private String iop ;

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
	public Acrbal() {
		super();
	}
	
	/**
	 *
	 * 构造函数
	 *
	 	 * @param cus_nbr
	 *		  客戶代號
	 * 
	 	 * @param acr_mon
	 *		  結帳月份
	 * 
	 	 * @param bal_amt
	 *		  前期餘額
	 * 
	 	 * @param shp_amt
	 *		  本月出貨金額
	 * 
	 	 * @param tax_amt
	 *		  本月出貨稅額
	 * 
	 	 * @param rshp_amt
	 *		  本月退貨金額
	 * 
	 	 * @param rtax_amt
	 *		  本月退貨稅額
	 * 
	 	 * @param cah_amt
	 *		  現金金額
	 * 
	 	 * @param nms_amt
	 *		  票據金額
	 * 
	 	 * @param cut_amt
	 *		  折讓金額
	 * 
	 	 * @param pre_amt
	 *		  超收金額(抵扣)
	 * 
	 	 * @param rec_amt
	 *		  沖款金額
	 * 
	 	 * @param iop
	 *		  計算異動標示
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
    	public Acrbal( String cus_nbr, String acr_mon, Double bal_amt, Double shp_amt, Double tax_amt, Double rshp_amt, Double rtax_amt, Double cah_amt, Double nms_amt, Double cut_amt, Double pre_amt, Double rec_amt, String iop, String tranok, String tranop, Integer trancnt ) {
		super();
				this.cus_nbr = cus_nbr;
				this.acr_mon = acr_mon;
				this.bal_amt = bal_amt;
				this.shp_amt = shp_amt;
				this.tax_amt = tax_amt;
				this.rshp_amt = rshp_amt;
				this.rtax_amt = rtax_amt;
				this.cah_amt = cah_amt;
				this.nms_amt = nms_amt;
				this.cut_amt = cut_amt;
				this.pre_amt = pre_amt;
				this.rec_amt = rec_amt;
				this.iop = iop;
				this.tranok = tranok;
				this.tranop = tranop;
				this.trancnt = trancnt;
			}

		/**
	 * @return cus_nbr
	 *			客戶代號
	 */
	public String getCus_nbr() {
		return cus_nbr;
	}

	/**
	 * @param cus_nbr
	 *			客戶代號
	 */
	public void setCus_nbr(String Cus_nbr) {
		this.cus_nbr = Cus_nbr;
	}
		/**
	 * @return acr_mon
	 *			結帳月份
	 */
	public String getAcr_mon() {
		return acr_mon;
	}

	/**
	 * @param acr_mon
	 *			結帳月份
	 */
	public void setAcr_mon(String Acr_mon) {
		this.acr_mon = Acr_mon;
	}
		/**
	 * @return bal_amt
	 *			前期餘額
	 */
	public Double getBal_amt() {
		return bal_amt;
	}

	/**
	 * @param bal_amt
	 *			前期餘額
	 */
	public void setBal_amt(Double Bal_amt) {
		this.bal_amt = Bal_amt;
	}
		/**
	 * @return shp_amt
	 *			本月出貨金額
	 */
	public Double getShp_amt() {
		return shp_amt;
	}

	/**
	 * @param shp_amt
	 *			本月出貨金額
	 */
	public void setShp_amt(Double Shp_amt) {
		this.shp_amt = Shp_amt;
	}
		/**
	 * @return tax_amt
	 *			本月出貨稅額
	 */
	public Double getTax_amt() {
		return tax_amt;
	}

	/**
	 * @param tax_amt
	 *			本月出貨稅額
	 */
	public void setTax_amt(Double Tax_amt) {
		this.tax_amt = Tax_amt;
	}
		/**
	 * @return rshp_amt
	 *			本月退貨金額
	 */
	public Double getRshp_amt() {
		return rshp_amt;
	}

	/**
	 * @param rshp_amt
	 *			本月退貨金額
	 */
	public void setRshp_amt(Double Rshp_amt) {
		this.rshp_amt = Rshp_amt;
	}
		/**
	 * @return rtax_amt
	 *			本月退貨稅額
	 */
	public Double getRtax_amt() {
		return rtax_amt;
	}

	/**
	 * @param rtax_amt
	 *			本月退貨稅額
	 */
	public void setRtax_amt(Double Rtax_amt) {
		this.rtax_amt = Rtax_amt;
	}
		/**
	 * @return cah_amt
	 *			現金金額
	 */
	public Double getCah_amt() {
		return cah_amt;
	}

	/**
	 * @param cah_amt
	 *			現金金額
	 */
	public void setCah_amt(Double Cah_amt) {
		this.cah_amt = Cah_amt;
	}
		/**
	 * @return nms_amt
	 *			票據金額
	 */
	public Double getNms_amt() {
		return nms_amt;
	}

	/**
	 * @param nms_amt
	 *			票據金額
	 */
	public void setNms_amt(Double Nms_amt) {
		this.nms_amt = Nms_amt;
	}
		/**
	 * @return cut_amt
	 *			折讓金額
	 */
	public Double getCut_amt() {
		return cut_amt;
	}

	/**
	 * @param cut_amt
	 *			折讓金額
	 */
	public void setCut_amt(Double Cut_amt) {
		this.cut_amt = Cut_amt;
	}
		/**
	 * @return pre_amt
	 *			超收金額(抵扣)
	 */
	public Double getPre_amt() {
		return pre_amt;
	}

	/**
	 * @param pre_amt
	 *			超收金額(抵扣)
	 */
	public void setPre_amt(Double Pre_amt) {
		this.pre_amt = Pre_amt;
	}
		/**
	 * @return rec_amt
	 *			沖款金額
	 */
	public Double getRec_amt() {
		return rec_amt;
	}

	/**
	 * @param rec_amt
	 *			沖款金額
	 */
	public void setRec_amt(Double Rec_amt) {
		this.rec_amt = Rec_amt;
	}
		/**
	 * @return iop
	 *			計算異動標示
	 */
	public String getIop() {
		return iop;
	}

	/**
	 * @param iop
	 *			計算異動標示
	 */
	public void setIop(String Iop) {
		this.iop = Iop;
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

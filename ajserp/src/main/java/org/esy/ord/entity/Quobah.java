package org.esy.ord.entity;

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
 *  @date Mon Jul 27 15:16:17 CST 2020
 */
@Entity
@Table(name = "quo_bah" ,indexes = { @Index(name = "created", columnList = "created"), 
@Index(name = "updated", columnList = "updated")})
@EntityInfo("報價單表頭檔")
public class Quobah extends BaseProperties {

	private static final long serialVersionUID = 1L;

	@FieldInfo("單據號碼")
	@FilterInfo(ListValue = "")
	@Column(name = "nbr", length =32  )
	private String nbr ;

	@FieldInfo("離線單據號碼")
	@FilterInfo(ListValue = "")
	@Column(name = "onbr", length =32  )
	private String onbr ;

	@FieldInfo("日期")
	@FilterInfo(ListValue = "")
	@Column(name = "nbrdate")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date nbrdate;

	@FieldInfo("客戶代號")
	@FilterInfo(ListValue = "")
	@Column(name = "cus_nbr", length =32  )
	private String cus_nbr ;

	@FieldInfo("稅別")
	@FilterInfo(ListValue = "")
	@Column(name = "tax_type", length =32  )
	private String tax_type ;

	@FieldInfo("幣別總金額")
	@FilterInfo(ListValue = "")
	@Column(name = "ctot_amt")
	private Double ctot_amt;

	@FieldInfo("幣別稅額")
	@FilterInfo(ListValue = "")
	@Column(name = "ctax_amt")
	private Integer ctax_amt;

	@FieldInfo("稅額")
	@FilterInfo(ListValue = "")
	@Column(name = "tax_amt")
	private Integer tax_amt;

	@FieldInfo("總金額")
	@FilterInfo(ListValue = "")
	@Column(name = "tot_amt")
	private Double tot_amt;

	@FieldInfo("總成本")
	@FilterInfo(ListValue = "")
	@Column(name = "cost_amt")
	private Double cost_amt;

	@FieldInfo("幣別")
	@FilterInfo(ListValue = "")
	@Column(name = "coin_nbr", length =32  )
	private String coin_nbr ;

	@FieldInfo("匯率")
	@FilterInfo(ListValue = "")
	@Column(name = "coin_per")
	private Double coin_per;

	@FieldInfo("預計交貨日")
	@FilterInfo(ListValue = "")
	@Column(name = "plan_date")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date plan_date;

	@FieldInfo("業務員")
	@FilterInfo(ListValue = "")
	@Column(name = "sale_nbr", length =32  )
	private String sale_nbr ;

	@FieldInfo("有效日期")
	@FilterInfo(ListValue = "")
	@Column(name = "over_date")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date over_date;

	@FieldInfo("交易方式")
	@FilterInfo(ListValue = "")
	@Column(name = "pay_term", length =32  )
	private String pay_term ;

	@FieldInfo("備註")
	@FilterInfo(ListValue = "")
	@Column(name = "remark", columnDefinition = "TEXT")
	private String remark;

	@FieldInfo("備註")
	@FilterInfo(ListValue = "")
	@Column(name = "remark1", columnDefinition = "TEXT")
	private String remark1;

	@FieldInfo("狀態")
	@FilterInfo(ListValue = "")
	@Column(name = "status", length =32  )
	private String status ;

	@FieldInfo("產品描述")
	@FilterInfo(ListValue = "")
	@Column(name = "item_desc", length =32  )
	private String item_desc ;

	@FieldInfo("Y已轉訂單")
	@FilterInfo(ListValue = "")
	@Column(name = "ord_ctl", length =32  )
	private String ord_ctl ;

	@FieldInfo("最后異動者代號")
	@FilterInfo(ListValue = "")
	@Column(name = "last_user", length =32  )
	private String last_user ;

	@FieldInfo("Y已轉訂單")
	@FilterInfo(ListValue = "")
	@Column(name = "dear", length =128  )
	private String dear ;

	@FieldInfo("Y已轉訂單")
	@FilterInfo(ListValue = "")
	@Column(name = "sayremark", length =32  )
	private String sayremark ;

	@FieldInfo("Y已轉訂單")
	@FilterInfo(ListValue = "")
	@Column(name = "payment", length =128  )
	private String payment ;

	@FieldInfo("Y已轉訂單")
	@FilterInfo(ListValue = "")
	@Column(name = "shipment", length =128  )
	private String shipment ;

	@FieldInfo("Y已轉訂單")
	@FilterInfo(ListValue = "")
	@Column(name = "insurance", length =128  )
	private String insurance ;

	@FieldInfo("")
	@FilterInfo(ListValue = "")
	@Column(name = "packing", length =128  )
	private String packing ;

	@FieldInfo("Y已轉訂單")
	@FilterInfo(ListValue = "")
	@Column(name = "validity", length =128  )
	private String validity ;

	@FieldInfo("Y已轉訂單")
	@FilterInfo(ListValue = "")
	@Column(name = "fob", length =128  )
	private String fob ;

	@FieldInfo("Y已轉訂單")
	@FilterInfo(ListValue = "")
	@Column(name = "memo", length =32  )
	private String memo ;

	@FieldInfo("連絡人1")
	@FilterInfo(ListValue = "")
	@Column(name = "attname1", length =128  )
	private String attname1 ;

	@FieldInfo("建檔日期")
	@FilterInfo(ListValue = "")
	@Column(name = "crt_date")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date crt_date;

	@FieldInfo("建檔人員")
	@FilterInfo(ListValue = "")
	@Column(name = "crt_user", length =32  )
	private String crt_user ;

	@FieldInfo("最近修改日期")
	@FilterInfo(ListValue = "")
	@Column(name = "edit_date")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date edit_date;

	@FieldInfo("最近修改人員")
	@FilterInfo(ListValue = "")
	@Column(name = "edit_user", length =32  )
	private String edit_user ;

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
	public Quobah() {
		super();
	}
	
	/**
	 *
	 * 构造函数
	 *
	 	 * @param nbr
	 *		  單據號碼
	 * 
	 	 * @param onbr
	 *		  離線單據號碼
	 * 
	 	 * @param nbrdate
	 *		  日期
	 * 
	 	 * @param cus_nbr
	 *		  客戶代號
	 * 
	 	 * @param tax_type
	 *		  稅別
	 * 
	 	 * @param ctot_amt
	 *		  幣別總金額
	 * 
	 	 * @param ctax_amt
	 *		  幣別稅額
	 * 
	 	 * @param tax_amt
	 *		  稅額
	 * 
	 	 * @param tot_amt
	 *		  總金額
	 * 
	 	 * @param cost_amt
	 *		  總成本
	 * 
	 	 * @param coin_nbr
	 *		  幣別
	 * 
	 	 * @param coin_per
	 *		  匯率
	 * 
	 	 * @param plan_date
	 *		  預計交貨日
	 * 
	 	 * @param sale_nbr
	 *		  業務員
	 * 
	 	 * @param over_date
	 *		  有效日期
	 * 
	 	 * @param pay_term
	 *		  交易方式
	 * 
	 	 * @param remark
	 *		  備註
	 * 
	 	 * @param remark1
	 *		  備註
	 * 
	 	 * @param status
	 *		  狀態
	 * 
	 	 * @param item_desc
	 *		  產品描述
	 * 
	 	 * @param ord_ctl
	 *		  Y已轉訂單
	 * 
	 	 * @param last_user
	 *		  最后異動者代號
	 * 
	 	 * @param dear
	 *		  Y已轉訂單
	 * 
	 	 * @param sayremark
	 *		  Y已轉訂單
	 * 
	 	 * @param payment
	 *		  Y已轉訂單
	 * 
	 	 * @param shipment
	 *		  Y已轉訂單
	 * 
	 	 * @param insurance
	 *		  Y已轉訂單
	 * 
	 	 * @param packing
	 *		  
	 * 
	 	 * @param validity
	 *		  Y已轉訂單
	 * 
	 	 * @param fob
	 *		  Y已轉訂單
	 * 
	 	 * @param memo
	 *		  Y已轉訂單
	 * 
	 	 * @param attname1
	 *		  連絡人1
	 * 
	 	 * @param crt_date
	 *		  建檔日期
	 * 
	 	 * @param crt_user
	 *		  建檔人員
	 * 
	 	 * @param edit_date
	 *		  最近修改日期
	 * 
	 	 * @param edit_user
	 *		  最近修改人員
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
    	public Quobah( String nbr, String onbr, Date nbrdate, String cus_nbr, String tax_type, Double ctot_amt, Integer ctax_amt, Integer tax_amt, Double tot_amt, Double cost_amt, String coin_nbr, Double coin_per, Date plan_date, String sale_nbr, Date over_date, String pay_term, String remark, String remark1, String status, String item_desc, String ord_ctl, String last_user, String dear, String sayremark, String payment, String shipment, String insurance, String packing, String validity, String fob, String memo, String attname1, Date crt_date, String crt_user, Date edit_date, String edit_user, String tranok, String tranop, Integer trancnt ) {
		super();
				this.nbr = nbr;
				this.onbr = onbr;
				this.nbrdate = nbrdate;
				this.cus_nbr = cus_nbr;
				this.tax_type = tax_type;
				this.ctot_amt = ctot_amt;
				this.ctax_amt = ctax_amt;
				this.tax_amt = tax_amt;
				this.tot_amt = tot_amt;
				this.cost_amt = cost_amt;
				this.coin_nbr = coin_nbr;
				this.coin_per = coin_per;
				this.plan_date = plan_date;
				this.sale_nbr = sale_nbr;
				this.over_date = over_date;
				this.pay_term = pay_term;
				this.remark = remark;
				this.remark1 = remark1;
				this.status = status;
				this.item_desc = item_desc;
				this.ord_ctl = ord_ctl;
				this.last_user = last_user;
				this.dear = dear;
				this.sayremark = sayremark;
				this.payment = payment;
				this.shipment = shipment;
				this.insurance = insurance;
				this.packing = packing;
				this.validity = validity;
				this.fob = fob;
				this.memo = memo;
				this.attname1 = attname1;
				this.crt_date = crt_date;
				this.crt_user = crt_user;
				this.edit_date = edit_date;
				this.edit_user = edit_user;
				this.tranok = tranok;
				this.tranop = tranop;
				this.trancnt = trancnt;
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
	 * @return onbr
	 *			離線單據號碼
	 */
	public String getOnbr() {
		return onbr;
	}

	/**
	 * @param onbr
	 *			離線單據號碼
	 */
	public void setOnbr(String Onbr) {
		this.onbr = Onbr;
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
	 * @return tax_type
	 *			稅別
	 */
	public String getTax_type() {
		return tax_type;
	}

	/**
	 * @param tax_type
	 *			稅別
	 */
	public void setTax_type(String Tax_type) {
		this.tax_type = Tax_type;
	}
		/**
	 * @return ctot_amt
	 *			幣別總金額
	 */
	public Double getCtot_amt() {
		return ctot_amt;
	}

	/**
	 * @param ctot_amt
	 *			幣別總金額
	 */
	public void setCtot_amt(Double Ctot_amt) {
		this.ctot_amt = Ctot_amt;
	}
		/**
	 * @return ctax_amt
	 *			幣別稅額
	 */
	public Integer getCtax_amt() {
		return ctax_amt;
	}

	/**
	 * @param ctax_amt
	 *			幣別稅額
	 */
	public void setCtax_amt(Integer Ctax_amt) {
		this.ctax_amt = Ctax_amt;
	}
		/**
	 * @return tax_amt
	 *			稅額
	 */
	public Integer getTax_amt() {
		return tax_amt;
	}

	/**
	 * @param tax_amt
	 *			稅額
	 */
	public void setTax_amt(Integer Tax_amt) {
		this.tax_amt = Tax_amt;
	}
		/**
	 * @return tot_amt
	 *			總金額
	 */
	public Double getTot_amt() {
		return tot_amt;
	}

	/**
	 * @param tot_amt
	 *			總金額
	 */
	public void setTot_amt(Double Tot_amt) {
		this.tot_amt = Tot_amt;
	}
		/**
	 * @return cost_amt
	 *			總成本
	 */
	public Double getCost_amt() {
		return cost_amt;
	}

	/**
	 * @param cost_amt
	 *			總成本
	 */
	public void setCost_amt(Double Cost_amt) {
		this.cost_amt = Cost_amt;
	}
		/**
	 * @return coin_nbr
	 *			幣別
	 */
	public String getCoin_nbr() {
		return coin_nbr;
	}

	/**
	 * @param coin_nbr
	 *			幣別
	 */
	public void setCoin_nbr(String Coin_nbr) {
		this.coin_nbr = Coin_nbr;
	}
		/**
	 * @return coin_per
	 *			匯率
	 */
	public Double getCoin_per() {
		return coin_per;
	}

	/**
	 * @param coin_per
	 *			匯率
	 */
	public void setCoin_per(Double Coin_per) {
		this.coin_per = Coin_per;
	}
		/**
	 * @return plan_date
	 *			預計交貨日
	 */
	public Date getPlan_date() {
		return plan_date;
	}

	/**
	 * @param plan_date
	 *			預計交貨日
	 */
	public void setPlan_date(Date Plan_date) {
		this.plan_date = Plan_date;
	}
		/**
	 * @return sale_nbr
	 *			業務員
	 */
	public String getSale_nbr() {
		return sale_nbr;
	}

	/**
	 * @param sale_nbr
	 *			業務員
	 */
	public void setSale_nbr(String Sale_nbr) {
		this.sale_nbr = Sale_nbr;
	}
		/**
	 * @return over_date
	 *			有效日期
	 */
	public Date getOver_date() {
		return over_date;
	}

	/**
	 * @param over_date
	 *			有效日期
	 */
	public void setOver_date(Date Over_date) {
		this.over_date = Over_date;
	}
		/**
	 * @return pay_term
	 *			交易方式
	 */
	public String getPay_term() {
		return pay_term;
	}

	/**
	 * @param pay_term
	 *			交易方式
	 */
	public void setPay_term(String Pay_term) {
		this.pay_term = Pay_term;
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
	 * @return remark1
	 *			備註
	 */
	public String getRemark1() {
		return remark1;
	}

	/**
	 * @param remark1
	 *			備註
	 */
	public void setRemark1(String Remark1) {
		this.remark1 = Remark1;
	}
		/**
	 * @return status
	 *			狀態
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @param status
	 *			狀態
	 */
	public void setStatus(String Status) {
		this.status = Status;
	}
		/**
	 * @return item_desc
	 *			產品描述
	 */
	public String getItem_desc() {
		return item_desc;
	}

	/**
	 * @param item_desc
	 *			產品描述
	 */
	public void setItem_desc(String Item_desc) {
		this.item_desc = Item_desc;
	}
		/**
	 * @return ord_ctl
	 *			Y已轉訂單
	 */
	public String getOrd_ctl() {
		return ord_ctl;
	}

	/**
	 * @param ord_ctl
	 *			Y已轉訂單
	 */
	public void setOrd_ctl(String Ord_ctl) {
		this.ord_ctl = Ord_ctl;
	}
		/**
	 * @return last_user
	 *			最后異動者代號
	 */
	public String getLast_user() {
		return last_user;
	}

	/**
	 * @param last_user
	 *			最后異動者代號
	 */
	public void setLast_user(String Last_user) {
		this.last_user = Last_user;
	}
		/**
	 * @return dear
	 *			Y已轉訂單
	 */
	public String getDear() {
		return dear;
	}

	/**
	 * @param dear
	 *			Y已轉訂單
	 */
	public void setDear(String Dear) {
		this.dear = Dear;
	}
		/**
	 * @return sayremark
	 *			Y已轉訂單
	 */
	public String getSayremark() {
		return sayremark;
	}

	/**
	 * @param sayremark
	 *			Y已轉訂單
	 */
	public void setSayremark(String Sayremark) {
		this.sayremark = Sayremark;
	}
		/**
	 * @return payment
	 *			Y已轉訂單
	 */
	public String getPayment() {
		return payment;
	}

	/**
	 * @param payment
	 *			Y已轉訂單
	 */
	public void setPayment(String Payment) {
		this.payment = Payment;
	}
		/**
	 * @return shipment
	 *			Y已轉訂單
	 */
	public String getShipment() {
		return shipment;
	}

	/**
	 * @param shipment
	 *			Y已轉訂單
	 */
	public void setShipment(String Shipment) {
		this.shipment = Shipment;
	}
		/**
	 * @return insurance
	 *			Y已轉訂單
	 */
	public String getInsurance() {
		return insurance;
	}

	/**
	 * @param insurance
	 *			Y已轉訂單
	 */
	public void setInsurance(String Insurance) {
		this.insurance = Insurance;
	}
		/**
	 * @return packing
	 *			
	 */
	public String getPacking() {
		return packing;
	}

	/**
	 * @param packing
	 *			
	 */
	public void setPacking(String Packing) {
		this.packing = Packing;
	}
		/**
	 * @return validity
	 *			Y已轉訂單
	 */
	public String getValidity() {
		return validity;
	}

	/**
	 * @param validity
	 *			Y已轉訂單
	 */
	public void setValidity(String Validity) {
		this.validity = Validity;
	}
		/**
	 * @return fob
	 *			Y已轉訂單
	 */
	public String getFob() {
		return fob;
	}

	/**
	 * @param fob
	 *			Y已轉訂單
	 */
	public void setFob(String Fob) {
		this.fob = Fob;
	}
		/**
	 * @return memo
	 *			Y已轉訂單
	 */
	public String getMemo() {
		return memo;
	}

	/**
	 * @param memo
	 *			Y已轉訂單
	 */
	public void setMemo(String Memo) {
		this.memo = Memo;
	}
		/**
	 * @return attname1
	 *			連絡人1
	 */
	public String getAttname1() {
		return attname1;
	}

	/**
	 * @param attname1
	 *			連絡人1
	 */
	public void setAttname1(String Attname1) {
		this.attname1 = Attname1;
	}
		/**
	 * @return crt_date
	 *			建檔日期
	 */
	public Date getCrt_date() {
		return crt_date;
	}

	/**
	 * @param crt_date
	 *			建檔日期
	 */
	public void setCrt_date(Date Crt_date) {
		this.crt_date = Crt_date;
	}
		/**
	 * @return crt_user
	 *			建檔人員
	 */
	public String getCrt_user() {
		return crt_user;
	}

	/**
	 * @param crt_user
	 *			建檔人員
	 */
	public void setCrt_user(String Crt_user) {
		this.crt_user = Crt_user;
	}
		/**
	 * @return edit_date
	 *			最近修改日期
	 */
	public Date getEdit_date() {
		return edit_date;
	}

	/**
	 * @param edit_date
	 *			最近修改日期
	 */
	public void setEdit_date(Date Edit_date) {
		this.edit_date = Edit_date;
	}
		/**
	 * @return edit_user
	 *			最近修改人員
	 */
	public String getEdit_user() {
		return edit_user;
	}

	/**
	 * @param edit_user
	 *			最近修改人員
	 */
	public void setEdit_user(String Edit_user) {
		this.edit_user = Edit_user;
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

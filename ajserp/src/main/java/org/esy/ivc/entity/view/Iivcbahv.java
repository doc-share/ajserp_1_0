package org.esy.ivc.entity.view;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.esy.base.annotation.EntityInfo;
import org.esy.base.annotation.FieldInfo;
import org.esy.base.core.BaseProperties;
import org.esy.ivc.entity.Iivcbat;
import org.hibernate.annotations.Subselect;
import org.hibernate.annotations.Synchronize;
import org.esy.base.annotation.FilterInfo;


@Entity
@EntityInfo("進項發票表頭檔")
@Table(name = "Iivcbahv")
@Subselect("select a.* from iivc_bah a")
@Synchronize("iivc_bah")

public class Iivcbahv extends BaseProperties {

	private static final long serialVersionUID = 1L;

	@FieldInfo("出/退別")
	@FilterInfo(ListValue = "")
	@Column(name = "io_p", length =32  )
	private String io_p ;

	@FieldInfo("開票公司別")
	@FilterInfo(ListValue = "")
	@Column(name = "io_p1", length =32  )
	private String io_p1 ;

	@FieldInfo("結帳月份")
	@FilterInfo(ListValue = "")
	@Column(name = "acr_mon", length =32  )
	private String acr_mon ;

	@FieldInfo("發票號碼")
	@FilterInfo(ListValue = "")
	@Column(name = "nbr", length =32  )
	private String nbr ;

	@FieldInfo("會計傳票")
	@FilterInfo(ListValue = "")
	@Column(name = "acc_nbr", length =32  )
	private String acc_nbr ;

	@FieldInfo("發票日期")
	@FilterInfo(ListValue = "")
	@Column(name = "nbrdate")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date nbrdate;

	@FieldInfo("廠商代號")
	@FilterInfo(ListValue = "")
	@Column(name = "ven_nbr", length =32  )
	private String ven_nbr ;

	@FieldInfo("發票號碼")
	@FilterInfo(ListValue = "")
	@Column(name = "ivc_nbr", length =32  )
	private String ivc_nbr ;

	@FieldInfo("備註")
	@FilterInfo(ListValue = "")
	@Column(name = "remark", length =128  )
	private String remark ;

	@FieldInfo("稅別")
	@FilterInfo(ListValue = "")
	@Column(name = "tax_type", length =32  )
	private String tax_type ;

	@FieldInfo("稅額")
	@FilterInfo(ListValue = "")
	@Column(name = "tax_amt")
	private Integer tax_amt;

	@FieldInfo("總金額")
	@FilterInfo(ListValue = "")
	@Column(name = "tot_amt")
	private Double tot_amt;

	@FieldInfo("發票開立人")
	@FilterInfo(ListValue = "")
	@Column(name = "ivc_pur", length =32  )
	private String ivc_pur ;

	@FieldInfo("抬頭名稱")
	@FilterInfo(ListValue = "")
	@Column(name = "ivc_rek", length =128  )
	private String ivc_rek ;

	@FieldInfo("狀態")
	@FilterInfo(ListValue = "")
	@Column(name = "status", length =32  )
	private String status ;

	@FieldInfo("已沖帳金額")
	@FilterInfo(ListValue = "")
	@Column(name = "rec_amt")
	private Double rec_amt;

	@FieldInfo("交易方式")
	@FilterInfo(ListValue = "")
	@Column(name = "pay_term", length =32  )
	private String pay_term ;

	@FieldInfo("最后異動者代號")
	@FilterInfo(ListValue = "")
	@Column(name = "last_user", length =32  )
	private String last_user ;

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


	@Transient
	@JsonProperty("iivcbats") //宿主(要引用明細檔)(iivcbats要跟grid key值一樣)
	private List<Iivcbat> iivcbats = new ArrayList<Iivcbat>();
  
	public List<Iivcbat> getIivcbats() {
		return iivcbats;
	}

	public void setIivcbats(List<Iivcbat> iivcbats) {
		this.iivcbats = iivcbats;
	}

	/**
	 *
	 * 构造函数
	 *
	 */
	public Iivcbahv() {
		super();
	}
	
	/**
	 *
	 * 构造函数
	 *
	 	 * @param io_p
	 *		  出/退別
	 * 
	 	 * @param io_p1
	 *		  開票公司別
	 * 
	 	 * @param acr_mon
	 *		  結帳月份
	 * 
	 	 * @param nbr
	 *		  發票號碼
	 * 
	 	 * @param acc_nbr
	 *		  會計傳票
	 * 
	 	 * @param nbrdate
	 *		  發票日期
	 * 
	 	 * @param ven_nbr
	 *		  廠商代號
	 * 
	 	 * @param ivc_nbr
	 *		  發票號碼
	 * 
	 	 * @param remark
	 *		  備註
	 * 
	 	 * @param tax_type
	 *		  稅別
	 * 
	 	 * @param tax_amt
	 *		  稅額
	 * 
	 	 * @param tot_amt
	 *		  總金額
	 * 
	 	 * @param ivc_pur
	 *		  發票開立人
	 * 
	 	 * @param ivc_rek
	 *		  抬頭名稱
	 * 
	 	 * @param status
	 *		  狀態
	 * 
	 	 * @param rec_amt
	 *		  已沖帳金額
	 * 
	 	 * @param pay_term
	 *		  交易方式
	 * 
	 	 * @param last_user
	 *		  最后異動者代號
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
    	public Iivcbahv( String io_p, String io_p1, String acr_mon, String nbr, String acc_nbr, Date nbrdate, String ven_nbr, String ivc_nbr, String remark, String tax_type, Integer tax_amt, Double tot_amt, String ivc_pur, String ivc_rek, String status, Double rec_amt, String pay_term, String last_user, Date crt_date, String crt_user, Date edit_date, String edit_user, String tranok, String tranop, Integer trancnt ) {
		super();
				this.io_p = io_p;
				this.io_p1 = io_p1;
				this.acr_mon = acr_mon;
				this.nbr = nbr;
				this.acc_nbr = acc_nbr;
				this.nbrdate = nbrdate;
				this.ven_nbr = ven_nbr;
				this.ivc_nbr = ivc_nbr;
				this.remark = remark;
				this.tax_type = tax_type;
				this.tax_amt = tax_amt;
				this.tot_amt = tot_amt;
				this.ivc_pur = ivc_pur;
				this.ivc_rek = ivc_rek;
				this.status = status;
				this.rec_amt = rec_amt;
				this.pay_term = pay_term;
				this.last_user = last_user;
				this.crt_date = crt_date;
				this.crt_user = crt_user;
				this.edit_date = edit_date;
				this.edit_user = edit_user;
				this.tranok = tranok;
				this.tranop = tranop;
				this.trancnt = trancnt;
			}

		/**
	 * @return io_p
	 *			出/退別
	 */
	public String getIo_p() {
		return io_p;
	}

	/**
	 * @param io_p
	 *			出/退別
	 */
	public void setIo_p(String Io_p) {
		this.io_p = Io_p;
	}
		/**
	 * @return io_p1
	 *			開票公司別
	 */
	public String getIo_p1() {
		return io_p1;
	}

	/**
	 * @param io_p1
	 *			開票公司別
	 */
	public void setIo_p1(String Io_p1) {
		this.io_p1 = Io_p1;
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
	 * @return nbr
	 *			發票號碼
	 */
	public String getNbr() {
		return nbr;
	}

	/**
	 * @param nbr
	 *			發票號碼
	 */
	public void setNbr(String Nbr) {
		this.nbr = Nbr;
	}
		/**
	 * @return acc_nbr
	 *			會計傳票
	 */
	public String getAcc_nbr() {
		return acc_nbr;
	}

	/**
	 * @param acc_nbr
	 *			會計傳票
	 */
	public void setAcc_nbr(String Acc_nbr) {
		this.acc_nbr = Acc_nbr;
	}
		/**
	 * @return nbrdate
	 *			發票日期
	 */
	public Date getNbrdate() {
		return nbrdate;
	}

	/**
	 * @param nbrdate
	 *			發票日期
	 */
	public void setNbrdate(Date Nbrdate) {
		this.nbrdate = Nbrdate;
	}
		/**
	 * @return ven_nbr
	 *			廠商代號
	 */
	public String getVen_nbr() {
		return ven_nbr;
	}

	/**
	 * @param ven_nbr
	 *			廠商代號
	 */
	public void setVen_nbr(String Ven_nbr) {
		this.ven_nbr = Ven_nbr;
	}
		/**
	 * @return ivc_nbr
	 *			發票號碼
	 */
	public String getIvc_nbr() {
		return ivc_nbr;
	}

	/**
	 * @param ivc_nbr
	 *			發票號碼
	 */
	public void setIvc_nbr(String Ivc_nbr) {
		this.ivc_nbr = Ivc_nbr;
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
	 * @return ivc_pur
	 *			發票開立人
	 */
	public String getIvc_pur() {
		return ivc_pur;
	}

	/**
	 * @param ivc_pur
	 *			發票開立人
	 */
	public void setIvc_pur(String Ivc_pur) {
		this.ivc_pur = Ivc_pur;
	}
		/**
	 * @return ivc_rek
	 *			抬頭名稱
	 */
	public String getIvc_rek() {
		return ivc_rek;
	}

	/**
	 * @param ivc_rek
	 *			抬頭名稱
	 */
	public void setIvc_rek(String Ivc_rek) {
		this.ivc_rek = Ivc_rek;
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
	 * @return rec_amt
	 *			已沖帳金額
	 */
	public Double getRec_amt() {
		return rec_amt;
	}

	/**
	 * @param rec_amt
	 *			已沖帳金額
	 */
	public void setRec_amt(Double Rec_amt) {
		this.rec_amt = Rec_amt;
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

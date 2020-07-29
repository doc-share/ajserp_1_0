package org.esy.pur.entity;

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
 *  @date Wed Jul 29 11:40:25 CST 2020
 */
@Entity
@Table(name = "rec_bah" ,indexes = { @Index(name = "created", columnList = "created"), 
@Index(name = "updated", columnList = "updated")})
@EntityInfo("收料表頭檔")
public class Recbah extends BaseProperties {

	private static final long serialVersionUID = 1L;

	@FieldInfo("會計傳票")
	@FilterInfo(ListValue = "")
	@Column(name = "acc_nbr", length =32  )
	private String acc_nbr ;

	@FieldInfo("單據號碼")
	@FilterInfo(ListValue = "")
	@Column(name = "nbr", length =32  )
	private String nbr ;

	@FieldInfo("進/退別")
	@FilterInfo(ListValue = "")
	@Column(name = "io_p", length =32  )
	private String io_p ;

	@FieldInfo("結帳月份")
	@FilterInfo(ListValue = "")
	@Column(name = "acr_mon", length =32  )
	private String acr_mon ;

	@FieldInfo("交易方式")
	@FilterInfo(ListValue = "")
	@Column(name = "pay_term", length =32  )
	private String pay_term ;

	@FieldInfo("日期")
	@FilterInfo(ListValue = "")
	@Column(name = "nbrdate")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date nbrdate;

	@FieldInfo("供應商代號")
	@FilterInfo(ListValue = "")
	@Column(name = "ven_nbr", length =32  )
	private String ven_nbr ;

	@FieldInfo("倉庫代號")
	@FilterInfo(ListValue = "")
	@Column(name = "ware_nbr", length =32  )
	private String ware_nbr ;

	@FieldInfo("發票號碼")
	@FilterInfo(ListValue = "")
	@Column(name = "ivc_nbr", length =32  )
	private String ivc_nbr ;

	@FieldInfo("總金額")
	@FilterInfo(ListValue = "")
	@Column(name = "tot_amt")
	private Double tot_amt;

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

	@FieldInfo("幣別")
	@FilterInfo(ListValue = "")
	@Column(name = "coin_nbr", length =32  )
	private String coin_nbr ;

	@FieldInfo("匯率")
	@FilterInfo(ListValue = "")
	@Column(name = "coin_per")
	private Double coin_per;

	@FieldInfo("稅額")
	@FilterInfo(ListValue = "")
	@Column(name = "tax_amt")
	private Integer tax_amt;

	@FieldInfo("備註")
	@FilterInfo(ListValue = "")
	@Column(name = "remark", length =128  )
	private String remark ;

	@FieldInfo("已沖帳金額")
	@FilterInfo(ListValue = "")
	@Column(name = "rec_amt")
	private Double rec_amt;

	@FieldInfo("狀態")
	@FilterInfo(ListValue = "")
	@Column(name = "status", length =32  )
	private String status ;

	@FieldInfo("最后異動者代號")
	@FilterInfo(ListValue = "")
	@Column(name = "last_user", length =32  )
	private String last_user ;

	@FieldInfo(" T驗收回 復")
	@FilterInfo(ListValue = "")
	@Column(name = "sure")
	private Integer sure;

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

	@FieldInfo("連絡人1")
	@FilterInfo(ListValue = "")
	@Column(name = "attname1", length =32  )
	private String attname1 ;


     /**
	 *
	 * 构造函数
	 *
	 */
	public Recbah() {
		super();
	}
	
	/**
	 *
	 * 构造函数
	 *
	 	 * @param acc_nbr
	 *		  會計傳票
	 * 
	 	 * @param nbr
	 *		  單據號碼
	 * 
	 	 * @param io_p
	 *		  進/退別
	 * 
	 	 * @param acr_mon
	 *		  結帳月份
	 * 
	 	 * @param pay_term
	 *		  交易方式
	 * 
	 	 * @param nbrdate
	 *		  日期
	 * 
	 	 * @param ven_nbr
	 *		  供應商代號
	 * 
	 	 * @param ware_nbr
	 *		  倉庫代號
	 * 
	 	 * @param ivc_nbr
	 *		  發票號碼
	 * 
	 	 * @param tot_amt
	 *		  總金額
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
	 	 * @param coin_nbr
	 *		  幣別
	 * 
	 	 * @param coin_per
	 *		  匯率
	 * 
	 	 * @param tax_amt
	 *		  稅額
	 * 
	 	 * @param remark
	 *		  備註
	 * 
	 	 * @param rec_amt
	 *		  已沖帳金額
	 * 
	 	 * @param status
	 *		  狀態
	 * 
	 	 * @param last_user
	 *		  最后異動者代號
	 * 
	 	 * @param sure
	 *		   T驗收回 復
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
	 	 * @param attname1
	 *		  連絡人1
	 * 
	 	 */
    	public Recbah( String acc_nbr, String nbr, String io_p, String acr_mon, String pay_term, Date nbrdate, String ven_nbr, String ware_nbr, String ivc_nbr, Double tot_amt, String tax_type, Double ctot_amt, Integer ctax_amt, String coin_nbr, Double coin_per, Integer tax_amt, String remark, Double rec_amt, String status, String last_user, Integer sure, Date crt_date, String crt_user, Date edit_date, String edit_user, String tranok, String tranop, Integer trancnt, String attname1 ) {
		super();
				this.acc_nbr = acc_nbr;
				this.nbr = nbr;
				this.io_p = io_p;
				this.acr_mon = acr_mon;
				this.pay_term = pay_term;
				this.nbrdate = nbrdate;
				this.ven_nbr = ven_nbr;
				this.ware_nbr = ware_nbr;
				this.ivc_nbr = ivc_nbr;
				this.tot_amt = tot_amt;
				this.tax_type = tax_type;
				this.ctot_amt = ctot_amt;
				this.ctax_amt = ctax_amt;
				this.coin_nbr = coin_nbr;
				this.coin_per = coin_per;
				this.tax_amt = tax_amt;
				this.remark = remark;
				this.rec_amt = rec_amt;
				this.status = status;
				this.last_user = last_user;
				this.sure = sure;
				this.crt_date = crt_date;
				this.crt_user = crt_user;
				this.edit_date = edit_date;
				this.edit_user = edit_user;
				this.tranok = tranok;
				this.tranop = tranop;
				this.trancnt = trancnt;
				this.attname1 = attname1;
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
	 * @return io_p
	 *			進/退別
	 */
	public String getIo_p() {
		return io_p;
	}

	/**
	 * @param io_p
	 *			進/退別
	 */
	public void setIo_p(String Io_p) {
		this.io_p = Io_p;
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
	 * @return ven_nbr
	 *			供應商代號
	 */
	public String getVen_nbr() {
		return ven_nbr;
	}

	/**
	 * @param ven_nbr
	 *			供應商代號
	 */
	public void setVen_nbr(String Ven_nbr) {
		this.ven_nbr = Ven_nbr;
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
	 * @return sure
	 *			 T驗收回 復
	 */
	public Integer getSure() {
		return sure;
	}

	/**
	 * @param sure
	 *			 T驗收回 復
	 */
	public void setSure(Integer Sure) {
		this.sure = Sure;
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
	
}

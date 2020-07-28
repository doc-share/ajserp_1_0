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
 *  @date Tue Jul 28 17:09:52 CST 2020
 */
@Entity
@Table(name = "pur_bah" ,indexes = { @Index(name = "created", columnList = "created"), 
@Index(name = "updated", columnList = "updated")})
@EntityInfo("採購表頭檔")
public class Purbah extends BaseProperties {

	private static final long serialVersionUID = 1L;

	@FieldInfo("訂單單據號碼")
	@FilterInfo(ListValue = "")
	@Column(name = "ord_nbr", length =32  )
	private String ord_nbr ;

	@FieldInfo("單據號碼")
	@FilterInfo(ListValue = "")
	@Column(name = "nbr", length =32  )
	private String nbr ;

	@FieldInfo("客戶訂單據號碼")
	@FilterInfo(ListValue = "")
	@Column(name = "cus_ord", length =32  )
	private String cus_ord ;

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

	@FieldInfo("業務員")
	@FilterInfo(ListValue = "")
	@Column(name = "sale_nbr", length =32  )
	private String sale_nbr ;

	@FieldInfo("指送廠商")
	@FilterInfo(ListValue = "")
	@Column(name = "ven_nbr1", length =32  )
	private String ven_nbr1 ;

	@FieldInfo("交易方式")
	@FilterInfo(ListValue = "")
	@Column(name = "pay_term", length =32  )
	private String pay_term ;

	@FieldInfo("總金額")
	@FilterInfo(ListValue = "")
	@Column(name = "tot_amt")
	private Double tot_amt;

	@FieldInfo("幣別總金額")
	@FilterInfo(ListValue = "")
	@Column(name = "ctot_amt")
	private Double ctot_amt;

	@FieldInfo("幣別")
	@FilterInfo(ListValue = "")
	@Column(name = "coin_nbr", length =32  )
	private String coin_nbr ;

	@FieldInfo("匯率")
	@FilterInfo(ListValue = "")
	@Column(name = "coin_per")
	private Double coin_per;

	@FieldInfo("預定到貨日")
	@FilterInfo(ListValue = "")
	@Column(name = "plan_date")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date plan_date;

	@FieldInfo("備註")
	@FilterInfo(ListValue = "")
	@Column(name = "remark", length =128  )
	private String remark ;

	@FieldInfo("狀態")
	@FilterInfo(ListValue = "")
	@Column(name = "status", length =32  )
	private String status ;

	@FieldInfo("嘜頭LOG圖形")
	@FilterInfo(ListValue = "")
	@Column(name = "logtype", length =32  )
	private String logtype ;

	@FieldInfo("嘜頭LOG文字")
	@FilterInfo(ListValue = "")
	@Column(name = "logtxt", length =128  )
	private String logtxt ;

	@FieldInfo("正嘜頭")
	@FilterInfo(ListValue = "")
	@Column(name = "fmiltle", length =32  )
	private String fmiltle ;

	@FieldInfo("側嘜頭")
	@FilterInfo(ListValue = "")
	@Column(name = "dmiltle", length =32  )
	private String dmiltle ;

	@FieldInfo("採購描述")
	@FilterInfo(ListValue = "")
	@Column(name = "itemdesc", columnDefinition = "TEXT")
	private String itemdesc;

	@FieldInfo("")
	@FilterInfo(ListValue = "")
	@Column(name = "rec_date")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date rec_date;

	@FieldInfo("最后異動者代號")
	@FilterInfo(ListValue = "")
	@Column(name = "last_user", length =32  )
	private String last_user ;

	@FieldInfo("使用者代碼")
	@FilterInfo(ListValue = "")
	@Column(name = "user_code", length =32  )
	private String user_code ;

	@FieldInfo(" T核准回 復")
	@FilterInfo(ListValue = "")
	@Column(name = "sure")
	private Integer sure;

	@FieldInfo(" 是否轉單")
	@FilterInfo(ListValue = "")
	@Column(name = "isord", length =32  )
	private String isord ;

	@FieldInfo("麥頭圖檔")
	@FilterInfo(ListValue = "")
	@Column(name = "mttd", length =32  )
	private String mttd ;

	@FieldInfo("是否已列印")
	@FilterInfo(ListValue = "")
	@Column(name = "is_prn")
	private Integer is_prn;

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
	public Purbah() {
		super();
	}
	
	/**
	 *
	 * 构造函数
	 *
	 	 * @param ord_nbr
	 *		  訂單單據號碼
	 * 
	 	 * @param nbr
	 *		  單據號碼
	 * 
	 	 * @param cus_ord
	 *		  客戶訂單據號碼
	 * 
	 	 * @param nbrdate
	 *		  日期
	 * 
	 	 * @param ven_nbr
	 *		  供應商代號
	 * 
	 	 * @param sale_nbr
	 *		  業務員
	 * 
	 	 * @param ven_nbr1
	 *		  指送廠商
	 * 
	 	 * @param pay_term
	 *		  交易方式
	 * 
	 	 * @param tot_amt
	 *		  總金額
	 * 
	 	 * @param ctot_amt
	 *		  幣別總金額
	 * 
	 	 * @param coin_nbr
	 *		  幣別
	 * 
	 	 * @param coin_per
	 *		  匯率
	 * 
	 	 * @param plan_date
	 *		  預定到貨日
	 * 
	 	 * @param remark
	 *		  備註
	 * 
	 	 * @param status
	 *		  狀態
	 * 
	 	 * @param logtype
	 *		  嘜頭LOG圖形
	 * 
	 	 * @param logtxt
	 *		  嘜頭LOG文字
	 * 
	 	 * @param fmiltle
	 *		  正嘜頭
	 * 
	 	 * @param dmiltle
	 *		  側嘜頭
	 * 
	 	 * @param itemdesc
	 *		  採購描述
	 * 
	 	 * @param rec_date
	 *		  
	 * 
	 	 * @param last_user
	 *		  最后異動者代號
	 * 
	 	 * @param user_code
	 *		  使用者代碼
	 * 
	 	 * @param sure
	 *		   T核准回 復
	 * 
	 	 * @param isord
	 *		   是否轉單
	 * 
	 	 * @param mttd
	 *		  麥頭圖檔
	 * 
	 	 * @param is_prn
	 *		  是否已列印
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
    	public Purbah( String ord_nbr, String nbr, String cus_ord, Date nbrdate, String ven_nbr, String sale_nbr, String ven_nbr1, String pay_term, Double tot_amt, Double ctot_amt, String coin_nbr, Double coin_per, Date plan_date, String remark, String status, String logtype, String logtxt, String fmiltle, String dmiltle, String itemdesc, Date rec_date, String last_user, String user_code, Integer sure, String isord, String mttd, Integer is_prn, Date crt_date, String crt_user, Date edit_date, String edit_user, String tranok, String tranop, Integer trancnt ) {
		super();
				this.ord_nbr = ord_nbr;
				this.nbr = nbr;
				this.cus_ord = cus_ord;
				this.nbrdate = nbrdate;
				this.ven_nbr = ven_nbr;
				this.sale_nbr = sale_nbr;
				this.ven_nbr1 = ven_nbr1;
				this.pay_term = pay_term;
				this.tot_amt = tot_amt;
				this.ctot_amt = ctot_amt;
				this.coin_nbr = coin_nbr;
				this.coin_per = coin_per;
				this.plan_date = plan_date;
				this.remark = remark;
				this.status = status;
				this.logtype = logtype;
				this.logtxt = logtxt;
				this.fmiltle = fmiltle;
				this.dmiltle = dmiltle;
				this.itemdesc = itemdesc;
				this.rec_date = rec_date;
				this.last_user = last_user;
				this.user_code = user_code;
				this.sure = sure;
				this.isord = isord;
				this.mttd = mttd;
				this.is_prn = is_prn;
				this.crt_date = crt_date;
				this.crt_user = crt_user;
				this.edit_date = edit_date;
				this.edit_user = edit_user;
				this.tranok = tranok;
				this.tranop = tranop;
				this.trancnt = trancnt;
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
	 * @return cus_ord
	 *			客戶訂單據號碼
	 */
	public String getCus_ord() {
		return cus_ord;
	}

	/**
	 * @param cus_ord
	 *			客戶訂單據號碼
	 */
	public void setCus_ord(String Cus_ord) {
		this.cus_ord = Cus_ord;
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
	 * @return ven_nbr1
	 *			指送廠商
	 */
	public String getVen_nbr1() {
		return ven_nbr1;
	}

	/**
	 * @param ven_nbr1
	 *			指送廠商
	 */
	public void setVen_nbr1(String Ven_nbr1) {
		this.ven_nbr1 = Ven_nbr1;
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
	 *			預定到貨日
	 */
	public Date getPlan_date() {
		return plan_date;
	}

	/**
	 * @param plan_date
	 *			預定到貨日
	 */
	public void setPlan_date(Date Plan_date) {
		this.plan_date = Plan_date;
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
	 * @return logtype
	 *			嘜頭LOG圖形
	 */
	public String getLogtype() {
		return logtype;
	}

	/**
	 * @param logtype
	 *			嘜頭LOG圖形
	 */
	public void setLogtype(String Logtype) {
		this.logtype = Logtype;
	}
		/**
	 * @return logtxt
	 *			嘜頭LOG文字
	 */
	public String getLogtxt() {
		return logtxt;
	}

	/**
	 * @param logtxt
	 *			嘜頭LOG文字
	 */
	public void setLogtxt(String Logtxt) {
		this.logtxt = Logtxt;
	}
		/**
	 * @return fmiltle
	 *			正嘜頭
	 */
	public String getFmiltle() {
		return fmiltle;
	}

	/**
	 * @param fmiltle
	 *			正嘜頭
	 */
	public void setFmiltle(String Fmiltle) {
		this.fmiltle = Fmiltle;
	}
		/**
	 * @return dmiltle
	 *			側嘜頭
	 */
	public String getDmiltle() {
		return dmiltle;
	}

	/**
	 * @param dmiltle
	 *			側嘜頭
	 */
	public void setDmiltle(String Dmiltle) {
		this.dmiltle = Dmiltle;
	}
		/**
	 * @return itemdesc
	 *			採購描述
	 */
	public String getItemdesc() {
		return itemdesc;
	}

	/**
	 * @param itemdesc
	 *			採購描述
	 */
	public void setItemdesc(String Itemdesc) {
		this.itemdesc = Itemdesc;
	}
		/**
	 * @return rec_date
	 *			
	 */
	public Date getRec_date() {
		return rec_date;
	}

	/**
	 * @param rec_date
	 *			
	 */
	public void setRec_date(Date Rec_date) {
		this.rec_date = Rec_date;
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
	 * @return user_code
	 *			使用者代碼
	 */
	public String getUser_code() {
		return user_code;
	}

	/**
	 * @param user_code
	 *			使用者代碼
	 */
	public void setUser_code(String User_code) {
		this.user_code = User_code;
	}
		/**
	 * @return sure
	 *			 T核准回 復
	 */
	public Integer getSure() {
		return sure;
	}

	/**
	 * @param sure
	 *			 T核准回 復
	 */
	public void setSure(Integer Sure) {
		this.sure = Sure;
	}
		/**
	 * @return isord
	 *			 是否轉單
	 */
	public String getIsord() {
		return isord;
	}

	/**
	 * @param isord
	 *			 是否轉單
	 */
	public void setIsord(String Isord) {
		this.isord = Isord;
	}
		/**
	 * @return mttd
	 *			麥頭圖檔
	 */
	public String getMttd() {
		return mttd;
	}

	/**
	 * @param mttd
	 *			麥頭圖檔
	 */
	public void setMttd(String Mttd) {
		this.mttd = Mttd;
	}
		/**
	 * @return is_prn
	 *			是否已列印
	 */
	public Integer getIs_prn() {
		return is_prn;
	}

	/**
	 * @param is_prn
	 *			是否已列印
	 */
	public void setIs_prn(Integer Is_prn) {
		this.is_prn = Is_prn;
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

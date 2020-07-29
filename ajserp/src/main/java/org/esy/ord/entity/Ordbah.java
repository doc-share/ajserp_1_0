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
 *  @date Tue Jul 28 11:22:12 CST 2020
 */
@Entity
@Table(name = "ord_bah" ,indexes = { @Index(name = "created", columnList = "created"), 
@Index(name = "updated", columnList = "updated")})
@EntityInfo("訂單表頭檔")
public class Ordbah extends BaseProperties {

	private static final long serialVersionUID = 1L;

	@FieldInfo("報價單據號碼")
	@FilterInfo(ListValue = "")
	@Column(name = "quo_nbr", length =32  )
	private String quo_nbr ;

	@FieldInfo("單據號碼")
	@FilterInfo(ListValue = "")
	@Column(name = "nbr", length =32  )
	private String nbr ;

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

	@FieldInfo("客戶訂單據號碼")
	@FilterInfo(ListValue = "")
	@Column(name = "cus_ord", length =32  )
	private String cus_ord ;

	@FieldInfo("總金額")
	@FilterInfo(ListValue = "")
	@Column(name = "tot_amt")
	private Double tot_amt;

	@FieldInfo("總成本")
	@FilterInfo(ListValue = "")
	@Column(name = "cost_amt")
	private Double cost_amt;

	@FieldInfo("交易方式")
	@FilterInfo(ListValue = "")
	@Column(name = "pay_term", length =32  )
	private String pay_term ;

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

	@FieldInfo("預計出貨日")
	@FilterInfo(ListValue = "")
	@Column(name = "plan_date")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date plan_date;

	@FieldInfo("業務員代號")
	@FilterInfo(ListValue = "")
	@Column(name = "sale_nbr", length =32  )
	private String sale_nbr ;

	@FieldInfo("狀態")
	@FilterInfo(ListValue = "")
	@Column(name = "status", length =32  )
	private String status ;

	@FieldInfo("備註")
	@FilterInfo(ListValue = "")
	@Column(name = "remark", columnDefinition = "TEXT")
	private String remark;

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

	@FieldInfo("最后異動者代號")
	@FilterInfo(ListValue = "")
	@Column(name = "last_user", length =32  )
	private String last_user ;

	@FieldInfo("已轉命令單狀態")
	@FilterInfo(ListValue = "")
	@Column(name = "mstatus", length =32  )
	private String mstatus ;

	@FieldInfo("核准狀態")
	@FilterInfo(ListValue = "")
	@Column(name = "sure")
	private String sure;

	@FieldInfo("核準人")
	@FilterInfo(ListValue = "")
	@Column(name = "user_code", length =32  )
	private String user_code ;

	@FieldInfo("工程名稱")
	@FilterInfo(ListValue = "")
	@Column(name = "work_desc", length =32  )
	private String work_desc ;

//	@FieldInfo("")
//	@FilterInfo(ListValue = "")
//	@Column(name = "pi", length =128  )
//	private String pi ;
//
//	@FieldInfo("")
//	@FilterInfo(ListValue = "")
//	@Column(name = "attn", length =128  )
//	private String attn ;
//
//	@FieldInfo("")
//	@FilterInfo(ListValue = "")
//	@Column(name = "term", length =128  )
//	private String term ;
//
//	@FieldInfo("")
//	@FilterInfo(ListValue = "")
//	@Column(name = "packing", length =128  )
//	private String packing ;
//
//	@FieldInfo("")
//	@FilterInfo(ListValue = "")
//	@Column(name = "pay", length =128  )
//	private String pay ;
//
//	@FieldInfo("")
//	@FilterInfo(ListValue = "")
//	@Column(name = "delivery", length =128  )
//	private String delivery ;

	@FieldInfo("折數")
	@FilterInfo(ListValue = "")
	@Column(name = "cut")
	private Double cut;

	@FieldInfo("備註")
	@FilterInfo(ListValue = "")
	@Column(name = "rmk", length =128  )
	private String rmk ;

	@FieldInfo("麥頭圖檔")
	@FilterInfo(ListValue = "")
	@Column(name = "mttd", length =32  )
	private String mttd ;

	@FieldInfo("  轉入的公司代號")
	@FilterInfo(ListValue = "")
	@Column(name = "sysno", length =32  )
	private String sysno ;

	@FieldInfo("採購單據號碼")
	@FilterInfo(ListValue = "")
	@Column(name = "pur_nbr", length =32  )
	private String pur_nbr ;

	@FieldInfo("連絡人1")
	@FilterInfo(ListValue = "")
	@Column(name = "attname1", length =32  )
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
	public Ordbah() {
		super();
	}
	
	/**
	 *
	 * 构造函数
	 *
	 	 * @param quo_nbr
	 *		  報價單據號碼
	 * 
	 	 * @param nbr
	 *		  單據號碼
	 * 
	 	 * @param nbrdate
	 *		  日期
	 * 
	 	 * @param cus_nbr
	 *		  客戶代號
	 * 
	 	 * @param cus_ord
	 *		  客戶訂單據號碼
	 * 
	 	 * @param tot_amt
	 *		  總金額
	 * 
	 	 * @param cost_amt
	 *		  總成本
	 * 
	 	 * @param pay_term
	 *		  交易方式
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
	 *		  預計出貨日
	 * 
	 	 * @param sale_nbr
	 *		  業務員代號
	 * 
	 	 * @param status
	 *		  狀態
	 * 
	 	 * @param remark
	 *		  備註
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
	 	 * @param last_user
	 *		  最后異動者代號
	 * 
	 	 * @param mstatus
	 *		  已轉命令單狀態
	 * 
	 	 * @param sure
	 *		  核准狀態
	 * 
	 	 * @param user_code
	 *		  核準人
	 * 
	 	 * @param work_desc
	 *		  工程名稱
	 * 
	 	 * @param pi
	 *		  
	 * 
	 	 * @param attn
	 *		  
	 * 
	 	 * @param term
	 *		  
	 * 
	 	 * @param packing
	 *		  
	 * 
	 	 * @param pay
	 *		  
	 * 
	 	 * @param delivery
	 *		  
	 * 
	 	 * @param cut
	 *		  折數
	 * 
	 	 * @param rmk
	 *		  備註
	 * 
	 	 * @param mttd
	 *		  麥頭圖檔
	 * 
	 	 * @param sysno
	 *		    轉入的公司代號
	 * 
	 	 * @param pur_nbr
	 *		  採購單據號碼
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
    	public Ordbah( String quo_nbr, String nbr, Date nbrdate, String cus_nbr, String cus_ord, Double tot_amt, Double cost_amt, String pay_term, Double ctot_amt, String coin_nbr, Double coin_per, Date plan_date, String sale_nbr, String status, String remark, String logtype, String logtxt, String fmiltle, String dmiltle, String last_user, String mstatus, String sure, String user_code, String work_desc, String pi, String attn, String term, String packing, String pay, String delivery, Double cut, String rmk, String mttd, String sysno, String pur_nbr, String attname1, Date crt_date, String crt_user, Date edit_date, String edit_user, String tranok, String tranop, Integer trancnt ) {
		super();
				this.quo_nbr = quo_nbr;
				this.nbr = nbr;
				this.nbrdate = nbrdate;
				this.cus_nbr = cus_nbr;
				this.cus_ord = cus_ord;
				this.tot_amt = tot_amt;
				this.cost_amt = cost_amt;
				this.pay_term = pay_term;
				this.ctot_amt = ctot_amt;
				this.coin_nbr = coin_nbr;
				this.coin_per = coin_per;
				this.plan_date = plan_date;
				this.sale_nbr = sale_nbr;
				this.status = status;
				this.remark = remark;
				this.logtype = logtype;
				this.logtxt = logtxt;
				this.fmiltle = fmiltle;
				this.dmiltle = dmiltle;
				this.last_user = last_user;
				this.mstatus = mstatus;
				this.sure = sure;
				this.user_code = user_code;
				this.work_desc = work_desc;
//				this.pi = pi;
//				this.attn = attn;
//				this.term = term;
//				this.packing = packing;
//				this.pay = pay;
//				this.delivery = delivery;
				this.cut = cut;
				this.rmk = rmk;
				this.mttd = mttd;
				this.sysno = sysno;
				this.pur_nbr = pur_nbr;
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
	 * @return quo_nbr
	 *			報價單據號碼
	 */
	public String getQuo_nbr() {
		return quo_nbr;
	}

	/**
	 * @param quo_nbr
	 *			報價單據號碼
	 */
	public void setQuo_nbr(String Quo_nbr) {
		this.quo_nbr = Quo_nbr;
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
	 *			預計出貨日
	 */
	public Date getPlan_date() {
		return plan_date;
	}

	/**
	 * @param plan_date
	 *			預計出貨日
	 */
	public void setPlan_date(Date Plan_date) {
		this.plan_date = Plan_date;
	}
		/**
	 * @return sale_nbr
	 *			業務員代號
	 */
	public String getSale_nbr() {
		return sale_nbr;
	}

	/**
	 * @param sale_nbr
	 *			業務員代號
	 */
	public void setSale_nbr(String Sale_nbr) {
		this.sale_nbr = Sale_nbr;
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
	 * @return mstatus
	 *			已轉命令單狀態
	 */
	public String getMstatus() {
		return mstatus;
	}

	/**
	 * @param mstatus
	 *			已轉命令單狀態
	 */
	public void setMstatus(String Mstatus) {
		this.mstatus = Mstatus;
	}
		/**
	 * @return sure
	 *			核准狀態
	 */
	public String getSure() {
		return sure;
	}

	/**
	 * @param sure
	 *			核准狀態
	 */
	public void setSure(String Sure) {
		this.sure = Sure;
	}
		/**
	 * @return user_code
	 *			核準人
	 */
	public String getUser_code() {
		return user_code;
	}

	/**
	 * @param user_code
	 *			核準人
	 */
	public void setUser_code(String User_code) {
		this.user_code = User_code;
	}
		/**
	 * @return work_desc
	 *			工程名稱
	 */
	public String getWork_desc() {
		return work_desc;
	}

	/**
	 * @param work_desc
	 *			工程名稱
	 */
	public void setWork_desc(String Work_desc) {
		this.work_desc = Work_desc;
	}
		/**
	 * @return pi
	 *			
	 */
//	public String getPi() {
//		return pi;
//	}
//
//	/**
//	 * @param pi
//	 *			
//	 */
//	public void setPi(String Pi) {
//		this.pi = Pi;
//	}
//		/**
//	 * @return attn
//	 *			
//	 */
//	public String getAttn() {
//		return attn;
//	}
//
//	/**
//	 * @param attn
//	 *			
//	 */
//	public void setAttn(String Attn) {
//		this.attn = Attn;
//	}
//		/**
//	 * @return term
//	 *			
//	 */
//	public String getTerm() {
//		return term;
//	}
//
//	/**
//	 * @param term
//	 *			
//	 */
//	public void setTerm(String Term) {
//		this.term = Term;
//	}
//		/**
//	 * @return packing
//	 *			
//	 */
//	public String getPacking() {
//		return packing;
//	}
//
//	/**
//	 * @param packing
//	 *			
//	 */
//	public void setPacking(String Packing) {
//		this.packing = Packing;
//	}
//		/**
//	 * @return pay
//	 *			
//	 */
//	public String getPay() {
//		return pay;
//	}
//
//	/**
//	 * @param pay
//	 *			
//	 */
//	public void setPay(String Pay) {
//		this.pay = Pay;
//	}
//		/**
//	 * @return delivery
//	 *			
//	 */
//	public String getDelivery() {
//		return delivery;
//	}
//
//	/**
//	 * @param delivery
//	 *			
//	 */
//	public void setDelivery(String Delivery) {
//		this.delivery = Delivery;
//	}
		/**
	 * @return cut
	 *			折數
	 */
	public Double getCut() {
		return cut;
	}

	/**
	 * @param cut
	 *			折數
	 */
	public void setCut(Double Cut) {
		this.cut = Cut;
	}
		/**
	 * @return rmk
	 *			備註
	 */
	public String getRmk() {
		return rmk;
	}

	/**
	 * @param rmk
	 *			備註
	 */
	public void setRmk(String Rmk) {
		this.rmk = Rmk;
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
	 * @return sysno
	 *			  轉入的公司代號
	 */
	public String getSysno() {
		return sysno;
	}

	/**
	 * @param sysno
	 *			  轉入的公司代號
	 */
	public void setSysno(String Sysno) {
		this.sysno = Sysno;
	}
		/**
	 * @return pur_nbr
	 *			採購單據號碼
	 */
	public String getPur_nbr() {
		return pur_nbr;
	}

	/**
	 * @param pur_nbr
	 *			採購單據號碼
	 */
	public void setPur_nbr(String Pur_nbr) {
		this.pur_nbr = Pur_nbr;
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

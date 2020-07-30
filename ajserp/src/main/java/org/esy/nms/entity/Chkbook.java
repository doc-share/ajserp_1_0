package org.esy.nms.entity;

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
 *  @date Thu Jul 30 13:40:35 CST 2020
 */
@Entity
@Table(name = "chkbook" ,indexes = { @Index(name = "created", columnList = "created"), 
@Index(name = "updated", columnList = "updated")})
@EntityInfo("票據資料明細檔")
public class Chkbook extends BaseProperties {

	private static final long serialVersionUID = 1L;

	@FieldInfo("登錄編號")
	@FilterInfo(ListValue = "")
	@Column(name = "nbr", length =32  )
	private String nbr ;

	@FieldInfo("會計傳票")
	@FilterInfo(ListValue = "")
	@Column(name = "acc_nbr", length =32  )
	private String acc_nbr ;

	@FieldInfo("兌現會計傳票")
	@FilterInfo(ListValue = "")
	@Column(name = "acc_nbr1", length =32  )
	private String acc_nbr1 ;

	@FieldInfo("收/支")
	@FilterInfo(ListValue = "")
	@Column(name = "io_p", length =32  )
	private String io_p ;

	@FieldInfo("收開日期")
	@FilterInfo(ListValue = "")
	@Column(name = "w_date")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date w_date;

	@FieldInfo("支票號碼")
	@FilterInfo(ListValue = "")
	@Column(name = "chk_no", length =32  )
	private String chk_no ;

	@FieldInfo("支票金額")
	@FilterInfo(ListValue = "")
	@Column(name = "amt")
	private Double amt;

	@FieldInfo("到期日期")
	@FilterInfo(ListValue = "")
	@Column(name = "chk_date")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date chk_date;

	@FieldInfo("往來客戶/廠商")
	@FilterInfo(ListValue = "")
	@Column(name = "io_dbf", length =32  )
	private String io_dbf ;

	@FieldInfo("往來客戶/廠商檔")
	@FilterInfo(ListValue = "")
	@Column(name = "io_nbr", length =32  )
	private String io_nbr ;

	@FieldInfo("往來客戶")
	@FilterInfo(ListValue = "")
	@Column(name = "cus_nbr", length =32  )
	private String cus_nbr ;

	@FieldInfo("往來廠商")
	@FilterInfo(ListValue = "")
	@Column(name = "ven_nbr", length =32  )
	private String ven_nbr ;

	@FieldInfo("銀行代號")
	@FilterInfo(ListValue = "")
	@Column(name = "b_nbr", length =32  )
	private String b_nbr ;

	@FieldInfo("付款行庫")
	@FilterInfo(ListValue = "")
	@Column(name = "pay_bank", length =32  )
	private String pay_bank ;

	@FieldInfo("發票人帳號")
	@FilterInfo(ListValue = "")
	@Column(name = "pay_code", length =32  )
	private String pay_code ;

	@FieldInfo("代收日期")
	@FilterInfo(ListValue = "")
	@Column(name = "bank_date")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date bank_date;

	@FieldInfo("備    註")
	@FilterInfo(ListValue = "")
	@Column(name = "remark", length =32  )
	private String remark ;

	@FieldInfo("狀    態")
	@FilterInfo(ListValue = "")
	@Column(name = "status", length =32  )
	private String status ;

	@FieldInfo("票據狀態字串")
	@FilterInfo(ListValue = "")
	@Column(name = "sstatus", length =32  )
	private String sstatus ;

	@FieldInfo("異動日期")
	@FilterInfo(ListValue = "")
	@Column(name = "nbrdate")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date nbrdate;

	@FieldInfo("利息金額")
	@FilterInfo(ListValue = "")
	@Column(name = "dis_amt")
	private Double dis_amt;

	@FieldInfo("異動前狀態")
	@FilterInfo(ListValue = "")
	@Column(name = "ostatus", length =32  )
	private String ostatus ;

	@FieldInfo("轉付前狀態字串")
	@FilterInfo(ListValue = "")
	@Column(name = "osstatus", length =32  )
	private String osstatus ;

	@FieldInfo("轉入現金登錄編號")
	@FilterInfo(ListValue = "")
	@Column(name = "cash_nbr", length =32  )
	private String cash_nbr ;

	@FieldInfo("帳款號碼檔")
	@FilterInfo(ListValue = "")
	@Column(name = "acr_dbf", length =32  )
	private String acr_dbf ;

	@FieldInfo("帳款號碼")
	@FilterInfo(ListValue = "")
	@Column(name = "acr_nbr", length =32  )
	private String acr_nbr ;

	@FieldInfo("轉付客戶/廠商")
	@FilterInfo(ListValue = "")
	@Column(name = "rio_dbf", length =32  )
	private String rio_dbf ;

	@FieldInfo("轉付客戶/廠商")
	@FilterInfo(ListValue = "")
	@Column(name = "rio_nbr", length =32  )
	private String rio_nbr ;

	@FieldInfo("轉付客戶")
	@FilterInfo(ListValue = "")
	@Column(name = "rcus_nbr", length =32  )
	private String rcus_nbr ;

	@FieldInfo("轉付廠商")
	@FilterInfo(ListValue = "")
	@Column(name = "rven_nbr", length =32  )
	private String rven_nbr ;

	@FieldInfo("Y.異動銀行帳")
	@FilterInfo(ListValue = "")
	@Column(name = "updbank", length =32  )
	private String updbank ;

	@FieldInfo("兌現 1.一般 2.轉付 3.退票")
	@FilterInfo(ListValue = "")
	@Column(name = "upstatus", length =32  )
	private String upstatus ;

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


     /**
	 *
	 * 构造函数
	 *
	 */
	public Chkbook() {
		super();
	}
	
	/**
	 *
	 * 构造函数
	 *
	 	 * @param nbr
	 *		  登錄編號
	 * 
	 	 * @param acc_nbr
	 *		  會計傳票
	 * 
	 	 * @param acc_nbr1
	 *		  兌現會計傳票
	 * 
	 	 * @param io_p
	 *		  收/支
	 * 
	 	 * @param w_date
	 *		  收開日期
	 * 
	 	 * @param chk_no
	 *		  支票號碼
	 * 
	 	 * @param amt
	 *		  支票金額
	 * 
	 	 * @param chk_date
	 *		  到期日期
	 * 
	 	 * @param io_dbf
	 *		  往來客戶/廠商
	 * 
	 	 * @param io_nbr
	 *		  往來客戶/廠商檔
	 * 
	 	 * @param cus_nbr
	 *		  往來客戶
	 * 
	 	 * @param ven_nbr
	 *		  往來廠商
	 * 
	 	 * @param b_nbr
	 *		  銀行代號
	 * 
	 	 * @param pay_bank
	 *		  付款行庫
	 * 
	 	 * @param pay_code
	 *		  發票人帳號
	 * 
	 	 * @param bank_date
	 *		  代收日期
	 * 
	 	 * @param remark
	 *		  備    註
	 * 
	 	 * @param status
	 *		  狀    態
	 * 
	 	 * @param sstatus
	 *		  票據狀態字串
	 * 
	 	 * @param nbrdate
	 *		  異動日期
	 * 
	 	 * @param dis_amt
	 *		  利息金額
	 * 
	 	 * @param ostatus
	 *		  異動前狀態
	 * 
	 	 * @param osstatus
	 *		  轉付前狀態字串
	 * 
	 	 * @param cash_nbr
	 *		  轉入現金登錄編號
	 * 
	 	 * @param acr_dbf
	 *		  帳款號碼檔
	 * 
	 	 * @param acr_nbr
	 *		  帳款號碼
	 * 
	 	 * @param rio_dbf
	 *		  轉付客戶/廠商
	 * 
	 	 * @param rio_nbr
	 *		  轉付客戶/廠商
	 * 
	 	 * @param rcus_nbr
	 *		  轉付客戶
	 * 
	 	 * @param rven_nbr
	 *		  轉付廠商
	 * 
	 	 * @param updbank
	 *		  Y.異動銀行帳
	 * 
	 	 * @param upstatus
	 *		  兌現 1.一般 2.轉付 3.退票
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
    	public Chkbook( String nbr, String acc_nbr, String acc_nbr1, String io_p, Date w_date, String chk_no, Double amt, Date chk_date, String io_dbf, String io_nbr, String cus_nbr, String ven_nbr, String b_nbr, String pay_bank, String pay_code, Date bank_date, String remark, String status, String sstatus, Date nbrdate, Double dis_amt, String ostatus, String osstatus, String cash_nbr, String acr_dbf, String acr_nbr, String rio_dbf, String rio_nbr, String rcus_nbr, String rven_nbr, String updbank, String upstatus, String last_user, Date crt_date, String crt_user, Date edit_date, String edit_user, String tranok, String tranop, Integer trancnt ) {
		super();
				this.nbr = nbr;
				this.acc_nbr = acc_nbr;
				this.acc_nbr1 = acc_nbr1;
				this.io_p = io_p;
				this.w_date = w_date;
				this.chk_no = chk_no;
				this.amt = amt;
				this.chk_date = chk_date;
				this.io_dbf = io_dbf;
				this.io_nbr = io_nbr;
				this.cus_nbr = cus_nbr;
				this.ven_nbr = ven_nbr;
				this.b_nbr = b_nbr;
				this.pay_bank = pay_bank;
				this.pay_code = pay_code;
				this.bank_date = bank_date;
				this.remark = remark;
				this.status = status;
				this.sstatus = sstatus;
				this.nbrdate = nbrdate;
				this.dis_amt = dis_amt;
				this.ostatus = ostatus;
				this.osstatus = osstatus;
				this.cash_nbr = cash_nbr;
				this.acr_dbf = acr_dbf;
				this.acr_nbr = acr_nbr;
				this.rio_dbf = rio_dbf;
				this.rio_nbr = rio_nbr;
				this.rcus_nbr = rcus_nbr;
				this.rven_nbr = rven_nbr;
				this.updbank = updbank;
				this.upstatus = upstatus;
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
	 * @return nbr
	 *			登錄編號
	 */
	public String getNbr() {
		return nbr;
	}

	/**
	 * @param nbr
	 *			登錄編號
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
	 * @return acc_nbr1
	 *			兌現會計傳票
	 */
	public String getAcc_nbr1() {
		return acc_nbr1;
	}

	/**
	 * @param acc_nbr1
	 *			兌現會計傳票
	 */
	public void setAcc_nbr1(String Acc_nbr1) {
		this.acc_nbr1 = Acc_nbr1;
	}
		/**
	 * @return io_p
	 *			收/支
	 */
	public String getIo_p() {
		return io_p;
	}

	/**
	 * @param io_p
	 *			收/支
	 */
	public void setIo_p(String Io_p) {
		this.io_p = Io_p;
	}
		/**
	 * @return w_date
	 *			收開日期
	 */
	public Date getW_date() {
		return w_date;
	}

	/**
	 * @param w_date
	 *			收開日期
	 */
	public void setW_date(Date W_date) {
		this.w_date = W_date;
	}
		/**
	 * @return chk_no
	 *			支票號碼
	 */
	public String getChk_no() {
		return chk_no;
	}

	/**
	 * @param chk_no
	 *			支票號碼
	 */
	public void setChk_no(String Chk_no) {
		this.chk_no = Chk_no;
	}
		/**
	 * @return amt
	 *			支票金額
	 */
	public Double getAmt() {
		return amt;
	}

	/**
	 * @param amt
	 *			支票金額
	 */
	public void setAmt(Double Amt) {
		this.amt = Amt;
	}
		/**
	 * @return chk_date
	 *			到期日期
	 */
	public Date getChk_date() {
		return chk_date;
	}

	/**
	 * @param chk_date
	 *			到期日期
	 */
	public void setChk_date(Date Chk_date) {
		this.chk_date = Chk_date;
	}
		/**
	 * @return io_dbf
	 *			往來客戶/廠商
	 */
	public String getIo_dbf() {
		return io_dbf;
	}

	/**
	 * @param io_dbf
	 *			往來客戶/廠商
	 */
	public void setIo_dbf(String Io_dbf) {
		this.io_dbf = Io_dbf;
	}
		/**
	 * @return io_nbr
	 *			往來客戶/廠商檔
	 */
	public String getIo_nbr() {
		return io_nbr;
	}

	/**
	 * @param io_nbr
	 *			往來客戶/廠商檔
	 */
	public void setIo_nbr(String Io_nbr) {
		this.io_nbr = Io_nbr;
	}
		/**
	 * @return cus_nbr
	 *			往來客戶
	 */
	public String getCus_nbr() {
		return cus_nbr;
	}

	/**
	 * @param cus_nbr
	 *			往來客戶
	 */
	public void setCus_nbr(String Cus_nbr) {
		this.cus_nbr = Cus_nbr;
	}
		/**
	 * @return ven_nbr
	 *			往來廠商
	 */
	public String getVen_nbr() {
		return ven_nbr;
	}

	/**
	 * @param ven_nbr
	 *			往來廠商
	 */
	public void setVen_nbr(String Ven_nbr) {
		this.ven_nbr = Ven_nbr;
	}
		/**
	 * @return b_nbr
	 *			銀行代號
	 */
	public String getB_nbr() {
		return b_nbr;
	}

	/**
	 * @param b_nbr
	 *			銀行代號
	 */
	public void setB_nbr(String B_nbr) {
		this.b_nbr = B_nbr;
	}
		/**
	 * @return pay_bank
	 *			付款行庫
	 */
	public String getPay_bank() {
		return pay_bank;
	}

	/**
	 * @param pay_bank
	 *			付款行庫
	 */
	public void setPay_bank(String Pay_bank) {
		this.pay_bank = Pay_bank;
	}
		/**
	 * @return pay_code
	 *			發票人帳號
	 */
	public String getPay_code() {
		return pay_code;
	}

	/**
	 * @param pay_code
	 *			發票人帳號
	 */
	public void setPay_code(String Pay_code) {
		this.pay_code = Pay_code;
	}
		/**
	 * @return bank_date
	 *			代收日期
	 */
	public Date getBank_date() {
		return bank_date;
	}

	/**
	 * @param bank_date
	 *			代收日期
	 */
	public void setBank_date(Date Bank_date) {
		this.bank_date = Bank_date;
	}
		/**
	 * @return remark
	 *			備    註
	 */
	public String getRemark() {
		return remark;
	}

	/**
	 * @param remark
	 *			備    註
	 */
	public void setRemark(String Remark) {
		this.remark = Remark;
	}
		/**
	 * @return status
	 *			狀    態
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @param status
	 *			狀    態
	 */
	public void setStatus(String Status) {
		this.status = Status;
	}
		/**
	 * @return sstatus
	 *			票據狀態字串
	 */
	public String getSstatus() {
		return sstatus;
	}

	/**
	 * @param sstatus
	 *			票據狀態字串
	 */
	public void setSstatus(String Sstatus) {
		this.sstatus = Sstatus;
	}
		/**
	 * @return nbrdate
	 *			異動日期
	 */
	public Date getNbrdate() {
		return nbrdate;
	}

	/**
	 * @param nbrdate
	 *			異動日期
	 */
	public void setNbrdate(Date Nbrdate) {
		this.nbrdate = Nbrdate;
	}
		/**
	 * @return dis_amt
	 *			利息金額
	 */
	public Double getDis_amt() {
		return dis_amt;
	}

	/**
	 * @param dis_amt
	 *			利息金額
	 */
	public void setDis_amt(Double Dis_amt) {
		this.dis_amt = Dis_amt;
	}
		/**
	 * @return ostatus
	 *			異動前狀態
	 */
	public String getOstatus() {
		return ostatus;
	}

	/**
	 * @param ostatus
	 *			異動前狀態
	 */
	public void setOstatus(String Ostatus) {
		this.ostatus = Ostatus;
	}
		/**
	 * @return osstatus
	 *			轉付前狀態字串
	 */
	public String getOsstatus() {
		return osstatus;
	}

	/**
	 * @param osstatus
	 *			轉付前狀態字串
	 */
	public void setOsstatus(String Osstatus) {
		this.osstatus = Osstatus;
	}
		/**
	 * @return cash_nbr
	 *			轉入現金登錄編號
	 */
	public String getCash_nbr() {
		return cash_nbr;
	}

	/**
	 * @param cash_nbr
	 *			轉入現金登錄編號
	 */
	public void setCash_nbr(String Cash_nbr) {
		this.cash_nbr = Cash_nbr;
	}
		/**
	 * @return acr_dbf
	 *			帳款號碼檔
	 */
	public String getAcr_dbf() {
		return acr_dbf;
	}

	/**
	 * @param acr_dbf
	 *			帳款號碼檔
	 */
	public void setAcr_dbf(String Acr_dbf) {
		this.acr_dbf = Acr_dbf;
	}
		/**
	 * @return acr_nbr
	 *			帳款號碼
	 */
	public String getAcr_nbr() {
		return acr_nbr;
	}

	/**
	 * @param acr_nbr
	 *			帳款號碼
	 */
	public void setAcr_nbr(String Acr_nbr) {
		this.acr_nbr = Acr_nbr;
	}
		/**
	 * @return rio_dbf
	 *			轉付客戶/廠商
	 */
	public String getRio_dbf() {
		return rio_dbf;
	}

	/**
	 * @param rio_dbf
	 *			轉付客戶/廠商
	 */
	public void setRio_dbf(String Rio_dbf) {
		this.rio_dbf = Rio_dbf;
	}
		/**
	 * @return rio_nbr
	 *			轉付客戶/廠商
	 */
	public String getRio_nbr() {
		return rio_nbr;
	}

	/**
	 * @param rio_nbr
	 *			轉付客戶/廠商
	 */
	public void setRio_nbr(String Rio_nbr) {
		this.rio_nbr = Rio_nbr;
	}
		/**
	 * @return rcus_nbr
	 *			轉付客戶
	 */
	public String getRcus_nbr() {
		return rcus_nbr;
	}

	/**
	 * @param rcus_nbr
	 *			轉付客戶
	 */
	public void setRcus_nbr(String Rcus_nbr) {
		this.rcus_nbr = Rcus_nbr;
	}
		/**
	 * @return rven_nbr
	 *			轉付廠商
	 */
	public String getRven_nbr() {
		return rven_nbr;
	}

	/**
	 * @param rven_nbr
	 *			轉付廠商
	 */
	public void setRven_nbr(String Rven_nbr) {
		this.rven_nbr = Rven_nbr;
	}
		/**
	 * @return updbank
	 *			Y.異動銀行帳
	 */
	public String getUpdbank() {
		return updbank;
	}

	/**
	 * @param updbank
	 *			Y.異動銀行帳
	 */
	public void setUpdbank(String Updbank) {
		this.updbank = Updbank;
	}
		/**
	 * @return upstatus
	 *			兌現 1.一般 2.轉付 3.退票
	 */
	public String getUpstatus() {
		return upstatus;
	}

	/**
	 * @param upstatus
	 *			兌現 1.一般 2.轉付 3.退票
	 */
	public void setUpstatus(String Upstatus) {
		this.upstatus = Upstatus;
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

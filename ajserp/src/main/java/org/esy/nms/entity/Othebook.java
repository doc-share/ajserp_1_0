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
 *  @date Thu Jul 30 11:26:41 CST 2020
 */
@Entity
@Table(name = "othebook" ,indexes = { @Index(name = "created", columnList = "created"), 
@Index(name = "updated", columnList = "updated")})
@EntityInfo("銀行其他資料明細檔")
public class Othebook extends BaseProperties {

	private static final long serialVersionUID = 1L;

	@FieldInfo("登錄編號")
	@FilterInfo(ListValue = "")
	@Column(name = "nbr", length =32  )
	private String nbr ;

	@FieldInfo("會計傳票")
	@FilterInfo(ListValue = "")
	@Column(name = "acc_nbr", length =32  )
	private String acc_nbr ;

	@FieldInfo("收/支")
	@FilterInfo(ListValue = "")
	@Column(name = "io_p", length =32  )
	private String io_p ;

	@FieldInfo("銀行代號")
	@FilterInfo(ListValue = "")
	@Column(name = "b_nbr", length =32  )
	private String b_nbr ;

	@FieldInfo("收支日期")
	@FilterInfo(ListValue = "")
	@Column(name = "nbrdate")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date nbrdate;

	@FieldInfo("金    額")
	@FilterInfo(ListValue = "")
	@Column(name = "amt")
	private Double amt;

	@FieldInfo("備    註")
	@FilterInfo(ListValue = "")
	@Column(name = "remark", length =128  )
	private String remark ;

	@FieldInfo("狀    態")
	@FilterInfo(ListValue = "")
	@Column(name = "status", length =32  )
	private String status ;

	@FieldInfo("帳款號碼檔")
	@FilterInfo(ListValue = "")
	@Column(name = "acr_dbf", length =32  )
	private String acr_dbf ;

	@FieldInfo("帳款號碼")
	@FilterInfo(ListValue = "")
	@Column(name = "acr_nbr", length =32  )
	private String acr_nbr ;

	@FieldInfo("轉存銀行代號")
	@FilterInfo(ListValue = "")
	@Column(name = "nb_nbr", length =32  )
	private String nb_nbr ;

	@FieldInfo("銀行狀態字串")
	@FilterInfo(ListValue = "")
	@Column(name = "sstatus", length =32  )
	private String sstatus ;

	@FieldInfo("往來客戶/廠商檔")
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

	@FieldInfo("會計科目")
	@FilterInfo(ListValue = "")
	@Column(name = "acc_id", length =32  )
	private String acc_id ;

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
	public Othebook() {
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
	 	 * @param io_p
	 *		  收/支
	 * 
	 	 * @param b_nbr
	 *		  銀行代號
	 * 
	 	 * @param nbrdate
	 *		  收支日期
	 * 
	 	 * @param amt
	 *		  金    額
	 * 
	 	 * @param remark
	 *		  備    註
	 * 
	 	 * @param status
	 *		  狀    態
	 * 
	 	 * @param acr_dbf
	 *		  帳款號碼檔
	 * 
	 	 * @param acr_nbr
	 *		  帳款號碼
	 * 
	 	 * @param nb_nbr
	 *		  轉存銀行代號
	 * 
	 	 * @param sstatus
	 *		  銀行狀態字串
	 * 
	 	 * @param io_dbf
	 *		  往來客戶/廠商檔
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
	 	 * @param acc_id
	 *		  會計科目
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
    	public Othebook( String nbr, String acc_nbr, String io_p, String b_nbr, Date nbrdate, Double amt, String remark, String status, String acr_dbf, String acr_nbr, String nb_nbr, String sstatus, String io_dbf, String io_nbr, String cus_nbr, String ven_nbr, String acc_id, String last_user, Date crt_date, String crt_user, Date edit_date, String edit_user, String tranok, String tranop, Integer trancnt ) {
		super();
				this.nbr = nbr;
				this.acc_nbr = acc_nbr;
				this.io_p = io_p;
				this.b_nbr = b_nbr;
				this.nbrdate = nbrdate;
				this.amt = amt;
				this.remark = remark;
				this.status = status;
				this.acr_dbf = acr_dbf;
				this.acr_nbr = acr_nbr;
				this.nb_nbr = nb_nbr;
				this.sstatus = sstatus;
				this.io_dbf = io_dbf;
				this.io_nbr = io_nbr;
				this.cus_nbr = cus_nbr;
				this.ven_nbr = ven_nbr;
				this.acc_id = acc_id;
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
	 * @return nbrdate
	 *			收支日期
	 */
	public Date getNbrdate() {
		return nbrdate;
	}

	/**
	 * @param nbrdate
	 *			收支日期
	 */
	public void setNbrdate(Date Nbrdate) {
		this.nbrdate = Nbrdate;
	}
		/**
	 * @return amt
	 *			金    額
	 */
	public Double getAmt() {
		return amt;
	}

	/**
	 * @param amt
	 *			金    額
	 */
	public void setAmt(Double Amt) {
		this.amt = Amt;
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
	 * @return nb_nbr
	 *			轉存銀行代號
	 */
	public String getNb_nbr() {
		return nb_nbr;
	}

	/**
	 * @param nb_nbr
	 *			轉存銀行代號
	 */
	public void setNb_nbr(String Nb_nbr) {
		this.nb_nbr = Nb_nbr;
	}
		/**
	 * @return sstatus
	 *			銀行狀態字串
	 */
	public String getSstatus() {
		return sstatus;
	}

	/**
	 * @param sstatus
	 *			銀行狀態字串
	 */
	public void setSstatus(String Sstatus) {
		this.sstatus = Sstatus;
	}
		/**
	 * @return io_dbf
	 *			往來客戶/廠商檔
	 */
	public String getIo_dbf() {
		return io_dbf;
	}

	/**
	 * @param io_dbf
	 *			往來客戶/廠商檔
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
	 * @return acc_id
	 *			會計科目
	 */
	public String getAcc_id() {
		return acc_id;
	}

	/**
	 * @param acc_id
	 *			會計科目
	 */
	public void setAcc_id(String Acc_id) {
		this.acc_id = Acc_id;
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

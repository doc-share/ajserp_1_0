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
 *  @date Thu Jul 30 14:46:11 CST 2020
 */
@Entity
@Table(name = "oivc_bah" ,indexes = { @Index(name = "created", columnList = "created"), 
@Index(name = "updated", columnList = "updated")})
@EntityInfo("銷項發票表頭檔")
public class Oivcbah extends BaseProperties {

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

	@FieldInfo("單據號碼")
	@FilterInfo(ListValue = "")
	@Column(name = "nbr", length =32  )
	private String nbr ;

	@FieldInfo("會計傳票")
	@FilterInfo(ListValue = "")
	@Column(name = "acc_nbr", length =32  )
	private String acc_nbr ;

	@FieldInfo("發票號碼")
	@FilterInfo(ListValue = "")
	@Column(name = "ivc_nbr", length =32  )
	private String ivc_nbr ;

	@FieldInfo("發票日期")
	@FilterInfo(ListValue = "")
	@Column(name = "nbrdate")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date nbrdate;

	@FieldInfo("抬頭客戶")
	@FilterInfo(ListValue = "")
	@Column(name = "ivc_name", length =32  )
	private String ivc_name ;

	@FieldInfo("客戶代號")
	@FilterInfo(ListValue = "")
	@Column(name = "cus_nbr", length =32  )
	private String cus_nbr ;

	@FieldInfo("統一編號")
	@FilterInfo(ListValue = "")
	@Column(name = "cus_gun", length =32  )
	private String cus_gun ;

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

	@FieldInfo("備註")
	@FilterInfo(ListValue = "")
	@Column(name = "remark", length =128  )
	private String remark ;

	@FieldInfo("發票開立人")
	@FilterInfo(ListValue = "")
	@Column(name = "ivc_pur", length =32  )
	private String ivc_pur ;

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

	@FieldInfo("起始月份")
	@FilterInfo(ListValue = "")
	@Column(name = "acr_mon1", length =32  )
	private String acr_mon1 ;

	@FieldInfo("結束月份")
	@FilterInfo(ListValue = "")
	@Column(name = "acr_mon2", length =32  )
	private String acr_mon2 ;

	@FieldInfo("發票聯式")
	@FilterInfo(ListValue = "")
	@Column(name = "inv_type", length =32  )
	private String inv_type ;

	@FieldInfo("字軌")
	@FilterInfo(ListValue = "")
	@Column(name = "inv_zk", length =32  )
	private String inv_zk ;

	@FieldInfo("起始號碼")
	@FilterInfo(ListValue = "")
	@Column(name = "nbr1", length =32  )
	private String nbr1 ;

	@FieldInfo("截止號碼")
	@FilterInfo(ListValue = "")
	@Column(name = "nbr2", length =32  )
	private String nbr2 ;

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

	@FieldInfo("開立時間")
	@FilterInfo(ListValue = "")
	@Column(name = "time", length =32  )
	private String time ;

	@FieldInfo("上傳日期")
	@FilterInfo(ListValue = "")
	@Column(name = "up_date")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date up_date;

	@FieldInfo("上傳時間")
	@FilterInfo(ListValue = "")
	@Column(name = "up_time", length =32  )
	private String up_time ;

	@FieldInfo("上傳人員")
	@FilterInfo(ListValue = "")
	@Column(name = "up_user", length =32  )
	private String up_user ;

	@FieldInfo("作廢日期")
	@FilterInfo(ListValue = "")
	@Column(name = "cdate")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date cdate;

	@FieldInfo("作廢時間")
	@FilterInfo(ListValue = "")
	@Column(name = "ctime", length =32  )
	private String ctime ;

	@FieldInfo("作廢人員")
	@FilterInfo(ListValue = "")
	@Column(name = "cuser", length =32  )
	private String cuser ;

	@FieldInfo("作廢原因")
	@FilterInfo(ListValue = "")
	@Column(name = "creason", length =128  )
	private String creason ;

	@FieldInfo("作廢上傳日期")
	@FilterInfo(ListValue = "")
	@Column(name = "cup_date")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date cup_date;

	@FieldInfo("作廢上傳時間")
	@FilterInfo(ListValue = "")
	@Column(name = "cup_time", length =32  )
	private String cup_time ;

	@FieldInfo("作廢上傳人員姓名")
	@FilterInfo(ListValue = "")
	@Column(name = "cup_user", length =32  )
	private String cup_user ;

	@FieldInfo("上傳狀態")
	@FilterInfo(ListValue = "")
	@Column(name = "up_status", length =32  )
	private String up_status ;

	@FieldInfo("專案作廢核准文號")
	@FilterInfo(ListValue = "")
	@Column(name = "rtax_desc", length =128  )
	private String rtax_desc ;

	@FieldInfo("發票接收日期")
	@FilterInfo(ListValue = "")
	@Column(name = "rdate")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date rdate;

	@FieldInfo("發票接收時間")
	@FilterInfo(ListValue = "")
	@Column(name = "rtime", length =32  )
	private String rtime ;

	@FieldInfo("訊息記錄")
	@FilterInfo(ListValue = "")
	@Column(name = "up_log", length =128  )
	private String up_log ;

	@FieldInfo("通關方式")
	@FilterInfo(ListValue = "")
	@Column(name = "tg_fs", length =32  )
	private String tg_fs ;

	@FieldInfo("折讓單號")
	@FilterInfo(ListValue = "")
	@Column(name = "dis_nbe", length =32  )
	private String dis_nbe ;


     /**
	 *
	 * 构造函数
	 *
	 */
	public Oivcbah() {
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
	 *		  單據號碼
	 * 
	 	 * @param acc_nbr
	 *		  會計傳票
	 * 
	 	 * @param ivc_nbr
	 *		  發票號碼
	 * 
	 	 * @param nbrdate
	 *		  發票日期
	 * 
	 	 * @param ivc_name
	 *		  抬頭客戶
	 * 
	 	 * @param cus_nbr
	 *		  客戶代號
	 * 
	 	 * @param cus_gun
	 *		  統一編號
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
	 	 * @param remark
	 *		  備註
	 * 
	 	 * @param ivc_pur
	 *		  發票開立人
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
	 	 * @param acr_mon1
	 *		  起始月份
	 * 
	 	 * @param acr_mon2
	 *		  結束月份
	 * 
	 	 * @param inv_type
	 *		  發票聯式
	 * 
	 	 * @param inv_zk
	 *		  字軌
	 * 
	 	 * @param nbr1
	 *		  起始號碼
	 * 
	 	 * @param nbr2
	 *		  截止號碼
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
	 	 * @param time
	 *		  開立時間
	 * 
	 	 * @param up_date
	 *		  上傳日期
	 * 
	 	 * @param up_time
	 *		  上傳時間
	 * 
	 	 * @param up_user
	 *		  上傳人員
	 * 
	 	 * @param cdate
	 *		  作廢日期
	 * 
	 	 * @param ctime
	 *		  作廢時間
	 * 
	 	 * @param cuser
	 *		  作廢人員
	 * 
	 	 * @param creason
	 *		  作廢原因
	 * 
	 	 * @param cup_date
	 *		  作廢上傳日期
	 * 
	 	 * @param cup_time
	 *		  作廢上傳時間
	 * 
	 	 * @param cup_user
	 *		  作廢上傳人員姓名
	 * 
	 	 * @param up_status
	 *		  上傳狀態
	 * 
	 	 * @param rtax_desc
	 *		  專案作廢核准文號
	 * 
	 	 * @param rdate
	 *		  發票接收日期
	 * 
	 	 * @param rtime
	 *		  發票接收時間
	 * 
	 	 * @param up_log
	 *		  訊息記錄
	 * 
	 	 * @param tg_fs
	 *		  通關方式
	 * 
	 	 * @param dis_nbe
	 *		  折讓單號
	 * 
	 	 */
    	public Oivcbah( String io_p, String io_p1, String acr_mon, String nbr, String acc_nbr, String ivc_nbr, Date nbrdate, String ivc_name, String cus_nbr, String cus_gun, String tax_type, Integer tax_amt, Double tot_amt, String remark, String ivc_pur, String status, Double rec_amt, String pay_term, String last_user, Date crt_date, String crt_user, Date edit_date, String edit_user, String acr_mon1, String acr_mon2, String inv_type, String inv_zk, String nbr1, String nbr2, String tranok, String tranop, Integer trancnt, String time, Date up_date, String up_time, String up_user, Date cdate, String ctime, String cuser, String creason, Date cup_date, String cup_time, String cup_user, String up_status, String rtax_desc, Date rdate, String rtime, String up_log, String tg_fs, String dis_nbe ) {
		super();
				this.io_p = io_p;
				this.io_p1 = io_p1;
				this.acr_mon = acr_mon;
				this.nbr = nbr;
				this.acc_nbr = acc_nbr;
				this.ivc_nbr = ivc_nbr;
				this.nbrdate = nbrdate;
				this.ivc_name = ivc_name;
				this.cus_nbr = cus_nbr;
				this.cus_gun = cus_gun;
				this.tax_type = tax_type;
				this.tax_amt = tax_amt;
				this.tot_amt = tot_amt;
				this.remark = remark;
				this.ivc_pur = ivc_pur;
				this.status = status;
				this.rec_amt = rec_amt;
				this.pay_term = pay_term;
				this.last_user = last_user;
				this.crt_date = crt_date;
				this.crt_user = crt_user;
				this.edit_date = edit_date;
				this.edit_user = edit_user;
				this.acr_mon1 = acr_mon1;
				this.acr_mon2 = acr_mon2;
				this.inv_type = inv_type;
				this.inv_zk = inv_zk;
				this.nbr1 = nbr1;
				this.nbr2 = nbr2;
				this.tranok = tranok;
				this.tranop = tranop;
				this.trancnt = trancnt;
				this.time = time;
				this.up_date = up_date;
				this.up_time = up_time;
				this.up_user = up_user;
				this.cdate = cdate;
				this.ctime = ctime;
				this.cuser = cuser;
				this.creason = creason;
				this.cup_date = cup_date;
				this.cup_time = cup_time;
				this.cup_user = cup_user;
				this.up_status = up_status;
				this.rtax_desc = rtax_desc;
				this.rdate = rdate;
				this.rtime = rtime;
				this.up_log = up_log;
				this.tg_fs = tg_fs;
				this.dis_nbe = dis_nbe;
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
	 * @return ivc_name
	 *			抬頭客戶
	 */
	public String getIvc_name() {
		return ivc_name;
	}

	/**
	 * @param ivc_name
	 *			抬頭客戶
	 */
	public void setIvc_name(String Ivc_name) {
		this.ivc_name = Ivc_name;
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
	 * @return cus_gun
	 *			統一編號
	 */
	public String getCus_gun() {
		return cus_gun;
	}

	/**
	 * @param cus_gun
	 *			統一編號
	 */
	public void setCus_gun(String Cus_gun) {
		this.cus_gun = Cus_gun;
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
	 * @return acr_mon1
	 *			起始月份
	 */
	public String getAcr_mon1() {
		return acr_mon1;
	}

	/**
	 * @param acr_mon1
	 *			起始月份
	 */
	public void setAcr_mon1(String Acr_mon1) {
		this.acr_mon1 = Acr_mon1;
	}
		/**
	 * @return acr_mon2
	 *			結束月份
	 */
	public String getAcr_mon2() {
		return acr_mon2;
	}

	/**
	 * @param acr_mon2
	 *			結束月份
	 */
	public void setAcr_mon2(String Acr_mon2) {
		this.acr_mon2 = Acr_mon2;
	}
		/**
	 * @return inv_type
	 *			發票聯式
	 */
	public String getInv_type() {
		return inv_type;
	}

	/**
	 * @param inv_type
	 *			發票聯式
	 */
	public void setInv_type(String Inv_type) {
		this.inv_type = Inv_type;
	}
		/**
	 * @return inv_zk
	 *			字軌
	 */
	public String getInv_zk() {
		return inv_zk;
	}

	/**
	 * @param inv_zk
	 *			字軌
	 */
	public void setInv_zk(String Inv_zk) {
		this.inv_zk = Inv_zk;
	}
		/**
	 * @return nbr1
	 *			起始號碼
	 */
	public String getNbr1() {
		return nbr1;
	}

	/**
	 * @param nbr1
	 *			起始號碼
	 */
	public void setNbr1(String Nbr1) {
		this.nbr1 = Nbr1;
	}
		/**
	 * @return nbr2
	 *			截止號碼
	 */
	public String getNbr2() {
		return nbr2;
	}

	/**
	 * @param nbr2
	 *			截止號碼
	 */
	public void setNbr2(String Nbr2) {
		this.nbr2 = Nbr2;
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
	 * @return time
	 *			開立時間
	 */
	public String getTime() {
		return time;
	}

	/**
	 * @param time
	 *			開立時間
	 */
	public void setTime(String Time) {
		this.time = Time;
	}
		/**
	 * @return up_date
	 *			上傳日期
	 */
	public Date getUp_date() {
		return up_date;
	}

	/**
	 * @param up_date
	 *			上傳日期
	 */
	public void setUp_date(Date Up_date) {
		this.up_date = Up_date;
	}
		/**
	 * @return up_time
	 *			上傳時間
	 */
	public String getUp_time() {
		return up_time;
	}

	/**
	 * @param up_time
	 *			上傳時間
	 */
	public void setUp_time(String Up_time) {
		this.up_time = Up_time;
	}
		/**
	 * @return up_user
	 *			上傳人員
	 */
	public String getUp_user() {
		return up_user;
	}

	/**
	 * @param up_user
	 *			上傳人員
	 */
	public void setUp_user(String Up_user) {
		this.up_user = Up_user;
	}
		/**
	 * @return cdate
	 *			作廢日期
	 */
	public Date getCdate() {
		return cdate;
	}

	/**
	 * @param cdate
	 *			作廢日期
	 */
	public void setCdate(Date Cdate) {
		this.cdate = Cdate;
	}
		/**
	 * @return ctime
	 *			作廢時間
	 */
	public String getCtime() {
		return ctime;
	}

	/**
	 * @param ctime
	 *			作廢時間
	 */
	public void setCtime(String Ctime) {
		this.ctime = Ctime;
	}
		/**
	 * @return cuser
	 *			作廢人員
	 */
	public String getCuser() {
		return cuser;
	}

	/**
	 * @param cuser
	 *			作廢人員
	 */
	public void setCuser(String Cuser) {
		this.cuser = Cuser;
	}
		/**
	 * @return creason
	 *			作廢原因
	 */
	public String getCreason() {
		return creason;
	}

	/**
	 * @param creason
	 *			作廢原因
	 */
	public void setCreason(String Creason) {
		this.creason = Creason;
	}
		/**
	 * @return cup_date
	 *			作廢上傳日期
	 */
	public Date getCup_date() {
		return cup_date;
	}

	/**
	 * @param cup_date
	 *			作廢上傳日期
	 */
	public void setCup_date(Date Cup_date) {
		this.cup_date = Cup_date;
	}
		/**
	 * @return cup_time
	 *			作廢上傳時間
	 */
	public String getCup_time() {
		return cup_time;
	}

	/**
	 * @param cup_time
	 *			作廢上傳時間
	 */
	public void setCup_time(String Cup_time) {
		this.cup_time = Cup_time;
	}
		/**
	 * @return cup_user
	 *			作廢上傳人員姓名
	 */
	public String getCup_user() {
		return cup_user;
	}

	/**
	 * @param cup_user
	 *			作廢上傳人員姓名
	 */
	public void setCup_user(String Cup_user) {
		this.cup_user = Cup_user;
	}
		/**
	 * @return up_status
	 *			上傳狀態
	 */
	public String getUp_status() {
		return up_status;
	}

	/**
	 * @param up_status
	 *			上傳狀態
	 */
	public void setUp_status(String Up_status) {
		this.up_status = Up_status;
	}
		/**
	 * @return rtax_desc
	 *			專案作廢核准文號
	 */
	public String getRtax_desc() {
		return rtax_desc;
	}

	/**
	 * @param rtax_desc
	 *			專案作廢核准文號
	 */
	public void setRtax_desc(String Rtax_desc) {
		this.rtax_desc = Rtax_desc;
	}
		/**
	 * @return rdate
	 *			發票接收日期
	 */
	public Date getRdate() {
		return rdate;
	}

	/**
	 * @param rdate
	 *			發票接收日期
	 */
	public void setRdate(Date Rdate) {
		this.rdate = Rdate;
	}
		/**
	 * @return rtime
	 *			發票接收時間
	 */
	public String getRtime() {
		return rtime;
	}

	/**
	 * @param rtime
	 *			發票接收時間
	 */
	public void setRtime(String Rtime) {
		this.rtime = Rtime;
	}
		/**
	 * @return up_log
	 *			訊息記錄
	 */
	public String getUp_log() {
		return up_log;
	}

	/**
	 * @param up_log
	 *			訊息記錄
	 */
	public void setUp_log(String Up_log) {
		this.up_log = Up_log;
	}
		/**
	 * @return tg_fs
	 *			通關方式
	 */
	public String getTg_fs() {
		return tg_fs;
	}

	/**
	 * @param tg_fs
	 *			通關方式
	 */
	public void setTg_fs(String Tg_fs) {
		this.tg_fs = Tg_fs;
	}
		/**
	 * @return dis_nbe
	 *			折讓單號
	 */
	public String getDis_nbe() {
		return dis_nbe;
	}

	/**
	 * @param dis_nbe
	 *			折讓單號
	 */
	public void setDis_nbe(String Dis_nbe) {
		this.dis_nbe = Dis_nbe;
	}
	
}

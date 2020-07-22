package org.esy.acc.entity;

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
 *  @date Sat Jun 20 09:44:01 CST 2020
 */
@Entity
@Table(name = "acc_bah" ,indexes = { @Index(name = "created", columnList = "created"), 
@Index(name = "updated", columnList = "updated")})
@EntityInfo("收款單轉傳票")
public class Accbah extends BaseProperties {

	private static final long serialVersionUID = 1L;

	@FieldInfo("傳票類別")
	@FilterInfo(ListValue = "")
	@Column(name = "inv_type", length =32  )
	private String inv_type ;

	@FieldInfo("傳票號碼")
	@FilterInfo(ListValue = "")
	@Column(name = "nbr", length =32  )
	private String nbr ;

	@FieldInfo("傳票日期")
	@FilterInfo(ListValue = "")
	@Column(name = "date")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date date;

	@FieldInfo("借方金額")
	@FilterInfo(ListValue = "")
	@Column(name = "d_amt")
	private Double d_amt;

	@FieldInfo("貸方金額")
	@FilterInfo(ListValue = "")
	@Column(name = "c_amt")
	private Double c_amt;

	@FieldInfo("傳票狀態")
	@FilterInfo(ListValue = "")
	@Column(name = "status", length =32  )
	private String status ;

	@FieldInfo("立沖狀態")
	@FilterInfo(ListValue = "")
	@Column(name = "status1", length =32  )
	private String status1 ;

	@FieldInfo("使用者代號")
	@FilterInfo(ListValue = "")
	@Column(name = "form_user", length =32  )
	private String form_user ;

	@FieldInfo("0.一般 1.票據傳票 2.票據兌現傳票")
	@FilterInfo(ListValue = "")
	@Column(name = "chk_ctl", length =32  )
	private String chk_ctl ;

	@FieldInfo("最後異動者代號")
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


     /**
	 *
	 * 构造函数
	 *
	 */
	public Accbah() {
		super();
	}
	
	/**
	 *
	 * 构造函数
	 *
	 	 * @param inv_type
	 *		  傳票類別
	 * 
	 	 * @param nbr
	 *		  傳票號碼
	 * 
	 	 * @param date
	 *		  傳票日期
	 * 
	 	 * @param d_amt
	 *		  借方金額
	 * 
	 	 * @param c_amt
	 *		  貸方金額
	 * 
	 	 * @param status
	 *		  傳票狀態
	 * 
	 	 * @param status1
	 *		  立沖狀態
	 * 
	 	 * @param form_user
	 *		  使用者代號
	 * 
	 	 * @param chk_ctl
	 *		  0.一般 1.票據傳票 2.票據兌現傳票
	 * 
	 	 * @param last_user
	 *		  最後異動者代號
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
	 	 */
    	public Accbah( String inv_type, String nbr, Date date, Double d_amt, Double c_amt, String status, String status1, String form_user, String chk_ctl, String last_user, Date crt_date, String crt_user, Date edit_date, String edit_user ) {
		super();
				this.inv_type = inv_type;
				this.nbr = nbr;
				this.date = date;
				this.d_amt = d_amt;
				this.c_amt = c_amt;
				this.status = status;
				this.status1 = status1;
				this.form_user = form_user;
				this.chk_ctl = chk_ctl;
				this.last_user = last_user;
				this.crt_date = crt_date;
				this.crt_user = crt_user;
				this.edit_date = edit_date;
				this.edit_user = edit_user;
			}

		/**
	 * @return inv_type
	 *			傳票類別
	 */
	public String getInv_type() {
		return inv_type;
	}

	/**
	 * @param inv_type
	 *			傳票類別
	 */
	public void setInv_type(String Inv_type) {
		this.inv_type = Inv_type;
	}
		/**
	 * @return nbr
	 *			傳票號碼
	 */
	public String getNbr() {
		return nbr;
	}

	/**
	 * @param nbr
	 *			傳票號碼
	 */
	public void setNbr(String Nbr) {
		this.nbr = Nbr;
	}
		/**
	 * @return date
	 *			傳票日期
	 */
	public Date getDate() {
		return date;
	}

	/**
	 * @param date
	 *			傳票日期
	 */
	public void setDate(Date Date) {
		this.date = Date;
	}
		/**
	 * @return d_amt
	 *			借方金額
	 */
	public Double getD_amt() {
		return d_amt;
	}

	/**
	 * @param d_amt
	 *			借方金額
	 */
	public void setD_amt(Double D_amt) {
		this.d_amt = D_amt;
	}
		/**
	 * @return c_amt
	 *			貸方金額
	 */
	public Double getC_amt() {
		return c_amt;
	}

	/**
	 * @param c_amt
	 *			貸方金額
	 */
	public void setC_amt(Double C_amt) {
		this.c_amt = C_amt;
	}
		/**
	 * @return status
	 *			傳票狀態
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @param status
	 *			傳票狀態
	 */
	public void setStatus(String Status) {
		this.status = Status;
	}
		/**
	 * @return status1
	 *			立沖狀態
	 */
	public String getStatus1() {
		return status1;
	}

	/**
	 * @param status1
	 *			立沖狀態
	 */
	public void setStatus1(String Status1) {
		this.status1 = Status1;
	}
		/**
	 * @return form_user
	 *			使用者代號
	 */
	public String getForm_user() {
		return form_user;
	}

	/**
	 * @param form_user
	 *			使用者代號
	 */
	public void setForm_user(String Form_user) {
		this.form_user = Form_user;
	}
		/**
	 * @return chk_ctl
	 *			0.一般 1.票據傳票 2.票據兌現傳票
	 */
	public String getChk_ctl() {
		return chk_ctl;
	}

	/**
	 * @param chk_ctl
	 *			0.一般 1.票據傳票 2.票據兌現傳票
	 */
	public void setChk_ctl(String Chk_ctl) {
		this.chk_ctl = Chk_ctl;
	}
		/**
	 * @return last_user
	 *			最後異動者代號
	 */
	public String getLast_user() {
		return last_user;
	}

	/**
	 * @param last_user
	 *			最後異動者代號
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
	
}

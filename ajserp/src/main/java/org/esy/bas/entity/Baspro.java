package org.esy.bas.entity;

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
 *  @date Fri Jul 24 10:18:40 CST 2020
 */
@Entity
@Table(name = "bas_pro" ,indexes = { @Index(name = "created", columnList = "created"), 
@Index(name = "updated", columnList = "updated")})
@EntityInfo("製程基本檔")
public class Baspro extends BaseProperties {

	private static final long serialVersionUID = 1L;

	@FieldInfo("製程代號")
	@FilterInfo(ListValue = "")
	@Column(name = "pro_nbr", length =32  )
	private String pro_nbr ;

	@FieldInfo("製程說明")
	@FilterInfo(ListValue = "")
	@Column(name = "pro_desc", length =32  )
	private String pro_desc ;

	@FieldInfo("製程天數")
	@FilterInfo(ListValue = "")
	@Column(name = "pro_days")
	private Integer pro_days;

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

	@FieldInfo("加工說明")
	@FilterInfo(ListValue = "")
	@Column(name = "pro_rmk", columnDefinition = "TEXT")
	private String pro_rmk;

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
	public Baspro() {
		super();
	}
	
	/**
	 *
	 * 构造函数
	 *
	 	 * @param pro_nbr
	 *		  製程代號
	 * 
	 	 * @param pro_desc
	 *		  製程說明
	 * 
	 	 * @param pro_days
	 *		  製程天數
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
	 	 * @param pro_rmk
	 *		  加工說明
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
    	public Baspro( String pro_nbr, String pro_desc, Integer pro_days, Date crt_date, String crt_user, Date edit_date, String edit_user, String pro_rmk, String tranok, String tranop, Integer trancnt ) {
		super();
				this.pro_nbr = pro_nbr;
				this.pro_desc = pro_desc;
				this.pro_days = pro_days;
				this.crt_date = crt_date;
				this.crt_user = crt_user;
				this.edit_date = edit_date;
				this.edit_user = edit_user;
				this.pro_rmk = pro_rmk;
				this.tranok = tranok;
				this.tranop = tranop;
				this.trancnt = trancnt;
			}

		/**
	 * @return pro_nbr
	 *			製程代號
	 */
	public String getPro_nbr() {
		return pro_nbr;
	}

	/**
	 * @param pro_nbr
	 *			製程代號
	 */
	public void setPro_nbr(String Pro_nbr) {
		this.pro_nbr = Pro_nbr;
	}
		/**
	 * @return pro_desc
	 *			製程說明
	 */
	public String getPro_desc() {
		return pro_desc;
	}

	/**
	 * @param pro_desc
	 *			製程說明
	 */
	public void setPro_desc(String Pro_desc) {
		this.pro_desc = Pro_desc;
	}
		/**
	 * @return pro_days
	 *			製程天數
	 */
	public Integer getPro_days() {
		return pro_days;
	}

	/**
	 * @param pro_days
	 *			製程天數
	 */
	public void setPro_days(Integer Pro_days) {
		this.pro_days = Pro_days;
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
	 * @return pro_rmk
	 *			加工說明
	 */
	public String getPro_rmk() {
		return pro_rmk;
	}

	/**
	 * @param pro_rmk
	 *			加工說明
	 */
	public void setPro_rmk(String Pro_rmk) {
		this.pro_rmk = Pro_rmk;
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

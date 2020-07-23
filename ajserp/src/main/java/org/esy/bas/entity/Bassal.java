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
 *  @date Thu Jul 23 13:06:35 CST 2020
 */
@Entity
@Table(name = "bas_sal" ,indexes = { @Index(name = "created", columnList = "created"), 
@Index(name = "updated", columnList = "updated")})
@EntityInfo("業務員主檔")
public class Bassal extends BaseProperties {

	private static final long serialVersionUID = 1L;

	@FieldInfo("業務代號")
	@FilterInfo(ListValue = "")
	@Column(name = "sale_nbr", length =32  )
	private String sale_nbr ;

	@FieldInfo("業務名稱")
	@FilterInfo(ListValue = "")
	@Column(name = "sale_name", length =32  )
	private String sale_name ;

	@FieldInfo("業務英文名稱")
	@FilterInfo(ListValue = "")
	@Column(name = "esale_name", length =32  )
	private String esale_name ;

	@FieldInfo("職位等級")
	@FilterInfo(ListValue = "")
	@Column(name = "title_code", length =32  )
	private String title_code ;

	@FieldInfo("員工代號")
	@FilterInfo(ListValue = "")
	@Column(name = "emp_nbr", length =32  )
	private String emp_nbr ;

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
	public Bassal() {
		super();
	}
	
	/**
	 *
	 * 构造函数
	 *
	 	 * @param sale_nbr
	 *		  業務代號
	 * 
	 	 * @param sale_name
	 *		  業務名稱
	 * 
	 	 * @param esale_name
	 *		  業務英文名稱
	 * 
	 	 * @param title_code
	 *		  職位等級
	 * 
	 	 * @param emp_nbr
	 *		  員工代號
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
    	public Bassal( String sale_nbr, String sale_name, String esale_name, String title_code, String emp_nbr, Date crt_date, String crt_user, Date edit_date, String edit_user, String tranok, String tranop, Integer trancnt ) {
		super();
				this.sale_nbr = sale_nbr;
				this.sale_name = sale_name;
				this.esale_name = esale_name;
				this.title_code = title_code;
				this.emp_nbr = emp_nbr;
				this.crt_date = crt_date;
				this.crt_user = crt_user;
				this.edit_date = edit_date;
				this.edit_user = edit_user;
				this.tranok = tranok;
				this.tranop = tranop;
				this.trancnt = trancnt;
			}

		/**
	 * @return sale_nbr
	 *			業務代號
	 */
	public String getSale_nbr() {
		return sale_nbr;
	}

	/**
	 * @param sale_nbr
	 *			業務代號
	 */
	public void setSale_nbr(String Sale_nbr) {
		this.sale_nbr = Sale_nbr;
	}
		/**
	 * @return sale_name
	 *			業務名稱
	 */
	public String getSale_name() {
		return sale_name;
	}

	/**
	 * @param sale_name
	 *			業務名稱
	 */
	public void setSale_name(String Sale_name) {
		this.sale_name = Sale_name;
	}
		/**
	 * @return esale_name
	 *			業務英文名稱
	 */
	public String getEsale_name() {
		return esale_name;
	}

	/**
	 * @param esale_name
	 *			業務英文名稱
	 */
	public void setEsale_name(String Esale_name) {
		this.esale_name = Esale_name;
	}
		/**
	 * @return title_code
	 *			職位等級
	 */
	public String getTitle_code() {
		return title_code;
	}

	/**
	 * @param title_code
	 *			職位等級
	 */
	public void setTitle_code(String Title_code) {
		this.title_code = Title_code;
	}
		/**
	 * @return emp_nbr
	 *			員工代號
	 */
	public String getEmp_nbr() {
		return emp_nbr;
	}

	/**
	 * @param emp_nbr
	 *			員工代號
	 */
	public void setEmp_nbr(String Emp_nbr) {
		this.emp_nbr = Emp_nbr;
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

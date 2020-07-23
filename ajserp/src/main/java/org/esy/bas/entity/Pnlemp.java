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
 *  @date Thu Jul 23 15:26:37 CST 2020
 */
@Entity
@Table(name = "pnl_emp" ,indexes = { @Index(name = "created", columnList = "created"), 
@Index(name = "updated", columnList = "updated")})
@EntityInfo("員工主檔")
public class Pnlemp extends BaseProperties {

	private static final long serialVersionUID = 1L;

	@FieldInfo("員工編號")
	@FilterInfo(ListValue = "")
	@Column(name = "emp_nbr", length =32  )
	private String emp_nbr ;

	@FieldInfo("身份證字號")
	@FilterInfo(ListValue = "")
	@Column(name = "id_code", length =32  )
	private String id_code ;

	@FieldInfo("中文姓名")
	@FilterInfo(ListValue = "")
	@Column(name = "emp_name", length =32  )
	private String emp_name ;

	@FieldInfo("籍貫")
	@FilterInfo(ListValue = "")
	@Column(name = "native_addr", length =32  )
	private String native_addr ;

	@FieldInfo("戶籍所在地")
	@FilterInfo(ListValue = "")
	@Column(name = "address1", length =128  )
	private String address1 ;

	@FieldInfo("通訊地址")
	@FilterInfo(ListValue = "")
	@Column(name = "address2", length =128  )
	private String address2 ;

	@FieldInfo("緊急連絡人")
	@FilterInfo(ListValue = "")
	@Column(name = "alarm_name", length =32  )
	private String alarm_name ;

	@FieldInfo("電話號碼")
	@FilterInfo(ListValue = "")
	@Column(name = "tel_no", length =32  )
	private String tel_no ;

	@FieldInfo("B.B. Call")
	@FilterInfo(ListValue = "")
	@Column(name = "bbc_no", length =32  )
	private String bbc_no ;

	@FieldInfo("出生年月日")
	@FilterInfo(ListValue = "")
	@Column(name = "birth_date")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date birth_date;

	@FieldInfo("到職日期")
	@FilterInfo(ListValue = "")
	@Column(name = "empl_date")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date empl_date;

	@FieldInfo("勞保生效日期")
	@FilterInfo(ListValue = "")
	@Column(name = "ins_eff")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date ins_eff;

	@FieldInfo("備註")
	@FilterInfo(ListValue = "")
	@Column(name = "remark", columnDefinition = "TEXT")
	private String remark;

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
	public Pnlemp() {
		super();
	}
	
	/**
	 *
	 * 构造函数
	 *
	 	 * @param emp_nbr
	 *		  員工編號
	 * 
	 	 * @param id_code
	 *		  身份證字號
	 * 
	 	 * @param emp_name
	 *		  中文姓名
	 * 
	 	 * @param native_addr
	 *		  籍貫
	 * 
	 	 * @param address1
	 *		  戶籍所在地
	 * 
	 	 * @param address2
	 *		  通訊地址
	 * 
	 	 * @param alarm_name
	 *		  緊急連絡人
	 * 
	 	 * @param tel_no
	 *		  電話號碼
	 * 
	 	 * @param bbc_no
	 *		  B.B. Call
	 * 
	 	 * @param birth_date
	 *		  出生年月日
	 * 
	 	 * @param empl_date
	 *		  到職日期
	 * 
	 	 * @param ins_eff
	 *		  勞保生效日期
	 * 
	 	 * @param remark
	 *		  備註
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
    	public Pnlemp( String emp_nbr, String id_code, String emp_name, String native_addr, String address1, String address2, String alarm_name, String tel_no, String bbc_no, Date birth_date, Date empl_date, Date ins_eff, String remark, String tranok, String tranop, Integer trancnt ) {
		super();
				this.emp_nbr = emp_nbr;
				this.id_code = id_code;
				this.emp_name = emp_name;
				this.native_addr = native_addr;
				this.address1 = address1;
				this.address2 = address2;
				this.alarm_name = alarm_name;
				this.tel_no = tel_no;
				this.bbc_no = bbc_no;
				this.birth_date = birth_date;
				this.empl_date = empl_date;
				this.ins_eff = ins_eff;
				this.remark = remark;
				this.tranok = tranok;
				this.tranop = tranop;
				this.trancnt = trancnt;
			}

		/**
	 * @return emp_nbr
	 *			員工編號
	 */
	public String getEmp_nbr() {
		return emp_nbr;
	}

	/**
	 * @param emp_nbr
	 *			員工編號
	 */
	public void setEmp_nbr(String Emp_nbr) {
		this.emp_nbr = Emp_nbr;
	}
		/**
	 * @return id_code
	 *			身份證字號
	 */
	public String getId_code() {
		return id_code;
	}

	/**
	 * @param id_code
	 *			身份證字號
	 */
	public void setId_code(String Id_code) {
		this.id_code = Id_code;
	}
		/**
	 * @return emp_name
	 *			中文姓名
	 */
	public String getEmp_name() {
		return emp_name;
	}

	/**
	 * @param emp_name
	 *			中文姓名
	 */
	public void setEmp_name(String Emp_name) {
		this.emp_name = Emp_name;
	}
		/**
	 * @return native_addr
	 *			籍貫
	 */
	public String getNative_addr() {
		return native_addr;
	}

	/**
	 * @param native_addr
	 *			籍貫
	 */
	public void setNative_addr(String Native_addr) {
		this.native_addr = Native_addr;
	}
		/**
	 * @return address1
	 *			戶籍所在地
	 */
	public String getAddress1() {
		return address1;
	}

	/**
	 * @param address1
	 *			戶籍所在地
	 */
	public void setAddress1(String Address1) {
		this.address1 = Address1;
	}
		/**
	 * @return address2
	 *			通訊地址
	 */
	public String getAddress2() {
		return address2;
	}

	/**
	 * @param address2
	 *			通訊地址
	 */
	public void setAddress2(String Address2) {
		this.address2 = Address2;
	}
		/**
	 * @return alarm_name
	 *			緊急連絡人
	 */
	public String getAlarm_name() {
		return alarm_name;
	}

	/**
	 * @param alarm_name
	 *			緊急連絡人
	 */
	public void setAlarm_name(String Alarm_name) {
		this.alarm_name = Alarm_name;
	}
		/**
	 * @return tel_no
	 *			電話號碼
	 */
	public String getTel_no() {
		return tel_no;
	}

	/**
	 * @param tel_no
	 *			電話號碼
	 */
	public void setTel_no(String Tel_no) {
		this.tel_no = Tel_no;
	}
		/**
	 * @return bbc_no
	 *			B.B. Call
	 */
	public String getBbc_no() {
		return bbc_no;
	}

	/**
	 * @param bbc_no
	 *			B.B. Call
	 */
	public void setBbc_no(String Bbc_no) {
		this.bbc_no = Bbc_no;
	}
		/**
	 * @return birth_date
	 *			出生年月日
	 */
	public Date getBirth_date() {
		return birth_date;
	}

	/**
	 * @param birth_date
	 *			出生年月日
	 */
	public void setBirth_date(Date Birth_date) {
		this.birth_date = Birth_date;
	}
		/**
	 * @return empl_date
	 *			到職日期
	 */
	public Date getEmpl_date() {
		return empl_date;
	}

	/**
	 * @param empl_date
	 *			到職日期
	 */
	public void setEmpl_date(Date Empl_date) {
		this.empl_date = Empl_date;
	}
		/**
	 * @return ins_eff
	 *			勞保生效日期
	 */
	public Date getIns_eff() {
		return ins_eff;
	}

	/**
	 * @param ins_eff
	 *			勞保生效日期
	 */
	public void setIns_eff(Date Ins_eff) {
		this.ins_eff = Ins_eff;
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

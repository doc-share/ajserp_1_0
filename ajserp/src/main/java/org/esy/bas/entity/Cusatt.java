package org.esy.bas.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Index;
import javax.persistence.Table;
import org.esy.base.annotation.EntityInfo;
import org.esy.base.annotation.FieldInfo;
import org.esy.base.core.BaseProperties;
import org.esy.base.annotation.FilterInfo;



/**
 *  实体类
 * 
 * @author <a href="mailto:ardui@163.com"ardui</a
 *  @date Tue Jun 23 13:30:12 CST 2020
 */
@Entity
@Table(name = "cus_att" ,indexes = { @Index(name = "created", columnList = "created"), 
@Index(name = "updated", columnList = "updated")})
@EntityInfo("客戶管理明細")
public class Cusatt extends BaseProperties {

	private static final long serialVersionUID = 1L;

	@FieldInfo("客戶編號")
	@FilterInfo(ListValue = "")
	@Column(name = "cus_nbr", length =32  )
	private String cus_nbr ;

	@FieldInfo("聯絡人")
	@FilterInfo(ListValue = "")
	@Column(name = "attname", length =32  )
	private String attname ;

	@FieldInfo("稱謂")
	@FilterInfo(ListValue = "")
	@Column(name = "chunwei", length =32  )
	private String chunwei ;

	@FieldInfo("部門代號")
	@FilterInfo(ListValue = "")
	@Column(name = "dept_id", length =32  )
	private String dept_id ;

	@FieldInfo("部門")
	@FilterInfo(ListValue = "")
	@Column(name = "dept_desc", length =32  )
	private String dept_desc ;

	@FieldInfo("職稱")
	@FilterInfo(ListValue = "")
	@Column(name = "t_desc", length =32  )
	private String t_desc ;

	@FieldInfo("職稱編號")
	@FilterInfo(ListValue = "")
	@Column(name = "t_nbr", length =32  )
	private String t_nbr ;

	@FieldInfo("電話")
	@FilterInfo(ListValue = "")
	@Column(name = "att_tel", length =32  )
	private String att_tel ;

	@FieldInfo("分機")
	@FilterInfo(ListValue = "")
	@Column(name = "att_oth", length =32  )
	private String att_oth ;

	@FieldInfo("手機")
	@FilterInfo(ListValue = "")
	@Column(name = "cellphone", length =32  )
	private String cellphone ;

	@FieldInfo("傳真")
	@FilterInfo(ListValue = "")
	@Column(name = "att_fax", length =32  )
	private String att_fax ;

	@FieldInfo("EMAIL")
	@FilterInfo(ListValue = "")
	@Column(name = "email", length =32  )
	private String email ;

	@FieldInfo("備註")
	@FilterInfo(ListValue = "")
	@Column(name = "remark", length =32  )
	private String remark ;


     /**
	 *
	 * 构造函数
	 *
	 */
	public Cusatt() {
		super();
	}
	
	/**
	 *
	 * 构造函数
	 *
	 	 * @param cus_nbr
	 *		  客戶編號
	 * 
	 	 * @param attname
	 *		  聯絡人
	 * 
	 	 * @param chunwei
	 *		  稱謂
	 * 
	 	 * @param dept_id
	 *		  部門代號
	 * 
	 	 * @param dept_desc
	 *		  部門
	 * 
	 	 * @param t_desc
	 *		  職稱
	 * 
	 	 * @param t_nbr
	 *		  職稱編號
	 * 
	 	 * @param att_tel
	 *		  電話
	 * 
	 	 * @param att_oth
	 *		  分機
	 * 
	 	 * @param cellphone
	 *		  手機
	 * 
	 	 * @param att_fax
	 *		  傳真
	 * 
	 	 * @param email
	 *		  EMAIL
	 * 
	 	 * @param remark
	 *		  備註
	 * 
	 	 */
    	public Cusatt( String cus_nbr, String attname, String chunwei, String dept_id, String dept_desc, String t_desc, String t_nbr, String att_tel, String att_oth, String cellphone, String att_fax, String email, String remark ) {
		super();
				this.cus_nbr = cus_nbr;
				this.attname = attname;
				this.chunwei = chunwei;
				this.dept_id = dept_id;
				this.dept_desc = dept_desc;
				this.t_desc = t_desc;
				this.t_nbr = t_nbr;
				this.att_tel = att_tel;
				this.att_oth = att_oth;
				this.cellphone = cellphone;
				this.att_fax = att_fax;
				this.email = email;
				this.remark = remark;
			}

		/**
	 * @return cus_nbr
	 *			客戶編號
	 */
	public String getCus_nbr() {
		return cus_nbr;
	}

	/**
	 * @param cus_nbr
	 *			客戶編號
	 */
	public void setCus_nbr(String Cus_nbr) {
		this.cus_nbr = Cus_nbr;
	}
		/**
	 * @return attname
	 *			聯絡人
	 */
	public String getAttname() {
		return attname;
	}

	/**
	 * @param attname
	 *			聯絡人
	 */
	public void setAttname(String Attname) {
		this.attname = Attname;
	}
		/**
	 * @return chunwei
	 *			稱謂
	 */
	public String getChunwei() {
		return chunwei;
	}

	/**
	 * @param chunwei
	 *			稱謂
	 */
	public void setChunwei(String Chunwei) {
		this.chunwei = Chunwei;
	}
		/**
	 * @return dept_id
	 *			部門代號
	 */
	public String getDept_id() {
		return dept_id;
	}

	/**
	 * @param dept_id
	 *			部門代號
	 */
	public void setDept_id(String Dept_id) {
		this.dept_id = Dept_id;
	}
		/**
	 * @return dept_desc
	 *			部門
	 */
	public String getDept_desc() {
		return dept_desc;
	}

	/**
	 * @param dept_desc
	 *			部門
	 */
	public void setDept_desc(String Dept_desc) {
		this.dept_desc = Dept_desc;
	}
		/**
	 * @return t_desc
	 *			職稱
	 */
	public String getT_desc() {
		return t_desc;
	}

	/**
	 * @param t_desc
	 *			職稱
	 */
	public void setT_desc(String T_desc) {
		this.t_desc = T_desc;
	}
		/**
	 * @return t_nbr
	 *			職稱編號
	 */
	public String getT_nbr() {
		return t_nbr;
	}

	/**
	 * @param t_nbr
	 *			職稱編號
	 */
	public void setT_nbr(String T_nbr) {
		this.t_nbr = T_nbr;
	}
		/**
	 * @return att_tel
	 *			電話
	 */
	public String getAtt_tel() {
		return att_tel;
	}

	/**
	 * @param att_tel
	 *			電話
	 */
	public void setAtt_tel(String Att_tel) {
		this.att_tel = Att_tel;
	}
		/**
	 * @return att_oth
	 *			分機
	 */
	public String getAtt_oth() {
		return att_oth;
	}

	/**
	 * @param att_oth
	 *			分機
	 */
	public void setAtt_oth(String Att_oth) {
		this.att_oth = Att_oth;
	}
		/**
	 * @return cellphone
	 *			手機
	 */
	public String getCellphone() {
		return cellphone;
	}

	/**
	 * @param cellphone
	 *			手機
	 */
	public void setCellphone(String Cellphone) {
		this.cellphone = Cellphone;
	}
		/**
	 * @return att_fax
	 *			傳真
	 */
	public String getAtt_fax() {
		return att_fax;
	}

	/**
	 * @param att_fax
	 *			傳真
	 */
	public void setAtt_fax(String Att_fax) {
		this.att_fax = Att_fax;
	}
		/**
	 * @return email
	 *			EMAIL
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email
	 *			EMAIL
	 */
	public void setEmail(String Email) {
		this.email = Email;
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
	
}

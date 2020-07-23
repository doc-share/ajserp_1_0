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
 *  @date Thu Jul 23 13:03:27 CST 2020
 */
@Entity
@Table(name = "acc_dept" ,indexes = { @Index(name = "created", columnList = "created"), 
@Index(name = "updated", columnList = "updated")})
@EntityInfo("部門資料檔")
public class Accdept extends BaseProperties {

	private static final long serialVersionUID = 1L;

	@FieldInfo("部門代號")
	@FilterInfo(ListValue = "")
	@Column(name = "dept_id", length =32  )
	private String dept_id ;

	@FieldInfo("部門名稱")
	@FilterInfo(ListValue = "")
	@Column(name = "dept_name", length =32  )
	private String dept_name ;

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
	public Accdept() {
		super();
	}
	
	/**
	 *
	 * 构造函数
	 *
	 	 * @param dept_id
	 *		  部門代號
	 * 
	 	 * @param dept_name
	 *		  部門名稱
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
    	public Accdept( String dept_id, String dept_name, String tranok, String tranop, Integer trancnt ) {
		super();
				this.dept_id = dept_id;
				this.dept_name = dept_name;
				this.tranok = tranok;
				this.tranop = tranop;
				this.trancnt = trancnt;
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
	 * @return dept_name
	 *			部門名稱
	 */
	public String getDept_name() {
		return dept_name;
	}

	/**
	 * @param dept_name
	 *			部門名稱
	 */
	public void setDept_name(String Dept_name) {
		this.dept_name = Dept_name;
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

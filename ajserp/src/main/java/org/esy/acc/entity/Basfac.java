package org.esy.acc.entity;

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
 *  @date Tue Jun 23 10:59:23 CST 2020
 */
@Entity
@Table(name = "bas_fac" ,indexes = { @Index(name = "created", columnList = "created"), 
@Index(name = "updated", columnList = "updated")})
@EntityInfo("會計介面")
public class Basfac extends BaseProperties {

	private static final long serialVersionUID = 1L;

	@FieldInfo("會計科目")
	@FilterInfo(ListValue = "")
	@Column(name = "acc_id", length =32  )
	private String acc_id ;

	@FieldInfo("科目說明")
	@FilterInfo(ListValue = "")
	@Column(name = "items_desc", length =32  )
	private String items_desc ;

	@FieldInfo("會計部門代號")
	@FilterInfo(ListValue = "")
	@Column(name = "dept_id", length =32  )
	private String dept_id ;

	@FieldInfo("是否轉對象")
	@FilterInfo(ListValue = "")
	@Column(name = "is_tran")
	private boolean is_tran ;


     /**
	 *
	 * 构造函数
	 *
	 */
	public Basfac() {
		super();
	}
	
	/**
	 *
	 * 构造函数
	 *
	 	 * @param acc_id
	 *		  會計科目
	 * 
	 	 * @param items_desc
	 *		  科目說明
	 * 
	 	 * @param dept_id
	 *		  會計部門代號
	 * 
	 	 * @param is_tran
	 *		  是否轉對象
	 * 
	 	 */
    	public Basfac( String acc_id, String items_desc, String dept_id, boolean is_tran ) {
		super();
				this.acc_id = acc_id;
				this.items_desc = items_desc;
				this.dept_id = dept_id;
				this.is_tran = is_tran;
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
	 * @return items_desc
	 *			科目說明
	 */
	public String getItems_desc() {
		return items_desc;
	}

	/**
	 * @param items_desc
	 *			科目說明
	 */
	public void setItems_desc(String Items_desc) {
		this.items_desc = Items_desc;
	}
		/**
	 * @return dept_id
	 *			會計部門代號
	 */
	public String getDept_id() {
		return dept_id;
	}

	/**
	 * @param dept_id
	 *			會計部門代號
	 */
	public void setDept_id(String Dept_id) {
		this.dept_id = Dept_id;
	}
		/**
	 * @return is_tran
	 *			是否轉對象
	 */
	public boolean getIs_tran() {
		return is_tran;
	}

	/**
	 * @param is_tran
	 *			是否轉對象
	 */
	public void setIs_tran(boolean Is_tran) {
		this.is_tran = Is_tran;
	}
	
}

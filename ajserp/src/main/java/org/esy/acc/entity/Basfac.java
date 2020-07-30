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
 *  @date Thu Jul 30 16:55:17 CST 2020
 */
@Entity
@Table(name = "bas_fac" ,indexes = { @Index(name = "created", columnList = "created"), 
@Index(name = "updated", columnList = "updated")})
@EntityInfo("會計介面檔")
public class Basfac extends BaseProperties {

	private static final long serialVersionUID = 1L;

	@FieldInfo("會計科目")
	@FilterInfo(ListValue = "")
	@Column(name = "acc_id", length =32  )
	private String acc_id ;

	@FieldInfo("科目說明")
	@FilterInfo(ListValue = "")
	@Column(name = "itemdesc", length =32  )
	private String itemdesc ;

	@FieldInfo("會計部門代號")
	@FilterInfo(ListValue = "")
	@Column(name = "dept_id", length =32  )
	private String dept_id ;

	@FieldInfo("是否轉對象")
	@FilterInfo(ListValue = "")
	@Column(name = "is_tran")
	private Integer is_tran;

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
	 	 * @param itemdesc
	 *		  科目說明
	 * 
	 	 * @param dept_id
	 *		  會計部門代號
	 * 
	 	 * @param is_tran
	 *		  是否轉對象
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
    	public Basfac( String acc_id, String itemdesc, String dept_id, Integer is_tran, String tranok, String tranop, Integer trancnt ) {
		super();
				this.acc_id = acc_id;
				this.itemdesc = itemdesc;
				this.dept_id = dept_id;
				this.is_tran = is_tran;
				this.tranok = tranok;
				this.tranop = tranop;
				this.trancnt = trancnt;
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
	 * @return itemdesc
	 *			科目說明
	 */
	public String getItemdesc() {
		return itemdesc;
	}

	/**
	 * @param itemdesc
	 *			科目說明
	 */
	public void setItemdesc(String Itemdesc) {
		this.itemdesc = Itemdesc;
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
	public Integer getIs_tran() {
		return is_tran;
	}

	/**
	 * @param is_tran
	 *			是否轉對象
	 */
	public void setIs_tran(Integer Is_tran) {
		this.is_tran = Is_tran;
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

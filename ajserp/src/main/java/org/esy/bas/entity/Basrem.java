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
 *  @date Thu Jul 23 13:51:47 CST 2020
 */
@Entity
@Table(name = "bas_rem" ,indexes = { @Index(name = "created", columnList = "created"), 
@Index(name = "updated", columnList = "updated")})
@EntityInfo("備註主檔")
public class Basrem extends BaseProperties {

	private static final long serialVersionUID = 1L;

	@FieldInfo("備註類別代號")
	@FilterInfo(ListValue = "")
	@Column(name = "type_nbr", length =32  )
	private String type_nbr ;

	@FieldInfo("備註代號")
	@FilterInfo(ListValue = "")
	@Column(name = "rem_nbr", length =32  )
	private String rem_nbr ;

	@FieldInfo("備註說明")
	@FilterInfo(ListValue = "")
	@Column(name = "rem_desc", length =32  )
	private String rem_desc ;

	@FieldInfo("備註明細")
	@FilterInfo(ListValue = "")
	@Column(name = "rem_memo", columnDefinition = "TEXT")
	private String rem_memo;

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
	public Basrem() {
		super();
	}
	
	/**
	 *
	 * 构造函数
	 *
	 	 * @param type_nbr
	 *		  備註類別代號
	 * 
	 	 * @param rem_nbr
	 *		  備註代號
	 * 
	 	 * @param rem_desc
	 *		  備註說明
	 * 
	 	 * @param rem_memo
	 *		  備註明細
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
    	public Basrem( String type_nbr, String rem_nbr, String rem_desc, String rem_memo, String tranok, String tranop, Integer trancnt ) {
		super();
				this.type_nbr = type_nbr;
				this.rem_nbr = rem_nbr;
				this.rem_desc = rem_desc;
				this.rem_memo = rem_memo;
				this.tranok = tranok;
				this.tranop = tranop;
				this.trancnt = trancnt;
			}

		/**
	 * @return type_nbr
	 *			備註類別代號
	 */
	public String getType_nbr() {
		return type_nbr;
	}

	/**
	 * @param type_nbr
	 *			備註類別代號
	 */
	public void setType_nbr(String Type_nbr) {
		this.type_nbr = Type_nbr;
	}
		/**
	 * @return rem_nbr
	 *			備註代號
	 */
	public String getRem_nbr() {
		return rem_nbr;
	}

	/**
	 * @param rem_nbr
	 *			備註代號
	 */
	public void setRem_nbr(String Rem_nbr) {
		this.rem_nbr = Rem_nbr;
	}
		/**
	 * @return rem_desc
	 *			備註說明
	 */
	public String getRem_desc() {
		return rem_desc;
	}

	/**
	 * @param rem_desc
	 *			備註說明
	 */
	public void setRem_desc(String Rem_desc) {
		this.rem_desc = Rem_desc;
	}
		/**
	 * @return rem_memo
	 *			備註明細
	 */
	public String getRem_memo() {
		return rem_memo;
	}

	/**
	 * @param rem_memo
	 *			備註明細
	 */
	public void setRem_memo(String Rem_memo) {
		this.rem_memo = Rem_memo;
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

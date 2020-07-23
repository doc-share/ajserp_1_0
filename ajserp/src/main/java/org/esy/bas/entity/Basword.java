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
 *  @date Thu Jul 23 15:30:37 CST 2020
 */
@Entity
@Table(name = "bas_word" ,indexes = { @Index(name = "created", columnList = "created"), 
@Index(name = "updated", columnList = "updated")})
@EntityInfo("業務性質")
public class Basword extends BaseProperties {

	private static final long serialVersionUID = 1L;

	@FieldInfo("業務類")
	@FilterInfo(ListValue = "")
	@Column(name = "shp_desc", length =128  )
	private String shp_desc ;

	@FieldInfo("選取")
	@FilterInfo(ListValue = "")
	@Column(name = "isedit")
	private Integer isedit;

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
	public Basword() {
		super();
	}
	
	/**
	 *
	 * 构造函数
	 *
	 	 * @param shp_desc
	 *		  業務類
	 * 
	 	 * @param isedit
	 *		  選取
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
    	public Basword( String shp_desc, Integer isedit, String tranok, String tranop, Integer trancnt ) {
		super();
				this.shp_desc = shp_desc;
				this.isedit = isedit;
				this.tranok = tranok;
				this.tranop = tranop;
				this.trancnt = trancnt;
			}

		/**
	 * @return shp_desc
	 *			業務類
	 */
	public String getShp_desc() {
		return shp_desc;
	}

	/**
	 * @param shp_desc
	 *			業務類
	 */
	public void setShp_desc(String Shp_desc) {
		this.shp_desc = Shp_desc;
	}
		/**
	 * @return isedit
	 *			選取
	 */
	public Integer getIsedit() {
		return isedit;
	}

	/**
	 * @param isedit
	 *			選取
	 */
	public void setIsedit(Integer Isedit) {
		this.isedit = Isedit;
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

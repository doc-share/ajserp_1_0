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
 *  @date Fri Jun 19 11:53:17 CST 2020
 */
@Entity
@Table(name = "bas_temp" ,indexes = { @Index(name = "created", columnList = "created"), 
@Index(name = "updated", columnList = "updated")})
@EntityInfo("代墊項目維護")
public class Bastemp extends BaseProperties {

	private static final long serialVersionUID = 1L;

	@FieldInfo("項目代號")
	@FilterInfo(ListValue = "" , LovValue = "match")
	@Column(name = "temp_nbr", length =32  )
	private String temp_nbr ;

	@FieldInfo("項目內容")
	@FilterInfo(ListValue = "match")
	@Column(name = "temp_desc", length =32  )
	private String temp_desc ;


     /**
	 *
	 * 构造函数
	 *
	 */
	public Bastemp() {
		super();
	}
	
	/**
	 *
	 * 构造函数
	 *
	 	 * @param temp_nbr
	 *		  項目代號
	 * 
	 	 * @param temp_desc
	 *		  項目內容
	 * 
	 	 */
    	public Bastemp( String temp_nbr, String temp_desc ) {
		super();
				this.temp_nbr = temp_nbr;
				this.temp_desc = temp_desc;
			}

		/**
	 * @return temp_nbr
	 *			項目代號
	 */
	public String getTemp_nbr() {
		return temp_nbr;
	}

	/**
	 * @param temp_nbr
	 *			項目代號
	 */
	public void setTemp_nbr(String Temp_nbr) {
		this.temp_nbr = Temp_nbr;
	}
		/**
	 * @return temp_desc
	 *			項目內容
	 */
	public String getTemp_desc() {
		return temp_desc;
	}

	/**
	 * @param temp_desc
	 *			項目內容
	 */
	public void setTemp_desc(String Temp_desc) {
		this.temp_desc = Temp_desc;
	}
	
}

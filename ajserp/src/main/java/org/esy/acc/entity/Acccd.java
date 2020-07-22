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
 *  @date Sat Jun 20 08:54:05 CST 2020
 */
@Entity
@Table(name = "acc_cd" ,indexes = { @Index(name = "created", columnList = "created"), 
@Index(name = "updated", columnList = "updated")})
@EntityInfo("會計分類")
public class Acccd extends BaseProperties {

	private static final long serialVersionUID = 1L;

	@FieldInfo("年度")
	@FilterInfo(ListValue = "")
	@Column(name = "year", length =32  )
	private String year ;

	@FieldInfo("分類代號")
	@FilterInfo(ListValue = "")
	@Column(name = "cd_type", length =32  )
	private String cd_type ;

	@FieldInfo("分類名稱")
	@FilterInfo(ListValue = "")
	@Column(name = "cd_desc", length =32  )
	private String cd_desc ;

	@FieldInfo("分類英文名稱")
	@FilterInfo(ListValue = "")
	@Column(name = "eng_desc", length =32  )
	private String eng_desc ;

	@FieldInfo("大分類")
	@FilterInfo(ListValue = "")
	@Column(name = "assy_cd1", length =32  )
	private String assy_cd1 ;

	@FieldInfo("中分類")
	@FilterInfo(ListValue = "")
	@Column(name = "assy_cd2", length =32  )
	private String assy_cd2 ;

	@FieldInfo("借貸別")
	@FilterInfo(ListValue = "")
	@Column(name = "c_or_d", length =32  )
	private String c_or_d ;

	@FieldInfo("分類層別 1.大分類 2.中分類 3.小分類")
	@FilterInfo(ListValue = "")
	@Column(name = "type_class", length =32  )
	private String type_class ;


     /**
	 *
	 * 构造函数
	 *
	 */
	public Acccd() {
		super();
	}
	
	/**
	 *
	 * 构造函数
	 *
	 	 * @param year
	 *		  年度
	 * 
	 	 * @param cd_type
	 *		  分類代號
	 * 
	 	 * @param cd_desc
	 *		  分類名稱
	 * 
	 	 * @param eng_desc
	 *		  分類英文名稱
	 * 
	 	 * @param assy_cd1
	 *		  大分類
	 * 
	 	 * @param assy_cd2
	 *		  中分類
	 * 
	 	 * @param c_or_d
	 *		  借貸別
	 * 
	 	 * @param type_class
	 *		  分類層別 1.大分類 2.中分類 3.小分類
	 * 
	 	 */
    	public Acccd( String year, String cd_type, String cd_desc, String eng_desc, String assy_cd1, String assy_cd2, String c_or_d, String type_class ) {
		super();
				this.year = year;
				this.cd_type = cd_type;
				this.cd_desc = cd_desc;
				this.eng_desc = eng_desc;
				this.assy_cd1 = assy_cd1;
				this.assy_cd2 = assy_cd2;
				this.c_or_d = c_or_d;
				this.type_class = type_class;
			}

		/**
	 * @return year
	 *			年度
	 */
	public String getYear() {
		return year;
	}

	/**
	 * @param year
	 *			年度
	 */
	public void setYear(String Year) {
		this.year = Year;
	}
		/**
	 * @return cd_type
	 *			分類代號
	 */
	public String getCd_type() {
		return cd_type;
	}

	/**
	 * @param cd_type
	 *			分類代號
	 */
	public void setCd_type(String Cd_type) {
		this.cd_type = Cd_type;
	}
		/**
	 * @return cd_desc
	 *			分類名稱
	 */
	public String getCd_desc() {
		return cd_desc;
	}

	/**
	 * @param cd_desc
	 *			分類名稱
	 */
	public void setCd_desc(String Cd_desc) {
		this.cd_desc = Cd_desc;
	}
		/**
	 * @return eng_desc
	 *			分類英文名稱
	 */
	public String getEng_desc() {
		return eng_desc;
	}

	/**
	 * @param eng_desc
	 *			分類英文名稱
	 */
	public void setEng_desc(String Eng_desc) {
		this.eng_desc = Eng_desc;
	}
		/**
	 * @return assy_cd1
	 *			大分類
	 */
	public String getAssy_cd1() {
		return assy_cd1;
	}

	/**
	 * @param assy_cd1
	 *			大分類
	 */
	public void setAssy_cd1(String Assy_cd1) {
		this.assy_cd1 = Assy_cd1;
	}
		/**
	 * @return assy_cd2
	 *			中分類
	 */
	public String getAssy_cd2() {
		return assy_cd2;
	}

	/**
	 * @param assy_cd2
	 *			中分類
	 */
	public void setAssy_cd2(String Assy_cd2) {
		this.assy_cd2 = Assy_cd2;
	}
		/**
	 * @return c_or_d
	 *			借貸別
	 */
	public String getC_or_d() {
		return c_or_d;
	}

	/**
	 * @param c_or_d
	 *			借貸別
	 */
	public void setC_or_d(String C_or_d) {
		this.c_or_d = C_or_d;
	}
		/**
	 * @return type_class
	 *			分類層別 1.大分類 2.中分類 3.小分類
	 */
	public String getType_class() {
		return type_class;
	}

	/**
	 * @param type_class
	 *			分類層別 1.大分類 2.中分類 3.小分類
	 */
	public void setType_class(String Type_class) {
		this.type_class = Type_class;
	}
	
}

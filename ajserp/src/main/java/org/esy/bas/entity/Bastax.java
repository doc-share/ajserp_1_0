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
 *  @date Thu Jul 23 14:17:18 CST 2020
 */
@Entity
@Table(name = "bas_tax" ,indexes = { @Index(name = "created", columnList = "created"), 
@Index(name = "updated", columnList = "updated")})
@EntityInfo("稅別主檔")
public class Bastax extends BaseProperties {

	private static final long serialVersionUID = 1L;

	@FieldInfo("稅別代號")
	@FilterInfo(ListValue = "")
	@Column(name = "tax_type", length =32  )
	private String tax_type ;

	@FieldInfo("稅別說明")
	@FilterInfo(ListValue = "")
	@Column(name = "tax_desc", length =32  )
	private String tax_desc ;

	@FieldInfo("稅率")
	@FilterInfo(ListValue = "")
	@Column(name = "tax_per")
	private Double tax_per;

	@FieldInfo("計算方式")
	@FilterInfo(ListValue = "")
	@Column(name = "tax_log")
	private String tax_log;

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

	@FieldInfo("電子發票稅碼")
	@FilterInfo(ListValue = "")
	@Column(name = "etax_type", length =32  )
	private String etax_type ;


     /**
	 *
	 * 构造函数
	 *
	 */
	public Bastax() {
		super();
	}
	
	/**
	 *
	 * 构造函数
	 *
	 	 * @param tax_type
	 *		  稅別代號
	 * 
	 	 * @param tax_desc
	 *		  稅別說明
	 * 
	 	 * @param tax_per
	 *		  稅率
	 * 
	 	 * @param tax_log
	 *		   1外加  2內稅 3不計算
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
	 	 * @param etax_type
	 *		  電子發票稅碼
	 * 
	 	 */
    	public Bastax( String tax_type, String tax_desc, Double tax_per, String tax_log, String tranok, String tranop, Integer trancnt, String etax_type ) {
		super();
				this.tax_type = tax_type;
				this.tax_desc = tax_desc;
				this.tax_per = tax_per;
				this.tax_log = tax_log;
				this.tranok = tranok;
				this.tranop = tranop;
				this.trancnt = trancnt;
				this.etax_type = etax_type;
			}

		/**
	 * @return tax_type
	 *			稅別代號
	 */
	public String getTax_type() {
		return tax_type;
	}

	/**
	 * @param tax_type
	 *			稅別代號
	 */
	public void setTax_type(String Tax_type) {
		this.tax_type = Tax_type;
	}
		/**
	 * @return tax_desc
	 *			稅別說明
	 */
	public String getTax_desc() {
		return tax_desc;
	}

	/**
	 * @param tax_desc
	 *			稅別說明
	 */
	public void setTax_desc(String Tax_desc) {
		this.tax_desc = Tax_desc;
	}
		/**
	 * @return tax_per
	 *			稅率
	 */
	public Double getTax_per() {
		return tax_per;
	}

	/**
	 * @param tax_per
	 *			稅率
	 */
	public void setTax_per(Double Tax_per) {
		this.tax_per = Tax_per;
	}
		/**
	 * @return tax_log
	 *			 1外加  2內稅 3不計算
	 */
	public String getTax_log() {
		return tax_log;
	}

	/**
	 * @param tax_log
	 *			 1外加  2內稅 3不計算
	 */
	public void setTax_log(String Tax_log) {
		this.tax_log = Tax_log;
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
		/**
	 * @return etax_type
	 *			電子發票稅碼
	 */
	public String getEtax_type() {
		return etax_type;
	}

	/**
	 * @param etax_type
	 *			電子發票稅碼
	 */
	public void setEtax_type(String Etax_type) {
		this.etax_type = Etax_type;
	}
	
}

package org.esy.acr.entity;

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
 *  @date Thu Jul 09 10:45:21 CST 2020
 */
@Entity
@Table(name = "aprn_bah" ,indexes = { @Index(name = "created", columnList = "created"), 
@Index(name = "updated", columnList = "updated")})
@EntityInfo("公費帳單")
public class Aprnbah extends BaseProperties {

	private static final long serialVersionUID = 1L;

	@FieldInfo("帳單編號")
	@FilterInfo(ListValue = "")
	@Column(name = "nbr", length =32  )
	private String nbr ;

	@FieldInfo("組別")
	@FilterInfo(ListValue = "")
	@Column(name = "group_nbr", length =32  )
	private String group_nbr ;

	@FieldInfo("請款月份")
	@FilterInfo(ListValue = "")
	@Column(name = "acr_mon", length =32  )
	private String acr_mon ;

	@FieldInfo("客戶編號")
	@FilterInfo(ListValue = "")
	@Column(name = "cus_nbr", length =32  )
	private String cus_nbr ;

	@FieldInfo("列印日期")
	@FilterInfo(ListValue = "")
	@Column(name = "prn_date")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date prn_date;

	@FieldInfo("請款主旨")
	@FilterInfo(ListValue = "")
	@Column(name = "temp_desc", length =32  )
	private String temp_desc ;

	@FieldInfo("帳單金額")
	@FilterInfo(ListValue = "")
	@Column(name = "amt")
	private Double amt;

	@FieldInfo("狀態")
	@FilterInfo(ListValue = "")
	@Column(name = "status", length =32  )
	private String status ;


     /**
	 *
	 * 构造函数
	 *
	 */
	public Aprnbah() {
		super();
	}
	
	/**
	 *
	 * 构造函数
	 *
	 	 * @param nbr
	 *		  帳單編號
	 * 
	 	 * @param group_nbr
	 *		  組別
	 * 
	 	 * @param acr_mon
	 *		  請款月份
	 * 
	 	 * @param cus_nbr
	 *		  客戶編號
	 * 
	 	 * @param prn_date
	 *		  列印日期
	 * 
	 	 * @param temp_desc
	 *		  請款主旨
	 * 
	 	 * @param amt
	 *		  帳單金額
	 * 
	 	 * @param status
	 *		  狀態
	 * 
	 	 */
    	public Aprnbah( String nbr, String group_nbr, String acr_mon, String cus_nbr, Date prn_date, String temp_desc, Double amt, String status ) {
		super();
				this.nbr = nbr;
				this.group_nbr = group_nbr;
				this.acr_mon = acr_mon;
				this.cus_nbr = cus_nbr;
				this.prn_date = prn_date;
				this.temp_desc = temp_desc;
				this.amt = amt;
				this.status = status;
			}

		/**
	 * @return nbr
	 *			帳單編號
	 */
	public String getNbr() {
		return nbr;
	}

	/**
	 * @param nbr
	 *			帳單編號
	 */
	public void setNbr(String Nbr) {
		this.nbr = Nbr;
	}
		/**
	 * @return group_nbr
	 *			組別
	 */
	public String getGroup_nbr() {
		return group_nbr;
	}

	/**
	 * @param group_nbr
	 *			組別
	 */
	public void setGroup_nbr(String Group_nbr) {
		this.group_nbr = Group_nbr;
	}
		/**
	 * @return acr_mon
	 *			請款月份
	 */
	public String getAcr_mon() {
		return acr_mon;
	}

	/**
	 * @param acr_mon
	 *			請款月份
	 */
	public void setAcr_mon(String Acr_mon) {
		this.acr_mon = Acr_mon;
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
	 * @return prn_date
	 *			列印日期
	 */
	public Date getPrn_date() {
		return prn_date;
	}

	/**
	 * @param prn_date
	 *			列印日期
	 */
	public void setPrn_date(Date Prn_date) {
		this.prn_date = Prn_date;
	}
		/**
	 * @return temp_desc
	 *			請款主旨
	 */
	public String getTemp_desc() {
		return temp_desc;
	}

	/**
	 * @param temp_desc
	 *			請款主旨
	 */
	public void setTemp_desc(String Temp_desc) {
		this.temp_desc = Temp_desc;
	}
		/**
	 * @return amt
	 *			帳單金額
	 */
	public Double getAmt() {
		return amt;
	}

	/**
	 * @param amt
	 *			帳單金額
	 */
	public void setAmt(Double Amt) {
		this.amt = Amt;
	}
		/**
	 * @return status
	 *			狀態
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @param status
	 *			狀態
	 */
	public void setStatus(String Status) {
		this.status = Status;
	}
	
}

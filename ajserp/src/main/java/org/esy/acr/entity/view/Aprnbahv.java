package org.esy.acr.entity.view;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.esy.acr.entity.Aprnbat;
import org.esy.base.annotation.EntityInfo;
import org.esy.base.annotation.FieldInfo;
import org.esy.base.core.BaseProperties;
import org.hibernate.annotations.Subselect;
import org.hibernate.annotations.Synchronize;
import org.esy.base.annotation.FilterInfo;



@Entity
@EntityInfo("公費帳單")
@Table(name ="Aprnbahv")
@Subselect("select a.* from aprn_bah a ")
@Synchronize("aprn_bah")
public class Aprnbahv extends BaseProperties {

	private static final long serialVersionUID = 1L;

	@FieldInfo("帳單編號")
	@FilterInfo(ListValue = "")
	@Column(name = "nbr", length =32  )
	private String nbr ;

	@FieldInfo("組別")
	@FilterInfo(ListValue = "gte,lte", FieldsValue = "group_nbr,group_nbrb")
	@Column(name = "group_nbr", length =32  )
	private String group_nbr ;

	@FieldInfo("請款月份")
	@FilterInfo(ListValue = "")
	@Column(name = "acr_mon", length =32  )
	private String acr_mon ;

	@FieldInfo("客戶編號")
	@FilterInfo(ListValue="gte,lte",FieldsValue="cus_nbr,cus_nbrb") 
	@Column(name = "cus_nbr", length =32  )
	private String cus_nbr ;

	@FieldInfo("列印日期")
	@FilterInfo(ListValue="") 
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
	
	
	@FieldInfo("帳單日期")
	@FilterInfo(ListValue="gte,lte",FieldsValue="date,dateb") 
	@Column(name = "date")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date date;
	
	
	@FieldInfo("帳單日期") //虛擬欄位
	@JsonProperty("dateb") 
	@DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss") 
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date dateb;
	
	@FieldInfo("客戶名稱")  //虛擬欄位
	@Column(name = "cus_alias", length = 64)
	private String cus_alias;
	
	@Transient   //表頭的虛擬欄位要加
	@JsonProperty("group_nbrb")//虛擬欄位
	private String group_nbrb;// shift+alt+s
	
	
	@Transient
	@JsonProperty("cus_nbrb")//虛擬欄位
	private String cus_nbrb;// shift+alt+s
	
	@FieldInfo("合約日期") 
	@Transient 
	@JsonProperty("prn_dateb") //虛擬欄位
	@DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss") 
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date prn_dateb;
	
	@Transient
	@JsonProperty("aprnbats") //宿主
	private List<Aprnbat> aprnbats = new ArrayList<Aprnbat>();
	
	
     public List<Aprnbat> getAprnbats() {
		return aprnbats;
	}

	public void setAprnbats(List<Aprnbat> aprnbats) {
		this.aprnbats = aprnbats;
	}

	/**
	 *
	 * 构造函数
	 *
	 */
	public Aprnbahv() {
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
    	public Aprnbahv( String nbr, String group_nbr, String acr_mon, String cus_nbr, Date prn_date, String temp_desc, Double amt, String status ) {
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

	public String getCus_alias() {
		return cus_alias;
	}

	public void setCus_alias(String cus_alias) {
		this.cus_alias = cus_alias;
	}

	public String getGroup_nbrb() {
		return group_nbrb;
	}

	public void setGroup_nbrb(String group_nbrb) {
		this.group_nbrb = group_nbrb;
	}

	public String getCus_nbrb() {
		return cus_nbrb;
	}

	public void setCus_nbrb(String cus_nbrb) {
		this.cus_nbrb = cus_nbrb;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Date getDateb() {
		return dateb;
	}

	public void setDateb(Date dateb) {
		this.dateb = dateb;
	}


	
}

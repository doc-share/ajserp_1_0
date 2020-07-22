package org.esy.ord.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Index;
import javax.persistence.Table;

import org.esy.base.annotation.EntityInfo;
import org.esy.base.annotation.FieldInfo;
import org.esy.base.annotation.FilterInfo;
import org.esy.base.core.BaseProperties;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * 实体类
 * 
 * @author <a href="mailto:ardui@163.com"ardui</a
 * @date Tue Jun 23 11:11:27 CST 2020
 */
@Entity
@Table(name = "cont_acr", indexes = { @Index(name = "created", columnList = "created"),
		@Index(name = "updated", columnList = "updated") })
@EntityInfo("合約明細")
public class Contacr extends BaseProperties {

	private static final long serialVersionUID = 1L;

	@FieldInfo("表头uid")
	@FilterInfo(ListValue = "eq")
	@Column(name = "huid", length = 32)
	private String huid;

	@FieldInfo("合約編號")
	@FilterInfo(ListValue = "eq")
	@Column(name = "nbr", length = 32)
	private String nbr;

	@FieldInfo("序號")
	@FilterInfo(ListValue = "")
	@Column(name = "seq", length = 32)
	private String seq;

	@FieldInfo("連結")
	@FilterInfo(ListValue = "")
	@Column(name = "ioseq", length = 32)
	private String ioseq;

	@FieldInfo("結帳月份")
	@FilterInfo(ListValue = "")
	@Column(name = "acr_mon")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private String acr_mon;

	@FieldInfo("客戶編號")
	@FilterInfo(ListValue = "")
	@Column(name = "cus_nbr", length = 32)
	private String cus_nbr;

	@FieldInfo("請款內容")
	@FilterInfo(ListValue = "")
	@Column(name = "items_desc", length = 32)
	private String items_desc;

	@FieldInfo("帳單編號")
	@FilterInfo(ListValue = "")
	@Column(name = "pi_nbr", length = 32)
	private String pi_nbr;

	@FieldInfo("請款金額")
	@FilterInfo(ListValue = "")
	@Column(name = "amt")
	private Double amt;

	@FieldInfo("收款金額")
	@FilterInfo(ListValue = "")
	@Column(name = "rec_amt")
	private Double rec_amt;

	@FieldInfo("狀態")
	@FilterInfo(ListValue = "")
	@Column(name = "status", length = 32)
	private String status;

	/**
	 *
	 * 构造函数
	 *
	 */
	public Contacr() {
		super();
	}

	/**
	 *
	 * 构造函数
	 *
	 * @param nbr
	 *            合約編號
	 * 
	 * @param seq
	 *            序號
	 * 
	 * @param ioseq
	 *            連結
	 * 
	 * @param acr_mon
	 *            結帳月份
	 * 
	 * @param cus_nbr
	 *            客戶編號
	 * 
	 * @param items_desc
	 *            請款內容
	 * 
	 * @param pi_nbr
	 *            帳單編號
	 * 
	 * @param amt
	 *            請款金額
	 * 
	 * @param rec_amt
	 *            收款金額
	 * 
	 * @param status
	 *            狀態
	 * 
	 */
	public Contacr(String nbr, String seq, String ioseq, String acr_mon, String cus_nbr, String items_desc, String pi_nbr,
			Double amt, Double rec_amt, String status) {
		super();
		this.nbr = nbr;
		this.seq = seq;
		this.ioseq = ioseq;
		this.acr_mon = acr_mon;
		this.cus_nbr = cus_nbr;
		this.items_desc = items_desc;
		this.pi_nbr = pi_nbr;
		this.amt = amt;
		this.rec_amt = rec_amt;
		this.status = status;
	}

	public Contacr(String uid) {
		this.huid = uid;
	}

	/**
	 * @return nbr 合約編號
	 */
	public String getNbr() {
		return nbr;
	}

	/**
	 * @param nbr
	 *            合約編號
	 */
	public void setNbr(String Nbr) {
		this.nbr = Nbr;
	}

	/**
	 * @return seq 序號
	 */
	public String getSeq() {
		return seq;
	}

	/**
	 * @param seq
	 *            序號
	 */
	public void setSeq(String Seq) {
		this.seq = Seq;
	}

	/**
	 * @return ioseq 連結
	 */
	public String getIoseq() {
		return ioseq;
	}

	/**
	 * @param ioseq
	 *            連結
	 */
	public void setIoseq(String Ioseq) {
		this.ioseq = Ioseq;
	}

	/**
	 * @return acr_mon 結帳月份
	 */
	public String getAcr_mon() {
		return acr_mon;
	}

	/**
	 * @param acr_mon
	 *            結帳月份
	 */
	public void setAcr_mon(String Acr_mon) {
		this.acr_mon = Acr_mon;
	}

	/**
	 * @return cus_nbr 客戶編號
	 */
	public String getCus_nbr() {
		return cus_nbr;
	}

	/**
	 * @param cus_nbr
	 *            客戶編號
	 */
	public void setCus_nbr(String Cus_nbr) {
		this.cus_nbr = Cus_nbr;
	}

	/**
	 * @return items_desc 請款內容
	 */
	public String getItems_desc() {
		return items_desc;
	}

	/**
	 * @param items_desc
	 *            請款內容
	 */
	public void setItems_desc(String Items_desc) {
		this.items_desc = Items_desc;
	}

	/**
	 * @return pi_nbr 帳單編號
	 */
	public String getPi_nbr() {
		return pi_nbr;
	}

	/**
	 * @param pi_nbr
	 *            帳單編號
	 */
	public void setPi_nbr(String Pi_nbr) {
		this.pi_nbr = Pi_nbr;
	}

	/**
	 * @return amt 請款金額
	 */
	public Double getAmt() {
		return amt;
	}

	/**
	 * @param amt
	 *            請款金額
	 */
	public void setAmt(Double Amt) {
		this.amt = Amt;
	}

	/**
	 * @return rec_amt 收款金額
	 */
	public Double getRec_amt() {
		return rec_amt;
	}

	/**
	 * @param rec_amt
	 *            收款金額
	 */
	public void setRec_amt(Double Rec_amt) {
		this.rec_amt = Rec_amt;
	}

	/**
	 * @return status 狀態
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @param status
	 *            狀態
	 */
	public void setStatus(String Status) {
		this.status = Status;
	}

	public String getHuid() {
		return huid;
	}

	public void setHuid(String huid) {
		this.huid = huid;
	}

}

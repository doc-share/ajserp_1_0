package org.esy.acr.entity;

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
 *  @date Fri Jun 19 16:20:53 CST 2020
 */
@Entity
@Table(name = "temp_bat" ,indexes = { @Index(name = "created", columnList = "created"), 
@Index(name = "updated", columnList = "updated")})
@EntityInfo("代墊款登入")
public class Tempbat extends BaseProperties {

	private static final long serialVersionUID = 1L;

	@FieldInfo("表頭uid")
	@FilterInfo(ListValue = "eq")
	@Column(name = "huid", length = 32)
	private String huid;
	
	@FieldInfo("請款月份")
	@FilterInfo(ListValue = "")
	@Column(name = "acr_mon", length =32  )
	private String acr_mon ;

	@FieldInfo("合約編號")
	@FilterInfo(ListValue = "")
	@Column(name = "nbr", length =32  )
	private String nbr ;

	@FieldInfo("客戶編號")
	@FilterInfo(ListValue = "")
	@Column(name = "cus_nbr", length =32  )
	private String cus_nbr ;

	@FieldInfo("序號")
	@FilterInfo(ListValue = "")
	@Column(name = "seq", length =32  )
	private String seq ;

	@FieldInfo("存檔序")
	@FilterInfo(ListValue = "")
	@Column(name = "ioseq", length =32  )
	private String ioseq ;

	@FieldInfo("項目編號")
	@FilterInfo(ListValue = "")
	@Column(name = "temp_nbr", length =32  )
	private String temp_nbr ;

	@FieldInfo("內容")
	@FilterInfo(ListValue = "")
	@Column(name = "temp_desc", length =32  )
	private String temp_desc ;

	@FieldInfo("金額")
	@FilterInfo(ListValue = "")
	@Column(name = "amt", length =32  )
	private String amt ;

	@FieldInfo("已沖款金額")
	@FilterInfo(ListValue = "")
	@Column(name = "rec_amt", length =32  )
	private String rec_amt ;

	@FieldInfo("狀態")
	@FilterInfo(ListValue = "")
	@Column(name = "status", length =32  )
	private String status ;


     /**
	 *
	 * 构造函数
	 *
	 */
	public Tempbat() {
		super();
	}
	
	/**
	 *
	 * 构造函数
	 *
	 	 * @param acr_mon
	 *		  請款月份
	 * 
	 	 * @param nbr
	 *		  合約編號
	 * 
	 	 * @param cus_nbr
	 *		  客戶編號
	 * 
	 	 * @param seq
	 *		  序號
	 * 
	 	 * @param ioseq
	 *		  存檔序
	 * 
	 	 * @param temp_nbr
	 *		  項目編號
	 * 
	 	 * @param temp_desc
	 *		  內容
	 * 
	 	 * @param amt
	 *		  金額
	 * 
	 	 * @param rec_amt
	 *		  已沖款金額
	 * 
	 	 * @param status
	 *		  狀態
	 * 
	 	 */
    	public Tempbat( String acr_mon, String nbr, String cus_nbr, String seq, String ioseq, String temp_nbr, String temp_desc, String amt, String rec_amt, String status ) {
		super();
				this.acr_mon = acr_mon;
				this.nbr = nbr;
				this.cus_nbr = cus_nbr;
				this.seq = seq;
				this.ioseq = ioseq;
				this.temp_nbr = temp_nbr;
				this.temp_desc = temp_desc;
				this.amt = amt;
				this.rec_amt = rec_amt;
				this.status = status;
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
	 * @return nbr
	 *			合約編號
	 */
	public String getNbr() {
		return nbr;
	}

	/**
	 * @param nbr
	 *			合約編號
	 */
	public void setNbr(String Nbr) {
		this.nbr = Nbr;
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
	 * @return seq
	 *			序號
	 */
	public String getSeq() {
		return seq;
	}

	/**
	 * @param seq
	 *			序號
	 */
	public void setSeq(String Seq) {
		this.seq = Seq;
	}
		/**
	 * @return ioseq
	 *			存檔序
	 */
	public String getIoseq() {
		return ioseq;
	}

	/**
	 * @param ioseq
	 *			存檔序
	 */
	public void setIoseq(String Ioseq) {
		this.ioseq = Ioseq;
	}
		/**
	 * @return temp_nbr
	 *			項目編號
	 */
	public String getTemp_nbr() {
		return temp_nbr;
	}

	/**
	 * @param temp_nbr
	 *			項目編號
	 */
	public void setTemp_nbr(String Temp_nbr) {
		this.temp_nbr = Temp_nbr;
	}
		/**
	 * @return temp_desc
	 *			內容
	 */
	public String getTemp_desc() {
		return temp_desc;
	}

	/**
	 * @param temp_desc
	 *			內容
	 */
	public void setTemp_desc(String Temp_desc) {
		this.temp_desc = Temp_desc;
	}
		/**
	 * @return amt
	 *			金額
	 */
	public String getAmt() {
		return amt;
	}

	/**
	 * @param amt
	 *			金額
	 */
	public void setAmt(String Amt) {
		this.amt = Amt;
	}
		/**
	 * @return rec_amt
	 *			已沖款金額
	 */
	public String getRec_amt() {
		return rec_amt;
	}

	/**
	 * @param rec_amt
	 *			已沖款金額
	 */
	public void setRec_amt(String Rec_amt) {
		this.rec_amt = Rec_amt;
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

	public String getHuid() {
		return huid;
	}

	public void setHuid(String huid) {
		this.huid = huid;
	}
	
}

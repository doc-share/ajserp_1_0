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
 *  @date Tue Jun 23 11:02:07 CST 2020
 */
@Entity
@Table(name = "aprn_bat" ,indexes = { @Index(name = "created", columnList = "created"), 
@Index(name = "updated", columnList = "updated")})
@EntityInfo("帳單明細")
public class Aprnbat extends BaseProperties {

	private static final long serialVersionUID = 1L;

	@FieldInfo("表頭uid")
	@FilterInfo(ListValue = "eq")
	@Column(name = "huid", length = 32)
	private String huid;
	
	@FieldInfo("帳單編號")
	@FilterInfo(ListValue = "")
	@Column(name = "nbr", length =32  )
	private String nbr ;

	@FieldInfo("合約編號")
	@FilterInfo(ListValue = "")
	@Column(name = "coin_nbr", length =32  )
	private String coin_nbr ;

	@FieldInfo("沖款之單據檔名")
	@FilterInfo(ListValue = "")
	@Column(name = "s_dbf", length =32  )
	private String s_dbf ;

	@FieldInfo("沖款之單據號碼")
	@FilterInfo(ListValue = "")
	@Column(name = "s_nbr", length =32  )
	private String s_nbr ;

	@FieldInfo("交易序")
	@FilterInfo(ListValue = "")
	@Column(name = "ioseq", length =32  )
	private String ioseq ;

	@FieldInfo("客戶編號")
	@FilterInfo(ListValue = "")
	@Column(name = "cus_nbr", length =32  )
	private String cus_nbr ;

	@FieldInfo("內容")
	@FilterInfo(ListValue = "")
	@Column(name = "items_desc", length =32  )
	private String items_desc ;

	@FieldInfo("結帳月份")
	@FilterInfo(ListValue = "")
	@Column(name = "acr_mon", length =32  )
	private String acr_mon ;

	@FieldInfo("未收金額")
	@FilterInfo(ListValue = "")
	@Column(name = "acr_amt")
	private Double acr_amt;


     /**
	 *
	 * 构造函数
	 *
	 */
	public Aprnbat() {
		super();
	}
	
	/**
	 *
	 * 构造函数
	 *
	 	 * @param nbr
	 *		  帳單編號
	 * 
	 	 * @param coin_nbr
	 *		  合約編號
	 * 
	 	 * @param s_dbf
	 *		  沖款之單據檔名
	 * 
	 	 * @param s_nbr
	 *		  沖款之單據號碼
	 * 
	 	 * @param ioseq
	 *		  交易序
	 * 
	 	 * @param cus_nbr
	 *		  客戶編號
	 * 
	 	 * @param items_desc
	 *		  內容
	 * 
	 	 * @param acr_mon
	 *		  結帳月份
	 * 
	 	 * @param acr_amt
	 *		  未收金額
	 * 
	 	 */
    	public Aprnbat( String nbr, String coin_nbr, String s_dbf, String s_nbr, String ioseq, String cus_nbr, String items_desc, String acr_mon, Double acr_amt ) {
		super();
				this.nbr = nbr;
				this.coin_nbr = coin_nbr;
				this.s_dbf = s_dbf;
				this.s_nbr = s_nbr;
				this.ioseq = ioseq;
				this.cus_nbr = cus_nbr;
				this.items_desc = items_desc;
				this.acr_mon = acr_mon;
				this.acr_amt = acr_amt;
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
	 * @return coin_nbr
	 *			合約編號
	 */
	public String getCoin_nbr() {
		return coin_nbr;
	}

	/**
	 * @param coin_nbr
	 *			合約編號
	 */
	public void setCoin_nbr(String Coin_nbr) {
		this.coin_nbr = Coin_nbr;
	}
		/**
	 * @return s_dbf
	 *			沖款之單據檔名
	 */
	public String getS_dbf() {
		return s_dbf;
	}

	/**
	 * @param s_dbf
	 *			沖款之單據檔名
	 */
	public void setS_dbf(String S_dbf) {
		this.s_dbf = S_dbf;
	}
		/**
	 * @return s_nbr
	 *			沖款之單據號碼
	 */
	public String getS_nbr() {
		return s_nbr;
	}

	/**
	 * @param s_nbr
	 *			沖款之單據號碼
	 */
	public void setS_nbr(String S_nbr) {
		this.s_nbr = S_nbr;
	}
		/**
	 * @return ioseq
	 *			交易序
	 */
	public String getIoseq() {
		return ioseq;
	}

	/**
	 * @param ioseq
	 *			交易序
	 */
	public void setIoseq(String Ioseq) {
		this.ioseq = Ioseq;
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
	 * @return items_desc
	 *			內容
	 */
	public String getItems_desc() {
		return items_desc;
	}

	/**
	 * @param items_desc
	 *			內容
	 */
	public void setItems_desc(String Items_desc) {
		this.items_desc = Items_desc;
	}
		/**
	 * @return acr_mon
	 *			結帳月份
	 */
	public String getAcr_mon() {
		return acr_mon;
	}

	/**
	 * @param acr_mon
	 *			結帳月份
	 */
	public void setAcr_mon(String Acr_mon) {
		this.acr_mon = Acr_mon;
	}
		/**
	 * @return acr_amt
	 *			未收金額
	 */
	public Double getAcr_amt() {
		return acr_amt;
	}

	/**
	 * @param acr_amt
	 *			未收金額
	 */
	public void setAcr_amt(Double Acr_amt) {
		this.acr_amt = Acr_amt;
	}

	public String getHuid() {
		return huid;
	}

	public void setHuid(String huid) {
		this.huid = huid;
	}
	
}

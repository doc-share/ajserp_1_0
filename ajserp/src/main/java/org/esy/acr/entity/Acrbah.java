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
 *  @date Fri Jun 19 16:52:53 CST 2020
 */
@Entity
@Table(name = "acr_bah" ,indexes = { @Index(name = "created", columnList = "created"), 
@Index(name = "updated", columnList = "updated")})
@EntityInfo("收款單")
public class Acrbah extends BaseProperties {

	private static final long serialVersionUID = 1L;

	@FieldInfo("收款單代號")
	@FilterInfo(ListValue = "")
	@Column(name = "nbr", length =32  )
	private String nbr ;

	@FieldInfo("會計傳票")
	@FilterInfo(ListValue = "")
	@Column(name = "acc_nbr", length =32  )
	private String acc_nbr ;

	@FieldInfo("結帳月份")
	@FilterInfo(ListValue = "")
	@Column(name = "acr_mon", length =32  )
	private String acr_mon ;

	@FieldInfo("收款日期")
	@FilterInfo(ListValue = "")
	@Column(name = "date")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date date;

	@FieldInfo("客戶代號")
	@FilterInfo(ListValue = "")
	@Column(name = "cus_nbr", length =32  )
	private String cus_nbr ;

	@FieldInfo("業務員代號")
	@FilterInfo(ListValue = "")
	@Column(name = "sale_nbr", length =32  )
	private String sale_nbr ;

	@FieldInfo("現金收款")
	@FilterInfo(ListValue = "")
	@Column(name = "cash_amt")
	private Double cash_amt;

	@FieldInfo("代扣稅額")
	@FilterInfo(ListValue = "")
	@Column(name = "tax_amt")
	private Double tax_amt;

	@FieldInfo("票據收款")
	@FilterInfo(ListValue = "")
	@Column(name = "chk_amt")
	private Double chk_amt;

	@FieldInfo("折讓")
	@FilterInfo(ListValue = "")
	@Column(name = "cut_amt")
	private Double cut_amt;

	@FieldInfo("折讓")
	@FilterInfo(ListValue = "")
	@Column(name = "remi_amt")
	private Double remi_amt;

	@FieldInfo("其他金額")
	@FilterInfo(ListValue = "")
	@Column(name = "other_amt")
	private Double other_amt;

	@FieldInfo("取用預收之金額")
	@FilterInfo(ListValue = "")
	@Column(name = "post_amt")
	private Double post_amt;

	@FieldInfo("計入預收金額")
	@FilterInfo(ListValue = "")
	@Column(name = "pre_amt")
	private Double pre_amt;

	@FieldInfo("可用沖款金額")
	@FilterInfo(ListValue = "")
	@Column(name = "tot_amt")
	private Double tot_amt;

	@FieldInfo("實際沖款金額")
	@FilterInfo(ListValue = "")
	@Column(name = "wait_amt")
	private Double wait_amt;

	@FieldInfo("狀態")
	@FilterInfo(ListValue = "")
	@Column(name = "status", length =32  )
	private String status ;

	@FieldInfo("本期應收")
	@FilterInfo(ListValue = "")
	@Column(name = "tot_acr")
	private Double tot_acr;

	@FieldInfo("上期預收")
	@FilterInfo(ListValue = "")
	@Column(name = "opre_amt")
	private Double opre_amt;

	@FieldInfo("累計應收")
	@FilterInfo(ListValue = "")
	@Column(name = "aft_amt")
	private Double aft_amt;


     /**
	 *
	 * 构造函数
	 *
	 */
	public Acrbah() {
		super();
	}
	
	/**
	 *
	 * 构造函数
	 *
	 	 * @param nbr
	 *		  收款單代號
	 * 
	 	 * @param acc_nbr
	 *		  會計傳票
	 * 
	 	 * @param acr_mon
	 *		  結帳月份
	 * 
	 	 * @param date
	 *		  收款日期
	 * 
	 	 * @param cus_nbr
	 *		  客戶代號
	 * 
	 	 * @param sale_nbr
	 *		  業務員代號
	 * 
	 	 * @param cash_amt
	 *		  現金收款
	 * 
	 	 * @param tax_amt
	 *		  代扣稅額
	 * 
	 	 * @param chk_amt
	 *		  票據收款
	 * 
	 	 * @param cut_amt
	 *		  折讓
	 * 
	 	 * @param remi_amt
	 *		  折讓
	 * 
	 	 * @param other_amt
	 *		  其他金額
	 * 
	 	 * @param post_amt
	 *		  取用預收之金額
	 * 
	 	 * @param pre_amt
	 *		  計入預收金額
	 * 
	 	 * @param tot_amt
	 *		  可用沖款金額
	 * 
	 	 * @param wait_amt
	 *		  實際沖款金額
	 * 
	 	 * @param status
	 *		  狀態
	 * 
	 	 * @param tot_acr
	 *		  本期應收
	 * 
	 	 * @param opre_amt
	 *		  上期預收
	 * 
	 	 * @param aft_amt
	 *		  累計應收
	 * 
	 	 */
    	public Acrbah( String nbr, String acc_nbr, String acr_mon, Date date, String cus_nbr, String sale_nbr, Double cash_amt, Double tax_amt, Double chk_amt, Double cut_amt, Double remi_amt, Double other_amt, Double post_amt, Double pre_amt, Double tot_amt, Double wait_amt, String status, Double tot_acr, Double opre_amt, Double aft_amt ) {
		super();
				this.nbr = nbr;
				this.acc_nbr = acc_nbr;
				this.acr_mon = acr_mon;
				this.date = date;
				this.cus_nbr = cus_nbr;
				this.sale_nbr = sale_nbr;
				this.cash_amt = cash_amt;
				this.tax_amt = tax_amt;
				this.chk_amt = chk_amt;
				this.cut_amt = cut_amt;
				this.remi_amt = remi_amt;
				this.other_amt = other_amt;
				this.post_amt = post_amt;
				this.pre_amt = pre_amt;
				this.tot_amt = tot_amt;
				this.wait_amt = wait_amt;
				this.status = status;
				this.tot_acr = tot_acr;
				this.opre_amt = opre_amt;
				this.aft_amt = aft_amt;
			}

		/**
	 * @return nbr
	 *			收款單代號
	 */
	public String getNbr() {
		return nbr;
	}

	/**
	 * @param nbr
	 *			收款單代號
	 */
	public void setNbr(String Nbr) {
		this.nbr = Nbr;
	}
		/**
	 * @return acc_nbr
	 *			會計傳票
	 */
	public String getAcc_nbr() {
		return acc_nbr;
	}

	/**
	 * @param acc_nbr
	 *			會計傳票
	 */
	public void setAcc_nbr(String Acc_nbr) {
		this.acc_nbr = Acc_nbr;
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
	 * @return date
	 *			收款日期
	 */
	public Date getDate() {
		return date;
	}

	/**
	 * @param date
	 *			收款日期
	 */
	public void setDate(Date Date) {
		this.date = Date;
	}
		/**
	 * @return cus_nbr
	 *			客戶代號
	 */
	public String getCus_nbr() {
		return cus_nbr;
	}

	/**
	 * @param cus_nbr
	 *			客戶代號
	 */
	public void setCus_nbr(String Cus_nbr) {
		this.cus_nbr = Cus_nbr;
	}
		/**
	 * @return sale_nbr
	 *			業務員代號
	 */
	public String getSale_nbr() {
		return sale_nbr;
	}

	/**
	 * @param sale_nbr
	 *			業務員代號
	 */
	public void setSale_nbr(String Sale_nbr) {
		this.sale_nbr = Sale_nbr;
	}
		/**
	 * @return cash_amt
	 *			現金收款
	 */
	public Double getCash_amt() {
		return cash_amt;
	}

	/**
	 * @param cash_amt
	 *			現金收款
	 */
	public void setCash_amt(Double Cash_amt) {
		this.cash_amt = Cash_amt;
	}
		/**
	 * @return tax_amt
	 *			代扣稅額
	 */
	public Double getTax_amt() {
		return tax_amt;
	}

	/**
	 * @param tax_amt
	 *			代扣稅額
	 */
	public void setTax_amt(Double Tax_amt) {
		this.tax_amt = Tax_amt;
	}
		/**
	 * @return chk_amt
	 *			票據收款
	 */
	public Double getChk_amt() {
		return chk_amt;
	}

	/**
	 * @param chk_amt
	 *			票據收款
	 */
	public void setChk_amt(Double Chk_amt) {
		this.chk_amt = Chk_amt;
	}
		/**
	 * @return cut_amt
	 *			折讓
	 */
	public Double getCut_amt() {
		return cut_amt;
	}

	/**
	 * @param cut_amt
	 *			折讓
	 */
	public void setCut_amt(Double Cut_amt) {
		this.cut_amt = Cut_amt;
	}
		/**
	 * @return remi_amt
	 *			折讓
	 */
	public Double getRemi_amt() {
		return remi_amt;
	}

	/**
	 * @param remi_amt
	 *			折讓
	 */
	public void setRemi_amt(Double Remi_amt) {
		this.remi_amt = Remi_amt;
	}
		/**
	 * @return other_amt
	 *			其他金額
	 */
	public Double getOther_amt() {
		return other_amt;
	}

	/**
	 * @param other_amt
	 *			其他金額
	 */
	public void setOther_amt(Double Other_amt) {
		this.other_amt = Other_amt;
	}
		/**
	 * @return post_amt
	 *			取用預收之金額
	 */
	public Double getPost_amt() {
		return post_amt;
	}

	/**
	 * @param post_amt
	 *			取用預收之金額
	 */
	public void setPost_amt(Double Post_amt) {
		this.post_amt = Post_amt;
	}
		/**
	 * @return pre_amt
	 *			計入預收金額
	 */
	public Double getPre_amt() {
		return pre_amt;
	}

	/**
	 * @param pre_amt
	 *			計入預收金額
	 */
	public void setPre_amt(Double Pre_amt) {
		this.pre_amt = Pre_amt;
	}
		/**
	 * @return tot_amt
	 *			可用沖款金額
	 */
	public Double getTot_amt() {
		return tot_amt;
	}

	/**
	 * @param tot_amt
	 *			可用沖款金額
	 */
	public void setTot_amt(Double Tot_amt) {
		this.tot_amt = Tot_amt;
	}
		/**
	 * @return wait_amt
	 *			實際沖款金額
	 */
	public Double getWait_amt() {
		return wait_amt;
	}

	/**
	 * @param wait_amt
	 *			實際沖款金額
	 */
	public void setWait_amt(Double Wait_amt) {
		this.wait_amt = Wait_amt;
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
		/**
	 * @return tot_acr
	 *			本期應收
	 */
	public Double getTot_acr() {
		return tot_acr;
	}

	/**
	 * @param tot_acr
	 *			本期應收
	 */
	public void setTot_acr(Double Tot_acr) {
		this.tot_acr = Tot_acr;
	}
		/**
	 * @return opre_amt
	 *			上期預收
	 */
	public Double getOpre_amt() {
		return opre_amt;
	}

	/**
	 * @param opre_amt
	 *			上期預收
	 */
	public void setOpre_amt(Double Opre_amt) {
		this.opre_amt = Opre_amt;
	}
		/**
	 * @return aft_amt
	 *			累計應收
	 */
	public Double getAft_amt() {
		return aft_amt;
	}

	/**
	 * @param aft_amt
	 *			累計應收
	 */
	public void setAft_amt(Double Aft_amt) {
		this.aft_amt = Aft_amt;
	}
	
}

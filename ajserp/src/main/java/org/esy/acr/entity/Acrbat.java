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
 *  @date Sat Jun 20 09:44:17 CST 2020
 */
@Entity
@Table(name = "acr_bat" ,indexes = { @Index(name = "created", columnList = "created"), 
@Index(name = "updated", columnList = "updated")})
@EntityInfo("收款單明細")
public class Acrbat extends BaseProperties {

	private static final long serialVersionUID = 1L;

	@FieldInfo("表頭uid")
	@FilterInfo(ListValue = "eq")
	@Column(name = "huid", length = 32)
	private String huid;
	
	@FieldInfo("收款單代號")
	@FilterInfo(ListValue = "")
	@Column(name = "nbr", length =32  )
	private String nbr ;

	@FieldInfo("序號")
	@FilterInfo(ListValue = "")
	@Column(name = "seq", length =32  )
	private String seq ;

	@FieldInfo("庫存交易序")
	@FilterInfo(ListValue = "")
	@Column(name = "ioseq", length =32  )
	private String ioseq ;

	@FieldInfo("交易級別")
	@FilterInfo(ListValue = "")
	@Column(name = "acr_class", length =32  )
	private String acr_class ;

	@FieldInfo("應收金額")
	@FilterInfo(ListValue = "")
	@Column(name = "ar_amt")
	private Double ar_amt;

	@FieldInfo("備註")
	@FilterInfo(ListValue = "")
	@Column(name = "remark", length =32  )
	private String remark ;

	@FieldInfo("現金/票據登入編號")
	@FilterInfo(ListValue = "")
	@Column(name = "io_nbr", length =32  )
	private String io_nbr ;

	@FieldInfo("票據到期日")
	@FilterInfo(ListValue = "")
	@Column(name = "chk_date")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date chk_date;

	@FieldInfo("支票號碼")
	@FilterInfo(ListValue = "")
	@Column(name = "chk_no", length =32  )
	private String chk_no ;

	@FieldInfo("銀行代號")
	@FilterInfo(ListValue = "")
	@Column(name = "b_nbr", length =32  )
	private String b_nbr ;

	@FieldInfo("付款行庫")
	@FilterInfo(ListValue = "")
	@Column(name = "pay_bank", length =32  )
	private String pay_bank ;

	@FieldInfo("發票人帳號")
	@FilterInfo(ListValue = "")
	@Column(name = "pay_code", length =32  )
	private String pay_code ;

	@FieldInfo("是否可修改")
	@FilterInfo(ListValue = "")
	@Column(name = "cannot", length =32  )
	private String cannot ;

	@FieldInfo("是否轉票存")
	@FilterInfo(ListValue = "")
	@Column(name = "ret_chk", length =32  )
	private String ret_chk ;

	@FieldInfo("參考號")
	@FilterInfo(ListValue = "")
	@Column(name = "acr_nbr", length =32  )
	private String acr_nbr ;


     /**
	 *
	 * 构造函数
	 *
	 */
	public Acrbat() {
		super();
	}
	
	/**
	 *
	 * 构造函数
	 *
	 	 * @param nbr
	 *		  收款單代號
	 * 
	 	 * @param seq
	 *		  序號
	 * 
	 	 * @param ioseq
	 *		  庫存交易序
	 * 
	 	 * @param acr_class
	 *		  交易級別
	 * 
	 	 * @param ar_amt
	 *		  應收金額
	 * 
	 	 * @param remark
	 *		  備註
	 * 
	 	 * @param io_nbr
	 *		  現金/票據登入編號
	 * 
	 	 * @param chk_date
	 *		  票據到期日
	 * 
	 	 * @param chk_no
	 *		  支票號碼
	 * 
	 	 * @param b_nbr
	 *		  銀行代號
	 * 
	 	 * @param pay_bank
	 *		  付款行庫
	 * 
	 	 * @param pay_code
	 *		  發票人帳號
	 * 
	 	 * @param cannot
	 *		  是否可修改
	 * 
	 	 * @param ret_chk
	 *		  是否轉票存
	 * 
	 	 * @param acr_nbr
	 *		  參考號
	 * 
	 	 */
    	public Acrbat( String nbr, String seq, String ioseq, String acr_class, Double ar_amt, String remark, String io_nbr, Date chk_date, String chk_no, String b_nbr, String pay_bank, String pay_code, String cannot, String ret_chk, String acr_nbr ) {
		super();
				this.nbr = nbr;
				this.seq = seq;
				this.ioseq = ioseq;
				this.acr_class = acr_class;
				this.ar_amt = ar_amt;
				this.remark = remark;
				this.io_nbr = io_nbr;
				this.chk_date = chk_date;
				this.chk_no = chk_no;
				this.b_nbr = b_nbr;
				this.pay_bank = pay_bank;
				this.pay_code = pay_code;
				this.cannot = cannot;
				this.ret_chk = ret_chk;
				this.acr_nbr = acr_nbr;
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
	 *			庫存交易序
	 */
	public String getIoseq() {
		return ioseq;
	}

	/**
	 * @param ioseq
	 *			庫存交易序
	 */
	public void setIoseq(String Ioseq) {
		this.ioseq = Ioseq;
	}
		/**
	 * @return acr_class
	 *			交易級別
	 */
	public String getAcr_class() {
		return acr_class;
	}

	/**
	 * @param acr_class
	 *			交易級別
	 */
	public void setAcr_class(String Acr_class) {
		this.acr_class = Acr_class;
	}
		/**
	 * @return ar_amt
	 *			應收金額
	 */
	public Double getAr_amt() {
		return ar_amt;
	}

	/**
	 * @param ar_amt
	 *			應收金額
	 */
	public void setAr_amt(Double Ar_amt) {
		this.ar_amt = Ar_amt;
	}
		/**
	 * @return remark
	 *			備註
	 */
	public String getRemark() {
		return remark;
	}

	/**
	 * @param remark
	 *			備註
	 */
	public void setRemark(String Remark) {
		this.remark = Remark;
	}
		/**
	 * @return io_nbr
	 *			現金/票據登入編號
	 */
	public String getIo_nbr() {
		return io_nbr;
	}

	/**
	 * @param io_nbr
	 *			現金/票據登入編號
	 */
	public void setIo_nbr(String Io_nbr) {
		this.io_nbr = Io_nbr;
	}
		/**
	 * @return chk_date
	 *			票據到期日
	 */
	public Date getChk_date() {
		return chk_date;
	}

	/**
	 * @param chk_date
	 *			票據到期日
	 */
	public void setChk_date(Date Chk_date) {
		this.chk_date = Chk_date;
	}
		/**
	 * @return chk_no
	 *			支票號碼
	 */
	public String getChk_no() {
		return chk_no;
	}

	/**
	 * @param chk_no
	 *			支票號碼
	 */
	public void setChk_no(String Chk_no) {
		this.chk_no = Chk_no;
	}
		/**
	 * @return b_nbr
	 *			銀行代號
	 */
	public String getB_nbr() {
		return b_nbr;
	}

	/**
	 * @param b_nbr
	 *			銀行代號
	 */
	public void setB_nbr(String B_nbr) {
		this.b_nbr = B_nbr;
	}
		/**
	 * @return pay_bank
	 *			付款行庫
	 */
	public String getPay_bank() {
		return pay_bank;
	}

	/**
	 * @param pay_bank
	 *			付款行庫
	 */
	public void setPay_bank(String Pay_bank) {
		this.pay_bank = Pay_bank;
	}
		/**
	 * @return pay_code
	 *			發票人帳號
	 */
	public String getPay_code() {
		return pay_code;
	}

	/**
	 * @param pay_code
	 *			發票人帳號
	 */
	public void setPay_code(String Pay_code) {
		this.pay_code = Pay_code;
	}
		/**
	 * @return cannot
	 *			是否可修改
	 */
	public String getCannot() {
		return cannot;
	}

	/**
	 * @param cannot
	 *			是否可修改
	 */
	public void setCannot(String Cannot) {
		this.cannot = Cannot;
	}
		/**
	 * @return ret_chk
	 *			是否轉票存
	 */
	public String getRet_chk() {
		return ret_chk;
	}

	/**
	 * @param ret_chk
	 *			是否轉票存
	 */
	public void setRet_chk(String Ret_chk) {
		this.ret_chk = Ret_chk;
	}
		/**
	 * @return acr_nbr
	 *			參考號
	 */
	public String getAcr_nbr() {
		return acr_nbr;
	}

	/**
	 * @param acr_nbr
	 *			參考號
	 */
	public void setAcr_nbr(String Acr_nbr) {
		this.acr_nbr = Acr_nbr;
	}

	public String getHuid() {
		return huid;
	}

	public void setHuid(String huid) {
		this.huid = huid;
	}
	
}

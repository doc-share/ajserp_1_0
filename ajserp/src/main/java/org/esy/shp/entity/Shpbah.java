package org.esy.shp.entity;

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
 *  @date Tue Jul 28 13:56:29 CST 2020
 */
@Entity
@Table(name = "shp_bah" ,indexes = { @Index(name = "created", columnList = "created"), 
@Index(name = "updated", columnList = "updated")})
@EntityInfo("出貨表頭檔")
public class Shpbah extends BaseProperties {

	private static final long serialVersionUID = 1L;

	@FieldInfo("單據號碼")
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

	@FieldInfo("業務員編號")
	@FilterInfo(ListValue = "")
	@Column(name = "sale_nbr", length =32  )
	private String sale_nbr ;

	@FieldInfo("交易方式")
	@FilterInfo(ListValue = "")
	@Column(name = "pay_term", length =32  )
	private String pay_term ;

	@FieldInfo("出/退別")
	@FilterInfo(ListValue = "")
	@Column(name = "io_p", length =32  )
	private String io_p ;

	@FieldInfo("日期")
	@FilterInfo(ListValue = "")
	@Column(name = "nbrdate")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date nbrdate;

	@FieldInfo("客戶")
	@FilterInfo(ListValue = "")
	@Column(name = "cus_nbr", length =32  )
	private String cus_nbr ;

	@FieldInfo("指送客戶")
	@FilterInfo(ListValue = "")
	@Column(name = "cen_cus", length =32  )
	private String cen_cus ;

	@FieldInfo("倉庫")
	@FilterInfo(ListValue = "")
	@Column(name = "ware_nbr", length =32  )
	private String ware_nbr ;

	@FieldInfo("總金額")
	@FilterInfo(ListValue = "")
	@Column(name = "tot_amt")
	private Double tot_amt;

	@FieldInfo("稅別")
	@FilterInfo(ListValue = "")
	@Column(name = "tax_type", length =32  )
	private String tax_type ;

	@FieldInfo("稅額")
	@FilterInfo(ListValue = "")
	@Column(name = "tax_amt")
	private Double tax_amt;

	@FieldInfo("幣別總金額")
	@FilterInfo(ListValue = "")
	@Column(name = "ctot_amt")
	private Double ctot_amt;

	@FieldInfo("幣別稅額")
	@FilterInfo(ListValue = "")
	@Column(name = "ctax_amt")
	private Double ctax_amt;

	@FieldInfo("匯率")
	@FilterInfo(ListValue = "")
	@Column(name = "coin_per")
	private Double coin_per;

	@FieldInfo("發票號碼")
	@FilterInfo(ListValue = "")
	@Column(name = "ivc_nbr", length =32  )
	private String ivc_nbr ;

	@FieldInfo("狀態")
	@FilterInfo(ListValue = "")
	@Column(name = "status", length =32  )
	private String status ;

	@FieldInfo("備註")
	@FilterInfo(ListValue = "")
	@Column(name = "remark", columnDefinition = "TEXT")
	private String remark;

	@FieldInfo("總件數")
	@FilterInfo(ListValue = "")
	@Column(name = "pack_qty", length =32  )
	private String pack_qty ;

	@FieldInfo("總成本")
	@FilterInfo(ListValue = "")
	@Column(name = "cost_amt")
	private Double cost_amt;

	@FieldInfo("已沖帳金額")
	@FilterInfo(ListValue = "")
	@Column(name = "rec_amt")
	private Double rec_amt;

	@FieldInfo("嘜頭LOG圖形")
	@FilterInfo(ListValue = "")
	@Column(name = "logtype", length =32  )
	private String logtype ;

	@FieldInfo("嘜頭LOG文字")
	@FilterInfo(ListValue = "")
	@Column(name = "logtxt", length =128  )
	private String logtxt ;

//	@FieldInfo("")
//	@FilterInfo(ListValue = "")
//	@Column(name = "mess", length =32  )
//	private String mess ;

	@FieldInfo("正嘜頭")
	@FilterInfo(ListValue = "")
	@Column(name = "fmiltle", length =32  )
	private String fmiltle ;

	@FieldInfo("側嘜頭")
	@FilterInfo(ListValue = "")
	@Column(name = "dmiltle", length =32  )
	private String dmiltle ;

//	@FieldInfo("")
//	@FilterInfo(ListValue = "")
//	@Column(name = "no_nbr", length =32  )
//	private String no_nbr ;

	@FieldInfo("清單")
	@FilterInfo(ListValue = "")
	@Column(name = "invoice", length =128  )
	private String invoice ;

//	@FieldInfo("")
//	@FilterInfo(ListValue = "")
//	@Column(name = "messrs1", length =128  )
//	private String messrs1 ;
//
//	@FieldInfo("")
//	@FilterInfo(ListValue = "")
//	@Column(name = "messrs2", length =128  )
//	private String messrs2 ;
//
//	@FieldInfo("")
//	@FilterInfo(ListValue = "")
//	@Column(name = "shipper", length =128  )
//	private String shipper ;
//
//	@FieldInfo("")
//	@FilterInfo(ListValue = "")
//	@Column(name = "per", length =128  )
//	private String per ;
//
//	@FieldInfo("")
//	@FilterInfo(ListValue = "")
//	@Column(name = "sailing", length =32  )
//	private String sailing ;
//
//	@FieldInfo("")
//	@FilterInfo(ListValue = "")
//	@Column(name = "to_nbr", length =32  )
//	private String to_nbr ;
//
//	@FieldInfo("")
//	@FilterInfo(ListValue = "")
//	@Column(name = "lcno", length =128  )
//	private String lcno ;

	@FieldInfo("合約號碼")
	@FilterInfo(ListValue = "")
	@Column(name = "contract", length =128  )
	private String contract ;

	@FieldInfo("幣別")
	@FilterInfo(ListValue = "")
	@Column(name = "coin_nbr", length =32  )
	private String coin_nbr ;

	@FieldInfo("備註1")
	@FilterInfo(ListValue = "")
	@Column(name = "remark1", columnDefinition = "TEXT")
	private String remark1;

	@FieldInfo("備註2")
	@FilterInfo(ListValue = "")
	@Column(name = "remark2", columnDefinition = "TEXT")
	private String remark2;

	@FieldInfo("LAST EDITOR編號")
	@FilterInfo(ListValue = "")
	@Column(name = "form_nbr", length =32  )
	private String form_nbr ;

	@FieldInfo("最后異動者代號")
	@FilterInfo(ListValue = "")
	@Column(name = "last_user", length =32  )
	private String last_user ;

//	@FieldInfo("")
//	@FilterInfo(ListValue = "")
//	@Column(name = "lc_no", length =32  )
//	private String lc_no ;

	@FieldInfo("日期")
	@FilterInfo(ListValue = "")
	@Column(name = "dated")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date dated;

//	@FieldInfo("")
//	@FilterInfo(ListValue = "")
//	@Column(name = "pack", length =128  )
//	private String pack ;
//
//	@FieldInfo("")
//	@FilterInfo(ListValue = "")
//	@Column(name = "attn", length =128  )
//	private String attn ;
//
//	@FieldInfo("")
//	@FilterInfo(ListValue = "")
//	@Column(name = "shipped", length =128  )
//	private String shipped ;

//	@FieldInfo("")
//	@FilterInfo(ListValue = "")
//	@Column(name = "from", length =32  )
//	private String from ;

	@FieldInfo("折數")
	@FilterInfo(ListValue = "")
	@Column(name = "cut")
	private Double cut;

	@FieldInfo("麥頭圖檔")
	@FilterInfo(ListValue = "")
	@Column(name = "mttd", length =32  )
	private String mttd ;

	@FieldInfo("是否確認")
	@FilterInfo(ListValue = "")
	@Column(name = "is_sure")
	private Integer is_sure;

	@FieldInfo("是否已列印")
	@FilterInfo(ListValue = "")
	@Column(name = "is_prn")
	private Integer is_prn;

	@FieldInfo("連絡人1")
	@FilterInfo(ListValue = "")
	@Column(name = "attname1", length =32  )
	private String attname1 ;

	@FieldInfo("建檔日期")
	@FilterInfo(ListValue = "")
	@Column(name = "crt_date")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date crt_date;

	@FieldInfo("建檔人員")
	@FilterInfo(ListValue = "")
	@Column(name = "crt_user", length =32  )
	private String crt_user ;

	@FieldInfo("最近修改日期")
	@FilterInfo(ListValue = "")
	@Column(name = "edit_date")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date edit_date;

	@FieldInfo("最近修改人員")
	@FilterInfo(ListValue = "")
	@Column(name = "edit_user", length =32  )
	private String edit_user ;

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


     /**
	 *
	 * 构造函数
	 *
	 */
	public Shpbah() {
		super();
	}
	
	/**
	 *
	 * 构造函数
	 *
	 	 * @param nbr
	 *		  單據號碼
	 * 
	 	 * @param acc_nbr
	 *		  會計傳票
	 * 
	 	 * @param acr_mon
	 *		  結帳月份
	 * 
	 	 * @param sale_nbr
	 *		  業務員編號
	 * 
	 	 * @param pay_term
	 *		  交易方式
	 * 
	 	 * @param io_p
	 *		  出/退別
	 * 
	 	 * @param nbrdate
	 *		  日期
	 * 
	 	 * @param cus_nbr
	 *		  客戶
	 * 
	 	 * @param cen_cus
	 *		  指送客戶
	 * 
	 	 * @param ware_nbr
	 *		  倉庫
	 * 
	 	 * @param tot_amt
	 *		  總金額
	 * 
	 	 * @param tax_type
	 *		  稅別
	 * 
	 	 * @param tax_amt
	 *		  稅額
	 * 
	 	 * @param ctot_amt
	 *		  幣別總金額
	 * 
	 	 * @param ctax_amt
	 *		  幣別稅額
	 * 
	 	 * @param coin_per
	 *		  匯率
	 * 
	 	 * @param ivc_nbr
	 *		  發票號碼
	 * 
	 	 * @param status
	 *		  狀態
	 * 
	 	 * @param remark
	 *		  備註
	 * 
	 	 * @param pack_qty
	 *		  總件數
	 * 
	 	 * @param cost_amt
	 *		  總成本
	 * 
	 	 * @param rec_amt
	 *		  已沖帳金額
	 * 
	 	 * @param logtype
	 *		  嘜頭LOG圖形
	 * 
	 	 * @param logtxt
	 *		  嘜頭LOG文字
	 * 
	 	 * @param mess
	 *		  
	 * 
	 	 * @param fmiltle
	 *		  正嘜頭
	 * 
	 	 * @param dmiltle
	 *		  側嘜頭
	 * 
	 	 * @param no_nbr
	 *		  
	 * 
	 	 * @param invoice
	 *		  清單
	 * 
	 	 * @param messrs1
	 *		  
	 * 
	 	 * @param messrs2
	 *		  
	 * 
	 	 * @param shipper
	 *		  
	 * 
	 	 * @param per
	 *		  
	 * 
	 	 * @param sailing
	 *		  
	 * 
	 	 * @param to_nbr
	 *		  
	 * 
	 	 * @param lcno
	 *		  
	 * 
	 	 * @param contract
	 *		  合約號碼
	 * 
	 	 * @param coin_nbr
	 *		  幣別
	 * 
	 	 * @param remark1
	 *		  備註1
	 * 
	 	 * @param remark2
	 *		  備註2
	 * 
	 	 * @param form_nbr
	 *		  LAST EDITOR編號
	 * 
	 	 * @param last_user
	 *		  最后異動者代號
	 * 
	 	 * @param lc_no
	 *		  
	 * 
	 	 * @param dated
	 *		  日期
	 * 
	 	 * @param pack
	 *		  
	 * 
	 	 * @param attn
	 *		  
	 * 
	 	 * @param shipped
	 *		  
	 * 
	 	 * @param from
	 *		  
	 * 
	 	 * @param cut
	 *		  折數
	 * 
	 	 * @param mttd
	 *		  麥頭圖檔
	 * 
	 	 * @param is_sure
	 *		  是否確認
	 * 
	 	 * @param is_prn
	 *		  是否已列印
	 * 
	 	 * @param attname1
	 *		  連絡人1
	 * 
	 	 * @param crt_date
	 *		  建檔日期
	 * 
	 	 * @param crt_user
	 *		  建檔人員
	 * 
	 	 * @param edit_date
	 *		  最近修改日期
	 * 
	 	 * @param edit_user
	 *		  最近修改人員
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
	 	 */
    	public Shpbah( String nbr, String acc_nbr, String acr_mon, String sale_nbr, String pay_term, String io_p, Date nbrdate, String cus_nbr, String cen_cus, String ware_nbr, Double tot_amt, String tax_type, Double tax_amt, Double ctot_amt, Double ctax_amt, Double coin_per, String ivc_nbr, String status, String remark, String pack_qty, Double cost_amt, Double rec_amt, String logtype, String logtxt, String mess, String fmiltle, String dmiltle, String no_nbr, String invoice, String messrs1, String messrs2, String shipper, String per, String sailing, String to_nbr, String lcno, String contract, String coin_nbr, String remark1, String remark2, String form_nbr, String last_user, String lc_no, Date dated, String pack, String attn, String shipped, String from, Double cut, String mttd, Integer is_sure, Integer is_prn, String attname1, Date crt_date, String crt_user, Date edit_date, String edit_user, String tranok, String tranop, Integer trancnt ) {
		super();
				this.nbr = nbr;
				this.acc_nbr = acc_nbr;
				this.acr_mon = acr_mon;
				this.sale_nbr = sale_nbr;
				this.pay_term = pay_term;
				this.io_p = io_p;
				this.nbrdate = nbrdate;
				this.cus_nbr = cus_nbr;
				this.cen_cus = cen_cus;
				this.ware_nbr = ware_nbr;
				this.tot_amt = tot_amt;
				this.tax_type = tax_type;
				this.tax_amt = tax_amt;
				this.ctot_amt = ctot_amt;
				this.ctax_amt = ctax_amt;
				this.coin_per = coin_per;
				this.ivc_nbr = ivc_nbr;
				this.status = status;
				this.remark = remark;
				this.pack_qty = pack_qty;
				this.cost_amt = cost_amt;
				this.rec_amt = rec_amt;
				this.logtype = logtype;
				this.logtxt = logtxt;
//				this.mess = mess;
				this.fmiltle = fmiltle;
				this.dmiltle = dmiltle;
//				this.no_nbr = no_nbr;
				this.invoice = invoice;
//				this.messrs1 = messrs1;
//				this.messrs2 = messrs2;
//				this.shipper = shipper;
//				this.per = per;
//				this.sailing = sailing;
//				this.to_nbr = to_nbr;
//				this.lcno = lcno;
				this.contract = contract;
				this.coin_nbr = coin_nbr;
				this.remark1 = remark1;
				this.remark2 = remark2;
				this.form_nbr = form_nbr;
				this.last_user = last_user;
//				this.lc_no = lc_no;
				this.dated = dated;
//				this.pack = pack;
//				this.attn = attn;
//				this.shipped = shipped;
//				this.from = from;
				this.cut = cut;
				this.mttd = mttd;
				this.is_sure = is_sure;
				this.is_prn = is_prn;
				this.attname1 = attname1;
				this.crt_date = crt_date;
				this.crt_user = crt_user;
				this.edit_date = edit_date;
				this.edit_user = edit_user;
				this.tranok = tranok;
				this.tranop = tranop;
				this.trancnt = trancnt;
			}

		/**
	 * @return nbr
	 *			單據號碼
	 */
	public String getNbr() {
		return nbr;
	}

	/**
	 * @param nbr
	 *			單據號碼
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
	 * @return sale_nbr
	 *			業務員編號
	 */
	public String getSale_nbr() {
		return sale_nbr;
	}

	/**
	 * @param sale_nbr
	 *			業務員編號
	 */
	public void setSale_nbr(String Sale_nbr) {
		this.sale_nbr = Sale_nbr;
	}
		/**
	 * @return pay_term
	 *			交易方式
	 */
	public String getPay_term() {
		return pay_term;
	}

	/**
	 * @param pay_term
	 *			交易方式
	 */
	public void setPay_term(String Pay_term) {
		this.pay_term = Pay_term;
	}
		/**
	 * @return io_p
	 *			出/退別
	 */
	public String getIo_p() {
		return io_p;
	}

	/**
	 * @param io_p
	 *			出/退別
	 */
	public void setIo_p(String Io_p) {
		this.io_p = Io_p;
	}
		/**
	 * @return nbrdate
	 *			日期
	 */
	public Date getNbrdate() {
		return nbrdate;
	}

	/**
	 * @param nbrdate
	 *			日期
	 */
	public void setNbrdate(Date Nbrdate) {
		this.nbrdate = Nbrdate;
	}
		/**
	 * @return cus_nbr
	 *			客戶
	 */
	public String getCus_nbr() {
		return cus_nbr;
	}

	/**
	 * @param cus_nbr
	 *			客戶
	 */
	public void setCus_nbr(String Cus_nbr) {
		this.cus_nbr = Cus_nbr;
	}
		/**
	 * @return cen_cus
	 *			指送客戶
	 */
	public String getCen_cus() {
		return cen_cus;
	}

	/**
	 * @param cen_cus
	 *			指送客戶
	 */
	public void setCen_cus(String Cen_cus) {
		this.cen_cus = Cen_cus;
	}
		/**
	 * @return ware_nbr
	 *			倉庫
	 */
	public String getWare_nbr() {
		return ware_nbr;
	}

	/**
	 * @param ware_nbr
	 *			倉庫
	 */
	public void setWare_nbr(String Ware_nbr) {
		this.ware_nbr = Ware_nbr;
	}
		/**
	 * @return tot_amt
	 *			總金額
	 */
	public Double getTot_amt() {
		return tot_amt;
	}

	/**
	 * @param tot_amt
	 *			總金額
	 */
	public void setTot_amt(Double Tot_amt) {
		this.tot_amt = Tot_amt;
	}
		/**
	 * @return tax_type
	 *			稅別
	 */
	public String getTax_type() {
		return tax_type;
	}

	/**
	 * @param tax_type
	 *			稅別
	 */
	public void setTax_type(String Tax_type) {
		this.tax_type = Tax_type;
	}
		/**
	 * @return tax_amt
	 *			稅額
	 */
	public Double getTax_amt() {
		return tax_amt;
	}

	/**
	 * @param tax_amt
	 *			稅額
	 */
	public void setTax_amt(Double Tax_amt) {
		this.tax_amt = Tax_amt;
	}
		/**
	 * @return ctot_amt
	 *			幣別總金額
	 */
	public Double getCtot_amt() {
		return ctot_amt;
	}

	/**
	 * @param ctot_amt
	 *			幣別總金額
	 */
	public void setCtot_amt(Double Ctot_amt) {
		this.ctot_amt = Ctot_amt;
	}
		/**
	 * @return ctax_amt
	 *			幣別稅額
	 */
	public Double getCtax_amt() {
		return ctax_amt;
	}

	/**
	 * @param ctax_amt
	 *			幣別稅額
	 */
	public void setCtax_amt(Double Ctax_amt) {
		this.ctax_amt = Ctax_amt;
	}
		/**
	 * @return coin_per
	 *			匯率
	 */
	public Double getCoin_per() {
		return coin_per;
	}

	/**
	 * @param coin_per
	 *			匯率
	 */
	public void setCoin_per(Double Coin_per) {
		this.coin_per = Coin_per;
	}
		/**
	 * @return ivc_nbr
	 *			發票號碼
	 */
	public String getIvc_nbr() {
		return ivc_nbr;
	}

	/**
	 * @param ivc_nbr
	 *			發票號碼
	 */
	public void setIvc_nbr(String Ivc_nbr) {
		this.ivc_nbr = Ivc_nbr;
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
	 * @return pack_qty
	 *			總件數
	 */
	public String getPack_qty() {
		return pack_qty;
	}

	/**
	 * @param pack_qty
	 *			總件數
	 */
	public void setPack_qty(String Pack_qty) {
		this.pack_qty = Pack_qty;
	}
		/**
	 * @return cost_amt
	 *			總成本
	 */
	public Double getCost_amt() {
		return cost_amt;
	}

	/**
	 * @param cost_amt
	 *			總成本
	 */
	public void setCost_amt(Double Cost_amt) {
		this.cost_amt = Cost_amt;
	}
		/**
	 * @return rec_amt
	 *			已沖帳金額
	 */
	public Double getRec_amt() {
		return rec_amt;
	}

	/**
	 * @param rec_amt
	 *			已沖帳金額
	 */
	public void setRec_amt(Double Rec_amt) {
		this.rec_amt = Rec_amt;
	}
		/**
	 * @return logtype
	 *			嘜頭LOG圖形
	 */
	public String getLogtype() {
		return logtype;
	}

	/**
	 * @param logtype
	 *			嘜頭LOG圖形
	 */
	public void setLogtype(String Logtype) {
		this.logtype = Logtype;
	}
		/**
	 * @return logtxt
	 *			嘜頭LOG文字
	 */
	public String getLogtxt() {
		return logtxt;
	}

	/**
	 * @param logtxt
	 *			嘜頭LOG文字
	 */
	public void setLogtxt(String Logtxt) {
		this.logtxt = Logtxt;
	}
		/**
	 * @return mess
	 *			
	 */
//	public String getMess() {
//		return mess;
//	}
//
//	/**
//	 * @param mess
//	 *			
//	 */
//	public void setMess(String Mess) {
//		this.mess = Mess;
//	}
		/**
	 * @return fmiltle
	 *			正嘜頭
	 */
	public String getFmiltle() {
		return fmiltle;
	}

	/**
	 * @param fmiltle
	 *			正嘜頭
	 */
	public void setFmiltle(String Fmiltle) {
		this.fmiltle = Fmiltle;
	}
		/**
	 * @return dmiltle
	 *			側嘜頭
	 */
	public String getDmiltle() {
		return dmiltle;
	}

	/**
	 * @param dmiltle
	 *			側嘜頭
	 */
	public void setDmiltle(String Dmiltle) {
		this.dmiltle = Dmiltle;
	}
		/**
	 * @return no_nbr
	 *			
	 */
//	public String getNo_nbr() {
//		return no_nbr;
//	}
//
//	/**
//	 * @param no_nbr
//	 *			
//	 */
//	public void setNo_nbr(String No_nbr) {
//		this.no_nbr = No_nbr;
//	}
		/**
	 * @return invoice
	 *			清單
	 */
	public String getInvoice() {
		return invoice;
	}

	/**
	 * @param invoice
	 *			清單
	 */
	public void setInvoice(String Invoice) {
		this.invoice = Invoice;
	}
		/**
	 * @return messrs1
	 *			
	 */
//	public String getMessrs1() {
//		return messrs1;
//	}
//
//	/**
//	 * @param messrs1
//	 *			
//	 */
//	public void setMessrs1(String Messrs1) {
//		this.messrs1 = Messrs1;
//	}
		/**
	 * @return messrs2
	 *			
	 */
//	public String getMessrs2() {
//		return messrs2;
//	}
//
//	/**
//	 * @param messrs2
//	 *			
//	 */
//	public void setMessrs2(String Messrs2) {
//		this.messrs2 = Messrs2;
//	}
		/**
	 * @return shipper
	 *			
	 */
//	public String getShipper() {
//		return shipper;
//	}
//
//	/**
//	 * @param shipper
//	 *			
//	 */
//	public void setShipper(String Shipper) {
//		this.shipper = Shipper;
//	}
		/**
	 * @return per
	 *			
	 */
//	public String getPer() {
//		return per;
//	}
//
//	/**
//	 * @param per
//	 *			
//	 */
//	public void setPer(String Per) {
//		this.per = Per;
//	}
		/**
	 * @return sailing
	 *			
	 */
//	public String getSailing() {
//		return sailing;
//	}
//
//	/**
//	 * @param sailing
//	 *			
//	 */
//	public void setSailing(String Sailing) {
//		this.sailing = Sailing;
//	}
		/**
	 * @return to_nbr
	 *			
	 */
//	public String getTo_nbr() {
//		return to_nbr;
//	}
//
//	/**
//	 * @param to_nbr
//	 *			
//	 */
//	public void setTo_nbr(String To_nbr) {
//		this.to_nbr = To_nbr;
//	}
		/**
	 * @return lcno
	 *			
	 */
//	public String getLcno() {
//		return lcno;
//	}
//
//	/**
//	 * @param lcno
//	 *			
//	 */
//	public void setLcno(String Lcno) {
//		this.lcno = Lcno;
//	}
		/**
	 * @return contract
	 *			合約號碼
	 */
	public String getContract() {
		return contract;
	}

	/**
	 * @param contract
	 *			合約號碼
	 */
	public void setContract(String Contract) {
		this.contract = Contract;
	}
		/**
	 * @return coin_nbr
	 *			幣別
	 */
	public String getCoin_nbr() {
		return coin_nbr;
	}

	/**
	 * @param coin_nbr
	 *			幣別
	 */
	public void setCoin_nbr(String Coin_nbr) {
		this.coin_nbr = Coin_nbr;
	}
		/**
	 * @return remark1
	 *			備註1
	 */
	public String getRemark1() {
		return remark1;
	}

	/**
	 * @param remark1
	 *			備註1
	 */
	public void setRemark1(String Remark1) {
		this.remark1 = Remark1;
	}
		/**
	 * @return remark2
	 *			備註2
	 */
	public String getRemark2() {
		return remark2;
	}

	/**
	 * @param remark2
	 *			備註2
	 */
	public void setRemark2(String Remark2) {
		this.remark2 = Remark2;
	}
		/**
	 * @return form_nbr
	 *			LAST EDITOR編號
	 */
	public String getForm_nbr() {
		return form_nbr;
	}

	/**
	 * @param form_nbr
	 *			LAST EDITOR編號
	 */
	public void setForm_nbr(String Form_nbr) {
		this.form_nbr = Form_nbr;
	}
		/**
	 * @return last_user
	 *			最后異動者代號
	 */
	public String getLast_user() {
		return last_user;
	}

	/**
	 * @param last_user
	 *			最后異動者代號
	 */
	public void setLast_user(String Last_user) {
		this.last_user = Last_user;
	}
		/**
	 * @return lc_no
	 *			
	 */
//	public String getLc_no() {
//		return lc_no;
//	}
//
//	/**
//	 * @param lc_no
//	 *			
//	 */
//	public void setLc_no(String Lc_no) {
//		this.lc_no = Lc_no;
//	}
		/**
	 * @return dated
	 *			日期
	 */
	public Date getDated() {
		return dated;
	}

	/**
	 * @param dated
	 *			日期
	 */
	public void setDated(Date Dated) {
		this.dated = Dated;
	}
		/**
	 * @return pack
	 *			
	 */
//	public String getPack() {
//		return pack;
//	}
//
//	/**
//	 * @param pack
//	 *			
//	 */
//	public void setPack(String Pack) {
//		this.pack = Pack;
//	}
		/**
	 * @return attn
	 *			
	 */
//	public String getAttn() {
//		return attn;
//	}
//
//	/**
//	 * @param attn
//	 *			
//	 */
//	public void setAttn(String Attn) {
//		this.attn = Attn;
//	}
		/**
	 * @return shipped
	 *			
	 */
//	public String getShipped() {
//		return shipped;
//	}
//
//	/**
//	 * @param shipped
//	 *			
//	 */
//	public void setShipped(String Shipped) {
//		this.shipped = Shipped;
//	}
		/**
	 * @return from
	 *			
	 */
//	public String getFrom() {
//		return from;
//	}
//
//	/**
//	 * @param from
//	 *			
//	 */
//	public void setFrom(String From) {
//		this.from = From;
//	}
		/**
	 * @return cut
	 *			折數
	 */
	public Double getCut() {
		return cut;
	}

	/**
	 * @param cut
	 *			折數
	 */
	public void setCut(Double Cut) {
		this.cut = Cut;
	}
		/**
	 * @return mttd
	 *			麥頭圖檔
	 */
	public String getMttd() {
		return mttd;
	}

	/**
	 * @param mttd
	 *			麥頭圖檔
	 */
	public void setMttd(String Mttd) {
		this.mttd = Mttd;
	}
		/**
	 * @return is_sure
	 *			是否確認
	 */
	public Integer getIs_sure() {
		return is_sure;
	}

	/**
	 * @param is_sure
	 *			是否確認
	 */
	public void setIs_sure(Integer Is_sure) {
		this.is_sure = Is_sure;
	}
		/**
	 * @return is_prn
	 *			是否已列印
	 */
	public Integer getIs_prn() {
		return is_prn;
	}

	/**
	 * @param is_prn
	 *			是否已列印
	 */
	public void setIs_prn(Integer Is_prn) {
		this.is_prn = Is_prn;
	}
		/**
	 * @return attname1
	 *			連絡人1
	 */
	public String getAttname1() {
		return attname1;
	}

	/**
	 * @param attname1
	 *			連絡人1
	 */
	public void setAttname1(String Attname1) {
		this.attname1 = Attname1;
	}
		/**
	 * @return crt_date
	 *			建檔日期
	 */
	public Date getCrt_date() {
		return crt_date;
	}

	/**
	 * @param crt_date
	 *			建檔日期
	 */
	public void setCrt_date(Date Crt_date) {
		this.crt_date = Crt_date;
	}
		/**
	 * @return crt_user
	 *			建檔人員
	 */
	public String getCrt_user() {
		return crt_user;
	}

	/**
	 * @param crt_user
	 *			建檔人員
	 */
	public void setCrt_user(String Crt_user) {
		this.crt_user = Crt_user;
	}
		/**
	 * @return edit_date
	 *			最近修改日期
	 */
	public Date getEdit_date() {
		return edit_date;
	}

	/**
	 * @param edit_date
	 *			最近修改日期
	 */
	public void setEdit_date(Date Edit_date) {
		this.edit_date = Edit_date;
	}
		/**
	 * @return edit_user
	 *			最近修改人員
	 */
	public String getEdit_user() {
		return edit_user;
	}

	/**
	 * @param edit_user
	 *			最近修改人員
	 */
	public void setEdit_user(String Edit_user) {
		this.edit_user = Edit_user;
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
	
}

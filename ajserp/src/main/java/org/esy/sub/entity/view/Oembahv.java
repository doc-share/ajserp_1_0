package org.esy.sub.entity.view;

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

import org.esy.base.annotation.EntityInfo;
import org.esy.base.annotation.FieldInfo;
import org.esy.base.core.BaseProperties;
import org.esy.sub.entity.Oembat;
import org.esy.sub.entity.Oemuseo;
import org.hibernate.annotations.Subselect;
import org.hibernate.annotations.Synchronize;
import org.esy.base.annotation.FilterInfo;


@Entity
@EntityInfo("委外加工收料表頭檔")
@Table(name = "Oembahv")
@Subselect("select a.* from oem_bah a")
@Synchronize("oem_bah")

public class Oembahv extends BaseProperties {

	private static final long serialVersionUID = 1L;

	@FieldInfo("單據號碼")
	@FilterInfo(ListValue = "")
	@Column(name = "nbr", length =32  )
	private String nbr ;

	@FieldInfo("會計傳票")
	@FilterInfo(ListValue = "")
	@Column(name = "acc_nbr", length =32  )
	private String acc_nbr ;

	@FieldInfo("進/退別")
	@FilterInfo(ListValue = "")
	@Column(name = "io_p", length =32  )
	private String io_p ;

	@FieldInfo("結帳月份")
	@FilterInfo(ListValue = "")
	@Column(name = "acr_mon", length =32  )
	private String acr_mon ;

	@FieldInfo("交易方式")
	@FilterInfo(ListValue = "")
	@Column(name = "pay_term", length =32  )
	private String pay_term ;

	@FieldInfo("日期")
	@FilterInfo(ListValue = "")
	@Column(name = "nbrdate")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date nbrdate;

	@FieldInfo("供應商代號")
	@FilterInfo(ListValue = "")
	@Column(name = "ven_nbr", length =32  )
	private String ven_nbr ;

	@FieldInfo("驗收倉庫")
	@FilterInfo(ListValue = "")
	@Column(name = "ware_nbri", length =32  )
	private String ware_nbri ;

	@FieldInfo("委外倉庫")
	@FilterInfo(ListValue = "")
	@Column(name = "ware_nbro", length =32  )
	private String ware_nbro ;

	@FieldInfo("發票號碼")
	@FilterInfo(ListValue = "")
	@Column(name = "ivc_nbr", length =32  )
	private String ivc_nbr ;

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
	private Integer tax_amt;

	@FieldInfo("備註")
	@FilterInfo(ListValue = "")
	@Column(name = "remark", length =128  )
	private String remark ;

	@FieldInfo("已沖帳金額")
	@FilterInfo(ListValue = "")
	@Column(name = "rec_amt")
	private Double rec_amt;

	@FieldInfo("狀態")
	@FilterInfo(ListValue = "")
	@Column(name = "status", length =32  )
	private String status ;

	@FieldInfo("是否已轉包")
	@FilterInfo(ListValue = "")
	@Column(name = "isret", length =32  )
	private String isret ;

	@FieldInfo("最后異動者代號")
	@FilterInfo(ListValue = "")
	@Column(name = "last_user", length =32  )
	private String last_user ;

	@FieldInfo("圖紙代號")
	@FilterInfo(ListValue = "")
	@Column(name = "item_nbr", length =32  )
	private String item_nbr ;

	@FieldInfo("工程名稱")
	@FilterInfo(ListValue = "")
	@Column(name = "work_desc", length =32  )
	private String work_desc ;

	@FieldInfo("單據號碼")
	@FilterInfo(ListValue = "")
	@Column(name = "sub_nbr", length =32  )
	private String sub_nbr ;

	@FieldInfo("驗收")
	@FilterInfo(ListValue = "")
	@Column(name = "sure")
	private Integer sure;

	@FieldInfo("驗收日期")
	@FilterInfo(ListValue = "")
	@Column(name = "sure_date")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date sure_date;

	@FieldInfo("接單案號")
	@FilterInfo(ListValue = "")
	@Column(name = "ord_nbr", length =32  )
	private String ord_nbr ;

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


	@Transient
	@JsonProperty("oembats") //宿主(要引用明細檔)(oembats要跟grid key值一樣)
	private List<Oembat> oembats = new ArrayList<Oembat>();
	
	@Transient
	@JsonProperty("oemuseos") //宿主(要引用明細檔)(oemuseos要跟grid key值一樣)
	private List<Oemuseo> oemuseos = new ArrayList<Oemuseo>();
	
     public List<Oembat> getOembats() {
		return oembats;
	}

	public void setOembats(List<Oembat> oembats) {
		this.oembats = oembats;
	}

	public List<Oemuseo> getOemuseos() {
		return oemuseos;
	}

	public void setOemuseos(List<Oemuseo> oemuseos) {
		this.oemuseos = oemuseos;
	}

	/**
	 *
	 * 构造函数
	 *
	 */
	public Oembahv() {
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
	 	 * @param io_p
	 *		  進/退別
	 * 
	 	 * @param acr_mon
	 *		  結帳月份
	 * 
	 	 * @param pay_term
	 *		  交易方式
	 * 
	 	 * @param nbrdate
	 *		  日期
	 * 
	 	 * @param ven_nbr
	 *		  供應商代號
	 * 
	 	 * @param ware_nbri
	 *		  驗收倉庫
	 * 
	 	 * @param ware_nbro
	 *		  委外倉庫
	 * 
	 	 * @param ivc_nbr
	 *		  發票號碼
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
	 	 * @param remark
	 *		  備註
	 * 
	 	 * @param rec_amt
	 *		  已沖帳金額
	 * 
	 	 * @param status
	 *		  狀態
	 * 
	 	 * @param isret
	 *		  是否已轉包
	 * 
	 	 * @param last_user
	 *		  最后異動者代號
	 * 
	 	 * @param item_nbr
	 *		  圖紙代號
	 * 
	 	 * @param work_desc
	 *		  工程名稱
	 * 
	 	 * @param sub_nbr
	 *		  單據號碼
	 * 
	 	 * @param sure
	 *		  驗收
	 * 
	 	 * @param sure_date
	 *		  驗收日期
	 * 
	 	 * @param ord_nbr
	 *		  接單案號
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
    	public Oembahv( String nbr, String acc_nbr, String io_p, String acr_mon, String pay_term, Date nbrdate, String ven_nbr, String ware_nbri, String ware_nbro, String ivc_nbr, Double tot_amt, String tax_type, Integer tax_amt, String remark, Double rec_amt, String status, String isret, String last_user, String item_nbr, String work_desc, String sub_nbr, Integer sure, Date sure_date, String ord_nbr, Date crt_date, String crt_user, Date edit_date, String edit_user, String tranok, String tranop, Integer trancnt ) {
		super();
				this.nbr = nbr;
				this.acc_nbr = acc_nbr;
				this.io_p = io_p;
				this.acr_mon = acr_mon;
				this.pay_term = pay_term;
				this.nbrdate = nbrdate;
				this.ven_nbr = ven_nbr;
				this.ware_nbri = ware_nbri;
				this.ware_nbro = ware_nbro;
				this.ivc_nbr = ivc_nbr;
				this.tot_amt = tot_amt;
				this.tax_type = tax_type;
				this.tax_amt = tax_amt;
				this.remark = remark;
				this.rec_amt = rec_amt;
				this.status = status;
				this.isret = isret;
				this.last_user = last_user;
				this.item_nbr = item_nbr;
				this.work_desc = work_desc;
				this.sub_nbr = sub_nbr;
				this.sure = sure;
				this.sure_date = sure_date;
				this.ord_nbr = ord_nbr;
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
	 * @return io_p
	 *			進/退別
	 */
	public String getIo_p() {
		return io_p;
	}

	/**
	 * @param io_p
	 *			進/退別
	 */
	public void setIo_p(String Io_p) {
		this.io_p = Io_p;
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
	 * @return ven_nbr
	 *			供應商代號
	 */
	public String getVen_nbr() {
		return ven_nbr;
	}

	/**
	 * @param ven_nbr
	 *			供應商代號
	 */
	public void setVen_nbr(String Ven_nbr) {
		this.ven_nbr = Ven_nbr;
	}
		/**
	 * @return ware_nbri
	 *			驗收倉庫
	 */
	public String getWare_nbri() {
		return ware_nbri;
	}

	/**
	 * @param ware_nbri
	 *			驗收倉庫
	 */
	public void setWare_nbri(String Ware_nbri) {
		this.ware_nbri = Ware_nbri;
	}
		/**
	 * @return ware_nbro
	 *			委外倉庫
	 */
	public String getWare_nbro() {
		return ware_nbro;
	}

	/**
	 * @param ware_nbro
	 *			委外倉庫
	 */
	public void setWare_nbro(String Ware_nbro) {
		this.ware_nbro = Ware_nbro;
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
	public Integer getTax_amt() {
		return tax_amt;
	}

	/**
	 * @param tax_amt
	 *			稅額
	 */
	public void setTax_amt(Integer Tax_amt) {
		this.tax_amt = Tax_amt;
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
	 * @return isret
	 *			是否已轉包
	 */
	public String getIsret() {
		return isret;
	}

	/**
	 * @param isret
	 *			是否已轉包
	 */
	public void setIsret(String Isret) {
		this.isret = Isret;
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
	 * @return item_nbr
	 *			圖紙代號
	 */
	public String getItem_nbr() {
		return item_nbr;
	}

	/**
	 * @param item_nbr
	 *			圖紙代號
	 */
	public void setItem_nbr(String Item_nbr) {
		this.item_nbr = Item_nbr;
	}
		/**
	 * @return work_desc
	 *			工程名稱
	 */
	public String getWork_desc() {
		return work_desc;
	}

	/**
	 * @param work_desc
	 *			工程名稱
	 */
	public void setWork_desc(String Work_desc) {
		this.work_desc = Work_desc;
	}
		/**
	 * @return sub_nbr
	 *			單據號碼
	 */
	public String getSub_nbr() {
		return sub_nbr;
	}

	/**
	 * @param sub_nbr
	 *			單據號碼
	 */
	public void setSub_nbr(String Sub_nbr) {
		this.sub_nbr = Sub_nbr;
	}
		/**
	 * @return sure
	 *			驗收
	 */
	public Integer getSure() {
		return sure;
	}

	/**
	 * @param sure
	 *			驗收
	 */
	public void setSure(Integer Sure) {
		this.sure = Sure;
	}
		/**
	 * @return sure_date
	 *			驗收日期
	 */
	public Date getSure_date() {
		return sure_date;
	}

	/**
	 * @param sure_date
	 *			驗收日期
	 */
	public void setSure_date(Date Sure_date) {
		this.sure_date = Sure_date;
	}
		/**
	 * @return ord_nbr
	 *			接單案號
	 */
	public String getOrd_nbr() {
		return ord_nbr;
	}

	/**
	 * @param ord_nbr
	 *			接單案號
	 */
	public void setOrd_nbr(String Ord_nbr) {
		this.ord_nbr = Ord_nbr;
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

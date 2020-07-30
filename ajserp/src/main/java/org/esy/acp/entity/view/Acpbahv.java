package org.esy.acp.entity.view;

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

import org.esy.acp.entity.Acpbat;
import org.esy.acp.entity.Acpdis;
import org.esy.base.annotation.EntityInfo;
import org.esy.base.annotation.FieldInfo;
import org.esy.base.core.BaseProperties;
import org.hibernate.annotations.Subselect;
import org.hibernate.annotations.Synchronize;
import org.esy.base.annotation.FilterInfo;



@Entity
@EntityInfo("付款單表頭檔")
@Table(name = "Acpbahv")
@Subselect("select a.* from acp_bah a")
//@Subselect("select a.*, b.ven_name, c.ven_name as ven_name1, d.coin_desc, e.sale_name from pur_bah a "
//		+ "left join pur_ven b on b.ven_nbr=a.ven_nbr "
//		+ "left join pur_ven c on c.ven_nbr=a.ven_nbr1 "
//		+ "left join bas_coin d on d.coin_nbr=a.coin_nbr "
//		+ "left join bas_sal e on e.sale_nbr=a.sale_nbr ")
@Synchronize("acp_bah")

public class Acpbahv extends BaseProperties {

	private static final long serialVersionUID = 1L;

	@FieldInfo("付款單代號")
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

	@FieldInfo("付款日期")
	@FilterInfo(ListValue = "")
	@Column(name = "nbrdate")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date nbrdate;

	@FieldInfo("廠商代號")
	@FilterInfo(ListValue = "")
	@Column(name = "ven_nbr", length =32  )
	private String ven_nbr ;

	@FieldInfo("業務員代號")
	@FilterInfo(ListValue = "")
	@Column(name = "sale_nbr", length =32  )
	private String sale_nbr ;

	@FieldInfo("現金收款")
	@FilterInfo(ListValue = "")
	@Column(name = "cash_amt")
	private Double cash_amt;

	@FieldInfo("票據收款")
	@FilterInfo(ListValue = "")
	@Column(name = "chk_amt")
	private Double chk_amt;

	@FieldInfo("折讓")
	@FilterInfo(ListValue = "")
	@Column(name = "cut_amt")
	private Double cut_amt;

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

	@FieldInfo("是否沖款")
	@FilterInfo(ListValue = "")
	@Column(name = "arjupd")
	private Integer arjupd;

	@FieldInfo("最后異動者代號")
	@FilterInfo(ListValue = "")
	@Column(name = "last_user", length =32  )
	private String last_user ;

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
	@JsonProperty("acpbats") //宿主(要引用明細檔)(acpbats要跟grid key值一樣)
	private List<Acpbat> acpbats = new ArrayList<Acpbat>();
	
	@Transient
	@JsonProperty("acpdiss") //宿主(要引用明細檔)(acpdiss要跟grid key值一樣)
	private List<Acpdis> acpdiss = new ArrayList<Acpdis>();
	
     public List<Acpbat> getAcpbats() {
		return acpbats;
	}

	public void setAcpbats(List<Acpbat> acpbats) {
		this.acpbats = acpbats;
	}

	public List<Acpdis> getAcpdiss() {
		return acpdiss;
	}

	public void setAcpdiss(List<Acpdis> acpdiss) {
		this.acpdiss = acpdiss;
	}

	/**
	 *
	 * 构造函数
	 *
	 */
	public Acpbahv() {
		super();
	}
	
	/**
	 *
	 * 构造函数
	 *
	 	 * @param nbr
	 *		  付款單代號
	 * 
	 	 * @param acc_nbr
	 *		  會計傳票
	 * 
	 	 * @param acr_mon
	 *		  結帳月份
	 * 
	 	 * @param nbrdate
	 *		  付款日期
	 * 
	 	 * @param ven_nbr
	 *		  廠商代號
	 * 
	 	 * @param sale_nbr
	 *		  業務員代號
	 * 
	 	 * @param cash_amt
	 *		  現金收款
	 * 
	 	 * @param chk_amt
	 *		  票據收款
	 * 
	 	 * @param cut_amt
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
	 	 * @param arjupd
	 *		  是否沖款
	 * 
	 	 * @param last_user
	 *		  最后異動者代號
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
    	public Acpbahv( String nbr, String acc_nbr, String acr_mon, Date nbrdate, String ven_nbr, String sale_nbr, Double cash_amt, Double chk_amt, Double cut_amt, Double other_amt, Double post_amt, Double pre_amt, Double tot_amt, Double wait_amt, String status, Double tot_acr, Double opre_amt, Double aft_amt, Integer arjupd, String last_user, Date crt_date, String crt_user, Date edit_date, String edit_user, String tranok, String tranop, Integer trancnt ) {
		super();
				this.nbr = nbr;
				this.acc_nbr = acc_nbr;
				this.acr_mon = acr_mon;
				this.nbrdate = nbrdate;
				this.ven_nbr = ven_nbr;
				this.sale_nbr = sale_nbr;
				this.cash_amt = cash_amt;
				this.chk_amt = chk_amt;
				this.cut_amt = cut_amt;
				this.other_amt = other_amt;
				this.post_amt = post_amt;
				this.pre_amt = pre_amt;
				this.tot_amt = tot_amt;
				this.wait_amt = wait_amt;
				this.status = status;
				this.tot_acr = tot_acr;
				this.opre_amt = opre_amt;
				this.aft_amt = aft_amt;
				this.arjupd = arjupd;
				this.last_user = last_user;
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
	 *			付款單代號
	 */
	public String getNbr() {
		return nbr;
	}

	/**
	 * @param nbr
	 *			付款單代號
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
	 * @return nbrdate
	 *			付款日期
	 */
	public Date getNbrdate() {
		return nbrdate;
	}

	/**
	 * @param nbrdate
	 *			付款日期
	 */
	public void setNbrdate(Date Nbrdate) {
		this.nbrdate = Nbrdate;
	}
		/**
	 * @return ven_nbr
	 *			廠商代號
	 */
	public String getVen_nbr() {
		return ven_nbr;
	}

	/**
	 * @param ven_nbr
	 *			廠商代號
	 */
	public void setVen_nbr(String Ven_nbr) {
		this.ven_nbr = Ven_nbr;
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
		/**
	 * @return arjupd
	 *			是否沖款
	 */
	public Integer getArjupd() {
		return arjupd;
	}

	/**
	 * @param arjupd
	 *			是否沖款
	 */
	public void setArjupd(Integer Arjupd) {
		this.arjupd = Arjupd;
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

package org.esy.sub.entity;

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
 *  @date Fri Jul 31 09:40:02 CST 2020
 */
@Entity
@Table(name = "sub_bah" ,indexes = { @Index(name = "created", columnList = "created"), 
@Index(name = "updated", columnList = "updated")})
@EntityInfo("委外加工表頭檔")
public class Subbah extends BaseProperties {

	private static final long serialVersionUID = 1L;

	@FieldInfo("訂單單據號碼")
	@FilterInfo(ListValue = "")
	@Column(name = "ord_nbr", length =32  )
	private String ord_nbr ;

	@FieldInfo("轉包單據號碼")
	@FilterInfo(ListValue = "")
	@Column(name = "oem_nbr", length =32  )
	private String oem_nbr ;

	@FieldInfo("單據號碼")
	@FilterInfo(ListValue = "")
	@Column(name = "nbr", length =32  )
	private String nbr ;

	@FieldInfo("日期")
	@FilterInfo(ListValue = "")
	@Column(name = "nbrdate")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date nbrdate;

	@FieldInfo("加工商代號")
	@FilterInfo(ListValue = "")
	@Column(name = "ven_nbr", length =32  )
	private String ven_nbr ;

	@FieldInfo("指送廠商")
	@FilterInfo(ListValue = "")
	@Column(name = "ven_nbr1", length =32  )
	private String ven_nbr1 ;

	@FieldInfo("承辦員代號")
	@FilterInfo(ListValue = "")
	@Column(name = "sale_nbr", length =32  )
	private String sale_nbr ;

	@FieldInfo("撥料倉庫")
	@FilterInfo(ListValue = "")
	@Column(name = "ware_nbro", length =32  )
	private String ware_nbro ;

	@FieldInfo("領料倉庫")
	@FilterInfo(ListValue = "")
	@Column(name = "ware_nbri", length =32  )
	private String ware_nbri ;

	@FieldInfo("總金額")
	@FilterInfo(ListValue = "")
	@Column(name = "tot_amt")
	private Double tot_amt;

	@FieldInfo("預定到廠日")
	@FilterInfo(ListValue = "")
	@Column(name = "plan_date")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date plan_date;

	@FieldInfo("備註")
	@FilterInfo(ListValue = "")
	@Column(name = "remark", length =128  )
	private String remark ;

	@FieldInfo("狀態")
	@FilterInfo(ListValue = "")
	@Column(name = "status", length =32  )
	private String status ;

	@FieldInfo("會計科目")
	@FilterInfo(ListValue = "")
	@Column(name = "acc_id", length =32  )
	private String acc_id ;

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

	@FieldInfo("核准")
	@FilterInfo(ListValue = "")
	@Column(name = "sure")
	private Integer sure;

	@FieldInfo("工程號")
	@FilterInfo(ListValue = "")
	@Column(name = "work_nbr", length =32  )
	private String work_nbr ;

	@FieldInfo("是否已列印")
	@FilterInfo(ListValue = "")
	@Column(name = "is_prn")
	private Integer is_prn;

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
	public Subbah() {
		super();
	}
	
	/**
	 *
	 * 构造函数
	 *
	 	 * @param ord_nbr
	 *		  訂單單據號碼
	 * 
	 	 * @param oem_nbr
	 *		  轉包單據號碼
	 * 
	 	 * @param nbr
	 *		  單據號碼
	 * 
	 	 * @param nbrdate
	 *		  日期
	 * 
	 	 * @param ven_nbr
	 *		  加工商代號
	 * 
	 	 * @param ven_nbr1
	 *		  指送廠商
	 * 
	 	 * @param sale_nbr
	 *		  承辦員代號
	 * 
	 	 * @param ware_nbro
	 *		  撥料倉庫
	 * 
	 	 * @param ware_nbri
	 *		  領料倉庫
	 * 
	 	 * @param tot_amt
	 *		  總金額
	 * 
	 	 * @param plan_date
	 *		  預定到廠日
	 * 
	 	 * @param remark
	 *		  備註
	 * 
	 	 * @param status
	 *		  狀態
	 * 
	 	 * @param acc_id
	 *		  會計科目
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
	 	 * @param sure
	 *		  核准
	 * 
	 	 * @param work_nbr
	 *		  工程號
	 * 
	 	 * @param is_prn
	 *		  是否已列印
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
    	public Subbah( String ord_nbr, String oem_nbr, String nbr, Date nbrdate, String ven_nbr, String ven_nbr1, String sale_nbr, String ware_nbro, String ware_nbri, Double tot_amt, Date plan_date, String remark, String status, String acc_id, String last_user, String item_nbr, String work_desc, Integer sure, String work_nbr, Integer is_prn, Date crt_date, String crt_user, Date edit_date, String edit_user, String tranok, String tranop, Integer trancnt ) {
		super();
				this.ord_nbr = ord_nbr;
				this.oem_nbr = oem_nbr;
				this.nbr = nbr;
				this.nbrdate = nbrdate;
				this.ven_nbr = ven_nbr;
				this.ven_nbr1 = ven_nbr1;
				this.sale_nbr = sale_nbr;
				this.ware_nbro = ware_nbro;
				this.ware_nbri = ware_nbri;
				this.tot_amt = tot_amt;
				this.plan_date = plan_date;
				this.remark = remark;
				this.status = status;
				this.acc_id = acc_id;
				this.last_user = last_user;
				this.item_nbr = item_nbr;
				this.work_desc = work_desc;
				this.sure = sure;
				this.work_nbr = work_nbr;
				this.is_prn = is_prn;
				this.crt_date = crt_date;
				this.crt_user = crt_user;
				this.edit_date = edit_date;
				this.edit_user = edit_user;
				this.tranok = tranok;
				this.tranop = tranop;
				this.trancnt = trancnt;
			}

		/**
	 * @return ord_nbr
	 *			訂單單據號碼
	 */
	public String getOrd_nbr() {
		return ord_nbr;
	}

	/**
	 * @param ord_nbr
	 *			訂單單據號碼
	 */
	public void setOrd_nbr(String Ord_nbr) {
		this.ord_nbr = Ord_nbr;
	}
		/**
	 * @return oem_nbr
	 *			轉包單據號碼
	 */
	public String getOem_nbr() {
		return oem_nbr;
	}

	/**
	 * @param oem_nbr
	 *			轉包單據號碼
	 */
	public void setOem_nbr(String Oem_nbr) {
		this.oem_nbr = Oem_nbr;
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
	 *			加工商代號
	 */
	public String getVen_nbr() {
		return ven_nbr;
	}

	/**
	 * @param ven_nbr
	 *			加工商代號
	 */
	public void setVen_nbr(String Ven_nbr) {
		this.ven_nbr = Ven_nbr;
	}
		/**
	 * @return ven_nbr1
	 *			指送廠商
	 */
	public String getVen_nbr1() {
		return ven_nbr1;
	}

	/**
	 * @param ven_nbr1
	 *			指送廠商
	 */
	public void setVen_nbr1(String Ven_nbr1) {
		this.ven_nbr1 = Ven_nbr1;
	}
		/**
	 * @return sale_nbr
	 *			承辦員代號
	 */
	public String getSale_nbr() {
		return sale_nbr;
	}

	/**
	 * @param sale_nbr
	 *			承辦員代號
	 */
	public void setSale_nbr(String Sale_nbr) {
		this.sale_nbr = Sale_nbr;
	}
		/**
	 * @return ware_nbro
	 *			撥料倉庫
	 */
	public String getWare_nbro() {
		return ware_nbro;
	}

	/**
	 * @param ware_nbro
	 *			撥料倉庫
	 */
	public void setWare_nbro(String Ware_nbro) {
		this.ware_nbro = Ware_nbro;
	}
		/**
	 * @return ware_nbri
	 *			領料倉庫
	 */
	public String getWare_nbri() {
		return ware_nbri;
	}

	/**
	 * @param ware_nbri
	 *			領料倉庫
	 */
	public void setWare_nbri(String Ware_nbri) {
		this.ware_nbri = Ware_nbri;
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
	 * @return plan_date
	 *			預定到廠日
	 */
	public Date getPlan_date() {
		return plan_date;
	}

	/**
	 * @param plan_date
	 *			預定到廠日
	 */
	public void setPlan_date(Date Plan_date) {
		this.plan_date = Plan_date;
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
	 * @return acc_id
	 *			會計科目
	 */
	public String getAcc_id() {
		return acc_id;
	}

	/**
	 * @param acc_id
	 *			會計科目
	 */
	public void setAcc_id(String Acc_id) {
		this.acc_id = Acc_id;
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
	 * @return sure
	 *			核准
	 */
	public Integer getSure() {
		return sure;
	}

	/**
	 * @param sure
	 *			核准
	 */
	public void setSure(Integer Sure) {
		this.sure = Sure;
	}
		/**
	 * @return work_nbr
	 *			工程號
	 */
	public String getWork_nbr() {
		return work_nbr;
	}

	/**
	 * @param work_nbr
	 *			工程號
	 */
	public void setWork_nbr(String Work_nbr) {
		this.work_nbr = Work_nbr;
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

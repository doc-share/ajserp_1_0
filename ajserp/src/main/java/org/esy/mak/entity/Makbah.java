package org.esy.mak.entity;

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
 *  @date Fri Jul 31 14:33:59 CST 2020
 */
@Entity
@Table(name = "mak_bah" ,indexes = { @Index(name = "created", columnList = "created"), 
@Index(name = "updated", columnList = "updated")})
@EntityInfo("製造命令單")
public class Makbah extends BaseProperties {

	private static final long serialVersionUID = 1L;

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

	@FieldInfo("狀態")
	@FilterInfo(ListValue = "")
	@Column(name = "status", length =32  )
	private String status ;

	@FieldInfo("預計完工日")
	@FilterInfo(ListValue = "")
	@Column(name = "plan_date")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date plan_date;

	@FieldInfo("實際完工日")
	@FilterInfo(ListValue = "")
	@Column(name = "actu_date")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date actu_date;

	@FieldInfo("備註")
	@FilterInfo(ListValue = "")
	@Column(name = "remark", length =128  )
	private String remark ;

	@FieldInfo("製單人")
	@FilterInfo(ListValue = "")
	@Column(name = "user", length =32  )
	private String user ;

	@FieldInfo("製令核准")
	@FilterInfo(ListValue = "")
	@Column(name = "ctl", length =32  )
	private String ctl ;

	@FieldInfo("使用者代碼")
	@FilterInfo(ListValue = "")
	@Column(name = "user_code", length =32  )
	private String user_code ;

	@FieldInfo("制單人員")
	@FilterInfo(ListValue = "")
	@Column(name = "sale_id", length =32  )
	private String sale_id ;

	@FieldInfo("排程日期")
	@FilterInfo(ListValue = "")
	@Column(name = "mark_date")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date mark_date;

	@FieldInfo("訂單編號")
	@FilterInfo(ListValue = "")
	@Column(name = "ord_nbr", length =32  )
	private String ord_nbr ;

	@FieldInfo("客戶訂單編號")
	@FilterInfo(ListValue = "")
	@Column(name = "desc_no", length =32  )
	private String desc_no ;

	@FieldInfo("生產工號")
	@FilterInfo(ListValue = "")
	@Column(name = "pps_nbr", length =32  )
	private String pps_nbr ;

	@FieldInfo("生產工單序號")
	@FilterInfo(ListValue = "")
	@Column(name = "pps_ioseq", length =32  )
	private String pps_ioseq ;

	@FieldInfo("是否完全領料")
	@FilterInfo(ListValue = "")
	@Column(name = "is_clt")
	private Integer is_clt;

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

	@FieldInfo("產品代號")
	@FilterInfo(ListValue = "")
	@Column(name = "item_nbr", length =32  )
	private String item_nbr ;

	@FieldInfo("訂單編號")
	@FilterInfo(ListValue = "")
	@Column(name = "ord_nbr1", length =32  )
	private String ord_nbr1 ;

	@FieldInfo("總工時")
	@FilterInfo(ListValue = "")
	@Column(name = "hours")
	private Double hours;

	@FieldInfo("生產數量")
	@FilterInfo(ListValue = "")
	@Column(name = "qty")
	private Double qty;

	@FieldInfo("完工量")
	@FilterInfo(ListValue = "")
	@Column(name = "ioqty")
	private Double ioqty;

	@FieldInfo("訂單明細序號")
	@FilterInfo(ListValue = "")
	@Column(name = "ord_ioseq", length =32  )
	private String ord_ioseq ;

	@FieldInfo("單位")
	@FilterInfo(ListValue = "")
	@Column(name = "unit", length =32  )
	private String unit ;

	@FieldInfo("制程代號")
	@FilterInfo(ListValue = "")
	@Column(name = "pro_nbr", length =32  )
	private String pro_nbr ;

	@FieldInfo("成品入庫量")
	@FilterInfo(ListValue = "")
	@Column(name = "tar_qty")
	private Double tar_qty;

	@FieldInfo("Y已轉採購")
	@FilterInfo(ListValue = "")
	@Column(name = "pur_ctl", length =32  )
	private String pur_ctl ;


     /**
	 *
	 * 构造函数
	 *
	 */
	public Makbah() {
		super();
	}
	
	/**
	 *
	 * 构造函数
	 *
	 	 * @param nbr
	 *		  單據號碼
	 * 
	 	 * @param nbrdate
	 *		  日期
	 * 
	 	 * @param status
	 *		  狀態
	 * 
	 	 * @param plan_date
	 *		  預計完工日
	 * 
	 	 * @param actu_date
	 *		  實際完工日
	 * 
	 	 * @param remark
	 *		  備註
	 * 
	 	 * @param user
	 *		  製單人
	 * 
	 	 * @param ctl
	 *		  製令核准
	 * 
	 	 * @param user_code
	 *		  使用者代碼
	 * 
	 	 * @param sale_id
	 *		  制單人員
	 * 
	 	 * @param mark_date
	 *		  排程日期
	 * 
	 	 * @param ord_nbr
	 *		  訂單編號
	 * 
	 	 * @param desc_no
	 *		  客戶訂單編號
	 * 
	 	 * @param pps_nbr
	 *		  生產工號
	 * 
	 	 * @param pps_ioseq
	 *		  生產工單序號
	 * 
	 	 * @param is_clt
	 *		  是否完全領料
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
	 	 * @param item_nbr
	 *		  產品代號
	 * 
	 	 * @param ord_nbr1
	 *		  訂單編號
	 * 
	 	 * @param hours
	 *		  總工時
	 * 
	 	 * @param qty
	 *		  生產數量
	 * 
	 	 * @param ioqty
	 *		  完工量
	 * 
	 	 * @param ord_ioseq
	 *		  訂單明細序號
	 * 
	 	 * @param unit
	 *		  單位
	 * 
	 	 * @param pro_nbr
	 *		  制程代號
	 * 
	 	 * @param tar_qty
	 *		  成品入庫量
	 * 
	 	 * @param pur_ctl
	 *		  Y已轉採購
	 * 
	 	 */
    	public Makbah( String nbr, Date nbrdate, String status, Date plan_date, Date actu_date, String remark, String user, String ctl, String user_code, String sale_id, Date mark_date, String ord_nbr, String desc_no, String pps_nbr, String pps_ioseq, Integer is_clt, Date crt_date, String crt_user, Date edit_date, String edit_user, String tranok, String tranop, Integer trancnt, String item_nbr, String ord_nbr1, Double hours, Double qty, Double ioqty, String ord_ioseq, String unit, String pro_nbr, Double tar_qty, String pur_ctl ) {
		super();
				this.nbr = nbr;
				this.nbrdate = nbrdate;
				this.status = status;
				this.plan_date = plan_date;
				this.actu_date = actu_date;
				this.remark = remark;
				this.user = user;
				this.ctl = ctl;
				this.user_code = user_code;
				this.sale_id = sale_id;
				this.mark_date = mark_date;
				this.ord_nbr = ord_nbr;
				this.desc_no = desc_no;
				this.pps_nbr = pps_nbr;
				this.pps_ioseq = pps_ioseq;
				this.is_clt = is_clt;
				this.crt_date = crt_date;
				this.crt_user = crt_user;
				this.edit_date = edit_date;
				this.edit_user = edit_user;
				this.tranok = tranok;
				this.tranop = tranop;
				this.trancnt = trancnt;
				this.item_nbr = item_nbr;
				this.ord_nbr1 = ord_nbr1;
				this.hours = hours;
				this.qty = qty;
				this.ioqty = ioqty;
				this.ord_ioseq = ord_ioseq;
				this.unit = unit;
				this.pro_nbr = pro_nbr;
				this.tar_qty = tar_qty;
				this.pur_ctl = pur_ctl;
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
	 * @return plan_date
	 *			預計完工日
	 */
	public Date getPlan_date() {
		return plan_date;
	}

	/**
	 * @param plan_date
	 *			預計完工日
	 */
	public void setPlan_date(Date Plan_date) {
		this.plan_date = Plan_date;
	}
		/**
	 * @return actu_date
	 *			實際完工日
	 */
	public Date getActu_date() {
		return actu_date;
	}

	/**
	 * @param actu_date
	 *			實際完工日
	 */
	public void setActu_date(Date Actu_date) {
		this.actu_date = Actu_date;
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
	 * @return user
	 *			製單人
	 */
	public String getUser() {
		return user;
	}

	/**
	 * @param user
	 *			製單人
	 */
	public void setUser(String User) {
		this.user = User;
	}
		/**
	 * @return ctl
	 *			製令核准
	 */
	public String getCtl() {
		return ctl;
	}

	/**
	 * @param ctl
	 *			製令核准
	 */
	public void setCtl(String Ctl) {
		this.ctl = Ctl;
	}
		/**
	 * @return user_code
	 *			使用者代碼
	 */
	public String getUser_code() {
		return user_code;
	}

	/**
	 * @param user_code
	 *			使用者代碼
	 */
	public void setUser_code(String User_code) {
		this.user_code = User_code;
	}
		/**
	 * @return sale_id
	 *			制單人員
	 */
	public String getSale_id() {
		return sale_id;
	}

	/**
	 * @param sale_id
	 *			制單人員
	 */
	public void setSale_id(String Sale_id) {
		this.sale_id = Sale_id;
	}
		/**
	 * @return mark_date
	 *			排程日期
	 */
	public Date getMark_date() {
		return mark_date;
	}

	/**
	 * @param mark_date
	 *			排程日期
	 */
	public void setMark_date(Date Mark_date) {
		this.mark_date = Mark_date;
	}
		/**
	 * @return ord_nbr
	 *			訂單編號
	 */
	public String getOrd_nbr() {
		return ord_nbr;
	}

	/**
	 * @param ord_nbr
	 *			訂單編號
	 */
	public void setOrd_nbr(String Ord_nbr) {
		this.ord_nbr = Ord_nbr;
	}
		/**
	 * @return desc_no
	 *			客戶訂單編號
	 */
	public String getDesc_no() {
		return desc_no;
	}

	/**
	 * @param desc_no
	 *			客戶訂單編號
	 */
	public void setDesc_no(String Desc_no) {
		this.desc_no = Desc_no;
	}
		/**
	 * @return pps_nbr
	 *			生產工號
	 */
	public String getPps_nbr() {
		return pps_nbr;
	}

	/**
	 * @param pps_nbr
	 *			生產工號
	 */
	public void setPps_nbr(String Pps_nbr) {
		this.pps_nbr = Pps_nbr;
	}
		/**
	 * @return pps_ioseq
	 *			生產工單序號
	 */
	public String getPps_ioseq() {
		return pps_ioseq;
	}

	/**
	 * @param pps_ioseq
	 *			生產工單序號
	 */
	public void setPps_ioseq(String Pps_ioseq) {
		this.pps_ioseq = Pps_ioseq;
	}
		/**
	 * @return is_clt
	 *			是否完全領料
	 */
	public Integer getIs_clt() {
		return is_clt;
	}

	/**
	 * @param is_clt
	 *			是否完全領料
	 */
	public void setIs_clt(Integer Is_clt) {
		this.is_clt = Is_clt;
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
		/**
	 * @return item_nbr
	 *			產品代號
	 */
	public String getItem_nbr() {
		return item_nbr;
	}

	/**
	 * @param item_nbr
	 *			產品代號
	 */
	public void setItem_nbr(String Item_nbr) {
		this.item_nbr = Item_nbr;
	}
		/**
	 * @return ord_nbr1
	 *			訂單編號
	 */
	public String getOrd_nbr1() {
		return ord_nbr1;
	}

	/**
	 * @param ord_nbr1
	 *			訂單編號
	 */
	public void setOrd_nbr1(String Ord_nbr1) {
		this.ord_nbr1 = Ord_nbr1;
	}
		/**
	 * @return hours
	 *			總工時
	 */
	public Double getHours() {
		return hours;
	}

	/**
	 * @param hours
	 *			總工時
	 */
	public void setHours(Double Hours) {
		this.hours = Hours;
	}
		/**
	 * @return qty
	 *			生產數量
	 */
	public Double getQty() {
		return qty;
	}

	/**
	 * @param qty
	 *			生產數量
	 */
	public void setQty(Double Qty) {
		this.qty = Qty;
	}
		/**
	 * @return ioqty
	 *			完工量
	 */
	public Double getIoqty() {
		return ioqty;
	}

	/**
	 * @param ioqty
	 *			完工量
	 */
	public void setIoqty(Double Ioqty) {
		this.ioqty = Ioqty;
	}
		/**
	 * @return ord_ioseq
	 *			訂單明細序號
	 */
	public String getOrd_ioseq() {
		return ord_ioseq;
	}

	/**
	 * @param ord_ioseq
	 *			訂單明細序號
	 */
	public void setOrd_ioseq(String Ord_ioseq) {
		this.ord_ioseq = Ord_ioseq;
	}
		/**
	 * @return unit
	 *			單位
	 */
	public String getUnit() {
		return unit;
	}

	/**
	 * @param unit
	 *			單位
	 */
	public void setUnit(String Unit) {
		this.unit = Unit;
	}
		/**
	 * @return pro_nbr
	 *			制程代號
	 */
	public String getPro_nbr() {
		return pro_nbr;
	}

	/**
	 * @param pro_nbr
	 *			制程代號
	 */
	public void setPro_nbr(String Pro_nbr) {
		this.pro_nbr = Pro_nbr;
	}
		/**
	 * @return tar_qty
	 *			成品入庫量
	 */
	public Double getTar_qty() {
		return tar_qty;
	}

	/**
	 * @param tar_qty
	 *			成品入庫量
	 */
	public void setTar_qty(Double Tar_qty) {
		this.tar_qty = Tar_qty;
	}
		/**
	 * @return pur_ctl
	 *			Y已轉採購
	 */
	public String getPur_ctl() {
		return pur_ctl;
	}

	/**
	 * @param pur_ctl
	 *			Y已轉採購
	 */
	public void setPur_ctl(String Pur_ctl) {
		this.pur_ctl = Pur_ctl;
	}
	
}

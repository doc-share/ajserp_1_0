package org.esy.bas.entity;

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
 *  @date Thu Jul 23 17:19:46 CST 2020
 */
@Entity
@Table(name = "cus_cus" ,indexes = { @Index(name = "created", columnList = "created"), 
@Index(name = "updated", columnList = "updated")})
@EntityInfo("客戶主檔")
public class Cuscus extends BaseProperties {

	private static final long serialVersionUID = 1L;

	@FieldInfo("客戶編號")
	@FilterInfo(ListValue = "")
	@Column(name = "cus_nbr", length =32  )
	private String cus_nbr ;

	@FieldInfo("譯音碼")
	@FilterInfo(ListValue = "")
	@Column(name = "big_key", length =32  )
	private String big_key ;

	@FieldInfo("地區名稱")
	@FilterInfo(ListValue = "")
	@Column(name = "area_nbr", length =32  )
	private String area_nbr ;

	@FieldInfo("客戶簡稱")
	@FilterInfo(ListValue = "")
	@Column(name = "cus_alias", length =32  )
	private String cus_alias ;

	@FieldInfo("客戶名稱")
	@FilterInfo(ListValue = "")
	@Column(name = "cus_name", length =128  )
	private String cus_name ;

	@FieldInfo("客戶地址")
	@FilterInfo(ListValue = "")
	@Column(name = "cus_addr", length =128  )
	private String cus_addr ;

	@FieldInfo("送貨地址")
	@FilterInfo(ListValue = "")
	@Column(name = "sen_addr", length =128  )
	private String sen_addr ;

	@FieldInfo("發票地址")
	@FilterInfo(ListValue = "")
	@Column(name = "ivc_addr", length =128  )
	private String ivc_addr ;

	@FieldInfo("E-MAIL地址")
	@FilterInfo(ListValue = "")
	@Column(name = "email_addr", length =128  )
	private String email_addr ;

	@FieldInfo("英文名稱")
	@FilterInfo(ListValue = "")
	@Column(name = "eng_name", length =32  )
	private String eng_name ;

	@FieldInfo("英文地址")
	@FilterInfo(ListValue = "")
	@Column(name = "addr_e", length =32  )
	private String addr_e ;

	@FieldInfo("統一編號")
	@FilterInfo(ListValue = "")
	@Column(name = "cus_gun", length =32  )
	private String cus_gun ;

	@FieldInfo("客戶電話1")
	@FilterInfo(ListValue = "")
	@Column(name = "cus_tel1", length =32  )
	private String cus_tel1 ;

	@FieldInfo("客戶電話2")
	@FilterInfo(ListValue = "")
	@Column(name = "cus_tel2", length =32  )
	private String cus_tel2 ;

	@FieldInfo("傳真機號碼")
	@FilterInfo(ListValue = "")
	@Column(name = "cus_fax", length =32  )
	private String cus_fax ;

	@FieldInfo("負責人")
	@FilterInfo(ListValue = "")
	@Column(name = "attname", length =32  )
	private String attname ;

	@FieldInfo("連絡人1")
	@FilterInfo(ListValue = "")
	@Column(name = "attname1", length =32  )
	private String attname1 ;

	@FieldInfo("連絡人2")
	@FilterInfo(ListValue = "")
	@Column(name = "attname2", length =32  )
	private String attname2 ;

	@FieldInfo("資本額")
	@FilterInfo(ListValue = "")
	@Column(name = "oew_amt")
	private Integer oew_amt;

	@FieldInfo("年營業額")
	@FilterInfo(ListValue = "")
	@Column(name = "acc_amt")
	private Integer acc_amt;

	@FieldInfo("創立日期")
	@FilterInfo(ListValue = "")
	@Column(name = "beg_date")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date beg_date;

	@FieldInfo("訂貨習慣")
	@FilterInfo(ListValue = "")
	@Column(name = "remark1", length =32  )
	private String remark1 ;

	@FieldInfo("客戶評等")
	@FilterInfo(ListValue = "")
	@Column(name = "remark2", length =32  )
	private String remark2 ;

	@FieldInfo("客戶性質")
	@FilterInfo(ListValue = "")
	@Column(name = "remark3", length =32  )
	private String remark3 ;

	@FieldInfo("客戶類別")
	@FilterInfo(ListValue = "")
	@Column(name = "remark4", length =32  )
	private String remark4 ;

	@FieldInfo("開發票方式")
	@FilterInfo(ListValue = "")
	@Column(name = "remark5", length =32  )
	private String remark5 ;

	@FieldInfo("業種別")
	@FilterInfo(ListValue = "")
	@Column(name = "remark6", length =32  )
	private String remark6 ;

	@FieldInfo("收款方式")
	@FilterInfo(ListValue = "")
	@Column(name = "remark7", length =32  )
	private String remark7 ;

	@FieldInfo("交易方式")
	@FilterInfo(ListValue = "")
	@Column(name = "pay_term", length =32  )
	private String pay_term ;

	@FieldInfo("稅別")
	@FilterInfo(ListValue = "")
	@Column(name = "tax_type", length =32  )
	private String tax_type ;

	@FieldInfo("月結日")
	@FilterInfo(ListValue = "")
	@Column(name = "days", length =32  )
	private String days ;

	@FieldInfo("付票票期")
	@FilterInfo(ListValue = "")
	@Column(name = "days1", length =32  )
	private String days1 ;

	@FieldInfo("請款日")
	@FilterInfo(ListValue = "")
	@Column(name = "days2", length =32  )
	private String days2 ;

	@FieldInfo("付款日")
	@FilterInfo(ListValue = "")
	@Column(name = "days3", length =32  )
	private String days3 ;

	@FieldInfo("開始交易日")
	@FilterInfo(ListValue = "")
	@Column(name = "ddate")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date ddate;

	@FieldInfo("營業項目")
	@FilterInfo(ListValue = "")
	@Column(name = "sale_inv", length =128  )
	private String sale_inv ;

	@FieldInfo("單價等級")
	@FilterInfo(ListValue = "")
	@Column(name = "cus_lev", length =32  )
	private String cus_lev ;

	@FieldInfo("業務員")
	@FilterInfo(ListValue = "")
	@Column(name = "sale_nbr", length =32  )
	private String sale_nbr ;

	@FieldInfo("授信額度")
	@FilterInfo(ListValue = "")
	@Column(name = "tot_amt")
	private Double tot_amt;

	@FieldInfo("備註")
	@FilterInfo(ListValue = "")
	@Column(name = "remark", columnDefinition = "TEXT")
	private String remark;

	@FieldInfo("最近異動日期")
	@FilterInfo(ListValue = "")
	@Column(name = "l_update")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date l_update;

	@FieldInfo("最近交易日期")
	@FilterInfo(ListValue = "")
	@Column(name = "l_shpdate")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date l_shpdate;

	@FieldInfo("建檔日期")
	@FilterInfo(ListValue = "")
	@Column(name = "cre_date")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date cre_date;

	@FieldInfo("嘜頭最後編輯日期")
	@FilterInfo(ListValue = "")
	@Column(name = "m_date")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date m_date;

	@FieldInfo("嘜頭LOG圖形")
	@FilterInfo(ListValue = "")
	@Column(name = "logtype", length =32  )
	private String logtype ;

	@FieldInfo("嘜頭LOG文字")
	@FilterInfo(ListValue = "")
	@Column(name = "logtxt", length =32  )
	private String logtxt ;

	@FieldInfo("正嘜頭")
	@FilterInfo(ListValue = "")
	@Column(name = "fmiltle", length =32  )
	private String fmiltle ;

	@FieldInfo("側嘜頭")
	@FilterInfo(ListValue = "")
	@Column(name = "dmiltle", length =32  )
	private String dmiltle ;

	@FieldInfo("分機1")
	@FilterInfo(ListValue = "")
	@Column(name = "cus_oth1", length =32  )
	private String cus_oth1 ;

	@FieldInfo("分機2")
	@FilterInfo(ListValue = "")
	@Column(name = "cus_oth2", length =32  )
	private String cus_oth2 ;

	@FieldInfo("手機號碼")
	@FilterInfo(ListValue = "")
	@Column(name = "cellphone", length =32  )
	private String cellphone ;

	@FieldInfo("會計")
	@FilterInfo(ListValue = "")
	@Column(name = "acounter", length =32  )
	private String acounter ;

	@FieldInfo("電話3")
	@FilterInfo(ListValue = "")
	@Column(name = "a_tel", length =32  )
	private String a_tel ;

	@FieldInfo("分機3")
	@FilterInfo(ListValue = "")
	@Column(name = "a_oth", length =32  )
	private String a_oth ;

	@FieldInfo("網站")
	@FilterInfo(ListValue = "")
	@Column(name = "http", length =128  )
	private String http ;

	@FieldInfo("郵遞區號")
	@FilterInfo(ListValue = "")
	@Column(name = "mail_nbr", length =32  )
	private String mail_nbr ;

	@FieldInfo("郵遞區號")
	@FilterInfo(ListValue = "")
	@Column(name = "mail_no1", length =32  )
	private String mail_no1 ;

	@FieldInfo("郵遞區號")
	@FilterInfo(ListValue = "")
	@Column(name = "mail_no2", length =32  )
	private String mail_no2 ;

	@FieldInfo("業務性質")
	@FilterInfo(ListValue = "")
	@Column(name = "shp_desc", length =128  )
	private String shp_desc ;

	@FieldInfo("業務說明")
	@FilterInfo(ListValue = "")
	@Column(name = "shp_1", length =128  )
	private String shp_1 ;

	@FieldInfo("服務別")
	@FilterInfo(ListValue = "")
	@Column(name = "service_tp", length =32  )
	private String service_tp ;

	@FieldInfo("稅額計算方式")
	@FilterInfo(ListValue = "")
	@Column(name = "tax_cal")
	private Integer tax_cal;

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

	@FieldInfo("是否列印請款標簽")
	@FilterInfo(ListValue = "")
	@Column(name = "is_acr_lbl")
	private Integer is_acr_lbl;

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

	@FieldInfo(" 使用電子發票交換")
	@FilterInfo(ListValue = "")
	@Column(name = "isdz_jf")
	private Integer isdz_jf;

	@FieldInfo("幣別")
	@FilterInfo(ListValue = "")
	@Column(name = "coin_nbr", length =32  )
	private String coin_nbr ;


     /**
	 *
	 * 构造函数
	 *
	 */
	public Cuscus() {
		super();
	}
	
	/**
	 *
	 * 构造函数
	 *
	 	 * @param cus_nbr
	 *		  客戶編號
	 * 
	 	 * @param big_key
	 *		  譯音碼
	 * 
	 	 * @param area_nbr
	 *		  地區名稱
	 * 
	 	 * @param cus_alias
	 *		  客戶簡稱
	 * 
	 	 * @param cus_name
	 *		  客戶名稱
	 * 
	 	 * @param cus_addr
	 *		  客戶地址
	 * 
	 	 * @param sen_addr
	 *		  送貨地址
	 * 
	 	 * @param ivc_addr
	 *		  發票地址
	 * 
	 	 * @param email_addr
	 *		  E-MAIL地址
	 * 
	 	 * @param eng_name
	 *		  英文名稱
	 * 
	 	 * @param addr_e
	 *		  英文地址
	 * 
	 	 * @param cus_gun
	 *		  統一編號
	 * 
	 	 * @param cus_tel1
	 *		  客戶電話1
	 * 
	 	 * @param cus_tel2
	 *		  客戶電話2
	 * 
	 	 * @param cus_fax
	 *		  傳真機號碼
	 * 
	 	 * @param attname
	 *		  負責人
	 * 
	 	 * @param attname1
	 *		  連絡人1
	 * 
	 	 * @param attname2
	 *		  連絡人2
	 * 
	 	 * @param oew_amt
	 *		  資本額
	 * 
	 	 * @param acc_amt
	 *		  年營業額
	 * 
	 	 * @param beg_date
	 *		  創立日期
	 * 
	 	 * @param remark1
	 *		  訂貨習慣
	 * 
	 	 * @param remark2
	 *		  客戶評等
	 * 
	 	 * @param remark3
	 *		  客戶性質
	 * 
	 	 * @param remark4
	 *		  客戶類別
	 * 
	 	 * @param remark5
	 *		  開發票方式
	 * 
	 	 * @param remark6
	 *		  業種別
	 * 
	 	 * @param remark7
	 *		  收款方式
	 * 
	 	 * @param pay_term
	 *		  交易方式
	 * 
	 	 * @param tax_type
	 *		  稅別
	 * 
	 	 * @param days
	 *		  月結日
	 * 
	 	 * @param days1
	 *		  付票票期
	 * 
	 	 * @param days2
	 *		  請款日
	 * 
	 	 * @param days3
	 *		  付款日
	 * 
	 	 * @param ddate
	 *		  開始交易日
	 * 
	 	 * @param sale_inv
	 *		  營業項目
	 * 
	 	 * @param cus_lev
	 *		  單價等級
	 * 
	 	 * @param sale_nbr
	 *		  業務員
	 * 
	 	 * @param tot_amt
	 *		  授信額度
	 * 
	 	 * @param remark
	 *		  備註
	 * 
	 	 * @param l_update
	 *		  最近異動日期
	 * 
	 	 * @param l_shpdate
	 *		  最近交易日期
	 * 
	 	 * @param cre_date
	 *		  建檔日期
	 * 
	 	 * @param m_date
	 *		  嘜頭最後編輯日期
	 * 
	 	 * @param logtype
	 *		  嘜頭LOG圖形
	 * 
	 	 * @param logtxt
	 *		  嘜頭LOG文字
	 * 
	 	 * @param fmiltle
	 *		  正嘜頭
	 * 
	 	 * @param dmiltle
	 *		  側嘜頭
	 * 
	 	 * @param cus_oth1
	 *		  分機1
	 * 
	 	 * @param cus_oth2
	 *		  分機2
	 * 
	 	 * @param cellphone
	 *		  手機號碼
	 * 
	 	 * @param acounter
	 *		  會計
	 * 
	 	 * @param a_tel
	 *		  電話3
	 * 
	 	 * @param a_oth
	 *		  分機3
	 * 
	 	 * @param http
	 *		  網站
	 * 
	 	 * @param mail_nbr
	 *		  郵遞區號
	 * 
	 	 * @param mail_no1
	 *		  郵遞區號
	 * 
	 	 * @param mail_no2
	 *		  郵遞區號
	 * 
	 	 * @param shp_desc
	 *		  業務性質
	 * 
	 	 * @param shp_1
	 *		  業務說明
	 * 
	 	 * @param service_tp
	 *		  服務別
	 * 
	 	 * @param tax_cal
	 *		  稅額計算方式
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
	 	 * @param is_acr_lbl
	 *		  是否列印請款標簽
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
	 	 * @param isdz_jf
	 *		   使用電子發票交換
	 * 
	 	 * @param coin_nbr
	 *		  幣別
	 * 
	 	 */
    	public Cuscus( String cus_nbr, String big_key, String area_nbr, String cus_alias, String cus_name, String cus_addr, String sen_addr, String ivc_addr, String email_addr, String eng_name, String addr_e, String cus_gun, String cus_tel1, String cus_tel2, String cus_fax, String attname, String attname1, String attname2, Integer oew_amt, Integer acc_amt, Date beg_date, String remark1, String remark2, String remark3, String remark4, String remark5, String remark6, String remark7, String pay_term, String tax_type, String days, String days1, String days2, String days3, Date ddate, String sale_inv, String cus_lev, String sale_nbr, Double tot_amt, String remark, Date l_update, Date l_shpdate, Date cre_date, Date m_date, String logtype, String logtxt, String fmiltle, String dmiltle, String cus_oth1, String cus_oth2, String cellphone, String acounter, String a_tel, String a_oth, String http, String mail_nbr, String mail_no1, String mail_no2, String shp_desc, String shp_1, String service_tp, Integer tax_cal, Date crt_date, String crt_user, Date edit_date, String edit_user, Integer is_acr_lbl, String tranok, String tranop, Integer trancnt, Integer isdz_jf, String coin_nbr ) {
		super();
				this.cus_nbr = cus_nbr;
				this.big_key = big_key;
				this.area_nbr = area_nbr;
				this.cus_alias = cus_alias;
				this.cus_name = cus_name;
				this.cus_addr = cus_addr;
				this.sen_addr = sen_addr;
				this.ivc_addr = ivc_addr;
				this.email_addr = email_addr;
				this.eng_name = eng_name;
				this.addr_e = addr_e;
				this.cus_gun = cus_gun;
				this.cus_tel1 = cus_tel1;
				this.cus_tel2 = cus_tel2;
				this.cus_fax = cus_fax;
				this.attname = attname;
				this.attname1 = attname1;
				this.attname2 = attname2;
				this.oew_amt = oew_amt;
				this.acc_amt = acc_amt;
				this.beg_date = beg_date;
				this.remark1 = remark1;
				this.remark2 = remark2;
				this.remark3 = remark3;
				this.remark4 = remark4;
				this.remark5 = remark5;
				this.remark6 = remark6;
				this.remark7 = remark7;
				this.pay_term = pay_term;
				this.tax_type = tax_type;
				this.days = days;
				this.days1 = days1;
				this.days2 = days2;
				this.days3 = days3;
				this.ddate = ddate;
				this.sale_inv = sale_inv;
				this.cus_lev = cus_lev;
				this.sale_nbr = sale_nbr;
				this.tot_amt = tot_amt;
				this.remark = remark;
				this.l_update = l_update;
				this.l_shpdate = l_shpdate;
				this.cre_date = cre_date;
				this.m_date = m_date;
				this.logtype = logtype;
				this.logtxt = logtxt;
				this.fmiltle = fmiltle;
				this.dmiltle = dmiltle;
				this.cus_oth1 = cus_oth1;
				this.cus_oth2 = cus_oth2;
				this.cellphone = cellphone;
				this.acounter = acounter;
				this.a_tel = a_tel;
				this.a_oth = a_oth;
				this.http = http;
				this.mail_nbr = mail_nbr;
				this.mail_no1 = mail_no1;
				this.mail_no2 = mail_no2;
				this.shp_desc = shp_desc;
				this.shp_1 = shp_1;
				this.service_tp = service_tp;
				this.tax_cal = tax_cal;
				this.crt_date = crt_date;
				this.crt_user = crt_user;
				this.edit_date = edit_date;
				this.edit_user = edit_user;
				this.is_acr_lbl = is_acr_lbl;
				this.tranok = tranok;
				this.tranop = tranop;
				this.trancnt = trancnt;
				this.isdz_jf = isdz_jf;
				this.coin_nbr = coin_nbr;
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
	 * @return big_key
	 *			譯音碼
	 */
	public String getBig_key() {
		return big_key;
	}

	/**
	 * @param big_key
	 *			譯音碼
	 */
	public void setBig_key(String Big_key) {
		this.big_key = Big_key;
	}
		/**
	 * @return area_nbr
	 *			地區名稱
	 */
	public String getArea_nbr() {
		return area_nbr;
	}

	/**
	 * @param area_nbr
	 *			地區名稱
	 */
	public void setArea_nbr(String Area_nbr) {
		this.area_nbr = Area_nbr;
	}
		/**
	 * @return cus_alias
	 *			客戶簡稱
	 */
	public String getCus_alias() {
		return cus_alias;
	}

	/**
	 * @param cus_alias
	 *			客戶簡稱
	 */
	public void setCus_alias(String Cus_alias) {
		this.cus_alias = Cus_alias;
	}
		/**
	 * @return cus_name
	 *			客戶名稱
	 */
	public String getCus_name() {
		return cus_name;
	}

	/**
	 * @param cus_name
	 *			客戶名稱
	 */
	public void setCus_name(String Cus_name) {
		this.cus_name = Cus_name;
	}
		/**
	 * @return cus_addr
	 *			客戶地址
	 */
	public String getCus_addr() {
		return cus_addr;
	}

	/**
	 * @param cus_addr
	 *			客戶地址
	 */
	public void setCus_addr(String Cus_addr) {
		this.cus_addr = Cus_addr;
	}
		/**
	 * @return sen_addr
	 *			送貨地址
	 */
	public String getSen_addr() {
		return sen_addr;
	}

	/**
	 * @param sen_addr
	 *			送貨地址
	 */
	public void setSen_addr(String Sen_addr) {
		this.sen_addr = Sen_addr;
	}
		/**
	 * @return ivc_addr
	 *			發票地址
	 */
	public String getIvc_addr() {
		return ivc_addr;
	}

	/**
	 * @param ivc_addr
	 *			發票地址
	 */
	public void setIvc_addr(String Ivc_addr) {
		this.ivc_addr = Ivc_addr;
	}
		/**
	 * @return email_addr
	 *			E-MAIL地址
	 */
	public String getEmail_addr() {
		return email_addr;
	}

	/**
	 * @param email_addr
	 *			E-MAIL地址
	 */
	public void setEmail_addr(String Email_addr) {
		this.email_addr = Email_addr;
	}
		/**
	 * @return eng_name
	 *			英文名稱
	 */
	public String getEng_name() {
		return eng_name;
	}

	/**
	 * @param eng_name
	 *			英文名稱
	 */
	public void setEng_name(String Eng_name) {
		this.eng_name = Eng_name;
	}
		/**
	 * @return addr_e
	 *			英文地址
	 */
	public String getAddr_e() {
		return addr_e;
	}

	/**
	 * @param addr_e
	 *			英文地址
	 */
	public void setAddr_e(String Addr_e) {
		this.addr_e = Addr_e;
	}
		/**
	 * @return cus_gun
	 *			統一編號
	 */
	public String getCus_gun() {
		return cus_gun;
	}

	/**
	 * @param cus_gun
	 *			統一編號
	 */
	public void setCus_gun(String Cus_gun) {
		this.cus_gun = Cus_gun;
	}
		/**
	 * @return cus_tel1
	 *			客戶電話1
	 */
	public String getCus_tel1() {
		return cus_tel1;
	}

	/**
	 * @param cus_tel1
	 *			客戶電話1
	 */
	public void setCus_tel1(String Cus_tel1) {
		this.cus_tel1 = Cus_tel1;
	}
		/**
	 * @return cus_tel2
	 *			客戶電話2
	 */
	public String getCus_tel2() {
		return cus_tel2;
	}

	/**
	 * @param cus_tel2
	 *			客戶電話2
	 */
	public void setCus_tel2(String Cus_tel2) {
		this.cus_tel2 = Cus_tel2;
	}
		/**
	 * @return cus_fax
	 *			傳真機號碼
	 */
	public String getCus_fax() {
		return cus_fax;
	}

	/**
	 * @param cus_fax
	 *			傳真機號碼
	 */
	public void setCus_fax(String Cus_fax) {
		this.cus_fax = Cus_fax;
	}
		/**
	 * @return attname
	 *			負責人
	 */
	public String getAttname() {
		return attname;
	}

	/**
	 * @param attname
	 *			負責人
	 */
	public void setAttname(String Attname) {
		this.attname = Attname;
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
	 * @return attname2
	 *			連絡人2
	 */
	public String getAttname2() {
		return attname2;
	}

	/**
	 * @param attname2
	 *			連絡人2
	 */
	public void setAttname2(String Attname2) {
		this.attname2 = Attname2;
	}
		/**
	 * @return oew_amt
	 *			資本額
	 */
	public Integer getOew_amt() {
		return oew_amt;
	}

	/**
	 * @param oew_amt
	 *			資本額
	 */
	public void setOew_amt(Integer Oew_amt) {
		this.oew_amt = Oew_amt;
	}
		/**
	 * @return acc_amt
	 *			年營業額
	 */
	public Integer getAcc_amt() {
		return acc_amt;
	}

	/**
	 * @param acc_amt
	 *			年營業額
	 */
	public void setAcc_amt(Integer Acc_amt) {
		this.acc_amt = Acc_amt;
	}
		/**
	 * @return beg_date
	 *			創立日期
	 */
	public Date getBeg_date() {
		return beg_date;
	}

	/**
	 * @param beg_date
	 *			創立日期
	 */
	public void setBeg_date(Date Beg_date) {
		this.beg_date = Beg_date;
	}
		/**
	 * @return remark1
	 *			訂貨習慣
	 */
	public String getRemark1() {
		return remark1;
	}

	/**
	 * @param remark1
	 *			訂貨習慣
	 */
	public void setRemark1(String Remark1) {
		this.remark1 = Remark1;
	}
		/**
	 * @return remark2
	 *			客戶評等
	 */
	public String getRemark2() {
		return remark2;
	}

	/**
	 * @param remark2
	 *			客戶評等
	 */
	public void setRemark2(String Remark2) {
		this.remark2 = Remark2;
	}
		/**
	 * @return remark3
	 *			客戶性質
	 */
	public String getRemark3() {
		return remark3;
	}

	/**
	 * @param remark3
	 *			客戶性質
	 */
	public void setRemark3(String Remark3) {
		this.remark3 = Remark3;
	}
		/**
	 * @return remark4
	 *			客戶類別
	 */
	public String getRemark4() {
		return remark4;
	}

	/**
	 * @param remark4
	 *			客戶類別
	 */
	public void setRemark4(String Remark4) {
		this.remark4 = Remark4;
	}
		/**
	 * @return remark5
	 *			開發票方式
	 */
	public String getRemark5() {
		return remark5;
	}

	/**
	 * @param remark5
	 *			開發票方式
	 */
	public void setRemark5(String Remark5) {
		this.remark5 = Remark5;
	}
		/**
	 * @return remark6
	 *			業種別
	 */
	public String getRemark6() {
		return remark6;
	}

	/**
	 * @param remark6
	 *			業種別
	 */
	public void setRemark6(String Remark6) {
		this.remark6 = Remark6;
	}
		/**
	 * @return remark7
	 *			收款方式
	 */
	public String getRemark7() {
		return remark7;
	}

	/**
	 * @param remark7
	 *			收款方式
	 */
	public void setRemark7(String Remark7) {
		this.remark7 = Remark7;
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
	 * @return days
	 *			月結日
	 */
	public String getDays() {
		return days;
	}

	/**
	 * @param days
	 *			月結日
	 */
	public void setDays(String Days) {
		this.days = Days;
	}
		/**
	 * @return days1
	 *			付票票期
	 */
	public String getDays1() {
		return days1;
	}

	/**
	 * @param days1
	 *			付票票期
	 */
	public void setDays1(String Days1) {
		this.days1 = Days1;
	}
		/**
	 * @return days2
	 *			請款日
	 */
	public String getDays2() {
		return days2;
	}

	/**
	 * @param days2
	 *			請款日
	 */
	public void setDays2(String Days2) {
		this.days2 = Days2;
	}
		/**
	 * @return days3
	 *			付款日
	 */
	public String getDays3() {
		return days3;
	}

	/**
	 * @param days3
	 *			付款日
	 */
	public void setDays3(String Days3) {
		this.days3 = Days3;
	}
		/**
	 * @return ddate
	 *			開始交易日
	 */
	public Date getDdate() {
		return ddate;
	}

	/**
	 * @param ddate
	 *			開始交易日
	 */
	public void setDdate(Date Ddate) {
		this.ddate = Ddate;
	}
		/**
	 * @return sale_inv
	 *			營業項目
	 */
	public String getSale_inv() {
		return sale_inv;
	}

	/**
	 * @param sale_inv
	 *			營業項目
	 */
	public void setSale_inv(String Sale_inv) {
		this.sale_inv = Sale_inv;
	}
		/**
	 * @return cus_lev
	 *			單價等級
	 */
	public String getCus_lev() {
		return cus_lev;
	}

	/**
	 * @param cus_lev
	 *			單價等級
	 */
	public void setCus_lev(String Cus_lev) {
		this.cus_lev = Cus_lev;
	}
		/**
	 * @return sale_nbr
	 *			業務員
	 */
	public String getSale_nbr() {
		return sale_nbr;
	}

	/**
	 * @param sale_nbr
	 *			業務員
	 */
	public void setSale_nbr(String Sale_nbr) {
		this.sale_nbr = Sale_nbr;
	}
		/**
	 * @return tot_amt
	 *			授信額度
	 */
	public Double getTot_amt() {
		return tot_amt;
	}

	/**
	 * @param tot_amt
	 *			授信額度
	 */
	public void setTot_amt(Double Tot_amt) {
		this.tot_amt = Tot_amt;
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
	 * @return l_update
	 *			最近異動日期
	 */
	public Date getL_update() {
		return l_update;
	}

	/**
	 * @param l_update
	 *			最近異動日期
	 */
	public void setL_update(Date L_update) {
		this.l_update = L_update;
	}
		/**
	 * @return l_shpdate
	 *			最近交易日期
	 */
	public Date getL_shpdate() {
		return l_shpdate;
	}

	/**
	 * @param l_shpdate
	 *			最近交易日期
	 */
	public void setL_shpdate(Date L_shpdate) {
		this.l_shpdate = L_shpdate;
	}
		/**
	 * @return cre_date
	 *			建檔日期
	 */
	public Date getCre_date() {
		return cre_date;
	}

	/**
	 * @param cre_date
	 *			建檔日期
	 */
	public void setCre_date(Date Cre_date) {
		this.cre_date = Cre_date;
	}
		/**
	 * @return m_date
	 *			嘜頭最後編輯日期
	 */
	public Date getM_date() {
		return m_date;
	}

	/**
	 * @param m_date
	 *			嘜頭最後編輯日期
	 */
	public void setM_date(Date M_date) {
		this.m_date = M_date;
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
	 * @return cus_oth1
	 *			分機1
	 */
	public String getCus_oth1() {
		return cus_oth1;
	}

	/**
	 * @param cus_oth1
	 *			分機1
	 */
	public void setCus_oth1(String Cus_oth1) {
		this.cus_oth1 = Cus_oth1;
	}
		/**
	 * @return cus_oth2
	 *			分機2
	 */
	public String getCus_oth2() {
		return cus_oth2;
	}

	/**
	 * @param cus_oth2
	 *			分機2
	 */
	public void setCus_oth2(String Cus_oth2) {
		this.cus_oth2 = Cus_oth2;
	}
		/**
	 * @return cellphone
	 *			手機號碼
	 */
	public String getCellphone() {
		return cellphone;
	}

	/**
	 * @param cellphone
	 *			手機號碼
	 */
	public void setCellphone(String Cellphone) {
		this.cellphone = Cellphone;
	}
		/**
	 * @return acounter
	 *			會計
	 */
	public String getAcounter() {
		return acounter;
	}

	/**
	 * @param acounter
	 *			會計
	 */
	public void setAcounter(String Acounter) {
		this.acounter = Acounter;
	}
		/**
	 * @return a_tel
	 *			電話3
	 */
	public String getA_tel() {
		return a_tel;
	}

	/**
	 * @param a_tel
	 *			電話3
	 */
	public void setA_tel(String A_tel) {
		this.a_tel = A_tel;
	}
		/**
	 * @return a_oth
	 *			分機3
	 */
	public String getA_oth() {
		return a_oth;
	}

	/**
	 * @param a_oth
	 *			分機3
	 */
	public void setA_oth(String A_oth) {
		this.a_oth = A_oth;
	}
		/**
	 * @return http
	 *			網站
	 */
	public String getHttp() {
		return http;
	}

	/**
	 * @param http
	 *			網站
	 */
	public void setHttp(String Http) {
		this.http = Http;
	}
		/**
	 * @return mail_nbr
	 *			郵遞區號
	 */
	public String getMail_nbr() {
		return mail_nbr;
	}

	/**
	 * @param mail_nbr
	 *			郵遞區號
	 */
	public void setMail_nbr(String Mail_nbr) {
		this.mail_nbr = Mail_nbr;
	}
		/**
	 * @return mail_no1
	 *			郵遞區號
	 */
	public String getMail_no1() {
		return mail_no1;
	}

	/**
	 * @param mail_no1
	 *			郵遞區號
	 */
	public void setMail_no1(String Mail_no1) {
		this.mail_no1 = Mail_no1;
	}
		/**
	 * @return mail_no2
	 *			郵遞區號
	 */
	public String getMail_no2() {
		return mail_no2;
	}

	/**
	 * @param mail_no2
	 *			郵遞區號
	 */
	public void setMail_no2(String Mail_no2) {
		this.mail_no2 = Mail_no2;
	}
		/**
	 * @return shp_desc
	 *			業務性質
	 */
	public String getShp_desc() {
		return shp_desc;
	}

	/**
	 * @param shp_desc
	 *			業務性質
	 */
	public void setShp_desc(String Shp_desc) {
		this.shp_desc = Shp_desc;
	}
		/**
	 * @return shp_1
	 *			業務說明
	 */
	public String getShp_1() {
		return shp_1;
	}

	/**
	 * @param shp_1
	 *			業務說明
	 */
	public void setShp_1(String Shp_1) {
		this.shp_1 = Shp_1;
	}
		/**
	 * @return service_tp
	 *			服務別
	 */
	public String getService_tp() {
		return service_tp;
	}

	/**
	 * @param service_tp
	 *			服務別
	 */
	public void setService_tp(String Service_tp) {
		this.service_tp = Service_tp;
	}
		/**
	 * @return tax_cal
	 *			稅額計算方式
	 */
	public Integer getTax_cal() {
		return tax_cal;
	}

	/**
	 * @param tax_cal
	 *			稅額計算方式
	 */
	public void setTax_cal(Integer Tax_cal) {
		this.tax_cal = Tax_cal;
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
	 * @return is_acr_lbl
	 *			是否列印請款標簽
	 */
	public Integer getIs_acr_lbl() {
		return is_acr_lbl;
	}

	/**
	 * @param is_acr_lbl
	 *			是否列印請款標簽
	 */
	public void setIs_acr_lbl(Integer Is_acr_lbl) {
		this.is_acr_lbl = Is_acr_lbl;
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
	 * @return isdz_jf
	 *			 使用電子發票交換
	 */
	public Integer getIsdz_jf() {
		return isdz_jf;
	}

	/**
	 * @param isdz_jf
	 *			 使用電子發票交換
	 */
	public void setIsdz_jf(Integer Isdz_jf) {
		this.isdz_jf = Isdz_jf;
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
	
}

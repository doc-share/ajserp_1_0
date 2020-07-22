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
 *  @date Tue Jun 23 13:23:26 CST 2020
 */
@Entity
@Table(name = "cus_cus" ,indexes = { @Index(name = "created", columnList = "created"), 
@Index(name = "updated", columnList = "updated")})
@EntityInfo("cus_cus")
public class Cuscus extends BaseProperties {

	private static final long serialVersionUID = 1L;

	@FieldInfo("客戶編號")
	@FilterInfo(ListValue = "match", LovValue = "match")
	@Column(name = "cus_nbr", length =32  )
	private String cus_nbr ;

	@FieldInfo("客戶名稱")
	@FilterInfo(ListValue = "match", LovValue = "match")
	@Column(name = "cus_name", length =64  )
	private String cus_name ;

	@FieldInfo("客戶電話1")
	@FilterInfo(ListValue = "")
	@Column(name = "cus_tel1", length =32  )
	private String cus_tel1 ;

	@FieldInfo("譯音碼")
	@FilterInfo(ListValue = "")
	@Column(name = "big_key", length =32  )
	private String big_key ;

	@FieldInfo("地區名稱")
	@FilterInfo(ListValue = "")
	@Column(name = "area_nbr", length =32  )
	private String area_nbr ;

	@FieldInfo("組別")
	@FilterInfo(ListValue = "")
	@Column(name = "group_nbr", length =32  )
	private String group_nbr ;

	@FieldInfo("客戶簡稱")
	@FilterInfo(ListValue = "")
	@Column(name = "cus_alias", length =32  )
	private String cus_alias ;

	@FieldInfo("客戶地址")
	@FilterInfo(ListValue = "")
	@Column(name = "cus_addr", length =32  )
	private String cus_addr ;

	@FieldInfo("送貨地址")
	@FilterInfo(ListValue = "")
	@Column(name = "sen_addr", length =32  )
	private String sen_addr ;

	@FieldInfo("發票地址")
	@FilterInfo(ListValue = "")
	@Column(name = "ivc_addr", length =32  )
	private String ivc_addr ;

	@FieldInfo("E-MAIL地址")
	@FilterInfo(ListValue = "")
	@Column(name = "email_addr", length =32  )
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
	@Column(name = "cus_cun", length =32  )
	private String cus_cun ;

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

	@FieldInfo("聯絡人1")
	@FilterInfo(ListValue = "")
	@Column(name = "attname1", length =32  )
	private String attname1 ;

	@FieldInfo("稱謂1")
	@FilterInfo(ListValue = "")
	@Column(name = "call1", length =32  )
	private String call1 ;

	@FieldInfo("聯絡人2")
	@FilterInfo(ListValue = "")
	@Column(name = "attname2", length =32  )
	private String attname2 ;

	@FieldInfo("主辦會計")
	@FilterInfo(ListValue = "")
	@Column(name = "attname3", length =32  )
	private String attname3 ;

	@FieldInfo("資本額")
	@FilterInfo(ListValue = "")
	@Column(name = "oew_amt")
	private Double oew_amt;

	@FieldInfo("年營業額")
	@FilterInfo(ListValue = "")
	@Column(name = "acc_amt")
	private Double acc_amt;

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

	@FieldInfo("廠商性質")
	@FilterInfo(ListValue = "")
	@Column(name = "remark3", length =32  )
	private String remark3 ;

	@FieldInfo("廠商類別")
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
	@Column(name = "days1")
	private Integer days1;

	@FieldInfo("請款日")
	@FilterInfo(ListValue = "")
	@Column(name = "days2")
	private Integer days2;

	@FieldInfo("付款日")
	@FilterInfo(ListValue = "")
	@Column(name = "days3")
	private Integer days3;

	@FieldInfo("開始交易日")
	@FilterInfo(ListValue = "")
	@Column(name = "ddate")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date ddate;

	@FieldInfo("營業項目")
	@FilterInfo(ListValue = "")
	@Column(name = "sale_inv", length =32  )
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
	@Column(name = "remark", length =32  )
	private String remark ;

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

	@FieldInfo("分機1")
	@FilterInfo(ListValue = "")
	@Column(name = "cus_oth1", length =32  )
	private String cus_oth1 ;

	@FieldInfo("分機2")
	@FilterInfo(ListValue = "")
	@Column(name = "cus_oth2", length =32  )
	private String cus_oth2 ;

	@FieldInfo("行動電話")
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
	@Column(name = "http", length =32  )
	private String http ;

	@FieldInfo("郵遞區號")
	@FilterInfo(ListValue = "")
	@Column(name = "mail_nbr", length =32  )
	private String mail_nbr ;

	@FieldInfo("業務性質")
	@FilterInfo(ListValue = "")
	@Column(name = "shp_desc", length =32  )
	private String shp_desc ;

	@FieldInfo("主辦會計員工編號")
	@FilterInfo(ListValue = "")
	@Column(name = "emp_nbr", length =32  )
	private String emp_nbr ;

	@FieldInfo("稅籍編號")
	@FilterInfo(ListValue = "")
	@Column(name = "tax_nbr", length =32  )
	private String tax_nbr ;

	@FieldInfo("稽徵機關代號")
	@FilterInfo(ListValue = "")
	@Column(name = "chk_nbr", length =32  )
	private String chk_nbr ;

	@FieldInfo("稽徵機關名稱")
	@FilterInfo(ListValue = "")
	@Column(name = "chk_name", length =32  )
	private String chk_name ;

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

	@FieldInfo("是否提供購買發票服務")
	@FilterInfo(ListValue = "")
	@Column(name = "buy_invo")
	private Integer buy_invo;

	@FieldInfo("每期     日前送交")
	@FilterInfo(ListValue = "")
	@Column(name = "days4")
	private Integer days4;

	@FieldInfo("每期憑證收取方式")
	@FilterInfo(ListValue = "")
	@Column(name = "vou_get")
	private Integer vou_get;

	@FieldInfo("每期憑證收取日期")
	@FilterInfo(ListValue = "")
	@Column(name = "vou_day")
	private Integer vou_day;

	@FieldInfo("每期稅款收取方式")
	@FilterInfo(ListValue = "")
	@Column(name = "tax_get")
	private Integer tax_get;

	@FieldInfo("營業稅申報方式")
	@FilterInfo(ListValue = "")
	@Column(name = "sal_tax")
	private Integer sal_tax;

	@FieldInfo("發票開立方式")
	@FilterInfo(ListValue = "")
	@Column(name = "mak_invo")
	private Integer mak_invo;

	@FieldInfo("營利事業所得稅結算申報方式")
	@FilterInfo(ListValue = "")
	@Column(name = "set_ment")
	private Integer set_ment;

	@FieldInfo("特殊交易及問題")
	@FilterInfo(ListValue = "")
	@Column(name = "spe_que", length =32  )
	private String spe_que ;

	@FieldInfo("注意事項-營業稅")
	@FilterInfo(ListValue = "")
	@Column(name = "note_sale", length =32  )
	private String note_sale ;

	@FieldInfo("注意事項-營所稅")
	@FilterInfo(ListValue = "")
	@Column(name = "note_sale1", length =32  )
	private String note_sale1 ;

	@FieldInfo("注意事項-帳務")
	@FilterInfo(ListValue = "")
	@Column(name = "note_acc", length =32  )
	private String note_acc ;

	@FieldInfo("注意事項-扣繳")
	@FilterInfo(ListValue = "")
	@Column(name = "note_acc1", length =32  )
	private String note_acc1 ;


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
	 	 * @param cus_name
	 *		  客戶名稱
	 * 
	 	 * @param cus_tel1
	 *		  客戶電話1
	 * 
	 	 * @param big_key
	 *		  譯音碼
	 * 
	 	 * @param area_nbr
	 *		  地區名稱
	 * 
	 	 * @param group_nbr
	 *		  組別
	 * 
	 	 * @param cus_alias
	 *		  客戶簡稱
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
	 	 * @param cus_cun
	 *		  統一編號
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
	 *		  聯絡人1
	 * 
	 	 * @param call1
	 *		  稱謂1
	 * 
	 	 * @param attname2
	 *		  聯絡人2
	 * 
	 	 * @param attname3
	 *		  主辦會計
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
	 *		  廠商性質
	 * 
	 	 * @param remark4
	 *		  廠商類別
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
	 	 * @param cus_oth1
	 *		  分機1
	 * 
	 	 * @param cus_oth2
	 *		  分機2
	 * 
	 	 * @param cellphone
	 *		  行動電話
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
	 	 * @param shp_desc
	 *		  業務性質
	 * 
	 	 * @param emp_nbr
	 *		  主辦會計員工編號
	 * 
	 	 * @param tax_nbr
	 *		  稅籍編號
	 * 
	 	 * @param chk_nbr
	 *		  稽徵機關代號
	 * 
	 	 * @param chk_name
	 *		  稽徵機關名稱
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
	 	 * @param buy_invo
	 *		  是否提供購買發票服務
	 * 
	 	 * @param days4
	 *		  每期     日前送交
	 * 
	 	 * @param vou_get
	 *		  每期憑證收取方式
	 * 
	 	 * @param vou_day
	 *		  每期憑證收取日期
	 * 
	 	 * @param tax_get
	 *		  每期稅款收取方式
	 * 
	 	 * @param sal_tax
	 *		  營業稅申報方式
	 * 
	 	 * @param mak_invo
	 *		  發票開立方式
	 * 
	 	 * @param set_ment
	 *		  營利事業所得稅結算申報方式
	 * 
	 	 * @param spe_que
	 *		  特殊交易及問題
	 * 
	 	 * @param note_sale
	 *		  注意事項-營業稅
	 * 
	 	 * @param note_sale1
	 *		  注意事項-營所稅
	 * 
	 	 * @param note_acc
	 *		  注意事項-帳務
	 * 
	 	 * @param note_acc1
	 *		  注意事項-扣繳
	 * 
	 	 */
    	public Cuscus( String cus_nbr, String cus_name, String cus_tel1, String big_key, String area_nbr, String group_nbr, String cus_alias, String cus_addr, String sen_addr, String ivc_addr, String email_addr, String eng_name, String addr_e, String cus_cun, String cus_tel2, String cus_fax, String attname, String attname1, String call1, String attname2, String attname3, Double oew_amt, Double acc_amt, Date beg_date, String remark1, String remark2, String remark3, String remark4, String remark5, String remark6, String remark7, String pay_term, String tax_type, String days, Integer days1, Integer days2, Integer days3, Date ddate, String sale_inv, String cus_lev, String sale_nbr, Double tot_amt, String remark, Date l_update, Date l_shpdate, String cus_oth1, String cus_oth2, String cellphone, String acounter, String a_tel, String a_oth, String http, String mail_nbr, String shp_desc, String emp_nbr, String tax_nbr, String chk_nbr, String chk_name, String tranok, String tranop, Integer trancnt, Integer buy_invo, Integer days4, Integer vou_get, Integer vou_day, Integer tax_get, Integer sal_tax, Integer mak_invo, Integer set_ment, String spe_que, String note_sale, String note_sale1, String note_acc, String note_acc1 ) {
		super();
				this.cus_nbr = cus_nbr;
				this.cus_name = cus_name;
				this.cus_tel1 = cus_tel1;
				this.big_key = big_key;
				this.area_nbr = area_nbr;
				this.group_nbr = group_nbr;
				this.cus_alias = cus_alias;
				this.cus_addr = cus_addr;
				this.sen_addr = sen_addr;
				this.ivc_addr = ivc_addr;
				this.email_addr = email_addr;
				this.eng_name = eng_name;
				this.addr_e = addr_e;
				this.cus_cun = cus_cun;
				this.cus_tel2 = cus_tel2;
				this.cus_fax = cus_fax;
				this.attname = attname;
				this.attname1 = attname1;
				this.call1 = call1;
				this.attname2 = attname2;
				this.attname3 = attname3;
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
				this.cus_oth1 = cus_oth1;
				this.cus_oth2 = cus_oth2;
				this.cellphone = cellphone;
				this.acounter = acounter;
				this.a_tel = a_tel;
				this.a_oth = a_oth;
				this.http = http;
				this.mail_nbr = mail_nbr;
				this.shp_desc = shp_desc;
				this.emp_nbr = emp_nbr;
				this.tax_nbr = tax_nbr;
				this.chk_nbr = chk_nbr;
				this.chk_name = chk_name;
				this.tranok = tranok;
				this.tranop = tranop;
				this.trancnt = trancnt;
				this.buy_invo = buy_invo;
				this.days4 = days4;
				this.vou_get = vou_get;
				this.vou_day = vou_day;
				this.tax_get = tax_get;
				this.sal_tax = sal_tax;
				this.mak_invo = mak_invo;
				this.set_ment = set_ment;
				this.spe_que = spe_que;
				this.note_sale = note_sale;
				this.note_sale1 = note_sale1;
				this.note_acc = note_acc;
				this.note_acc1 = note_acc1;
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
	 * @return group_nbr
	 *			組別
	 */
	public String getGroup_nbr() {
		return group_nbr;
	}

	/**
	 * @param group_nbr
	 *			組別
	 */
	public void setGroup_nbr(String Group_nbr) {
		this.group_nbr = Group_nbr;
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
	 * @return cus_cun
	 *			統一編號
	 */
	public String getCus_cun() {
		return cus_cun;
	}

	/**
	 * @param cus_cun
	 *			統一編號
	 */
	public void setCus_cun(String Cus_cun) {
		this.cus_cun = Cus_cun;
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
	 *			聯絡人1
	 */
	public String getAttname1() {
		return attname1;
	}

	/**
	 * @param attname1
	 *			聯絡人1
	 */
	public void setAttname1(String Attname1) {
		this.attname1 = Attname1;
	}
		/**
	 * @return call1
	 *			稱謂1
	 */
	public String getCall1() {
		return call1;
	}

	/**
	 * @param call1
	 *			稱謂1
	 */
	public void setCall1(String Call1) {
		this.call1 = Call1;
	}
		/**
	 * @return attname2
	 *			聯絡人2
	 */
	public String getAttname2() {
		return attname2;
	}

	/**
	 * @param attname2
	 *			聯絡人2
	 */
	public void setAttname2(String Attname2) {
		this.attname2 = Attname2;
	}
		/**
	 * @return attname3
	 *			主辦會計
	 */
	public String getAttname3() {
		return attname3;
	}

	/**
	 * @param attname3
	 *			主辦會計
	 */
	public void setAttname3(String Attname3) {
		this.attname3 = Attname3;
	}
		/**
	 * @return oew_amt
	 *			資本額
	 */
	public Double getOew_amt() {
		return oew_amt;
	}

	/**
	 * @param oew_amt
	 *			資本額
	 */
	public void setOew_amt(Double Oew_amt) {
		this.oew_amt = Oew_amt;
	}
		/**
	 * @return acc_amt
	 *			年營業額
	 */
	public Double getAcc_amt() {
		return acc_amt;
	}

	/**
	 * @param acc_amt
	 *			年營業額
	 */
	public void setAcc_amt(Double Acc_amt) {
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
	 *			廠商性質
	 */
	public String getRemark3() {
		return remark3;
	}

	/**
	 * @param remark3
	 *			廠商性質
	 */
	public void setRemark3(String Remark3) {
		this.remark3 = Remark3;
	}
		/**
	 * @return remark4
	 *			廠商類別
	 */
	public String getRemark4() {
		return remark4;
	}

	/**
	 * @param remark4
	 *			廠商類別
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
	public Integer getDays1() {
		return days1;
	}

	/**
	 * @param days1
	 *			付票票期
	 */
	public void setDays1(Integer Days1) {
		this.days1 = Days1;
	}
		/**
	 * @return days2
	 *			請款日
	 */
	public Integer getDays2() {
		return days2;
	}

	/**
	 * @param days2
	 *			請款日
	 */
	public void setDays2(Integer Days2) {
		this.days2 = Days2;
	}
		/**
	 * @return days3
	 *			付款日
	 */
	public Integer getDays3() {
		return days3;
	}

	/**
	 * @param days3
	 *			付款日
	 */
	public void setDays3(Integer Days3) {
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
	 *			行動電話
	 */
	public String getCellphone() {
		return cellphone;
	}

	/**
	 * @param cellphone
	 *			行動電話
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
	 * @return emp_nbr
	 *			主辦會計員工編號
	 */
	public String getEmp_nbr() {
		return emp_nbr;
	}

	/**
	 * @param emp_nbr
	 *			主辦會計員工編號
	 */
	public void setEmp_nbr(String Emp_nbr) {
		this.emp_nbr = Emp_nbr;
	}
		/**
	 * @return tax_nbr
	 *			稅籍編號
	 */
	public String getTax_nbr() {
		return tax_nbr;
	}

	/**
	 * @param tax_nbr
	 *			稅籍編號
	 */
	public void setTax_nbr(String Tax_nbr) {
		this.tax_nbr = Tax_nbr;
	}
		/**
	 * @return chk_nbr
	 *			稽徵機關代號
	 */
	public String getChk_nbr() {
		return chk_nbr;
	}

	/**
	 * @param chk_nbr
	 *			稽徵機關代號
	 */
	public void setChk_nbr(String Chk_nbr) {
		this.chk_nbr = Chk_nbr;
	}
		/**
	 * @return chk_name
	 *			稽徵機關名稱
	 */
	public String getChk_name() {
		return chk_name;
	}

	/**
	 * @param chk_name
	 *			稽徵機關名稱
	 */
	public void setChk_name(String Chk_name) {
		this.chk_name = Chk_name;
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
	 * @return buy_invo
	 *			是否提供購買發票服務
	 */
	public Integer getBuy_invo() {
		return buy_invo;
	}

	/**
	 * @param buy_invo
	 *			是否提供購買發票服務
	 */
	public void setBuy_invo(Integer Buy_invo) {
		this.buy_invo = Buy_invo;
	}
		/**
	 * @return days4
	 *			每期     日前送交
	 */
	public Integer getDays4() {
		return days4;
	}

	/**
	 * @param days4
	 *			每期     日前送交
	 */
	public void setDays4(Integer Days4) {
		this.days4 = Days4;
	}
		/**
	 * @return vou_get
	 *			每期憑證收取方式
	 */
	public Integer getVou_get() {
		return vou_get;
	}

	/**
	 * @param vou_get
	 *			每期憑證收取方式
	 */
	public void setVou_get(Integer Vou_get) {
		this.vou_get = Vou_get;
	}
		/**
	 * @return vou_day
	 *			每期憑證收取日期
	 */
	public Integer getVou_day() {
		return vou_day;
	}

	/**
	 * @param vou_day
	 *			每期憑證收取日期
	 */
	public void setVou_day(Integer Vou_day) {
		this.vou_day = Vou_day;
	}
		/**
	 * @return tax_get
	 *			每期稅款收取方式
	 */
	public Integer getTax_get() {
		return tax_get;
	}

	/**
	 * @param tax_get
	 *			每期稅款收取方式
	 */
	public void setTax_get(Integer Tax_get) {
		this.tax_get = Tax_get;
	}
		/**
	 * @return sal_tax
	 *			營業稅申報方式
	 */
	public Integer getSal_tax() {
		return sal_tax;
	}

	/**
	 * @param sal_tax
	 *			營業稅申報方式
	 */
	public void setSal_tax(Integer Sal_tax) {
		this.sal_tax = Sal_tax;
	}
		/**
	 * @return mak_invo
	 *			發票開立方式
	 */
	public Integer getMak_invo() {
		return mak_invo;
	}

	/**
	 * @param mak_invo
	 *			發票開立方式
	 */
	public void setMak_invo(Integer Mak_invo) {
		this.mak_invo = Mak_invo;
	}
		/**
	 * @return set_ment
	 *			營利事業所得稅結算申報方式
	 */
	public Integer getSet_ment() {
		return set_ment;
	}

	/**
	 * @param set_ment
	 *			營利事業所得稅結算申報方式
	 */
	public void setSet_ment(Integer Set_ment) {
		this.set_ment = Set_ment;
	}
		/**
	 * @return spe_que
	 *			特殊交易及問題
	 */
	public String getSpe_que() {
		return spe_que;
	}

	/**
	 * @param spe_que
	 *			特殊交易及問題
	 */
	public void setSpe_que(String Spe_que) {
		this.spe_que = Spe_que;
	}
		/**
	 * @return note_sale
	 *			注意事項-營業稅
	 */
	public String getNote_sale() {
		return note_sale;
	}

	/**
	 * @param note_sale
	 *			注意事項-營業稅
	 */
	public void setNote_sale(String Note_sale) {
		this.note_sale = Note_sale;
	}
		/**
	 * @return note_sale1
	 *			注意事項-營所稅
	 */
	public String getNote_sale1() {
		return note_sale1;
	}

	/**
	 * @param note_sale1
	 *			注意事項-營所稅
	 */
	public void setNote_sale1(String Note_sale1) {
		this.note_sale1 = Note_sale1;
	}
		/**
	 * @return note_acc
	 *			注意事項-帳務
	 */
	public String getNote_acc() {
		return note_acc;
	}

	/**
	 * @param note_acc
	 *			注意事項-帳務
	 */
	public void setNote_acc(String Note_acc) {
		this.note_acc = Note_acc;
	}
		/**
	 * @return note_acc1
	 *			注意事項-扣繳
	 */
	public String getNote_acc1() {
		return note_acc1;
	}

	/**
	 * @param note_acc1
	 *			注意事項-扣繳
	 */
	public void setNote_acc1(String Note_acc1) {
		this.note_acc1 = Note_acc1;
	}
	
}

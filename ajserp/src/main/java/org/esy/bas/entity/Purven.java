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
 *  @date Fri Jul 24 09:56:46 CST 2020
 */
@Entity
@Table(name = "pur_ven" ,indexes = { @Index(name = "created", columnList = "created"), 
@Index(name = "updated", columnList = "updated")})
@EntityInfo("廠商主檔")
public class Purven extends BaseProperties {

	private static final long serialVersionUID = 1L;

	@FieldInfo("廠商編號")
	@FilterInfo(ListValue = "")
	@Column(name = "ven_nbr", length =32  )
	private String ven_nbr ;

	@FieldInfo("譯音碼")
	@FilterInfo(ListValue = "")
	@Column(name = "big_key", length =32  )
	private String big_key ;

	@FieldInfo("廠商簡稱")
	@FilterInfo(ListValue = "")
	@Column(name = "ven_alias", length =32  )
	private String ven_alias ;

	@FieldInfo("地區名稱")
	@FilterInfo(ListValue = "")
	@Column(name = "area_nbr", length =32  )
	private String area_nbr ;

	@FieldInfo("廠商名稱")
	@FilterInfo(ListValue = "")
	@Column(name = "ven_name", length =32  )
	private String ven_name ;

	@FieldInfo("公司地址")
	@FilterInfo(ListValue = "")
	@Column(name = "ven_addr", length =128  )
	private String ven_addr ;

	@FieldInfo("工廠地址")
	@FilterInfo(ListValue = "")
	@Column(name = "sen_addr", length =128  )
	private String sen_addr ;

	@FieldInfo("發票地址")
	@FilterInfo(ListValue = "")
	@Column(name = "ivc_addr", length =128  )
	private String ivc_addr ;

	@FieldInfo("統一編號")
	@FilterInfo(ListValue = "")
	@Column(name = "ven_gun", length =32  )
	private String ven_gun ;

	@FieldInfo("營利事業登記證")
	@FilterInfo(ListValue = "")
	@Column(name = "ven_num", length =32  )
	private String ven_num ;

	@FieldInfo("廠商電話1")
	@FilterInfo(ListValue = "")
	@Column(name = "ven_tel1", length =32  )
	private String ven_tel1 ;

	@FieldInfo("廠商電話2")
	@FilterInfo(ListValue = "")
	@Column(name = "ven_tel2", length =32  )
	private String ven_tel2 ;

	@FieldInfo("分機1")
	@FilterInfo(ListValue = "")
	@Column(name = "pur_oth1", length =32  )
	private String pur_oth1 ;

	@FieldInfo("分機2")
	@FilterInfo(ListValue = "")
	@Column(name = "pur_oth2", length =32  )
	private String pur_oth2 ;

	@FieldInfo("手機")
	@FilterInfo(ListValue = "")
	@Column(name = "cellphone", length =32  )
	private String cellphone ;

	@FieldInfo("會計")
	@FilterInfo(ListValue = "")
	@Column(name = "acounter", length =32  )
	private String acounter ;

	@FieldInfo("網站")
	@FilterInfo(ListValue = "")
	@Column(name = "http", length =128  )
	private String http ;

	@FieldInfo("傳真機號碼")
	@FilterInfo(ListValue = "")
	@Column(name = "ven_fax", length =32  )
	private String ven_fax ;

	@FieldInfo("員工人數")
	@FilterInfo(ListValue = "")
	@Column(name = "staffs")
	private Integer staffs;

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

	@FieldInfo("往來銀行&帳號")
	@FilterInfo(ListValue = "")
	@Column(name = "ven_bank", length =32  )
	private String ven_bank ;

	@FieldInfo("付款方式")
	@FilterInfo(ListValue = "")
	@Column(name = "remark7", length =32  )
	private String remark7 ;

	@FieldInfo("付款條件")
	@FilterInfo(ListValue = "")
	@Column(name = "pay_term", length =32  )
	private String pay_term ;

	@FieldInfo("稅別")
	@FilterInfo(ListValue = "")
	@Column(name = "tax_type", length =32  )
	private String tax_type ;

	@FieldInfo("主要製程")
	@FilterInfo(ListValue = "")
	@Column(name = "pro_nbr", length =32  )
	private String pro_nbr ;

	@FieldInfo("營業項目")
	@FilterInfo(ListValue = "")
	@Column(name = "sale_inv", length =128  )
	private String sale_inv ;

	@FieldInfo("備註")
	@FilterInfo(ListValue = "")
	@Column(name = "remark", columnDefinition = "TEXT")
	private String remark;

	@FieldInfo("委外倉庫")
	@FilterInfo(ListValue = "")
	@Column(name = "ware_nbr", length =32  )
	private String ware_nbr ;

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

	@FieldInfo("E-MAIL地址")
	@FilterInfo(ListValue = "")
	@Column(name = "email_addr", length =128  )
	private String email_addr ;

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

	@FieldInfo("月結日")
	@FilterInfo(ListValue = "")
	@Column(name = "days", length =32  )
	private String days ;

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

	@FieldInfo("票據抬頭")
	@FilterInfo(ListValue = "")
	@Column(name = "chk_desc", length =32  )
	private String chk_desc ;

	@FieldInfo("幣別")
	@FilterInfo(ListValue = "")
	@Column(name = "coin_nbr", length =32  )
	private String coin_nbr ;


     /**
	 *
	 * 构造函数
	 *
	 */
	public Purven() {
		super();
	}
	
	/**
	 *
	 * 构造函数
	 *
	 	 * @param ven_nbr
	 *		  廠商編號
	 * 
	 	 * @param big_key
	 *		  譯音碼
	 * 
	 	 * @param ven_alias
	 *		  廠商簡稱
	 * 
	 	 * @param area_nbr
	 *		  地區名稱
	 * 
	 	 * @param ven_name
	 *		  廠商名稱
	 * 
	 	 * @param ven_addr
	 *		  公司地址
	 * 
	 	 * @param sen_addr
	 *		  工廠地址
	 * 
	 	 * @param ivc_addr
	 *		  發票地址
	 * 
	 	 * @param ven_gun
	 *		  統一編號
	 * 
	 	 * @param ven_num
	 *		  營利事業登記證
	 * 
	 	 * @param ven_tel1
	 *		  廠商電話1
	 * 
	 	 * @param ven_tel2
	 *		  廠商電話2
	 * 
	 	 * @param pur_oth1
	 *		  分機1
	 * 
	 	 * @param pur_oth2
	 *		  分機2
	 * 
	 	 * @param cellphone
	 *		  手機
	 * 
	 	 * @param acounter
	 *		  會計
	 * 
	 	 * @param http
	 *		  網站
	 * 
	 	 * @param ven_fax
	 *		  傳真機號碼
	 * 
	 	 * @param staffs
	 *		  員工人數
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
	 	 * @param ven_bank
	 *		  往來銀行&帳號
	 * 
	 	 * @param remark7
	 *		  付款方式
	 * 
	 	 * @param pay_term
	 *		  付款條件
	 * 
	 	 * @param tax_type
	 *		  稅別
	 * 
	 	 * @param pro_nbr
	 *		  主要製程
	 * 
	 	 * @param sale_inv
	 *		  營業項目
	 * 
	 	 * @param remark
	 *		  備註
	 * 
	 	 * @param ware_nbr
	 *		  委外倉庫
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
	 	 * @param email_addr
	 *		  E-MAIL地址
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
	 	 * @param days
	 *		  月結日
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
	 	 * @param chk_desc
	 *		  票據抬頭
	 * 
	 	 * @param coin_nbr
	 *		  幣別
	 * 
	 	 */
    	public Purven( String ven_nbr, String big_key, String ven_alias, String area_nbr, String ven_name, String ven_addr, String sen_addr, String ivc_addr, String ven_gun, String ven_num, String ven_tel1, String ven_tel2, String pur_oth1, String pur_oth2, String cellphone, String acounter, String http, String ven_fax, Integer staffs, String attname, String attname1, String attname2, Integer oew_amt, Integer acc_amt, String ven_bank, String remark7, String pay_term, String tax_type, String pro_nbr, String sale_inv, String remark, String ware_nbr, Date l_update, Date l_shpdate, Date cre_date, String email_addr, String mail_nbr, String mail_no1, String mail_no2, String shp_desc, Date crt_date, String crt_user, Date edit_date, String edit_user, String days, String tranok, String tranop, Integer trancnt, String chk_desc, String coin_nbr ) {
		super();
				this.ven_nbr = ven_nbr;
				this.big_key = big_key;
				this.ven_alias = ven_alias;
				this.area_nbr = area_nbr;
				this.ven_name = ven_name;
				this.ven_addr = ven_addr;
				this.sen_addr = sen_addr;
				this.ivc_addr = ivc_addr;
				this.ven_gun = ven_gun;
				this.ven_num = ven_num;
				this.ven_tel1 = ven_tel1;
				this.ven_tel2 = ven_tel2;
				this.pur_oth1 = pur_oth1;
				this.pur_oth2 = pur_oth2;
				this.cellphone = cellphone;
				this.acounter = acounter;
				this.http = http;
				this.ven_fax = ven_fax;
				this.staffs = staffs;
				this.attname = attname;
				this.attname1 = attname1;
				this.attname2 = attname2;
				this.oew_amt = oew_amt;
				this.acc_amt = acc_amt;
				this.ven_bank = ven_bank;
				this.remark7 = remark7;
				this.pay_term = pay_term;
				this.tax_type = tax_type;
				this.pro_nbr = pro_nbr;
				this.sale_inv = sale_inv;
				this.remark = remark;
				this.ware_nbr = ware_nbr;
				this.l_update = l_update;
				this.l_shpdate = l_shpdate;
				this.cre_date = cre_date;
				this.email_addr = email_addr;
				this.mail_nbr = mail_nbr;
				this.mail_no1 = mail_no1;
				this.mail_no2 = mail_no2;
				this.shp_desc = shp_desc;
				this.crt_date = crt_date;
				this.crt_user = crt_user;
				this.edit_date = edit_date;
				this.edit_user = edit_user;
				this.days = days;
				this.tranok = tranok;
				this.tranop = tranop;
				this.trancnt = trancnt;
				this.chk_desc = chk_desc;
				this.coin_nbr = coin_nbr;
			}

		/**
	 * @return ven_nbr
	 *			廠商編號
	 */
	public String getVen_nbr() {
		return ven_nbr;
	}

	/**
	 * @param ven_nbr
	 *			廠商編號
	 */
	public void setVen_nbr(String Ven_nbr) {
		this.ven_nbr = Ven_nbr;
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
	 * @return ven_alias
	 *			廠商簡稱
	 */
	public String getVen_alias() {
		return ven_alias;
	}

	/**
	 * @param ven_alias
	 *			廠商簡稱
	 */
	public void setVen_alias(String Ven_alias) {
		this.ven_alias = Ven_alias;
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
	 * @return ven_name
	 *			廠商名稱
	 */
	public String getVen_name() {
		return ven_name;
	}

	/**
	 * @param ven_name
	 *			廠商名稱
	 */
	public void setVen_name(String Ven_name) {
		this.ven_name = Ven_name;
	}
		/**
	 * @return ven_addr
	 *			公司地址
	 */
	public String getVen_addr() {
		return ven_addr;
	}

	/**
	 * @param ven_addr
	 *			公司地址
	 */
	public void setVen_addr(String Ven_addr) {
		this.ven_addr = Ven_addr;
	}
		/**
	 * @return sen_addr
	 *			工廠地址
	 */
	public String getSen_addr() {
		return sen_addr;
	}

	/**
	 * @param sen_addr
	 *			工廠地址
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
	 * @return ven_gun
	 *			統一編號
	 */
	public String getVen_gun() {
		return ven_gun;
	}

	/**
	 * @param ven_gun
	 *			統一編號
	 */
	public void setVen_gun(String Ven_gun) {
		this.ven_gun = Ven_gun;
	}
		/**
	 * @return ven_num
	 *			營利事業登記證
	 */
	public String getVen_num() {
		return ven_num;
	}

	/**
	 * @param ven_num
	 *			營利事業登記證
	 */
	public void setVen_num(String Ven_num) {
		this.ven_num = Ven_num;
	}
		/**
	 * @return ven_tel1
	 *			廠商電話1
	 */
	public String getVen_tel1() {
		return ven_tel1;
	}

	/**
	 * @param ven_tel1
	 *			廠商電話1
	 */
	public void setVen_tel1(String Ven_tel1) {
		this.ven_tel1 = Ven_tel1;
	}
		/**
	 * @return ven_tel2
	 *			廠商電話2
	 */
	public String getVen_tel2() {
		return ven_tel2;
	}

	/**
	 * @param ven_tel2
	 *			廠商電話2
	 */
	public void setVen_tel2(String Ven_tel2) {
		this.ven_tel2 = Ven_tel2;
	}
		/**
	 * @return pur_oth1
	 *			分機1
	 */
	public String getPur_oth1() {
		return pur_oth1;
	}

	/**
	 * @param pur_oth1
	 *			分機1
	 */
	public void setPur_oth1(String Pur_oth1) {
		this.pur_oth1 = Pur_oth1;
	}
		/**
	 * @return pur_oth2
	 *			分機2
	 */
	public String getPur_oth2() {
		return pur_oth2;
	}

	/**
	 * @param pur_oth2
	 *			分機2
	 */
	public void setPur_oth2(String Pur_oth2) {
		this.pur_oth2 = Pur_oth2;
	}
		/**
	 * @return cellphone
	 *			手機
	 */
	public String getCellphone() {
		return cellphone;
	}

	/**
	 * @param cellphone
	 *			手機
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
	 * @return ven_fax
	 *			傳真機號碼
	 */
	public String getVen_fax() {
		return ven_fax;
	}

	/**
	 * @param ven_fax
	 *			傳真機號碼
	 */
	public void setVen_fax(String Ven_fax) {
		this.ven_fax = Ven_fax;
	}
		/**
	 * @return staffs
	 *			員工人數
	 */
	public Integer getStaffs() {
		return staffs;
	}

	/**
	 * @param staffs
	 *			員工人數
	 */
	public void setStaffs(Integer Staffs) {
		this.staffs = Staffs;
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
	 * @return ven_bank
	 *			往來銀行&帳號
	 */
	public String getVen_bank() {
		return ven_bank;
	}

	/**
	 * @param ven_bank
	 *			往來銀行&帳號
	 */
	public void setVen_bank(String Ven_bank) {
		this.ven_bank = Ven_bank;
	}
		/**
	 * @return remark7
	 *			付款方式
	 */
	public String getRemark7() {
		return remark7;
	}

	/**
	 * @param remark7
	 *			付款方式
	 */
	public void setRemark7(String Remark7) {
		this.remark7 = Remark7;
	}
		/**
	 * @return pay_term
	 *			付款條件
	 */
	public String getPay_term() {
		return pay_term;
	}

	/**
	 * @param pay_term
	 *			付款條件
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
	 * @return pro_nbr
	 *			主要製程
	 */
	public String getPro_nbr() {
		return pro_nbr;
	}

	/**
	 * @param pro_nbr
	 *			主要製程
	 */
	public void setPro_nbr(String Pro_nbr) {
		this.pro_nbr = Pro_nbr;
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
	 * @return ware_nbr
	 *			委外倉庫
	 */
	public String getWare_nbr() {
		return ware_nbr;
	}

	/**
	 * @param ware_nbr
	 *			委外倉庫
	 */
	public void setWare_nbr(String Ware_nbr) {
		this.ware_nbr = Ware_nbr;
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
	 * @return chk_desc
	 *			票據抬頭
	 */
	public String getChk_desc() {
		return chk_desc;
	}

	/**
	 * @param chk_desc
	 *			票據抬頭
	 */
	public void setChk_desc(String Chk_desc) {
		this.chk_desc = Chk_desc;
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

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
 *  @date Thu Jul 30 10:23:44 CST 2020
 */
@Entity
@Table(name = "bas_bank" ,indexes = { @Index(name = "created", columnList = "created"), 
@Index(name = "updated", columnList = "updated")})
@EntityInfo("銀行基本資料檔")
public class Basbank extends BaseProperties {

	private static final long serialVersionUID = 1L;

	@FieldInfo("銀行代號")
	@FilterInfo(ListValue = "")
	@Column(name = "b_nbr", length =32  )
	private String b_nbr ;

	@FieldInfo("銀行名稱")
	@FilterInfo(ListValue = "")
	@Column(name = "b_name", length =32  )
	private String b_name ;

	@FieldInfo("銀行簡稱")
	@FilterInfo(ListValue = "")
	@Column(name = "b_alias", length =32  )
	private String b_alias ;

	@FieldInfo("銀行帳號")
	@FilterInfo(ListValue = "")
	@Column(name = "b_code", length =32  )
	private String b_code ;

	@FieldInfo("銀行電話1")
	@FilterInfo(ListValue = "")
	@Column(name = "b_tel1", length =32  )
	private String b_tel1 ;

	@FieldInfo("銀行電話2")
	@FilterInfo(ListValue = "")
	@Column(name = "b_tel2", length =32  )
	private String b_tel2 ;

	@FieldInfo("傳真機號碼")
	@FilterInfo(ListValue = "")
	@Column(name = "b_fax", length =32  )
	private String b_fax ;

	@FieldInfo("銀行地址")
	@FilterInfo(ListValue = "")
	@Column(name = "b_addr", length =128  )
	private String b_addr ;

	@FieldInfo("幣別代號")
	@FilterInfo(ListValue = "")
	@Column(name = "coin_nbr", length =32  )
	private String coin_nbr ;

	@FieldInfo("開帳日期")
	@FilterInfo(ListValue = "")
	@Column(name = "nbrdate")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date nbrdate;

	@FieldInfo("開帳金額")
	@FilterInfo(ListValue = "")
	@Column(name = "b_amt")
	private Double b_amt;

	@FieldInfo("餘    額")
	@FilterInfo(ListValue = "")
	@Column(name = "bal_amt")
	private Double bal_amt;

	@FieldInfo("英文名稱")
	@FilterInfo(ListValue = "")
	@Column(name = "eng_name", length =32  )
	private String eng_name ;

	@FieldInfo("國外查詢帳號")
	@FilterInfo(ListValue = "")
	@Column(name = "eng_code", length =32  )
	private String eng_code ;

	@FieldInfo("英文地址")
	@FilterInfo(ListValue = "")
	@Column(name = "addr_e", length =32  )
	private String addr_e ;

	@FieldInfo("備註")
	@FilterInfo(ListValue = "")
	@Column(name = "remark", columnDefinition = "TEXT")
	private String remark;

	@FieldInfo("會計科目")
	@FilterInfo(ListValue = "")
	@Column(name = "acc_id", length =32  )
	private String acc_id ;

	@FieldInfo("承辦人")
	@FilterInfo(ListValue = "")
	@Column(name = "attname", length =32  )
	private String attname ;

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
	public Basbank() {
		super();
	}
	
	/**
	 *
	 * 构造函数
	 *
	 	 * @param b_nbr
	 *		  銀行代號
	 * 
	 	 * @param b_name
	 *		  銀行名稱
	 * 
	 	 * @param b_alias
	 *		  銀行簡稱
	 * 
	 	 * @param b_code
	 *		  銀行帳號
	 * 
	 	 * @param b_tel1
	 *		  銀行電話1
	 * 
	 	 * @param b_tel2
	 *		  銀行電話2
	 * 
	 	 * @param b_fax
	 *		  傳真機號碼
	 * 
	 	 * @param b_addr
	 *		  銀行地址
	 * 
	 	 * @param coin_nbr
	 *		  幣別代號
	 * 
	 	 * @param nbrdate
	 *		  開帳日期
	 * 
	 	 * @param b_amt
	 *		  開帳金額
	 * 
	 	 * @param bal_amt
	 *		  餘    額
	 * 
	 	 * @param eng_name
	 *		  英文名稱
	 * 
	 	 * @param eng_code
	 *		  國外查詢帳號
	 * 
	 	 * @param addr_e
	 *		  英文地址
	 * 
	 	 * @param remark
	 *		  備註
	 * 
	 	 * @param acc_id
	 *		  會計科目
	 * 
	 	 * @param attname
	 *		  承辦人
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
    	public Basbank( String b_nbr, String b_name, String b_alias, String b_code, String b_tel1, String b_tel2, String b_fax, String b_addr, String coin_nbr, Date nbrdate, Double b_amt, Double bal_amt, String eng_name, String eng_code, String addr_e, String remark, String acc_id, String attname, Date crt_date, String crt_user, Date edit_date, String edit_user, String tranok, String tranop, Integer trancnt ) {
		super();
				this.b_nbr = b_nbr;
				this.b_name = b_name;
				this.b_alias = b_alias;
				this.b_code = b_code;
				this.b_tel1 = b_tel1;
				this.b_tel2 = b_tel2;
				this.b_fax = b_fax;
				this.b_addr = b_addr;
				this.coin_nbr = coin_nbr;
				this.nbrdate = nbrdate;
				this.b_amt = b_amt;
				this.bal_amt = bal_amt;
				this.eng_name = eng_name;
				this.eng_code = eng_code;
				this.addr_e = addr_e;
				this.remark = remark;
				this.acc_id = acc_id;
				this.attname = attname;
				this.crt_date = crt_date;
				this.crt_user = crt_user;
				this.edit_date = edit_date;
				this.edit_user = edit_user;
				this.tranok = tranok;
				this.tranop = tranop;
				this.trancnt = trancnt;
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
	 * @return b_name
	 *			銀行名稱
	 */
	public String getB_name() {
		return b_name;
	}

	/**
	 * @param b_name
	 *			銀行名稱
	 */
	public void setB_name(String B_name) {
		this.b_name = B_name;
	}
		/**
	 * @return b_alias
	 *			銀行簡稱
	 */
	public String getB_alias() {
		return b_alias;
	}

	/**
	 * @param b_alias
	 *			銀行簡稱
	 */
	public void setB_alias(String B_alias) {
		this.b_alias = B_alias;
	}
		/**
	 * @return b_code
	 *			銀行帳號
	 */
	public String getB_code() {
		return b_code;
	}

	/**
	 * @param b_code
	 *			銀行帳號
	 */
	public void setB_code(String B_code) {
		this.b_code = B_code;
	}
		/**
	 * @return b_tel1
	 *			銀行電話1
	 */
	public String getB_tel1() {
		return b_tel1;
	}

	/**
	 * @param b_tel1
	 *			銀行電話1
	 */
	public void setB_tel1(String B_tel1) {
		this.b_tel1 = B_tel1;
	}
		/**
	 * @return b_tel2
	 *			銀行電話2
	 */
	public String getB_tel2() {
		return b_tel2;
	}

	/**
	 * @param b_tel2
	 *			銀行電話2
	 */
	public void setB_tel2(String B_tel2) {
		this.b_tel2 = B_tel2;
	}
		/**
	 * @return b_fax
	 *			傳真機號碼
	 */
	public String getB_fax() {
		return b_fax;
	}

	/**
	 * @param b_fax
	 *			傳真機號碼
	 */
	public void setB_fax(String B_fax) {
		this.b_fax = B_fax;
	}
		/**
	 * @return b_addr
	 *			銀行地址
	 */
	public String getB_addr() {
		return b_addr;
	}

	/**
	 * @param b_addr
	 *			銀行地址
	 */
	public void setB_addr(String B_addr) {
		this.b_addr = B_addr;
	}
		/**
	 * @return coin_nbr
	 *			幣別代號
	 */
	public String getCoin_nbr() {
		return coin_nbr;
	}

	/**
	 * @param coin_nbr
	 *			幣別代號
	 */
	public void setCoin_nbr(String Coin_nbr) {
		this.coin_nbr = Coin_nbr;
	}
		/**
	 * @return nbrdate
	 *			開帳日期
	 */
	public Date getNbrdate() {
		return nbrdate;
	}

	/**
	 * @param nbrdate
	 *			開帳日期
	 */
	public void setNbrdate(Date Nbrdate) {
		this.nbrdate = Nbrdate;
	}
		/**
	 * @return b_amt
	 *			開帳金額
	 */
	public Double getB_amt() {
		return b_amt;
	}

	/**
	 * @param b_amt
	 *			開帳金額
	 */
	public void setB_amt(Double B_amt) {
		this.b_amt = B_amt;
	}
		/**
	 * @return bal_amt
	 *			餘    額
	 */
	public Double getBal_amt() {
		return bal_amt;
	}

	/**
	 * @param bal_amt
	 *			餘    額
	 */
	public void setBal_amt(Double Bal_amt) {
		this.bal_amt = Bal_amt;
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
	 * @return eng_code
	 *			國外查詢帳號
	 */
	public String getEng_code() {
		return eng_code;
	}

	/**
	 * @param eng_code
	 *			國外查詢帳號
	 */
	public void setEng_code(String Eng_code) {
		this.eng_code = Eng_code;
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
	 * @return attname
	 *			承辦人
	 */
	public String getAttname() {
		return attname;
	}

	/**
	 * @param attname
	 *			承辦人
	 */
	public void setAttname(String Attname) {
		this.attname = Attname;
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

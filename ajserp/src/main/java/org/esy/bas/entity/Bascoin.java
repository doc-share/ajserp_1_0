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
 *  @date Thu Jul 23 14:48:07 CST 2020
 */
@Entity
@Table(name = "bas_coin" ,indexes = { @Index(name = "created", columnList = "created"), 
@Index(name = "updated", columnList = "updated")})
@EntityInfo("幣別基本檔")
public class Bascoin extends BaseProperties {

	private static final long serialVersionUID = 1L;

	@FieldInfo("幣別代號")
	@FilterInfo(ListValue = "")
	@Column(name = "coin_nbr", length =32  )
	private String coin_nbr ;

	@FieldInfo("幣別說明")
	@FilterInfo(ListValue = "")
	@Column(name = "coin_desc", length =32  )
	private String coin_desc ;

	@FieldInfo("幣別英文說明")
	@FilterInfo(ListValue = "")
	@Column(name = "ecoin_desc", length =32  )
	private String ecoin_desc ;

	@FieldInfo("單價格式")
	@FilterInfo(ListValue = "")
	@Column(name = "pri_pict", length =32  )
	private String pri_pict ;

	@FieldInfo("是否千分位分離")
	@FilterInfo(ListValue = "")
	@Column(name = "is_pri")
	private Integer is_pri;

	@FieldInfo("金額格式")
	@FilterInfo(ListValue = "")
	@Column(name = "amt_pict", length =32  )
	private String amt_pict ;

	@FieldInfo("是否千分位分離")
	@FilterInfo(ListValue = "")
	@Column(name = "is_amt")
	private Integer is_amt;

	@FieldInfo("總計格式")
	@FilterInfo(ListValue = "")
	@Column(name = "tot_pict", length =32  )
	private String tot_pict ;

	@FieldInfo("是否千分位分離")
	@FilterInfo(ListValue = "")
	@Column(name = "is_tot")
	private Integer is_tot;

	@FieldInfo("金額小數")
	@FilterInfo(ListValue = "")
	@Column(name = "coin_deic")
	private Integer coin_deic;

	@FieldInfo("金額小數")
	@FilterInfo(ListValue = "")
	@Column(name = "coin_deica")
	private Integer coin_deica;

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
	public Bascoin() {
		super();
	}
	
	/**
	 *
	 * 构造函数
	 *
	 	 * @param coin_nbr
	 *		  幣別代號
	 * 
	 	 * @param coin_desc
	 *		  幣別說明
	 * 
	 	 * @param ecoin_desc
	 *		  幣別英文說明
	 * 
	 	 * @param pri_pict
	 *		  單價格式
	 * 
	 	 * @param is_pri
	 *		  是否千分位分離
	 * 
	 	 * @param amt_pict
	 *		  金額格式
	 * 
	 	 * @param is_amt
	 *		  是否千分位分離
	 * 
	 	 * @param tot_pict
	 *		  總計格式
	 * 
	 	 * @param is_tot
	 *		  是否千分位分離
	 * 
	 	 * @param coin_deic
	 *		  金額小數
	 * 
	 	 * @param coin_deica
	 *		  金額小數
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
    	public Bascoin( String coin_nbr, String coin_desc, String ecoin_desc, String pri_pict, Integer is_pri, String amt_pict, Integer is_amt, String tot_pict, Integer is_tot, Integer coin_deic, Integer coin_deica, Date crt_date, String crt_user, Date edit_date, String edit_user, String tranok, String tranop, Integer trancnt ) {
		super();
				this.coin_nbr = coin_nbr;
				this.coin_desc = coin_desc;
				this.ecoin_desc = ecoin_desc;
				this.pri_pict = pri_pict;
				this.is_pri = is_pri;
				this.amt_pict = amt_pict;
				this.is_amt = is_amt;
				this.tot_pict = tot_pict;
				this.is_tot = is_tot;
				this.coin_deic = coin_deic;
				this.coin_deica = coin_deica;
				this.crt_date = crt_date;
				this.crt_user = crt_user;
				this.edit_date = edit_date;
				this.edit_user = edit_user;
				this.tranok = tranok;
				this.tranop = tranop;
				this.trancnt = trancnt;
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
	 * @return coin_desc
	 *			幣別說明
	 */
	public String getCoin_desc() {
		return coin_desc;
	}

	/**
	 * @param coin_desc
	 *			幣別說明
	 */
	public void setCoin_desc(String Coin_desc) {
		this.coin_desc = Coin_desc;
	}
		/**
	 * @return ecoin_desc
	 *			幣別英文說明
	 */
	public String getEcoin_desc() {
		return ecoin_desc;
	}

	/**
	 * @param ecoin_desc
	 *			幣別英文說明
	 */
	public void setEcoin_desc(String Ecoin_desc) {
		this.ecoin_desc = Ecoin_desc;
	}
		/**
	 * @return pri_pict
	 *			單價格式
	 */
	public String getPri_pict() {
		return pri_pict;
	}

	/**
	 * @param pri_pict
	 *			單價格式
	 */
	public void setPri_pict(String Pri_pict) {
		this.pri_pict = Pri_pict;
	}
		/**
	 * @return is_pri
	 *			是否千分位分離
	 */
	public Integer getIs_pri() {
		return is_pri;
	}

	/**
	 * @param is_pri
	 *			是否千分位分離
	 */
	public void setIs_pri(Integer Is_pri) {
		this.is_pri = Is_pri;
	}
		/**
	 * @return amt_pict
	 *			金額格式
	 */
	public String getAmt_pict() {
		return amt_pict;
	}

	/**
	 * @param amt_pict
	 *			金額格式
	 */
	public void setAmt_pict(String Amt_pict) {
		this.amt_pict = Amt_pict;
	}
		/**
	 * @return is_amt
	 *			是否千分位分離
	 */
	public Integer getIs_amt() {
		return is_amt;
	}

	/**
	 * @param is_amt
	 *			是否千分位分離
	 */
	public void setIs_amt(Integer Is_amt) {
		this.is_amt = Is_amt;
	}
		/**
	 * @return tot_pict
	 *			總計格式
	 */
	public String getTot_pict() {
		return tot_pict;
	}

	/**
	 * @param tot_pict
	 *			總計格式
	 */
	public void setTot_pict(String Tot_pict) {
		this.tot_pict = Tot_pict;
	}
		/**
	 * @return is_tot
	 *			是否千分位分離
	 */
	public Integer getIs_tot() {
		return is_tot;
	}

	/**
	 * @param is_tot
	 *			是否千分位分離
	 */
	public void setIs_tot(Integer Is_tot) {
		this.is_tot = Is_tot;
	}
		/**
	 * @return coin_deic
	 *			金額小數
	 */
	public Integer getCoin_deic() {
		return coin_deic;
	}

	/**
	 * @param coin_deic
	 *			金額小數
	 */
	public void setCoin_deic(Integer Coin_deic) {
		this.coin_deic = Coin_deic;
	}
		/**
	 * @return coin_deica
	 *			金額小數
	 */
	public Integer getCoin_deica() {
		return coin_deica;
	}

	/**
	 * @param coin_deica
	 *			金額小數
	 */
	public void setCoin_deica(Integer Coin_deica) {
		this.coin_deica = Coin_deica;
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

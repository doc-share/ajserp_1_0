package org.esy.acc.entity;

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
 *  @date Sat Jun 20 09:30:48 CST 2020
 */
@Entity
@Table(name = "acc_bat" ,indexes = { @Index(name = "created", columnList = "created"), 
@Index(name = "updated", columnList = "updated")})
@EntityInfo("收款單轉傳票明細")
public class Accbat extends BaseProperties {

	private static final long serialVersionUID = 1L;

	@FieldInfo("傳票號碼")
	@FilterInfo(ListValue = "")
	@Column(name = "nbr", length =32  )
	private String nbr ;

	@FieldInfo("庫存交易序")
	@FilterInfo(ListValue = "")
	@Column(name = "ioseq", length =32  )
	private String ioseq ;

	@FieldInfo("年度")
	@FilterInfo(ListValue = "")
	@Column(name = "year", length =32  )
	private String year ;

	@FieldInfo("會計科目")
	@FilterInfo(ListValue = "")
	@Column(name = "acc_id", length =32  )
	private String acc_id ;

	@FieldInfo("科目名稱")
	@FilterInfo(ListValue = "")
	@Column(name = "acc_name", length =32  )
	private String acc_name ;

	@FieldInfo("摘要")
	@FilterInfo(ListValue = "")
	@Column(name = "mark_name", length =32  )
	private String mark_name ;

	@FieldInfo("借方或貸方")
	@FilterInfo(ListValue = "")
	@Column(name = "c_or_d", length =32  )
	private String c_or_d ;

	@FieldInfo("部門代號")
	@FilterInfo(ListValue = "")
	@Column(name = "dept_id", length =32  )
	private String dept_id ;

	@FieldInfo("傳票日期")
	@FilterInfo(ListValue = "eq")
	@Column(name = "date")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date date;

	@FieldInfo("幣別代號")
	@FilterInfo(ListValue = "")
	@Column(name = "coin_nbr", length =32  )
	private String coin_nbr ;

	@FieldInfo("匯率")
	@FilterInfo(ListValue = "")
	@Column(name = "coin_per")
	private Double coin_per;

	@FieldInfo("幣別金額")
	@FilterInfo(ListValue = "")
	@Column(name = "camt")
	private Double camt;

	@FieldInfo("金額")
	@FilterInfo(ListValue = "")
	@Column(name = "amt")
	private Double amt;

	@FieldInfo("來源檔名")
	@FilterInfo(ListValue = "")
	@Column(name = "s_dbf", length =32  )
	private String s_dbf ;

	@FieldInfo("來源編號")
	@FilterInfo(ListValue = "")
	@Column(name = "s_nbr", length =32  )
	private String s_nbr ;

	@FieldInfo("未沖金額")
	@FilterInfo(ListValue = "")
	@Column(name = "flshamt")
	private Double flshamt;

	@FieldInfo("已沖金額")
	@FilterInfo(ListValue = "")
	@Column(name = "rec_amt")
	private Double rec_amt;

	@FieldInfo("對象別")
	@FilterInfo(ListValue = "")
	@Column(name = "io_p", length =32  )
	private String io_p ;

	@FieldInfo("客戶代號/廠商代號")
	@FilterInfo(ListValue = "")
	@Column(name = "io_nbr", length =32  )
	private String io_nbr ;

	@FieldInfo("客戶名稱/廠商名稱")
	@FilterInfo(ListValue = "")
	@Column(name = "io_name", length =32  )
	private String io_name ;

	@FieldInfo("沖款狀態")
	@FilterInfo(ListValue = "")
	@Column(name = "status", length =32  )
	private String status ;

	@FieldInfo("狀態說明")
	@FilterInfo(ListValue = "")
	@Column(name = "st_desc", length =32  )
	private String st_desc ;

	@FieldInfo("是否已打票據")
	@FilterInfo(ListValue = "")
	@Column(name = "is_pz")
	private boolean is_pz ;

	@FieldInfo("傳票編號")
	@FilterInfo(ListValue = "")
	@Column(name = "chk_nbr", length =32  )
	private String chk_nbr ;


     /**
	 *
	 * 构造函数
	 *
	 */
	public Accbat() {
		super();
	}
	
	/**
	 *
	 * 构造函数
	 *
	 	 * @param nbr
	 *		  傳票號碼
	 * 
	 	 * @param ioseq
	 *		  庫存交易序
	 * 
	 	 * @param year
	 *		  年度
	 * 
	 	 * @param acc_id
	 *		  會計科目
	 * 
	 	 * @param acc_name
	 *		  科目名稱
	 * 
	 	 * @param mark_name
	 *		  摘要
	 * 
	 	 * @param c_or_d
	 *		  借方或貸方
	 * 
	 	 * @param dept_id
	 *		  部門代號
	 * 
	 	 * @param date
	 *		  傳票日期
	 * 
	 	 * @param coin_nbr
	 *		  幣別代號
	 * 
	 	 * @param coin_per
	 *		  匯率
	 * 
	 	 * @param camt
	 *		  幣別金額
	 * 
	 	 * @param amt
	 *		  金額
	 * 
	 	 * @param s_dbf
	 *		  來源檔名
	 * 
	 	 * @param s_nbr
	 *		  來源編號
	 * 
	 	 * @param flshamt
	 *		  未沖金額
	 * 
	 	 * @param rec_amt
	 *		  已沖金額
	 * 
	 	 * @param io_p
	 *		  對象別
	 * 
	 	 * @param io_nbr
	 *		  客戶代號/廠商代號
	 * 
	 	 * @param io_name
	 *		  客戶名稱/廠商名稱
	 * 
	 	 * @param status
	 *		  沖款狀態
	 * 
	 	 * @param st_desc
	 *		  狀態說明
	 * 
	 	 * @param is_pz
	 *		  是否已打票據
	 * 
	 	 * @param chk_nbr
	 *		  傳票編號
	 * 
	 	 */
    	public Accbat( String nbr, String ioseq, String year, String acc_id, String acc_name, String mark_name, String c_or_d, String dept_id, Date date, String coin_nbr, Double coin_per, Double camt, Double amt, String s_dbf, String s_nbr, Double flshamt, Double rec_amt, String io_p, String io_nbr, String io_name, String status, String st_desc, boolean is_pz, String chk_nbr ) {
		super();
				this.nbr = nbr;
				this.ioseq = ioseq;
				this.year = year;
				this.acc_id = acc_id;
				this.acc_name = acc_name;
				this.mark_name = mark_name;
				this.c_or_d = c_or_d;
				this.dept_id = dept_id;
				this.date = date;
				this.coin_nbr = coin_nbr;
				this.coin_per = coin_per;
				this.camt = camt;
				this.amt = amt;
				this.s_dbf = s_dbf;
				this.s_nbr = s_nbr;
				this.flshamt = flshamt;
				this.rec_amt = rec_amt;
				this.io_p = io_p;
				this.io_nbr = io_nbr;
				this.io_name = io_name;
				this.status = status;
				this.st_desc = st_desc;
				this.is_pz = is_pz;
				this.chk_nbr = chk_nbr;
			}

		public Accbat(String uid) {
		// TODO Auto-generated constructor stub
	}

		/**
	 * @return nbr
	 *			傳票號碼
	 */
	public String getNbr() {
		return nbr;
	}

	/**
	 * @param nbr
	 *			傳票號碼
	 */
	public void setNbr(String Nbr) {
		this.nbr = Nbr;
	}
		/**
	 * @return ioseq
	 *			庫存交易序
	 */
	public String getIoseq() {
		return ioseq;
	}

	/**
	 * @param ioseq
	 *			庫存交易序
	 */
	public void setIoseq(String Ioseq) {
		this.ioseq = Ioseq;
	}
		/**
	 * @return year
	 *			年度
	 */
	public String getYear() {
		return year;
	}

	/**
	 * @param year
	 *			年度
	 */
	public void setYear(String Year) {
		this.year = Year;
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
	 * @return acc_name
	 *			科目名稱
	 */
	public String getAcc_name() {
		return acc_name;
	}

	/**
	 * @param acc_name
	 *			科目名稱
	 */
	public void setAcc_name(String Acc_name) {
		this.acc_name = Acc_name;
	}
		/**
	 * @return mark_name
	 *			摘要
	 */
	public String getMark_name() {
		return mark_name;
	}

	/**
	 * @param mark_name
	 *			摘要
	 */
	public void setMark_name(String Mark_name) {
		this.mark_name = Mark_name;
	}
		/**
	 * @return c_or_d
	 *			借方或貸方
	 */
	public String getC_or_d() {
		return c_or_d;
	}

	/**
	 * @param c_or_d
	 *			借方或貸方
	 */
	public void setC_or_d(String C_or_d) {
		this.c_or_d = C_or_d;
	}
		/**
	 * @return dept_id
	 *			部門代號
	 */
	public String getDept_id() {
		return dept_id;
	}

	/**
	 * @param dept_id
	 *			部門代號
	 */
	public void setDept_id(String Dept_id) {
		this.dept_id = Dept_id;
	}
		/**
	 * @return date
	 *			傳票日期
	 */
	public Date getDate() {
		return date;
	}

	/**
	 * @param date
	 *			傳票日期
	 */
	public void setDate(Date Date) {
		this.date = Date;
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
	 * @return camt
	 *			幣別金額
	 */
	public Double getCamt() {
		return camt;
	}

	/**
	 * @param camt
	 *			幣別金額
	 */
	public void setCamt(Double Camt) {
		this.camt = Camt;
	}
		/**
	 * @return amt
	 *			金額
	 */
	public Double getAmt() {
		return amt;
	}

	/**
	 * @param amt
	 *			金額
	 */
	public void setAmt(Double Amt) {
		this.amt = Amt;
	}
		/**
	 * @return s_dbf
	 *			來源檔名
	 */
	public String getS_dbf() {
		return s_dbf;
	}

	/**
	 * @param s_dbf
	 *			來源檔名
	 */
	public void setS_dbf(String S_dbf) {
		this.s_dbf = S_dbf;
	}
		/**
	 * @return s_nbr
	 *			來源編號
	 */
	public String getS_nbr() {
		return s_nbr;
	}

	/**
	 * @param s_nbr
	 *			來源編號
	 */
	public void setS_nbr(String S_nbr) {
		this.s_nbr = S_nbr;
	}
		/**
	 * @return flshamt
	 *			未沖金額
	 */
	public Double getFlshamt() {
		return flshamt;
	}

	/**
	 * @param flshamt
	 *			未沖金額
	 */
	public void setFlshamt(Double Flshamt) {
		this.flshamt = Flshamt;
	}
		/**
	 * @return rec_amt
	 *			已沖金額
	 */
	public Double getRec_amt() {
		return rec_amt;
	}

	/**
	 * @param rec_amt
	 *			已沖金額
	 */
	public void setRec_amt(Double Rec_amt) {
		this.rec_amt = Rec_amt;
	}
		/**
	 * @return io_p
	 *			對象別
	 */
	public String getIo_p() {
		return io_p;
	}

	/**
	 * @param io_p
	 *			對象別
	 */
	public void setIo_p(String Io_p) {
		this.io_p = Io_p;
	}
		/**
	 * @return io_nbr
	 *			客戶代號/廠商代號
	 */
	public String getIo_nbr() {
		return io_nbr;
	}

	/**
	 * @param io_nbr
	 *			客戶代號/廠商代號
	 */
	public void setIo_nbr(String Io_nbr) {
		this.io_nbr = Io_nbr;
	}
		/**
	 * @return io_name
	 *			客戶名稱/廠商名稱
	 */
	public String getIo_name() {
		return io_name;
	}

	/**
	 * @param io_name
	 *			客戶名稱/廠商名稱
	 */
	public void setIo_name(String Io_name) {
		this.io_name = Io_name;
	}
		/**
	 * @return status
	 *			沖款狀態
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @param status
	 *			沖款狀態
	 */
	public void setStatus(String Status) {
		this.status = Status;
	}
		/**
	 * @return st_desc
	 *			狀態說明
	 */
	public String getSt_desc() {
		return st_desc;
	}

	/**
	 * @param st_desc
	 *			狀態說明
	 */
	public void setSt_desc(String St_desc) {
		this.st_desc = St_desc;
	}
		/**
	 * @return is_pz
	 *			是否已打票據
	 */
	public boolean getIs_pz() {
		return is_pz;
	}

	/**
	 * @param is_pz
	 *			是否已打票據
	 */
	public void setIs_pz(boolean Is_pz) {
		this.is_pz = Is_pz;
	}
		/**
	 * @return chk_nbr
	 *			傳票編號
	 */
	public String getChk_nbr() {
		return chk_nbr;
	}

	/**
	 * @param chk_nbr
	 *			傳票編號
	 */
	public void setChk_nbr(String Chk_nbr) {
		this.chk_nbr = Chk_nbr;
	}
	
}

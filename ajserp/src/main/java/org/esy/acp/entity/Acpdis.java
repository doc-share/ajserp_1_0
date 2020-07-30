package org.esy.acp.entity;

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
 *  @date Thu Jul 30 09:45:23 CST 2020
 */
@Entity
@Table(name = "acp_dis" ,indexes = { @Index(name = "created", columnList = "created"), 
@Index(name = "updated", columnList = "updated")})
@EntityInfo("付款單扣款檔")
public class Acpdis extends BaseProperties {

	private static final long serialVersionUID = 1L;

	@FieldInfo("付款單代號")
	@FilterInfo(ListValue = "")
	@Column(name = "nbr", length =32  )
	private String nbr ;

	@FieldInfo("沖款之單據檔名")
	@FilterInfo(ListValue = "")
	@Column(name = "s_dbf", length =32  )
	private String s_dbf ;

	@FieldInfo("沖款之單據號碼")
	@FilterInfo(ListValue = "")
	@Column(name = "s_nbr", length =32  )
	private String s_nbr ;

	@FieldInfo("單據號碼之日期")
	@FilterInfo(ListValue = "")
	@Column(name = "nbrdate")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date nbrdate;

	@FieldInfo("出/退別")
	@FilterInfo(ListValue = "")
	@Column(name = "io_p", length =32  )
	private String io_p ;

	@FieldInfo("廠商編號")
	@FilterInfo(ListValue = "")
	@Column(name = "ven_nbr", length =32  )
	private String ven_nbr ;

	@FieldInfo("結帳月份")
	@FilterInfo(ListValue = "")
	@Column(name = "acr_mon", length =32  )
	private String acr_mon ;

	@FieldInfo("未付金額")
	@FilterInfo(ListValue = "")
	@Column(name = "acr_amt")
	private Double acr_amt;

	@FieldInfo("實付金額")
	@FilterInfo(ListValue = "")
	@Column(name = "rec_amt")
	private Double rec_amt;

	@FieldInfo("單據狀態")
	@FilterInfo(ListValue = "")
	@Column(name = "status", length =32  )
	private String status ;

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
	public Acpdis() {
		super();
	}
	
	/**
	 *
	 * 构造函数
	 *
	 	 * @param nbr
	 *		  付款單代號
	 * 
	 	 * @param s_dbf
	 *		  沖款之單據檔名
	 * 
	 	 * @param s_nbr
	 *		  沖款之單據號碼
	 * 
	 	 * @param nbrdate
	 *		  單據號碼之日期
	 * 
	 	 * @param io_p
	 *		  出/退別
	 * 
	 	 * @param ven_nbr
	 *		  廠商編號
	 * 
	 	 * @param acr_mon
	 *		  結帳月份
	 * 
	 	 * @param acr_amt
	 *		  未付金額
	 * 
	 	 * @param rec_amt
	 *		  實付金額
	 * 
	 	 * @param status
	 *		  單據狀態
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
    	public Acpdis( String nbr, String s_dbf, String s_nbr, Date nbrdate, String io_p, String ven_nbr, String acr_mon, Double acr_amt, Double rec_amt, String status, String tranok, String tranop, Integer trancnt ) {
		super();
				this.nbr = nbr;
				this.s_dbf = s_dbf;
				this.s_nbr = s_nbr;
				this.nbrdate = nbrdate;
				this.io_p = io_p;
				this.ven_nbr = ven_nbr;
				this.acr_mon = acr_mon;
				this.acr_amt = acr_amt;
				this.rec_amt = rec_amt;
				this.status = status;
				this.tranok = tranok;
				this.tranop = tranop;
				this.trancnt = trancnt;
			}

		public Acpdis(String uid) {
		// TODO Auto-generated constructor stub
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
	 * @return s_dbf
	 *			沖款之單據檔名
	 */
	public String getS_dbf() {
		return s_dbf;
	}

	/**
	 * @param s_dbf
	 *			沖款之單據檔名
	 */
	public void setS_dbf(String S_dbf) {
		this.s_dbf = S_dbf;
	}
		/**
	 * @return s_nbr
	 *			沖款之單據號碼
	 */
	public String getS_nbr() {
		return s_nbr;
	}

	/**
	 * @param s_nbr
	 *			沖款之單據號碼
	 */
	public void setS_nbr(String S_nbr) {
		this.s_nbr = S_nbr;
	}
		/**
	 * @return nbrdate
	 *			單據號碼之日期
	 */
	public Date getNbrdate() {
		return nbrdate;
	}

	/**
	 * @param nbrdate
	 *			單據號碼之日期
	 */
	public void setNbrdate(Date Nbrdate) {
		this.nbrdate = Nbrdate;
	}
		/**
	 * @return io_p
	 *			出/退別
	 */
	public String getIo_p() {
		return io_p;
	}

	/**
	 * @param io_p
	 *			出/退別
	 */
	public void setIo_p(String Io_p) {
		this.io_p = Io_p;
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
	 * @return acr_amt
	 *			未付金額
	 */
	public Double getAcr_amt() {
		return acr_amt;
	}

	/**
	 * @param acr_amt
	 *			未付金額
	 */
	public void setAcr_amt(Double Acr_amt) {
		this.acr_amt = Acr_amt;
	}
		/**
	 * @return rec_amt
	 *			實付金額
	 */
	public Double getRec_amt() {
		return rec_amt;
	}

	/**
	 * @param rec_amt
	 *			實付金額
	 */
	public void setRec_amt(Double Rec_amt) {
		this.rec_amt = Rec_amt;
	}
		/**
	 * @return status
	 *			單據狀態
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @param status
	 *			單據狀態
	 */
	public void setStatus(String Status) {
		this.status = Status;
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

package org.esy.pur.entity;

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
 *  @date Wed Aug 05 14:12:46 CST 2020
 */
@Entity
@Table(name = "venchk_bah" ,indexes = { @Index(name = "created", columnList = "created"), 
@Index(name = "updated", columnList = "updated")})
@EntityInfo("廠商調價表頭檔")
public class Venchkbah extends BaseProperties {

	private static final long serialVersionUID = 1L;

	@FieldInfo("單據編號")
	@FilterInfo(ListValue = "")
	@Column(name = "nbr", length =32  )
	private String nbr ;

	@FieldInfo("調價日期")
	@FilterInfo(ListValue = "")
	@Column(name = "nbrdate")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date nbrdate;

	@FieldInfo("調整類號")
	@FilterInfo(ListValue = "")
	@Column(name = "chk_type", length =32  )
	private String chk_type ;

	@FieldInfo("廠商代號")
	@FilterInfo(ListValue = "")
	@Column(name = "ven_nbr", length =32  )
	private String ven_nbr ;

	@FieldInfo("調整方式")
	@FilterInfo(ListValue = "")
	@Column(name = "chk_proc", length =32  )
	private String chk_proc ;

	@FieldInfo("比率")
	@FilterInfo(ListValue = "")
	@Column(name = "chk_ratio")
	private Double chk_ratio;

	@FieldInfo("產品代號(起)")
	@FilterInfo(ListValue = "")
	@Column(name = "item_nbrf", length =32  )
	private String item_nbrf ;

	@FieldInfo("產品代號(迄)")
	@FilterInfo(ListValue = "")
	@Column(name = "item_nbrt", length =32  )
	private String item_nbrt ;

	@FieldInfo("類別代號(起)")
	@FilterInfo(ListValue = "")
	@Column(name = "m_typef", length =32  )
	private String m_typef ;

	@FieldInfo("類別代號(迄)")
	@FilterInfo(ListValue = "")
	@Column(name = "m_typet", length =32  )
	private String m_typet ;

	@FieldInfo("備註")
	@FilterInfo(ListValue = "")
	@Column(name = "remark", columnDefinition = "TEXT")
	private String remark;


     /**
	 *
	 * 构造函数
	 *
	 */
	public Venchkbah() {
		super();
	}
	
	/**
	 *
	 * 构造函数
	 *
	 	 * @param nbr
	 *		  單據編號
	 * 
	 	 * @param nbrdate
	 *		  調價日期
	 * 
	 	 * @param chk_type
	 *		  調整類號
	 * 
	 	 * @param ven_nbr
	 *		  廠商代號
	 * 
	 	 * @param chk_proc
	 *		  調整方式
	 * 
	 	 * @param chk_ratio
	 *		  比率
	 * 
	 	 * @param item_nbrf
	 *		  產品代號(起)
	 * 
	 	 * @param item_nbrt
	 *		  產品代號(迄)
	 * 
	 	 * @param m_typef
	 *		  類別代號(起)
	 * 
	 	 * @param m_typet
	 *		  類別代號(迄)
	 * 
	 	 * @param remark
	 *		  備註
	 * 
	 	 */
    	public Venchkbah( String nbr, Date nbrdate, String chk_type, String ven_nbr, String chk_proc, Double chk_ratio, String item_nbrf, String item_nbrt, String m_typef, String m_typet, String remark ) {
		super();
				this.nbr = nbr;
				this.nbrdate = nbrdate;
				this.chk_type = chk_type;
				this.ven_nbr = ven_nbr;
				this.chk_proc = chk_proc;
				this.chk_ratio = chk_ratio;
				this.item_nbrf = item_nbrf;
				this.item_nbrt = item_nbrt;
				this.m_typef = m_typef;
				this.m_typet = m_typet;
				this.remark = remark;
			}

		/**
	 * @return nbr
	 *			單據編號
	 */
	public String getNbr() {
		return nbr;
	}

	/**
	 * @param nbr
	 *			單據編號
	 */
	public void setNbr(String Nbr) {
		this.nbr = Nbr;
	}
		/**
	 * @return nbrdate
	 *			調價日期
	 */
	public Date getNbrdate() {
		return nbrdate;
	}

	/**
	 * @param nbrdate
	 *			調價日期
	 */
	public void setNbrdate(Date Nbrdate) {
		this.nbrdate = Nbrdate;
	}
		/**
	 * @return chk_type
	 *			調整類號
	 */
	public String getChk_type() {
		return chk_type;
	}

	/**
	 * @param chk_type
	 *			調整類號
	 */
	public void setChk_type(String Chk_type) {
		this.chk_type = Chk_type;
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
	 * @return chk_proc
	 *			調整方式
	 */
	public String getChk_proc() {
		return chk_proc;
	}

	/**
	 * @param chk_proc
	 *			調整方式
	 */
	public void setChk_proc(String Chk_proc) {
		this.chk_proc = Chk_proc;
	}
		/**
	 * @return chk_ratio
	 *			比率
	 */
	public Double getChk_ratio() {
		return chk_ratio;
	}

	/**
	 * @param chk_ratio
	 *			比率
	 */
	public void setChk_ratio(Double Chk_ratio) {
		this.chk_ratio = Chk_ratio;
	}
		/**
	 * @return item_nbrf
	 *			產品代號(起)
	 */
	public String getItem_nbrf() {
		return item_nbrf;
	}

	/**
	 * @param item_nbrf
	 *			產品代號(起)
	 */
	public void setItem_nbrf(String Item_nbrf) {
		this.item_nbrf = Item_nbrf;
	}
		/**
	 * @return item_nbrt
	 *			產品代號(迄)
	 */
	public String getItem_nbrt() {
		return item_nbrt;
	}

	/**
	 * @param item_nbrt
	 *			產品代號(迄)
	 */
	public void setItem_nbrt(String Item_nbrt) {
		this.item_nbrt = Item_nbrt;
	}
		/**
	 * @return m_typef
	 *			類別代號(起)
	 */
	public String getM_typef() {
		return m_typef;
	}

	/**
	 * @param m_typef
	 *			類別代號(起)
	 */
	public void setM_typef(String M_typef) {
		this.m_typef = M_typef;
	}
		/**
	 * @return m_typet
	 *			類別代號(迄)
	 */
	public String getM_typet() {
		return m_typet;
	}

	/**
	 * @param m_typet
	 *			類別代號(迄)
	 */
	public void setM_typet(String M_typet) {
		this.m_typet = M_typet;
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
	
}

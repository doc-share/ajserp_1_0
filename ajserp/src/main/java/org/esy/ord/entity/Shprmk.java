package org.esy.ord.entity;

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
 *  @date Tue Jul 28 15:23:53 CST 2020
 */
@Entity
@Table(name = "shp_rmk" ,indexes = { @Index(name = "created", columnList = "created"), 
@Index(name = "updated", columnList = "updated")})
@EntityInfo("出貨貨運檔")
public class Shprmk extends BaseProperties {

	private static final long serialVersionUID = 1L;

	@FieldInfo("出貨單號碼")
	@FilterInfo(ListValue = "")
	@Column(name = "nbr", length =32  )
	private String nbr ;

	@FieldInfo("貨品資料")
	@FilterInfo(ListValue = "")
	@Column(name = "item_desc", length =128  )
	private String item_desc ;

	@FieldInfo("交貨地點")
	@FilterInfo(ListValue = "")
	@Column(name = "shp_01", length =32  )
	private String shp_01 ;

	@FieldInfo("貨櫃場")
	@FilterInfo(ListValue = "")
	@Column(name = "shp_02", length =32  )
	private String shp_02 ;

	@FieldInfo("船公司")
	@FilterInfo(ListValue = "")
	@Column(name = "shp_03", length =32  )
	private String shp_03 ;

	@FieldInfo("船  名")
	@FilterInfo(ListValue = "")
	@Column(name = "shp_04", length =32  )
	private String shp_04 ;

	@FieldInfo("船  次")
	@FilterInfo(ListValue = "")
	@Column(name = "shp_05", length =32  )
	private String shp_05 ;

	@FieldInfo("S/O   NO")
	@FilterInfo(ListValue = "")
	@Column(name = "shp_06", length =32  )
	private String shp_06 ;

	@FieldInfo("目的地")
	@FilterInfo(ListValue = "")
	@Column(name = "shp_07", length =32  )
	private String shp_07 ;

	@FieldInfo("卸貨日期")
	@FilterInfo(ListValue = "")
	@Column(name = "s_date")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date s_date;

	@FieldInfo("報關行")
	@FilterInfo(ListValue = "")
	@Column(name = "shp_08", length =32  )
	private String shp_08 ;

	@FieldInfo("承運公司")
	@FilterInfo(ListValue = "")
	@Column(name = "shp_09", length =32  )
	private String shp_09 ;

	@FieldInfo("貨櫃長度")
	@FilterInfo(ListValue = "")
	@Column(name = "shp_10", length =32  )
	private String shp_10 ;

	@FieldInfo("領櫃地點")
	@FilterInfo(ListValue = "")
	@Column(name = "shp_11", length =32  )
	private String shp_11 ;

	@FieldInfo("卸貨時間")
	@FilterInfo(ListValue = "")
	@Column(name = "s_time")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date s_time;

	@FieldInfo("填表人")
	@FilterInfo(ListValue = "")
	@Column(name = "writer", length =32  )
	private String writer ;

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
	public Shprmk() {
		super();
	}
	
	/**
	 *
	 * 构造函数
	 *
	 	 * @param nbr
	 *		  出貨單號碼
	 * 
	 	 * @param item_desc
	 *		  貨品資料
	 * 
	 	 * @param shp_01
	 *		  交貨地點
	 * 
	 	 * @param shp_02
	 *		  貨櫃場
	 * 
	 	 * @param shp_03
	 *		  船公司
	 * 
	 	 * @param shp_04
	 *		  船  名
	 * 
	 	 * @param shp_05
	 *		  船  次
	 * 
	 	 * @param shp_06
	 *		  S/O   NO
	 * 
	 	 * @param shp_07
	 *		  目的地
	 * 
	 	 * @param s_date
	 *		  卸貨日期
	 * 
	 	 * @param shp_08
	 *		  報關行
	 * 
	 	 * @param shp_09
	 *		  承運公司
	 * 
	 	 * @param shp_10
	 *		  貨櫃長度
	 * 
	 	 * @param shp_11
	 *		  領櫃地點
	 * 
	 	 * @param s_time
	 *		  卸貨時間
	 * 
	 	 * @param writer
	 *		  填表人
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
    	public Shprmk( String nbr, String item_desc, String shp_01, String shp_02, String shp_03, String shp_04, String shp_05, String shp_06, String shp_07, Date s_date, String shp_08, String shp_09, String shp_10, String shp_11, Date s_time, String writer, String tranok, String tranop, Integer trancnt ) {
		super();
				this.nbr = nbr;
				this.item_desc = item_desc;
				this.shp_01 = shp_01;
				this.shp_02 = shp_02;
				this.shp_03 = shp_03;
				this.shp_04 = shp_04;
				this.shp_05 = shp_05;
				this.shp_06 = shp_06;
				this.shp_07 = shp_07;
				this.s_date = s_date;
				this.shp_08 = shp_08;
				this.shp_09 = shp_09;
				this.shp_10 = shp_10;
				this.shp_11 = shp_11;
				this.s_time = s_time;
				this.writer = writer;
				this.tranok = tranok;
				this.tranop = tranop;
				this.trancnt = trancnt;
			}

		/**
	 * @return nbr
	 *			出貨單號碼
	 */
	public String getNbr() {
		return nbr;
	}

	/**
	 * @param nbr
	 *			出貨單號碼
	 */
	public void setNbr(String Nbr) {
		this.nbr = Nbr;
	}
		/**
	 * @return item_desc
	 *			貨品資料
	 */
	public String getItem_desc() {
		return item_desc;
	}

	/**
	 * @param item_desc
	 *			貨品資料
	 */
	public void setItem_desc(String Item_desc) {
		this.item_desc = Item_desc;
	}
		/**
	 * @return shp_01
	 *			交貨地點
	 */
	public String getShp_01() {
		return shp_01;
	}

	/**
	 * @param shp_01
	 *			交貨地點
	 */
	public void setShp_01(String Shp_01) {
		this.shp_01 = Shp_01;
	}
		/**
	 * @return shp_02
	 *			貨櫃場
	 */
	public String getShp_02() {
		return shp_02;
	}

	/**
	 * @param shp_02
	 *			貨櫃場
	 */
	public void setShp_02(String Shp_02) {
		this.shp_02 = Shp_02;
	}
		/**
	 * @return shp_03
	 *			船公司
	 */
	public String getShp_03() {
		return shp_03;
	}

	/**
	 * @param shp_03
	 *			船公司
	 */
	public void setShp_03(String Shp_03) {
		this.shp_03 = Shp_03;
	}
		/**
	 * @return shp_04
	 *			船  名
	 */
	public String getShp_04() {
		return shp_04;
	}

	/**
	 * @param shp_04
	 *			船  名
	 */
	public void setShp_04(String Shp_04) {
		this.shp_04 = Shp_04;
	}
		/**
	 * @return shp_05
	 *			船  次
	 */
	public String getShp_05() {
		return shp_05;
	}

	/**
	 * @param shp_05
	 *			船  次
	 */
	public void setShp_05(String Shp_05) {
		this.shp_05 = Shp_05;
	}
		/**
	 * @return shp_06
	 *			S/O   NO
	 */
	public String getShp_06() {
		return shp_06;
	}

	/**
	 * @param shp_06
	 *			S/O   NO
	 */
	public void setShp_06(String Shp_06) {
		this.shp_06 = Shp_06;
	}
		/**
	 * @return shp_07
	 *			目的地
	 */
	public String getShp_07() {
		return shp_07;
	}

	/**
	 * @param shp_07
	 *			目的地
	 */
	public void setShp_07(String Shp_07) {
		this.shp_07 = Shp_07;
	}
		/**
	 * @return s_date
	 *			卸貨日期
	 */
	public Date getS_date() {
		return s_date;
	}

	/**
	 * @param s_date
	 *			卸貨日期
	 */
	public void setS_date(Date S_date) {
		this.s_date = S_date;
	}
		/**
	 * @return shp_08
	 *			報關行
	 */
	public String getShp_08() {
		return shp_08;
	}

	/**
	 * @param shp_08
	 *			報關行
	 */
	public void setShp_08(String Shp_08) {
		this.shp_08 = Shp_08;
	}
		/**
	 * @return shp_09
	 *			承運公司
	 */
	public String getShp_09() {
		return shp_09;
	}

	/**
	 * @param shp_09
	 *			承運公司
	 */
	public void setShp_09(String Shp_09) {
		this.shp_09 = Shp_09;
	}
		/**
	 * @return shp_10
	 *			貨櫃長度
	 */
	public String getShp_10() {
		return shp_10;
	}

	/**
	 * @param shp_10
	 *			貨櫃長度
	 */
	public void setShp_10(String Shp_10) {
		this.shp_10 = Shp_10;
	}
		/**
	 * @return shp_11
	 *			領櫃地點
	 */
	public String getShp_11() {
		return shp_11;
	}

	/**
	 * @param shp_11
	 *			領櫃地點
	 */
	public void setShp_11(String Shp_11) {
		this.shp_11 = Shp_11;
	}
		/**
	 * @return s_time
	 *			卸貨時間
	 */
	public Date getS_time() {
		return s_time;
	}

	/**
	 * @param s_time
	 *			卸貨時間
	 */
	public void setS_time(Date S_time) {
		this.s_time = S_time;
	}
		/**
	 * @return writer
	 *			填表人
	 */
	public String getWriter() {
		return writer;
	}

	/**
	 * @param writer
	 *			填表人
	 */
	public void setWriter(String Writer) {
		this.writer = Writer;
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

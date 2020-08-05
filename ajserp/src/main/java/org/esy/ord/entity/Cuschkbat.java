package org.esy.ord.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Index;
import javax.persistence.Table;
import org.esy.base.annotation.EntityInfo;
import org.esy.base.annotation.FieldInfo;
import org.esy.base.core.BaseProperties;
import org.esy.base.annotation.FilterInfo;



/**
 *  实体类
 * 
 * @author <a href="mailto:ardui@163.com"ardui</a
 *  @date Wed Aug 05 12:45:19 CST 2020
 */
@Entity
@Table(name = "cuschk_bat" ,indexes = { @Index(name = "created", columnList = "created"), 
@Index(name = "updated", columnList = "updated")})
@EntityInfo("客戶調價明細檔")
public class Cuschkbat extends BaseProperties {

	private static final long serialVersionUID = 1L;

	@FieldInfo("單據編號")
	@FilterInfo(ListValue = "")
	@Column(name = "nbr", length =32  )
	private String nbr ;

	@FieldInfo("產品代號")
	@FilterInfo(ListValue = "")
	@Column(name = "item_nbr", length =32  )
	private String item_nbr ;

	@FieldInfo("客戶產品代號")
	@FilterInfo(ListValue = "")
	@Column(name = "chk_item", length =32  )
	private String chk_item ;

	@FieldInfo("客戶代號")
	@FilterInfo(ListValue = "")
	@Column(name = "cus_nbr", length =32  )
	private String cus_nbr ;

	@FieldInfo("單位")
	@FilterInfo(ListValue = "")
	@Column(name = "unit", length =32  )
	private String unit ;

	@FieldInfo("幣別")
	@FilterInfo(ListValue = "")
	@Column(name = "coin_nbr", length =32  )
	private String coin_nbr ;

	@FieldInfo("製程代號")
	@FilterInfo(ListValue = "")
	@Column(name = "pro_nbr", length =32  )
	private String pro_nbr ;

	@FieldInfo("類別代號")
	@FilterInfo(ListValue = "")
	@Column(name = "m_type", length =32  )
	private String m_type ;

	@FieldInfo("原單價")
	@FilterInfo(ListValue = "")
	@Column(name = "old_price")
	private Double old_price;

	@FieldInfo("新單價")
	@FilterInfo(ListValue = "")
	@Column(name = "price")
	private Double price;

	@FieldInfo("備註")
	@FilterInfo(ListValue = "")
	@Column(name = "remark", length =32  )
	private String remark ;

	@FieldInfo("是否特殊警告")
	@FilterInfo(ListValue = "")
	@Column(name = "ts_sure", length =32  )
	private String ts_sure ;

	@FieldInfo("警告說明")
	@FilterInfo(ListValue = "")
	@Column(name = "ts_desc", length =128  )
	private String ts_desc ;


     /**
	 *
	 * 构造函数
	 *
	 */
	public Cuschkbat() {
		super();
	}
	
	/**
	 *
	 * 构造函数
	 *
	 	 * @param nbr
	 *		  單據編號
	 * 
	 	 * @param item_nbr
	 *		  產品代號
	 * 
	 	 * @param chk_item
	 *		  客戶產品代號
	 * 
	 	 * @param cus_nbr
	 *		  客戶代號
	 * 
	 	 * @param unit
	 *		  單位
	 * 
	 	 * @param coin_nbr
	 *		  幣別
	 * 
	 	 * @param pro_nbr
	 *		  製程代號
	 * 
	 	 * @param m_type
	 *		  類別代號
	 * 
	 	 * @param old_price
	 *		  原單價
	 * 
	 	 * @param price
	 *		  新單價
	 * 
	 	 * @param remark
	 *		  備註
	 * 
	 	 * @param ts_sure
	 *		  是否特殊警告
	 * 
	 	 * @param ts_desc
	 *		  警告說明
	 * 
	 	 */
    	public Cuschkbat( String nbr, String item_nbr, String chk_item, String cus_nbr, String unit, String coin_nbr, String pro_nbr, String m_type, Double old_price, Double price, String remark, String ts_sure, String ts_desc ) {
		super();
				this.nbr = nbr;
				this.item_nbr = item_nbr;
				this.chk_item = chk_item;
				this.cus_nbr = cus_nbr;
				this.unit = unit;
				this.coin_nbr = coin_nbr;
				this.pro_nbr = pro_nbr;
				this.m_type = m_type;
				this.old_price = old_price;
				this.price = price;
				this.remark = remark;
				this.ts_sure = ts_sure;
				this.ts_desc = ts_desc;
			}

		public Cuschkbat(String uid) {
		// TODO Auto-generated constructor stub
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
	 * @return chk_item
	 *			客戶產品代號
	 */
	public String getChk_item() {
		return chk_item;
	}

	/**
	 * @param chk_item
	 *			客戶產品代號
	 */
	public void setChk_item(String Chk_item) {
		this.chk_item = Chk_item;
	}
		/**
	 * @return cus_nbr
	 *			客戶代號
	 */
	public String getCus_nbr() {
		return cus_nbr;
	}

	/**
	 * @param cus_nbr
	 *			客戶代號
	 */
	public void setCus_nbr(String Cus_nbr) {
		this.cus_nbr = Cus_nbr;
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
		/**
	 * @return pro_nbr
	 *			製程代號
	 */
	public String getPro_nbr() {
		return pro_nbr;
	}

	/**
	 * @param pro_nbr
	 *			製程代號
	 */
	public void setPro_nbr(String Pro_nbr) {
		this.pro_nbr = Pro_nbr;
	}
		/**
	 * @return m_type
	 *			類別代號
	 */
	public String getM_type() {
		return m_type;
	}

	/**
	 * @param m_type
	 *			類別代號
	 */
	public void setM_type(String M_type) {
		this.m_type = M_type;
	}
		/**
	 * @return old_price
	 *			原單價
	 */
	public Double getOld_price() {
		return old_price;
	}

	/**
	 * @param old_price
	 *			原單價
	 */
	public void setOld_price(Double Old_price) {
		this.old_price = Old_price;
	}
		/**
	 * @return price
	 *			新單價
	 */
	public Double getPrice() {
		return price;
	}

	/**
	 * @param price
	 *			新單價
	 */
	public void setPrice(Double Price) {
		this.price = Price;
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
	 * @return ts_sure
	 *			是否特殊警告
	 */
	public String getTs_sure() {
		return ts_sure;
	}

	/**
	 * @param ts_sure
	 *			是否特殊警告
	 */
	public void setTs_sure(String Ts_sure) {
		this.ts_sure = Ts_sure;
	}
		/**
	 * @return ts_desc
	 *			警告說明
	 */
	public String getTs_desc() {
		return ts_desc;
	}

	/**
	 * @param ts_desc
	 *			警告說明
	 */
	public void setTs_desc(String Ts_desc) {
		this.ts_desc = Ts_desc;
	}
	
}

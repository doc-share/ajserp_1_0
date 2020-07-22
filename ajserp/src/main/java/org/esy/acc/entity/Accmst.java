package org.esy.acc.entity;

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
 *  @date Sat Jun 20 09:12:51 CST 2020
 */
@Entity
@Table(name = "acc_mst" ,indexes = { @Index(name = "created", columnList = "created"), 
@Index(name = "updated", columnList = "updated")})
@EntityInfo("會計科目")
public class Accmst extends BaseProperties {

	private static final long serialVersionUID = 1L;

	@FieldInfo("年度")
	@FilterInfo(ListValue = "")
	@Column(name = "year", length =32  )
	private String year ;

	@FieldInfo("會計科目")
	@FilterInfo(ListValue = "")
	@Column(name = "acc_id", length =32  )
	private String acc_id ;

	@FieldInfo("會計科目稱")
	@FilterInfo(ListValue = "")
	@Column(name = "acc_name", length =32  )
	private String acc_name ;

	@FieldInfo("名稱譯音碼")
	@FilterInfo(ListValue = "")
	@Column(name = "big5", length =32  )
	private String big5 ;

	@FieldInfo("科目類別")
	@FilterInfo(ListValue = "")
	@Column(name = "cd_type", length =32  )
	private String cd_type ;

	@FieldInfo("借貸別")
	@FilterInfo(ListValue = "")
	@Column(name = "c_or_d", length =32  )
	private String c_or_d ;

	@FieldInfo("大分類")
	@FilterInfo(ListValue = "")
	@Column(name = "assy_cd1", length =32  )
	private String assy_cd1 ;

	@FieldInfo("中分類")
	@FilterInfo(ListValue = "")
	@Column(name = "assy_cd2", length =32  )
	private String assy_cd2 ;

	@FieldInfo("分類英文名稱")
	@FilterInfo(ListValue = "")
	@Column(name = "eng_desc", length =32  )
	private String eng_desc ;

	@FieldInfo("幣別")
	@FilterInfo(ListValue = "")
	@Column(name = "coin_nbr", length =32  )
	private String coin_nbr ;

	@FieldInfo("備註")
	@FilterInfo(ListValue = "")
	@Column(name = "remark", length =32  )
	private String remark ;

	@FieldInfo("期初貸方累積金額")
	@FilterInfo(ListValue = "")
	@Column(name = "c_cost0", length =32  )
	private String c_cost0 ;

	@FieldInfo("期初借方累積金額")
	@FilterInfo(ListValue = "")
	@Column(name = "d_cost0", length =32  )
	private String d_cost0 ;

	@FieldInfo("期初預算金額")
	@FilterInfo(ListValue = "")
	@Column(name = "eval0", length =32  )
	private String eval0 ;

	@FieldInfo("第01會計期間貸方累積金額")
	@FilterInfo(ListValue = "")
	@Column(name = "c_cost1", length =32  )
	private String c_cost1 ;

	@FieldInfo("第01會計期間借方累積金額")
	@FilterInfo(ListValue = "")
	@Column(name = "d_cost1", length =32  )
	private String d_cost1 ;

	@FieldInfo("第01會計期間預算金額")
	@FilterInfo(ListValue = "")
	@Column(name = "eval1", length =32  )
	private String eval1 ;

	@FieldInfo("第02會計期間貸方累積金額")
	@FilterInfo(ListValue = "")
	@Column(name = "c_cost2", length =32  )
	private String c_cost2 ;

	@FieldInfo("第02會計期間借方累積金額")
	@FilterInfo(ListValue = "")
	@Column(name = "d_cost2", length =32  )
	private String d_cost2 ;

	@FieldInfo("第02會計期間預算金額")
	@FilterInfo(ListValue = "")
	@Column(name = "eval2", length =32  )
	private String eval2 ;

	@FieldInfo("第03會計期間貸方累積金額")
	@FilterInfo(ListValue = "")
	@Column(name = "c_cost3", length =32  )
	private String c_cost3 ;

	@FieldInfo("第03會計期間借方累積金額")
	@FilterInfo(ListValue = "")
	@Column(name = "d_cost3", length =32  )
	private String d_cost3 ;

	@FieldInfo("第03會計期間預算金額")
	@FilterInfo(ListValue = "")
	@Column(name = "eval3", length =32  )
	private String eval3 ;

	@FieldInfo("第04會計期間貸方累積金額")
	@FilterInfo(ListValue = "")
	@Column(name = "c_cost4", length =32  )
	private String c_cost4 ;

	@FieldInfo("第04會計期間借方累積金額")
	@FilterInfo(ListValue = "")
	@Column(name = "d_cost4", length =32  )
	private String d_cost4 ;

	@FieldInfo("第04會計期間預算金額")
	@FilterInfo(ListValue = "")
	@Column(name = "eval4", length =32  )
	private String eval4 ;

	@FieldInfo("第05會計期間貸方累積金額")
	@FilterInfo(ListValue = "")
	@Column(name = "c_cost5", length =32  )
	private String c_cost5 ;

	@FieldInfo("第05會計期間借方累積金額")
	@FilterInfo(ListValue = "")
	@Column(name = "d_cost5", length =32  )
	private String d_cost5 ;

	@FieldInfo("第05會計期間預算金額")
	@FilterInfo(ListValue = "")
	@Column(name = "eval5", length =32  )
	private String eval5 ;

	@FieldInfo("第06會計期間貸方累積金額")
	@FilterInfo(ListValue = "")
	@Column(name = "c_cost6", length =32  )
	private String c_cost6 ;

	@FieldInfo("第06會計期間借方累積金額")
	@FilterInfo(ListValue = "")
	@Column(name = "d_cost6", length =32  )
	private String d_cost6 ;

	@FieldInfo("第06會計期間預算金額")
	@FilterInfo(ListValue = "")
	@Column(name = "eval6", length =32  )
	private String eval6 ;

	@FieldInfo("第07會計期間貸方累積金額")
	@FilterInfo(ListValue = "")
	@Column(name = "c_cost7", length =32  )
	private String c_cost7 ;

	@FieldInfo("第07會計期間借方累積金額")
	@FilterInfo(ListValue = "")
	@Column(name = "d_cost7", length =32  )
	private String d_cost7 ;

	@FieldInfo("第07會計期間預算金額")
	@FilterInfo(ListValue = "")
	@Column(name = "eval7", length =32  )
	private String eval7 ;

	@FieldInfo("第08會計期間貸方累積金額")
	@FilterInfo(ListValue = "")
	@Column(name = "c_cost8", length =32  )
	private String c_cost8 ;

	@FieldInfo("第08會計期間借方累積金額")
	@FilterInfo(ListValue = "")
	@Column(name = "d_cost8", length =32  )
	private String d_cost8 ;

	@FieldInfo("第08會計期間預算金額")
	@FilterInfo(ListValue = "")
	@Column(name = "eval8", length =32  )
	private String eval8 ;

	@FieldInfo("第09會計期間貸方累積金額")
	@FilterInfo(ListValue = "")
	@Column(name = "c_cost9", length =32  )
	private String c_cost9 ;

	@FieldInfo("第09會計期間借方累積金額")
	@FilterInfo(ListValue = "")
	@Column(name = "d_cost9", length =32  )
	private String d_cost9 ;

	@FieldInfo("第09會計期間預算金額")
	@FilterInfo(ListValue = "")
	@Column(name = "eval9", length =32  )
	private String eval9 ;

	@FieldInfo("第10會計期間貸方累積金額")
	@FilterInfo(ListValue = "")
	@Column(name = "c_cost10", length =32  )
	private String c_cost10 ;

	@FieldInfo("第10會計期間借方累積金額")
	@FilterInfo(ListValue = "")
	@Column(name = "d_cost10", length =32  )
	private String d_cost10 ;

	@FieldInfo("第10會計期間預算金額")
	@FilterInfo(ListValue = "")
	@Column(name = "eval10", length =32  )
	private String eval10 ;

	@FieldInfo("第11會計期間貸方累積金額")
	@FilterInfo(ListValue = "")
	@Column(name = "c_cost11", length =32  )
	private String c_cost11 ;

	@FieldInfo("第11會計期間借方累積金額")
	@FilterInfo(ListValue = "")
	@Column(name = "d_cost11", length =32  )
	private String d_cost11 ;

	@FieldInfo("第11會計期間預算金額")
	@FilterInfo(ListValue = "")
	@Column(name = "eval11", length =32  )
	private String eval11 ;

	@FieldInfo("第12會計期間貸方累積金額")
	@FilterInfo(ListValue = "")
	@Column(name = "c_cost12", length =32  )
	private String c_cost12 ;

	@FieldInfo("第12會計期間借方累積金額")
	@FilterInfo(ListValue = "")
	@Column(name = "d_cost12", length =32  )
	private String d_cost12 ;

	@FieldInfo("第12會計期間預算金額")
	@FilterInfo(ListValue = "")
	@Column(name = "eval12", length =32  )
	private String eval12 ;

	@FieldInfo("期末貸方累積金額")
	@FilterInfo(ListValue = "")
	@Column(name = "c_cost20", length =32  )
	private String c_cost20 ;

	@FieldInfo("期末借方累積金額")
	@FilterInfo(ListValue = "")
	@Column(name = "d_cost20", length =32  )
	private String d_cost20 ;

	@FieldInfo("轉出狀態")
	@FilterInfo(ListValue = "")
	@Column(name = "tranok", length =32  )
	private String tranok ;

	@FieldInfo("操作型態")
	@FilterInfo(ListValue = "")
	@Column(name = "tranop", length =32  )
	private String tranop ;

	@FieldInfo("轉出次數")
	@FilterInfo(ListValue = "")
	@Column(name = "trancnt", length =32  )
	private String trancnt ;


     /**
	 *
	 * 构造函数
	 *
	 */
	public Accmst() {
		super();
	}
	
	/**
	 *
	 * 构造函数
	 *
	 	 * @param year
	 *		  年度
	 * 
	 	 * @param acc_id
	 *		  會計科目
	 * 
	 	 * @param acc_name
	 *		  會計科目稱
	 * 
	 	 * @param big5
	 *		  名稱譯音碼
	 * 
	 	 * @param cd_type
	 *		  科目類別
	 * 
	 	 * @param c_or_d
	 *		  借貸別
	 * 
	 	 * @param assy_cd1
	 *		  大分類
	 * 
	 	 * @param assy_cd2
	 *		  中分類
	 * 
	 	 * @param eng_desc
	 *		  分類英文名稱
	 * 
	 	 * @param coin_nbr
	 *		  幣別
	 * 
	 	 * @param remark
	 *		  備註
	 * 
	 	 * @param c_cost0
	 *		  期初貸方累積金額
	 * 
	 	 * @param d_cost0
	 *		  期初借方累積金額
	 * 
	 	 * @param eval0
	 *		  期初預算金額
	 * 
	 	 * @param c_cost1
	 *		  第01會計期間貸方累積金額
	 * 
	 	 * @param d_cost1
	 *		  第01會計期間借方累積金額
	 * 
	 	 * @param eval1
	 *		  第01會計期間預算金額
	 * 
	 	 * @param c_cost2
	 *		  第02會計期間貸方累積金額
	 * 
	 	 * @param d_cost2
	 *		  第02會計期間借方累積金額
	 * 
	 	 * @param eval2
	 *		  第02會計期間預算金額
	 * 
	 	 * @param c_cost3
	 *		  第03會計期間貸方累積金額
	 * 
	 	 * @param d_cost3
	 *		  第03會計期間借方累積金額
	 * 
	 	 * @param eval3
	 *		  第03會計期間預算金額
	 * 
	 	 * @param c_cost4
	 *		  第04會計期間貸方累積金額
	 * 
	 	 * @param d_cost4
	 *		  第04會計期間借方累積金額
	 * 
	 	 * @param eval4
	 *		  第04會計期間預算金額
	 * 
	 	 * @param c_cost5
	 *		  第05會計期間貸方累積金額
	 * 
	 	 * @param d_cost5
	 *		  第05會計期間借方累積金額
	 * 
	 	 * @param eval5
	 *		  第05會計期間預算金額
	 * 
	 	 * @param c_cost6
	 *		  第06會計期間貸方累積金額
	 * 
	 	 * @param d_cost6
	 *		  第06會計期間借方累積金額
	 * 
	 	 * @param eval6
	 *		  第06會計期間預算金額
	 * 
	 	 * @param c_cost7
	 *		  第07會計期間貸方累積金額
	 * 
	 	 * @param d_cost7
	 *		  第07會計期間借方累積金額
	 * 
	 	 * @param eval7
	 *		  第07會計期間預算金額
	 * 
	 	 * @param c_cost8
	 *		  第08會計期間貸方累積金額
	 * 
	 	 * @param d_cost8
	 *		  第08會計期間借方累積金額
	 * 
	 	 * @param eval8
	 *		  第08會計期間預算金額
	 * 
	 	 * @param c_cost9
	 *		  第09會計期間貸方累積金額
	 * 
	 	 * @param d_cost9
	 *		  第09會計期間借方累積金額
	 * 
	 	 * @param eval9
	 *		  第09會計期間預算金額
	 * 
	 	 * @param c_cost10
	 *		  第10會計期間貸方累積金額
	 * 
	 	 * @param d_cost10
	 *		  第10會計期間借方累積金額
	 * 
	 	 * @param eval10
	 *		  第10會計期間預算金額
	 * 
	 	 * @param c_cost11
	 *		  第11會計期間貸方累積金額
	 * 
	 	 * @param d_cost11
	 *		  第11會計期間借方累積金額
	 * 
	 	 * @param eval11
	 *		  第11會計期間預算金額
	 * 
	 	 * @param c_cost12
	 *		  第12會計期間貸方累積金額
	 * 
	 	 * @param d_cost12
	 *		  第12會計期間借方累積金額
	 * 
	 	 * @param eval12
	 *		  第12會計期間預算金額
	 * 
	 	 * @param c_cost20
	 *		  期末貸方累積金額
	 * 
	 	 * @param d_cost20
	 *		  期末借方累積金額
	 * 
	 	 * @param tranok
	 *		  轉出狀態
	 * 
	 	 * @param tranop
	 *		  操作型態
	 * 
	 	 * @param trancnt
	 *		  轉出次數
	 * 
	 	 */
    	public Accmst( String year, String acc_id, String acc_name, String big5, String cd_type, String c_or_d, String assy_cd1, String assy_cd2, String eng_desc, String coin_nbr, String remark, String c_cost0, String d_cost0, String eval0, String c_cost1, String d_cost1, String eval1, String c_cost2, String d_cost2, String eval2, String c_cost3, String d_cost3, String eval3, String c_cost4, String d_cost4, String eval4, String c_cost5, String d_cost5, String eval5, String c_cost6, String d_cost6, String eval6, String c_cost7, String d_cost7, String eval7, String c_cost8, String d_cost8, String eval8, String c_cost9, String d_cost9, String eval9, String c_cost10, String d_cost10, String eval10, String c_cost11, String d_cost11, String eval11, String c_cost12, String d_cost12, String eval12, String c_cost20, String d_cost20, String tranok, String tranop, String trancnt ) {
		super();
				this.year = year;
				this.acc_id = acc_id;
				this.acc_name = acc_name;
				this.big5 = big5;
				this.cd_type = cd_type;
				this.c_or_d = c_or_d;
				this.assy_cd1 = assy_cd1;
				this.assy_cd2 = assy_cd2;
				this.eng_desc = eng_desc;
				this.coin_nbr = coin_nbr;
				this.remark = remark;
				this.c_cost0 = c_cost0;
				this.d_cost0 = d_cost0;
				this.eval0 = eval0;
				this.c_cost1 = c_cost1;
				this.d_cost1 = d_cost1;
				this.eval1 = eval1;
				this.c_cost2 = c_cost2;
				this.d_cost2 = d_cost2;
				this.eval2 = eval2;
				this.c_cost3 = c_cost3;
				this.d_cost3 = d_cost3;
				this.eval3 = eval3;
				this.c_cost4 = c_cost4;
				this.d_cost4 = d_cost4;
				this.eval4 = eval4;
				this.c_cost5 = c_cost5;
				this.d_cost5 = d_cost5;
				this.eval5 = eval5;
				this.c_cost6 = c_cost6;
				this.d_cost6 = d_cost6;
				this.eval6 = eval6;
				this.c_cost7 = c_cost7;
				this.d_cost7 = d_cost7;
				this.eval7 = eval7;
				this.c_cost8 = c_cost8;
				this.d_cost8 = d_cost8;
				this.eval8 = eval8;
				this.c_cost9 = c_cost9;
				this.d_cost9 = d_cost9;
				this.eval9 = eval9;
				this.c_cost10 = c_cost10;
				this.d_cost10 = d_cost10;
				this.eval10 = eval10;
				this.c_cost11 = c_cost11;
				this.d_cost11 = d_cost11;
				this.eval11 = eval11;
				this.c_cost12 = c_cost12;
				this.d_cost12 = d_cost12;
				this.eval12 = eval12;
				this.c_cost20 = c_cost20;
				this.d_cost20 = d_cost20;
				this.tranok = tranok;
				this.tranop = tranop;
				this.trancnt = trancnt;
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
	 *			會計科目稱
	 */
	public String getAcc_name() {
		return acc_name;
	}

	/**
	 * @param acc_name
	 *			會計科目稱
	 */
	public void setAcc_name(String Acc_name) {
		this.acc_name = Acc_name;
	}
		/**
	 * @return big5
	 *			名稱譯音碼
	 */
	public String getBig5() {
		return big5;
	}

	/**
	 * @param big5
	 *			名稱譯音碼
	 */
	public void setBig5(String Big5) {
		this.big5 = Big5;
	}
		/**
	 * @return cd_type
	 *			科目類別
	 */
	public String getCd_type() {
		return cd_type;
	}

	/**
	 * @param cd_type
	 *			科目類別
	 */
	public void setCd_type(String Cd_type) {
		this.cd_type = Cd_type;
	}
		/**
	 * @return c_or_d
	 *			借貸別
	 */
	public String getC_or_d() {
		return c_or_d;
	}

	/**
	 * @param c_or_d
	 *			借貸別
	 */
	public void setC_or_d(String C_or_d) {
		this.c_or_d = C_or_d;
	}
		/**
	 * @return assy_cd1
	 *			大分類
	 */
	public String getAssy_cd1() {
		return assy_cd1;
	}

	/**
	 * @param assy_cd1
	 *			大分類
	 */
	public void setAssy_cd1(String Assy_cd1) {
		this.assy_cd1 = Assy_cd1;
	}
		/**
	 * @return assy_cd2
	 *			中分類
	 */
	public String getAssy_cd2() {
		return assy_cd2;
	}

	/**
	 * @param assy_cd2
	 *			中分類
	 */
	public void setAssy_cd2(String Assy_cd2) {
		this.assy_cd2 = Assy_cd2;
	}
		/**
	 * @return eng_desc
	 *			分類英文名稱
	 */
	public String getEng_desc() {
		return eng_desc;
	}

	/**
	 * @param eng_desc
	 *			分類英文名稱
	 */
	public void setEng_desc(String Eng_desc) {
		this.eng_desc = Eng_desc;
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
	 * @return c_cost0
	 *			期初貸方累積金額
	 */
	public String getC_cost0() {
		return c_cost0;
	}

	/**
	 * @param c_cost0
	 *			期初貸方累積金額
	 */
	public void setC_cost0(String C_cost0) {
		this.c_cost0 = C_cost0;
	}
		/**
	 * @return d_cost0
	 *			期初借方累積金額
	 */
	public String getD_cost0() {
		return d_cost0;
	}

	/**
	 * @param d_cost0
	 *			期初借方累積金額
	 */
	public void setD_cost0(String D_cost0) {
		this.d_cost0 = D_cost0;
	}
		/**
	 * @return eval0
	 *			期初預算金額
	 */
	public String getEval0() {
		return eval0;
	}

	/**
	 * @param eval0
	 *			期初預算金額
	 */
	public void setEval0(String Eval0) {
		this.eval0 = Eval0;
	}
		/**
	 * @return c_cost1
	 *			第01會計期間貸方累積金額
	 */
	public String getC_cost1() {
		return c_cost1;
	}

	/**
	 * @param c_cost1
	 *			第01會計期間貸方累積金額
	 */
	public void setC_cost1(String C_cost1) {
		this.c_cost1 = C_cost1;
	}
		/**
	 * @return d_cost1
	 *			第01會計期間借方累積金額
	 */
	public String getD_cost1() {
		return d_cost1;
	}

	/**
	 * @param d_cost1
	 *			第01會計期間借方累積金額
	 */
	public void setD_cost1(String D_cost1) {
		this.d_cost1 = D_cost1;
	}
		/**
	 * @return eval1
	 *			第01會計期間預算金額
	 */
	public String getEval1() {
		return eval1;
	}

	/**
	 * @param eval1
	 *			第01會計期間預算金額
	 */
	public void setEval1(String Eval1) {
		this.eval1 = Eval1;
	}
		/**
	 * @return c_cost2
	 *			第02會計期間貸方累積金額
	 */
	public String getC_cost2() {
		return c_cost2;
	}

	/**
	 * @param c_cost2
	 *			第02會計期間貸方累積金額
	 */
	public void setC_cost2(String C_cost2) {
		this.c_cost2 = C_cost2;
	}
		/**
	 * @return d_cost2
	 *			第02會計期間借方累積金額
	 */
	public String getD_cost2() {
		return d_cost2;
	}

	/**
	 * @param d_cost2
	 *			第02會計期間借方累積金額
	 */
	public void setD_cost2(String D_cost2) {
		this.d_cost2 = D_cost2;
	}
		/**
	 * @return eval2
	 *			第02會計期間預算金額
	 */
	public String getEval2() {
		return eval2;
	}

	/**
	 * @param eval2
	 *			第02會計期間預算金額
	 */
	public void setEval2(String Eval2) {
		this.eval2 = Eval2;
	}
		/**
	 * @return c_cost3
	 *			第03會計期間貸方累積金額
	 */
	public String getC_cost3() {
		return c_cost3;
	}

	/**
	 * @param c_cost3
	 *			第03會計期間貸方累積金額
	 */
	public void setC_cost3(String C_cost3) {
		this.c_cost3 = C_cost3;
	}
		/**
	 * @return d_cost3
	 *			第03會計期間借方累積金額
	 */
	public String getD_cost3() {
		return d_cost3;
	}

	/**
	 * @param d_cost3
	 *			第03會計期間借方累積金額
	 */
	public void setD_cost3(String D_cost3) {
		this.d_cost3 = D_cost3;
	}
		/**
	 * @return eval3
	 *			第03會計期間預算金額
	 */
	public String getEval3() {
		return eval3;
	}

	/**
	 * @param eval3
	 *			第03會計期間預算金額
	 */
	public void setEval3(String Eval3) {
		this.eval3 = Eval3;
	}
		/**
	 * @return c_cost4
	 *			第04會計期間貸方累積金額
	 */
	public String getC_cost4() {
		return c_cost4;
	}

	/**
	 * @param c_cost4
	 *			第04會計期間貸方累積金額
	 */
	public void setC_cost4(String C_cost4) {
		this.c_cost4 = C_cost4;
	}
		/**
	 * @return d_cost4
	 *			第04會計期間借方累積金額
	 */
	public String getD_cost4() {
		return d_cost4;
	}

	/**
	 * @param d_cost4
	 *			第04會計期間借方累積金額
	 */
	public void setD_cost4(String D_cost4) {
		this.d_cost4 = D_cost4;
	}
		/**
	 * @return eval4
	 *			第04會計期間預算金額
	 */
	public String getEval4() {
		return eval4;
	}

	/**
	 * @param eval4
	 *			第04會計期間預算金額
	 */
	public void setEval4(String Eval4) {
		this.eval4 = Eval4;
	}
		/**
	 * @return c_cost5
	 *			第05會計期間貸方累積金額
	 */
	public String getC_cost5() {
		return c_cost5;
	}

	/**
	 * @param c_cost5
	 *			第05會計期間貸方累積金額
	 */
	public void setC_cost5(String C_cost5) {
		this.c_cost5 = C_cost5;
	}
		/**
	 * @return d_cost5
	 *			第05會計期間借方累積金額
	 */
	public String getD_cost5() {
		return d_cost5;
	}

	/**
	 * @param d_cost5
	 *			第05會計期間借方累積金額
	 */
	public void setD_cost5(String D_cost5) {
		this.d_cost5 = D_cost5;
	}
		/**
	 * @return eval5
	 *			第05會計期間預算金額
	 */
	public String getEval5() {
		return eval5;
	}

	/**
	 * @param eval5
	 *			第05會計期間預算金額
	 */
	public void setEval5(String Eval5) {
		this.eval5 = Eval5;
	}
		/**
	 * @return c_cost6
	 *			第06會計期間貸方累積金額
	 */
	public String getC_cost6() {
		return c_cost6;
	}

	/**
	 * @param c_cost6
	 *			第06會計期間貸方累積金額
	 */
	public void setC_cost6(String C_cost6) {
		this.c_cost6 = C_cost6;
	}
		/**
	 * @return d_cost6
	 *			第06會計期間借方累積金額
	 */
	public String getD_cost6() {
		return d_cost6;
	}

	/**
	 * @param d_cost6
	 *			第06會計期間借方累積金額
	 */
	public void setD_cost6(String D_cost6) {
		this.d_cost6 = D_cost6;
	}
		/**
	 * @return eval6
	 *			第06會計期間預算金額
	 */
	public String getEval6() {
		return eval6;
	}

	/**
	 * @param eval6
	 *			第06會計期間預算金額
	 */
	public void setEval6(String Eval6) {
		this.eval6 = Eval6;
	}
		/**
	 * @return c_cost7
	 *			第07會計期間貸方累積金額
	 */
	public String getC_cost7() {
		return c_cost7;
	}

	/**
	 * @param c_cost7
	 *			第07會計期間貸方累積金額
	 */
	public void setC_cost7(String C_cost7) {
		this.c_cost7 = C_cost7;
	}
		/**
	 * @return d_cost7
	 *			第07會計期間借方累積金額
	 */
	public String getD_cost7() {
		return d_cost7;
	}

	/**
	 * @param d_cost7
	 *			第07會計期間借方累積金額
	 */
	public void setD_cost7(String D_cost7) {
		this.d_cost7 = D_cost7;
	}
		/**
	 * @return eval7
	 *			第07會計期間預算金額
	 */
	public String getEval7() {
		return eval7;
	}

	/**
	 * @param eval7
	 *			第07會計期間預算金額
	 */
	public void setEval7(String Eval7) {
		this.eval7 = Eval7;
	}
		/**
	 * @return c_cost8
	 *			第08會計期間貸方累積金額
	 */
	public String getC_cost8() {
		return c_cost8;
	}

	/**
	 * @param c_cost8
	 *			第08會計期間貸方累積金額
	 */
	public void setC_cost8(String C_cost8) {
		this.c_cost8 = C_cost8;
	}
		/**
	 * @return d_cost8
	 *			第08會計期間借方累積金額
	 */
	public String getD_cost8() {
		return d_cost8;
	}

	/**
	 * @param d_cost8
	 *			第08會計期間借方累積金額
	 */
	public void setD_cost8(String D_cost8) {
		this.d_cost8 = D_cost8;
	}
		/**
	 * @return eval8
	 *			第08會計期間預算金額
	 */
	public String getEval8() {
		return eval8;
	}

	/**
	 * @param eval8
	 *			第08會計期間預算金額
	 */
	public void setEval8(String Eval8) {
		this.eval8 = Eval8;
	}
		/**
	 * @return c_cost9
	 *			第09會計期間貸方累積金額
	 */
	public String getC_cost9() {
		return c_cost9;
	}

	/**
	 * @param c_cost9
	 *			第09會計期間貸方累積金額
	 */
	public void setC_cost9(String C_cost9) {
		this.c_cost9 = C_cost9;
	}
		/**
	 * @return d_cost9
	 *			第09會計期間借方累積金額
	 */
	public String getD_cost9() {
		return d_cost9;
	}

	/**
	 * @param d_cost9
	 *			第09會計期間借方累積金額
	 */
	public void setD_cost9(String D_cost9) {
		this.d_cost9 = D_cost9;
	}
		/**
	 * @return eval9
	 *			第09會計期間預算金額
	 */
	public String getEval9() {
		return eval9;
	}

	/**
	 * @param eval9
	 *			第09會計期間預算金額
	 */
	public void setEval9(String Eval9) {
		this.eval9 = Eval9;
	}
		/**
	 * @return c_cost10
	 *			第10會計期間貸方累積金額
	 */
	public String getC_cost10() {
		return c_cost10;
	}

	/**
	 * @param c_cost10
	 *			第10會計期間貸方累積金額
	 */
	public void setC_cost10(String C_cost10) {
		this.c_cost10 = C_cost10;
	}
		/**
	 * @return d_cost10
	 *			第10會計期間借方累積金額
	 */
	public String getD_cost10() {
		return d_cost10;
	}

	/**
	 * @param d_cost10
	 *			第10會計期間借方累積金額
	 */
	public void setD_cost10(String D_cost10) {
		this.d_cost10 = D_cost10;
	}
		/**
	 * @return eval10
	 *			第10會計期間預算金額
	 */
	public String getEval10() {
		return eval10;
	}

	/**
	 * @param eval10
	 *			第10會計期間預算金額
	 */
	public void setEval10(String Eval10) {
		this.eval10 = Eval10;
	}
		/**
	 * @return c_cost11
	 *			第11會計期間貸方累積金額
	 */
	public String getC_cost11() {
		return c_cost11;
	}

	/**
	 * @param c_cost11
	 *			第11會計期間貸方累積金額
	 */
	public void setC_cost11(String C_cost11) {
		this.c_cost11 = C_cost11;
	}
		/**
	 * @return d_cost11
	 *			第11會計期間借方累積金額
	 */
	public String getD_cost11() {
		return d_cost11;
	}

	/**
	 * @param d_cost11
	 *			第11會計期間借方累積金額
	 */
	public void setD_cost11(String D_cost11) {
		this.d_cost11 = D_cost11;
	}
		/**
	 * @return eval11
	 *			第11會計期間預算金額
	 */
	public String getEval11() {
		return eval11;
	}

	/**
	 * @param eval11
	 *			第11會計期間預算金額
	 */
	public void setEval11(String Eval11) {
		this.eval11 = Eval11;
	}
		/**
	 * @return c_cost12
	 *			第12會計期間貸方累積金額
	 */
	public String getC_cost12() {
		return c_cost12;
	}

	/**
	 * @param c_cost12
	 *			第12會計期間貸方累積金額
	 */
	public void setC_cost12(String C_cost12) {
		this.c_cost12 = C_cost12;
	}
		/**
	 * @return d_cost12
	 *			第12會計期間借方累積金額
	 */
	public String getD_cost12() {
		return d_cost12;
	}

	/**
	 * @param d_cost12
	 *			第12會計期間借方累積金額
	 */
	public void setD_cost12(String D_cost12) {
		this.d_cost12 = D_cost12;
	}
		/**
	 * @return eval12
	 *			第12會計期間預算金額
	 */
	public String getEval12() {
		return eval12;
	}

	/**
	 * @param eval12
	 *			第12會計期間預算金額
	 */
	public void setEval12(String Eval12) {
		this.eval12 = Eval12;
	}
		/**
	 * @return c_cost20
	 *			期末貸方累積金額
	 */
	public String getC_cost20() {
		return c_cost20;
	}

	/**
	 * @param c_cost20
	 *			期末貸方累積金額
	 */
	public void setC_cost20(String C_cost20) {
		this.c_cost20 = C_cost20;
	}
		/**
	 * @return d_cost20
	 *			期末借方累積金額
	 */
	public String getD_cost20() {
		return d_cost20;
	}

	/**
	 * @param d_cost20
	 *			期末借方累積金額
	 */
	public void setD_cost20(String D_cost20) {
		this.d_cost20 = D_cost20;
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
	 *			操作型態
	 */
	public String getTranop() {
		return tranop;
	}

	/**
	 * @param tranop
	 *			操作型態
	 */
	public void setTranop(String Tranop) {
		this.tranop = Tranop;
	}
		/**
	 * @return trancnt
	 *			轉出次數
	 */
	public String getTrancnt() {
		return trancnt;
	}

	/**
	 * @param trancnt
	 *			轉出次數
	 */
	public void setTrancnt(String Trancnt) {
		this.trancnt = Trancnt;
	}
	
}

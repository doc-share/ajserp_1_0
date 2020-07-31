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
 *  @date Fri Jul 31 15:45:52 CST 2020
 */
@Entity
@Table(name = "acc_mst2" ,indexes = { @Index(name = "created", columnList = "created"), 
@Index(name = "updated", columnList = "updated")})
@EntityInfo("會計子目檔")
public class Accmst2 extends BaseProperties {

	private static final long serialVersionUID = 1L;

	@FieldInfo("年度")
	@FilterInfo(ListValue = "")
	@Column(name = "year", length =32  )
	private String year ;

	@FieldInfo("會計科目")
	@FilterInfo(ListValue = "")
	@Column(name = "acc_id", length =32  )
	private String acc_id ;

	@FieldInfo("會計科目名稱")
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

	@FieldInfo("期初貸方累計金額")
	@FilterInfo(ListValue = "")
	@Column(name = "c_cost0")
	private Double c_cost0;

	@FieldInfo("期初借方累計金額")
	@FilterInfo(ListValue = "")
	@Column(name = "d_cost0")
	private Double d_cost0;

	@FieldInfo("期初預算金額")
	@FilterInfo(ListValue = "")
	@Column(name = "eval0")
	private Double eval0;

	@FieldInfo("第01會計期間貸方累計金額")
	@FilterInfo(ListValue = "")
	@Column(name = "c_cost1")
	private Double c_cost1;

	@FieldInfo("第01會計期間借方累計金額")
	@FilterInfo(ListValue = "")
	@Column(name = "d_cost1")
	private Double d_cost1;

	@FieldInfo("第01會計期間預算金額")
	@FilterInfo(ListValue = "")
	@Column(name = "eval1")
	private Double eval1;

	@FieldInfo("第02會計期間貸方累計金額")
	@FilterInfo(ListValue = "")
	@Column(name = "c_cost2")
	private Double c_cost2;

	@FieldInfo("第02會計期間借方累計金額")
	@FilterInfo(ListValue = "")
	@Column(name = "d_cost2")
	private Double d_cost2;

	@FieldInfo("第02會計期間預算金額")
	@FilterInfo(ListValue = "")
	@Column(name = "eval2")
	private Double eval2;

	@FieldInfo("第03會計期間貸方累計金額")
	@FilterInfo(ListValue = "")
	@Column(name = "c_cost3")
	private Double c_cost3;

	@FieldInfo("第03會計期間借方累計金額")
	@FilterInfo(ListValue = "")
	@Column(name = "d_cost3")
	private Double d_cost3;

	@FieldInfo("第03會計期間預算金額")
	@FilterInfo(ListValue = "")
	@Column(name = "eval3")
	private Double eval3;

	@FieldInfo("第04會計期間貸方累計金額")
	@FilterInfo(ListValue = "")
	@Column(name = "c_cost4")
	private Double c_cost4;

	@FieldInfo("第04會計期間借方累計金額")
	@FilterInfo(ListValue = "")
	@Column(name = "d_cost4")
	private Double d_cost4;

	@FieldInfo("第04會計期間預算金額")
	@FilterInfo(ListValue = "")
	@Column(name = "eval4")
	private Double eval4;

	@FieldInfo("第05會計期間貸方累計金額")
	@FilterInfo(ListValue = "")
	@Column(name = "c_cost5")
	private Double c_cost5;

	@FieldInfo("第05會計期間借方累計金額")
	@FilterInfo(ListValue = "")
	@Column(name = "d_cost5")
	private Double d_cost5;

	@FieldInfo("第05會計期間預算金額")
	@FilterInfo(ListValue = "")
	@Column(name = "eval5")
	private Double eval5;

	@FieldInfo("第06會計期間貸方累計金額")
	@FilterInfo(ListValue = "")
	@Column(name = "c_cost6")
	private Double c_cost6;

	@FieldInfo("第06會計期間借方累計金額")
	@FilterInfo(ListValue = "")
	@Column(name = "d_cost6")
	private Double d_cost6;

	@FieldInfo("第06會計期間預算金額")
	@FilterInfo(ListValue = "")
	@Column(name = "eval6")
	private Double eval6;

	@FieldInfo("第07會計期間貸方累計金額")
	@FilterInfo(ListValue = "")
	@Column(name = "c_cost7")
	private Double c_cost7;

	@FieldInfo("第07會計期間借方累計金額")
	@FilterInfo(ListValue = "")
	@Column(name = "d_cost7")
	private Double d_cost7;

	@FieldInfo("第07會計期間預算金額")
	@FilterInfo(ListValue = "")
	@Column(name = "eval7")
	private Double eval7;

	@FieldInfo("第08會計期間貸方累計金額")
	@FilterInfo(ListValue = "")
	@Column(name = "c_cost8")
	private Double c_cost8;

	@FieldInfo("第08會計期間借方累計金額")
	@FilterInfo(ListValue = "")
	@Column(name = "d_cost8")
	private Double d_cost8;

	@FieldInfo("第08會計期間預算金額")
	@FilterInfo(ListValue = "")
	@Column(name = "eval8")
	private Double eval8;

	@FieldInfo("第09會計期間貸方累計金額")
	@FilterInfo(ListValue = "")
	@Column(name = "c_cost9")
	private Double c_cost9;

	@FieldInfo("第09會計期間借方累計金額")
	@FilterInfo(ListValue = "")
	@Column(name = "d_cost9")
	private Double d_cost9;

	@FieldInfo("第09會計期間預算金額")
	@FilterInfo(ListValue = "")
	@Column(name = "eval9")
	private Double eval9;

	@FieldInfo("第10會計期間貸方累計金額")
	@FilterInfo(ListValue = "")
	@Column(name = "c_cost10")
	private Double c_cost10;

	@FieldInfo("第10會計期間借方累計金額")
	@FilterInfo(ListValue = "")
	@Column(name = "d_cost10")
	private Double d_cost10;

	@FieldInfo("第10會計期間預算金額")
	@FilterInfo(ListValue = "")
	@Column(name = "eval10")
	private Double eval10;

	@FieldInfo("第11會計期間貸方累計金額")
	@FilterInfo(ListValue = "")
	@Column(name = "c_cost11")
	private Double c_cost11;

	@FieldInfo("第11會計期間借方累計金額")
	@FilterInfo(ListValue = "")
	@Column(name = "d_cost11")
	private Double d_cost11;

	@FieldInfo("第11會計期間預算金額")
	@FilterInfo(ListValue = "")
	@Column(name = "eval11")
	private Double eval11;

	@FieldInfo("第12會計期間貸方累計金額")
	@FilterInfo(ListValue = "")
	@Column(name = "c_cost12")
	private Double c_cost12;

	@FieldInfo("第12會計期間借方累計金額")
	@FilterInfo(ListValue = "")
	@Column(name = "d_cost12")
	private Double d_cost12;

	@FieldInfo("第12會計期間預算金額")
	@FilterInfo(ListValue = "")
	@Column(name = "eval12")
	private Double eval12;

	@FieldInfo("期末貸方累計金額")
	@FilterInfo(ListValue = "")
	@Column(name = "c_cost20")
	private Double c_cost20;

	@FieldInfo("期末借方累計金額")
	@FilterInfo(ListValue = "")
	@Column(name = "d_cost20")
	private Double d_cost20;

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
	public Accmst2() {
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
	 *		  會計科目名稱
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
	 	 * @param c_cost0
	 *		  期初貸方累計金額
	 * 
	 	 * @param d_cost0
	 *		  期初借方累計金額
	 * 
	 	 * @param eval0
	 *		  期初預算金額
	 * 
	 	 * @param c_cost1
	 *		  第01會計期間貸方累計金額
	 * 
	 	 * @param d_cost1
	 *		  第01會計期間借方累計金額
	 * 
	 	 * @param eval1
	 *		  第01會計期間預算金額
	 * 
	 	 * @param c_cost2
	 *		  第02會計期間貸方累計金額
	 * 
	 	 * @param d_cost2
	 *		  第02會計期間借方累計金額
	 * 
	 	 * @param eval2
	 *		  第02會計期間預算金額
	 * 
	 	 * @param c_cost3
	 *		  第03會計期間貸方累計金額
	 * 
	 	 * @param d_cost3
	 *		  第03會計期間借方累計金額
	 * 
	 	 * @param eval3
	 *		  第03會計期間預算金額
	 * 
	 	 * @param c_cost4
	 *		  第04會計期間貸方累計金額
	 * 
	 	 * @param d_cost4
	 *		  第04會計期間借方累計金額
	 * 
	 	 * @param eval4
	 *		  第04會計期間預算金額
	 * 
	 	 * @param c_cost5
	 *		  第05會計期間貸方累計金額
	 * 
	 	 * @param d_cost5
	 *		  第05會計期間借方累計金額
	 * 
	 	 * @param eval5
	 *		  第05會計期間預算金額
	 * 
	 	 * @param c_cost6
	 *		  第06會計期間貸方累計金額
	 * 
	 	 * @param d_cost6
	 *		  第06會計期間借方累計金額
	 * 
	 	 * @param eval6
	 *		  第06會計期間預算金額
	 * 
	 	 * @param c_cost7
	 *		  第07會計期間貸方累計金額
	 * 
	 	 * @param d_cost7
	 *		  第07會計期間借方累計金額
	 * 
	 	 * @param eval7
	 *		  第07會計期間預算金額
	 * 
	 	 * @param c_cost8
	 *		  第08會計期間貸方累計金額
	 * 
	 	 * @param d_cost8
	 *		  第08會計期間借方累計金額
	 * 
	 	 * @param eval8
	 *		  第08會計期間預算金額
	 * 
	 	 * @param c_cost9
	 *		  第09會計期間貸方累計金額
	 * 
	 	 * @param d_cost9
	 *		  第09會計期間借方累計金額
	 * 
	 	 * @param eval9
	 *		  第09會計期間預算金額
	 * 
	 	 * @param c_cost10
	 *		  第10會計期間貸方累計金額
	 * 
	 	 * @param d_cost10
	 *		  第10會計期間借方累計金額
	 * 
	 	 * @param eval10
	 *		  第10會計期間預算金額
	 * 
	 	 * @param c_cost11
	 *		  第11會計期間貸方累計金額
	 * 
	 	 * @param d_cost11
	 *		  第11會計期間借方累計金額
	 * 
	 	 * @param eval11
	 *		  第11會計期間預算金額
	 * 
	 	 * @param c_cost12
	 *		  第12會計期間貸方累計金額
	 * 
	 	 * @param d_cost12
	 *		  第12會計期間借方累計金額
	 * 
	 	 * @param eval12
	 *		  第12會計期間預算金額
	 * 
	 	 * @param c_cost20
	 *		  期末貸方累計金額
	 * 
	 	 * @param d_cost20
	 *		  期末借方累計金額
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
    	public Accmst2( String year, String acc_id, String acc_name, String big5, String cd_type, String c_or_d, Double c_cost0, Double d_cost0, Double eval0, Double c_cost1, Double d_cost1, Double eval1, Double c_cost2, Double d_cost2, Double eval2, Double c_cost3, Double d_cost3, Double eval3, Double c_cost4, Double d_cost4, Double eval4, Double c_cost5, Double d_cost5, Double eval5, Double c_cost6, Double d_cost6, Double eval6, Double c_cost7, Double d_cost7, Double eval7, Double c_cost8, Double d_cost8, Double eval8, Double c_cost9, Double d_cost9, Double eval9, Double c_cost10, Double d_cost10, Double eval10, Double c_cost11, Double d_cost11, Double eval11, Double c_cost12, Double d_cost12, Double eval12, Double c_cost20, Double d_cost20, String tranok, String tranop, Integer trancnt ) {
		super();
				this.year = year;
				this.acc_id = acc_id;
				this.acc_name = acc_name;
				this.big5 = big5;
				this.cd_type = cd_type;
				this.c_or_d = c_or_d;
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
	 *			會計科目名稱
	 */
	public String getAcc_name() {
		return acc_name;
	}

	/**
	 * @param acc_name
	 *			會計科目名稱
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
	 * @return c_cost0
	 *			期初貸方累計金額
	 */
	public Double getC_cost0() {
		return c_cost0;
	}

	/**
	 * @param c_cost0
	 *			期初貸方累計金額
	 */
	public void setC_cost0(Double C_cost0) {
		this.c_cost0 = C_cost0;
	}
		/**
	 * @return d_cost0
	 *			期初借方累計金額
	 */
	public Double getD_cost0() {
		return d_cost0;
	}

	/**
	 * @param d_cost0
	 *			期初借方累計金額
	 */
	public void setD_cost0(Double D_cost0) {
		this.d_cost0 = D_cost0;
	}
		/**
	 * @return eval0
	 *			期初預算金額
	 */
	public Double getEval0() {
		return eval0;
	}

	/**
	 * @param eval0
	 *			期初預算金額
	 */
	public void setEval0(Double Eval0) {
		this.eval0 = Eval0;
	}
		/**
	 * @return c_cost1
	 *			第01會計期間貸方累計金額
	 */
	public Double getC_cost1() {
		return c_cost1;
	}

	/**
	 * @param c_cost1
	 *			第01會計期間貸方累計金額
	 */
	public void setC_cost1(Double C_cost1) {
		this.c_cost1 = C_cost1;
	}
		/**
	 * @return d_cost1
	 *			第01會計期間借方累計金額
	 */
	public Double getD_cost1() {
		return d_cost1;
	}

	/**
	 * @param d_cost1
	 *			第01會計期間借方累計金額
	 */
	public void setD_cost1(Double D_cost1) {
		this.d_cost1 = D_cost1;
	}
		/**
	 * @return eval1
	 *			第01會計期間預算金額
	 */
	public Double getEval1() {
		return eval1;
	}

	/**
	 * @param eval1
	 *			第01會計期間預算金額
	 */
	public void setEval1(Double Eval1) {
		this.eval1 = Eval1;
	}
		/**
	 * @return c_cost2
	 *			第02會計期間貸方累計金額
	 */
	public Double getC_cost2() {
		return c_cost2;
	}

	/**
	 * @param c_cost2
	 *			第02會計期間貸方累計金額
	 */
	public void setC_cost2(Double C_cost2) {
		this.c_cost2 = C_cost2;
	}
		/**
	 * @return d_cost2
	 *			第02會計期間借方累計金額
	 */
	public Double getD_cost2() {
		return d_cost2;
	}

	/**
	 * @param d_cost2
	 *			第02會計期間借方累計金額
	 */
	public void setD_cost2(Double D_cost2) {
		this.d_cost2 = D_cost2;
	}
		/**
	 * @return eval2
	 *			第02會計期間預算金額
	 */
	public Double getEval2() {
		return eval2;
	}

	/**
	 * @param eval2
	 *			第02會計期間預算金額
	 */
	public void setEval2(Double Eval2) {
		this.eval2 = Eval2;
	}
		/**
	 * @return c_cost3
	 *			第03會計期間貸方累計金額
	 */
	public Double getC_cost3() {
		return c_cost3;
	}

	/**
	 * @param c_cost3
	 *			第03會計期間貸方累計金額
	 */
	public void setC_cost3(Double C_cost3) {
		this.c_cost3 = C_cost3;
	}
		/**
	 * @return d_cost3
	 *			第03會計期間借方累計金額
	 */
	public Double getD_cost3() {
		return d_cost3;
	}

	/**
	 * @param d_cost3
	 *			第03會計期間借方累計金額
	 */
	public void setD_cost3(Double D_cost3) {
		this.d_cost3 = D_cost3;
	}
		/**
	 * @return eval3
	 *			第03會計期間預算金額
	 */
	public Double getEval3() {
		return eval3;
	}

	/**
	 * @param eval3
	 *			第03會計期間預算金額
	 */
	public void setEval3(Double Eval3) {
		this.eval3 = Eval3;
	}
		/**
	 * @return c_cost4
	 *			第04會計期間貸方累計金額
	 */
	public Double getC_cost4() {
		return c_cost4;
	}

	/**
	 * @param c_cost4
	 *			第04會計期間貸方累計金額
	 */
	public void setC_cost4(Double C_cost4) {
		this.c_cost4 = C_cost4;
	}
		/**
	 * @return d_cost4
	 *			第04會計期間借方累計金額
	 */
	public Double getD_cost4() {
		return d_cost4;
	}

	/**
	 * @param d_cost4
	 *			第04會計期間借方累計金額
	 */
	public void setD_cost4(Double D_cost4) {
		this.d_cost4 = D_cost4;
	}
		/**
	 * @return eval4
	 *			第04會計期間預算金額
	 */
	public Double getEval4() {
		return eval4;
	}

	/**
	 * @param eval4
	 *			第04會計期間預算金額
	 */
	public void setEval4(Double Eval4) {
		this.eval4 = Eval4;
	}
		/**
	 * @return c_cost5
	 *			第05會計期間貸方累計金額
	 */
	public Double getC_cost5() {
		return c_cost5;
	}

	/**
	 * @param c_cost5
	 *			第05會計期間貸方累計金額
	 */
	public void setC_cost5(Double C_cost5) {
		this.c_cost5 = C_cost5;
	}
		/**
	 * @return d_cost5
	 *			第05會計期間借方累計金額
	 */
	public Double getD_cost5() {
		return d_cost5;
	}

	/**
	 * @param d_cost5
	 *			第05會計期間借方累計金額
	 */
	public void setD_cost5(Double D_cost5) {
		this.d_cost5 = D_cost5;
	}
		/**
	 * @return eval5
	 *			第05會計期間預算金額
	 */
	public Double getEval5() {
		return eval5;
	}

	/**
	 * @param eval5
	 *			第05會計期間預算金額
	 */
	public void setEval5(Double Eval5) {
		this.eval5 = Eval5;
	}
		/**
	 * @return c_cost6
	 *			第06會計期間貸方累計金額
	 */
	public Double getC_cost6() {
		return c_cost6;
	}

	/**
	 * @param c_cost6
	 *			第06會計期間貸方累計金額
	 */
	public void setC_cost6(Double C_cost6) {
		this.c_cost6 = C_cost6;
	}
		/**
	 * @return d_cost6
	 *			第06會計期間借方累計金額
	 */
	public Double getD_cost6() {
		return d_cost6;
	}

	/**
	 * @param d_cost6
	 *			第06會計期間借方累計金額
	 */
	public void setD_cost6(Double D_cost6) {
		this.d_cost6 = D_cost6;
	}
		/**
	 * @return eval6
	 *			第06會計期間預算金額
	 */
	public Double getEval6() {
		return eval6;
	}

	/**
	 * @param eval6
	 *			第06會計期間預算金額
	 */
	public void setEval6(Double Eval6) {
		this.eval6 = Eval6;
	}
		/**
	 * @return c_cost7
	 *			第07會計期間貸方累計金額
	 */
	public Double getC_cost7() {
		return c_cost7;
	}

	/**
	 * @param c_cost7
	 *			第07會計期間貸方累計金額
	 */
	public void setC_cost7(Double C_cost7) {
		this.c_cost7 = C_cost7;
	}
		/**
	 * @return d_cost7
	 *			第07會計期間借方累計金額
	 */
	public Double getD_cost7() {
		return d_cost7;
	}

	/**
	 * @param d_cost7
	 *			第07會計期間借方累計金額
	 */
	public void setD_cost7(Double D_cost7) {
		this.d_cost7 = D_cost7;
	}
		/**
	 * @return eval7
	 *			第07會計期間預算金額
	 */
	public Double getEval7() {
		return eval7;
	}

	/**
	 * @param eval7
	 *			第07會計期間預算金額
	 */
	public void setEval7(Double Eval7) {
		this.eval7 = Eval7;
	}
		/**
	 * @return c_cost8
	 *			第08會計期間貸方累計金額
	 */
	public Double getC_cost8() {
		return c_cost8;
	}

	/**
	 * @param c_cost8
	 *			第08會計期間貸方累計金額
	 */
	public void setC_cost8(Double C_cost8) {
		this.c_cost8 = C_cost8;
	}
		/**
	 * @return d_cost8
	 *			第08會計期間借方累計金額
	 */
	public Double getD_cost8() {
		return d_cost8;
	}

	/**
	 * @param d_cost8
	 *			第08會計期間借方累計金額
	 */
	public void setD_cost8(Double D_cost8) {
		this.d_cost8 = D_cost8;
	}
		/**
	 * @return eval8
	 *			第08會計期間預算金額
	 */
	public Double getEval8() {
		return eval8;
	}

	/**
	 * @param eval8
	 *			第08會計期間預算金額
	 */
	public void setEval8(Double Eval8) {
		this.eval8 = Eval8;
	}
		/**
	 * @return c_cost9
	 *			第09會計期間貸方累計金額
	 */
	public Double getC_cost9() {
		return c_cost9;
	}

	/**
	 * @param c_cost9
	 *			第09會計期間貸方累計金額
	 */
	public void setC_cost9(Double C_cost9) {
		this.c_cost9 = C_cost9;
	}
		/**
	 * @return d_cost9
	 *			第09會計期間借方累計金額
	 */
	public Double getD_cost9() {
		return d_cost9;
	}

	/**
	 * @param d_cost9
	 *			第09會計期間借方累計金額
	 */
	public void setD_cost9(Double D_cost9) {
		this.d_cost9 = D_cost9;
	}
		/**
	 * @return eval9
	 *			第09會計期間預算金額
	 */
	public Double getEval9() {
		return eval9;
	}

	/**
	 * @param eval9
	 *			第09會計期間預算金額
	 */
	public void setEval9(Double Eval9) {
		this.eval9 = Eval9;
	}
		/**
	 * @return c_cost10
	 *			第10會計期間貸方累計金額
	 */
	public Double getC_cost10() {
		return c_cost10;
	}

	/**
	 * @param c_cost10
	 *			第10會計期間貸方累計金額
	 */
	public void setC_cost10(Double C_cost10) {
		this.c_cost10 = C_cost10;
	}
		/**
	 * @return d_cost10
	 *			第10會計期間借方累計金額
	 */
	public Double getD_cost10() {
		return d_cost10;
	}

	/**
	 * @param d_cost10
	 *			第10會計期間借方累計金額
	 */
	public void setD_cost10(Double D_cost10) {
		this.d_cost10 = D_cost10;
	}
		/**
	 * @return eval10
	 *			第10會計期間預算金額
	 */
	public Double getEval10() {
		return eval10;
	}

	/**
	 * @param eval10
	 *			第10會計期間預算金額
	 */
	public void setEval10(Double Eval10) {
		this.eval10 = Eval10;
	}
		/**
	 * @return c_cost11
	 *			第11會計期間貸方累計金額
	 */
	public Double getC_cost11() {
		return c_cost11;
	}

	/**
	 * @param c_cost11
	 *			第11會計期間貸方累計金額
	 */
	public void setC_cost11(Double C_cost11) {
		this.c_cost11 = C_cost11;
	}
		/**
	 * @return d_cost11
	 *			第11會計期間借方累計金額
	 */
	public Double getD_cost11() {
		return d_cost11;
	}

	/**
	 * @param d_cost11
	 *			第11會計期間借方累計金額
	 */
	public void setD_cost11(Double D_cost11) {
		this.d_cost11 = D_cost11;
	}
		/**
	 * @return eval11
	 *			第11會計期間預算金額
	 */
	public Double getEval11() {
		return eval11;
	}

	/**
	 * @param eval11
	 *			第11會計期間預算金額
	 */
	public void setEval11(Double Eval11) {
		this.eval11 = Eval11;
	}
		/**
	 * @return c_cost12
	 *			第12會計期間貸方累計金額
	 */
	public Double getC_cost12() {
		return c_cost12;
	}

	/**
	 * @param c_cost12
	 *			第12會計期間貸方累計金額
	 */
	public void setC_cost12(Double C_cost12) {
		this.c_cost12 = C_cost12;
	}
		/**
	 * @return d_cost12
	 *			第12會計期間借方累計金額
	 */
	public Double getD_cost12() {
		return d_cost12;
	}

	/**
	 * @param d_cost12
	 *			第12會計期間借方累計金額
	 */
	public void setD_cost12(Double D_cost12) {
		this.d_cost12 = D_cost12;
	}
		/**
	 * @return eval12
	 *			第12會計期間預算金額
	 */
	public Double getEval12() {
		return eval12;
	}

	/**
	 * @param eval12
	 *			第12會計期間預算金額
	 */
	public void setEval12(Double Eval12) {
		this.eval12 = Eval12;
	}
		/**
	 * @return c_cost20
	 *			期末貸方累計金額
	 */
	public Double getC_cost20() {
		return c_cost20;
	}

	/**
	 * @param c_cost20
	 *			期末貸方累計金額
	 */
	public void setC_cost20(Double C_cost20) {
		this.c_cost20 = C_cost20;
	}
		/**
	 * @return d_cost20
	 *			期末借方累計金額
	 */
	public Double getD_cost20() {
		return d_cost20;
	}

	/**
	 * @param d_cost20
	 *			期末借方累計金額
	 */
	public void setD_cost20(Double D_cost20) {
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

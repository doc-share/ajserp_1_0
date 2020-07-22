package org.esy.bas.entity;

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
 *  @date Fri Jun 19 13:45:15 CST 2020
 */
@Entity
@Table(name = "staff" ,indexes = { @Index(name = "created", columnList = "created"), 
@Index(name = "updated", columnList = "updated")})
@EntityInfo("員工資料維護")
public class Staff extends BaseProperties {

	private static final long serialVersionUID = 1L;

	@FieldInfo("員工編號")
	@FilterInfo(ListValue = "")
	@Column(name = "s_nbr", length =32  )
	private String s_nbr ;

	@FieldInfo("員工姓名")
	@FilterInfo(ListValue = "match")
	@Column(name = "s_name", length =32  )
	private String s_name ;

	@FieldInfo("英文姓名")
	@FilterInfo(ListValue = "")
	@Column(name = "eng_name", length =32  )
	private String eng_name ;

	@FieldInfo("性別")
	@FilterInfo(ListValue = "")
	@Column(name = "sex", length =32  )
	private String sex ;

	@FieldInfo("身分證字號")
	@FilterInfo(ListValue = "")
	@Column(name = "s_id", length =32  )
	private String s_id ;

	@FieldInfo("籍貫")
	@FilterInfo(ListValue = "")
	@Column(name = "n_name", length =32  )
	private String n_name ;

	@FieldInfo("組別")
	@FilterInfo(ListValue = "")
	@Column(name = "group_nbr", length =32  )
	private String group_nbr ;

	@FieldInfo("出生日期")
	@FilterInfo(ListValue = "")
	@Column(name = "birthday", length =32  )
	private String birthday ;

	@FieldInfo("婚姻")
	@FilterInfo(ListValue = "")
	@Column(name = "marry", length =32  )
	private String marry ;

	@FieldInfo("戶籍地址")
	@FilterInfo(ListValue = "")
	@Column(name = "addr1", length =32  )
	private String addr1 ;

	@FieldInfo("通訊地址")
	@FilterInfo(ListValue = "")
	@Column(name = "addr2", length =32  )
	private String addr2 ;

	@FieldInfo("電話1")
	@FilterInfo(ListValue = "")
	@Column(name = "tel1", length =32  )
	private String tel1 ;

	@FieldInfo("電話2")
	@FilterInfo(ListValue = "")
	@Column(name = "tel2", length =32  )
	private String tel2 ;

	@FieldInfo("行動電話")
	@FilterInfo(ListValue = "")
	@Column(name = "cellphone", length =32  )
	private String cellphone ;

	@FieldInfo("異動日期")
	@FilterInfo(ListValue = "")
	@Column(name = "chgdate", length =32  )
	private String chgdate ;

	@FieldInfo("到職日期")
	@FilterInfo(ListValue = "")
	@Column(name = "redate", length =32  )
	private String redate ;

	@FieldInfo("離職日期")
	@FilterInfo(ListValue = "")
	@Column(name = "oudate", length =32  )
	private String oudate ;

	@FieldInfo("投保日期")
	@FilterInfo(ListValue = "")
	@Column(name = "indate1", length =32  )
	private String indate1 ;

	@FieldInfo("退保日期")
	@FilterInfo(ListValue = "")
	@Column(name = "sudate1", length =32  )
	private String sudate1 ;

	@FieldInfo("勞保薪資")
	@FilterInfo(ListValue = "")
	@Column(name = "surance1", length =32  )
	private String surance1 ;

	@FieldInfo("勞保費")
	@FilterInfo(ListValue = "")
	@Column(name = "sur1_amt", length =32  )
	private String sur1_amt ;

	@FieldInfo("投保日期")
	@FilterInfo(ListValue = "")
	@Column(name = "indate2", length =32  )
	private String indate2 ;

	@FieldInfo("退保日期")
	@FilterInfo(ListValue = "")
	@Column(name = "sudate2", length =32  )
	private String sudate2 ;

	@FieldInfo("健保薪資")
	@FilterInfo(ListValue = "")
	@Column(name = "surance2", length =32  )
	private String surance2 ;

	@FieldInfo("健保費")
	@FilterInfo(ListValue = "")
	@Column(name = "sur2_amt", length =32  )
	private String sur2_amt ;

	@FieldInfo("投保日期")
	@FilterInfo(ListValue = "")
	@Column(name = "indate3", length =32  )
	private String indate3 ;

	@FieldInfo("退保日期")
	@FilterInfo(ListValue = "")
	@Column(name = "sudate3", length =32  )
	private String sudate3 ;

	@FieldInfo("團保費")
	@FilterInfo(ListValue = "")
	@Column(name = "sur3_amt", length =32  )
	private String sur3_amt ;

	@FieldInfo("保卡號碼")
	@FilterInfo(ListValue = "")
	@Column(name = "in_nbr", length =32  )
	private String in_nbr ;

	@FieldInfo("郵局局號")
	@FilterInfo(ListValue = "")
	@Column(name = "post", length =32  )
	private String post ;

	@FieldInfo("郵局帳號")
	@FilterInfo(ListValue = "")
	@Column(name = "post_id", length =32  )
	private String post_id ;

	@FieldInfo("役畢")
	@FilterInfo(ListValue = "")
	@Column(name = "isman", length =32  )
	private String isman ;

	@FieldInfo("學歷")
	@FilterInfo(ListValue = "")
	@Column(name = "r_nbr", length =32  )
	private String r_nbr ;

	@FieldInfo("學校")
	@FilterInfo(ListValue = "")
	@Column(name = "school", length =32  )
	private String school ;

	@FieldInfo("科系")
	@FilterInfo(ListValue = "")
	@Column(name = "subject", length =32  )
	private String subject ;

	@FieldInfo("畢(肄)年月")
	@FilterInfo(ListValue = "")
	@Column(name = "year_end", length =32  )
	private String year_end ;

	@FieldInfo("畢(肄)")
	@FilterInfo(ListValue = "")
	@Column(name = "sch_end", length =32  )
	private String sch_end ;

	@FieldInfo("身分證錯誤註記")
	@FilterInfo(ListValue = "")
	@Column(name = "error", length =32  )
	private String error ;

	@FieldInfo("到職情況")
	@FilterInfo(ListValue = "")
	@Column(name = "towork", length =32  )
	private String towork ;

	@FieldInfo("聯絡人")
	@FilterInfo(ListValue = "")
	@Column(name = "cname", length =32  )
	private String cname ;

	@FieldInfo("照片連結")
	@FilterInfo(ListValue = "")
	@Column(name = "photo", length =32  )
	private String photo ;

	@FieldInfo("銀行代號")
	@FilterInfo(ListValue = "")
	@Column(name = "b_nbr", length =32  )
	private String b_nbr ;

	@FieldInfo("銀行帳號")
	@FilterInfo(ListValue = "")
	@Column(name = "bank_code", length =32  )
	private String bank_code ;


     /**
	 *
	 * 构造函数
	 *
	 */
	public Staff() {
		super();
	}
	
	/**
	 *
	 * 构造函数
	 *
	 	 * @param s_nbr
	 *		  員工編號
	 * 
	 	 * @param s_name
	 *		  員工姓名
	 * 
	 	 * @param eng_name
	 *		  英文姓名
	 * 
	 	 * @param sex
	 *		  性別
	 * 
	 	 * @param s_id
	 *		  身分證字號
	 * 
	 	 * @param n_name
	 *		  籍貫
	 * 
	 	 * @param group_nbr
	 *		  組別
	 * 
	 	 * @param birthday
	 *		  出生日期
	 * 
	 	 * @param marry
	 *		  婚姻
	 * 
	 	 * @param addr1
	 *		  戶籍地址
	 * 
	 	 * @param addr2
	 *		  通訊地址
	 * 
	 	 * @param tel1
	 *		  電話1
	 * 
	 	 * @param tel2
	 *		  電話2
	 * 
	 	 * @param cellphone
	 *		  行動電話
	 * 
	 	 * @param chgdate
	 *		  異動日期
	 * 
	 	 * @param redate
	 *		  到職日期
	 * 
	 	 * @param oudate
	 *		  離職日期
	 * 
	 	 * @param indate1
	 *		  投保日期
	 * 
	 	 * @param sudate1
	 *		  退保日期
	 * 
	 	 * @param surance1
	 *		  勞保薪資
	 * 
	 	 * @param sur1_amt
	 *		  勞保費
	 * 
	 	 * @param indate2
	 *		  投保日期
	 * 
	 	 * @param sudate2
	 *		  退保日期
	 * 
	 	 * @param surance2
	 *		  健保薪資
	 * 
	 	 * @param sur2_amt
	 *		  健保費
	 * 
	 	 * @param indate3
	 *		  投保日期
	 * 
	 	 * @param sudate3
	 *		  退保日期
	 * 
	 	 * @param sur3_amt
	 *		  團保費
	 * 
	 	 * @param in_nbr
	 *		  保卡號碼
	 * 
	 	 * @param post
	 *		  郵局局號
	 * 
	 	 * @param post_id
	 *		  郵局帳號
	 * 
	 	 * @param isman
	 *		  役畢
	 * 
	 	 * @param r_nbr
	 *		  學歷
	 * 
	 	 * @param school
	 *		  學校
	 * 
	 	 * @param subject
	 *		  科系
	 * 
	 	 * @param year_end
	 *		  畢(肄)年月
	 * 
	 	 * @param sch_end
	 *		  畢(肄)
	 * 
	 	 * @param error
	 *		  身分證錯誤註記
	 * 
	 	 * @param towork
	 *		  到職情況
	 * 
	 	 * @param cname
	 *		  聯絡人
	 * 
	 	 * @param photo
	 *		  照片連結
	 * 
	 	 * @param b_nbr
	 *		  銀行代號
	 * 
	 	 * @param bank_code
	 *		  銀行帳號
	 * 
	 	 */
    	public Staff( String s_nbr, String s_name, String eng_name, String sex, String s_id, String n_name, String group_nbr, String birthday, String marry, String addr1, String addr2, String tel1, String tel2, String cellphone, String chgdate, String redate, String oudate, String indate1, String sudate1, String surance1, String sur1_amt, String indate2, String sudate2, String surance2, String sur2_amt, String indate3, String sudate3, String sur3_amt, String in_nbr, String post, String post_id, String isman, String r_nbr, String school, String subject, String year_end, String sch_end, String error, String towork, String cname, String photo, String b_nbr, String bank_code ) {
		super();
				this.s_nbr = s_nbr;
				this.s_name = s_name;
				this.eng_name = eng_name;
				this.sex = sex;
				this.s_id = s_id;
				this.n_name = n_name;
				this.group_nbr = group_nbr;
				this.birthday = birthday;
				this.marry = marry;
				this.addr1 = addr1;
				this.addr2 = addr2;
				this.tel1 = tel1;
				this.tel2 = tel2;
				this.cellphone = cellphone;
				this.chgdate = chgdate;
				this.redate = redate;
				this.oudate = oudate;
				this.indate1 = indate1;
				this.sudate1 = sudate1;
				this.surance1 = surance1;
				this.sur1_amt = sur1_amt;
				this.indate2 = indate2;
				this.sudate2 = sudate2;
				this.surance2 = surance2;
				this.sur2_amt = sur2_amt;
				this.indate3 = indate3;
				this.sudate3 = sudate3;
				this.sur3_amt = sur3_amt;
				this.in_nbr = in_nbr;
				this.post = post;
				this.post_id = post_id;
				this.isman = isman;
				this.r_nbr = r_nbr;
				this.school = school;
				this.subject = subject;
				this.year_end = year_end;
				this.sch_end = sch_end;
				this.error = error;
				this.towork = towork;
				this.cname = cname;
				this.photo = photo;
				this.b_nbr = b_nbr;
				this.bank_code = bank_code;
			}

		/**
	 * @return s_nbr
	 *			員工編號
	 */
	public String getS_nbr() {
		return s_nbr;
	}

	/**
	 * @param s_nbr
	 *			員工編號
	 */
	public void setS_nbr(String S_nbr) {
		this.s_nbr = S_nbr;
	}
		/**
	 * @return s_name
	 *			員工姓名
	 */
	public String getS_name() {
		return s_name;
	}

	/**
	 * @param s_name
	 *			員工姓名
	 */
	public void setS_name(String S_name) {
		this.s_name = S_name;
	}
		/**
	 * @return eng_name
	 *			英文姓名
	 */
	public String getEng_name() {
		return eng_name;
	}

	/**
	 * @param eng_name
	 *			英文姓名
	 */
	public void setEng_name(String Eng_name) {
		this.eng_name = Eng_name;
	}
		/**
	 * @return sex
	 *			性別
	 */
	public String getSex() {
		return sex;
	}

	/**
	 * @param sex
	 *			性別
	 */
	public void setSex(String Sex) {
		this.sex = Sex;
	}
		/**
	 * @return s_id
	 *			身分證字號
	 */
	public String getS_id() {
		return s_id;
	}

	/**
	 * @param s_id
	 *			身分證字號
	 */
	public void setS_id(String S_id) {
		this.s_id = S_id;
	}
		/**
	 * @return n_name
	 *			籍貫
	 */
	public String getN_name() {
		return n_name;
	}

	/**
	 * @param n_name
	 *			籍貫
	 */
	public void setN_name(String N_name) {
		this.n_name = N_name;
	}
		/**
	 * @return group_nbr
	 *			組別
	 */
	public String getGroup_nbr() {
		return group_nbr;
	}

	/**
	 * @param group_nbr
	 *			組別
	 */
	public void setGroup_nbr(String Group_nbr) {
		this.group_nbr = Group_nbr;
	}
		/**
	 * @return birthday
	 *			出生日期
	 */
	public String getBirthday() {
		return birthday;
	}

	/**
	 * @param birthday
	 *			出生日期
	 */
	public void setBirthday(String Birthday) {
		this.birthday = Birthday;
	}
		/**
	 * @return marry
	 *			婚姻
	 */
	public String getMarry() {
		return marry;
	}

	/**
	 * @param marry
	 *			婚姻
	 */
	public void setMarry(String Marry) {
		this.marry = Marry;
	}
		/**
	 * @return addr1
	 *			戶籍地址
	 */
	public String getAddr1() {
		return addr1;
	}

	/**
	 * @param addr1
	 *			戶籍地址
	 */
	public void setAddr1(String Addr1) {
		this.addr1 = Addr1;
	}
		/**
	 * @return addr2
	 *			通訊地址
	 */
	public String getAddr2() {
		return addr2;
	}

	/**
	 * @param addr2
	 *			通訊地址
	 */
	public void setAddr2(String Addr2) {
		this.addr2 = Addr2;
	}
		/**
	 * @return tel1
	 *			電話1
	 */
	public String getTel1() {
		return tel1;
	}

	/**
	 * @param tel1
	 *			電話1
	 */
	public void setTel1(String Tel1) {
		this.tel1 = Tel1;
	}
		/**
	 * @return tel2
	 *			電話2
	 */
	public String getTel2() {
		return tel2;
	}

	/**
	 * @param tel2
	 *			電話2
	 */
	public void setTel2(String Tel2) {
		this.tel2 = Tel2;
	}
		/**
	 * @return cellphone
	 *			行動電話
	 */
	public String getCellphone() {
		return cellphone;
	}

	/**
	 * @param cellphone
	 *			行動電話
	 */
	public void setCellphone(String Cellphone) {
		this.cellphone = Cellphone;
	}
		/**
	 * @return chgdate
	 *			異動日期
	 */
	public String getChgdate() {
		return chgdate;
	}

	/**
	 * @param chgdate
	 *			異動日期
	 */
	public void setChgdate(String Chgdate) {
		this.chgdate = Chgdate;
	}
		/**
	 * @return redate
	 *			到職日期
	 */
	public String getRedate() {
		return redate;
	}

	/**
	 * @param redate
	 *			到職日期
	 */
	public void setRedate(String Redate) {
		this.redate = Redate;
	}
		/**
	 * @return oudate
	 *			離職日期
	 */
	public String getOudate() {
		return oudate;
	}

	/**
	 * @param oudate
	 *			離職日期
	 */
	public void setOudate(String Oudate) {
		this.oudate = Oudate;
	}
		/**
	 * @return indate1
	 *			投保日期
	 */
	public String getIndate1() {
		return indate1;
	}

	/**
	 * @param indate1
	 *			投保日期
	 */
	public void setIndate1(String Indate1) {
		this.indate1 = Indate1;
	}
		/**
	 * @return sudate1
	 *			退保日期
	 */
	public String getSudate1() {
		return sudate1;
	}

	/**
	 * @param sudate1
	 *			退保日期
	 */
	public void setSudate1(String Sudate1) {
		this.sudate1 = Sudate1;
	}
		/**
	 * @return surance1
	 *			勞保薪資
	 */
	public String getSurance1() {
		return surance1;
	}

	/**
	 * @param surance1
	 *			勞保薪資
	 */
	public void setSurance1(String Surance1) {
		this.surance1 = Surance1;
	}
		/**
	 * @return sur1_amt
	 *			勞保費
	 */
	public String getSur1_amt() {
		return sur1_amt;
	}

	/**
	 * @param sur1_amt
	 *			勞保費
	 */
	public void setSur1_amt(String Sur1_amt) {
		this.sur1_amt = Sur1_amt;
	}
		/**
	 * @return indate2
	 *			投保日期
	 */
	public String getIndate2() {
		return indate2;
	}

	/**
	 * @param indate2
	 *			投保日期
	 */
	public void setIndate2(String Indate2) {
		this.indate2 = Indate2;
	}
		/**
	 * @return sudate2
	 *			退保日期
	 */
	public String getSudate2() {
		return sudate2;
	}

	/**
	 * @param sudate2
	 *			退保日期
	 */
	public void setSudate2(String Sudate2) {
		this.sudate2 = Sudate2;
	}
		/**
	 * @return surance2
	 *			健保薪資
	 */
	public String getSurance2() {
		return surance2;
	}

	/**
	 * @param surance2
	 *			健保薪資
	 */
	public void setSurance2(String Surance2) {
		this.surance2 = Surance2;
	}
		/**
	 * @return sur2_amt
	 *			健保費
	 */
	public String getSur2_amt() {
		return sur2_amt;
	}

	/**
	 * @param sur2_amt
	 *			健保費
	 */
	public void setSur2_amt(String Sur2_amt) {
		this.sur2_amt = Sur2_amt;
	}
		/**
	 * @return indate3
	 *			投保日期
	 */
	public String getIndate3() {
		return indate3;
	}

	/**
	 * @param indate3
	 *			投保日期
	 */
	public void setIndate3(String Indate3) {
		this.indate3 = Indate3;
	}
		/**
	 * @return sudate3
	 *			退保日期
	 */
	public String getSudate3() {
		return sudate3;
	}

	/**
	 * @param sudate3
	 *			退保日期
	 */
	public void setSudate3(String Sudate3) {
		this.sudate3 = Sudate3;
	}
		/**
	 * @return sur3_amt
	 *			團保費
	 */
	public String getSur3_amt() {
		return sur3_amt;
	}

	/**
	 * @param sur3_amt
	 *			團保費
	 */
	public void setSur3_amt(String Sur3_amt) {
		this.sur3_amt = Sur3_amt;
	}
		/**
	 * @return in_nbr
	 *			保卡號碼
	 */
	public String getIn_nbr() {
		return in_nbr;
	}

	/**
	 * @param in_nbr
	 *			保卡號碼
	 */
	public void setIn_nbr(String In_nbr) {
		this.in_nbr = In_nbr;
	}
		/**
	 * @return post
	 *			郵局局號
	 */
	public String getPost() {
		return post;
	}

	/**
	 * @param post
	 *			郵局局號
	 */
	public void setPost(String Post) {
		this.post = Post;
	}
		/**
	 * @return post_id
	 *			郵局帳號
	 */
	public String getPost_id() {
		return post_id;
	}

	/**
	 * @param post_id
	 *			郵局帳號
	 */
	public void setPost_id(String Post_id) {
		this.post_id = Post_id;
	}
		/**
	 * @return isman
	 *			役畢
	 */
	public String getIsman() {
		return isman;
	}

	/**
	 * @param isman
	 *			役畢
	 */
	public void setIsman(String Isman) {
		this.isman = Isman;
	}
		/**
	 * @return r_nbr
	 *			學歷
	 */
	public String getR_nbr() {
		return r_nbr;
	}

	/**
	 * @param r_nbr
	 *			學歷
	 */
	public void setR_nbr(String R_nbr) {
		this.r_nbr = R_nbr;
	}
		/**
	 * @return school
	 *			學校
	 */
	public String getSchool() {
		return school;
	}

	/**
	 * @param school
	 *			學校
	 */
	public void setSchool(String School) {
		this.school = School;
	}
		/**
	 * @return subject
	 *			科系
	 */
	public String getSubject() {
		return subject;
	}

	/**
	 * @param subject
	 *			科系
	 */
	public void setSubject(String Subject) {
		this.subject = Subject;
	}
		/**
	 * @return year_end
	 *			畢(肄)年月
	 */
	public String getYear_end() {
		return year_end;
	}

	/**
	 * @param year_end
	 *			畢(肄)年月
	 */
	public void setYear_end(String Year_end) {
		this.year_end = Year_end;
	}
		/**
	 * @return sch_end
	 *			畢(肄)
	 */
	public String getSch_end() {
		return sch_end;
	}

	/**
	 * @param sch_end
	 *			畢(肄)
	 */
	public void setSch_end(String Sch_end) {
		this.sch_end = Sch_end;
	}
		/**
	 * @return error
	 *			身分證錯誤註記
	 */
	public String getError() {
		return error;
	}

	/**
	 * @param error
	 *			身分證錯誤註記
	 */
	public void setError(String Error) {
		this.error = Error;
	}
		/**
	 * @return towork
	 *			到職情況
	 */
	public String getTowork() {
		return towork;
	}

	/**
	 * @param towork
	 *			到職情況
	 */
	public void setTowork(String Towork) {
		this.towork = Towork;
	}
		/**
	 * @return cname
	 *			聯絡人
	 */
	public String getCname() {
		return cname;
	}

	/**
	 * @param cname
	 *			聯絡人
	 */
	public void setCname(String Cname) {
		this.cname = Cname;
	}
		/**
	 * @return photo
	 *			照片連結
	 */
	public String getPhoto() {
		return photo;
	}

	/**
	 * @param photo
	 *			照片連結
	 */
	public void setPhoto(String Photo) {
		this.photo = Photo;
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
	 * @return bank_code
	 *			銀行帳號
	 */
	public String getBank_code() {
		return bank_code;
	}

	/**
	 * @param bank_code
	 *			銀行帳號
	 */
	public void setBank_code(String Bank_code) {
		this.bank_code = Bank_code;
	}
	
}

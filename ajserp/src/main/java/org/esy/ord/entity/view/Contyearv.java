package org.esy.ord.entity.view;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.esy.base.annotation.EntityInfo;
import org.esy.base.annotation.FieldInfo;
import org.esy.base.annotation.FilterInfo;
import org.esy.base.core.BaseProperties;
import org.esy.ord.entity.Contacr;
import org.hibernate.annotations.Subselect;
import org.hibernate.annotations.Synchronize;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@EntityInfo("合約年度")
@Table(name = "Contyearv")
@Subselect("select a.*, b.cus_alias, c.work_desc from cont_bah a left join cus_cus b on b.cus_nbr=a.cus_nbr left join sale_bat c on c.s_nbr=a.s_nbr")
@Synchronize("cont_bah")
public class Contyearv extends BaseProperties {

	private static final long serialVersionUID = 1L;

	@FieldInfo("合約編號")
	@FilterInfo(ListValue = "")
	@Column(name = "nbr", length = 32)
	private String nbr;

	@FieldInfo("案件編號")
	@FilterInfo(ListValue = "")
	@Column(name = "con_nbr", length = 32)
	private String con_nbr;

	@FieldInfo("客戶編號")
	@FilterInfo(ListValue = "gte,lte", FieldsValue = "cus_nbr,cus_nbrb")
	@Column(name = "cus_nbr", length = 32)
	private String cus_nbr;

	@FieldInfo("合約日期")
	@FilterInfo(ListValue = "gte,lte", FieldsValue = "date,dateb")
	@Column(name = "date")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date date;

	@FieldInfo("預計完成日期")
	@FilterInfo(ListValue = "gte,lte", FieldsValue = "plan_date,plan_dateb")
	@Column(name = "plan_date")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date plan_date;

	@FieldInfo("組別")
	@FilterInfo(ListValue = "gte,lte", FieldsValue = "group_nbr,group_nbrb")
	@Column(name = "group_nbr", length = 32)
	private String group_nbr;

	@FieldInfo("合約年度")
	@FilterInfo(ListValue = "")
	@Column(name = "cont_year", length = 32)
	private String cont_year;

	@FieldInfo("年度型合約")
	@FilterInfo(ListValue = "")//eq
	@Column(name = "year_status")
	private String year_status;

	@FieldInfo("公費金額")
	@FilterInfo(ListValue = "")
	@Column(name = "amt")
	private Double amt;

	@FieldInfo("合約描述")
	@FilterInfo(ListValue = "")
	@Column(name = "items_desc", length = 32)
	private String items_desc;

	@FieldInfo("工作代號")
	@FilterInfo(ListValue = "")
	@Column(name = "s_nbr", length = 32)
	private String s_nbr;

	@FieldInfo("工作細項")
	@FilterInfo(ListValue = "")
	@Column(name = "work_content", length = 32)
	private String work_content;

	@FieldInfo("請款金額")
	@FilterInfo(ListValue = "")
	@Column(name = "tot_amt")
	private Double tot_amt;

	@FieldInfo("承辦人")
	@FilterInfo(ListValue = "")
	@Column(name = "emp_nbr", length = 32)
	private String emp_nbr;

	@FieldInfo("狀態")
	@FilterInfo(ListValue = "")
	@Column(name = "status", length = 32)
	private String status;

	@FieldInfo("狀態1")
	@FilterInfo(ListValue = "")
	@Column(name = "statuts1", length = 32)
	private String statuts1;

	@FieldInfo("委任日期")
	@FilterInfo(ListValue = "")
	@Column(name = "inv_date")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date inv_date;

	@FieldInfo("專案編號")
	@FilterInfo(ListValue = "")
	@Column(name = "proj_nbr", length = 32)
	private String proj_nbr;

	@FieldInfo("接案人員")
	@FilterInfo(ListValue = "")
	@Column(name = "inv_user", length = 32)
	private String inv_user;

	@FieldInfo("接案人員姓名")
	@FilterInfo(ListValue = "")
	@Column(name = "inv_name", length = 32)
	private String inv_name;

	@FieldInfo("處理人員1")
	@FilterInfo(ListValue = "")
	@Column(name = "edit_user1", length = 32)
	private String edit_user1;

	@FieldInfo("處理人員2")
	@FilterInfo(ListValue = "")
	@Column(name = "edit_user2", length = 32)
	private String edit_user2;

	@FieldInfo("處理人員姓名1")
	@FilterInfo(ListValue = "")
	@Column(name = "edit_name1", length = 32)
	private String edit_name1;

	@FieldInfo("處理人員姓名2")
	@FilterInfo(ListValue = "")
	@Column(name = "edit_name2", length = 32)
	private String edit_name2;

	@FieldInfo("異動日期")
	@FilterInfo(ListValue = "")
	@Column(name = "edit_date")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date edit_date;

	@FieldInfo("檔案編號")
	@FilterInfo(ListValue = "")
	@Column(name = "file_nbr", length = 32)
	private String file_nbr;

	@FieldInfo("完成日期")
	@FilterInfo(ListValue = "")
	@Column(name = "over_date")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date over_date;

	@FieldInfo("委任書上傳")
	@FilterInfo(ListValue = "")
	@Column(name = "appo_letter", length = 32)
	private String appo_letter;

	@FieldInfo("核准否")
	@FilterInfo(ListValue = "")
	@Column(name = "proj_status")
	private String proj_status;

	@FieldInfo("核准人員")
	@FilterInfo(ListValue = "")
	@Column(name = "status_user", length = 32)
	private String status_user;

	@FieldInfo("核准人員姓名")
	@FilterInfo(ListValue = "")
	@Column(name = "status_name", length = 32)
	private String status_name;

	@FieldInfo("結案日期")
	@FilterInfo(ListValue = "")
	@Column(name = "close_date")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date close_date;

	@FieldInfo("結案否")
	@FilterInfo(ListValue = "")
	@Column(name = "close_flag")
	private String close_flag;

	@FieldInfo("結案人員")
	@FilterInfo(ListValue = "")
	@Column(name = "close_user", length = 32)
	private String close_user;

	@FieldInfo("結案人員姓名")
	@FilterInfo(ListValue = "")
	@Column(name = "close_name", length = 32)
	private String close_name;

	@FieldInfo("客戶名稱") // 虛擬欄位
	@Column(name = "cus_alias", length = 64)
	private String cus_alias;

	@FieldInfo("工作內容") // 虛擬欄位
	@Column(name = "work_desc", length = 64)
	private String work_desc;

	@Transient
	@JsonProperty("group_nbrb") // 虛擬欄位
	private String group_nbrb;// shift+alt+s

	@FieldInfo("合約日期")
	@Transient
	@JsonProperty("dateb") // 虛擬欄位
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date dateb;

	@FieldInfo("預計完成日期")
	@Transient
	@JsonProperty("plan_dateb") // 虛擬欄位
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date plan_dateb;

	@Transient
	@JsonProperty("cus_nbrb") // 虛擬欄位
	private String cus_nbrb;// shift+alt+s

	public String getWork_desc() {
		return work_desc;
	}

	public void setWork_desc(String work_desc) {
		this.work_desc = work_desc;
	}

	public Date getDateb() {
		return dateb;
	}

	public void setDateb(Date dateb) {
		this.dateb = dateb;
	}

	public Date getPlan_dateb() {
		return plan_dateb;
	}

	public void setPlan_dateb(Date plan_dateb) {
		this.plan_dateb = plan_dateb;
	}

	public String getCus_nbrb() {
		return cus_nbrb;
	}

	public void setCus_nbrb(String cus_nbrb) {
		this.cus_nbrb = cus_nbrb;
	}

	@Transient
	@JsonProperty("contacrs") // 宿主
	private List<Contacr> contacrs = new ArrayList<Contacr>();

	/**
	 *
	 * 构造函数
	 *
	 */
	public Contyearv() {
		super();
	}

	/**
	 *
	 * 构造函数
	 *
	 * @param nbr          合約編號
	 * 
	 * @param con_nbr      案件編號
	 * 
	 * @param cus_nbr      客戶編號
	 * 
	 * @param date         日期
	 * 
	 * @param plan_date    預計完成日期
	 * 
	 * @param group_nbr    組別
	 * 
	 * @param cont_year    合約年度
	 * 
	 * @param year_status  年度型合約
	 * 
	 * @param amt          公費金額
	 * 
	 * @param items_desc   合約描述
	 * 
	 * @param s_nbr        工作代號
	 * 
	 * @param work_content 工作細項
	 * 
	 * @param tot_amt      請款金額
	 * 
	 * @param emp_nbr      承辦人
	 * 
	 * @param status       狀態
	 * 
	 * @param statuts1     狀態1
	 * 
	 * @param inv_date     委任日期
	 * 
	 * @param proj_nbr     專案編號
	 * 
	 * @param inv_user     接案人員
	 * 
	 * @param inv_name     接案人員姓名
	 * 
	 * @param edit_user1   處理人員1
	 * 
	 * @param edit_user2   處理人員2
	 * 
	 * @param edit_name1   處理人員姓名1
	 * 
	 * @param edit_name2   處理人員姓名2
	 * 
	 * @param edit_date    異動日期
	 * 
	 * @param file_nbr     檔案編號
	 * 
	 * @param over_date    完成日期
	 * 
	 * @param appo_letter  委任書上傳
	 * 
	 * @param proj_status  核准否
	 * 
	 * @param status_user  核准人員
	 * 
	 * @param status_name  核准人員姓名
	 * 
	 * @param close_date   結案日期
	 * 
	 * @param close_flag   結案否
	 * 
	 * @param close_user   結案人員
	 * 
	 * @param close_name   結案人員姓名
	 * 
	 */
	public Contyearv(String nbr, String con_nbr, String cus_nbr, Date date, Date plan_date, String group_nbr,
			String cont_year, String year_status, Double amt, String items_desc, String s_nbr, String work_content,
			Double tot_amt, String emp_nbr, String status, String statuts1, Date inv_date, String proj_nbr,
			String inv_user, String inv_name, String edit_user1, String edit_user2, String edit_name1,
			String edit_name2, Date edit_date, String file_nbr, Date over_date, String appo_letter, String proj_status,
			String status_user, String status_name, Date close_date, String close_flag, String close_user,
			String close_name) {
		super();
		this.nbr = nbr;
		this.con_nbr = con_nbr;
		this.cus_nbr = cus_nbr;
		this.date = date;
		this.plan_date = plan_date;
		this.group_nbr = group_nbr;
		this.cont_year = cont_year;
		this.year_status = year_status;
		this.amt = amt;
		this.items_desc = items_desc;
		this.s_nbr = s_nbr;
		this.work_content = work_content;
		this.tot_amt = tot_amt;
		this.emp_nbr = emp_nbr;
		this.status = status;
		this.statuts1 = statuts1;
		this.inv_date = inv_date;
		this.proj_nbr = proj_nbr;
		this.inv_user = inv_user;
		this.inv_name = inv_name;
		this.edit_user1 = edit_user1;
		this.edit_user2 = edit_user2;
		this.edit_name1 = edit_name1;
		this.edit_name2 = edit_name2;
		this.edit_date = edit_date;
		this.file_nbr = file_nbr;
		this.over_date = over_date;
		this.appo_letter = appo_letter;
		this.proj_status = proj_status;
		this.status_user = status_user;
		this.status_name = status_name;
		this.close_date = close_date;
		this.close_flag = close_flag;
		this.close_user = close_user;
		this.close_name = close_name;
	}

	/**
	 * @return nbr 合約編號
	 */
	public String getNbr() {
		return nbr;
	}

	/**
	 * @param nbr 合約編號
	 */
	public void setNbr(String Nbr) {
		this.nbr = Nbr;
	}

	/**
	 * @return con_nbr 案件編號
	 */
	public String getCon_nbr() {
		return con_nbr;
	}

	/**
	 * @param con_nbr 案件編號
	 */
	public void setCon_nbr(String Con_nbr) {
		this.con_nbr = Con_nbr;
	}

	/**
	 * @return cus_nbr 客戶編號
	 */
	public String getCus_nbr() {
		return cus_nbr;
	}

	/**
	 * @param cus_nbr 客戶編號
	 */
	public void setCus_nbr(String Cus_nbr) {
		this.cus_nbr = Cus_nbr;
	}

	/**
	 * @return date 日期
	 */
	public Date getDate() {
		return date;
	}

	/**
	 * @param date 日期
	 */
	public void setDate(Date Date) {
		this.date = Date;
	}

	/**
	 * @return plan_date 預計完成日期
	 */
	public Date getPlan_date() {
		return plan_date;
	}

	/**
	 * @param plan_date 預計完成日期
	 */
	public void setPlan_date(Date Plan_date) {
		this.plan_date = Plan_date;
	}

	/**
	 * @return group_nbr 組別
	 */
	public String getGroup_nbr() {
		return group_nbr;
	}

	/**
	 * @param group_nbr 組別
	 */
	public void setGroup_nbr(String Group_nbr) {
		this.group_nbr = Group_nbr;
	}

	/**
	 * @return cont_year 合約年度
	 */
	public String getCont_year() {
		return cont_year;
	}

	/**
	 * @param cont_year 合約年度
	 */
	public void setCont_year(String Cont_year) {
		this.cont_year = Cont_year;
	}

	/**
	 * @return year_status 年度型合約
	 */
	public String getYear_status() {
		return year_status;
	}

	/**
	 * @param year_status 年度型合約
	 */
	public void setYear_status(String Year_status) {
		this.year_status = Year_status;
	}

	/**
	 * @return amt 公費金額
	 */
	public Double getAmt() {
		return amt;
	}

	/**
	 * @param amt 公費金額
	 */
	public void setAmt(Double Amt) {
		this.amt = Amt;
	}

	/**
	 * @return items_desc 合約描述
	 */
	public String getItems_desc() {
		return items_desc;
	}

	/**
	 * @param items_desc 合約描述
	 */
	public void setItems_desc(String Items_desc) {
		this.items_desc = Items_desc;
	}

	/**
	 * @return s_nbr 工作代號
	 */
	public String getS_nbr() {
		return s_nbr;
	}

	/**
	 * @param s_nbr 工作代號
	 */
	public void setS_nbr(String S_nbr) {
		this.s_nbr = S_nbr;
	}

	/**
	 * @return work_content 工作細項
	 */
	public String getwork_content() {
		return work_content;
	}

	/**
	 * @param work_content 工作細項
	 */
	public void setwork_content(String work_content) {
		this.work_content = work_content;
	}

	/**
	 * @return tot_amt 請款金額
	 */
	public Double getTot_amt() {
		return tot_amt;
	}

	/**
	 * @param tot_amt 請款金額
	 */
	public void setTot_amt(Double Tot_amt) {
		this.tot_amt = Tot_amt;
	}

	/**
	 * @return emp_nbr 承辦人
	 */
	public String getEmp_nbr() {
		return emp_nbr;
	}

	/**
	 * @param emp_nbr 承辦人
	 */
	public void setEmp_nbr(String Emp_nbr) {
		this.emp_nbr = Emp_nbr;
	}

	/**
	 * @return status 狀態
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @param status 狀態
	 */
	public void setStatus(String Status) {
		this.status = Status;
	}

	/**
	 * @return statuts1 狀態1
	 */
	public String getStatuts1() {
		return statuts1;
	}

	/**
	 * @param statuts1 狀態1
	 */
	public void setStatuts1(String Statuts1) {
		this.statuts1 = Statuts1;
	}

	/**
	 * @return inv_date 委任日期
	 */
	public Date getInv_date() {
		return inv_date;
	}

	/**
	 * @param inv_date 委任日期
	 */
	public void setInv_date(Date Inv_date) {
		this.inv_date = Inv_date;
	}

	/**
	 * @return proj_nbr 專案編號
	 */
	public String getProj_nbr() {
		return proj_nbr;
	}

	/**
	 * @param proj_nbr 專案編號
	 */
	public void setProj_nbr(String Proj_nbr) {
		this.proj_nbr = Proj_nbr;
	}

	/**
	 * @return inv_user 接案人員
	 */
	public String getInv_user() {
		return inv_user;
	}

	/**
	 * @param inv_user 接案人員
	 */
	public void setInv_user(String Inv_user) {
		this.inv_user = Inv_user;
	}

	/**
	 * @return inv_name 接案人員姓名
	 */
	public String getInv_name() {
		return inv_name;
	}

	/**
	 * @param inv_name 接案人員姓名
	 */
	public void setInv_name(String Inv_name) {
		this.inv_name = Inv_name;
	}

	/**
	 * @return edit_user1 處理人員1
	 */
	public String getEdit_user1() {
		return edit_user1;
	}

	/**
	 * @param edit_user1 處理人員1
	 */
	public void setEdit_user1(String Edit_user1) {
		this.edit_user1 = Edit_user1;
	}

	/**
	 * @return edit_user2 處理人員2
	 */
	public String getEdit_user2() {
		return edit_user2;
	}

	/**
	 * @param edit_user2 處理人員2
	 */
	public void setEdit_user2(String Edit_user2) {
		this.edit_user2 = Edit_user2;
	}

	/**
	 * @return edit_name1 處理人員姓名1
	 */
	public String getEdit_name1() {
		return edit_name1;
	}

	/**
	 * @param edit_name1 處理人員姓名1
	 */
	public void setEdit_name1(String Edit_name1) {
		this.edit_name1 = Edit_name1;
	}

	/**
	 * @return edit_name2 處理人員姓名2
	 */
	public String getEdit_name2() {
		return edit_name2;
	}

	/**
	 * @param edit_name2 處理人員姓名2
	 */
	public void setEdit_name2(String Edit_name2) {
		this.edit_name2 = Edit_name2;
	}

	/**
	 * @return edit_date 異動日期
	 */
	public Date getEdit_date() {
		return edit_date;
	}

	/**
	 * @param edit_date 異動日期
	 */
	public void setEdit_date(Date Edit_date) {
		this.edit_date = Edit_date;
	}

	/**
	 * @return file_nbr 檔案編號
	 */
	public String getFile_nbr() {
		return file_nbr;
	}

	/**
	 * @param file_nbr 檔案編號
	 */
	public void setFile_nbr(String File_nbr) {
		this.file_nbr = File_nbr;
	}

	/**
	 * @return over_date 完成日期
	 */
	public Date getOver_date() {
		return over_date;
	}

	/**
	 * @param over_date 完成日期
	 */
	public void setOver_date(Date Over_date) {
		this.over_date = Over_date;
	}

	/**
	 * @return appo_letter 委任書上傳
	 */
	public String getAppo_letter() {
		return appo_letter;
	}

	/**
	 * @param appo_letter 委任書上傳
	 */
	public void setAppo_letter(String Appo_letter) {
		this.appo_letter = Appo_letter;
	}

	/**
	 * @return proj_status 核准否
	 */
	public String getProj_status() {
		return proj_status;
	}

	/**
	 * @param proj_status 核准否
	 */
	public void setProj_status(String Proj_status) {
		this.proj_status = Proj_status;
	}

	/**
	 * @return status_user 核准人員
	 */
	public String getStatus_user() {
		return status_user;
	}

	/**
	 * @param status_user 核准人員
	 */
	public void setStatus_user(String Status_user) {
		this.status_user = Status_user;
	}

	/**
	 * @return status_name 核准人員姓名
	 */
	public String getStatus_name() {
		return status_name;
	}

	/**
	 * @param status_name 核准人員姓名
	 */
	public void setStatus_name(String Status_name) {
		this.status_name = Status_name;
	}

	/**
	 * @return close_date 結案日期
	 */
	public Date getClose_date() {
		return close_date;
	}

	/**
	 * @param close_date 結案日期
	 */
	public void setClose_date(Date Close_date) {
		this.close_date = Close_date;
	}

	/**
	 * @return close_flag 結案否
	 */
	public String getClose_flag() {
		return close_flag;
	}

	/**
	 * @param close_flag 結案否
	 */
	public void setClose_flag(String Close_flag) {
		this.close_flag = Close_flag;
	}

	/**
	 * @return close_user 結案人員
	 */
	public String getClose_user() {
		return close_user;
	}

	/**
	 * @param close_user 結案人員
	 */
	public void setClose_user(String Close_user) {
		this.close_user = Close_user;
	}

	/**
	 * @return close_name 結案人員姓名
	 */
	public String getClose_name() {
		return close_name;
	}

	/**
	 * @param close_name 結案人員姓名
	 */
	public void setClose_name(String Close_name) {
		this.close_name = Close_name;
	}

	public String getCus_alias() {
		return cus_alias;
	}

	public void setCus_alias(String cus_alias) {
		this.cus_alias = cus_alias;
	}

	public String getGroup_nbrb() {
		return group_nbrb;
	}

	public void setGroup_nbrb(String group_nbrb) {
		this.group_nbrb = group_nbrb;
	}

	public List<Contacr> getContacrs() {
		return contacrs;
	}

	public void setContacrs(List<Contacr> contacrs) {
		this.contacrs = contacrs;
	}
//	/**
//	 * @return the nbrdate
//	 */
//	public Date getNbrdate() {
//		return nbrdate;
//	}
//
//	/**
//	 * @param nbrdateb the nbrdateb to set
//	 */
//	public void setNbrdate(Date nbrdate) {
//		this.nbrdate = nbrdate;
//	}
}

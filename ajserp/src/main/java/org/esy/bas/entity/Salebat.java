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
 *  @date Wed Jun 24 13:15:44 CST 2020
 */
@Entity
@Table(name = "sale_bat" ,indexes = { @Index(name = "created", columnList = "created"), 
@Index(name = "updated", columnList = "updated")})
@EntityInfo("工作內容維護")
public class Salebat extends BaseProperties {

	private static final long serialVersionUID = 1L;

	@FieldInfo("工作編號")
	@FilterInfo(ListValue = "match")
	@Column(name = "s_nbr", length =32  )
	private String s_nbr ;

	@FieldInfo("工作內容")
	@FilterInfo(ListValue = "match")
	@Column(name = "work_desc", length =32  )
	private String work_desc ;

	@FieldInfo("備註")
	@FilterInfo(ListValue = "")
	@Column(name = "remark", length =32  )
	private String remark ;

	@FieldInfo("會計科目")
	@FilterInfo(ListValue = "match")
	@Column(name = "acc_id", length =32  )
	private String acc_id ;

	@FieldInfo("序號")
	@FilterInfo(ListValue = "")
	@Column(name = "seq")
	private Integer seq;


     /**
	 *
	 * 构造函数
	 *
	 */
	public Salebat() {
		super();
	}
	
	/**
	 *
	 * 构造函数
	 *
	 	 * @param s_nbr
	 *		  工作編號
	 * 
	 	 * @param work_desc
	 *		  工作內容
	 * 
	 	 * @param remark
	 *		  備註
	 * 
	 	 * @param acc_id
	 *		  會計科目
	 * 
	 	 * @param seq
	 *		  序號
	 * 
	 	 */
    	public Salebat( String s_nbr, String work_desc, String remark, String acc_id, Integer seq ) {
		super();
				this.s_nbr = s_nbr;
				this.work_desc = work_desc;
				this.remark = remark;
				this.acc_id = acc_id;
				this.seq = seq;
			}

		/**
	 * @return s_nbr
	 *			工作編號
	 */
	public String getS_nbr() {
		return s_nbr;
	}

	/**
	 * @param s_nbr
	 *			工作編號
	 */
	public void setS_nbr(String S_nbr) {
		this.s_nbr = S_nbr;
	}
		/**
	 * @return work_desc
	 *			工作內容
	 */
	public String getWork_desc() {
		return work_desc;
	}

	/**
	 * @param work_desc
	 *			工作內容
	 */
	public void setWork_desc(String Work_desc) {
		this.work_desc = Work_desc;
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
	 * @return seq
	 *			序號
	 */
	public Integer getSeq() {
		return seq;
	}

	/**
	 * @param seq
	 *			序號
	 */
	public void setSeq(Integer Seq) {
		this.seq = Seq;
	}
	
}

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
 *  @date Fri Jun 19 15:10:39 CST 2020
 */
@Entity
@Table(name = "work_bat" ,indexes = { @Index(name = "created", columnList = "created"), 
@Index(name = "updated", columnList = "updated")})
@EntityInfo("工作內容")
public class Workbat extends BaseProperties {

	private static final long serialVersionUID = 1L;

	@FieldInfo("工作編號")
	@FilterInfo(ListValue = "")
	@Column(name = "s_nbr", length =32  )
	private String s_nbr ;

	@FieldInfo("序號")
	@FilterInfo(ListValue = "")
	@Column(name = "seq", length =32  )
	private String seq ;

	@FieldInfo("工作內容")
	@FilterInfo(ListValue = "")
	@Column(name = "desc", length =32  )
	private String desc ;

	@FieldInfo("備註")
	@FilterInfo(ListValue = "")
	@Column(name = "remark", length =32  )
	private String remark ;

	@FieldInfo("會計科目")
	@FilterInfo(ListValue = "")
	@Column(name = "acc_id", length =32  )
	private String acc_id ;


     /**
	 *
	 * 构造函数
	 *
	 */
	public Workbat() {
		super();
	}
	
	/**
	 *
	 * 构造函数
	 *
	 	 * @param s_nbr
	 *		  工作編號
	 * 
	 	 * @param seq
	 *		  序號
	 * 
	 	 * @param desc
	 *		  工作內容
	 * 
	 	 * @param remark
	 *		  備註
	 * 
	 	 * @param acc_id
	 *		  會計科目
	 * 
	 	 */
    	public Workbat( String s_nbr, String seq, String desc, String remark, String acc_id ) {
		super();
				this.s_nbr = s_nbr;
				this.seq = seq;
				this.desc = desc;
				this.remark = remark;
				this.acc_id = acc_id;
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
	 * @return seq
	 *			序號
	 */
	public String getSeq() {
		return seq;
	}

	/**
	 * @param seq
	 *			序號
	 */
	public void setSeq(String Seq) {
		this.seq = Seq;
	}
		/**
	 * @return desc
	 *			工作內容
	 */
	public String getDesc() {
		return desc;
	}

	/**
	 * @param desc
	 *			工作內容
	 */
	public void setDesc(String Desc) {
		this.desc = Desc;
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
	
}

package org.esy.bas.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Index;
import javax.persistence.Table;

import org.esy.base.annotation.EntityInfo;
import org.esy.base.annotation.FieldInfo;
import org.esy.base.annotation.FilterInfo;
import org.esy.base.core.BaseProperties;

/**
 * 实体类
 * 
 * @author <a href="mailto:ardui@163.com"ardui</a
 * @date Fri Jun 19 13:53:11 CST 2020
 */
@Entity
@Table(name = "bas_group", indexes = { @Index(name = "created", columnList = "created"),
		@Index(name = "updated", columnList = "updated") })
@EntityInfo("組別項目維護")
public class Basgroup extends BaseProperties {

	private static final long serialVersionUID = 1L;

	@FieldInfo("組別代號")
	@FilterInfo(ListValue = "match", LovValue = "match")
	@Column(name = "group_nbr", length = 32)
	private String group_nbr;

	@FieldInfo("組別名稱")
	@FilterInfo(ListValue = "match", LovValue = "match")
	@Column(name = "group_name", length = 32)
	private String group_name;

	/**
	 *
	 * 构造函数
	 *
	 */
	public Basgroup() {
		super();
	}

	/**
	 *
	 * 构造函数
	 *
	 * @param group_nbr
	 *            組別代號
	 * 
	 * @param group_name
	 *            組別名稱
	 * 
	 */
	public Basgroup(String group_nbr, String group_name) {
		super();
		this.group_nbr = group_nbr;
		this.group_name = group_name;
	}

	/**
	 * @return group_nbr 組別代號
	 */
	public String getGroup_nbr() {
		return group_nbr;
	}

	/**
	 * @param group_nbr
	 *            組別代號
	 */
	public void setGroup_nbr(String Group_nbr) {
		this.group_nbr = Group_nbr;
	}

	/**
	 * @return group_name 組別名稱
	 */
	public String getGroup_name() {
		return group_name;
	}

	/**
	 * @param group_name
	 *            組別名稱
	 */
	public void setGroup_name(String Group_name) {
		this.group_name = Group_name;
	}

}

package org.esy.mak.service.impl;

import org.esy.mak.entity.Makbat1;
import org.esy.mak.service.IMakbat1Service;
import org.esy.base.common.BaseUtil;
import org.esy.base.dao.YSDao;
import org.esy.base.util.YESUtil;
import org.esy.base.util.YesException;
import org.springframework.beans.factory.annotation.Autowired;
import org.esy.base.dao.core.PageResult;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class Makbat1ServiceImpl implements IMakbat1Service {

	@Autowired
	private YSDao dao;
	
	/**
	 * 保存实体
	 * @param Makbat1
	 * @return Makbat1 o
	 * @version v2.0
	 */
	@Override
	@Transactional
	public Makbat1 save(Makbat1 o) throws YesException {
	    if (BaseUtil.isNotEmpty(o.getUid())) {
	    
			Makbat1 old = dao.getByUid(Makbat1.class,o.getUid());
			if (BaseUtil.isEmpty(old)) {
				throw new YesException(HttpStatus.NOT_FOUND, "记录不存在，不可更新!!!");
			}
			if (!YESUtil.getDatetimeString(old.getUpdstamp()).equals(YESUtil.getDatetimeString(o.getUpdstamp()))) {
				throw new YesException(HttpStatus.INTERNAL_SERVER_ERROR, "该记录已被其他用户修改，不可更新!!！");
			}
		}
		return dao.save(o);
	}

	/**
	 * 通过uid查找实体
	 * @param uid
	 * @return Makbat1 o
	 * @ version v2.0
	 * 
	 */
	@Override
	public Makbat1 getByUid(String uid) {
		return dao.getByUid(Makbat1.class,uid);
	}

	/**
	 * 删除实体
	 * @param Makbat1 o
	 * @return boolean 
	 * @ version v2.0 
	 */
	@Override
	@Transactional
	public boolean delete(Makbat1 o) throws YesException{
	
	    Makbat1 old = dao.getByUid(Makbat1.class,o.getUid());
		if (BaseUtil.isNotEmpty(old)) {
			throw new YesException(HttpStatus.INTERNAL_SERVER_ERROR, "记录不存，不可删除!!!");
		}
		if (!YESUtil.getDatetimeString(old.getUpdstamp()).equals(YESUtil.getDatetimeString(o.getUpdstamp()))) {
			throw new YesException(HttpStatus.INTERNAL_SERVER_ERROR, "该记录已被其他用户修改，不可删除!!！");
		}
		return dao.delete(o);
	}

     
	
	 /**
	 * 查询实体
	 * @param Map<String, Object> parm
	 * @return QueryResult 
	 * @ version v2.0 
	 */
	@Override
	public PageResult<Makbat1 > query(Makbat1  makbat1, Pageable pageable){
		return (PageResult<Makbat1>) dao.query(Makbat1.class,makbat1,pageable);
	}
	
	@Override
	@Transactional
	public void deletes(String uids) throws YesException {
		// TODO Auto-generated method stub

		String[] uidsArr = uids.split(",");
		for (String uid : uidsArr) {
		
			Makbat1 old = dao.getByUid(Makbat1.class,uid);
			if (BaseUtil.isEmpty(old)) {
				throw new YesException(HttpStatus.INTERNAL_SERVER_ERROR, "记录不存，不可删除!!!");
			}
			
			dao.delete(old);
		}

	}
	
	
}
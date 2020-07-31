package org.esy.acc.service.impl;

import org.esy.acc.entity.Accmst1;
import org.esy.acc.service.IAccmst1Service;
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
public class Accmst1ServiceImpl implements IAccmst1Service {

	@Autowired
	private YSDao dao;
	
	/**
	 * 保存实体
	 * @param Accmst1
	 * @return Accmst1 o
	 * @version v2.0
	 */
	@Override
	@Transactional
	public Accmst1 save(Accmst1 o) throws YesException {
	    if (BaseUtil.isNotEmpty(o.getUid())) {
	    
			Accmst1 old = dao.getByUid(Accmst1.class,o.getUid());
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
	 * @return Accmst1 o
	 * @ version v2.0
	 * 
	 */
	@Override
	public Accmst1 getByUid(String uid) {
		return dao.getByUid(Accmst1.class,uid);
	}

	/**
	 * 删除实体
	 * @param Accmst1 o
	 * @return boolean 
	 * @ version v2.0 
	 */
	@Override
	@Transactional
	public boolean delete(Accmst1 o) throws YesException{
	
	    Accmst1 old = dao.getByUid(Accmst1.class,o.getUid());
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
	public PageResult<Accmst1 > query(Accmst1  accmst1, Pageable pageable){
		return (PageResult<Accmst1>) dao.query(Accmst1.class,accmst1,pageable);
	}
	
	@Override
	@Transactional
	public void deletes(String uids) throws YesException {
		// TODO Auto-generated method stub

		String[] uidsArr = uids.split(",");
		for (String uid : uidsArr) {
		
			Accmst1 old = dao.getByUid(Accmst1.class,uid);
			if (BaseUtil.isEmpty(old)) {
				throw new YesException(HttpStatus.INTERNAL_SERVER_ERROR, "记录不存，不可删除!!!");
			}
			
			dao.delete(old);
		}

	}
	
	
}
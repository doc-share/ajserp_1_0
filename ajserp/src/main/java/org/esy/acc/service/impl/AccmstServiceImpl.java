package org.esy.acc.service.impl;

import org.esy.acc.entity.Accmst;
import org.esy.acc.service.IAccmstService;
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
public class AccmstServiceImpl implements IAccmstService {

	@Autowired
	private YSDao dao;
	
	/**
	 * 保存实体
	 * @param Accmst
	 * @return Accmst o
	 * @version v2.0
	 */
	@Override
	@Transactional
	public Accmst save(Accmst o) throws YesException {
	    if (BaseUtil.isNotEmpty(o.getUid())) {
	    
			Accmst old = dao.getByUid(Accmst.class,o.getUid());
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
	 * @return Accmst o
	 * @ version v2.0
	 * 
	 */
	@Override
	public Accmst getByUid(String uid) {
		return dao.getByUid(Accmst.class,uid);
	}

	/**
	 * 删除实体
	 * @param Accmst o
	 * @return boolean 
	 * @ version v2.0 
	 */
	@Override
	@Transactional
	public boolean delete(Accmst o) throws YesException{
	
	    Accmst old = dao.getByUid(Accmst.class,o.getUid());
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
	public PageResult<Accmst > query(Accmst  accmst, Pageable pageable){
		return (PageResult<Accmst>) dao.query(Accmst.class,accmst,pageable);
	}
	
	@Override
	@Transactional
	public void deletes(String uids) throws YesException {
		// TODO Auto-generated method stub

		String[] uidsArr = uids.split(",");
		for (String uid : uidsArr) {
		
			Accmst old = dao.getByUid(Accmst.class,uid);
			if (BaseUtil.isEmpty(old)) {
				throw new YesException(HttpStatus.INTERNAL_SERVER_ERROR, "记录不存，不可删除!!!");
			}
			
			dao.delete(old);
		}

	}
	
	
}
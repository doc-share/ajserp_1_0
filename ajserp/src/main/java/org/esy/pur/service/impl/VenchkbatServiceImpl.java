package org.esy.pur.service.impl;

import org.esy.pur.entity.Venchkbat;
import org.esy.pur.service.IVenchkbatService;
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
public class VenchkbatServiceImpl implements IVenchkbatService {

	@Autowired
	private YSDao dao;
	
	/**
	 * 保存实体
	 * @param Venchkbat
	 * @return Venchkbat o
	 * @version v2.0
	 */
	@Override
	@Transactional
	public Venchkbat save(Venchkbat o) throws YesException {
	    if (BaseUtil.isNotEmpty(o.getUid())) {
	    
			Venchkbat old = dao.getByUid(Venchkbat.class,o.getUid());
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
	 * @return Venchkbat o
	 * @ version v2.0
	 * 
	 */
	@Override
	public Venchkbat getByUid(String uid) {
		return dao.getByUid(Venchkbat.class,uid);
	}

	/**
	 * 删除实体
	 * @param Venchkbat o
	 * @return boolean 
	 * @ version v2.0 
	 */
	@Override
	@Transactional
	public boolean delete(Venchkbat o) throws YesException{
	
	    Venchkbat old = dao.getByUid(Venchkbat.class,o.getUid());
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
	public PageResult<Venchkbat > query(Venchkbat  venchkbat, Pageable pageable){
		return (PageResult<Venchkbat>) dao.query(Venchkbat.class,venchkbat,pageable);
	}
	
	@Override
	@Transactional
	public void deletes(String uids) throws YesException {
		// TODO Auto-generated method stub

		String[] uidsArr = uids.split(",");
		for (String uid : uidsArr) {
		
			Venchkbat old = dao.getByUid(Venchkbat.class,uid);
			if (BaseUtil.isEmpty(old)) {
				throw new YesException(HttpStatus.INTERNAL_SERVER_ERROR, "记录不存，不可删除!!!");
			}
			
			dao.delete(old);
		}

	}
	
	
}
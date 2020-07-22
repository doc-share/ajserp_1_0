package org.esy.acr.service.impl;

import org.esy.acr.entity.Acrdis;
import org.esy.acr.service.IAcrdisService;
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
public class AcrdisServiceImpl implements IAcrdisService {

	@Autowired
	private YSDao dao;
	
	/**
	 * 保存实体
	 * @param Acrdis
	 * @return Acrdis o
	 * @version v2.0
	 */
	@Override
	@Transactional
	public Acrdis save(Acrdis o) throws YesException {
	    if (BaseUtil.isNotEmpty(o.getUid())) {
	    
			Acrdis old = dao.getByUid(Acrdis.class,o.getUid());
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
	 * @return Acrdis o
	 * @ version v2.0
	 * 
	 */
	@Override
	public Acrdis getByUid(String uid) {
		return dao.getByUid(Acrdis.class,uid);
	}

	/**
	 * 删除实体
	 * @param Acrdis o
	 * @return boolean 
	 * @ version v2.0 
	 */
	@Override
	@Transactional
	public boolean delete(Acrdis o) throws YesException{
	
	    Acrdis old = dao.getByUid(Acrdis.class,o.getUid());
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
	public PageResult<Acrdis > query(Acrdis  acrdis, Pageable pageable){
		return (PageResult<Acrdis>) dao.query(Acrdis.class,acrdis,pageable);
	}
	
	@Override
	@Transactional
	public void deletes(String uids) throws YesException {
		// TODO Auto-generated method stub

		String[] uidsArr = uids.split(",");
		for (String uid : uidsArr) {
		
			Acrdis old = dao.getByUid(Acrdis.class,uid);
			if (BaseUtil.isEmpty(old)) {
				throw new YesException(HttpStatus.INTERNAL_SERVER_ERROR, "记录不存，不可删除!!!");
			}
			
			dao.delete(old);
		}

	}
	
	
}
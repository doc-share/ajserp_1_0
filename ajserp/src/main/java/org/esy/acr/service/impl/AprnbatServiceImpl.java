package org.esy.acr.service.impl;

import org.esy.acr.entity.Aprnbat;
import org.esy.acr.service.IAprnbatService;
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
public class AprnbatServiceImpl implements IAprnbatService {

	@Autowired
	private YSDao dao;
	
	/**
	 * 保存实体
	 * @param Aprnbat
	 * @return Aprnbat o
	 * @version v2.0
	 */
	@Override
	@Transactional
	public Aprnbat save(Aprnbat o) throws YesException {
	    if (BaseUtil.isNotEmpty(o.getUid())) {
	    
			Aprnbat old = dao.getByUid(Aprnbat.class,o.getUid());
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
	 * @return Aprnbat o
	 * @ version v2.0
	 * 
	 */
	@Override
	public Aprnbat getByUid(String uid) {
		return dao.getByUid(Aprnbat.class,uid);
	}

	/**
	 * 删除实体
	 * @param Aprnbat o
	 * @return boolean 
	 * @ version v2.0 
	 */
	@Override
	@Transactional
	public boolean delete(Aprnbat o) throws YesException{
	
	    Aprnbat old = dao.getByUid(Aprnbat.class,o.getUid());
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
	public PageResult<Aprnbat > query(Aprnbat  aprnbat, Pageable pageable){
		return (PageResult<Aprnbat>) dao.query(Aprnbat.class,aprnbat,pageable);
	}
	
	@Override
	@Transactional
	public void deletes(String uids) throws YesException {
		// TODO Auto-generated method stub

		String[] uidsArr = uids.split(",");
		for (String uid : uidsArr) {
		
			Aprnbat old = dao.getByUid(Aprnbat.class,uid);
			if (BaseUtil.isEmpty(old)) {
				throw new YesException(HttpStatus.INTERNAL_SERVER_ERROR, "记录不存，不可删除!!!");
			}
			
			dao.delete(old);
		}

	}
	
	
}
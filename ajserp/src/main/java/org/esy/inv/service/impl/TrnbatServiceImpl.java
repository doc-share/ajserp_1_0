package org.esy.inv.service.impl;

import org.esy.inv.entity.Trnbat;
import org.esy.inv.service.ITrnbatService;
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
public class TrnbatServiceImpl implements ITrnbatService {

	@Autowired
	private YSDao dao;
	
	/**
	 * 保存实体
	 * @param Trnbat
	 * @return Trnbat o
	 * @version v2.0
	 */
	@Override
	@Transactional
	public Trnbat save(Trnbat o) throws YesException {
	    if (BaseUtil.isNotEmpty(o.getUid())) {
	    
			Trnbat old = dao.getByUid(Trnbat.class,o.getUid());
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
	 * @return Trnbat o
	 * @ version v2.0
	 * 
	 */
	@Override
	public Trnbat getByUid(String uid) {
		return dao.getByUid(Trnbat.class,uid);
	}

	/**
	 * 删除实体
	 * @param Trnbat o
	 * @return boolean 
	 * @ version v2.0 
	 */
	@Override
	@Transactional
	public boolean delete(Trnbat o) throws YesException{
	
	    Trnbat old = dao.getByUid(Trnbat.class,o.getUid());
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
	public PageResult<Trnbat > query(Trnbat  trnbat, Pageable pageable){
		return (PageResult<Trnbat>) dao.query(Trnbat.class,trnbat,pageable);
	}
	
	@Override
	@Transactional
	public void deletes(String uids) throws YesException {
		// TODO Auto-generated method stub

		String[] uidsArr = uids.split(",");
		for (String uid : uidsArr) {
		
			Trnbat old = dao.getByUid(Trnbat.class,uid);
			if (BaseUtil.isEmpty(old)) {
				throw new YesException(HttpStatus.INTERNAL_SERVER_ERROR, "记录不存，不可删除!!!");
			}
			
			dao.delete(old);
		}

	}
	
	
}
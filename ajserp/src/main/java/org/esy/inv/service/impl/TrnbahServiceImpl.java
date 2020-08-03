package org.esy.inv.service.impl;

import org.esy.inv.entity.Trnbah;
import org.esy.inv.entity.Trnbat;
import org.esy.inv.entity.view.Trnbahv;
import org.esy.inv.service.ITrnbahService;
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
public class TrnbahServiceImpl implements ITrnbahService {

	@Autowired
	private YSDao dao;
	
	/**
	 * 保存实体
	 * @param Trnbah
	 * @return Trnbah o
	 * @version v2.0
	 */
	@Override
	@Transactional
	public Trnbahv save(Trnbahv o) throws YesException {
	    if (BaseUtil.isNotEmpty(o.getUid())) {
	    
			Trnbahv old = dao.getByUid(Trnbahv.class,o.getUid());
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
	 * @return Trnbah o
	 * @ version v2.0
	 * 
	 */
	@Override
	public Trnbahv getByUid(String uid) {
		
		Trnbahv o = dao.getByUid(Trnbahv.class, uid);
		o.setTrnbats(dao.getlist(Trnbat.class, new Trnbat(o.getUid())));  
		return o;
	}

	/**
	 * 删除实体
	 * @param Trnbah o
	 * @return boolean 
	 * @ version v2.0 
	 */
	@Override
	@Transactional
	public boolean delete(Trnbahv o) throws YesException{
	
	    Trnbahv old = dao.getByUid(Trnbahv.class,o.getUid());
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
	public PageResult<Trnbahv> query(Trnbahv  trnbahv, Pageable pageable){
		return (PageResult<Trnbahv>) dao.query(Trnbahv.class,trnbahv,pageable);
	}
	
	@Override
	@Transactional
	public void deletes(String uids) throws YesException {
		// TODO Auto-generated method stub

		String[] uidsArr = uids.split(",");
		for (String uid : uidsArr) {
		
			Trnbah old = dao.getByUid(Trnbah.class,uid);
			if (BaseUtil.isEmpty(old)) {
				throw new YesException(HttpStatus.INTERNAL_SERVER_ERROR, "记录不存，不可删除!!!");
			}
			
			dao.delete(old);
		}

	}
	
	
}
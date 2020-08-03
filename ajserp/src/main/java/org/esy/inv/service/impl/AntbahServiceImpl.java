package org.esy.inv.service.impl;

import org.esy.inv.entity.Antbah;
import org.esy.inv.entity.Antbat;
import org.esy.inv.entity.view.Antbahv;
import org.esy.inv.service.IAntbahService;
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
public class AntbahServiceImpl implements IAntbahService {

	@Autowired
	private YSDao dao;
	
	/**
	 * 保存实体
	 * @param Antbah
	 * @return Antbah o
	 * @version v2.0
	 */
	@Override
	@Transactional
	public Antbahv save(Antbahv o) throws YesException {
	    if (BaseUtil.isNotEmpty(o.getUid())) {
	    
			Antbahv old = dao.getByUid(Antbahv.class,o.getUid());
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
	 * @return Antbah o
	 * @ version v2.0
	 * 
	 */
	@Override
	public Antbahv getByUid(String uid) {
		
		Antbahv o = dao.getByUid(Antbahv.class, uid);
		o.setAntbats(dao.getlist(Antbat.class, new Antbat(o.getUid())));  
		return o;
	}

	/**
	 * 删除实体
	 * @param Antbah o
	 * @return boolean 
	 * @ version v2.0 
	 */
	@Override
	@Transactional
	public boolean delete(Antbahv o) throws YesException{
	
	    Antbahv old = dao.getByUid(Antbahv.class,o.getUid());
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
	public PageResult<Antbahv> query(Antbahv  antbahv, Pageable pageable){
		return (PageResult<Antbahv>) dao.query(Antbahv.class,antbahv,pageable);
	}
	
	@Override
	@Transactional
	public void deletes(String uids) throws YesException {
		// TODO Auto-generated method stub

		String[] uidsArr = uids.split(",");
		for (String uid : uidsArr) {
		
			Antbah old = dao.getByUid(Antbah.class,uid);
			if (BaseUtil.isEmpty(old)) {
				throw new YesException(HttpStatus.INTERNAL_SERVER_ERROR, "记录不存，不可删除!!!");
			}
			
			dao.delete(old);
		}

	}
	
	
}
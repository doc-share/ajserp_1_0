package org.esy.pur.service.impl;

import org.esy.pur.entity.Venchkbah;
import org.esy.pur.entity.Venchkbat;
import org.esy.pur.entity.view.Venchkbahv;
import org.esy.pur.service.IVenchkbahService;
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
public class VenchkbahServiceImpl implements IVenchkbahService {

	@Autowired
	private YSDao dao;
	
	/**
	 * 保存实体
	 * @param Venchkbah
	 * @return Venchkbah o
	 * @version v2.0
	 */
	@Override
	@Transactional
	public Venchkbahv save(Venchkbahv o) throws YesException {
	    if (BaseUtil.isNotEmpty(o.getUid())) {
	    
			Venchkbahv old = dao.getByUid(Venchkbahv.class,o.getUid());
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
	 * @return Venchkbah o
	 * @ version v2.0
	 * 
	 */
	@Override
	public Venchkbahv getByUid(String uid) {
		Venchkbahv o = dao.getByUid(Venchkbahv.class, uid);
		o.setVenchkbats(dao.getlist(Venchkbat.class, new Venchkbat(o.getUid())));
		return o;
	}

	/**
	 * 删除实体
	 * @param Venchkbah o
	 * @return boolean 
	 * @ version v2.0 
	 */
	@Override
	@Transactional
	public boolean delete(Venchkbahv o) throws YesException{
	
	    Venchkbahv old = dao.getByUid(Venchkbahv.class,o.getUid());
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
	public PageResult<Venchkbahv> query(Venchkbahv  venchkbahv, Pageable pageable){
		return (PageResult<Venchkbahv>) dao.query(Venchkbahv.class,venchkbahv,pageable);
	}
	
	@Override
	@Transactional
	public void deletes(String uids) throws YesException {
		// TODO Auto-generated method stub

		String[] uidsArr = uids.split(",");
		for (String uid : uidsArr) {
		
			Venchkbah old = dao.getByUid(Venchkbah.class,uid);
			if (BaseUtil.isEmpty(old)) {
				throw new YesException(HttpStatus.INTERNAL_SERVER_ERROR, "记录不存，不可删除!!!");
			}
			
			dao.delete(old);
		}

	}
	
	
}
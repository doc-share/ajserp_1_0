package org.esy.ord.service.impl;

import org.esy.ord.entity.Cuschkbah;
import org.esy.ord.entity.Cuschkbat;
import org.esy.ord.entity.view.Cuschkbahv;
import org.esy.ord.service.ICuschkbahService;
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
public class CuschkbahServiceImpl implements ICuschkbahService {

	@Autowired
	private YSDao dao;
	
	/**
	 * 保存实体
	 * @param Cuschkbah
	 * @return Cuschkbah o
	 * @version v2.0
	 */
	@Override
	@Transactional
	public Cuschkbahv save(Cuschkbahv o) throws YesException {
	    if (BaseUtil.isNotEmpty(o.getUid())) {
	    
			Cuschkbahv old = dao.getByUid(Cuschkbahv.class,o.getUid());
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
	 * @return Cuschkbah o
	 * @ version v2.0
	 * 
	 */
	@Override
	public Cuschkbahv getByUid(String uid) {
		Cuschkbahv o = dao.getByUid(Cuschkbahv.class, uid);
		o.setCuschkbats(dao.getlist(Cuschkbat.class, new Cuschkbat(o.getUid())));
		return o;
	}

	/**
	 * 删除实体
	 * @param Cuschkbah o
	 * @return boolean 
	 * @ version v2.0 
	 */
	@Override
	@Transactional
	public boolean delete(Cuschkbahv o) throws YesException{
	
	    Cuschkbahv old = dao.getByUid(Cuschkbahv.class,o.getUid());
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
	public PageResult<Cuschkbahv> query(Cuschkbahv  cuschkbahv, Pageable pageable){
		return (PageResult<Cuschkbahv>) dao.query(Cuschkbahv.class,cuschkbahv,pageable);
	}
	
	@Override
	@Transactional
	public void deletes(String uids) throws YesException {
		// TODO Auto-generated method stub

		String[] uidsArr = uids.split(",");
		for (String uid : uidsArr) {
		
			Cuschkbah old = dao.getByUid(Cuschkbah.class,uid);
			if (BaseUtil.isEmpty(old)) {
				throw new YesException(HttpStatus.INTERNAL_SERVER_ERROR, "记录不存，不可删除!!!");
			}
			
			dao.delete(old);
		}

	}
	
	
}
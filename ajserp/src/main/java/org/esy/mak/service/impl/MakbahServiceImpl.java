package org.esy.mak.service.impl;

import org.esy.mak.entity.Makbah;
import org.esy.mak.entity.Makbat;
import org.esy.mak.entity.Makbat1;
import org.esy.mak.entity.view.Makbahv;
import org.esy.mak.service.IMakbahService;
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
public class MakbahServiceImpl implements IMakbahService {

	@Autowired
	private YSDao dao;
	
	/**
	 * 保存实体
	 * @param Makbah
	 * @return Makbah o
	 * @version v2.0
	 */
	@Override
	@Transactional
	public Makbahv save(Makbahv o) throws YesException {
	    if (BaseUtil.isNotEmpty(o.getUid())) {
	    
			Makbahv old = dao.getByUid(Makbahv.class,o.getUid());
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
	 * @return Makbah o
	 * @ version v2.0
	 * 
	 */
	@Override
	public Makbahv getByUid(String uid) {
		
		Makbahv o = dao.getByUid(Makbahv.class, uid);
		o.setMakbats(dao.getlist(Makbat.class, new Makbat(o.getUid())));  //有幾個grid就set幾個
		o.setMakbat1s(dao.getlist(Makbat1.class, new Makbat1(o.getUid())));
		return o;
	}

	/**
	 * 删除实体
	 * @param Makbah o
	 * @return boolean 
	 * @ version v2.0 
	 */
	@Override
	@Transactional
	public boolean delete(Makbahv o) throws YesException{
	
	    Makbahv old = dao.getByUid(Makbahv.class,o.getUid());
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
	public PageResult<Makbahv> query(Makbahv  makbahv, Pageable pageable){
		return (PageResult<Makbahv>) dao.query(Makbahv.class,makbahv,pageable);
	}
	
	@Override
	@Transactional
	public void deletes(String uids) throws YesException {
		// TODO Auto-generated method stub

		String[] uidsArr = uids.split(",");
		for (String uid : uidsArr) {
		
			Makbah old = dao.getByUid(Makbah.class,uid);
			if (BaseUtil.isEmpty(old)) {
				throw new YesException(HttpStatus.INTERNAL_SERVER_ERROR, "记录不存，不可删除!!!");
			}
			
			dao.delete(old);
		}

	}
	
	
}
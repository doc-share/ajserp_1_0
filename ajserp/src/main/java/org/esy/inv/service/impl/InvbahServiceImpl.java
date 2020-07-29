package org.esy.inv.service.impl;

import org.esy.inv.entity.Invbah;
import org.esy.inv.entity.Invbat;
import org.esy.inv.entity.view.Invbahv;
import org.esy.inv.service.IInvbahService;
import org.esy.pur.entity.Purbat;
import org.esy.pur.entity.view.Purbahv;
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
public class InvbahServiceImpl implements IInvbahService {

	@Autowired
	private YSDao dao;
	
	/**
	 * 保存实体
	 * @param Invbah
	 * @return Invbah o
	 * @version v2.0
	 */
	@Override
	@Transactional
	public Invbahv save(Invbahv o) throws YesException {
	    if (BaseUtil.isNotEmpty(o.getUid())) {
	    
			Invbahv old = dao.getByUid(Invbahv.class,o.getUid());
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
	 * @return Invbah o
	 * @ version v2.0
	 * 
	 */
	@Override
	public Invbahv getByUid(String uid) {
		
		Invbahv o = dao.getByUid(Invbahv.class, uid);
		o.setInvbats(dao.getlist(Invbat.class, new Invbat(o.getUid())));
		return o;
	}

	/**
	 * 删除实体
	 * @param Invbah o
	 * @return boolean 
	 * @ version v2.0 
	 */
	@Override
	@Transactional
	public boolean delete(Invbahv o) throws YesException{
	
	    Invbah old = dao.getByUid(Invbah.class,o.getUid());
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
	public PageResult<Invbahv > query(Invbahv  invbahv, Pageable pageable){
		return (PageResult<Invbahv>) dao.query(Invbahv.class,invbahv,pageable);
	}
	
	@Override
	@Transactional
	public void deletes(String uids) throws YesException {
		// TODO Auto-generated method stub

		String[] uidsArr = uids.split(",");
		for (String uid : uidsArr) {
		
			Invbah old = dao.getByUid(Invbah.class,uid);
			if (BaseUtil.isEmpty(old)) {
				throw new YesException(HttpStatus.INTERNAL_SERVER_ERROR, "记录不存，不可删除!!!");
			}
			
			dao.delete(old);
		}

	}
	
	
}
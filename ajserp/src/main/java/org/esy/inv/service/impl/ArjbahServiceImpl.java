package org.esy.inv.service.impl;

import org.esy.inv.entity.Arjbah;
import org.esy.inv.entity.Arjbat;
import org.esy.inv.entity.view.Arjbahv;
import org.esy.inv.service.IArjbahService;
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
public class ArjbahServiceImpl implements IArjbahService {

	@Autowired
	private YSDao dao;
	
	/**
	 * 保存实体
	 * @param Arjbah
	 * @return Arjbah o
	 * @version v2.0
	 */
	@Override
	@Transactional
	public Arjbahv save(Arjbahv o) throws YesException {
	    if (BaseUtil.isNotEmpty(o.getUid())) {
	    
			Arjbahv old = dao.getByUid(Arjbahv.class,o.getUid());
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
	 * @return Arjbah o
	 * @ version v2.0
	 * 
	 */
	@Override
	public Arjbahv getByUid(String uid) {
		
		Arjbahv o = dao.getByUid(Arjbahv.class, uid);
		o.setArjbats(dao.getlist(Arjbat.class, new Arjbat(o.getUid())));  
		return o;
	}

	/**
	 * 删除实体
	 * @param Arjbah o
	 * @return boolean 
	 * @ version v2.0 
	 */
	@Override
	@Transactional
	public boolean delete(Arjbahv o) throws YesException{
	
	    Arjbahv old = dao.getByUid(Arjbahv.class,o.getUid());
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
	public PageResult<Arjbahv> query(Arjbahv  arjbahv, Pageable pageable){
		return (PageResult<Arjbahv>) dao.query(Arjbahv.class,arjbahv,pageable);
	}
	
	@Override
	@Transactional
	public void deletes(String uids) throws YesException {
		// TODO Auto-generated method stub

		String[] uidsArr = uids.split(",");
		for (String uid : uidsArr) {
		
			Arjbah old = dao.getByUid(Arjbah.class,uid);
			if (BaseUtil.isEmpty(old)) {
				throw new YesException(HttpStatus.INTERNAL_SERVER_ERROR, "记录不存，不可删除!!!");
			}
			
			dao.delete(old);
		}

	}
	
	
}
package org.esy.ivc.service.impl;

import org.esy.ivc.entity.Oivcbah;
import org.esy.ivc.entity.Oivcbat;
import org.esy.ivc.entity.view.Oivcbahv;
import org.esy.ivc.service.IOivcbahService;
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
public class OivcbahServiceImpl implements IOivcbahService {

	@Autowired
	private YSDao dao;
	
	/**
	 * 保存实体
	 * @param Oivcbah
	 * @return Oivcbah o
	 * @version v2.0
	 */
	@Override
	@Transactional
	public Oivcbahv save(Oivcbahv o) throws YesException {
	    if (BaseUtil.isNotEmpty(o.getUid())) {
	    
			Oivcbahv old = dao.getByUid(Oivcbahv.class,o.getUid());
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
	 * @return Oivcbah o
	 * @ version v2.0
	 * 
	 */
	@Override
	public Oivcbahv getByUid(String uid) {
		Oivcbahv o = dao.getByUid(Oivcbahv.class, uid);
		o.setOivcbats(dao.getlist(Oivcbat.class, new Oivcbat(o.getUid())));
		return o;
	}

	/**
	 * 删除实体
	 * @param Oivcbah o
	 * @return boolean 
	 * @ version v2.0 
	 */
	@Override
	@Transactional
	public boolean delete(Oivcbahv o) throws YesException{
	
	    Oivcbah old = dao.getByUid(Oivcbah.class,o.getUid());
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
	public PageResult<Oivcbahv> query(Oivcbahv  oivcbahv, Pageable pageable){
		return (PageResult<Oivcbahv>) dao.query(Oivcbahv.class,oivcbahv,pageable);
	}
	
	@Override
	@Transactional
	public void deletes(String uids) throws YesException {
		// TODO Auto-generated method stub

		String[] uidsArr = uids.split(",");
		for (String uid : uidsArr) {
		
			Oivcbah old = dao.getByUid(Oivcbah.class,uid);
			if (BaseUtil.isEmpty(old)) {
				throw new YesException(HttpStatus.INTERNAL_SERVER_ERROR, "记录不存，不可删除!!!");
			}
			
			dao.delete(old);
		}

	}
	
	
}
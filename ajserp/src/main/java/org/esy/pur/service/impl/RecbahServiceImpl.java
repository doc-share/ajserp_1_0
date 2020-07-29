package org.esy.pur.service.impl;

import org.esy.pur.entity.Recbah;
import org.esy.pur.entity.Recbat;
import org.esy.pur.entity.view.Recbahv;
import org.esy.pur.service.IRecbahService;
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
public class RecbahServiceImpl implements IRecbahService {

	@Autowired
	private YSDao dao;
	
	/**
	 * 保存实体
	 * @param Recbah
	 * @return Recbah o
	 * @version v2.0
	 */
	@Override
	@Transactional
	public Recbahv save(Recbahv o) throws YesException {
	    if (BaseUtil.isNotEmpty(o.getUid())) {
	    
			Recbahv old = dao.getByUid(Recbahv.class,o.getUid());
			if (BaseUtil.isEmpty(old)) {
				throw new YesException(HttpStatus.NOT_FOUND, "记录不存在，不可更新!!!");
			}
			if (!YESUtil.getDatetimeString(old.getUpdstamp()).equals(YESUtil.getDatetimeString(o.getUpdstamp()))) {
				throw new YesException(HttpStatus.INTERNAL_SERVER_ERROR, "该记录已被其他用户修改，不可更新!!！");
			}
		}
	    o = dao.save(Recbah.class, o);  //存實體
		return o;
	}

	/**
	 * 通过uid查找实体
	 * @param uid
	 * @return Recbah o
	 * @ version v2.0
	 * 
	 */
	@Override
	public Recbahv getByUid(String uid) {
		
		Recbahv o = dao.getByUid(Recbahv.class, uid);
		o.setRecbats(dao.getlist(Recbat.class, new Recbat(o.getUid())));
		return o;
	}

	/**
	 * 删除实体
	 * @param Recbah o
	 * @return boolean 
	 * @ version v2.0 
	 */
	@Override
	@Transactional
	public boolean delete(Recbahv o) throws YesException{
	
	    Recbahv old = dao.getByUid(Recbahv.class,o.getUid());
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
	public PageResult<Recbahv> query(Recbahv  recbahv, Pageable pageable){
		return (PageResult<Recbahv>) dao.query(Recbahv.class,recbahv,pageable);
	}
	
	@Override
	@Transactional
	public void deletes(String uids) throws YesException {
		// TODO Auto-generated method stub

		String[] uidsArr = uids.split(",");
		for (String uid : uidsArr) {
		
			Recbah old = dao.getByUid(Recbah.class,uid);
			if (BaseUtil.isEmpty(old)) {
				throw new YesException(HttpStatus.INTERNAL_SERVER_ERROR, "记录不存，不可删除!!!");
			}
			
			dao.delete(old);
		}

	}
	
	
}
package org.esy.sub.service.impl;

import org.esy.sub.entity.Subbah;
import org.esy.sub.entity.Subbat;
import org.esy.sub.entity.Subuseo;
import org.esy.sub.entity.view.Subbahv;
import org.esy.sub.service.ISubbahService;
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
public class SubbahServiceImpl implements ISubbahService {

	@Autowired
	private YSDao dao;
	
	/**
	 * 保存实体
	 * @param Subbah
	 * @return Subbah o
	 * @version v2.0
	 */
	@Override
	@Transactional
	public Subbahv save(Subbahv o) throws YesException {
	    if (BaseUtil.isNotEmpty(o.getUid())) {
	    
			Subbahv old = dao.getByUid(Subbahv.class,o.getUid());
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
	 * @return Subbah o
	 * @ version v2.0
	 * 
	 */
	@Override
	public Subbahv getByUid(String uid) {
		
		Subbahv o = dao.getByUid(Subbahv.class, uid);
		o.setSubbats(dao.getlist(Subbat.class, new Subbat(o.getUid())));  //有幾個grid就set幾個
		o.setSubuseos(dao.getlist(Subuseo.class, new Subuseo(o.getUid())));
		return o;
	}

	/**
	 * 删除实体
	 * @param Subbah o
	 * @return boolean 
	 * @ version v2.0 
	 */
	@Override
	@Transactional
	public boolean delete(Subbahv o) throws YesException{
	
	    Subbahv old = dao.getByUid(Subbahv.class,o.getUid());
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
	public PageResult<Subbahv> query(Subbahv  subbahv, Pageable pageable){
		return (PageResult<Subbahv>) dao.query(Subbahv.class,subbahv,pageable);
	}
	
	@Override
	@Transactional
	public void deletes(String uids) throws YesException {
		// TODO Auto-generated method stub

		String[] uidsArr = uids.split(",");
		for (String uid : uidsArr) {
		
			Subbah old = dao.getByUid(Subbah.class,uid);
			if (BaseUtil.isEmpty(old)) {
				throw new YesException(HttpStatus.INTERNAL_SERVER_ERROR, "记录不存，不可删除!!!");
			}
			
			dao.delete(old);
		}

	}
	
	
}
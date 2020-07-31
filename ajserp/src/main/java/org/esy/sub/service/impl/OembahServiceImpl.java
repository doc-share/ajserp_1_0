package org.esy.sub.service.impl;

import org.esy.sub.entity.Oembah;
import org.esy.sub.entity.Oembat;
import org.esy.sub.entity.Oemuseo;
import org.esy.sub.entity.view.Oembahv;
import org.esy.sub.service.IOembahService;
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
public class OembahServiceImpl implements IOembahService {

	@Autowired
	private YSDao dao;
	
	/**
	 * 保存实体
	 * @param Oembah
	 * @return Oembah o
	 * @version v2.0
	 */
	@Override
	@Transactional
	public Oembahv save(Oembahv o) throws YesException {
	    if (BaseUtil.isNotEmpty(o.getUid())) {
	    
			Oembahv old = dao.getByUid(Oembahv.class,o.getUid());
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
	 * @return Oembah o
	 * @ version v2.0
	 * 
	 */
	@Override
	public Oembahv getByUid(String uid) {
		
		Oembahv o = dao.getByUid(Oembahv.class, uid);
		o.setOembats(dao.getlist(Oembat.class, new Oembat(o.getUid())));  //有幾個grid就set幾個
		o.setOemuseos(dao.getlist(Oemuseo.class, new Oemuseo(o.getUid())));
		return o;
	}

	/**
	 * 删除实体
	 * @param Oembah o
	 * @return boolean 
	 * @ version v2.0 
	 */
	@Override
	@Transactional
	public boolean delete(Oembahv o) throws YesException{
	
	    Oembahv old = dao.getByUid(Oembahv.class,o.getUid());
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
	public PageResult<Oembahv> query(Oembahv  oembahv, Pageable pageable){
		return (PageResult<Oembahv>) dao.query(Oembahv.class,oembahv,pageable);
	}
	
	@Override
	@Transactional
	public void deletes(String uids) throws YesException {
		// TODO Auto-generated method stub

		String[] uidsArr = uids.split(",");
		for (String uid : uidsArr) {
		
			Oembah old = dao.getByUid(Oembah.class,uid);
			if (BaseUtil.isEmpty(old)) {
				throw new YesException(HttpStatus.INTERNAL_SERVER_ERROR, "记录不存，不可删除!!!");
			}
			
			dao.delete(old);
		}

	}
	
	
}
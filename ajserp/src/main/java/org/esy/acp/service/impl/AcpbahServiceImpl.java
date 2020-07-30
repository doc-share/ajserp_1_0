package org.esy.acp.service.impl;

import org.esy.acp.entity.Acpbah;
import org.esy.acp.entity.Acpbat;
import org.esy.acp.entity.Acpdis;
import org.esy.acp.entity.view.Acpbahv;
import org.esy.acp.service.IAcpbahService;
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
public class AcpbahServiceImpl implements IAcpbahService {

	@Autowired
	private YSDao dao;
	
	/**
	 * 保存实体
	 * @param Acpbah
	 * @return Acpbah o
	 * @version v2.0
	 */
	@Override
	@Transactional
	public Acpbahv save(Acpbahv o) throws YesException {
	    if (BaseUtil.isNotEmpty(o.getUid())) {
	    
			Acpbahv old = dao.getByUid(Acpbahv.class,o.getUid());
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
	 * @return Acpbah o
	 * @ version v2.0
	 * 
	 */
	@Override
	public Acpbahv getByUid(String uid) {
		
		Acpbahv o = dao.getByUid(Acpbahv.class, uid);
		o.setAcpbats(dao.getlist(Acpbat.class, new Acpbat(o.getUid())));  //有幾個grid就set幾個
		o.setAcpdiss(dao.getlist(Acpdis.class, new Acpdis(o.getUid())));
		return o;
	}

	/**
	 * 删除实体
	 * @param Acpbah o
	 * @return boolean 
	 * @ version v2.0 
	 */
	@Override
	@Transactional
	public boolean delete(Acpbahv o) throws YesException{
	
	    Acpbah old = dao.getByUid(Acpbah.class,o.getUid());
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
	public PageResult<Acpbahv> query(Acpbahv  acpbahv, Pageable pageable){
		return (PageResult<Acpbahv>) dao.query(Acpbahv.class,acpbahv,pageable);
	}
	
	@Override
	@Transactional
	public void deletes(String uids) throws YesException {
		// TODO Auto-generated method stub

		String[] uidsArr = uids.split(",");
		for (String uid : uidsArr) {
		
			Acpbah old = dao.getByUid(Acpbah.class,uid);
			if (BaseUtil.isEmpty(old)) {
				throw new YesException(HttpStatus.INTERNAL_SERVER_ERROR, "记录不存，不可删除!!!");
			}
			
			dao.delete(old);
		}

	}
	
	
}
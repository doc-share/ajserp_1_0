package org.esy.ord.service.impl;

import org.esy.ord.entity.Ordbah;
import org.esy.ord.entity.Ordbat;
import org.esy.ord.entity.view.Ordbahv;
import org.esy.ord.service.IOrdbahService;

import java.text.SimpleDateFormat;

import org.esy.base.common.BaseUtil;
import org.esy.base.dao.YSDao;
import org.esy.base.util.YESUtil;
import org.esy.base.util.YesException;
import org.springframework.beans.factory.annotation.Autowired;
import org.esy.base.dao.core.PageResult;
import org.esy.base.service.ISerialService;//自動生成引入
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class OrdbahServiceImpl implements IOrdbahService {

	@Autowired
	private YSDao dao;
	
	
	@Autowired
	private ISerialService serialService;   //自動生成
	
	/**
	 * 保存实体
	 * @param Ordbah
	 * @return Ordbah o
	 * @version v2.0
	 */
	@Override
	@Transactional
	public Ordbahv save(Ordbahv o) throws YesException {
	    if (BaseUtil.isNotEmpty(o.getUid())) {
	    
			Ordbahv old = dao.getByUid(Ordbahv.class,o.getUid());
			if (BaseUtil.isEmpty(old)) {
				throw new YesException(HttpStatus.NOT_FOUND, "记录不存在，不可更新!!!");
			}
			if (!YESUtil.getDatetimeString(old.getUpdstamp()).equals(YESUtil.getDatetimeString(o.getUpdstamp()))) {
				throw new YesException(HttpStatus.INTERNAL_SERVER_ERROR, "该记录已被其他用户修改，不可更新!!！");
			}
		}
	    
	    SimpleDateFormat formatter = new SimpleDateFormat("yyyyMM");
		String date = "S" + YESUtil.getDateString(o.getNbrdate(), formatter);     //自動生成
		String no = serialService.getSerialString("ord", "ordbah", date, 5, 99999);
		o.setNbr(no);
	    
	    
		o = dao.save(Ordbah.class, o);  //存實體
		return o;
	}

	/**
	 * 通过uid查找实体
	 * @param uid
	 * @return Ordbah o
	 * @ version v2.0
	 * 
	 */
	@Override
	public Ordbahv getByUid(String uid) {
		Ordbahv o = dao.getByUid(Ordbahv.class, uid);
		o.setOrdbats(dao.getlist(Ordbat.class, new Ordbat(o.getUid())));
		return o;
	}

	/**
	 * 删除实体
	 * @param Ordbah o
	 * @return boolean 
	 * @ version v2.0 
	 */
	@Override
	@Transactional
	public boolean delete(Ordbahv o) throws YesException{
	
	    Ordbah old = dao.getByUid(Ordbah.class,o.getUid());
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
	public PageResult<Ordbahv> query(Ordbahv ordbahv, Pageable pageable){
		return (PageResult<Ordbahv>) dao.query(Ordbahv.class,ordbahv,pageable);
	}
	
	@Override
	@Transactional
	public void deletes(String uids) throws YesException {
		// TODO Auto-generated method stub

		String[] uidsArr = uids.split(",");
		for (String uid : uidsArr) {
		
			Ordbah old = dao.getByUid(Ordbah.class,uid);
			if (BaseUtil.isEmpty(old)) {
				throw new YesException(HttpStatus.INTERNAL_SERVER_ERROR, "记录不存，不可删除!!!");
			}
			
			dao.delete(old);
		}

	}
	
	
}
package org.esy.shp.service.impl;

import org.esy.shp.entity.Shpbah;
import org.esy.shp.entity.Shpbat;
import org.esy.shp.entity.view.Shpbahv;
import org.esy.shp.service.IShpbahService;

import java.text.SimpleDateFormat;

import org.esy.base.common.BaseUtil;
import org.esy.base.dao.YSDao;
import org.esy.base.util.YESUtil;
import org.esy.base.util.YesException;
import org.springframework.beans.factory.annotation.Autowired;
import org.esy.base.dao.core.PageResult;
import org.esy.base.service.ISerialService;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ShpbahServiceImpl implements IShpbahService {

	@Autowired
	private YSDao dao;
	
	
	@Autowired
	private ISerialService serialService;   //自動生成
	
	@Override
	@Transactional
	public Shpbahv save(Shpbahv o) throws YesException {
	    if (BaseUtil.isNotEmpty(o.getUid())) {
	    
			Shpbahv old = dao.getByUid(Shpbahv.class,o.getUid());
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
		
		
		
		o = dao.save(Shpbah.class, o);  //存實體
		return o;
	}

	/**
	 * 通过uid查找实体
	 * @param uid
	 * @return Shpbah o
	 * @ version v2.0
	 * 
	 */
	@Override
	public Shpbahv getByUid(String uid) {
		
		Shpbahv o = dao.getByUid(Shpbahv.class, uid);
		o.setShpbats(dao.getlist(Shpbat.class, new Shpbat()));
		return dao.getByUid(Shpbah.class,uid);
		
	}

	/**
	 * 删除实体
	 * @param Shpbah o
	 * @return boolean 
	 * @ version v2.0 
	 */
	@Override
	@Transactional
	public boolean delete(Shpbahv o) throws YesException{
	
	    Shpbah old = dao.getByUid(Shpbah.class,o.getUid());
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
	public PageResult<Shpbahv> query(Shpbahv shpbahv, Pageable pageable){
		return (PageResult<Shpbahv>) dao.query(Shpbahv.class,shpbahv,pageable);
	}
	
	@Override
	@Transactional
	public void deletes(String uids) throws YesException {
		// TODO Auto-generated method stub

		String[] uidsArr = uids.split(",");
		for (String uid : uidsArr) {
		
			Shpbah old = dao.getByUid(Shpbah.class,uid);
			if (BaseUtil.isEmpty(old)) {
				throw new YesException(HttpStatus.INTERNAL_SERVER_ERROR, "记录不存，不可删除!!!");
			}
			
			dao.delete(old);
		}

	}
	
	
}
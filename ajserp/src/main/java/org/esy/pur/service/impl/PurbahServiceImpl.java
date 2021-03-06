package org.esy.pur.service.impl;

import org.esy.pur.entity.Purbah;
import org.esy.pur.entity.Purbat;
import org.esy.pur.entity.view.Purbahv;
import org.esy.pur.service.IPurbahService;
import java.text.SimpleDateFormat;
import java.util.List;

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
public class PurbahServiceImpl implements IPurbahService {

	@Autowired
	private YSDao dao;
	
	@Autowired
	private ISerialService serialService;   //自動生成
	
	@Override
	@Transactional
	public Purbahv save(Purbahv o) throws YesException {
	    if (BaseUtil.isNotEmpty(o.getUid())) {
	    
			Purbahv old = dao.getByUid(Purbahv.class,o.getUid());
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
		
		
		List<Purbat> purbats = o.getPurbats();

		for (Purbat purbat : purbats) {  //存檔:一筆一筆迴圈
			
			if (purbat.getIsdel() && BaseUtil.isNotEmpty(purbat.getUid())) { 
				dao.delete(Purbat.class, purbat);
			}
			if (!purbat.getIsdel()) {
				purbat.setHuid(o.getUid());
				purbat.setNbr(o.getNbr());
				dao.save(Purbat.class, purbat);
			}
		}
		o = dao.save(Purbah.class, o);  //存實體
		return o;
	}

	/**
	 * 通过uid查找实体
	 * @param uid
	 * @return Purbah o
	 * @ version v2.0
	 * 
	 */
	@Override
	public Purbahv getByUid(String uid) {

		Purbahv o = dao.getByUid(Purbahv.class, uid);
		o.setPurbats(dao.getlist(Purbat.class, new Purbat(o.getUid())));
		return o;
	}

	/**
	 * 删除实体
	 * @param Purbah o
	 * @return boolean 
	 * @ version v2.0 
	 */
	@Override
	@Transactional
	public boolean delete(Purbahv o) throws YesException{
	
	    Purbah old = dao.getByUid(Purbah.class,o.getUid());
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
	public PageResult<Purbahv> query(Purbahv  purbahv, Pageable pageable){
		return (PageResult<Purbahv>) dao.query(Purbahv.class,purbahv,pageable);
	}
	
	@Override
	@Transactional
	public void deletes(String uids) throws YesException {
		// TODO Auto-generated method stub

		String[] uidsArr = uids.split(",");
		for (String uid : uidsArr) {
		
			Purbah old = dao.getByUid(Purbah.class,uid);
			if (BaseUtil.isEmpty(old)) {
				throw new YesException(HttpStatus.INTERNAL_SERVER_ERROR, "记录不存，不可删除!!!");
			}
			
			dao.delete(old);
		}

	}
	
	
}
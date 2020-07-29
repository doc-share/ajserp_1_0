package org.esy.ord.service.impl;

import org.esy.ord.entity.Quobah;
import org.esy.ord.entity.Quobat;
import org.esy.ord.entity.view.Quobahv;
import org.esy.ord.service.IQuobahService;

import java.text.SimpleDateFormat;
import org.esy.base.common.BaseUtil;
import org.esy.base.dao.YSDao;
import org.esy.base.util.YESUtil;
import org.esy.base.util.YesException;
import org.springframework.beans.factory.annotation.Autowired;
import org.esy.base.dao.core.PageResult;
import org.esy.base.service.ISerialService;  //自動生成引入
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class QuobahServiceImpl implements IQuobahService {

	@Autowired
	private YSDao dao;
	

	@Autowired
	private ISerialService serialService; //自動生成
	
	@Override
	@Transactional
	public Quobahv save(Quobahv o) throws YesException {
	    if (BaseUtil.isNotEmpty(o.getUid())) {
	    
			Quobahv old = dao.getByUid(Quobahv.class,o.getUid());
			if (BaseUtil.isEmpty(old)) {
				throw new YesException(HttpStatus.NOT_FOUND, "记录不存在，不可更新!!!");
			}
			if (!YESUtil.getDatetimeString(old.getUpdstamp()).equals(YESUtil.getDatetimeString(o.getUpdstamp()))) {
				throw new YesException(HttpStatus.INTERNAL_SERVER_ERROR, "该记录已被其他用户修改，不可更新!!！");
			}
		}
	    
	    SimpleDateFormat formatter = new SimpleDateFormat("yyyyMM");
		String date = "S" + YESUtil.getDateString(o.getNbrdate(), formatter);  //自動生成
		String no = serialService.getSerialString("ord", "ordbah", date, 5, 99999);

		o.setNbr(no); //指向單據號碼
		
		
//		List<Quobat> quobats = o.getQuobats();
//		
//		for (Quobat quobat : quobats) {  //存檔:一筆一筆迴圈
//			
//			if (quobat.getIsdel() && BaseUtil.isNotEmpty(quobat.getUid())) { //BaseUtil.isNotEmpty(contacr.getUid())判斷合約明細(contacr)不為空時(修改時)
//				dao.delete(Quobat.class, quobat);
//			}
//			if (!quobat.getIsdel()) {
//				quobat.setHuid(o.getUid());
//				quobat.setNbr(o.getNbr());
//				dao.save(Quobat.class, quobat);
//			}
//		}
//		
		o = dao.save(Quobah.class, o);
		
		return o; 
	}

	/**
	 * 通过uid查找实体
	 * @param uid
	 * @return Quobah o
	 * @ version v2.0
	 * 
	 */
	@Override
	public Quobahv getByUid(String uid) {

		Quobahv o = dao.getByUid(Quobahv.class, uid);
		o.setQuobats(dao.getlist(Quobat.class, new Quobat(o.getUid())));
		return o;
	}

	/**
	 * 删除实体
	 * @param Quobah o
	 * @return boolean 
	 * @ version v2.0 
	 */
	@Override
	@Transactional
	public boolean delete(Quobahv o) throws YesException{
	
	    Quobahv old = dao.getByUid(Quobah.class,o.getUid());
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
	public PageResult<Quobahv> query(Quobahv  quobahv, Pageable pageable){
		return (PageResult<Quobahv>) dao.query(Quobahv.class,quobahv,pageable);
	}
	
	@Override
	@Transactional
	public void deletes(String uids) throws YesException {
		// TODO Auto-generated method stub

		String[] uidsArr = uids.split(",");
		for (String uid : uidsArr) {
		
			Quobah old = dao.getByUid(Quobah.class,uid);
			if (BaseUtil.isEmpty(old)) {
				throw new YesException(HttpStatus.INTERNAL_SERVER_ERROR, "记录不存，不可删除!!!");
			}
			
			dao.delete(old);
		}

	}
	
	
}
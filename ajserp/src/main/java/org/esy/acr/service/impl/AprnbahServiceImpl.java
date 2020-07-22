package org.esy.acr.service.impl;

import java.util.List;

import org.esy.acr.entity.Aprnbah;
import org.esy.acr.entity.Aprnbat;
import org.esy.acr.entity.view.Aprnbahv;
import org.esy.acr.service.IAprnbahService;
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
public class AprnbahServiceImpl implements IAprnbahService {

	@Autowired
	private YSDao dao;
	
	/**
	 * 保存实体
	 * @param Aprnbahv
	 * @return Aprnbah o
	 * @version v2.0
	 */
	@Override
	@Transactional
	public Aprnbahv save(Aprnbahv o) throws YesException {
		if (BaseUtil.isNotEmpty(o.getUid())) {

			Aprnbahv old = dao.getByUid(Aprnbahv.class, o.getUid());
			if (BaseUtil.isEmpty(old)) {
				throw new YesException(HttpStatus.NOT_FOUND, "记录不存在，不可更新!!!");
			}
			if (!YESUtil.getDatetimeString(old.getUpdstamp()).equals(YESUtil.getDatetimeString(o.getUpdstamp()))) {
				throw new YesException(HttpStatus.INTERNAL_SERVER_ERROR, "该记录已被其他用户修改，不可更新!!！");
			}
		}

		
		if (BaseUtil.isEmpty(o.getNbr())) {  //判斷欄位是否為空(o.get..()可變換，這邊用Nbr())
			throw new YesException(HttpStatus.NOT_FOUND, "帳單編號不可为空!!!");
		}


		
		List<Aprnbat> aprnbats = o.getAprnbats();
		
		for (Aprnbat aprnbat : aprnbats) {  //存檔:一筆一筆迴圈
			
			if (aprnbat.getIsdel() && BaseUtil.isNotEmpty(aprnbat.getUid())) {
				dao.delete(Aprnbat.class, aprnbat);
			}
			if (!aprnbat.getIsdel()) {
				aprnbat.setHuid(o.getUid());
				aprnbat.setNbr(o.getNbr());
				dao.save(Aprnbat.class, aprnbat);
			}
		}
		o = dao.save(Aprnbah.class, o);
		return o;    
		
	}

	@Override
	public Aprnbahv getByUid(String uid) {
		Aprnbahv o = dao.getByUid(Aprnbahv.class, uid);
		o.setAprnbats(dao.getlist(Aprnbat.class, new Aprnbat()));
		return o;
	}

	
	@Override
	@Transactional
	public boolean delete(Aprnbahv o) throws YesException{
	
		Aprnbahv old = dao.getByUid(Aprnbah.class,o.getUid());
		if (BaseUtil.isNotEmpty(old)) {
			throw new YesException(HttpStatus.INTERNAL_SERVER_ERROR, "记录不存，不可删除!!!");
		}
		if (!YESUtil.getDatetimeString(old.getUpdstamp()).equals(YESUtil.getDatetimeString(o.getUpdstamp()))) {
			throw new YesException(HttpStatus.INTERNAL_SERVER_ERROR, "该记录已被其他用户修改，不可删除!!！");
		}
		return dao.delete(o);
	}

     
	
	@Override
	public PageResult<Aprnbahv> query(Aprnbahv  aprnbahv, Pageable pageable){
		return (PageResult<Aprnbahv>) dao.query(Aprnbahv.class,aprnbahv,pageable);
	}
	
	@Override
	@Transactional
	public void deletes(String uids) throws YesException {
		

		String[] uidsArr = uids.split(",");
		for (String uid : uidsArr) {
		
			Aprnbah old = dao.getByUid(Aprnbah.class,uid);
			if (BaseUtil.isEmpty(old)) {
				throw new YesException(HttpStatus.INTERNAL_SERVER_ERROR, "记录不存，不可删除!!!");
			}
			dao.deleteList(Aprnbat.class, new Aprnbat());
			dao.delete(old);
		}

	}
	
	
}
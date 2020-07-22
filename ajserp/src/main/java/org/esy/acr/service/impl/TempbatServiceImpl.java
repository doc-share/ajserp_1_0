package org.esy.acr.service.impl;

import java.util.List;

import org.esy.acr.entity.Tempbat;
import org.esy.acr.entity.view.Tempbatv;
import org.esy.acr.service.ITempbatService;
import org.esy.base.common.BaseUtil;
import org.esy.base.dao.YSDao;
import org.esy.base.dao.core.PageResult;
import org.esy.base.util.YESUtil;
import org.esy.base.util.YesException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class TempbatServiceImpl implements ITempbatService {

	@Autowired
	private YSDao dao;

	/**
	 * 保存实体
	 * 
	 * @param Tempbatv
	 * @return Tempbat o
	 * @version v2.0
	 */
	@Override
	@Transactional
	public Tempbatv save(Tempbatv o) throws YesException {
		if (BaseUtil.isNotEmpty(o.getUid())) {

			Tempbatv old = dao.getByUid(Tempbatv.class, o.getUid());
			if (BaseUtil.isEmpty(old)) {
				throw new YesException(HttpStatus.NOT_FOUND, "记录不存在，不可更新!!!");
			}
			if (!YESUtil.getDatetimeString(old.getUpdstamp()).equals(YESUtil.getDatetimeString(o.getUpdstamp()))) {
				throw new YesException(HttpStatus.INTERNAL_SERVER_ERROR, "该记录已被其他用户修改，不可更新!!！");
			}
		}
		// if (BaseUtil.isEmpty(o.getNbr())) { //判斷欄位是否為空(o.get..()可變換，這邊用Nbr())
		// throw new YesException(HttpStatus.NOT_FOUND, "合约编号不可为空!!!");
		// }

		List<Tempbat> tempbats = o.getTempbats();
		if (BaseUtil.isNotEmpty(o.getUid())) {
			Tempbat f = new Tempbat();
			dao.deleteList(Tempbat.class, f);
		}
		o = dao.save(Tempbat.class, o);
		for (Tempbat tempbat : tempbats) { // 存檔:一筆一筆迴圈

			if (!tempbat.getIsdel()) {
				tempbat.setTemp_nbr(o.getTemp_nbr());
				tempbat.setTemp_desc(o.getTemp_desc());
				dao.save(Tempbat.class, tempbat);
			}
		}

		return o;
	}

	/**
	 * 通过uid查找实体
	 * 
	 * @param uid
	 * @return Tempbat o @ version v2.0
	 * 
	 */
	@Override
	public Tempbatv getByUid(String uid) {
		Tempbatv o = dao.getByUid(Tempbatv.class, uid);
		o.setTempbats(dao.getlist(Tempbat.class, new Tempbat()));
		return o;
	}

	/**
	 * 删除实体
	 * 
	 * @param Tempbatv
	 *            o
	 * @return boolean @ version v2.0
	 */
	@Override
	@Transactional
	public boolean delete(Tempbatv o) throws YesException {

		Tempbatv old = dao.getByUid(Tempbat.class, o.getUid());
		if (BaseUtil.isNotEmpty(old)) {// 判斷不為空時
			throw new YesException(HttpStatus.INTERNAL_SERVER_ERROR, "记录不存在，不可删除!!!");
		}
		if (!YESUtil.getDatetimeString(old.getUpdstamp()).equals(YESUtil.getDatetimeString(o.getUpdstamp()))) {
			throw new YesException(HttpStatus.INTERNAL_SERVER_ERROR, "该记录已被其他用户修改，不可删除!!！");
		}
		return dao.delete(o);
	}

	/**
	 * 查询实体
	 * 
	 * @param Map<String,
	 *            Object> parm
	 * @return QueryResult @ version v2.0
	 */
	@Override
	public PageResult<Tempbatv> query(Tempbatv tempbat, Pageable pageable) {
		return (PageResult<Tempbatv>) dao.query(Tempbatv.class, tempbat, pageable);
	}

	@Override
	@Transactional
	public void deletes(String uids) throws YesException {
		// TODO Auto-generated method stub

		String[] uidsArr = uids.split(",");
		for (String uid : uidsArr) {

			Tempbat old = dao.getByUid(Tempbat.class, uid);
			if (BaseUtil.isEmpty(old)) {
				throw new YesException(HttpStatus.INTERNAL_SERVER_ERROR, "记录不存，不可删除!!!");
			}
			dao.deleteList(Tempbat.class, new Tempbat());
			dao.delete(old);
		}

	}

	@Override
	public List<Tempbat> getbat(Tempbat tempbat) {
		return dao.getlist(Tempbat.class, tempbat);
	}

}
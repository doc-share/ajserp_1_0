package org.esy.ord.service.impl;

import java.util.List;

import org.esy.base.common.BaseUtil;
import org.esy.base.dao.YSDao;
import org.esy.base.dao.core.PageResult; //**
import org.esy.base.util.DateUtil;
import org.esy.base.util.YESUtil;
import org.esy.base.util.YesException;
import org.esy.ord.entity.Contacr;
import org.esy.ord.entity.Contbah;
import org.esy.ord.entity.view.Contyearv;
import org.esy.ord.service.IContyearService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ContyearServiceImpl implements IContyearService {

	@Autowired
	private YSDao dao;

	@Override
	public PageResult<Contyearv> query(Contyearv contyearv, Pageable pageable) {
		
//		String where = "where a.year_status is not null and a.year_status<>'' ";
//		return (PageResult<Contyearv>) dao.query(Contyearv.class, contyearv, pageable, "select a.* ", where, "");
		return (PageResult<Contyearv>) dao.query(Contyearv.class, contyearv, pageable);
	}

	@Override
	@Transactional
	public void savecontcase(String[] uids) {
		for (String uid : uids) {
			Contbah o = dao.getByUid(Contbah.class, uid);
			if (BaseUtil.isEmpty(o)) {
				throw new YesException(HttpStatus.NOT_FOUND, "记录不存在，不可更新!!!");
			}
			o.setPlan_date(YESUtil.addYear(o.getPlan_date(), 1));
			o = dao.save(Contbah.class, o);
			String uidsstr = uids.toString();// "sdfwe,sdfwef,sdfwef"
			List<Contacr> contacrs = dao.getlist(Contacr.class, new Contacr(), "select a.* from Contacr",
					"where a.uid in (" + uidsstr + ")", "");

			for (Contacr contacr : contacrs) {
				String acr_mon = DateUtil.formatDate(o.getPlan_date(), "yyyyMM");
				contacr.setAcr_mon(acr_mon);
				dao.save(contacr);

			}

		}

	}

}
package org.esy.ord.service;

import org.esy.base.dao.core.PageResult;
import org.esy.ord.entity.view.Contyearv;
import org.springframework.data.domain.Pageable;

public interface IContyearService {

	// Contbahv save(Contbahv o);
	// Contbahv getByUid(String uid);
	//
	// boolean delete(Contbahv o);

	PageResult<Contyearv> query(Contyearv contyearv, Pageable pageable);

	void savecontcase(String[] uids);

	// void deletes(String uids);
}
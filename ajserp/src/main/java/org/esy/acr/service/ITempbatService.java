package org.esy.acr.service;

import java.util.List;

import org.esy.acr.entity.Tempbat;
import org.esy.acr.entity.view.Tempbatv;
import org.esy.base.dao.core.PageResult;
import org.springframework.data.domain.Pageable;

/**
 * @author <a href="mailto:ardui@163.com">ardui</a>
 * @date Fri Jun 19 16:20:53 CST 2020
 *
 * @version v2.0
 */
public interface ITempbatService {

	Tempbatv save(Tempbatv o);

	Tempbatv getByUid(String uid);

	boolean delete(Tempbatv o);

	PageResult<Tempbatv> query(Tempbatv tempbat, Pageable pageable);

	void deletes(String uids);

	List<Tempbat> getbat(Tempbat tempbat);
}
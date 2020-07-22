package org.esy.ord.service;

import org.esy.base.dao.core.PageResult;
import org.esy.ord.entity.view.Contcasev;
import org.springframework.data.domain.Pageable;

/**
 * @author <a href="mailto:ardui@163.com">ardui</a>
 * @date Tue Jun 23 11:06:06 CST 2020
 *
 * @version v2.0
 */
public interface IContcaseService {

	Contcasev save(Contcasev o);
	Contcasev getByUid(String uid);

	boolean delete(Contcasev o);

	PageResult<Contcasev> query(Contcasev contcase, Pageable pageable);
	
	void deletes(String uids);
}
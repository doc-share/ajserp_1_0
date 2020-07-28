package org.esy.ord.service;

import org.esy.ord.entity.view.Ordbahv;
import org.esy.base.dao.core.PageResult;
import org.springframework.data.domain.Pageable;

/**
 * @author <a href="mailto:ardui@163.com">ardui</a>
 * @date Tue Jul 28 11:22:12 CST 2020
 *
 * @version v2.0
 */
public interface IOrdbahService  {
    
    Ordbahv save(Ordbahv o);

	Ordbahv getByUid(String uid);

	boolean delete(Ordbahv o);

	PageResult<Ordbahv> query(Ordbahv ordbahv, Pageable pageable);
     
     void deletes(String uids);
}
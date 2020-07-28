package org.esy.ord.service;

import org.esy.ord.entity.Ordbat;
import org.esy.base.dao.core.PageResult;
import org.springframework.data.domain.Pageable;

/**
 * @author <a href="mailto:ardui@163.com">ardui</a>
 * @date Tue Jul 28 11:22:38 CST 2020
 *
 * @version v2.0
 */
public interface IOrdbatService  {
    
    Ordbat save(Ordbat o);

	Ordbat getByUid(String uid);

	boolean delete(Ordbat o);

	PageResult<Ordbat> query(Ordbat ordbat, Pageable pageable);
     
     void deletes(String uids);
}
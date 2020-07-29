package org.esy.inv.service;

import org.esy.inv.entity.Invbat;
import org.esy.base.dao.core.PageResult;
import org.springframework.data.domain.Pageable;

/**
 * @author <a href="mailto:ardui@163.com">ardui</a>
 * @date Wed Jul 29 14:58:22 CST 2020
 *
 * @version v2.0
 */
public interface IInvbatService  {
    
    Invbat save(Invbat o);

	Invbat getByUid(String uid);

	boolean delete(Invbat o);

	PageResult<Invbat> query(Invbat invbat, Pageable pageable);
     
     void deletes(String uids);
}
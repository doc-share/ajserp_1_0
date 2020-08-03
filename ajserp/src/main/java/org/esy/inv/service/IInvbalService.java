package org.esy.inv.service;

import org.esy.inv.entity.Invbal;
import org.esy.base.dao.core.PageResult;
import org.springframework.data.domain.Pageable;

/**
 * @author <a href="mailto:ardui@163.com">ardui</a>
 * @date Mon Aug 03 10:12:48 CST 2020
 *
 * @version v2.0
 */
public interface IInvbalService  {
    
    Invbal save(Invbal o);

	Invbal getByUid(String uid);

	boolean delete(Invbal o);

	PageResult<Invbal> query(Invbal invbal, Pageable pageable);
     
     void deletes(String uids);
}
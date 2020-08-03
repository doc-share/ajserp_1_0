package org.esy.inv.service;

import org.esy.inv.entity.Invtra;
import org.esy.base.dao.core.PageResult;
import org.springframework.data.domain.Pageable;

/**
 * @author <a href="mailto:ardui@163.com">ardui</a>
 * @date Mon Aug 03 10:12:58 CST 2020
 *
 * @version v2.0
 */
public interface IInvtraService  {
    
    Invtra save(Invtra o);

	Invtra getByUid(String uid);

	boolean delete(Invtra o);

	PageResult<Invtra> query(Invtra invtra, Pageable pageable);
     
     void deletes(String uids);
}
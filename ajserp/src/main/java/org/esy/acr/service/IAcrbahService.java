package org.esy.acr.service;

import org.esy.acr.entity.Acrbah;
import org.esy.base.dao.core.PageResult;
import org.springframework.data.domain.Pageable;

/**
 * @author <a href="mailto:ardui@163.com">ardui</a>
 * @date Fri Jun 19 16:52:53 CST 2020
 *
 * @version v2.0
 */
public interface IAcrbahService  {
    
    Acrbah save(Acrbah o);

	Acrbah getByUid(String uid);

	boolean delete(Acrbah o);

	PageResult<Acrbah> query(Acrbah acrbah, Pageable pageable);
     
     void deletes(String uids);
}
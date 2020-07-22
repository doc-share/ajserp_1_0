package org.esy.acr.service;

import org.esy.acr.entity.Acrdis;
import org.esy.base.dao.core.PageResult;
import org.springframework.data.domain.Pageable;

/**
 * @author <a href="mailto:ardui@163.com">ardui</a>
 * @date Tue Jun 23 11:01:13 CST 2020
 *
 * @version v2.0
 */
public interface IAcrdisService  {
    
    Acrdis save(Acrdis o);

	Acrdis getByUid(String uid);

	boolean delete(Acrdis o);

	PageResult<Acrdis> query(Acrdis acrdis, Pageable pageable);
     
     void deletes(String uids);
}
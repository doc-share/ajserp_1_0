package org.esy.acr.service;

import org.esy.acr.entity.Acrbal;
import org.esy.base.dao.core.PageResult;
import org.springframework.data.domain.Pageable;

/**
 * @author <a href="mailto:ardui@163.com">ardui</a>
 * @date Wed Jul 29 16:10:01 CST 2020
 *
 * @version v2.0
 */
public interface IAcrbalService  {
    
    Acrbal save(Acrbal o);

	Acrbal getByUid(String uid);

	boolean delete(Acrbal o);

	PageResult<Acrbal> query(Acrbal acrbal, Pageable pageable);
     
     void deletes(String uids);
}
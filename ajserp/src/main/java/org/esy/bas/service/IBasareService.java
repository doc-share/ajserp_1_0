package org.esy.bas.service;

import org.esy.bas.entity.Basare;
import org.esy.base.dao.core.PageResult;
import org.springframework.data.domain.Pageable;

/**
 * @author <a href="mailto:ardui@163.com">ardui</a>
 * @date Thu Jul 23 14:05:10 CST 2020
 *
 * @version v2.0
 */
public interface IBasareService  {
    
    Basare save(Basare o);

	Basare getByUid(String uid);

	boolean delete(Basare o);

	PageResult<Basare> query(Basare basare, Pageable pageable);
     
     void deletes(String uids);
}
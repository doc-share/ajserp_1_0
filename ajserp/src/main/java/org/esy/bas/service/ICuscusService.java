package org.esy.bas.service;

import org.esy.bas.entity.Cuscus;
import org.esy.base.dao.core.PageResult;
import org.springframework.data.domain.Pageable;

/**
 * @author <a href="mailto:ardui@163.com">ardui</a>
 * @date Tue Jun 23 13:23:26 CST 2020
 *
 * @version v2.0
 */
public interface ICuscusService  {
    
    Cuscus save(Cuscus o);

	Cuscus getByUid(String uid);

	boolean delete(Cuscus o);

	PageResult<Cuscus> query(Cuscus cuscus, Pageable pageable);
     
     void deletes(String uids);
}
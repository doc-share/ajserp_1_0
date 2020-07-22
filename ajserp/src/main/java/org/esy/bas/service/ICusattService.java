package org.esy.bas.service;

import org.esy.bas.entity.Cusatt;
import org.esy.base.dao.core.PageResult;
import org.springframework.data.domain.Pageable;

/**
 * @author <a href="mailto:ardui@163.com">ardui</a>
 * @date Tue Jun 23 13:30:12 CST 2020
 *
 * @version v2.0
 */
public interface ICusattService  {
    
    Cusatt save(Cusatt o);

	Cusatt getByUid(String uid);

	boolean delete(Cusatt o);

	PageResult<Cusatt> query(Cusatt cusatt, Pageable pageable);
     
     void deletes(String uids);
}
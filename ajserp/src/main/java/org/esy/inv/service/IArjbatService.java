package org.esy.inv.service;

import org.esy.inv.entity.Arjbat;
import org.esy.base.dao.core.PageResult;
import org.springframework.data.domain.Pageable;

/**
 * @author <a href="mailto:ardui@163.com">ardui</a>
 * @date Fri Jul 31 17:24:38 CST 2020
 *
 * @version v2.0
 */
public interface IArjbatService  {
    
    Arjbat save(Arjbat o);

	Arjbat getByUid(String uid);

	boolean delete(Arjbat o);

	PageResult<Arjbat> query(Arjbat arjbat, Pageable pageable);
     
     void deletes(String uids);
}
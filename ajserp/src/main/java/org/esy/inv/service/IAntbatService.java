package org.esy.inv.service;

import org.esy.inv.entity.Antbat;
import org.esy.base.dao.core.PageResult;
import org.springframework.data.domain.Pageable;

/**
 * @author <a href="mailto:ardui@163.com">ardui</a>
 * @date Mon Aug 03 08:52:45 CST 2020
 *
 * @version v2.0
 */
public interface IAntbatService  {
    
    Antbat save(Antbat o);

	Antbat getByUid(String uid);

	boolean delete(Antbat o);

	PageResult<Antbat> query(Antbat antbat, Pageable pageable);
     
     void deletes(String uids);
}
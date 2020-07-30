package org.esy.ord.service;

import org.esy.ord.entity.Shpbat;
import org.esy.base.dao.core.PageResult;
import org.springframework.data.domain.Pageable;

/**
 * @author <a href="mailto:ardui@163.com">ardui</a>
 * @date Thu Jul 30 08:48:09 CST 2020
 *
 * @version v2.0
 */
public interface IShpbatService  {
    
    Shpbat save(Shpbat o);

	Shpbat getByUid(String uid);

	boolean delete(Shpbat o);

	PageResult<Shpbat> query(Shpbat shpbat, Pageable pageable);
     
     void deletes(String uids);
}
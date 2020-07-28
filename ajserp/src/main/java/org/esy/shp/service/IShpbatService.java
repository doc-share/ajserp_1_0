package org.esy.shp.service;

import org.esy.shp.entity.Shpbat;
import org.esy.base.dao.core.PageResult;
import org.springframework.data.domain.Pageable;

/**
 * @author <a href="mailto:ardui@163.com">ardui</a>
 * @date Tue Jul 28 13:58:38 CST 2020
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
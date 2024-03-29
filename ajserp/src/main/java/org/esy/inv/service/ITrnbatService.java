package org.esy.inv.service;

import org.esy.inv.entity.Trnbat;
import org.esy.base.dao.core.PageResult;
import org.springframework.data.domain.Pageable;

/**
 * @author <a href="mailto:ardui@163.com">ardui</a>
 * @date Mon Aug 03 09:09:21 CST 2020
 *
 * @version v2.0
 */
public interface ITrnbatService  {
    
    Trnbat save(Trnbat o);

	Trnbat getByUid(String uid);

	boolean delete(Trnbat o);

	PageResult<Trnbat> query(Trnbat trnbat, Pageable pageable);
     
     void deletes(String uids);
}
package org.esy.acc.service;

import org.esy.acc.entity.Accbat;
import org.esy.base.dao.core.PageResult;
import org.springframework.data.domain.Pageable;

/**
 * @author <a href="mailto:ardui@163.com">ardui</a>
 * @date Sat Jun 20 09:30:48 CST 2020
 *
 * @version v2.0
 */
public interface IAccbatService  {
    
    Accbat save(Accbat o);

	Accbat getByUid(String uid);

	boolean delete(Accbat o);

	PageResult<Accbat> query(Accbat accbat, Pageable pageable);
     
     void deletes(String uids);
}
package org.esy.pur.service;

import org.esy.pur.entity.Venchkbat;
import org.esy.base.dao.core.PageResult;
import org.springframework.data.domain.Pageable;

/**
 * @author <a href="mailto:ardui@163.com">ardui</a>
 * @date Wed Aug 05 14:12:48 CST 2020
 *
 * @version v2.0
 */
public interface IVenchkbatService  {
    
    Venchkbat save(Venchkbat o);

	Venchkbat getByUid(String uid);

	boolean delete(Venchkbat o);

	PageResult<Venchkbat> query(Venchkbat venchkbat, Pageable pageable);
     
     void deletes(String uids);
}
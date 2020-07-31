package org.esy.mak.service;

import org.esy.mak.entity.Makbat;
import org.esy.base.dao.core.PageResult;
import org.springframework.data.domain.Pageable;

/**
 * @author <a href="mailto:ardui@163.com">ardui</a>
 * @date Fri Jul 31 14:34:04 CST 2020
 *
 * @version v2.0
 */
public interface IMakbatService  {
    
    Makbat save(Makbat o);

	Makbat getByUid(String uid);

	boolean delete(Makbat o);

	PageResult<Makbat> query(Makbat makbat, Pageable pageable);
     
     void deletes(String uids);
}
package org.esy.mak.service;

import org.esy.mak.entity.Makbat1;
import org.esy.base.dao.core.PageResult;
import org.springframework.data.domain.Pageable;

/**
 * @author <a href="mailto:ardui@163.com">ardui</a>
 * @date Fri Jul 31 14:34:25 CST 2020
 *
 * @version v2.0
 */
public interface IMakbat1Service  {
    
    Makbat1 save(Makbat1 o);

	Makbat1 getByUid(String uid);

	boolean delete(Makbat1 o);

	PageResult<Makbat1> query(Makbat1 makbat1, Pageable pageable);
     
     void deletes(String uids);
}
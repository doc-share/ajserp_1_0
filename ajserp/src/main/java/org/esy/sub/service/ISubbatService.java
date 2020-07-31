package org.esy.sub.service;

import org.esy.sub.entity.Subbat;
import org.esy.base.dao.core.PageResult;
import org.springframework.data.domain.Pageable;

/**
 * @author <a href="mailto:ardui@163.com">ardui</a>
 * @date Fri Jul 31 09:39:52 CST 2020
 *
 * @version v2.0
 */
public interface ISubbatService  {
    
    Subbat save(Subbat o);

	Subbat getByUid(String uid);

	boolean delete(Subbat o);

	PageResult<Subbat> query(Subbat subbat, Pageable pageable);
     
     void deletes(String uids);
}
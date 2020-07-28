package org.esy.pur.service;

import org.esy.pur.entity.Purbah;
import org.esy.base.dao.core.PageResult;
import org.springframework.data.domain.Pageable;

/**
 * @author <a href="mailto:ardui@163.com">ardui</a>
 * @date Tue Jul 28 17:08:52 CST 2020
 *
 * @version v2.0
 */
public interface IPurbahService  {
    
    Purbah save(Purbah o);

	Purbah getByUid(String uid);

	boolean delete(Purbah o);

	PageResult<Purbah> query(Purbah purbah, Pageable pageable);
     
     void deletes(String uids);
}
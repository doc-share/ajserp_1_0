package org.esy.pur.service;

import org.esy.pur.entity.Purbat;
import org.esy.base.dao.core.PageResult;
import org.springframework.data.domain.Pageable;

/**
 * @author <a href="mailto:ardui@163.com">ardui</a>
 * @date Wed Jul 29 09:44:56 CST 2020
 *
 * @version v2.0
 */
public interface IPurbatService  {
    
    Purbat save(Purbat o);

	Purbat getByUid(String uid);

	boolean delete(Purbat o);

	PageResult<Purbat> query(Purbat purbat, Pageable pageable);
     
     void deletes(String uids);
}
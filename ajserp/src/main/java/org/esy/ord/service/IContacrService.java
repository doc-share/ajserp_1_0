package org.esy.ord.service;

import org.esy.ord.entity.Contacr;
import org.esy.base.dao.core.PageResult;
import org.springframework.data.domain.Pageable;

/**
 * @author <a href="mailto:ardui@163.com">ardui</a>
 * @date Tue Jun 23 11:11:27 CST 2020
 *
 * @version v2.0
 */
public interface IContacrService  {
    
    Contacr save(Contacr o);

	Contacr getByUid(String uid);

	boolean delete(Contacr o);

	PageResult<Contacr> query(Contacr contacr, Pageable pageable);
     
     void deletes(String uids);
}
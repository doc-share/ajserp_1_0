package org.esy.acc.service;

import org.esy.acc.entity.Acccd;
import org.esy.base.dao.core.PageResult;
import org.springframework.data.domain.Pageable;

/**
 * @author <a href="mailto:ardui@163.com">ardui</a>
 * @date Sat Jun 20 08:54:05 CST 2020
 *
 * @version v2.0
 */
public interface IAcccdService  {
    
    Acccd save(Acccd o);

	Acccd getByUid(String uid);

	boolean delete(Acccd o);

	PageResult<Acccd> query(Acccd acccd, Pageable pageable);
     
     void deletes(String uids);
}
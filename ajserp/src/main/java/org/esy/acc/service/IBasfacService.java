package org.esy.acc.service;

import org.esy.acc.entity.Basfac;
import org.esy.base.dao.core.PageResult;
import org.springframework.data.domain.Pageable;

/**
 * @author <a href="mailto:ardui@163.com">ardui</a>
 * @date Tue Jun 23 10:59:23 CST 2020
 *
 * @version v2.0
 */
public interface IBasfacService  {
    
    Basfac save(Basfac o);

	Basfac getByUid(String uid);

	boolean delete(Basfac o);

	PageResult<Basfac> query(Basfac basfac, Pageable pageable);
     
     void deletes(String uids);
}
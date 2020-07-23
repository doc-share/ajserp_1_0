package org.esy.bas.service;

import org.esy.bas.entity.Bastype;
import org.esy.base.dao.core.PageResult;
import org.springframework.data.domain.Pageable;

/**
 * @author <a href="mailto:ardui@163.com">ardui</a>
 * @date Thu Jul 23 13:17:38 CST 2020
 *
 * @version v2.0
 */
public interface IBastypeService  {
    
    Bastype save(Bastype o);

	Bastype getByUid(String uid);

	boolean delete(Bastype o);

	PageResult<Bastype> query(Bastype bastype, Pageable pageable);
     
     void deletes(String uids);
}
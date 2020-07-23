package org.esy.bas.service;

import org.esy.bas.entity.Accdept;
import org.esy.base.dao.core.PageResult;
import org.springframework.data.domain.Pageable;

/**
 * @author <a href="mailto:ardui@163.com">ardui</a>
 * @date Thu Jul 23 13:03:27 CST 2020
 *
 * @version v2.0
 */
public interface IAccdeptService  {
    
    Accdept save(Accdept o);

	Accdept getByUid(String uid);

	boolean delete(Accdept o);

	PageResult<Accdept> query(Accdept accdept, Pageable pageable);
     
     void deletes(String uids);
}
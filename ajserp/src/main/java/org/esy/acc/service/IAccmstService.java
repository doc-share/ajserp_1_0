package org.esy.acc.service;

import org.esy.acc.entity.Accmst;
import org.esy.base.dao.core.PageResult;
import org.springframework.data.domain.Pageable;

/**
 * @author <a href="mailto:ardui@163.com">ardui</a>
 * @date Sat Jun 20 09:12:51 CST 2020
 *
 * @version v2.0
 */
public interface IAccmstService  {
    
    Accmst save(Accmst o);

	Accmst getByUid(String uid);

	boolean delete(Accmst o);

	PageResult<Accmst> query(Accmst accmst, Pageable pageable);
     
     void deletes(String uids);
}
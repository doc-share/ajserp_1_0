package org.esy.acc.service;

import org.esy.acc.entity.Accmst1;
import org.esy.base.dao.core.PageResult;
import org.springframework.data.domain.Pageable;

/**
 * @author <a href="mailto:ardui@163.com">ardui</a>
 * @date Fri Jul 31 15:45:24 CST 2020
 *
 * @version v2.0
 */
public interface IAccmst1Service  {
    
    Accmst1 save(Accmst1 o);

	Accmst1 getByUid(String uid);

	boolean delete(Accmst1 o);

	PageResult<Accmst1> query(Accmst1 accmst1, Pageable pageable);
     
     void deletes(String uids);
}
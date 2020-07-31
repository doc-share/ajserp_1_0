package org.esy.acc.service;

import org.esy.acc.entity.Accmst2;
import org.esy.base.dao.core.PageResult;
import org.springframework.data.domain.Pageable;

/**
 * @author <a href="mailto:ardui@163.com">ardui</a>
 * @date Fri Jul 31 15:45:52 CST 2020
 *
 * @version v2.0
 */
public interface IAccmst2Service  {
    
    Accmst2 save(Accmst2 o);

	Accmst2 getByUid(String uid);

	boolean delete(Accmst2 o);

	PageResult<Accmst2> query(Accmst2 accmst2, Pageable pageable);
     
     void deletes(String uids);
}
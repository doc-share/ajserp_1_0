package org.esy.bas.service;

import org.esy.bas.entity.Bassal;
import org.esy.base.dao.core.PageResult;
import org.springframework.data.domain.Pageable;

/**
 * @author <a href="mailto:ardui@163.com">ardui</a>
 * @date Thu Jul 23 13:06:35 CST 2020
 *
 * @version v2.0
 */
public interface IBassalService  {
    
    Bassal save(Bassal o);

	Bassal getByUid(String uid);

	boolean delete(Bassal o);

	PageResult<Bassal> query(Bassal bassal, Pageable pageable);
     
     void deletes(String uids);
}
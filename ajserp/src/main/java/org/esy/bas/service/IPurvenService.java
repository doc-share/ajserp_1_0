package org.esy.bas.service;

import org.esy.bas.entity.Purven;
import org.esy.base.dao.core.PageResult;
import org.springframework.data.domain.Pageable;

/**
 * @author <a href="mailto:ardui@163.com">ardui</a>
 * @date Fri Jul 24 09:29:45 CST 2020
 *
 * @version v2.0
 */
public interface IPurvenService  {
    
    Purven save(Purven o);

	Purven getByUid(String uid);

	boolean delete(Purven o);

	PageResult<Purven> query(Purven purven, Pageable pageable);
     
     void deletes(String uids);
}
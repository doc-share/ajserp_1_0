package org.esy.bas.service;

import org.esy.bas.entity.Bascoin;
import org.esy.base.dao.core.PageResult;
import org.springframework.data.domain.Pageable;

/**
 * @author <a href="mailto:ardui@163.com">ardui</a>
 * @date Thu Jul 23 14:48:07 CST 2020
 *
 * @version v2.0
 */
public interface IBascoinService  {
    
    Bascoin save(Bascoin o);

	Bascoin getByUid(String uid);

	boolean delete(Bascoin o);

	PageResult<Bascoin> query(Bascoin bascoin, Pageable pageable);
     
     void deletes(String uids);
}
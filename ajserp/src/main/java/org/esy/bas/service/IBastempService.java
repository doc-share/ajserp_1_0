package org.esy.bas.service;

import org.esy.bas.entity.Bastemp;
import org.esy.base.dao.core.PageResult;
import org.springframework.data.domain.Pageable;

/**
 * @author <a href="mailto:ardui@163.com">ardui</a>
 * @date Fri Jun 19 11:53:17 CST 2020
 *
 * @version v2.0
 */
public interface IBastempService  {
    
    Bastemp save(Bastemp o);

	Bastemp getByUid(String uid);

	boolean delete(Bastemp o);

	PageResult<Bastemp> query(Bastemp bastemp, Pageable pageable);
     
     void deletes(String uids);
}
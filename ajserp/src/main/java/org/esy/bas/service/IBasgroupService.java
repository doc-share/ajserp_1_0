package org.esy.bas.service;

import org.esy.bas.entity.Basgroup;
import org.esy.base.dao.core.PageResult;
import org.springframework.data.domain.Pageable;

/**
 * @author <a href="mailto:ardui@163.com">ardui</a>
 * @date Fri Jun 19 13:53:11 CST 2020
 *
 * @version v2.0
 */
public interface IBasgroupService  {
    
    Basgroup save(Basgroup o);

	Basgroup getByUid(String uid);

	boolean delete(Basgroup o);

	PageResult<Basgroup> query(Basgroup basgroup, Pageable pageable);
     
     void deletes(String uids);
}
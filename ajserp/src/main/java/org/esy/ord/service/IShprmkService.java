package org.esy.ord.service;

import org.esy.ord.entity.Shprmk;
import org.esy.base.dao.core.PageResult;
import org.springframework.data.domain.Pageable;

/**
 * @author <a href="mailto:ardui@163.com">ardui</a>
 * @date Tue Jul 28 15:23:53 CST 2020
 *
 * @version v2.0
 */
public interface IShprmkService  {
    
    Shprmk save(Shprmk o);

	Shprmk getByUid(String uid);

	boolean delete(Shprmk o);

	PageResult<Shprmk> query(Shprmk shprmk, Pageable pageable);
     
     void deletes(String uids);
}
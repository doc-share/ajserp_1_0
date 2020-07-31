package org.esy.sub.service;

import org.esy.sub.entity.view.Oembahv;
import org.esy.base.dao.core.PageResult;
import org.springframework.data.domain.Pageable;

/**
 * @author <a href="mailto:ardui@163.com">ardui</a>
 * @date Fri Jul 31 16:30:25 CST 2020
 *
 * @version v2.0
 */
public interface IOembahService  {
    
    Oembahv save(Oembahv o);

	Oembahv getByUid(String uid);

	boolean delete(Oembahv o);

	PageResult<Oembahv> query(Oembahv oembahv, Pageable pageable);
     
     void deletes(String uids);
}
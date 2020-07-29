package org.esy.acr.service;

import org.esy.acr.entity.view.Acrbahv;
import org.esy.base.dao.core.PageResult;
import org.springframework.data.domain.Pageable;

/**
 * @author <a href="mailto:ardui@163.com">ardui</a>
 * @date Wed Jul 29 17:15:14 CST 2020
 *
 * @version v2.0
 */
public interface IAcrbahService  {
    
    Acrbahv save(Acrbahv o);

	Acrbahv getByUid(String uid);

	boolean delete(Acrbahv o);

	PageResult<Acrbahv> query(Acrbahv acrbahv, Pageable pageable);
     
     void deletes(String uids);
}
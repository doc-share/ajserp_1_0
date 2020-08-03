package org.esy.inv.service;

import org.esy.inv.entity.view.Antbahv;
import org.esy.base.dao.core.PageResult;
import org.springframework.data.domain.Pageable;

/**
 * @author <a href="mailto:ardui@163.com">ardui</a>
 * @date Mon Aug 03 08:52:39 CST 2020
 *
 * @version v2.0
 */
public interface IAntbahService  {
    
    Antbahv save(Antbahv o);

	Antbahv getByUid(String uid);

	boolean delete(Antbahv o);

	PageResult<Antbahv> query(Antbahv antbahv, Pageable pageable);
     
     void deletes(String uids);
}
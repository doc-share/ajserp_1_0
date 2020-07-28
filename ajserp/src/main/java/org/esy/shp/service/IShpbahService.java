package org.esy.shp.service;

import org.esy.shp.entity.view.Shpbahv;
import org.esy.base.dao.core.PageResult;
import org.springframework.data.domain.Pageable;

/**
 * @author <a href="mailto:ardui@163.com">ardui</a>
 * @date Tue Jul 28 13:56:29 CST 2020
 *
 * @version v2.0
 */
public interface IShpbahService  {
    
    Shpbahv save(Shpbahv o);

	Shpbahv getByUid(String uid);

	boolean delete(Shpbahv o);

	PageResult<Shpbahv> query(Shpbahv shpbahv, Pageable pageable);
     
     void deletes(String uids);
}
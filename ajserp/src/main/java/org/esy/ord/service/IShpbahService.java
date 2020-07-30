package org.esy.ord.service;

import org.esy.ord.entity.view.Shpbahv;
import org.esy.base.dao.core.PageResult;
import org.springframework.data.domain.Pageable;

/**
 * @author <a href="mailto:ardui@163.com">ardui</a>
 * @date Thu Jul 30 08:48:00 CST 2020
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
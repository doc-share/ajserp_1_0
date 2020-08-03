package org.esy.inv.service;

import org.esy.inv.entity.view.Trnbahv;
import org.esy.base.dao.core.PageResult;
import org.springframework.data.domain.Pageable;

/**
 * @author <a href="mailto:ardui@163.com">ardui</a>
 * @date Mon Aug 03 09:09:25 CST 2020
 *
 * @version v2.0
 */
public interface ITrnbahService  {
    
    Trnbahv save(Trnbahv o);

	Trnbahv getByUid(String uid);

	boolean delete(Trnbahv o);

	PageResult<Trnbahv> query(Trnbahv trnbahv, Pageable pageable);
     
     void deletes(String uids);
}
package org.esy.pur.service;

import org.esy.pur.entity.view.Venchkbahv;
import org.esy.base.dao.core.PageResult;
import org.springframework.data.domain.Pageable;

/**
 * @author <a href="mailto:ardui@163.com">ardui</a>
 * @date Wed Aug 05 14:12:46 CST 2020
 *
 * @version v2.0
 */
public interface IVenchkbahService  {
    
    Venchkbahv save(Venchkbahv o);

	Venchkbahv getByUid(String uid);

	boolean delete(Venchkbahv o);

	PageResult<Venchkbahv> query(Venchkbahv venchkbahv, Pageable pageable);
     
     void deletes(String uids);
}
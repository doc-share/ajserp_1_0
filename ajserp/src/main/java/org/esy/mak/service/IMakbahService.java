package org.esy.mak.service;

import org.esy.mak.entity.view.Makbahv;
import org.esy.base.dao.core.PageResult;
import org.springframework.data.domain.Pageable;

/**
 * @author <a href="mailto:ardui@163.com">ardui</a>
 * @date Fri Jul 31 14:33:59 CST 2020
 *
 * @version v2.0
 */
public interface IMakbahService  {
    
    Makbahv save(Makbahv o);

	Makbahv getByUid(String uid);

	boolean delete(Makbahv o);

	PageResult<Makbahv> query(Makbahv makbahv, Pageable pageable);
     
     void deletes(String uids);
}
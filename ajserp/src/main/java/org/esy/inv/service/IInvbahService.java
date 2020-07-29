package org.esy.inv.service;

import org.esy.inv.entity.view.Invbahv;
import org.esy.base.dao.core.PageResult;
import org.springframework.data.domain.Pageable;

/**
 * @author <a href="mailto:ardui@163.com">ardui</a>
 * @date Wed Jul 29 14:57:38 CST 2020
 *
 * @version v2.0
 */
public interface IInvbahService  {
    
    Invbahv save(Invbahv o);

	Invbahv getByUid(String uid);

	boolean delete(Invbahv o);

	PageResult<Invbahv> query(Invbahv invbahv, Pageable pageable);
     
     void deletes(String uids);
}
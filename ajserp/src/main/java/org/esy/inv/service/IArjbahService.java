package org.esy.inv.service;

import org.esy.inv.entity.view.Arjbahv;
import org.esy.base.dao.core.PageResult;
import org.springframework.data.domain.Pageable;

/**
 * @author <a href="mailto:ardui@163.com">ardui</a>
 * @date Fri Jul 31 17:24:35 CST 2020
 *
 * @version v2.0
 */
public interface IArjbahService  {
    
    Arjbahv save(Arjbahv o);

	Arjbahv getByUid(String uid);

	boolean delete(Arjbahv o);

	PageResult<Arjbahv> query(Arjbahv arjbahv, Pageable pageable);
     
     void deletes(String uids);
}
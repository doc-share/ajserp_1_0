package org.esy.acc.service;

import org.esy.acc.entity.view.Accbahv;
import org.esy.base.dao.core.PageResult;
import org.springframework.data.domain.Pageable;

/**
 * @author <a href="mailto:ardui@163.com">ardui</a>
 * @date Sat Jun 20 09:44:01 CST 2020
 *
 * @version v2.0
 */
public interface IAccbahService  {
    
    Accbahv save(Accbahv o);

	Accbahv getByUid(String uid);

	boolean delete(Accbahv o);

	PageResult<Accbahv> query(Accbahv accbahv, Pageable pageable);
     
     void deletes(String uids);
}
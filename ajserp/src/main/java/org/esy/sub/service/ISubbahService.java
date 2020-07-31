package org.esy.sub.service;

import org.esy.sub.entity.view.Subbahv;
import org.esy.base.dao.core.PageResult;
import org.springframework.data.domain.Pageable;

/**
 * @author <a href="mailto:ardui@163.com">ardui</a>
 * @date Fri Jul 31 09:40:02 CST 2020
 *
 * @version v2.0
 */
public interface ISubbahService  {
    
    Subbahv save(Subbahv o);

	Subbahv getByUid(String uid);

	boolean delete(Subbahv o);

	PageResult<Subbahv> query(Subbahv subbahv, Pageable pageable);
     
     void deletes(String uids);
}
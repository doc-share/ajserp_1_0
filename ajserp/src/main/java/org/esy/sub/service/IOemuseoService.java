package org.esy.sub.service;

import org.esy.sub.entity.Oemuseo;
import org.esy.base.dao.core.PageResult;
import org.springframework.data.domain.Pageable;

/**
 * @author <a href="mailto:ardui@163.com">ardui</a>
 * @date Fri Jul 31 16:30:37 CST 2020
 *
 * @version v2.0
 */
public interface IOemuseoService  {
    
    Oemuseo save(Oemuseo o);

	Oemuseo getByUid(String uid);

	boolean delete(Oemuseo o);

	PageResult<Oemuseo> query(Oemuseo oemuseo, Pageable pageable);
     
     void deletes(String uids);
}
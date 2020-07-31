package org.esy.sub.service;

import org.esy.sub.entity.Oembat;
import org.esy.base.dao.core.PageResult;
import org.springframework.data.domain.Pageable;

/**
 * @author <a href="mailto:ardui@163.com">ardui</a>
 * @date Fri Jul 31 16:30:33 CST 2020
 *
 * @version v2.0
 */
public interface IOembatService  {
    
    Oembat save(Oembat o);

	Oembat getByUid(String uid);

	boolean delete(Oembat o);

	PageResult<Oembat> query(Oembat oembat, Pageable pageable);
     
     void deletes(String uids);
}
package org.esy.acr.service;

import org.esy.acr.entity.Acrbat;
import org.esy.base.dao.core.PageResult;
import org.springframework.data.domain.Pageable;

/**
 * @author <a href="mailto:ardui@163.com">ardui</a>
 * @date Sat Jun 20 09:44:17 CST 2020
 *
 * @version v2.0
 */
public interface IAcrbatService  {
    
    Acrbat save(Acrbat o);

	Acrbat getByUid(String uid);

	boolean delete(Acrbat o);

	PageResult<Acrbat> query(Acrbat acrbat, Pageable pageable);
     
     void deletes(String uids);
}
package org.esy.ord.service;

import org.esy.ord.entity.Quobat;
import org.esy.base.dao.core.PageResult;
import org.springframework.data.domain.Pageable;

/**
 * @author <a href="mailto:ardui@163.com">ardui</a>
 * @date Mon Jul 27 15:34:25 CST 2020
 *
 * @version v2.0
 */
public interface IQuobatService  {
    
    Quobat save(Quobat o);

	Quobat getByUid(String uid);

	boolean delete(Quobat o);

	PageResult<Quobat> query(Quobat quobat, Pageable pageable);
     
     void deletes(String uids);
}
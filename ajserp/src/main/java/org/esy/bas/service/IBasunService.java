package org.esy.bas.service;

import org.esy.bas.entity.Basun;
import org.esy.base.dao.core.PageResult;
import org.springframework.data.domain.Pageable;

/**
 * @author <a href="mailto:ardui@163.com">ardui</a>
 * @date Thu Jul 23 12:03:47 CST 2020
 *
 * @version v2.0
 */
public interface IBasunService  {
    
    Basun save(Basun o);

	Basun getByUid(String uid);

	boolean delete(Basun o);

	PageResult<Basun> query(Basun basun, Pageable pageable);
     
     void deletes(String uids);
}
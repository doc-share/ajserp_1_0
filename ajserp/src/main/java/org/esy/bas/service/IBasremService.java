package org.esy.bas.service;

import org.esy.bas.entity.Basrem;
import org.esy.base.dao.core.PageResult;
import org.springframework.data.domain.Pageable;

/**
 * @author <a href="mailto:ardui@163.com">ardui</a>
 * @date Thu Jul 23 13:41:03 CST 2020
 *
 * @version v2.0
 */
public interface IBasremService  {
    
    Basrem save(Basrem o);

	Basrem getByUid(String uid);

	boolean delete(Basrem o);

	PageResult<Basrem> query(Basrem basrem, Pageable pageable);
     
     void deletes(String uids);
}
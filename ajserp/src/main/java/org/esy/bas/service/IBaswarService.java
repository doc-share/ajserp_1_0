package org.esy.bas.service;

import org.esy.bas.entity.Baswar;
import org.esy.base.dao.core.PageResult;
import org.springframework.data.domain.Pageable;

/**
 * @author <a href="mailto:ardui@163.com">ardui</a>
 * @date Thu Jul 23 14:10:56 CST 2020
 *
 * @version v2.0
 */
public interface IBaswarService  {
    
    Baswar save(Baswar o);

	Baswar getByUid(String uid);

	boolean delete(Baswar o);

	PageResult<Baswar> query(Baswar baswar, Pageable pageable);
     
     void deletes(String uids);
}
package org.esy.bas.service;

import org.esy.bas.entity.Basword;
import org.esy.base.dao.core.PageResult;
import org.springframework.data.domain.Pageable;

/**
 * @author <a href="mailto:ardui@163.com">ardui</a>
 * @date Thu Jul 23 15:30:37 CST 2020
 *
 * @version v2.0
 */
public interface IBaswordService  {
    
    Basword save(Basword o);

	Basword getByUid(String uid);

	boolean delete(Basword o);

	PageResult<Basword> query(Basword basword, Pageable pageable);
     
     void deletes(String uids);
}
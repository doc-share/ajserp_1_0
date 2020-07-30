package org.esy.bas.service;

import org.esy.bas.entity.Basbank;
import org.esy.base.dao.core.PageResult;
import org.springframework.data.domain.Pageable;

/**
 * @author <a href="mailto:ardui@163.com">ardui</a>
 * @date Thu Jul 30 10:23:44 CST 2020
 *
 * @version v2.0
 */
public interface IBasbankService  {
    
    Basbank save(Basbank o);

	Basbank getByUid(String uid);

	boolean delete(Basbank o);

	PageResult<Basbank> query(Basbank basbank, Pageable pageable);
     
     void deletes(String uids);
}
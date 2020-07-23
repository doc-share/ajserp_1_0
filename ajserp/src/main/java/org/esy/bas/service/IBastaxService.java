package org.esy.bas.service;

import org.esy.bas.entity.Bastax;
import org.esy.base.dao.core.PageResult;
import org.springframework.data.domain.Pageable;

/**
 * @author <a href="mailto:ardui@163.com">ardui</a>
 * @date Thu Jul 23 14:17:18 CST 2020
 *
 * @version v2.0
 */
public interface IBastaxService  {
    
    Bastax save(Bastax o);

	Bastax getByUid(String uid);

	boolean delete(Bastax o);

	PageResult<Bastax> query(Bastax bastax, Pageable pageable);
     
     void deletes(String uids);
}
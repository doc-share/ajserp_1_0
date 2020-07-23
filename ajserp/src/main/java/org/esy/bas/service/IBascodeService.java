package org.esy.bas.service;

import org.esy.bas.entity.Bascode;
import org.esy.base.dao.core.PageResult;
import org.springframework.data.domain.Pageable;

/**
 * @author <a href="mailto:ardui@163.com">ardui</a>
 * @date Thu Jul 23 13:25:39 CST 2020
 *
 * @version v2.0
 */
public interface IBascodeService  {
    
    Bascode save(Bascode o);

	Bascode getByUid(String uid);

	boolean delete(Bascode o);

	PageResult<Bascode> query(Bascode bascode, Pageable pageable);
     
     void deletes(String uids);
}
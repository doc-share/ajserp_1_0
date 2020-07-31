package org.esy.sub.service;

import org.esy.sub.entity.Subuseo;
import org.esy.base.dao.core.PageResult;
import org.springframework.data.domain.Pageable;

/**
 * @author <a href="mailto:ardui@163.com">ardui</a>
 * @date Fri Jul 31 09:40:26 CST 2020
 *
 * @version v2.0
 */
public interface ISubuseoService  {
    
    Subuseo save(Subuseo o);

	Subuseo getByUid(String uid);

	boolean delete(Subuseo o);

	PageResult<Subuseo> query(Subuseo subuseo, Pageable pageable);
     
     void deletes(String uids);
}
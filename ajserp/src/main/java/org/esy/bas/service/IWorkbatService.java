package org.esy.bas.service;

import org.esy.bas.entity.Workbat;
import org.esy.base.dao.core.PageResult;
import org.springframework.data.domain.Pageable;

/**
 * @author <a href="mailto:ardui@163.com">ardui</a>
 * @date Fri Jun 19 15:10:39 CST 2020
 *
 * @version v2.0
 */
public interface IWorkbatService  {
    
    Workbat save(Workbat o);

	Workbat getByUid(String uid);

	boolean delete(Workbat o);

	PageResult<Workbat> query(Workbat workbat, Pageable pageable);
     
     void deletes(String uids);
}
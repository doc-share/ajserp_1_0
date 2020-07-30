package org.esy.ivc.service;

import org.esy.ivc.entity.Oivcbat;
import org.esy.base.dao.core.PageResult;
import org.springframework.data.domain.Pageable;

/**
 * @author <a href="mailto:ardui@163.com">ardui</a>
 * @date Thu Jul 30 14:45:56 CST 2020
 *
 * @version v2.0
 */
public interface IOivcbatService  {
    
    Oivcbat save(Oivcbat o);

	Oivcbat getByUid(String uid);

	boolean delete(Oivcbat o);

	PageResult<Oivcbat> query(Oivcbat oivcbat, Pageable pageable);
     
     void deletes(String uids);
}
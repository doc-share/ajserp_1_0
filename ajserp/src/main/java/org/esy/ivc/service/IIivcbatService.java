package org.esy.ivc.service;

import org.esy.ivc.entity.Iivcbat;
import org.esy.base.dao.core.PageResult;
import org.springframework.data.domain.Pageable;

/**
 * @author <a href="mailto:ardui@163.com">ardui</a>
 * @date Thu Jul 30 16:25:04 CST 2020
 *
 * @version v2.0
 */
public interface IIivcbatService  {
    
    Iivcbat save(Iivcbat o);

	Iivcbat getByUid(String uid);

	boolean delete(Iivcbat o);

	PageResult<Iivcbat> query(Iivcbat iivcbat, Pageable pageable);
     
     void deletes(String uids);
}
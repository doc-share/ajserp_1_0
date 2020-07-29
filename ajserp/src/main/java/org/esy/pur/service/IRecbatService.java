package org.esy.pur.service;

import org.esy.pur.entity.Recbat;
import org.esy.base.dao.core.PageResult;
import org.springframework.data.domain.Pageable;

/**
 * @author <a href="mailto:ardui@163.com">ardui</a>
 * @date Wed Jul 29 11:40:38 CST 2020
 *
 * @version v2.0
 */
public interface IRecbatService  {
    
    Recbat save(Recbat o);

	Recbat getByUid(String uid);

	boolean delete(Recbat o);

	PageResult<Recbat> query(Recbat recbat, Pageable pageable);
     
     void deletes(String uids);
}
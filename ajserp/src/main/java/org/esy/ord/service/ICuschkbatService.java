package org.esy.ord.service;

import org.esy.ord.entity.Cuschkbat;
import org.esy.base.dao.core.PageResult;
import org.springframework.data.domain.Pageable;

/**
 * @author <a href="mailto:ardui@163.com">ardui</a>
 * @date Wed Aug 05 11:46:37 CST 2020
 *
 * @version v2.0
 */
public interface ICuschkbatService  {
    
    Cuschkbat save(Cuschkbat o);

	Cuschkbat getByUid(String uid);

	boolean delete(Cuschkbat o);

	PageResult<Cuschkbat> query(Cuschkbat cuschkbat, Pageable pageable);
     
     void deletes(String uids);
}
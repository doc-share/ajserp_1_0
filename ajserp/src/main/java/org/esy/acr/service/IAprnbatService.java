package org.esy.acr.service;

import org.esy.acr.entity.Aprnbat;
import org.esy.base.dao.core.PageResult;
import org.springframework.data.domain.Pageable;

/**
 * @author <a href="mailto:ardui@163.com">ardui</a>
 * @date Tue Jun 23 11:02:07 CST 2020
 *
 * @version v2.0
 */
public interface IAprnbatService  {
    
    Aprnbat save(Aprnbat o);

	Aprnbat getByUid(String uid);

	boolean delete(Aprnbat o);

	PageResult<Aprnbat> query(Aprnbat aprnbat, Pageable pageable);
     
     void deletes(String uids);
}
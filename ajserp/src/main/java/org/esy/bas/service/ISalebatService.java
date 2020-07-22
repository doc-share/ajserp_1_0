package org.esy.bas.service;

import org.esy.bas.entity.Salebat;
import org.esy.base.dao.core.PageResult;
import org.springframework.data.domain.Pageable;

/**
 * @author <a href="mailto:ardui@163.com">ardui</a>
 * @date Wed Jun 24 13:15:44 CST 2020
 *
 * @version v2.0
 */
public interface ISalebatService  {
    
    Salebat save(Salebat o);

	Salebat getByUid(String uid);

	boolean delete(Salebat o);

	PageResult<Salebat> query(Salebat salebat, Pageable pageable);
     
     void deletes(String uids);
}
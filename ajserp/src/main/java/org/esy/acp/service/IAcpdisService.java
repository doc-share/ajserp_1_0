package org.esy.acp.service;

import org.esy.acp.entity.Acpdis;
import org.esy.base.dao.core.PageResult;
import org.springframework.data.domain.Pageable;

/**
 * @author <a href="mailto:ardui@163.com">ardui</a>
 * @date Thu Jul 30 09:45:23 CST 2020
 *
 * @version v2.0
 */
public interface IAcpdisService  {
    
    Acpdis save(Acpdis o);

	Acpdis getByUid(String uid);

	boolean delete(Acpdis o);

	PageResult<Acpdis> query(Acpdis acpdis, Pageable pageable);
     
     void deletes(String uids);
}
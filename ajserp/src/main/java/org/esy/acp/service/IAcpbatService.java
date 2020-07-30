package org.esy.acp.service;

import org.esy.acp.entity.Acpbat;
import org.esy.base.dao.core.PageResult;
import org.springframework.data.domain.Pageable;

/**
 * @author <a href="mailto:ardui@163.com">ardui</a>
 * @date Thu Jul 30 09:45:02 CST 2020
 *
 * @version v2.0
 */
public interface IAcpbatService  {
    
    Acpbat save(Acpbat o);

	Acpbat getByUid(String uid);

	boolean delete(Acpbat o);

	PageResult<Acpbat> query(Acpbat acpbat, Pageable pageable);
     
     void deletes(String uids);
}
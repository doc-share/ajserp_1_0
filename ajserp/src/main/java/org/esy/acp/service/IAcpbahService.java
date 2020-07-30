package org.esy.acp.service;

import org.esy.acp.entity.view.Acpbahv;
import org.esy.base.dao.core.PageResult;
import org.springframework.data.domain.Pageable;

/**
 * @author <a href="mailto:ardui@163.com">ardui</a>
 * @date Thu Jul 30 09:44:42 CST 2020
 *
 * @version v2.0
 */
public interface IAcpbahService  {
    
    Acpbahv save(Acpbahv o);

	Acpbahv getByUid(String uid);

	boolean delete(Acpbahv o);

	PageResult<Acpbahv> query(Acpbahv acpbahv, Pageable pageable);
     
     void deletes(String uids);
}
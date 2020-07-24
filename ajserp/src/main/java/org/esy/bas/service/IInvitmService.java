package org.esy.bas.service;

import org.esy.bas.entity.Invitm;
import org.esy.base.dao.core.PageResult;
import org.springframework.data.domain.Pageable;

/**
 * @author <a href="mailto:ardui@163.com">ardui</a>
 * @date Fri Jul 24 11:01:41 CST 2020
 *
 * @version v2.0
 */
public interface IInvitmService  {
    
    Invitm save(Invitm o);

	Invitm getByUid(String uid);

	boolean delete(Invitm o);

	PageResult<Invitm> query(Invitm invitm, Pageable pageable);
     
     void deletes(String uids);
}
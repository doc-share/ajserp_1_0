package org.esy.ivc.service;

import org.esy.ivc.entity.view.Oivcbahv;
import org.esy.base.dao.core.PageResult;
import org.springframework.data.domain.Pageable;

/**
 * @author <a href="mailto:ardui@163.com">ardui</a>
 * @date Thu Jul 30 14:46:11 CST 2020
 *
 * @version v2.0
 */
public interface IOivcbahService  {
    
    Oivcbahv save(Oivcbahv o);

	Oivcbahv getByUid(String uid);

	boolean delete(Oivcbahv o);

	PageResult<Oivcbahv> query(Oivcbahv oivcbahv, Pageable pageable);
     
     void deletes(String uids);
}
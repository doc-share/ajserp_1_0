package org.esy.ivc.service;

import org.esy.ivc.entity.view.Iivcbahv;
import org.esy.base.dao.core.PageResult;
import org.springframework.data.domain.Pageable;

/**
 * @author <a href="mailto:ardui@163.com">ardui</a>
 * @date Thu Jul 30 16:25:13 CST 2020
 *
 * @version v2.0
 */
public interface IIivcbahService  {
    
    Iivcbahv save(Iivcbahv o);

	Iivcbahv getByUid(String uid);

	boolean delete(Iivcbahv o);

	PageResult<Iivcbahv> query(Iivcbahv iivcbahv, Pageable pageable);
     
     void deletes(String uids);
}
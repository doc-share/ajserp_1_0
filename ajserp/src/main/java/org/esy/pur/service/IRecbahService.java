package org.esy.pur.service;

import org.esy.pur.entity.view.Recbahv;
import org.esy.base.dao.core.PageResult;
import org.springframework.data.domain.Pageable;

/**
 * @author <a href="mailto:ardui@163.com">ardui</a>
 * @date Wed Jul 29 11:40:25 CST 2020
 *
 * @version v2.0
 */
public interface IRecbahService  {
    
    Recbahv save(Recbahv o);

	Recbahv getByUid(String uid);

	boolean delete(Recbahv o);

	PageResult<Recbahv> query(Recbahv recbahv, Pageable pageable);
     
     void deletes(String uids);
}
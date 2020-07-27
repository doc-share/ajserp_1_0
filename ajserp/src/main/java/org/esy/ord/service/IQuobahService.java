package org.esy.ord.service;

import org.esy.ord.entity.view.Quobahv;
import org.esy.base.dao.core.PageResult;
import org.springframework.data.domain.Pageable;

/**
 * @author <a href="mailto:ardui@163.com">ardui</a>
 * @date Mon Jul 27 15:15:17 CST 2020
 *
 * @version v2.0
 */
public interface IQuobahService  {
    
    Quobahv save(Quobahv o);

	Quobahv getByUid(String uid);

	boolean delete(Quobahv o);

	PageResult<Quobahv> query(Quobahv quobahv, Pageable pageable);
     
     void deletes(String uids);
}
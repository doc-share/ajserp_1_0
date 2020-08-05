package org.esy.ord.service;

import org.esy.ord.entity.view.Cuschkbahv;
import org.esy.base.dao.core.PageResult;
import org.springframework.data.domain.Pageable;

/**
 * @author <a href="mailto:ardui@163.com">ardui</a>
 * @date Wed Aug 05 11:46:33 CST 2020
 *
 * @version v2.0
 */
public interface ICuschkbahService  {
    
    Cuschkbahv save(Cuschkbahv o);

	Cuschkbahv getByUid(String uid);

	boolean delete(Cuschkbahv o);

	PageResult<Cuschkbahv> query(Cuschkbahv cuschkbahv, Pageable pageable);
     
     void deletes(String uids);
}
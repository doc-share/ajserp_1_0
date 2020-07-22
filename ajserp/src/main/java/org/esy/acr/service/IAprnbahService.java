package org.esy.acr.service;

import org.esy.acr.entity.Aprnbah;
import org.esy.acr.entity.view.Aprnbahv;
import org.esy.base.dao.core.PageResult;
import org.springframework.data.domain.Pageable;

/**
 * @author <a href="mailto:ardui@163.com">ardui</a>
 * @date Fri Jun 19 16:27:16 CST 2020
 *
 * @version v2.0
 */
public interface IAprnbahService  {
    
	Aprnbahv save(Aprnbahv o);

	Aprnbahv getByUid(String uid);

	boolean delete(Aprnbahv o);

	PageResult<Aprnbahv> query(Aprnbahv aprnbah, Pageable pageable);
     
     void deletes(String uids);
}
package org.esy.bas.service;

import org.esy.bas.entity.Pnlemp;
import org.esy.base.dao.core.PageResult;
import org.springframework.data.domain.Pageable;

/**
 * @author <a href="mailto:ardui@163.com">ardui</a>
 * @date Thu Jul 23 15:09:54 CST 2020
 *
 * @version v2.0
 */
public interface IPnlempService  {
    
    Pnlemp save(Pnlemp o);

	Pnlemp getByUid(String uid);

	boolean delete(Pnlemp o);

	PageResult<Pnlemp> query(Pnlemp pnlemp, Pageable pageable);
     
     void deletes(String uids);
}
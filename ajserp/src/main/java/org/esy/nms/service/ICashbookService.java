package org.esy.nms.service;

import org.esy.nms.entity.Cashbook;
import org.esy.base.dao.core.PageResult;
import org.springframework.data.domain.Pageable;

/**
 * @author <a href="mailto:ardui@163.com">ardui</a>
 * @date Thu Jul 30 10:50:38 CST 2020
 *
 * @version v2.0
 */
public interface ICashbookService  {
    
    Cashbook save(Cashbook o);

	Cashbook getByUid(String uid);

	boolean delete(Cashbook o);

	PageResult<Cashbook> query(Cashbook cashbook, Pageable pageable);
     
     void deletes(String uids);
}
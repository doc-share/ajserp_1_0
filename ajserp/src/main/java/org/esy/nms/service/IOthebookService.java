package org.esy.nms.service;

import org.esy.nms.entity.Othebook;
import org.esy.base.dao.core.PageResult;
import org.springframework.data.domain.Pageable;

/**
 * @author <a href="mailto:ardui@163.com">ardui</a>
 * @date Thu Jul 30 11:26:41 CST 2020
 *
 * @version v2.0
 */
public interface IOthebookService  {
    
    Othebook save(Othebook o);

	Othebook getByUid(String uid);

	boolean delete(Othebook o);

	PageResult<Othebook> query(Othebook othebook, Pageable pageable);
     
     void deletes(String uids);
}
package org.esy.nms.service;

import org.esy.nms.entity.Chkbook;
import org.esy.base.dao.core.PageResult;
import org.springframework.data.domain.Pageable;

/**
 * @author <a href="mailto:ardui@163.com">ardui</a>
 * @date Thu Jul 30 13:40:35 CST 2020
 *
 * @version v2.0
 */
public interface IChkbookService  {
    
    Chkbook save(Chkbook o);

	Chkbook getByUid(String uid);

	boolean delete(Chkbook o);

	PageResult<Chkbook> query(Chkbook chkbook, Pageable pageable);
     
     void deletes(String uids);
}
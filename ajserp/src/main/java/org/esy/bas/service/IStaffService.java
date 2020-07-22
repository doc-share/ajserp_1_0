package org.esy.bas.service;

import org.esy.bas.entity.Staff;
import org.esy.base.dao.core.PageResult;
import org.springframework.data.domain.Pageable;

/**
 * @author <a href="mailto:ardui@163.com">ardui</a>
 * @date Fri Jun 19 13:45:15 CST 2020
 *
 * @version v2.0
 */
public interface IStaffService  {
    
    Staff save(Staff o);

	Staff getByUid(String uid);

	boolean delete(Staff o);

	PageResult<Staff> query(Staff staff, Pageable pageable);
     
     void deletes(String uids);
}
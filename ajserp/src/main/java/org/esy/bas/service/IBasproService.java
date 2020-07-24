package org.esy.bas.service;

import org.esy.bas.entity.Baspro;
import org.esy.base.dao.core.PageResult;
import org.springframework.data.domain.Pageable;

/**
 * @author <a href="mailto:ardui@163.com">ardui</a>
 * @date Fri Jul 24 10:18:40 CST 2020
 *
 * @version v2.0
 */
public interface IBasproService  {
    
    Baspro save(Baspro o);

	Baspro getByUid(String uid);

	boolean delete(Baspro o);

	PageResult<Baspro> query(Baspro baspro, Pageable pageable);
     
     void deletes(String uids);
}
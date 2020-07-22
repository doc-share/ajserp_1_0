package org.esy.bas.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
import org.springframework.data.domain.Pageable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.esy.base.util.YesException;
import org.esy.base.core.Response;
import org.esy.base.service.ILoginService;
import org.esy.base.util.RestUtils;
import org.esy.base.http.HttpResult;
import org.esy.bas.service.IBasgroupService;
import org.esy.bas.entity.Basgroup;

/**
 * 实体控制器
 *  @author <a href="mailto:ardui@163.com">ardui</a>
 *  @version v2.0
 * @date Fri Jun 19 13:53:11 CST 2020			
 */
@Controller
@RequestMapping("/api/bas/basgroup")
public class BasgroupController {

    public static final String AUTHORITY = "bas_basgroup";

	@Autowired
	private ILoginService loginService;

	@Autowired
	private IBasgroupService basgroupService;
		
	/**
	 * 通过页面数据保存实体
	 * 
	 * @author <a href="mailto:ardui@163.com">ardui</a> 
	 * @param Basgroup  o
	 * @param BindingResult request
	 * @return ResponseEntity<Response>
	 * @date Fri Jun 19 13:53:11 CST 2020	
	 */
	@RequestMapping(method = RequestMethod.POST)
	@ResponseBody
	public ResponseEntity<Response> save(@RequestBody Basgroup o, HttpServletRequest request) {

		ResponseEntity<Response> result = RestUtils.checkAuthorization(request, loginService,AUTHORITY);
		if (result.getBody().getError() != 0) {
			return result;
		}

		Response resp;
		try {
			//o.setUid(null);
			resp = new Response(0, "Save success.", basgroupService.save(o));
			return new ResponseEntity<Response>(resp, HttpStatus.OK);
		} catch (YesException e) {
			// TODO: handle exception
			resp = new Response(e.getErrorcode().value(), e.getMessage(), null);
			return new ResponseEntity<Response>(resp, e.getErrorcode());
		}

	}
	
	
	/**
	 * 通过UID删除实体
	 * 
	 * @author <a href="mailto:ardui@163.com">ardui</a>
	 * @param uid
	 * @return ResponseEntity<Response> 
	 * @date Fri Jun 19 13:53:11 CST 2020	
	 */
	@RequestMapping(value = "/{uids}", method = RequestMethod.DELETE)
	@ResponseBody
	public ResponseEntity<Response> delet(@PathVariable String uids, HttpServletRequest request) {

		ResponseEntity<Response> result = RestUtils.checkAuthorization(request, loginService,AUTHORITY);
		if (result.getBody().getError() != 0) {
			return result;
		}

		Response resp;
		try {

			basgroupService.deletes(uids);
			resp = new Response(0, "Delete success.", null);
			return new ResponseEntity<Response>(resp, HttpStatus.OK);
		} catch (YesException e) {
			// TODO: handle exception
			resp = new Response(e.getErrorcode().value(), e.getMessage(), null);
			return new ResponseEntity<Response>(resp, e.getErrorcode());
		}
	}
	
		
	
	/**
	 * 通过UID删除实体
	 * 
	 * @author <a href="mailto:ardui@163.com">ardui</a>
	 * @param uid
	 * @return ResponseEntity<Response> 
	 * @date Fri Jun 19 13:53:11 CST 2020	
	 */
	@RequestMapping(value = "/{uid}", method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<Response> get(@PathVariable String uid, HttpServletRequest request) {

		ResponseEntity<Response> result = RestUtils.checkAuthorization(request, loginService,AUTHORITY);
		if (result.getBody().getError() != 0) {
			return result;
		}

		Response resp;

		Basgroup o = basgroupService.getByUid(uid);
		if (o == null) {
			resp = new Response(HttpStatus.NOT_FOUND.value(), "Object not found", null);
			return new ResponseEntity<Response>(resp, HttpStatus.NOT_FOUND);
		} else {
			resp = new Response(0, "success", o);
			return new ResponseEntity<Response>(resp, HttpStatus.OK);
		}
	}

        /**
	 * 通过条件查询实体
	 * 
	 * @author <a href="mailto:ardui@163.com">ardui</a>
	 * @param Basgroup, pageable
	 * @return HttpResult
	 * @date Fri Jun 19 13:53:11 CST 2020	
	 */
	@RequestMapping(value = "query", method = RequestMethod.POST)
	public HttpResult query(@Valid @RequestBody(required = false) Basgroup basgroup, Pageable pageable) {
		if (basgroup == null) {
			basgroup = new Basgroup();
		}
		return new HttpResult(basgroupService.query(basgroup, pageable));
	}
	
	


}
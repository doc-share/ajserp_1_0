package org.esy.inv.controller;

import javax.servlet.http.HttpServletRequest;
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
import org.springframework.web.bind.annotation.ResponseBody;
import org.esy.base.util.YesException;
import org.esy.base.core.Response;
import org.esy.base.service.ILoginService;
import org.esy.base.util.RestUtils;
import org.esy.base.http.HttpResult;
import org.esy.inv.service.IInvbalService;
import org.esy.inv.entity.Invbal;

/**
 * 实体控制器
 *  @author <a href="mailto:ardui@163.com">ardui</a>
 *  @version v2.0
 * @date Mon Aug 03 10:12:48 CST 2020			
 */
@Controller
@RequestMapping("/api/inv/invbal")
public class InvbalController {

    public static final String AUTHORITY = "inv_map65";

	@Autowired
	private ILoginService loginService;

	@Autowired
	private IInvbalService invbalService;
		
	/**
	 * 通过页面数据保存实体
	 * 
	 * @author <a href="mailto:ardui@163.com">ardui</a> 
	 * @param Invbal  o
	 * @param BindingResult request
	 * @return ResponseEntity<Response>
	 * @date Mon Aug 03 10:12:48 CST 2020	
	 */
	@RequestMapping(method = RequestMethod.POST)
	@ResponseBody
	public ResponseEntity<Response> save(@RequestBody Invbal o, HttpServletRequest request) {

		ResponseEntity<Response> result = RestUtils.checkAuthorization(request, loginService,AUTHORITY);
		if (result.getBody().getError() != 0) {
			return result;
		}

		Response resp;
		try {
			//o.setUid(null);
			resp = new Response(0, "Save success.", invbalService.save(o));
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
	 * @date Mon Aug 03 10:12:48 CST 2020	
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

			invbalService.deletes(uids);
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
	 * @date Mon Aug 03 10:12:48 CST 2020	
	 */
	@RequestMapping(value = "/{uid}", method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<Response> get(@PathVariable String uid, HttpServletRequest request) {

		ResponseEntity<Response> result = RestUtils.checkAuthorization(request, loginService,AUTHORITY);
		if (result.getBody().getError() != 0) {
			return result;
		}

		Response resp;

		Invbal o = invbalService.getByUid(uid);
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
	 * @param Invbal, pageable
	 * @return HttpResult
	 * @date Mon Aug 03 10:12:48 CST 2020	
	 */
	@RequestMapping(value = "query", method = RequestMethod.POST)
	public HttpResult query(@Valid @RequestBody(required = false) Invbal invbal, Pageable pageable) {
		if (invbal == null) {
			invbal = new Invbal();
		}
		return new HttpResult(invbalService.query(invbal, pageable));
	}
	
	


}
package org.esy.ord.controller;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.esy.base.core.Response;
import org.esy.base.http.HttpResult;
import org.esy.base.service.ILoginService;
import org.esy.base.util.RestUtils;
import org.esy.base.util.YesException;
import org.esy.ord.entity.view.Contcasev;
import org.esy.ord.service.IContcaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 实体控制器
 * 
 * @author <a href="mailto:ardui@163.com">ardui</a>
 * @version v2.0
 * @date Tue Jun 23 11:06:06 CST 2020
 */
@Controller
@RequestMapping("/api/ord/contcase")
public class ContcaseController {

    public static final String AUTHORITY = "ord_contcase"; //與前端菜單編號一致


	@Autowired
	private ILoginService loginService;

	@Autowired
	private IContcaseService contcaseService;

	/**
	 * 通过页面数据保存实体
	 * 
	 * @author <a href="mailto:ardui@163.com">ardui</a>
	 * @param acrbatv
	 *            o
	 * @param BindingResult
	 *            request
	 * @return ResponseEntity<Response>
	 * @date Tue Jun 23 11:06:06 CST 2020
	 */
	@RequestMapping(method = RequestMethod.POST)
	@ResponseBody
	public ResponseEntity<Response> save(@RequestBody Contcasev o, HttpServletRequest request) {

		ResponseEntity<Response> result = RestUtils.checkAuthorization(request, loginService, AUTHORITY);
		if (result.getBody().getError() != 0) {
			return result;
		}

		Response resp;
		try {
			// o.setUid(null);
			resp = new Response(0, "Save success.", contcaseService.save(o));
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
	 * @date Tue Jun 23 11:06:06 CST 2020
	 */
	@RequestMapping(value = "/{uids}", method = RequestMethod.DELETE)
	@ResponseBody
	public ResponseEntity<Response> delet(@PathVariable String uids, HttpServletRequest request) {

		ResponseEntity<Response> result = RestUtils.checkAuthorization(request, loginService, AUTHORITY);
		if (result.getBody().getError() != 0) {
			return result;
		}

		Response resp;
		try {

			contcaseService.deletes(uids);
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
	 * @date Tue Jun 23 11:06:06 CST 2020
	 */
	@RequestMapping(value = "/{uid}", method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<Response> get(@PathVariable String uid, HttpServletRequest request) {

		ResponseEntity<Response> result = RestUtils.checkAuthorization(request, loginService, AUTHORITY);
		if (result.getBody().getError() != 0) {
			return result;
		}

		Response resp;

		Contcasev o = contcaseService.getByUid(uid);
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
	 * @param Contbah,
	 *            pageable
	 * @return HttpResult
	 * @date Tue Jun 23 11:06:06 CST 2020
	 */
	@RequestMapping(value = "query", method = RequestMethod.POST)
	public HttpResult query(@Valid @RequestBody(required = false) Contcasev contcase, Pageable pageable) {
		if (contcase == null) {
			contcase = new Contcasev();
		}
		return new HttpResult(contcaseService.query(contcase, pageable));
	}

}
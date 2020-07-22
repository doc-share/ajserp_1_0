package org.esy.ord.controller;

import javax.validation.Valid;

import org.esy.base.core.Response;
import org.esy.base.http.HttpResult;
import org.esy.base.util.YesException;
//import org.esy.base.service.ILoginService;
import org.esy.ord.entity.view.Contyearv;
import org.esy.ord.service.IContyearService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/api/ord/contyear") // 路由
public class ContyearController {

	public static final String AUTHORITY = "ord_contyear"; // 與前端菜單編號一致(權限)

	// @Autowired
	// private ILoginService loginService;

	@Autowired
	private IContyearService contyearService;

	// localhost:8080

	@RequestMapping(value = "query", method = RequestMethod.POST)
	public HttpResult query(@Valid @RequestBody(required = false) Contyearv contyearv, Pageable pageable) {
		if (contyearv == null) {
			contyearv = new Contyearv();
		}
		return new HttpResult(contyearService.query(contyearv, pageable));
	}

	@RequestMapping(value = "savecontcase", method = RequestMethod.POST)
	public ResponseEntity<Response> savecontcase(@Valid @RequestBody(required = false) String[] uids,
			Pageable pageable) {

		Response resp;
		try {

			contyearService.savecontcase(uids);
			resp = new Response(0, "Delete success.", null);
			return new ResponseEntity<Response>(resp, HttpStatus.OK);
		} catch (YesException e) {
			// TODO: handle exception
			resp = new Response(e.getErrorcode().value(), e.getMessage(), null);
			return new ResponseEntity<Response>(resp, e.getErrorcode());
		}
	}

}
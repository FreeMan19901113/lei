package com.jfree.framework.mvc.handler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 请求异常控制层
 * @ClassName: ErrorHandler 
 * @Description: TODO
 * @author: leizhenyang
 * @date: Mar 29, 2016 1:59:48 PM
 */
@Controller
@RequestMapping(value = "error")
public class ErrorHandler {
	
	@RequestMapping(value = "/404")
	public String error404() {
		return "error/404";
	}

	@RequestMapping(value = "/500")
	public String error500() {
		return "error/500";
	}
}

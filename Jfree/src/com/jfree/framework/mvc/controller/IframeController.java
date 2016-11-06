package com.jfree.framework.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jfree.framework.logs.BaseLogger;

/**
 * 界面框架的控制层
 * @ClassName: IframeController 
 * @Description: TODO
 * @author: leizhenyang
 * @date: Mar 29, 2016 2:00:22 PM
 */
@Controller
public class IframeController extends BaseLogger{
	
	@RequestMapping(value="welcome")
	public String welcome(){
		return "welcome";
	}
	
	@RequestMapping(value="index")
	public String index(){
		return "index";
	}
}

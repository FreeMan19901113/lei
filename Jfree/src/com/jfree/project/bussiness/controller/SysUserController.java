package com.jfree.project.bussiness.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jfree.framework.mvc.controller.BaseController;
import com.jfree.framework.mvc.service.IBaseService;
import com.jfree.framework.mvc.set.ResultSet;
import com.jfree.project.bussiness.form.SysUserQueryForm;
import com.jfree.project.bussiness.model.SysUser;

/**
 * 系统用户控制层
 * @ClassName: SysUserController 
 * @Description: TODO
 * @author: leizhenyang
 * @date: Mar 29, 2016 1:48:55 PM
 */
@Controller("SysUserController")
@RequestMapping("SysUser")
public class SysUserController extends BaseController<SysUser>  {
	
	@Autowired
	@Qualifier("SysUserService")
	protected IBaseService<SysUser> service;
	
	@Override
	protected IBaseService<SysUser> baseService() {
		return service;
	}
	
	@Override
	protected String success() {
		return URIConstans.SysUser;
	}

	@ResponseBody
	@RequestMapping(value = "/find")
	public ResultSet<SysUser> find(SysUserQueryForm form) {
		return service.executeQuery(form);
	}
}

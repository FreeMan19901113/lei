package com.jfree.project.bussiness.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jfree.framework.mvc.controller.BaseController;
import com.jfree.framework.mvc.service.IBaseService;
import com.jfree.project.bussiness.model.SysRole;

/**
 * 系统角色控制层
 * @ClassName: SysRoleController 
 * @Description: TODO
 * @author: leizhenyang
 * @date: Mar 29, 2016 1:49:03 PM
 */
@Controller
@RequestMapping("SysRole")
public class SysRoleController extends BaseController<SysRole> {

	@Autowired
	@Qualifier("SysRoleService")
	private IBaseService<SysRole> service;
	
	@Override
	protected IBaseService<SysRole> baseService() {
		// TODO Auto-generated method stub
		return service;
	}

	@Override
	protected String success() {
		// TODO Auto-generated method stub
		return URIConstans.SysRole;
	}

}

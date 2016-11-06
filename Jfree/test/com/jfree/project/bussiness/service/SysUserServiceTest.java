package com.jfree.project.bussiness.service;

import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.jfree.framework.mvc.service.IBaseService;
import com.jfree.framework.mvc.set.ResultSet;
import com.jfree.project.bussiness.SpringConfig;
import com.jfree.project.bussiness.form.SysUserQueryForm;
import com.jfree.project.bussiness.model.SysUser;

/**
 * @Title: 文件名
 * @Description: 描述
 * @CreateTime：Mar 25, 201610:22:18 AM
 * @author leizhenyang
 */
public class SysUserServiceTest extends SpringConfig {
	@Autowired
	@Qualifier("SysUserService")
	private IBaseService<SysUser> service;

	@Test
	public void save() {
		for (int i = 0; i < 1000; i++) {
			SysUser user = new SysUser();
			user.setListId(i);
			user.setCreatedDate(new Date());
			user.setUserName("TestUserByApps" + i);
			user.setPassword("TestPassByApps" + i);
			service.executeSave(user);
		}
	}
	@Test
	public void find() {
		SysUserQueryForm form = new SysUserQueryForm();
		ResultSet<SysUser> rs = service.executeQuery(form);
		List<SysUser> list = rs.getRows();
		for (SysUser sysUser : list) {
			System.out.println(sysUser);
		}
	}
	@Test
	public void get() {
		for (int i = 0; i < 10; i++) {
			SysUser user = service.get(i);
			System.out.println(user);
		}
	}
}

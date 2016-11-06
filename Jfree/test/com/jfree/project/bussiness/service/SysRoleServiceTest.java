package com.jfree.project.bussiness.service;

import java.util.Date;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;

import com.jfree.framework.mvc.service.IBaseService;
import com.jfree.project.bussiness.SpringConfig;
import com.jfree.project.bussiness.model.SysRole;

/**
 * @Title: 文件名
 * @Description: 描述
 * @CreateTime：Mar 25, 201610:22:18 AM
 * @author leizhenyang
 */
public class SysRoleServiceTest extends SpringConfig {
	// @Autowired
	// @Qualifier("SysRoleService")
	// private IBaseService<SysRole> service;
	//
	// @Test
	// public void get() {
	// SysRole role = service.get(1l);
	// System.out.println(role.getRoleName());
	// }
	// @Test
	// public void save() {
	// for (int i = 0; i < 10; i++) {
	// SysRole role = new SysRole();
	// role.setListId(i);
	// role.setCreatedDate(new Date());
	// role.setRoleName("TestRoles" + i);
	// service.executeSave(role);
	// }
	// }
	@Autowired
	private JedisConnectionFactory jedisConnectionFactory;
	
	@Test
	public void a() {
		System.out.println(jedisConnectionFactory);
	}
}

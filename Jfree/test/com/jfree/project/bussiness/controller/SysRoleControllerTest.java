package com.jfree.project.bussiness.controller;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.jfree.framework.mvc.controller.IBaseController;
import com.jfree.framework.mvc.set.QueryForm;
import com.jfree.framework.mvc.set.ResultSet;
import com.jfree.project.bussiness.form.SysUserQueryForm;
import com.jfree.project.bussiness.model.SysRole;

/**
 * @Title: SysUserControllerTest
 * @Description: SysUserControllerTest类
 * @CreateTime：Mar 2, 20162:24:28 PM
 * @author leizhenyang
 */
public class SysRoleControllerTest extends BaseControllerTest {
	@Autowired
	private IBaseController<SysRole> controller;

	@Test
	public void find() {
		try {
			// SysUserQueryForm form = new SysUserQueryForm();
			// form.setPage(1);
			// form.setRows(15);
			// form.setSkip(50);
			// form.setUsername("0");
			// form.setListId(21l);
			long start = System.currentTimeMillis();
			ResultSet set = (ResultSet) controller.find(new QueryForm());
			long end = System.currentTimeMillis();
			System.out.println(end - start + "ms");
			List<SysRole> list = set.getRows();
			for (SysRole role : list) {
				System.out.println(role.toString());
			}
			// assertEquals(,sysUserController.find(form)) ; //结果预期
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

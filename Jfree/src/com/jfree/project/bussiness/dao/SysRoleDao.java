package com.jfree.project.bussiness.dao;

import org.springframework.stereotype.Repository;

import com.jfree.framework.mvc.dao.BaseDao;
import com.jfree.project.bussiness.model.SysRole;


/**
 * 系统角色数据层
 * @ClassName: SysRoleDao
 * @Description: TODO
 * @author: leizhenyang
 * @date: Mar 29, 2016 1:47:59 PM
 */
@Repository("SysRoleDao")
public class SysRoleDao extends BaseDao<SysRole> {
	@Override
	public String getCurrentDatabaseName() {
		// TODO Auto-generated method stub
		return "jfree";
	}
	@Override
	public String getCollectionName() {
		// TODO Auto-generated method stub
		return "roles";
	}
	@Override
	protected SysRole getModelInstance() {
		// TODO Auto-generated method stub
		return new SysRole();
	}
}

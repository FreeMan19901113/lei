package com.jfree.project.bussiness.dao;

import org.springframework.stereotype.Repository;

import com.jfree.framework.mvc.dao.BaseDao;
import com.jfree.project.bussiness.model.SysUser;

/**
 * 系统用户数据层
 * @ClassName: SysUserDao
 * @Description: TODO
 * @author: leizhenyang
 * @date: Mar 29, 2016 1:47:46 PM
 */
@Repository(value = "SysUserDao")
public class SysUserDao extends BaseDao<SysUser> {
	public String getCurrentDatabaseName() {
		// TODO Auto-generated method stub
		return "jfree";
	}
	public String getCollectionName() {
		// TODO Auto-generated method stub
		return "users";
	}
	@Override
	protected SysUser getModelInstance() {
		// TODO Auto-generated method stub
		return new SysUser();
	}
}

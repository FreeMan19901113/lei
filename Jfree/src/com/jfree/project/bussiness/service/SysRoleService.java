package com.jfree.project.bussiness.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.jfree.framework.mvc.dao.IBaseDao;
import com.jfree.framework.mvc.mongo.utils.Conditions;
import com.jfree.framework.mvc.mongo.utils.Orders;
import com.jfree.framework.mvc.mongo.utils.QueryConditions;
import com.jfree.framework.mvc.service.BaseService;
import com.jfree.framework.mvc.set.QueryForm;
import com.jfree.project.bussiness.model.SysRole;

/**
 * 系统角色业务逻辑层
 * @ClassName: SysRoleService 
 * @Description: TODO
 * @author: leizhenyang
 * @date: Mar 29, 2016 1:45:14 PM
 */
@Service("SysRoleService")
public class SysRoleService extends BaseService<SysRole> {
	@Autowired
	@Qualifier("SysRoleDao")
	private IBaseDao<SysRole> dao;

	@Override
	protected IBaseDao<SysRole> baseDao() {
		// TODO Auto-generated method stub
		return dao;
	}
	@Override
	public QueryConditions getQueryConditions(QueryForm form) {
		// TODO Auto-generated method stub
//		return new QueryConditions(new QueryForm(), new Conditions(), new Orders());
		return null;
	}
}

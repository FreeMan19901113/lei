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
import com.jfree.project.bussiness.form.SysUserQueryForm;
import com.jfree.project.bussiness.model.SysUser;

/**
 * 系统用户业务逻辑层
 * @ClassName: SysUserService
 * @Description: TODO 
 * @author: leizhenyang
 * @date: Mar 29, 2016 11:58:39 AM
 */
@Service(value = "SysUserService")
public class SysUserService extends BaseService<SysUser> {
	@Autowired
	@Qualifier("SysUserDao")
	protected IBaseDao<SysUser> dao;

	@Override
	protected IBaseDao<SysUser> baseDao() {
		return dao;
	}
	@Override
	public QueryConditions getQueryConditions(QueryForm form) {
		SysUserQueryForm queryform = (SysUserQueryForm) form;
		Conditions conditions = new Conditions();
		conditions.put(SysUser.Field.USERNAME, like(queryform.getUsername()));
		Orders orders = new Orders();
		orders.put(SysUser.Field.LISTID, SORT.ASC.value);
		return new QueryConditions(queryform, conditions, orders);
	}
}

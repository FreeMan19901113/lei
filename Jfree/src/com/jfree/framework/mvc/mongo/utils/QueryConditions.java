package com.jfree.framework.mvc.mongo.utils;

import com.jfree.framework.mvc.set.QueryForm;

/**
 * 查询条件
 * @ClassName: QueryConditions 
 * @Description: TODO
 * @author: leizhenyang
 * @date: Mar 29, 2016 1:50:41 PM
 */
public class QueryConditions {

	private QueryForm form;

	private Conditions conditions;

	private Orders orders;

	/**
	 * 支持分页的构造方法
	 * @Title:QueryConditions
	 * @Description:TODO 
	 * @param form
	 */
	public QueryConditions(QueryForm form) {
		// TODO Auto-generated constructor stub
		this.form = form;
	}

	/**
	 * 支持分页、查询条件的构造方法
	 * @Title:QueryConditions
	 * @Description:TODO 
	 * @param form
	 * @param conditions
	 */
	public QueryConditions(QueryForm form, Conditions conditions) {
		// TODO Auto-generated constructor stub
		this.form = form;
		this.conditions = conditions;
	}

	/**
	 * 支持分页、查询条件、排序的构造方法
	 * @Title:QueryConditions
	 * @Description:TODO 
	 * @param form
	 * @param conditions
	 * @param orders
	 */
	public QueryConditions(QueryForm form, Conditions conditions, Orders orders) {
		// TODO Auto-generated constructor stub
		this.form = form;
		this.conditions = conditions;
		this.orders = orders;
	}

	public QueryForm getForm() {
		return form;
	}

	public void setForm(QueryForm form) {
		this.form = form;
	}

	public Conditions getConditions() {
		return conditions;
	}

	public void setConditions(Conditions conditions) {
		this.conditions = conditions;
	}

	public Orders getOrders() {
		return orders;
	}

	public void setOrders(Orders orders) {
		this.orders = orders;
	}
}

package com.jfree.framework.mvc.service;

import java.util.Collections;
import java.util.List;

import org.bson.codecs.Codec;

import com.jfree.framework.mvc.dao.IBaseDao;
import com.jfree.framework.mvc.mongo.utils.QueryConditions;
import com.jfree.framework.mvc.mongo.utils.logic.LogicMatch;
import com.jfree.framework.mvc.set.QueryForm;
import com.jfree.framework.mvc.set.ResultMessage;
import com.jfree.framework.mvc.set.ResultSet;

/**
 * 业务逻辑层基类
 * @ClassName: BaseService 
 * @Description: TODO
 * @author: leizhenyang
 * @date: Mar 29, 2016 1:50:01 PM 
 * @param <M>
 */
public abstract class BaseService<M> extends LogicMatch implements
		IBaseService<M>, ServiceConstants {

	protected abstract IBaseDao<M> baseDao();

	ResultMessage msg = null;

	public abstract QueryConditions getQueryConditions(QueryForm form);
	
	protected void saveOrModifyBefore() {
		logger.info("saveOrModifyBefore()");
	}

	protected void validate() {
		
	}

	private void validateBefore() {
		if (null != msg) {
			msg = null;
		}
		validate();
	}
	
	protected void queryBefore(QueryForm queryForm) {
		
	}

	private void countPages(QueryForm queryForm) {
		int page = queryForm.getPage(); // 当前页码
		int rows = queryForm.getRows();// 每页数
		queryForm.setSkip((page - 1) * rows);
	}
	
	private void clear() {
		if (null != msg) {
			msg = null;
		}
		saveOrModifyBefore();
	}
	
	public ResultSet<M> executeQuery(QueryForm form) {
		ResultSet<M> set = null;
		List<M> datas = Collections.EMPTY_LIST;
		long count = 0;
		validateBefore();
		if (null == msg) {
			queryBefore(form);
			countPages(form);
			datas = baseDao().find(getQueryConditions(form));// 分页查询
			if(null != getQueryConditions(form)){
				count = baseDao().count(getQueryConditions(form).getConditions()); // 当前条件的总记录数
			}else{
				count = baseDao().count();
			}
		}
		set = new ResultSet<M>(count, form.getPage(), datas);
		return set;
	}
	
	public M get(long listId) {
		return baseDao().get(listId);
	}
	
	public Object executeSave(M m) {
		// TODO Auto-generated method stub
		baseDao().save(m);
		return null;
	}

	public Object executeDelete(long listId) {
		// TODO Auto-generated method stub
		logger.info("delete()");
		return null;
	}
	
	public Object executeModify(Object obj) {
		clear();
		logger.info("modify()");
		if (null != msg) {
			return msg;
		}
		return null;
	}

	public Object save(Codec obj) {
		clear();
		logger.info("save()");
		if (null != msg) {
			return msg;
		}
		return null;
	}

}

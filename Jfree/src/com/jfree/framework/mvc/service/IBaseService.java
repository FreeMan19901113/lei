package com.jfree.framework.mvc.service;

import com.jfree.framework.mvc.set.QueryForm;
import com.jfree.framework.mvc.set.ResultSet;

/**
 * 业务逻辑接口
 * @ClassName: IBaseService 
 * @Description: TODO 
 * @author: leizhenyang
 * @date: Mar 29, 2016 11:56:57 AM 
 * @param <M>
 */
public interface IBaseService<M> {
	/**
	 * 查询执行查询操作
	 * @Title: executeQuery 
	 * @Description: TODO 
	 * @param form
	 * @return
	 * @return: ResultSet<M>
	 */
	ResultSet<M> executeQuery(QueryForm form);

	/**
	 * 执行保存操作
	 * @Title: executeSave 
	 * @Description: TODO 
	 * @param m
	 * @return
	 * @return: Object
	 */
	Object executeSave(M m);

	/**
	 * 执行修改操作
	 * @Title: executeModify 
	 * @Description: TODO 
	 * @param obj
	 * @return
	 * @return: Object
	 */
	Object executeModify(Object obj);

	/**
	 * 
	 * @Title: executeDelete 
	 * @Description: TODO 删除
	 * @param listId
	 * @return
	 * @return: Object
	 */
	Object executeDelete(long listId);

	/**
	 * 根据listId查询泛型实体
	 * @Title: get 
	 * @Description: TODO 
	 * @param listId
	 * @return
	 * @return: M
	 */
	M get(long listId);
	
}

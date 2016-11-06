package com.jfree.framework.mvc.dao;

import java.util.List;

import com.jfree.framework.mvc.mongo.utils.Conditions;
import com.jfree.framework.mvc.mongo.utils.QueryConditions;

/**
 * 
 * @ClassName: IBaseDao 
 * @Description: TODO
 * @author: leizhenyang dao类接口
 * @date: Mar 29, 2016 11:54:36 AM 
 * @param <M>
 */
public interface IBaseDao<M> {
	/**
	 * 根据ListId获取泛型实体
	 * @Title: get 
	 * @Description: TODO 
	 * @param listId
	 * @return
	 * @return: M
	 */
	M get(long listId);
	
	/**
	 * 查询
	 * @Title: find 
	 * @Description: TODO 
	 * @param queryConditions 查询条件
	 * @return
	 * @return: List<M> 泛型的结果集
	 */
	public List<M> find(QueryConditions queryConditions);
	
	/**
	 * 
	 * @Title: count 
	 * @Description: TODO 无查询条件的count()
	 * @return
	 * @return: long
	 */
	long count();
	
	/**
	 * 支持查询条件的count()
	 * @Title: count 
	 * @Description: TODO 
	 * @param conditions 
	 * @return
	 * @return: long
	 */
	long count(Conditions conditions);

	/**
	 * 泛型实体入库
	 * @Title: save 
	 * @Description: TODO 
	 * @param m
	 * @return: void
	 */
	void save(M m);
	
}

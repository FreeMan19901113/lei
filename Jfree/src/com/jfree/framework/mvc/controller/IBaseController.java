package com.jfree.framework.mvc.controller;

import com.jfree.framework.mvc.set.QueryForm;
import com.jfree.framework.mvc.set.ResultSet;

/**
 * 控制层接口类
 * @ClassName: IBaseController 
 * @Description: TODO
 * @author: leizhenyang
 * @date: Mar 29, 2016 2:00:35 PM 
 * @param <E>
 */
public interface IBaseController<E> {
	
	public String init();

	public ResultSet<E> find(QueryForm queryForm);
	
	public Object save();
	
	public Object modify();

	public Object delete();
	
}

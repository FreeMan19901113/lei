package com.jfree.framework.mvc.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jfree.framework.logs.BaseLogger;
import com.jfree.framework.mvc.service.IBaseService;
import com.jfree.framework.mvc.set.QueryForm;
import com.jfree.framework.mvc.set.ResultSet;

/**
 * 控制层接口实现基类
 * @ClassName: BaseController 
 * @Description: TODO
 * @author: leizhenyang
 * @date: Mar 29, 2016 2:00:46 PM 
 * @param <M>
 */
public abstract class BaseController<M> extends BaseLogger implements
		IBaseController<M> {

	/**
	 * 实现IBaseService的业务处理类
	 * 
	 * @return IBaseService接口
	 * 
	 * @Author leizhenyang
	 * @Date Jan 4, 2016
	 */
	protected abstract IBaseService<M> baseService();

	/**
	 * SUCCESS返回地址
	 * 
	 * @return
	 * 
	 * @Author leizhenyang
	 * @Date Jan 4, 2016
	 */
	protected abstract String success();

	@RequestMapping("/init")
	public String init() {
		logger.debug("init");
		return success();
	}

	public ResultSet<M> find(QueryForm form) {
		logger.debug("find");
		return baseService().executeQuery(form);
	}

	@ResponseBody
	@RequestMapping(value = "/save")
	public Object save() {
		logger.debug("save()");
		return baseService().executeSave(null);
	}

	@ResponseBody
	@RequestMapping(value = "/delete")
	public Object delete() {
		logger.debug("delete()");
		return baseService().executeDelete(1);
	}

	@ResponseBody
	@RequestMapping(value = "/modify")
	public Object modify() {
		logger.debug("modify()");
		return baseService().executeModify("bb");
	}
}

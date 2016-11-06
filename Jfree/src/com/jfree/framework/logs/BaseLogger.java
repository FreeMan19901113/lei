package com.jfree.framework.logs;

import org.apache.log4j.Logger;

/**
 * 日志基类
 * @ClassName: BaseLogger 
 * @Description: TODO
 * @author: leizhenyang
 * @date: Mar 29, 2016 2:02:55 PM
 */
public abstract class BaseLogger {
	
	protected Class<?> clazz;
	/**
	 * 日志
	 */
	protected Logger logger;
	
	
	public BaseLogger(){
		setClazz();
		this.logger = Logger.getLogger(clazz);
	}
	
	protected void setClazz(){
		clazz = getClass();
	}
}

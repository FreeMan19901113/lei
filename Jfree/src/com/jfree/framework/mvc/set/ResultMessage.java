package com.jfree.framework.mvc.set;

/**
 * 处理结果消息实体
 * @ClassName: ResultMessage 
 * @Description: TODO
 * @author: leizhenyang
 * @date: Mar 29, 2016 1:43:09 PM
 */
public class ResultMessage {
	private int level;
	private String message;

	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
}

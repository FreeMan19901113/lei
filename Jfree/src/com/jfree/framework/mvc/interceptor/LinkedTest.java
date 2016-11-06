package com.jfree.framework.mvc.interceptor;
/**
 * @Title: 文件名
 * @Description:  描述
 * @CreateTime：2016年4月17日下午8:49:54
 * @author leizhenyang
 */
public class LinkedTest<T> {
	
	private T first;
	private T current;
	private T next;
	
	public T getTop() {
		return first;
	}
	public void setTop(T top) {
		this.first = top;
	}
	public T getCurrent() {
		return current;
	}
	public void setCurrent(T current) {
		this.current = current;
	}
	public T getNext() {
		return next;
	}
	public void setNext(T next) {
		this.next = next;
	}
	
}

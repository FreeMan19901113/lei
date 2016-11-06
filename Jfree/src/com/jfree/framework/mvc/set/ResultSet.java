package com.jfree.framework.mvc.set;

import java.util.List;

/**
 * flexigrid返回数据泛型
 * @ClassName: ResultSet 
 * @Description: TODO
 * @author: leizhenyang
 * @date: Mar 29, 2016 1:43:27 PM 
 * @param <E>
 */
public class ResultSet<E> {

	/**
	 * 分页结果集
	 * @Title:ResultSet
	 * @Description:TODO 
	 * @param total 记录总条数
	 * @param page 当前页码
	 * @param rows 查询结果集
	 */
	public ResultSet(long total,int page,List<E> rows) {
		// TODO Auto-generated constructor stub
		this.total = total;
		this.page = page;
		this.rows = rows;
	}
	
	private long total = 0;
	private int page = 1;
	private List<E> rows;
	
	public long getTotal() {
		return total;
	}
	public void setTotal(long total) {
		this.total = total;
	}
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public List<E> getRows() {
		return rows;
	}
	public void setRows(List<E> rows) {
		this.rows = rows;
	}
	@Override
	public String toString() {
		return "ResultSet [total=" + total + ", page=" + page + "]";
	}
	
}

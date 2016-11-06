package com.jfree.framework.mvc.set;

import java.io.Serializable;

/**
 * 查询表单
 * @ClassName: QueryForm 
 * @Description: TODO
 * @author: leizhenyang
 * @date: Mar 29, 2016 1:49:28 PM
 */
public class QueryForm implements Serializable{
	private int page = 1;//当前页码,默认第一页
	private String sortOrder; //排序字段
	private int rows = 15;	//每页条数
	private int skip; //跳过总数为skip行的记录
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public String getSortOrder() {
		return sortOrder;
	}
	public void setSortOrder(String sortOrder) {
		this.sortOrder = sortOrder;
	}
	/**
	 *
	  * <p> Description(方法描述): TODO 获取当前每页显示的数据条数 </p>
	  * <p> Param: @return 数据条数 </p>
	  * <p> Return: int </p>
	  * <p> CreateTime(生成日期)：Feb 17, 2016 2:25:57 PM </p>
	  * @author leizhenyang
	 */
	public int getRows() {
		return rows;
	}
	public void setRows(int rows) {
		this.rows = rows;
	}
	/**
	 * 
	  * <p> Description(方法描述): TODO 获取跳过多少行数据</p>
	  * <p> Param: @return </p>
	  * <p> Return: int </p>
	  * <p> CreateTime(生成日期)：Feb 17, 2016 2:27:20 PM </p>
	  * @author leizhenyang
	 */
	public int getSkip() {
		return skip;
	}
	public void setSkip(int skip) {
		this.skip = skip;
	}

}

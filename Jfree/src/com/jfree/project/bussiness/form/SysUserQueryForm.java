package com.jfree.project.bussiness.form;

import com.jfree.framework.mvc.set.QueryForm;

/**
 * 系统用户查询表单
 * @ClassName: SysUserQueryForm
 * @Description: TODO
 * @author: leizhenyang
 * @date: Mar 29, 2016 1:47:30 PM
 */
public class SysUserQueryForm extends QueryForm {
	private long listId;
	private String username;
	private String remark;

	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public long getListId() {
		return listId;
	}
	public void setListId(long listId) {
		this.listId = listId;
	}
	@Override
	public String toString() {
		return "SysUser [listId=" + listId + ", username=" + username + ", remark=" + remark + "]";
	}
}

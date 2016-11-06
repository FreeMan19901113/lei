package com.jfree.project.bussiness.model;

import org.apache.commons.lang.StringUtils;
import org.bson.Document;

import com.jfree.framework.mvc.model.BaseModel;

/**
 * 系统用户，继承BaseModel类
 * @ClassName: SysUser 
 * @Description: TODO
 * @author: leizhenyang
 * @date: Mar 29, 2016 1:45:24 PM
 */
public class SysUser extends BaseModel<SysUser> {
	/**
	 * @Title: Field
	 * @Description: 用户字段常量
	 * @CreateTime：Oct 8, 20154:07:37 PM
	 * @author leizhenyang
	 */
	public static interface Field extends BaseModel.Field {
		/**
		 * 用户姓名
		 */
		String USERNAME = "UserName";
		/**
		 * 用户密码
		 */
		String PASSWORD = "Password";
		/**
		 * 备注
		 */
		String REMARK = "Remark";
	}

	private String userName;
	private transient String password;
	private String remark;

	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public Document deJCodec(SysUser entity) {
		// TODO Auto-generated method stub
		Document doc = super.deJCodec(entity);
		if (StringUtils.isNotEmpty(entity.getUserName())) {
			doc.put(SysUser.Field.USERNAME, entity.getUserName());
		}
		if (StringUtils.isNotEmpty(entity.getPassword())) {
			doc.put(SysUser.Field.PASSWORD, entity.getPassword());
		}
		if (StringUtils.isNotEmpty(entity.getRemark())) {
			doc.put(SysUser.Field.REMARK, entity.getRemark());
		}
		return doc;
	}

	public SysUser enJCodec(Document doc) {
		// TODO Auto-generated method stub
		SysUser user = new SysUser();
		user.setListId(doc.getLong(SysUser.Field.LISTID));
		user.setCreatedDate(doc.getDate(SysUser.Field.CREATEEDDATE));
		user.setModifyDate(doc.getDate(SysUser.Field.MODIFIEDDATE));
		user.setDescription(doc.getString(SysUser.Field.DESCRIPTION));
		user.setUserName(doc.getString(SysUser.Field.USERNAME));
		user.setPassword(doc.getString(SysUser.Field.PASSWORD));
		user.setRemark(doc.getString(SysUser.Field.REMARK));
		return user;
	}
	@Override
	public String toString() {
		return "SysUser [userName=" + userName + ", password=" + password + ", remark=" + remark + ", listId=" + listId
				+ ", createdDate=" + createdDate + ", modifyDate=" + modifyDate + ", description=" + description + "]";
	}
}

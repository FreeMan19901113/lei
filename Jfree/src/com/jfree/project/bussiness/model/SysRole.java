package com.jfree.project.bussiness.model;

import org.apache.commons.lang.StringUtils;
import org.bson.Document;

import com.jfree.framework.mvc.model.BaseModel;

/**
 * 系统角色，继承BaseModel类
 * @ClassName: SysRole
 * @Description: TODO
 * @author: leizhenyang
 * @date: Mar 29, 2016 1:45:32 PM
 */
public class SysRole extends BaseModel<SysRole> {
	public static interface Field extends BaseModel.Field {
		String ROLENAME = "roleName";
	}

	private String roleName;

	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	public SysRole enJCodec(Document doc) {
		SysRole role = new SysRole();
		role.setListId(doc.getLong(SysRole.Field.LISTID));
		role.setCreatedDate(doc.getDate(SysRole.Field.CREATEEDDATE));
		role.setModifyDate(doc.getDate(SysRole.Field.MODIFIEDDATE));
		role.setDescription(doc.getString(SysRole.Field.DESCRIPTION));
		role.setRoleName(doc.getString(SysRole.Field.ROLENAME));
		return role;
	}
	public Document deJCodec(SysRole entity) {
		// TODO Auto-generated method stub
		Document doc = super.deJCodec(entity);
		if (StringUtils.isNotEmpty(entity.getRoleName())) {
			doc.put(SysRole.Field.ROLENAME, entity.getRoleName());
		}
		return doc;
	}
	@Override
	public String toString() {
		return "SysRole [roleName=" + roleName + ", listId=" + listId + ", createdDate=" + createdDate
				+ ", modifyDate=" + modifyDate + ", description=" + description + "]";
	}
}

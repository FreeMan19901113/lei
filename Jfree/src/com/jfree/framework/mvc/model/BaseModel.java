package com.jfree.framework.mvc.model;

import java.io.Serializable;
import java.util.Date;

import org.bson.Document;

import com.jfree.framework.mvc.mongo.codec.JCodec;

/**
 * 实体基类，实现JCodec,Serializable接口
 * @ClassName: BaseModel 
 * @Description: TODO
 * @author: leizhenyang
 * @date: Mar 29, 2016 1:46:42 PM 
 * @param <M>
 */
public class BaseModel<M> implements Serializable, JCodec<M> {

	public interface Field {
		/**
		 * ID
		 */
		String LISTID = "ListId";
		/**
		 * 创建时间
		 */
		String CREATEEDDATE = "CreateDate";
		/**
		 * 最后修改时间
		 */
		String MODIFIEDDATE = "ModifyDate";
		/**
		 * 描述
		 */
		String DESCRIPTION = "Description";
	}

	protected long listId; // id
	protected Date createdDate; // 创建日期
	protected Date modifyDate = new Date(); // 修改日期,默认当前时间
	protected String description = ""; // 描述，默认""

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Date getModifyDate() {
		return modifyDate;
	}

	public void setModifyDate(Date modifyDate) {
		this.modifyDate = modifyDate;
	}

	public long getListId() {
		return listId;
	}

	public void setListId(long listId) {
		this.listId = listId;
	}

	public Document deJCodec(M entity) {
		// TODO Auto-generated method stub
		BaseModel<M> model = (BaseModel) entity;
		Document doc = new Document();
		doc.put(BaseModel.Field.LISTID, model.getListId());
		doc.put(BaseModel.Field.CREATEEDDATE, model.getCreatedDate());
		doc.put(BaseModel.Field.MODIFIEDDATE, model.getModifyDate());
		doc.put(BaseModel.Field.DESCRIPTION, model.getDescription());
		return doc;
	}

	public M enJCodec(Document doc) {
		// TODO Auto-generated method stub
		return null;
	}
}

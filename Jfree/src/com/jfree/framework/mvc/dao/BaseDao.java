package com.jfree.framework.mvc.dao;

import java.util.ArrayList;
import java.util.List;

import org.bson.Document;

import com.jfree.framework.mvc.model.BaseModel;
import com.jfree.framework.mvc.mongo.MongoDB;
import com.jfree.framework.mvc.mongo.codec.JCodec;
import com.jfree.framework.mvc.mongo.utils.Conditions;
import com.jfree.framework.mvc.mongo.utils.Orders;
import com.jfree.framework.mvc.mongo.utils.QueryConditions;
import com.jfree.framework.mvc.set.QueryForm;
import com.mongodb.client.FindIterable;

/**
 * 
 * @ClassName: BaseDao
 * @Description: TODO 数据层基类
 * @author: leizhenyang
 * @date: Mar 29, 2016 11:53:10 AM
 * @param <M>
 */
public abstract class BaseDao<M extends JCodec> extends MongoDB implements
		IBaseDao<M> {

	/**
	 * 
	 * @Title: getModelInstance
	 * @Description: TODO 获取一个泛型的实例化，用于调用JCodec接口方法
	 * @return
	 * @return: M
	 */
	protected abstract M getModelInstance();

	public M get(long listId) {
		// TODO Auto-generated method stub
		Conditions conditions = new Conditions();
		conditions.put(BaseModel.Field.LISTID, listId);
		FindIterable<Document> results = getCollection().find(conditions);
		for (Document doc : results) {
			return (M) getModelInstance().enJCodec(doc);
		}
		return null;
	}

	public List<M> find(QueryConditions queryConditions) {
		FindIterable<Document> rs = null;
		QueryForm form = new QueryForm();
		Conditions conditions = null;
		Orders orders = null;
		if (null != queryConditions) {
			form = queryConditions.getForm();
			conditions = queryConditions.getConditions();
			orders = queryConditions.getOrders();
		}
		if (null != form && null != conditions && null != orders) {
			rs = getCollection().find(conditions).skip(form.getSkip())
					.limit(form.getRows()).sort(orders);
		} else if (null != form && null != conditions) {
			rs = getCollection().find(conditions).skip(form.getSkip())
					.limit(form.getRows());
		} else if (null != form && null != orders) {
			rs = getCollection().find().skip(form.getSkip())
					.limit(form.getRows()).sort(orders);
		} else {
			rs = getCollection().find().skip(form.getSkip())
					.limit(form.getRows());
		}
		return packaging(rs);
	}

	public void save(M m) {
		Document doc = getModelInstance().deJCodec(m);
		getCollection().insertOne(doc);
	}

	public M modify(M oldModel, M newModel) {
		// getCollection().updateOne();
		return null;
	}

	private List<M> packaging(FindIterable<Document> rs) {
		List<M> list = new ArrayList<M>();
		for (Document doc : rs) {
			list.add((M) getModelInstance().enJCodec(doc));
		}
		return list;
	}

	public long count() {
		return getCollection().count();
	}

	public long count(Conditions conditions) {
		// TODO Auto-generated method stub
		if(null == conditions){
			getCollection().count();
		}
		return getCollection().count(conditions);
	}

}

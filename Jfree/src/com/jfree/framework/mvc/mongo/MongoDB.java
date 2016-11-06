package com.jfree.framework.mvc.mongo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.DependsOn;

import com.jfree.framework.logs.BaseLogger;
import com.jfree.framework.mvc.mongo.connect.MongoSession;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

/**
 * MongoDB连接
 * @ClassName: MongoDB
 * @Description: TODO
 * @author: leizhenyang
 * @date: Mar 29, 2016 1:50:24 PM
 */
@DependsOn(value = "mongoSession")
public abstract class MongoDB extends BaseLogger {
	@Autowired
	private MongoSession mongoSession;
	private MongoDatabase database;
	private MongoCollection collection;

	/**
	 * Database指向
	 * @Title: getCurrentDatabaseName
	 * @Description: TODO
	 * @return
	 * @return: String
	 */
	public abstract String getCurrentDatabaseName();
	/**
	 * Collection指向
	 * @Title: getCollectionName
	 * @Description: TODO
	 * @return
	 * @return: String
	 */
	public abstract String getCollectionName();
	/**
	 * 获取当前Database实例
	 * @Title: getDatabase
	 * @Description: TODO
	 * @return
	 * @return: MongoDatabase
	 */
	public MongoDatabase getDatabase() {
		database = mongoSession.getCurrentDatabase(getCurrentDatabaseName());
		return database;
	}
	/**
	 * 使用新的Database
	 * @Title: useDatabase
	 * @Description: TODO
	 * @param newDataBaseName 新Database名
	 * @return: void
	 */
	public void useDatabase(String newDataBaseName) {
		database = mongoSession.getCurrentDatabase(newDataBaseName);
	}
	/**
	 * 获取当前Database中当前Collection实例
	 * @Title: getCollection
	 * @Description: TODO
	 * @return
	 * @return: MongoCollection
	 */
	public MongoCollection getCollection() {
		if (database == null) {
			getDatabase();
		}
		collection = database.getCollection(getCollectionName());
		return collection;
	}
}

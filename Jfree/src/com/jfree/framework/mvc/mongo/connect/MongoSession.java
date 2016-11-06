package com.jfree.framework.mvc.mongo.connect;

import java.util.Arrays;

import org.springframework.stereotype.Component;

import com.jfree.framework.logs.BaseLogger;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientOptions;
import com.mongodb.MongoCredential;
import com.mongodb.ServerAddress;
import com.mongodb.client.MongoDatabase;

/**
 * @Title: MongoSession
 * @Description: Mongo Session 的组件
 * @CreateTime：Jan 27, 20162:26:32 PM
 * @author leizhenyang
 */
@Component(value="mongoSession")
public class MongoSession extends BaseLogger {

	public MongoSession() {
		// TODO Auto-generated constructor stub
		init();
		logger.info("Load MongoSession Success!");
	}
	private void init() {
		// TODO Auto-generated method stub
		initAddress();
		initCredential();
		initParams();
	}
	/**
	 * mongodb数据库
	 */
	private ServerAddress address;
	private MongoCredential credential;
	private MongoClientOptions options;
	private MongoClient client;
	
	/**
	 * 初始化db地址、端口
	 * @Title: initAddress 
	 * @Description: TODO
	 * @return: void
	 */
	protected void initAddress(){
//		String ip = "192.168.10.200";
		String ip = "10.0.5.199";
		int port = 27017;
		// 创建MongoDB服务器地址对象
		address = new ServerAddress(ip, port);
	}

	/**
	 * 初始化账号、密码、数据库
	 * @Title: initCredential 
	 * @Description: TODO
	 * @return: void
	 */
	protected void initCredential(){
		String defaultDatabse = "jfree";
		String username = "jfree";
		String password = "jfree";
		credential = MongoCredential.createCredential(username,
				defaultDatabse, password.toCharArray());
	}

	/**
	 * 初始化db参数
	 * @Title: initParams 
	 * @Description: TODO
	 * @return: void
	 */
	protected void initParams() {
		int maxConnect = 50;
		int maxConnectThread = 50;
		int timeout = 1 * 60 * 1000;
		int maxWaitTime = 2 * 60 * 1000;
		MongoClientOptions.Builder build = new MongoClientOptions.Builder();
		// 与数据最大连接数50
		build.connectionsPerHost(maxConnect);
		// 如果当前所有的connection都在使用中，则每个connection上可以有50个线程排队等待
		build.threadsAllowedToBlockForConnectionMultiplier(maxConnectThread);
		build.connectTimeout(timeout);
		build.maxWaitTime(maxWaitTime);
		options = build.build();
	}

	/**
	 * 单例模式获取mongo连接
	 * @Title: getSession 
	 * @Description: TODO
	 * @return
	 * @return: MongoClient
	 */
	protected MongoClient getSession(){
		if(client == null){
			client = new MongoClient(address,Arrays.asList(credential), options);
		}
		 return client;
	}

	/**
	 * 使用当前的获取database
	 * @Title: getCurrentDatabase 
	 * @Description: TODO
	 * @param databaseName
	 * @return
	 * @return: MongoDatabase
	 */
	public MongoDatabase getCurrentDatabase(String databaseName) {
		return getSession().getDatabase(databaseName);
	}
}

package com.jfree.framework.commons.properties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;

/**
 * properties文件工具类
 * @ClassName: JProperties 
 * @Description: TODO
 * @author: leizhenyang
 * @date: Mar 29, 2016 2:05:17 PM
 */
public class JProperties {
	private Properties properties;

	/**
	 * 根据物理路径加载properties
	 * @Title: load 
	 * @Description: TODO
	 * @param filePath
	 * @return: void
	 */
	public void load(String filePath) {
		properties = new Properties();
		FileInputStream inputFile;
		try {
			inputFile = new FileInputStream(filePath);
			properties.load(inputFile);
			inputFile.close();
		} catch (FileNotFoundException ex) {
			ex.printStackTrace();
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}

	/**
	 * 根据key获取value
	 * @Title: text 
	 * @Description: TODO
	 * @param key
	 * @return
	 * @return: String
	 */
	public String text(String key) {
		if (properties.containsKey(key)) {
			String value = properties.getProperty(key);// 得到某一属性的值
			return value;
		} else
			return "";
	}

	/**
	 * 获取所有的text
	 * @Title: getAllText 
	 * @Description: TODO
	 * @return
	 * @return: Map<String,String>
	 */
	public Map<String, String> getAllText() {
		Map<String, String> language = new HashMap<String, String>();
		for (Entry<Object, Object> entry : properties.entrySet()) {
			String key = "", value = "";
			if (null != entry.getKey() && null != entry.getValue()) {
				key = entry.getKey().toString();
				value = entry.getValue().toString();
				language.put(key, value);
			}
		}
		return language;
	}
}

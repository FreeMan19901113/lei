package com.jfree.framework.mvc.mongo.utils;

import org.apache.commons.lang.StringUtils;
import org.bson.Document;

/**
 * Mongo Document类的封装基类
 * @ClassName: AbstractDoc 
 * @Description: TODO
 * @author: leizhenyang
 * @date: Mar 29, 2016 1:51:27 PM
 */
public abstract class AbstractDoc extends Document {
	@Override
	public Object put(String key, Object value) {
		// TODO Auto-generated method stub
		if (null == value) {
			return null;
		}
		// obj为字符串并且为空或""时return;
		if (value instanceof String && StringUtils.isEmpty(value.toString())) {
			return null;
		}
		return super.put(key, value);
	}
}

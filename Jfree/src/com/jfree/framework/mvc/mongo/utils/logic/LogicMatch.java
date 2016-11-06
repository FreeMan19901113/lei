package com.jfree.framework.mvc.mongo.utils.logic;

import java.util.regex.Pattern;

import org.apache.commons.lang.StringUtils;

import com.jfree.framework.logs.BaseLogger;

/**
 * MongoDB 逻辑匹配
 * @ClassName: LogicMatch
 * @Description: TODO
 * @author: leizhenyang
 * @date: Mar 29, 2016 1:52:18 PM
 */
public class LogicMatch extends BaseLogger {
	/**
	 * 排序枚举
	 * @ClassName: SORT
	 * @Description: TODO
	 * @author: leizhenyang
	 * @date: Mar 29, 2016 1:52:43 PM
	 */
	public enum SORT {
		/**
		 * 降序
		 */
		DESC(-1),
		/**
		 * 升序
		 */
		ASC(1);
		public int value;

		private SORT(int _value) {
			this.value = _value;
		}
	}

	/**
	 * 正则左模糊匹配
	 * @Title: likeFirst
	 * @Description: TODO
	 * @param value
	 * @return
	 * @return: Pattern
	 */
	public Pattern likeFirst(String value) {
		if (StringUtils.isEmpty(value)) {
			value = "";
		}
		// 右匹配
		Pattern pattern = Pattern.compile("^.*" + value + "$", Pattern.CASE_INSENSITIVE);
		return pattern;
	}
	/**
	 * 正则右模糊匹配
	 * @Title: likeLast
	 * @Description: TODO
	 * @param value
	 * @return
	 * @return: Pattern
	 */
	public Pattern likeLast(String value) {
		if (StringUtils.isEmpty(value)) {
			value = "";
		}
		// 右匹配
		Pattern pattern = Pattern.compile("^" + value + ".*$", Pattern.CASE_INSENSITIVE);
		return pattern;
	}
	/**
	 * 正则全模糊匹配
	 * @Title: like
	 * @Description: TODO
	 * @param value
	 * @return
	 * @return: Pattern
	 */
	public Pattern like(String value) {
		// 模糊匹配
		// obj为空时return
		if (null == value) {
			return null;
		}
		// obj为字符串并且为空或""时return;
		if (value instanceof String && StringUtils.isEmpty(value.toString())) {
			return null;
		}
		Pattern pattern = Pattern.compile("^.*" + value + ".*$", Pattern.CASE_INSENSITIVE);
		return pattern;
	}
}

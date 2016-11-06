package com.jfree.framework.i18n;

import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.SerializationConfig.Feature;

import com.jfree.framework.commons.Path;
import com.jfree.framework.commons.properties.JProperties;

/**
 * @Title: 国际化类
 * @Description 
 * @CreateTime：Aug 27, 201511:00:14 AM
 * @author leizhenyang
 */

/**
 * <b>load()</b>加载，默认中文<br>
 * <b>setLanguage(LANGUAGE language)</b>
 * 更换语言并重新加载新的<b>properties</b>
 * @ClassName: I18n 
 * @Description: TODO
 * @author: leizhenyang
 * @date: Mar 29, 2016 2:03:19 PM
 */
public class I18n {
	/**
	 * 国际化枚举
	 * @ClassName: LANGUAGE 
	 * @Description: TODO
	 * @author: leizhenyang
	 * @date: Mar 29, 2016 2:04:22 PM
	 */
	public enum LANGUAGE {
		/**
		 * 英文
		 */
		LANG_EN(Path.append("/i18n/language_US.properties")),
		/**
		 * 中文
		 */
		LANG_CN(Path.append("/i18n/language_CN.properties"));

		public String value;

		private LANGUAGE(String _value) {
			this.value = _value;
		}
	}

	private static JProperties properties;
	private static LANGUAGE language = LANGUAGE.LANG_EN;

	public static String getLanguage() {
		if (language == LANGUAGE.LANG_CN)
			return "CN";
		else
			return "EN";
	}

	public static String getAllText() throws JsonGenerationException, JsonMappingException, IOException {
		ObjectMapper mapper = new ObjectMapper();
		mapper.configure(Feature.INDENT_OUTPUT,
				Boolean.TRUE);
		String json = mapper.writeValueAsString(properties.getAllText());
		return json;
	}

	/**
	 * 更换语言并重新加载
	 * @Title: changeLanguage 
	 * @Description: TODO
	 * @param language
	 * @return: void
	 */
	public synchronized static void changeLanguage(LANGUAGE language) {
		I18n.load();
		I18n.language = language;
		reload();
	}

	/**
	 * 加载国际化
	 * @Title: load 
	 * @Description: TODO
	 * @return: void
	 */
	public synchronized static void load() {
		if (null == properties) {
			reload();
		}
	}

	/**
	 * 重新加载国际化配置文件
	 * @Title: reload 
	 * @Description: TODO
	 * @return: void
	 */
	public synchronized static void reload() {
		properties = new JProperties();
		properties.load(language.value);
	}

	/**
	 * 获取国际化值
	 * @Title: text 
	 * @Description: TODO
	 * @param key
	 * @return
	 * @return: String
	 */
	public static String text(String key) {
		return properties.text(key);
	}

}

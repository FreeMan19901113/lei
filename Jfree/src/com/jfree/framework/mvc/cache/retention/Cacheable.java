package com.jfree.framework.mvc.cache.retention;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 标注需要使用Redis缓存的方法
 * @ClassName: Cacheable
 * @Description: TODO
 * @author: leizhenyang
 * @date: Mar 29, 2016 2:02:02 PM
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.METHOD })
public @interface Cacheable {
	public enum KeyMode {
		/**
		 * 只有加了@CacheKey的参数,才加入key后缀中
		 */
		DEFAULT,
		/**
		 * 只有基本类型参数,才加入key后缀中,如:String,Integer,Long,Short,Boolean
		 */
		BASIC, 
		/**
		 * 所有参数都加入key后缀
		 */
		ALL;
	}

	/**
	 * 缓存key
	 * @Title: key
	 * @Description: TODO
	 * @return
	 * @return: String
	 */
	public String key() default "";
	/**
	 * key的后缀模式
	 * @Title: keyMode
	 * @Description: TODO
	 * @return
	 * @return: KeyMode
	 */
	public KeyMode keyMode() default KeyMode.DEFAULT;
	/***
	 * 缓存周期,默认无限期
	 * @Title: expire
	 * @Description: TODO
	 * @return
	 * @return: int
	 */
	public int expire() default 0;
}

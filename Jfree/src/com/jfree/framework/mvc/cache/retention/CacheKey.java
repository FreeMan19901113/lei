package com.jfree.framework.mvc.cache.retention;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * redis缓存key的注解
 * @ClassName: CacheKey 
 * @Description: TODO
 * @author: leizhenyang
 * @date: Mar 29, 2016 2:01:37 PM
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.PARAMETER })
public @interface CacheKey {

}

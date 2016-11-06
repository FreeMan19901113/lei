package com.jfree.framework.mvc.interceptor;

import java.util.HashSet;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

/**
 * 访问过滤器
 * @ClassName: SecurityInterceptor 
 * @Description: TODO
 * @author: leizhenyang
 * @date: Mar 29, 2016 1:59:14 PM
 */
public class SecurityInterceptor extends HandlerInterceptorAdapter {
	
	/**
	 * 访问URL例外映射集合
	 */
	public static Set<String> exexcludeMapping = new HashSet<String>();
	public static StringBuffer EXEXCLUDE_URL = new StringBuffer();
	static{
		//不验证的url地址，正则表达式
		exexcludeMapping.add("/error/.*");
		exexcludeMapping.add("/login/.*");
	}
	static{
//		try {
//			Class z = Class.forName("aaa");
//		} catch (ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		//拼接url
//		for (String url : exexcludeMapping) {
//			EXEXCLUDE_URL.append("^").append(url).append("$|");
//		}
	}
	
	private final Logger logger = Logger.getLogger(SecurityInterceptor.class);

	@Override
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler) throws Exception {
		// TODO Auto-generated method stub
		if(request.getServletPath().matches(EXEXCLUDE_URL.toString())){
//			System.out.println("exexclude url : "+request.getServletPath());
		}else{
			request.getSession().getAttribute("user");
		}
		return super.preHandle(request, response, handler);
	}
}

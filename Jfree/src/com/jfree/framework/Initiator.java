package com.jfree.framework;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

import org.apache.log4j.Logger;

import com.jfree.framework.commons.Path;
import com.jfree.framework.i18n.I18n;
import com.jfree.framework.i18n.I18n.LANGUAGE;

/**
 * 初始化
 * @ClassName: Initiator
 * @Description: TODO
 * @author: leizhenyang
 * @date: Mar 29, 2016 1:44:06 PM
 */
public class Initiator extends HttpServlet {
	/**
         * 
         */
	private static final long serialVersionUID = 1L;
	public static ServletContext context;
	private final Logger logger = Logger.getLogger(Initiator.class);

	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		context = getServletContext();
		Path.Root = context.getRealPath("/");
		I18n.changeLanguage(LANGUAGE.LANG_CN);
		logger.info("Load Initator");
	}
}

package com.jfree.framework.commons;

/**
 * 路径
 * @ClassName: Path 
 * @Description: TODO
 * @author: leizhenyang
 * @date: Mar 29, 2016 2:05:03 PM
 */
public class Path {
	
	public static String Root;
	
	private static String Path = "/WEB-INF/classes";

	public static String append(String relPath) {
		return new StringBuilder(Root).append(Path).append(relPath).toString();
	}
}

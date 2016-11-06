package com.jfree.project.bussiness;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @Title: 文件名
 * @Description:  描述
 * @CreateTime：Mar 25, 20165:42:47 PM
 * @author leizhenyang
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({ "classpath*:/spring/spring-mvc.xml",
		"classpath*:/spring/spring-redis.xml" })
public class SpringConfig {

}

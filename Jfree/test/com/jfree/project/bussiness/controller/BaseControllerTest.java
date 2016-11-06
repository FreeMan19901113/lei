package com.jfree.project.bussiness.controller;

import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.jfree.project.bussiness.SpringConfig;

/**
 * @Title: BaseControllerTest
 * @Description:  junit测试基类
 * @CreateTime：Mar 3, 201611:32:46 AM
 * @author leizhenyang
 */
public class BaseControllerTest extends SpringConfig{
	  // 模拟request,response  
    protected MockHttpServletRequest request;  
    
    protected MockHttpServletResponse response;   
    
    @Before    
    public void setUp(){    
        request = new MockHttpServletRequest();      
        request.setCharacterEncoding("UTF-8");      
        response = new MockHttpServletResponse();      
    }     
}

package com.jfree.project.bussiness.controller;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.jfree.framework.mvc.set.ResultSet;
import com.jfree.project.bussiness.form.SysUserQueryForm;

/**
 * @Title: SysUserControllerTest
 * @Description:  SysUserControllerTest类
 * @CreateTime：Mar 2, 20162:24:28 PM
 * @author leizhenyang
 */
public class SysUserControllerTest extends BaseControllerTest{

	@Autowired
	@Qualifier("SysUserController")
    private SysUserController sysUserController;

    @Test  
    public void find() {   
        try {  
        	SysUserQueryForm form = new SysUserQueryForm();
        	form.setPage(1);
        	form.setRows(10);
        	form.setUsername("0");
//        	form.setListId(21l);
        	long start = System.currentTimeMillis();
        	ResultSet set = (ResultSet) sysUserController.find(form);
        	long end = System.currentTimeMillis();
        	System.out.println(end - start + "ms");
        	System.out.println(set);
        	List list =set.getRows();
        	for (Object object : list) {
        		System.out.println(object.toString());
        	}
//         assertEquals(,sysUserController.find(form)) ;   //结果预期
        } catch (Exception e) {  
            e.printStackTrace();  
        }  
    }
}

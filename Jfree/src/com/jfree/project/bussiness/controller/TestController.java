package com.jfree.project.bussiness.controller;

import java.util.ArrayList;
import java.util.List;

import org.junit.runner.Request;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @Title: 文件名
 * @Description: 描述
 * @CreateTime：2016年5月27日下午10:46:27
 * @author leizhenyang
 */
@Controller
@RequestMapping("test")
public class TestController {
	@ResponseBody
	@RequestMapping(method = RequestMethod.POST)
	public String test(@RequestBody A a) {
		return "ab";
	}
}

class A {
	private String aa;
	private List<B> blist = new ArrayList<B>();
	
	public String getAa() {
		return aa;
	}
	public void setAa(String aa) {
		this.aa = aa;
	}
	public List<B> getBlist() {
		return blist;
	}
	public void setBlist(List<B> blist) {
		this.blist = blist;
	}
}

class B {
	private String ba;
	private String bb;
	private String bc;
	private List<C> clist;
	
	public String getBa() {
		return ba;
	}
	public void setBa(String ba) {
		this.ba = ba;
	}
	public String getBb() {
		return bb;
	}
	public void setBb(String bb) {
		this.bb = bb;
	}
	public String getBc() {
		return bc;
	}
	public void setBc(String bc) {
		this.bc = bc;
	}
	public List<C> getClist() {
		return clist;
	}
	public void setClist(List<C> clist) {
		this.clist = clist;
	}
}

class C {
	private String ca;
	private String cb;
	private String cc;
	
	public String getCa() {
		return ca;
	}
	public void setCa(String ca) {
		this.ca = ca;
	}
	public String getCb() {
		return cb;
	}
	public void setCb(String cb) {
		this.cb = cb;
	}
	public String getCc() {
		return cc;
	}
	public void setCc(String cc) {
		this.cc = cc;
	}
}

package com.jfree.design.writeTxt;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @Title: 文件名
 * @Description: 描述
 * @CreateTime：Nov 16, 20156:14:28 PM
 * @author leizhenyang
 */
public interface Test {
	
	String a = "aaa";
/*	private static char j ='啊';
	private int z;
	
	public static void main(String[] agrs) {
		int[] a = {1,2};
		int[] b = a;
		System.out.println(a.equals(b));
		int a = 33333333;
		short x = (char)a;
		long p = a;
		System.out.println(x);
		System.out.println(a);
		System.out.println(p);
		if(b) {
			
		}
//		Test t = new Test();
//		t.t(b);
//		System.out.println((j));
		Arrays.asList(a);
		int a1 = new Integer(10);
		Integer a2 = 1;
		long a3 = 1L;
		new ArrayList().addAll(new ArrayList());
		
		System.arraycopy(src, srcPos, dest, destPos, length);
	}*/
}
abstract class A{
	
	public abstract void work();
	public static void main(String[] args) {
		A a = new A() {

			@Override
			public void work() {
				// TODO Auto-generated method stub
				System.out.println("lala");
			}
		};
		
	}
}

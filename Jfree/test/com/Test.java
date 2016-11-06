package com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.springframework.web.servlet.DispatcherServlet;

/**
 * @Title: 文件名
 * @Description: 描述
 * @CreateTime：Oct 22, 20152:51:19 PM
 * @author leizhenyang
 */
public class Test {
	private ExecutorService pool;
	private Executor pool2;
	private Executor pool3;
	public static void main(String[] args) throws InterruptedException {
		Test t = new Test();
		t.pool = Executors.newCachedThreadPool();//无界线程池，可以进行自动线程回收
//		t.pool2 = Executors.newFixedThreadPool(20);//固定大小线程池
//		t.pool3 = Executors.newSingleThreadExecutor();//单个后台线程
		for (int i = 0; i < 20; i++) {
			t.pool.execute(new Thread(new TestThread(),"Thread"+ i));
		}
		for (int i = 0; i < 20; i++) {
			t.pool.execute(new Thread(new TestThread(),"Thread2"+ i));
		}
	}
}
class TestThread implements Runnable{

	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(1000);
				System.out.println(Thread.currentThread().getName()+"循环第"+(i+1)+"次");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}



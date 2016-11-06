package com;
/**
 * @Title: 文件名
 * @Description: 描述
 * @CreateTime：Oct 16, 20159:27:55 AM
 * @author leizhenyang
 */
public class WaitEntity {
	private String a ="";
		
	public String getA() {
		return a;
	}

	public void setA(String a) {
		this.a = a;
	}
	

	@Override
	public String toString() {
		return "WaitEntity [a=" + a + "]";
	}


	private static Object o = new Object();

	public static void main(String[] args) throws InterruptedException {
		// 异步线程延迟3秒后唤醒Object
		long s = System.currentTimeMillis();
		new WaitEntity().new notifywait().start();
		synchronized (o) {
			System.out.println("wait");
			o.wait(0);
			System.out.println("wait end");
		}
		long e = System.currentTimeMillis();
		System.out.println(e-s);
	}

	class notifywait extends Thread {
		@Override
		public void run() {
			// TODO Auto-generated method stub
			try {
				synchronized (o) {
					Thread.sleep(3000);
					System.out.println("notify");
					o.notify();
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

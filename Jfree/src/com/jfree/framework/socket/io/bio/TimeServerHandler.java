package com.jfree.framework.socket.io.bio;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Title: 文件名
 * @Description: 同步阻塞I/O的TimeServer,服务端处理类
 * @CreateTime：2016年9月6日下午11:50:14
 * @author leizhenyang
 */
public class TimeServerHandler implements Runnable {
	private Socket socket;
	
	public TimeServerHandler(Socket socket) {
		// TODO Auto-generated constructor stub
		this.socket = socket;
	}
	public void run() {
		// TODO Auto-generated method stub
		BufferedReader in = null;
		PrintWriter out = null;
		try {
			in = new BufferedReader(new InputStreamReader(this.socket.getInputStream()));
			out = new PrintWriter(this.socket.getOutputStream(), true);
			String currentTime = null;
			String body = null;
			while (true) {
				body = in.readLine();
				if (body == null) {
					break;
				}
				System.out.println("The time servger receive order : " + body);
				currentTime = "QUERY TIME ORDER".equalsIgnoreCase(body) ? new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
						.format(new Date(System.currentTimeMillis())) : "BAD ORDER";
				out.println(currentTime);
			}
		} catch (Exception e) {
			// TODO: handle exception
			if (in != null) {
				try {
					in.close();
				} catch (Exception e2) {
					// TODO: handle exception
					e2.printStackTrace();
				}
			}
			if (out != null) {
				out.close();
				out = null;
			}
			if (this.socket != null) {
				try {
					this.socket.close();
				} catch (Exception e2) {
					// TODO: handle exception
					e2.printStackTrace();
				}
				this.socket = null;
			}
		}
	}
}

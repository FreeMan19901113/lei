package com.jfree.framework.socket.io.bio;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

/**
 * @Title: 文件名
 * @Description: 同步阻塞I/O的TimeClient
 * @CreateTime：2016年9月7日上午12:04:56
 * @author leizhenyang
 */
public class TimeClient {
	public static void main(String[] args) throws Exception {
		Socket socket = new Socket("localhost", 8080);
		BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		PrintWriter out = new PrintWriter(socket.getOutputStream());
		String msg = "QUERY TIME ORDER";
		out.println(msg);
		out.flush();
		System.out.println(in.readLine());
		socket.close();
	}
}

package com.jfree.framework.mvc.interceptor;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/**
 * @Title: 文件名
 * @Description:  描述
 * @CreateTime：2016年4月17日下午9:16:54
 * @author leizhenyang
 */
public class Test {
	public static void main(String[] args) throws UnsupportedEncodingException {
		String name = "leizhenyang"; //
		int length =  name.getBytes().length; //4
		int test = 1234;
		ByteBuffer buffer = ByteBuffer.allocate(8 + name.getBytes().length);
		buffer.putInt(length);
		buffer.put(name.getBytes());
		buffer.putInt(test);
		buffer.flip();
		int i = buffer.getInt();
		byte[] nameBytes = new byte[i]; 
		buffer.get(nameBytes);
		System.out.println(i);
//		byte b ;
//		System.out.println(buffer.);
//		System.out.println(buffer.get() == (byte) 0);
//		while((b = buffer.get()) > (byte) 0) {
//			System.out.println(b);
//		}
//        byte[] bs = new byte[];
//        buffer.get(bs);
//        Charset cs = Charset.forName ("UTF-8");
//        String news = new String(bs, cs);
//        System.out.println(news);
        
//        String sendString="你好,服务器. ";
//        ByteBuffer sendBuffer=ByteBuffer.wrap(sendString.getBytes("UTF-8"));
//            //从ByteBuffer中读出String
//           Charset cs = Charset.forName ("UTF-8");
//            byte[] bs = new byte[sendBuffer. limit()];
//            sendBuffer.get(bs);
//            String news = new String(bs, cs);
//            System.out.println(news);
    //String news = new String(sendBuffer.array(), cs);
	}
}

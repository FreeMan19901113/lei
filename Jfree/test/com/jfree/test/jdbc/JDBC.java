package com.jfree.test.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * @Title: 文件名
 * @Description: 描述
 * @CreateTime：Mar 29, 20164:31:39 PM
 * @author leizhenyang
 */
public class JDBC {
	private Connection conn;
	private PreparedStatement ps;
	private ResultSet rs;

	public void getConn(String sql) {
		try {
			sql = "select * from sys_user";
			Class.forName("com.mysql.jdbc.Driver");
			//com.mysql.jdbc.Driver
			//oracle.jdbc.dirverOracleDriver;
			conn = DriverManager.getConnection("jdbc:mysql://10.0.5.199:3306/jfree", "tester", "leizhenyang");
			//jdbc:mysql://ip:port/db,
			//jdbc:oracle:thin:@ip:port:sid
			//jdbc:oracle:thin:@10.0.5.199:1521:antispam
			//mysql default port 3306
			//oracle default port 1521
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			while (rs.next()) {
				String name = rs.getString("username");
				System.out.println(name);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				ps.close();
				conn.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
	public static void main(String[] args) {
		JDBC t = new JDBC();
		t.getConn(null);
	}
}

package com.self.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Jdbc获取链接工具类
 * @author Zp
 */
public class JdbcUtil {
	//数据库链接
	private static Connection conn = null;
	
	//数据库驱动
	private static String dbDriver = "oracle.jdbc.driver.OracleDriver";
	
	//数据库Url
	private static String dbUrl = "jdbc:oracle:thin:@localhost:1521:orcl";
	
	//数据库登录用户
	private static String dbUser = "SYSTEM";
	
	//数据库登录密码
	private static String dbPwd = "Zp18716331455";
	
	
	/**
	 * 获取数据库链接
	 * @return 数据库链接
	 */
	public static Connection getConnection() {
		try {
			Class.forName(dbDriver);
			conn = DriverManager.getConnection(dbUrl, dbUser, dbPwd);
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		return conn;
	}
	
	/**
	 * 关闭数据库链接
	 * @param conn 数据库链接
	 */
	public static void close(Connection conn) {
		if(conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				if(conn != null) {
					try {
						conn.close();
					} catch (SQLException e1) {
						e1.printStackTrace();
					}
				}
			}
		}
	}
	
}

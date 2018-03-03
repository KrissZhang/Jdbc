package com.self.test;

import com.self.jdbc.JdbcOper;
import com.self.util.Util;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;


/**
 * Jdbc测试类
 * @author Zp
 */
public class Test {
	
	/**
	 * main函数
	 * @param args args
	 * @throws SQLException SQLException
	 */
	public static void main(String[] args) throws SQLException {
		JdbcOper jdbcOper = new JdbcOper();
		List<Map<String,Object>> list = jdbcOper.queryList();
		for (Map<String, Object> map : list) {
			String id = Util.objToString(map.get("ID"));
			String value = Util.objToString(map.get("VALUE"));
			System.out.println(id+":"+value);
			System.out.println("-----");
		}
	}
	
}

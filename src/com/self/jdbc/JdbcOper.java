package com.self.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 数据操作类
 * @author Zp
 */
public class JdbcOper {	
	
	/**
	 * 查询整张表的数据
	 * @throws SQLException SQL异常
	 */
	public List<Map<String,Object>> queryList() throws SQLException {
		Connection conn = JdbcUtil.getConnection();
		String sql = "SELECT * FROM TEST";
		PreparedStatement ps = conn.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		List<Map<String,Object>> list = new ArrayList<Map<String,Object>>();
		while(rs.next()) {
			Map<String,Object> map = new HashMap<String,Object>();
			map.put("ID", rs.getString("ID"));
			map.put("VALUE", rs.getString("VALUE"));
			list.add(map);
		}
		
		JdbcUtil.close(conn);
		
		return list;
	}
	
}

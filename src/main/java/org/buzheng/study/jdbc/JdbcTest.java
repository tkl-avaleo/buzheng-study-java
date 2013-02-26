package org.buzheng.study.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JdbcTest {

	public static void main(String[] args) throws Exception {
		
		String driverClassName = "";
		String url = "";
		String user = "";
		String password = "";
		String sql = "";
		
		
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			Class.forName(driverClassName);
			conn = DriverManager.getConnection(url, user, password);
			
			ps = conn.prepareStatement(sql);
			ps.setInt(1, 1);
			
			rs = ps.executeQuery();
			
			while (rs.next()) {
				System.out.println(rs.getString("column_name"));
			}
			
		} finally {
			if (rs != null) rs.close();
			if (ps != null) ps.close();
			if (conn != null) conn.close();
		}

	}

}

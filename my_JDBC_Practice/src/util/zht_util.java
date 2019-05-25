package util;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;


public class zht_util {
	static String driverClass = null;
	static String url = null;
	static String name = null;
	static String password = null;
	static {
		try {
			Properties properties = new Properties();
			InputStream is = new FileInputStream("jdbc.properties");
			properties.load(is);
			driverClass = properties.getProperty("driverClass");
			url = properties.getProperty("url");
			name = properties.getProperty("name");
			password = properties.getProperty("password");			
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
	}
		public static Connection getConnection() {
			Connection conn = null;
			try {
				Class.forName(driverClass);
				conn = DriverManager.getConnection(url, name, password);
				
			} catch (ClassNotFoundException | SQLException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
			
			return conn;
		}
		public static void closeConn(Connection conn) {
			try {
				if(conn.isClosed()) {
					return;					
				}else {
					conn.close();
				}
			} catch (SQLException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
		}
		public static void closeRs(ResultSet rs) {
			try {
				if(rs.isClosed()) {
					return;					
				}else {
					rs.close();
				}
			} catch (SQLException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
		}
		public static void closeSt(Statement st) {
			try {
				if(st.isClosed()) {
					return;					
				}else {
					st.close();
				}
			} catch (SQLException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
		}
		public static void release(Connection conn , Statement st , ResultSet rs) {
			closeConn(conn);
			closeRs(rs);
			closeSt(st);
		}
}

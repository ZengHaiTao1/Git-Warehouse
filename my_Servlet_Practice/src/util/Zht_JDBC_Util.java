package util;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;




public class Zht_JDBC_Util {
	static String driverClass = null;
	static String url = null;
	static String name = null;
	static String password = null;
	static {
		try {
			Properties properties = new Properties();
			InputStream is = Zht_JDBC_Util.class.getClassLoader().getResourceAsStream("jdbc.properties");
			properties.load(is);
			driverClass = properties.getProperty("driverClass");
			url = properties.getProperty("url");
			name = properties.getProperty("name");
			password = properties.getProperty("password");
		} catch (IOException e) {
			driverClass = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
			url = "jdbc:sqlserver://localhost:1433;DatabaseName=Performance_management_system";
			name = "sa" ;
			password = "123456789";
		}
		
	}
	
		public static Connection getConnection() {
			Connection conn = null;
			try {
				Class.forName(driverClass);
				conn = DriverManager.getConnection(url,name,password);
				
			} catch (ClassNotFoundException | SQLException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
			
			return conn;
		}
		public static void closeConn(Connection conn){
			try {
				if(conn != null){
					conn.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}finally{
				conn = null;
			}
		}
		public static void closeRs(ResultSet rs) {
			try {
				if(rs != null){
					rs.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}finally{
				rs = null;
			}
		}
		public static void closePs(PreparedStatement ps) {
			try {
				if(ps != null){
					ps.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}finally{
				ps = null;
			}
		}
		public static void closeSt(Statement st) {
			try {
				if(st != null){
					st.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}finally{
				st = null;
			}
		}
		public static void release(Connection conn , ResultSet rs , PreparedStatement ps) {
			closeConn(conn);
			closeRs(rs);
			closePs(ps);
			
		}
		public static void release(Connection conn , Statement st , ResultSet rs) {
			closeConn(conn);
			closeRs(rs);
			closeSt(st);
		}
		public static void release(Connection conn , Statement st ) {
			closeConn(conn);	
			closeSt(st);
		}

}

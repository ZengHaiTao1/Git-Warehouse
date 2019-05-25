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

import com.mchange.v2.c3p0.ComboPooledDataSource;




public class Zht_JDBC_Util2 {
		static ComboPooledDataSource dataSource = null;
		static {
			dataSource= new ComboPooledDataSource();
		}
		public static Connection getConnection() throws SQLException {
			return dataSource.getConnection();
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

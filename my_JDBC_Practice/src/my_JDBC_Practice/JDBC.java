package my_JDBC_Practice;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import util.zht_util;
public class JDBC {

	public static void main(String[] args) throws SQLException {
		// TODO 自动生成的方法存根
			Connection conn  = null;
			Statement st = null;
			ResultSet rs = null; 
			
			try {
				conn= zht_util.getConnection();
				if(conn == null) {
					System.out.println("null");
					return;
				}
				st = conn.createStatement();
				String sql = "select * from Student";
				rs = st.executeQuery(sql);
				while (rs.next()) {
					String stu = rs.getString("学号");
					String name = rs.getString("姓名");
					String sex = rs.getString("性别");
					System.out.println(stu+"号学生"+name+"性别为"+sex);
				}
			} catch (SQLException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}finally {
				zht_util.release(conn, st, rs);				
			}
			
			
	}

}

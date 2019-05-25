package impl;
import java.sql.*;
import dao.UserDao;
import dao.students;
import util.*;
public class UserDaoImpl implements UserDao {
  
	public students login(String id, String password) {
		students stu = new students();
		// TODO 自动生成的方法存根
		try {
			Connection conn = zht_util.getConnection();
			if(conn == null) {
				System.out.println("conn为空");
				return null;
			}
			String sql = "select * from studen where ID = ? and password = ?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, id);
			ps.setString(2, password);
			ResultSet  rs =ps.executeQuery();
			
			if(rs.next()){
				
				stu.setBanji(rs.getString("班级"));
				stu.setName(rs.getString("学生"));
			}else{
				System.out.println("登录失败");
			}
		} catch (SQLException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		return stu;
	}


		
}

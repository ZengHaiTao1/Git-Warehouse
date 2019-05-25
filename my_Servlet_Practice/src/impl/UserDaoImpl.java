package impl;
import java.sql.*;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import dao.UserDao;
import util.*;
public class UserDaoImpl implements UserDao {
  
	public JSONArray login(String id, String password) {
		Connection conn =null;
		PreparedStatement ps = null;
		ResultSet  rs =null;
		// TODO 自动生成的方法存根
		JSONArray jsonarray = null;
		try {
			conn= Zht_JDBC_Util.getConnection();
			String sql = "select * from studen where ID = ? and password = ?";
			 ps = conn.prepareStatement(sql);
			ps.setString(1, id);
			ps.setString(2, password);
			  rs =ps.executeQuery();
			 jsonarray = new JSONArray();
			
			// 展开结果集数据库
			// 通过字段检索
			 while (rs.next()){
	                //通过字段检索
	                // 设置key 和 value put到json对象
				 try {
					 JSONObject jsonobj = new JSONObject();
					jsonobj.put("班级",rs.getString("班级").trim());
					 jsonobj.put("学生",rs.getString("学生").trim());					
					 jsonarray.put(jsonobj); // 把对象放到数组里，容易遍历
				} catch (JSONException e) {
					// TODO 自动生成的 catch 块
					e.printStackTrace();
				}
			 }
				
		} catch (SQLException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}finally {
			Zht_JDBC_Util.release(conn, rs, ps);
		}
		
		return jsonarray;
	}

	@Override
	public boolean register(String banji, String name, String ID, String pastword) {
		boolean key = false;
		Connection conn = null;		
		PreparedStatement ps = null;
		int i = 0;
		try {
			conn = Zht_JDBC_Util.getConnection();
			String sql = "insert into studen values(? ,? , ? , ?)";
			try {
				ps = conn.prepareStatement(sql);
				ps.setString(1, banji);
				ps.setString(2, name);
				ps.setString(3, ID);
				ps.setString(4, pastword);
				i= ps.executeUpdate();
			} catch (SQLException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
			
			 
			if(i>0){
				 key = true;
			}
		}finally {
				Zht_JDBC_Util.closeConn(conn);			
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
		return key;
		
	}




		
}

package impl;

import java.sql.*;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.MapListHandler;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import dao.UserDao;

public class UserDaoImpl2 implements UserDao {

	public JSONArray login(String id, String password) {
		JSONArray jsonarray = new JSONArray();
		QueryRunner queryRunner = new QueryRunner(new ComboPooledDataSource());
			List<Map<String, Object>> list;
			try {
				list = queryRunner.query("select * from studen where ID = ? and password = ?", 
						new MapListHandler(),  
				        id,password);
				for (Iterator<Map<String, Object>> li = list.iterator(); li.hasNext();) {  
	                Map<String, Object> m = li.next();  
	                JSONObject jsonobj = new JSONObject();
	                for (Iterator<Entry<String, Object>> mi = m.entrySet().iterator(); mi.hasNext();) {  
	                    Entry<String, Object> e = mi.next();  
	                    jsonobj.put(e.getKey(),e.getValue().toString().trim());
	                }  
	                jsonarray.put(jsonobj);
	            } 
			} catch (SQLException e1) {
				e1.printStackTrace();
			}  
 catch (JSONException e1) {
				e1.printStackTrace();
			}
		return jsonarray;
		
	}

	@Override
	public boolean register(String banji, String name, String ID, String password) throws SQLException {
		boolean key = false;
		//Connection conn = null;
		int i = 0;
		QueryRunner queryRunner = new QueryRunner(new ComboPooledDataSource());
		try {
			//conn = Zht_JDBC_Util2.getConnection();
			i =queryRunner.update("insert into studen (班级,学生,ID,password) values ( ? ,?, ? , ? )" ,  banji,name,ID,password);
			//i =queryRunner.update(conn, "insert into studen values (？ , ？ , ？ , ？)", banji,name,ID,password);
			if (i > 0) {
				key = true;
			}
		} finally {
			//Zht_JDBC_Util.closeConn(conn);
		}
		return key;

	}

}

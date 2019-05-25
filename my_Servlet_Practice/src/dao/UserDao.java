package dao;

import java.sql.SQLException;

import org.json.JSONArray;

public interface UserDao {
	JSONArray login(String id,String name);
	boolean register(String banji,String name,String ID,String password) throws SQLException;
}

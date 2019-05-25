package Text;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.MapListHandler;
import org.junit.Test;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import util.Zht_JDBC_Util2;




public class mytext {

	@Test
	public void mytest() {
		
		QueryRunner queryRunner = new QueryRunner(new ComboPooledDataSource());
		try {
			//queryRunner.update("update studen set 班级 = ? where 学生 = ?", "1717" , "王磊");
			queryRunner.update("insert into studen (班级,学生,ID,password) values ( ? ,?, ? , ? )" , "1717" , "王磊","123","456");
		} catch (SQLException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		
	}

}

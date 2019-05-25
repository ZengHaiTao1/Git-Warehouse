package my_java_web;
import my_java_web.Student;
import java.sql.Connection;  
import java.sql.DriverManager;  
import java.sql.ResultSet;  
import java.sql.Statement;  
import java.util.ArrayList;  
public class data {
	@SuppressWarnings("finally")
	public ArrayList<Student> queryAllStudents() 
	     {//实现对数据库的访问  
	         Connection conn = null;  
	         ArrayList<Student> students = new ArrayList<Student>();//定义与初始化ArrayList数组，相当于定义数组，但是容量比数组大  
	         
	         try {  
	             //获取连接  
	                 String driverName = "com.microsoft.sqlserver.jdbc.SQLServerDriver";  //加载JDBC驱动   
	                 String dbURL = "jdbc:sqlserver://localhost:1433;DatabaseName=1710";  //连接服务器和数据库sample
	                 //运行SQL语句  
	                 String userName = "sa";  //默认用户名 
	                 String userPwd = "123456789";  
	                 Class.forName(driverName);
	                 conn = DriverManager.getConnection(dbURL, userName, userPwd);
	                 if(conn!=null)
	                 {
	                 System.out.println("Connection Successful!");  //如果连接成功 控制台输出
	                 }
	                 else{
	                 
	                        System.out.println("Connection fail!");  
	                     return students;
	                }
	                 
	             //密码 
	                String sql = "select * from Student";//SQL语句，选择数据表student中的所有数据  
			         Statement stat = conn.createStatement();  
			         ResultSet rs = stat.executeQuery(sql);//定义ResultSet类，用于接收获取的数据  
			        while (rs.next())  
	                 {  
	                      //实例化VO  
	        		Student student=new Student();  
	                  student.setName(rs.getString("姓名"));
	                   student.setBanji(rs.getString("学号"));
	                  student.setSex(rs.getString("性别"));
	                  student.setTime(rs.getString("专业"));
	                   students.add(student);  
	         }  
	                rs.close();  
	        stat.close();  
	                }  
	              catch (Exception e1)   
	            {  
	             e1.printStackTrace();  
	             }  
	         finally  
	         {  
	             try  
	            {		//关闭连接  
	                 if(conn!=null)  
	                 {  
	                     conn.close();  
	                     conn=null;  
	                 }  
	            }  
	             catch(Exception ex)  
	             {  
	             }  
	       return students;    
	    }  
	  }  
}

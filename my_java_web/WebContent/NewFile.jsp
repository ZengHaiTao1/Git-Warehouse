<%@ page language="java" contentType="text/html; charset=GB18030"
    pageEncoding="GB18030"%>
<%@page import = "java.util.*" %>
<%@page import = "java.sql.*" %>
<%@page import="my_java_web.Student" %>  
<%@page import="my_java_web.data" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>  
    <head>  
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">  
               <style type="text/css">  
#body {  
    background-color: #FFD2BD;       
      }     
  </style>  
        <title>JSP Page</title>  
 </head>  
    <body id="body">  
        <h1>学生信息如下所示：</h1><br>  
        <%  
        data studentDao=new data();  
        ArrayList<Student> students=studentDao.queryAllStudents();         
        %>      
        <table  border="1" >  
            <tr >  
                <td >年龄</td>  
                <td>姓名</td>  
                 <td>性别</td>  
                <td>学号</td>  
            </tr>  
            <%  
            for(int i=0;i<students.size();i++)  
            {  
                Student student=(Student)students.get(i);  
              
           %>  
            <tr>  
                <td><%=student.getSex() %></td>  
                <td><%=student.getName() %></td>    
                 <td><%=student.getSex() %></td>  
                <td><%=student.getBanji() %></td>    
            </tr>  
            <%  
            }  
            %>  
        </table>  
    </body>  
</html>
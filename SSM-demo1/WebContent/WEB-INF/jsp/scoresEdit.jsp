<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>修改商品信息</title>
</head>
<body>
	<!-- 上传图片是需要指定属性 enctype="multipart/form-data" -->
	<!-- <form id="itemForm" action="" method="post" enctype="multipart/form-data"> -->
	<form id="scores"
		action="${pageContext.request.contextPath }/updatescores.action"
		method="post" >
		<table width="100%" border=1>
			<tr>
				<td>Id</td>
				<td><input type="text" readonly name = "scores.id" value="${Scores.id }" /></td>
			</tr>
			<tr>
				<td>学生编号</td>
				<td><input type="text" name="scores.studentno"
					value="${Scores.studentno }" /></td>
			</tr>
			<tr>
				<td>课程编号</td>								
				<td><textarea rows="3" cols="30" name="scores.subjectid">${Scores.subjectid }</textarea>
				</td>
			</tr>
			<tr>
				<td>学生分数</td>
				<td><textarea rows="3" cols="30" name="scores.studentscores">${Scores.studentscores }</textarea>
				</td>
			</tr>
			<tr>
				<td>考试时间</td>
				<td><textarea rows="3" cols="30" name="scores.examdate" pattern="yyyy-MM-dd">${Scores.examdate }</textarea>
				</td>
			</tr>
			<tr>
				<td colspan="2" align="center"><input type="submit" value="提交" /></td>
			</tr>
		</table>

	</form>
</body>

</html>
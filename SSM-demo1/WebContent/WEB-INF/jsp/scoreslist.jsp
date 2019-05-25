<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="${pageContext.request.contextPath }/deleteScores.action"  enctype="multipart/form-data"
		method="post">
		查询条件：
		<table width="100%" border=1>
			<tr>
				<td><input type="submit" value="查询" /></td>
			</tr>
		</table>
		商品列表：
		<table width="100%" border=1>
			<tr>
				<td>Id</td>
				<td>学生编号</td>
				<td>课程编号</td>
				<td>学生分数</td>
				<td>考试时间</td>
			</tr>
			<c:forEach items="${Scoreslist}" var="Scores" varStatus="index">
				<tr>
					<td><input type="checkbox" name="integers[${index.index}]" value="${Scores.id}" /></td>
					<td>${Scores.id }</td>
					<td>${Scores.studentno }</td>
					<td>${Scores.subjectid }</td>
					<td>${Scores.studentscores }</td>
					<td><fmt:formatDate value="${Scores.examdate}"
							pattern="yyyy-MM-dd" /></td>
					<td><a
						href="${pageContext.request.contextPath }/scoresEdit/${Scores.id}.action">修改</a></td>
				</tr>
			</c:forEach>
			
		</table>
		<input type="file" name="picFile">
	</form>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>file_management</title>
<link rel="stylesheet" type="text/css" href="css/file_management.css" />
</head>
<body>
<iframe src="navigation_bar.jsp" height="652px" width="157px" frameborder="0" scrolling="no" id="iframe1" ></iframe>
<iframe src="top.jsp" height="105px" width="830px" frameborder="0" scrolling="no" id="iframe2"></iframe>
<div>
	<form action="" id="box">
		<div id="div">
			<p><a href="">全部职员</a></p>
			<c:forEach items="">
				<ul type="disc">
					<li><a href="">销售部</a></li>
				</ul>
			</c:forEach>
		</div>
		<table>
			<tr>
				<th>序号</th>
				<th>档案编号</th>
				<th>姓名</th>
				<th>性别</th>
				<th>部门</th>
				<th>职务</th>
			</tr>
			<tr>
				<c:forEach items="">
					<th><a href=""></a></th>
					<th><a href=""></a></th>
					<th><a href=""></a></th>
					<th><a href=""></a></th>
					<th><a href=""></a></th>
					<th><a href=""></a></th>
				</c:forEach>
			</tr>
		</table>
		<a href=""><button>新建员工档案</button></a>
		<a href=""><button>修改员工档案</button></a>
	</form>
</div>
</body>
</html>
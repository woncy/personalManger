<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'records.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css" />
  </head>
  
  <body style="padding:0px;margin-left:0px;margin-top:0px;">
    <table class="table table-bordered table-hover  table-striped">
   		 <tr style=" ">
			 			<td >　　　</td>
			 			<td>　　　</td>
			 			<td>　　　</td>
			 			<td>　　　</td>
			 			<td>　　　</td>
			 			<td>　　　</td>
			 		</tr>
    	<% for(int i=0;i<10;i++) {%>
			 		<tr >
			 			<td >1</td>
			 			<td>T00001</td>
			 			<td>马先生</td>
			 			<td>男</td>
			 			<td>人事部</td>
			 			<td>经理</td>
			 		</tr>
			 	<%} %>
			 		</table>
  </body>
</html>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="">
<a href= '${pageContext.request.contextPath }/addTrain.jsp'><input type='button' value='添加培训人'/></a>
  <table border="1" cellspecing="0" cellpadding="0">
  	<tr>
  	  <td> 序号</td>
  	  <td>培训名称</td>
  	  <td>培训对象</td>
  	  <td>参训人员</td>
  	  <td>培训时间</td>
  	  <td>培训地点</td>
  	  <td>培训内容</td>
  	  <td>培训单位</td>
  	  <td>培训讲师</td>
			
	</tr>
  
  </table>
</form>


</body>
</html>
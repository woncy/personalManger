<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>file_management</title>
<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css" />
<style type="text/css">

</style>
</head>
<body style="margin-left:0px;margin-top:0px;padding:0px">
<div  class="panel panel-info">
	<div class="panel-heading">
		<div class="btn-group">
		  <button type="button" class="btn btn-default">新建员工档案</button>
		  <button type="button" class="btn btn-default">修改员工档案</button>
		</div>
	</div>
	<div class="panel-body">
	    <div class="row">
		  <div class=" col-sm-3">
		  	全部职员
		  	<select multiple class="form-control">
			  <option>销售部</option>
			  <option>开发部</option>
			  <option>　　VB</option>
			  <option>　　JAVa</option>
			  <option>人事部</option>
			</select>
		  </div>
		  <div class="col-sm-9" >
		  <div class="panel panel-info" id="divId">
			  	<table id="tableId"  class="table table-bordered table-hover  table-striped">
			 		<tr class="info">
			 			<td >序号　　</td>
			 			<td>档案编号</td>
			 			<td>姓名　　</td>
			 			<td>性别　　</td>
			 			<td>部门　　</td>
			 			<td>职务　　</td>
			 
			 		</tr>
			 		
			 		
			 	</table>
			 	
			 				<iframe src="records.jsp" id="iframepage" style="margin-left:0px;margin-top:0px" onload="changeFrameHeight()" marginheight="0" marginwidth="0"></iframe>
			 	
		 	</div>
		 	
		  </div>
		</div>
	</div>
</div>
</body>
<script type="text/javascript">
	function changeFrameHeight(){
    var ifm= document.getElementById("iframepage"); 
    ifm.width=document.getElementById("divId").clientWidth+16;
}
window.onresize=function(){  
     changeFrameHeight();  
} ;
</script>
</html>
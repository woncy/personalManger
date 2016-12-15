<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>main</title>
<link rel="stylesheet" type="text/css" href="css/main.css" />
<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css" />
</head>
<body>
<iframe src="navigation_bar.jsp" height="652px" width="157px" frameborder="0" scrolling="no" class="iframe"></iframe>
<div id="d">

		<iframe id="iframepage" src="top.jsp" onload="changeFrameHeight()" height="105px" frameborder="0" scrolling="no" class="iframe"></iframe>

	<!--  
	<img src="img/back.JPG">
	-->
	<iframe id="content" onload="changeFrameHeight()" height="550" style="margin-top:0px;"src="file_management.jsp" ></iframe>
</div>
</body>
<script type="text/javascript">
	function changeFrameHeight(){
    var ifm= document.getElementById("iframepage"); 
    var ifm2=document.getElementById("content");
    ifm.width=document.getElementById("d").clientWidth;
    ifm2.width=document.getElementById("d").clientWidth;
}
window.onresize=function(){  
     changeFrameHeight();  
} ;
</script>
</html>
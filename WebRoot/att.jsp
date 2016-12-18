<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- 
	private String departmentId;
	private String recordId;
	private String accountId;
	private String explain;
	private String start_date;
	private String end_date;
	private String ratifierId;
	private String ratifierDate;
 -->
<form action="/AddTimeCard.do" method="post">
  <table border="">
  	<tr>
		<td  colspan="2" align="center">
		<input  name="" type="submit"  value="新建"/>
		<input  name="" type="submit"  value="保存"/>
		</td>	
	</tr>
	<tr>
		<td>
		  所在部门：<select name="departmentId" id="">
		       <option value="经理办公室" selected>经理办公室</option>
		       <option></option>
		       <option></option>
		       </select>
		</td>	
		<td>
		 考勤员工：<select name="recordId" id="">
		       <option value="" selected>T00001 马先生</option>
		       <option></option>
		       <option></option>
		       </select>
		</td>
	</tr>
	<tr> 
		<td  colspan="2" align="left">
		考勤类型：<select name="accountId" id="">
	       <option value="" selected>加班</option>
	       <option></option>
	       <option></option>
	       </select>
		</td>	
	</tr>
	<tr> 
		<td   align="left">
		考勤说明：<textarea rows="5" name="explain" cols="20"></textarea>
		</td>	
	</tr>
	<tr>
		<td>
		 开始日期： <input type="date" name="start_date"/> 
		</td>	
		<td>
		结束日期：<input type="date" name="end_date"/> 
		</td>
	</tr>
	<tr>
		<td>
		 批准部门：<select name="" id="">
		       <option value="经理办公室" selected>经理办公室</option>
		       <option></option>
		       <option></option>
		       </select>
		</td>	
		<td>
		 批准人：<select name="ratifierId" id="">
		       <option value="" selected>T00001 马先生</option>
		       <option></option>
		       <option></option>
		       </select>
		</td>
	</tr>
	<tr> 
		<td  colspan="2" align="left">
		批准日期：<input type="date" name="ratifierDate"/>
		</td>	
	</tr>
	
  
  </table>
</form>

</body>
</html>
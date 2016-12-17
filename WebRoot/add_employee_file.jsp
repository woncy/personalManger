
<%@page import="cn.edu.henu.personnelManager.model.Department"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%
String path = request.getContextPath();
 %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>add_employee_file</title>
<!--  
<link rel="stylesheet" type="text/css" href="css/add_employee_file.css" />
-->
<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css" />

</head>
<body onload="change()">
<div class="panel panel-default">
	<form action="<%=path %>/AddRecord.do" target="content" id="box" method="post">
		
		<div id="div1" class="panel-body">
			<div id="div2" class="panel panel-default">
				<div class="panel-heading">档案信息&nbsp;&nbsp;编号:<input type="text" name="record.record_number"/></div>
				<table >
					<tr>
						<td width="60px"> 姓&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;名:</td>
						<td><input type="text" class="form-control" name="record.name"/></td>
						<td>&nbsp;&nbsp;性&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;别:</td>
						<td>&nbsp;&nbsp;
							<input name="record.sex" type="radio" value="男" checked="checked" id="input1"/>男
							<input name="record.sex" type="radio" value="女" checked="checked" id="input1"/>女
						</td>
						<td>&nbsp;&nbsp;出生日期:</td>
						<td><input class="form-control"  type="date" name="birthDay"/></td>
						<td colspan="2" rowspan="5" ></td>
					</tr>
					<tr>
						<td>&nbsp;&nbsp;民&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;族:</td>
						<td>
							<select class="form-control" name="record.nation">
								<option>汉族</option>
								<option>满族</option>
								<option>回族</option>
								<option>维吾尔族</option>
								<option>藏族</option>
							</select>
						</td>
						<td>&nbsp;&nbsp;籍&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;贯:</td>
						<td>
							<select class="form-control" name="record.origin">
								<option>北京市</option>
								<option>河南省</option>
								<option>上海市</option>
								<option>河北省</option>
								<option>山东省</option>
								<option>广东省</option>
								<option>陕西省</option>
								<option>台湾</option>
								<option>香港</option>
							</select>
						</td>
						<td>&nbsp;&nbsp;身份证号:</td>
						<td><input class="form-control" type="text" name="record.ID_card"/></td>
					</tr>
					<tr>
						<td>&nbsp;&nbsp;学&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;历:</td>
						<td>
							<select class="form-control" name="record.school_age">
								<option>本科</option>
								<option>专科</option>
								<option>高中</option>
								<option>初中</option>
								<option>岳云鹏</option>
								<option>新东方厨神</option>
								<option>蓝翔挖掘机</option>
							</select>
						</td>
						<td>&nbsp;&nbsp;专&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;业:</td>
						<td><input class="form-control" type="text" name="record.specialty"/></td>
						<td>&nbsp;&nbsp;政治面貌:</td>
						<td>
							<select class="form-control" name="record.party_member">
								<option>党员</option>
								<option>共青团员</option>
								<option>群众</option>
								<option>法轮功</option>
							</select>
						</td>
					</tr>
					<tr>
						<td>&nbsp;&nbsp;外语语种:</td>
						<td><input class="form-control" type="text" name="record.foreign_language"/></td>
						<td>&nbsp;&nbsp;外语水平:</td>
						<td><input class="form-control" type="text" name="record.grade"/></td>
						<td>&nbsp;&nbsp;婚姻状况:</td>
						<td>&nbsp;&nbsp;
							<input name="record.marriaged" type="radio" value="未婚" checked="checked" id="input1"/>未婚
							<input name="record.marriaged" type="radio" value="已婚" checked="checked" id="input1"/>已婚
						</td>
					</tr>
					<tr>
						<td>&nbsp;&nbsp;邮政编码:</td>
						<td><input class="form-control" type="text" name="record.postalcode"/></td>
						<td>&nbsp;&nbsp;户籍地址:</td>
						<td colspan="3"><input type="text" class="form-control" name="record.address" id="input"/></td>
					</tr>
				</table>
			</div>
			<div id="div3" class="panel panel-default">
			<div class="panel-heading">职务信息</div>
			<table>
					<tr>
						<td>&nbsp;&nbsp;部&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;门:</td>
						<td>
						
						<script type="text/javascript">
								var jobs = new Array();
								var ids = new Array();
								
								<%
									String[][] jobs = (String [][])request.getAttribute("jobs");
									int[][] ids = (int[][])request.getAttribute("job_id");
									int i=0;
									for(i=0;i<jobs.length;i++){
								%>
									jobs[<%=i%>] = new Array();
									ids[<%=i%>] = new Array();
								<%
										for(int j=0;j<jobs[i].length;j++){
								%>
									jobs[<%=i%>][<%=j%>] = "<%=jobs[i][j]%>";
									ids[<%=i%>][<%=j%>] = <%=ids[i][j]%>;
								<%
										}
								%>
								<%
									}
								%>
								
								
						</script>
		
							<select id="dept" class="form-control" name="department"  onchange="change()">
								<c:forEach items="${depts }" var="dept" varStatus="status">
									<option value="${dept.id }">${dept }</option>	
								</c:forEach>
							</select>
						</td>
						<td>&nbsp;&nbsp;职&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;务:</td>
						<td>
							<select id="job" class="form-control" name="jobName">
								
							</select>
							<script type="text/javascript">
								var dept = document.getElementById("dept");
								
								function change(){
									var job = document.getElementById("job");
									document.all.job.options.length = 0;
									for(var i=0;i<dept.length;i++){
										if(dept[i].selected==true){
											for(var j=0;j<jobs[i].length;j++){
												var op = new Option(jobs[i][j],ids[i][j]);
	        									job.options.add(op);
											}
											
										}
									}
								}
								
							</script>
						</td>
						<td>&nbsp;&nbsp;</td>
						<td>&nbsp;&nbsp;</td>
						<td>&nbsp;&nbsp;</td>
						<td>&nbsp;&nbsp;</td>
					</tr>
					<tr>
						<td>&nbsp;&nbsp;入职日期:</td>
						<td><input class="form-control" type="date" name="accession_date"/></td>
						<td>&nbsp;&nbsp;用工形式:</td>
						<td>
							<select class="form-control" name="duty.duty_type">
								<option>合同工</option>
								<option>零工</option>
								<option>黑工</option>
							</select>
						</td>
						<td>&nbsp;&nbsp;离职日期:</td>
						<td><input class="form-control" type="date" name="dimission_date"/></td>
						<td>&nbsp;&nbsp;离职原因:</td>
						<td><input class="form-control" type="text" name="duty.dimission_reason"/></td>
					</tr>
					<tr>
						<td>&nbsp;&nbsp;合同开始:</td>
						<td><input class="form-control" type="date" name="pact_start_date"/></td>
						<td>&nbsp;&nbsp;合同结束:</td>
						<td><input class="form-control" type="date" name="pact_end_date"/></td>
						<td>&nbsp;&nbsp;转正日期:</td>
						<td><input class="form-control" type="date" name="first_pact_date"/></td>
						<td>&nbsp;&nbsp;转正工龄:</td>
						<td><input class="form-control" type="text" name="duty.duty_age"/></td>
					</tr>
					<tr>
						<td>&nbsp;&nbsp;发卡银行:</td>
						<td><input class="form-control" type="text" name="duty.bank_name"/></td>
						<td>&nbsp;&nbsp;社会保险: </td>
						<td><input class="form-control" type="text" name="duty.society_safety_NO"/></td>
						<td>&nbsp;&nbsp;失业保险: </td>
						<td><input class="form-control" type="text" name="duty.dole_safety_NO"/></td>
						<td>&nbsp;&nbsp;养老保险:</td>
						<td><input type="text" class="form-control" name="duty.annuity_safety_NO"/></td>
					</tr>
					<tr>
						<td>&nbsp;&nbsp;信用卡号:</td>
						<td><input type="text" class="form-control" name="duty.bank_NO"/></td>
						<td>&nbsp;&nbsp;医疗保险:</td>
						<td><input type="text" class="form-control" name="duty.mediocate_safety_NO"/></td>
						<td>&nbsp;&nbsp;工伤保险:</td>
						<td><input type="text" class="form-control" name="duty.comopo_safety_No"/></td>
						<td>&nbsp;&nbsp;公积金号:</td>
						<td><input type="text" class="form-control" name="duty.accumulation_fund_NO"/></td>
					</tr>
				</table>
			</div>
			<div id="div4" class="panel panel-default">
			<div class="panel-heading">个人信息</div>
			<table>
					<tr >
						<td>&nbsp;&nbsp;移动电话:</td>
						<td><input class="form-control" type="text" name="personalInfo.telephone"/></td>
						<td>&nbsp;&nbsp;固定电话:</td>
						<td><input  class="form-control" type="text" name="personalInfo.handset"/></td>
						<td>&nbsp;&nbsp;Q&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Q:</td>
						<td><input type="text" class="form-control" name="personalInfo.qQ"/></td>
						<td>&nbsp;&nbsp;电子邮件:</td>
						<td><input type="text" class="form-control" name="personalInfo.email"/></td>
					</tr>
					<tr>
						<td>&nbsp;&nbsp;第二学历:</td>
						<td><input type="text" class="form-control" name="personalInfo.second_school_age"/></td>
						<td>&nbsp;&nbsp;第二专业:</td>
						<td><input type="text" class="form-control" name="personalInfo.second_specilaty"/></td>
						<td>&nbsp;&nbsp;毕业学校:</td>
						<td><input type="text"  class="form-control" name="personalInfo.graduate_school"/></td>
						<td>&nbsp;&nbsp;毕业日期:</td>
						<td><input type="date" class="form-control" name="graduate_school"/></td>
					</tr>
					<tr>
						<td>&nbsp;&nbsp;电脑水平:</td>
						<td><input type="text" class="form-control"  name="personalInfo.computer_grade"/></td>
						<td>&nbsp;&nbsp;爱&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;好:</td>
						<td colspan="5"><input class="form-control" type="text" name="personalInfo.likes" id="input2"/></td>
					</tr>
					<tr>
						<td>&nbsp;&nbsp;入党日期:</td>
						<td><input type="date" name="party_member_date"/></td>
						<td>&nbsp;&nbsp;特&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;长:</td>
						<td colspan="5"><input class="form-control" type="text" name="personalInfo.ones_strong_suit" id="input2"/></td>
					</tr>
					<tr>
						<td>&nbsp;&nbsp;邮政编码:</td>
						<td><input type="text" class="form-control" name="personalInfo.postalcode"/></td>
						<td>&nbsp;&nbsp;家庭住址:</td>
						<td colspan="5"><input type="text" class="form-control" name="personalInfo.address" id="input2"/></td>
					</tr>
				</table>
			</div>
		</div>
		<br/>
		<input type="submit" value="保存"/>
		<a href="main.jsp"><button>退出</button></a>
	</form>
</div>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";

	request.setAttribute("basePath", basePath);

	
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="zh">
<head>
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
<meta name="viewport" content="width=device-width, initial-scale=1.0, minimum-scale=0.5, maximum-scale=2.0, user-scalable=yes" />
<meta charset="utf-8" />
<title>家长预约</title>
<link rel="stylesheet" href="${basePath}/style/weui.css">
<link rel="stylesheet" href="${basePath}/style/custom.css">
</head>

<body>
	<div class="page-title">预约信息</div>

	<form id="submitForm" >
		<div class="weui-cells list-container">
			
			<div class="weui-cell">
				<div class="weui-cell__hd">
					<label class="weui-label">家长姓名</label>
				</div>
				<div class="weui-cell__bd">
					<input class="weui-input" type="text" value="${prelisencurriculum.name}">
				</div>
			</div>
			<div class="weui-cell">
				<div class="weui-cell__hd">
					<label class="weui-label">电话</label>
				</div>
				<div class="weui-cell__bd">
					<input class="weui-input" type="text" value="${prelisencurriculum.phone}">
				</div>
			</div>
			<div class="weui-cell">
				<div class="weui-cell__hd">
					<label class="weui-label">预约课程</label>
				</div>
				<div class="weui-cell__bd">
					<input class="weui-input" type="text" value="${prelisencurriculum.curriculumtname}">
				</div>
			</div>
			<div class="weui-cell">
				<div class="weui-cell__hd">
					<label class="weui-label">预约时间</label>
				</div>
				<div class="weui-cell__bd">
					<input class="weui-input" type="text" value="${prelisencurriculum.nbrdate}">
				</div>
			</div>
			
			<div class="weui-cell">
				<div class="weui-cell__hd">
					<label class="weui-label">宝贝年龄</label>
				</div>
				<div class="weui-cell__bd">
					<input class="weui-input" type="text" value="${prelisencurriculum.age}">
				</div>
			</div>
			
			
		</div>

	</form>

	
	
</body>

</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">

<link href="<s:url value="/css/bootstrap.min.css" />" rel="stylesheet">

<title>Product not found</title>
</head>

<style>
a:hover {
	text-decoration: none;
}

div:hover {
	text-decoration: none;
}
</style>

<body>

	

	<div style="width: 750px; height:300px; margin: auto; margin-top: 20%;">
		<img src="<s:url value="/images/error.jpg" />" alt="Not Found Pic" style = "float:left; height:200px; padding-right:30px;">
		<a href="<s:url value="/html/homepage.jsp" />"> 
		<div style="padding-top: 30px; padding-left: 100px;">
			<div class="h1" style="font-size: 64px; color: #428bca;" >Product not found</div>	
			<div class="h2" style="color: #428bca;">please make sure your input is correct</div>
			<div class="h4" style="width: 160px; margin: auto; color: #428bca; margin-top: 24px;">back to homepage</div>
		</div>	
		</a>
	</div>

	<script src="<s:url value="/js/jquery-2.1.1.js" />"></script>
	<script src="<s:url value="/js/bootstrap.min.js" />"></script>

</body>

</html>

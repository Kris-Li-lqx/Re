<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="s" uri="/struts-tags" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">

	<link href="<s:url value="/css/bootstrap.min.css" />" rel="stylesheet">
	<link href="<s:url value="/css/homepage.css" />" rel="stylesheet">

	<title>Homepage</title>
</head>
<body>
	
    <div class="container text-center">
        <h1 style="margin-bottom: 30px;"> R.M. System  </h1>
        <form action="searchAction" class="form-inline" method="post">
          	<div class="form-group" id="waitlist_email_group">
            	<input class="form-control input-lg waitlist-email" name="productID" placeholder="Please enter the asin of the commodity " size="40">
          	</div>
          	<div class="form-group">
            	<button class="btn btn-lg btn-default" type="submit" style="color:#428bca;">Search</button>
          	</div>
        </form>
    </div>


	<script src="<s:url value="/js/jquery-2.1.1.js" />"></script>
	<script src="<s:url value="/js/bootstrap.min.js" />"></script>

</body>


</html>


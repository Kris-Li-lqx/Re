<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="s" uri="/struts-tags" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">

	<link href="<s:url value="/css/bootstrap.min.css" />" rel="stylesheet">
	<link href="<s:url value="/css/resultPage.css" />" rel="stylesheet">

	<title>Results</title>
</head>
<body>

	<a href="<s:url value="/html/homepage.jsp" />" id="backButton"> try again?</a>	


	<div class="mainDiv">
		<a href="http://www.amazon.com/s?field-keywords=<s:property value="currentProduct.ID"/>" target="_blank">

		<img src="<s:property value='currentProduct.imUrl'/>" alt="It should be an img" class="mainImg">
		<div class="h2" style="padding-top: 48px;">ID : <s:property value="currentProduct.ID"/></div>
		<div class="h3" style="padding-top: 22px;">price : <s:property value="currentProduct.price"/></div>
		<div class="h3" style="padding-top: 22px;">sales Rank : <s:property value="currentProduct.salesRank"/></div>		
		</a>


	</div>


	<div class="h1 alsoLikehead" >Guess you also like: </div>
	<s:iterator value="relatedProducts"  status="st">
		<div class="productItem">
			<a href="http://www.amazon.com/s?field-keywords=<s:property value="ID"/>" target="_blank">
				<img src="<s:property value='imUrl'/>" alt="It should be an img" class="roundImg">
				<div class="h3" style="color: white;">ID : <s:property value="ID"/></div>
				<div class="h5" style="color: white; padding-top: 5px;">price : <s:property value="price"/></div>
				<div class="h5" style="color: white; padding-top: 5px;">sales rank : <s:property value="salesRank"/></div>
				<div class="h5" style="color: white; padding-top: 5px;">regularized correlation : <s:property value="s2"/></div>				
				<div class="h5" style="color: white; padding-top: 5px;">correlation : <s:property value="s1"/></div>
				<div class="h5" style="color: white; padding-top: 5px;">cosine similarity : <s:property value="s3"/></div>
				<div class="h5" style="color: white; padding-top: 5px;">jaccard similarity : <s:property value="s4"/></div>
	
			</a>
		</div>
	</s:iterator> 
	<div style="margin-bottom: 50px;"></div>


	<script src="<s:url value="/js/jquery-2.1.1.js" />"></script>
	<script src="<s:url value="/js/bootstrap.min.js" />"></script>

</body>

</html>


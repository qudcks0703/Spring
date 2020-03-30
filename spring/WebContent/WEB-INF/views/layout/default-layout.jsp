<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
	<tiles:insertAttribute name="head"/>
</head>
<body>
<div class="container" style="margin-top:30px;">
  <div class="jumbotron" style="height:700px;padding:0px;">
  	<tiles:insertAttribute name="content"/>
 
    
  </div> <!-- jumbotron -->
</div>

</body>
</html>
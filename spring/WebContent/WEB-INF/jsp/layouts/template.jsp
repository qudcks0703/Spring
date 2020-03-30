<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <title>제목</title>
   	<tiles:insertAttribute name="top"/>
</head>
<body>
<div class="container" style="margin-top:30px;">
  <div class="jumbotron" style="height:700px;padding:0px;background-color:#FF8000;">
		<nav style="height:15%">
			<tiles:insertAttribute name="nav"/>
		</nav>  
  		<section style="height:70%;background-color:#58ACFA;">
			<tiles:insertAttribute name="content"/>
		</section>
		<footer style="height:15%">
			<tiles:insertAttribute name="footer"/>
		</footer>
  </div> <!-- jumbotron -->
</div>
</body>
</html>
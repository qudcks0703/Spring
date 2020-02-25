<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>로그인</title>
	<link href="/spring/resources/style.css" rel="stylesheet" type="text/css" >
</head>

<c:if test="${memId!=null}">
	<c:redirect url="/member/main.do" />
</c:if>

<c:if test="${memId==null}">
<body>
	<c:if test="${ check !=1}">
		<script>
			alert("돌아가라.");
			history.go(-1);
		</script>
	</c:if>
	<c:if test="${ check==1}">
		<c:redirect url="/member/main.do"/>
	</c:if>

</body>
</c:if>
</html>







<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<form action="updatepro">
		id:${dto.id}<br/>
		pw:<input type="text" name="pw" value="${dto.pw}"><br/>
		name:<input type="text" name="name" value="${dto.name}"><br/>
		age:<input type="text" name="age" value="${dto.age}"><br/>
			<input type="submit" value="회원가입">
	</form>

</body>
</html>
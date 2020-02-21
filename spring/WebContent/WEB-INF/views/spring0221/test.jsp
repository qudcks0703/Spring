<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

count= ${count}<hr/>
max= ${max}<hr/>
<c:forEach var="i" items="${dto}">
아이디 ${i.id }<br/>
패스워드 ${i.pw }<br/>
이름 ${i.name }<br/>
나이 ${i.age }<br/>
</c:forEach>
<hr/>
겟 아이디 ${getid.id}<br/>
겟 패스워드${getid.pw}<hr/>

</body>
</html>
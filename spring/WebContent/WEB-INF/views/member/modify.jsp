<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
	<link href="/spring/resources/style.css" rel="stylesheet" type="text/css" >
</head>
<body>
	<h1 align="center">회원 정보 수정</h1>
	
	<form action="/spring/member/modifypro.do" method="post">
		<table>
			<tr>	
				<td>아이디</td>
				<td><input type="text" name="id" value="${mdto.id}" readonly="readonly"></td>
			</tr>
			<tr>	
				<td>패스워드</td>
				<td><input type="text" name="pw" value="${mdto.pw}" ></td>
			</tr>
			<tr>	
				<td>이름</td>
				<td><input type="text" name="name" value="${mdto.name}" ></td>
			</tr>
			<tr>	
				<td>생년월일</td>
				<td><input type="text" name="birth" value="${mdto.birth}" maxlength="8"></td>
			</tr>
			<tr>	
				<td>이메일</td>
				<td><input type="text" name="email" value="${mdto.email}" ></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="수정"></td>
			</tr>
		</table>
	</form>
</body>
</html>
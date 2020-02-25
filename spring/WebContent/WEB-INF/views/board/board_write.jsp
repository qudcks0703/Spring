<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
	<link href="/spring/resources/style.css" rel="stylesheet" type="text/css">
</head>
<body>
<h1 align="center">글 작성</h1>
<form action="/spring/board/board_writepro.do" method="post">
	<table>
		<tr>
			<td>제목</td>
			<td><input type="text" name="subject"></td>
			<input type="hidden" name="writer" value="${memId}">
		</tr>
		<tr>
			<td>비밀번호</td>
			<td><input type="text" name="pw"></td>
		</tr>
		<tr>
			<td>내용</td>
			<td><textarea name="content" cols="30" rows="15"></textarea></td>
		</tr>
		<tr>
			<td colspan="2"><input type="submit" value="작성"></td>
		</tr>
		
	</table>
</form>


</body>
</html>
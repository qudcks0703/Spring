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
	<h1 align="center"> ${bdto.r}번 게시글 내용</h1>
	
	<table>
		<tr>
			<th>작성자</th>
			<td>${bdto.writer}</td>
		</tr>
		<tr>
			<th>작성 시간</th>
			<td>${bdto.reg}</td>
		</tr>
		<tr>
			<th>제목</th>
			<td>${bdto.subject}</td>
		</tr>
		
		<tr height="100">
			<th>내용</th>
			<td>${bdto.content}</td>
		</tr>
		<c:if test="${bdto.writer==memId}">
			<tr>
				<td colspan="2"><button onclick="window.location.href='/spring/board/board_update.do?num=${bdto.num}'">글 수정</button>&nbsp;		
				<button onclick="/spring/board/board_delete.do?num=${bdto.num}">글 삭제</button></td>		
			</tr>
		</c:if>
		<tr>
			<td colspan="2">
				<c:if test="${bdto.r-1!=0}">
					<button onclick="window.location.href='/spring/board/content.do?num=${bdto.num+1}'"> << </button>
				</c:if>
				<button onclick="window.location.href='/spring/board/board.do'">뒤로 가기</button>
				<c:if test="${size!=bdto.num}">
					<button onclick="window.location.href='/spring/board/content.do?num=${bdto.num-1}'"> >> </button>
				</c:if>
			</td>
		</tr>
		
	</table>
</body>
</html>
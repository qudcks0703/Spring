<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
	<link href="/spring/resources/style.css" rel="stylesheet" type="text/css">
</head>
<body>
<h1 align="center">게시판</h1>
<table>
	<tr>
		<td colspan="4"><button onclick="window.location.href='/spring/board/board_write.do'">글쓰기</button></td>
	</tr>
	<tr>
		<td>번호</td>
		<td>제목</td>
		<td>시간</td>
		<td>조회수</td>
	</tr>
	
	<c:choose>
		<c:when test="${fn:length(bdto)!=0}">
			<c:forEach var="dto" items="${bdto}">
				<tr>
						<td>${dto.r}</td>
						<td><a href="/spring/board/content.do?num=${dto.num}">${dto.subject}
						</a></td>
						<td>${dto.reg}</td>
						<td>${dto.readcount}</td>
				</tr>
			</c:forEach>
		</c:when>
		<c:otherwise>
			<tr>
				<td colspan="4">게시글이 없습니다. 크크루크크 ㅋㅋ</td>
			</tr>
		</c:otherwise>
	</c:choose>
	<tr>
		<td colspan="4">
			<c:forEach var="pageNum" begin="1" end="${number}">	
				<a href="/spring/board/board.do?pageNum=${pageNum}">&nbsp;${pageNum}&nbsp; </a>
			</c:forEach>
		</td>
	</tr>
	
</table>

</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>작성</h1>
	<form action="uploadPro" method="post" enctype="multipart/form-data">
		작성자:<input type="text" name="writer"><br/>
		이미지:<input type="file" name="img"><br/>
		<input type="submit" value="전송">
	</form>
</body>
</html>
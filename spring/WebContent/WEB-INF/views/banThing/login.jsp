<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Insert title here</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
    <!-- 부가적인 테마 -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap-theme.min.css">
    <link rel="stylesheet" href="index.css">

</head>
<body>
  <div class="container">
  <div class="jumbotron" style="margin-top:15%">
    <h1>사이트 이름</h1>
    <p class="lead">회사 간단 요약</p>
  </div>

  <div class="container aa" style="text-align:center">
    <form class="form-signin">
      <h2 class="form-signin-heading">로그인</h2>
      <label for="inputEmail" class="sr-only">Email address</label>
      <input type="email" id="inputEmail" class="form-control" placeholder="Email address" required autofocus>
      <label for="inputPassword" class="sr-only">Password</label>
      <input type="password" id="inputPassword" class="form-control" placeholder="Password" required>
        <label>
        </label>
      <button class="btn btn-lg btn-primary btn-block"
      type="submit">일반 로그인</button>
    </form>
    <a href="#"><img src="naver.png" width="400" height="60"/></a>
    <a href="#"><img src="kakao.png" width="400"/></a>
    <button class="btn btn-lg btn-block"
    type="submit">일반 signup</button>
  </div>
<!--
      <footer class="footer">
        <p>&copy; Company 2020</p>
      </footer> -->

    </div> <!-- /container -->

</body>
</html>
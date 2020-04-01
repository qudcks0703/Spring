<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
 <style>
	 	.name{
			text-align:center;
			margin-top:20px;
		}
		.name>.bts{
			font-size:5em;
		}
		.login{
			margin-top:5%;
			text-align:center;
		}
		#login input[type="text"]{
			font-size:25px;margin-bottom:5px; 
		}
		.btn-setting button{
			font-size:25px;
			margin-bottom:5px;
			width:314px;
		}
	@media (min-width: 768px) {
    #index{
    	margin-left:-35%;
    } 
	}	
 	@media (max-width: 768px) {
 		.name{
 			margin-top:-40px;
 		}
		.login{
			padding-top:10%;
			margin-top:-10%;
		}
	}
 </style>   
<div id="index">
	<div class="name">
		<h1 class="bts">반띵</h1>
		<h1>(로고)</h1>
	</div>
	<div class="login">
		<form id="login">
			<input type="text" name="id" class="btn" placeholder="ID"><br/>
			<input type="text" name="pw" class="btn" placeholder="PW">
		</form>
		<br/>
		<div class="btn-setting">
			<button onclick="window.location.href='map-setting.1'"
			class="btn btn-info">
				일반 로그인
			</button><br/>
			<button class="btn btn-warning">
				카카오톡 로그인
			</button><br/>
			<button class="btn btn-primary">
				페이스북 로그인
			</button><br/>
			<button class="btn btn-success">
				네이버 로그인
			</button><br/>
			<button onclick="window.location.href='signup.1'" class="btn btn-info">
				일반 회원가입
			</button><br/>
		</div>
	</div>
</div>	
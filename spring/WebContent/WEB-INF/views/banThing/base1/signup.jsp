<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<style>
	 	.name{
			text-align:center;
		}
		.name>.bts{
			font-size:5em;
		}
		.login-setting{
			padding-top:5%;
			text-align:center;
		} 
		.login-setting input[type="text"]{
			font-size:25px;
			margin-bottom:5px; 
		}
		.login-setting button{
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
	
	}
</style>   
    
<div id="index">
	<div class="name">
		<h1 class="bts">반띵</h1>
		<h1>(로고)</h1>
	</div>
	<div class="login-setting">
		<form>
			<input type="text" name="id" class="btn" placeholder="아무거나"><br/>
			<input type="text" name="id" class="btn" placeholder="적으세요"><br/>
			<input type="text" name="id" class="btn" placeholder="님들이"><br/>
			<input type="text" name="id" class="btn" placeholder="설정해서"><br/>
			<input type="text" name="id" class="btn" placeholder="오카이?"><br/>
			<button onclick="signup.1" class="btn btn-info">
				회원가입
			</button>
		</form>
	</div>
</div>
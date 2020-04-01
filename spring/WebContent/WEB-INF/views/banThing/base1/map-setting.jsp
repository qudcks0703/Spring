<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<style>
		.map-name{
			text-align:center;
			/* margin-top:-8%; */
		}
		.map-name h1{
			font-size: 72px;
		}
		.map-setting{
			/* padding-top:7%; */
			text-align:center;
		}
		.map-setting button{
			width:30%;
			margin:20px; 
			font-size:20px;
			height:60px;  
		}
		.map-setting select{
			width:60%; 
			font-size:25px;
			height:60px; 
		}
		#address{
			font-size:20px;
		}
		.btn-setting{
			 text-align:center;
			 padding-top:10%;
		}
		.btn-setting button{
			width:200px;
			font-size:40px;
			margin:30px;
		}
@media (min-width: 768px) {
  	#index{
   		margin-left:-35%;
  	} 
}
@media (max-width: 768px) {
	.btn-setting button{
		width:100px;
		font-size:25px;
		margin:30px;
	}
}
	
</style>    

<script src="https://t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js"></script>
<script>
	function address_setting(){
	    new daum.Postcode({
	        oncomplete: function(data) {
	            $("#address").text(data["address"]);
	            console.log(data);
	        }
	    }).open();
	}
</script>
<div id="index">
	<div class="map-name">
		<h1>맵 필터 <br/>설정</h1>
	</div>
	<div class="map-setting">
		<div>
			<button onclick="address_setting()" class="btn">
				주소 설정
			</button>
			 <p id="address"> </p>
		</div>
		<br/>
		<select class="btn">
			<option>카테고리 설정</option>
			<option>안알랴줌2</option>
			<option>안알랴줌3</option>
		</select>
	</div>
	<div class="btn-setting">
		<button onclick="window.location.href='index.2'" 
		class="btn btn-info">
			적용
		</button>
		<button onclick="window.location.href='index.2'"
		class="btn btn-info">
			전체
		</button>
	</div>
</div>
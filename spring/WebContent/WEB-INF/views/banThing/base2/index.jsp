<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>

<style>
	/*팝업창*/


.exit1,.exit2 {
    position: absolute;
    left: 15%;
    bottom: 10px;
    transform: translate(-50%,0);
    text-align: center;
    cursor: pointer;
    font-size: 15px;
}
.room-set {
    position: absolute;
    right: 5%;
    bottom: 10px;
    transform: translate(-50%,0);
    text-align: center;
    cursor: pointer;
    font-size: 15px;
}



/* 아이콘들 셋팅*/
.icon_set{
	display:none;
	position:absolute;
	left:10%;
	background-color:gray;
	width:80%;
	height:100%; 
	text-align:center; 
	padding-top:5%;
}

.table{
	font-size:20px;
}
.table caption{
	text-align:center;
	color:white;
}
.table a{
	color:white;
}

#member-set button{
	font-size:30px;
	margin-bottom:25px;
	width:314px;
}

#room-set{
	display:none;
	margin-top:10px;
	text-align:center;
	font-size:15px;
}

#room_set input[type="text"]{
	margin-top:10px;
	width:75%;
	text-align:left;	
}
#room_set select{
	margin-top:10px;
	width:75%;
}

#left_set,#bottom_set{
	display:none;
	background-color:gray;
}
#address_set{
	padding-top:20%;
	text-align:center;
}
#address_set select{
	width:60%;
	margin20px;
	font-size:25px;
	height:60px;  
}
.btn_set button{
	width:100px;
	font-size:25px;
	margin-left:30px; 
}
#icon-box{
	display: none;
}
/*  768px 이상*/
@media (min-width:768px){
	#popup2 {
	    display: none; /*숨기기*/
	    position: absolute;
	    width: 100%;
	    height: 100%;
	    background: rgba(0,0,0,0.9);
	}
	
	#popmenu2 {
	    position: absolute;
	    left: 50%;
	    top: 50%;
	    transform: translate(-50%,-50%);
	    width: 400px;
	    height: 76%;
	    text-align: center;
	    background: #58ACFA;
	    border-radius: 20px;
	    font-size:25px;
	}
	
	#popmenu2 p {
	    margin-top: 80px;
	}
	
	#popup3 {
	    display: none; /*숨기기*/
	    position: absolute;
	    width: 100%;
	    height: 100%;
	    background: rgba(0,0,0,0.9);
	}
	
	#popmenu3 {
	    position: absolute;
	    left: 50%;
	    top: 50%;
	    transform: translate(-50%,-50%);
	    width: 400px;
	    height: 76%;
	    text-align: center;
	    background: #58ACFA;
	    border-radius: 20px;
	    font-size:25px;
	}
	
	.map-name h1{
		font-size:30px;
		margin-bottom:30px;
	}
	.map-setting p{
		font-size:22px;
	}
	.map-setting button{
		width:60%;
		font-size:23px;
		margin:20px;
	}
	.map-setting select{
		width:60%;
		font-size:23px;
		margin:20px;
	}
	.btn-setting button{
		font-size:25px;
	}
	
	#popup4 {
	    display: none; /*숨기기*/
	    position: absolute;
	    width: 100%;
	    height: 100%;
	    background: rgba(0,0,0,0.9);
	}
	
	#popmenu4 {
	    position: absolute;
	    left: 50%;
	    top: 50%;
	    transform: translate(-50%,-50%);
	    width: 400px;
	    height: 76%;
	    text-align: center;
	    background: #58ACFA;
	    border-radius: 20px;
	    font-size:25px;
	}
	
	#popmenu4 p {
	    margin-top: 80px;
	}
	#popmenu4 h1 {
		font-size: 32px;
	}
	
	
	
	.container .jumbotron, .container-fluid{
	    padding-left: 5px;
	    padding-top:0px;
	    padding-right:0px;
	    padding-bottom:0px;
	}
	.main3{
		font-size:45px;
		width:100%;
		height:100%;
		background-color:#58ACFA;
	}
	.icon-set{
		position:absolute;
		top:10px;
		right:10px;
		font-size:30px;
	}
	#popup1{
		display:none;
	}
	
}
/*  768px 이하*/
@media (max-width: 768px) {
	#popup1 {
	    display: none; /*숨기기*/
	    position: relative;
	    width: 100%;
	    height: 100%;
	    background: rgba(0,0,0,0.9);
	}
	
	#popmenu1 {
	    position: absolute;
	    left: 50%;
	    top: 50%;
	    transform: translate(-50%,-50%);
	    width: 400px;
	    height: 76%;
	    text-align: center;
	    background: #58ACFA;
	    border-radius: 20px;
	    font-size:25px;
	}
	#popup2,#popup3,#popup4{
		display:none;
	}
	
	#popmenu1 p {
	    margin-top: 80px;
	}
	#icon-box{
		display:inline-block;
	}
	.main1{
		font-size:45px;
		width:100%;
		height:100%;
		position:relative;
		background-color:#58ACFA;
	}
	.main2{
		height:100%;
	}
	.main3{
		display:none;
	}
	
}
</style>


<!-- 768px 이하 -->
<div class="main3">

	<!--web-방 개설  -->
	<div id="popup2">
       <div id="popmenu2">
       		<h1 style="color:black"> 방 개설</h1>
           	<form id="room_set">
				<input type="text" class="btn" placeholder="방제목"><br/>
				<select class="btn">
					<option >카테고리 설정</option>
					<option>안알랴줌2</option>
					<option>안알랴줌3</option>
				</select><br/>
				<input type="text" class="btn" placeholder="#해쉬태그">
				<select class="btn">
					<option>구매 방식</option>
					<option>오프라인</option>
					<option>배달</option>
					<option>국내배송</option>
					<option>해외배송</option>
				</select><br/>
				<select class="btn">
					<option>거래 방식</option>
					<option>계좌이체</option>
					<option>안전거래</option>
					<option>협의</option>
				</select><br/>
			</form>
           <button class="btn exit2">닫기</button>
           <button class="btn room-set">개설</button>
       </div>
   </div>
   
	<!--web-맵 필터 설정  -->
	<div id="popup3">
       <div id="popmenu3">
       		<div class="map-name" style="height:20%">
				<h1>맵 필터 <br/>설정</h1>
			</div>
			<div class="map-setting" style="height:60%">
				<button onclick="address_setting()" class="btn">
					주소 설정
				</button>
				 <p id="address"> </p>
				<select class="btn">
					<option>카테고리 설정</option>
					<option>안알랴줌2</option>
					<option>안알랴줌3</option>
				</select>
			</div>
			<div class="btn btn-setting" style="height:20%">
				<button class="btn exit3">닫기</button>
				<button onclick="window.location.href='index.2'" 
				class="btn">
					적용
				</button>
				<button onclick="window.location.href='index.2'"
				class="btn">
					전체
				</button>
			</div>
       </div>
   </div>
	<!--web-현재 방목록  -->
	<div id="popup4">
       <div id="popmenu4">
       		<h1 style="color:black">내 채팅 목록</h1>
       		<table class="table">
		      <tbody>
		        <tr>
		          <td><strong>방 제목</strong></td>
		          <td><strong>인원수</strong></td>
		        </tr>
		      	<tr>
		      		<td><a>안 알려줌</a></td>
		      		<td>1/2</td>
		      	</tr>
		      	<tr>
		      		<td><a>안 알려줌</a></td>
		      		<td>3/5</td>
		      	</tr>
		      </tbody>
		    </table>
       		
           <button class="btn exit2">닫기</button>
       </div>
   </div>
   
   
	<div id="map">
		<h1>사진 넣으셈</h1>
	</div>
	<div class="icon-set">
		<a id="roombox"><i class="fas fa-sms fa-2x"></i></a>
		<a id="mapfilter"><i class="fas fa-filter fa-2x"></i></a>
		<a id="addroom2"><i class="fas fa-plus fa-2x"></i></a>
	</div>	
</div>


<!-- 768px 이하 -->
<div class="main1">
	<div class="main2">
		<!-- 현재 채팅방 설명 -->
		<div id="myroom-set" class="icon_set">
			<table class="table">
		      	<caption>현재 채팅방 목록</caption>
		      <tbody>
		        <tr>
		          <td><strong>방 제목</strong></td>
		          <td><strong>인원수</strong></td>
		        </tr>
		      	<tr>
		      		<td><a>안 알려줌</a></td>
		      		<td>1/2</td>
		      	</tr>
		      	<tr>
		      		<td><a>안 알려줌</a></td>
		      		<td>3/5</td>
		      	</tr>
		      </tbody>
		    </table>
		</div>
		<!-- 알림창 설명-->
		<div id="notice-set" class="icon_set">
			<table class="table">
		      <thead>
		        <tr>
		          <th>~~~님이 #ㅋㅋ로 방을 개설 했습니다</th>
		        </tr>
		        <tr>
		          <th>~~~님이 ○○○방에 참여하였습니다.</th>
		        </tr>
		        <tr>
		          <th>앙 기모딱따구리 ~</th>
		        </tr>
		      </thead>
		    </table>
		</div>
		<!-- 회원정보창 설명-->
		<div id="member-set" class="icon_set">
			<button class="btn btn-warning">
				로그 아웃
			</button><br/>
			<button class="btn btn-warning">
				사용자 정보 변경
			</button><br/>
			<button class="btn btn-warning">
				알림 설정
			</button><br/>
			<button class="btn btn-warning">
				친구 목록
			</button><br/>
		</div>
	 	<!-- 방개설 -->
	 	<div id="popup1">
	       <div id="popmenu1">
	       		<h1 style="color:black"> 방 개설</h1>
	           	<form id="room_set">
					<input type="text" class="btn" placeholder="방제목"><br/>
					<select class="btn">
						<option >카테고리 설정</option>
						<option>안알랴줌2</option>
						<option>안알랴줌3</option>
					</select><br/>
					<input type="text" class="btn" placeholder="#해쉬태그">
					<select class="btn">
						<option>구매 방식</option>
						<option>오프라인</option>
						<option>배달</option>
						<option>국내배송</option>
						<option>해외배송</option>
					</select><br/>
					<select class="btn">
						<option>거래 방식</option>
						<option>계좌이체</option>
						<option>안전거래</option>
						<option>협의</option>
					</select><br/>
				</form>
	           <button class="btn exit1">닫기</button>
	           <button class="btn room-set">개설</button>
	       </div>
	   </div>
   
		 <!-- 왼쪽 화살표 -->
		<div id="left_set" style="width:80%;height:100%;">
			<div id="address_set">
				<select class="btn">
					<option>주소 설정</option>
					<option>안알랴줌2</option>
					<option>안알랴줌3</option>
				</select>
				<br/>
				<select class="btn">
					<option>카테고리 설정</option>
					<option>안알랴줌2</option>
					<option>안알랴줌3</option>
				</select>
			</div>
			<div class="btn_set" style="padding-top:20%;">
				<button class="btn btn-info" style="float:left;">
					적용
				</button>
				<button class="btn btn-info" style="float:right;margin-right:''">
					전체
				</button>
			</div>
		</div>
		
		 <!-- 오른쪽 화살표 설명-->
		<div id="bottom_set" style="width:100%;height:80%;top:10%;position:absolute; ">
		 
			<table class="table">
		      <thead>
		        <tr>
		          <th>#</th>
		          <th>제목</th>
		          <th>방 인원</th>
		          <th>거래방법</th>
		          <th>알림 설정</th>
		        </tr>
		      </thead>
		      <tbody>
		        <tr>
		          <th scope="row">1</th>
		          <td>하이룽</td>
		          <td>1/3</td>
		          <td>안전거래</td>
		          <td><i class="far fa-bell"></i></td>
		        </tr>
		        <tr>
		          <th scope="row">2</th>
		          <td>방가방가</td>
		          <td>2/6</td>
		          <td>직거래</td>
		          <td><i class="far fa-bell"></i></td>
		        </tr>
		        <tr>
		          <th scope="row">3</th>
		          <td>유니클로 공동구매</td>
		          <td>4/5</td>
		          <td>카카오페이</td>
		          <td><i class="far fa-bell"></i></td>
		        </tr>
		        <tr>
		          <th scope="row">4</th>
		          <td>심심해욤</td>
		          <td>1/2</td>
		          <td>직거래</td>
		          <td><i class="far fa-bell"></i></td>
		        </tr>
		        <tr>
		          <th scope="row">5</th>
		          <td>여친구함</td>
		          <td>1/2</td>
		          <td>직거래</td>
		          <td><i class="far fa-bell"></i></td>
		        </tr>
		    </table>
		</div>
		<div id="icon-box">
			<!-- 맵 넣는곳 -->
			<div id="map" style="left:30%;top:0px;position:absolute;">
				사진 넣으세요
			</div>
			<!--  왼쪽 화살표 -->
			<div style="left:0px;top:50%;position:absolute;">
				<a id="left" href="#"  style="color:#2E2E2E;"><i class="fas fa-arrow-right"></i></a>
			</div>
			<!--  아래 화살표 -->
			<div style="bottom:0px;left:50%;position:absolute;margin-bottom:-13px;"  >
				<a id="bottom" href="#" style="color:#2E2E2E;"><i class="fas fa-arrow-up"></i></a>
			</div>
		</div>
	</div>
</div>

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
<script>
	$(document).ready(function(){
		var count=0;
		var left=function(){
			$("#bottom,#map").toggle(500);
			$("#left_set").toggle(500);
		},
			bottom=function(){
			$("#left,#map").toggle(500);
			$("#bottom_set").toggle(500);
		},
			member=function(){
			init();
			$("#member-set").toggle(500);
		},
			notice=function(){
			init();
			$("#notice-set").toggle(500);
		},
			myroom=function(){
			init();
			$("#myroom-set").toggle(500);
		},
			addroom1=function(){
			$("#bottom-set,#left-set").hide();
            $("#popup1").fadeIn();
        },
       		addroom2=function(){
            $("#popup2").fadeIn();
        },
        	mapfilter=function(){
            $("#popup3").fadeIn();
        },
        	roombox=function(){
            $("#popup4").fadeIn();
        },
        	exit1=function(){
            $("#popup1").fadeOut();
        },
        	exit2=function(){
            $("#popup2").fadeOut();
            $("#popup4").fadeOut();
        },
        	exit3=function(){
        	$("#popup3").fadeOut();
        };
			
		
		function init(){
			if(count==0){
				count++;
				$("#left,#map,#bottom").hide(500);	
			}else{
				count--;
				$("#left,#map,#bottom").show(500);				
			}
		}
		
		//버튼에 따른 작동법
		$("#left").click(left);
		$("#bottom").click(bottom);
		$("#member").click(member);
		$("#notice").click(notice);
		$("#myroom").click(myroom);
		$("#addroom1").click(addroom1);
		$("#addroom2").click(addroom2);
		$("#mapfilter").click(mapfilter);
		$("#roombox").click(roombox);
		$(".exit1").click(exit1);
		$(".exit2").click(exit2);
		$(".exit3").click(exit3);
	})
	
</script>
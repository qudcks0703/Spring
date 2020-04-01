<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <title>제목</title>
   	<tiles:insertAttribute name="top"/>
	<style>
		.jumbotron{
			height:700px;
			background-color:#FF8000;
		}
		.container{
			margin-top:30px;
		}
		@media (min-width: 768px) {
			#nav{
				position:absolute;
				width:25%;
				height:90%;
			}
			#section{
				position:relative;
				left:25%;
				width:74.8888%;
				height:100%;
			}
		}			
		@media (max-width: 768px) {
			.jumbotron{
				padding: 0px 0px;
			}
			#nav{
				height:15%;
			}
			#section{ 
				height:70%;
			}
			#footer{
				height:15%
			}
				  /* #nav,#section,#footer{
		    display: none;
		  } */
		}
 	</style>
</head>
<body>
<div class="container">
  <div class="jumbotron">
		<nav id="nav">
			<tiles:insertAttribute name="nav"/>
		</nav>  
  		<section id="section">
			<tiles:insertAttribute name="content"/>
		</section>
		<footer id="footer">
			<tiles:insertAttribute name="footer"/>
		</footer>
  </div> <!-- jumbotron -->
</div>
</body>
</html>
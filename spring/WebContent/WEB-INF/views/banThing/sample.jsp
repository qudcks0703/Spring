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
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.8.2/css/all.min.css" />
</head>
<body>
<div class="container" >
  <div class="jumbotron" style="height:700px;padding:0px;">
    <nav class="navbar navbar-default" style="height:10%;">
      <div class="container-fluid">
        <div class="navbar-header">
          <div class="rows" style="margin-top:10px;">
            <div class="col-xs-4" style="text-align:left;">
              <i class="far fa-user fa-4x"></i>
            </div>
            <div class="col-xs-4">
              <i class="fab fa-google fa-4x"></i>
            </div>
            <div class="col-xs-4">
              <i class="fas fa-plus fa-4x"></i>
            </div>
          </div>
        </div>
      </div><!--/.container-fluid -->
    </nav>

    <div class="container" style="height:60%">
      <div id="map" style="width: 80%; height: 600px;position: absolute">
      </div>
    </div>
  </div> <!-- /container -->
</div>
<script type="text/javascript" src="https://openapi.map.naver.com/openapi/v3/maps.js?ncpClientId=m7nji7tukz"></script>
<script>
var mapoption={
  center: new N.LatLng(37.480801, 126.951274),
  zoom: 15,
  mapTypeControl: true
}
var map = new N.Map('map', mapoption);
</script>

</body>
</html>
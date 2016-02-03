<%@page contentType="text/html;charset=UTF-8"%>
<%@page pageEncoding="UTF-8"%>
<%@ page session="false" %>
<jsp:useBean id="now" class="java.util.Date" scope="request" />
<!DOCTYPE html>   
<head>
	<meta charset="utf-8">
	<link rel="stylesheet" type="text/css" href="bootstrap/css/bootstrap.min.css">
	<link rel="stylesheet" type="text/css" href="bootstrap/fonts/css/font-awesome.css">
	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
	<title>EMPSSAPAL</title>
	<link rel="icon" href="images/favicon.ico" type="image/x-icon" />

</head>
<body  >
  <form style="background-color: aqua;">

<center><fieldset>PRESUPUESTOS DE INSTALACIONES</fieldset></center>
<br>
<center><label>Instalaciones de agua</label></center>
<p title="Instalaciones de agua">
<button type="button" class="form-control">Instalacion agua 15</button>
<button type="button" class="form-control">Instalacion agua 20</button>
<button type="button" class="form-control">Instalacion agua 25</button>
<button type="button" class="form-control">Instalacion agua 38</button>
</p>
<br>
<center><label>Instalaciones de alcantarillado</label></center>
<p title="Instalaciones de alcantarillado">
<button type="button" class="form-control">Instalacion alcantarillado  6</button>
<button type="button" class="form-control">Instalacion alcantarillado 160</button>
<button type="button" class="form-control">Instalacion alcantarillado 200</button>
</p>
</form>
  
</body>



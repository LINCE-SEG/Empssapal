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
<!-- !Body -->
<body  >
  
  

<div class="col-md-6">
	
	<form:form modelAttribute="Agua" action="guardar" role="form">
		<h2>Formulario de 6</h2>
		<div class="form-group">
			<label for="exampleInputEmail1">Titular</label>
			<input type="text" name="interesado" value="" placeholder="Nombre y Apellidos"><br><br>
			<input type="date" name="fecha" value=""><br><br>
			<label for="exampleInputEmail1">Distancia</label>
			<input type="number" name="Distancia" placeholder="Distancia">
			<br><br>
			<label for="exampleInputEmail1">Vereda</label>
				<select name="vereda" > 
					<option value="3">Sin vereda</option>
					<option value="4">Con vereda</option>
				</select>
			<br>
			<br>
			<label for="exampleInputEmail1">Tipo de pista</label>
				<select name="pista" > 
					<option value="4">Tierra</option>
					<option value="5">Asfalto</option>
					<option value="6">Concreto</option>
				</select>
			<br>
			<br>
			<label for="exampleInputEmail1">Tipo de red</label>
				<select name="empalmered" > 
					<option value="12">8</option>
					<option value="13">10</option>
				</select>
			<br>
			<input type="text" name="vereda" value="2" disabled="disabled"><br><br>
			<input type="text" name="diametroagua" value="2" disabled="disabled"><br><br>
			<input type="text" name="eliminacionexedente" value="2" disabled="disabled"><br><br>
			<input type="text" name="relleno" value="2" disabled="disabled"><br><br>
			<input type="text" name="camaapoyo" value="2" disabled="disabled"><br><br>
			<input type="text" name="pruebahidraulica" value="2" disabled="disabled"><br><br>
			<input type="text" name="excavacion" value="2" disabled="disabled"><br><br>
			
			
		</div>
		<button type="submit" class="btn btn-primary">Siguiente</button>

	</form:form>
	

</div>
</body>

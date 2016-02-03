<%@ include file="/WEB-INF/jsp/include/taglibs.jsp"%>
<br>
<center>
<label >Costos por pruebas</label>
</center>
<div class="nav navbar-nav navbar-right">
<button type="button" class="btn btn-primary">
		<i class="fa fa-file-o "></i>  
<!-- 		                     -->
Reporte Precios
</button>
</div>
<br>
<br>
<display:table name="${Pruebahidrahulica}" id="Pruebahidrahulica" requestURI="/dashboard" class="table">

	
	<display:column title="Servicio" property="nombreservicioprueba" />
	<display:column title="Precio" property="costoprueba" />

	
		<display:column title="accion">
		<a href="../Pruebahidrahulica/${Pruebahidrahulica.id}" class="btn btn-primary" >
		<i  class="fa fa-pencil-square-o"></i>
		Modificar Precio</a>
		</display:column>

</display:table>
<br>


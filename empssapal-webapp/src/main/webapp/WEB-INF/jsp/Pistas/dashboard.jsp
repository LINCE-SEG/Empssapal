<%@ include file="/WEB-INF/jsp/include/taglibs.jsp"%>
<br>
<center>
<label >Costos por pista</label>
</center>
<br>
<br>
<display:table name="${Pruebahidrahulica}" id="Pruebahidrahulica" requestURI="/dashboard" class="table">

	
	<display:column title="Servicio" property="nombreservicioprueba" />
	<display:column title="Precio" property="costoprueba" />

	
		<display:column title="accion">
		<a href="../Pruebahidrahulica/${Pruebahidrahulica.id}" class="btn btn-primary" >
		<i  class="fa fa-pencil-square-o"></i>
		Modificar Precio
		</a>
		</display:column>

</display:table>
<br>


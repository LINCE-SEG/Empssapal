<%@ include file="/WEB-INF/jsp/include/taglibs.jsp"%>
<br>
<center>
<label >Costos por roturas de pistas</label>
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
<display:table name="${Rotura}" id="Rotura" requestURI="/dashboard" class="table">

	
	<display:column title="Nombre" property="nombrerotura" />
	<display:column title="Servicio" property="tiposerviciorotura" />
	<display:column title="Precio" property="costorotura" />

	
		<display:column title="accion">
		<a href="../Rotura/${Rotura.id}" class="btn btn-primary" >
		<i  class="fa fa-pencil-square-o"></i>
		Modificar Precio</a>
		</display:column>

</display:table>
<br>

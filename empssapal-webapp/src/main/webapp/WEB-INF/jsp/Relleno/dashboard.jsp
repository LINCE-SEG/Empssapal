<%@ include file="/WEB-INF/jsp/include/taglibs.jsp"%>
<br>
<center>
<label >Costos por rellenos</label>
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
<display:table name="${Relleno}" id="Relleno" requestURI="/dashboard" class="table">

	
	<display:column title="Servicio" property="tiposerviciorelleno" />
	<display:column title="Precio" property="costorelleno" />

	
		<display:column title="accion">
		<a href="../Relleno/${Relleno.id}" class="btn btn-primary" >
		<i  class="fa fa-pencil-square-o"></i>
		Modificar Precio</a>
		</display:column>

</display:table>
<br>

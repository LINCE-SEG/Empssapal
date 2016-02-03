<%@ include file="/WEB-INF/jsp/include/taglibs.jsp"%>
<br>
<center>
<label >Costos por tendido</label>
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
<display:table name="${Tendido}" id="Tendido" requestURI="/dashboard" class="table">

	
	<display:column title="Nombre" property="nombretendido" />
	<display:column title="Servicio" property="tiposerviciotendido" />
	<display:column title="Precio" property="costotendido" />

	
		<display:column title="accion">
		<a href="../Tendido/${Tendido.id}" class="btn btn-primary" >
		<i  class="fa fa-pencil-square-o"></i>
		Modificar Precio</a>
		</display:column>

</display:table>
<br>

<%@ include file="/WEB-INF/jsp/include/taglibs.jsp"%>
<br>
<center>
<label >Costos por reposiciones de pistas</label>
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
<display:table name="${Reposicion}" id="Reposicion" requestURI="/dashboard" class="table">

	
	<display:column title="Nombre" property="nombrereposicion" />
	<display:column title="Servicio" property="tiposervicioreposicion" />
	<display:column title="Precio" property="costoreposicion" />

	
		<display:column title="accion">
		<a href="../Reposicion/${Reposicion.id}" class="btn btn-primary" >
		<i  class="fa fa-pencil-square-o"></i>
		Modificar Precio</a>
		</display:column>

</display:table>
<br>

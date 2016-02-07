<%@ include file="/WEB-INF/jsp/include/taglibs.jsp"%>
<center>
<label >Costos por eliminacion de material excedente</label>
</center>

<br>
<br>
<display:table name="${Eliminacionmaterialexedente}" id="Eliminacionmaterialexedente" requestURI="/dashboard" class="table">

	
	<display:column title="Servicio" property="tiposervicioeliminacion" />
	<display:column title="Precio" property="costoeliminacion" />

	
		<display:column title="accion">
		<a href="../Eliminacionmaterialexedente/${Eliminacionmaterialexedente.id}" class="btn btn-primary" >
		<i  class="fa fa-pencil-square-o"></i>
		Modificar Precio</a>
		</display:column>


</display:table>
<br>

<%@ include file="/WEB-INF/jsp/include/taglibs.jsp"%>
<br>
<center>
<label >Costos por vereda</label>
</center>

<br>
<br>
<display:table name="${Vereda}" id="Vereda" requestURI="/dashboard" class="table">

	
	<display:column title="Nombre" property="nombrevere" />
	<display:column title="Servicio" property="tiposerviciovere" />
	<display:column title="Precio" property="costovere" />

	
		<display:column title="accion">
		<a href="../Vereda/${Vereda.id}" class="btn btn-primary" >
		<i  class="fa fa-pencil-square-o"></i>
		Modificar Precio</a>
		</display:column>

</display:table>
<br>
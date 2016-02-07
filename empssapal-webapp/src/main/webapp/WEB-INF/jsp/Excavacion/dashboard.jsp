<%@ include file="/WEB-INF/jsp/include/taglibs.jsp"%>

<br>
<center>
<label >Costos por excavaciones</label>
</center>

<br>
<br>
<display:table name="${listexcavacion}" id="Excavacion" requestURI="/dashboard" class="table">

	
	<display:column title="ServicicioExcavacion" property="servicicioexcavacion" />
	<display:column title="PrecioExcavacion" property="precioexcavacion" />

	
		<display:column title="accion">
		<a href="../Excavacion/${Excavacion.id}" class="btn btn-primary" >
		<i  class="fa fa-pencil-square-o"></i>
		Modificar Precio</a>
		</display:column>

</display:table>
<br>



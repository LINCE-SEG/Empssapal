<%@ include file="/WEB-INF/jsp/include/taglibs.jsp"%>
<center>
<label >Camas de apoyo</label>
</center>

<br>
<br>
<display:table name="${Camaapoyo}" id="Camaapoyo" requestURI="/dashboard" class="table">

	
	<display:column title="Servicio" property="serviciocama" />
	<display:column title="Precio" property="preciocama" />

	<display:column title="accion">
		<a href="../Camaapoyo/${Camaapoyo.id}" class="btn btn-primary" >
		<i  class="fa fa-pencil-square-o"></i>
		Modificar Precio</a>
	</display:column>

</display:table>
<br>

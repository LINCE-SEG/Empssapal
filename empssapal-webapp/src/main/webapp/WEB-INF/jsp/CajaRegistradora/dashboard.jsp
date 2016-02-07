<%@ include file="/WEB-INF/jsp/include/taglibs.jsp"%>

<center>
<label >Cajas registradoras para alcantarillado</label>
</center>

<br>
<br>
<display:table name="${CajaRegistradora}" id="CajaRegistradora" requestURI="/dashboard" class="table">
	
	<display:column title="Tipo Caja" property="nombrecajaregistradora" />
	<display:column title="Precio" property="preciocajaregistradora" />

		<display:column title="accion">
		<a href="../CajaRegistradora/${CajaRegistradora.id}" class="btn btn-primary" >
		<i  class="fa fa-pencil-square-o"></i>
		Modificar Precio</a>
		</display:column>
</display:table>
<br>

<%@ include file="/WEB-INF/jsp/include/taglibs.jsp"%>

<br>
<center>

<label >Costos de caja medidor para agua</label>
</center>

<br><br><br>
<display:table name="${Cajamedidor}" id="Cajamedidor" requestURI="/dashboard" class="table table-condensed">

	
	<display:column title="Tipo de caja medidor" property="nombrecajamedidor" class="active"/>
	<display:column title="Precio" property="preciocajamedidor" class="warning" />

	
		<display:column title="accion">
		<a href="../Cajamedidor/${Cajamedidor.id}" class="btn btn-primary" >
		<i  class="fa fa-pencil-square-o"></i>
		Modificar Precio</a>
		</display:column>

</display:table>
<br>



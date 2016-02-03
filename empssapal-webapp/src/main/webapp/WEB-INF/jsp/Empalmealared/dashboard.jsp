<%@ include file="/WEB-INF/jsp/include/taglibs.jsp"%>
<script src="../bootstrap/js/jquery-1.11.1.min.js"></script>
<script src="../bootstrap/js/datatables.js"></script>

<center>
<label >Tipo de empalme a red</label>
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
<display:table name="${Empalmealared}" id="Empalmealared" requestURI="/dashboard"  class="table">

	
	<display:column title="Nombre Diametro" property="nombrediametro" />
	<display:column title="Tipo de red" property="tipoempalme" />
	<display:column title="Servicio" property="tiposervicioempalme" />
	<display:column title="Precio" property="precioempalme" />

	
		<display:column title="accion">
		<a href="../Empalmealared/${Empalmealared.id}" class="btn btn-primary" >
		<i  class="fa fa-pencil-square-o"></i>
		Modificar Precio</a>
		</display:column>


</display:table>
<br>
<script>
	$('#Empalmealared').DataTable();
</script>
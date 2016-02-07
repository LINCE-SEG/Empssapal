<%@ include file="/WEB-INF/jsp/include/taglibs.jsp"%>
<center><button type="button" class="btn btn-primary" onclick="window.print()"> INFORME GENERAL</button></center>
<center>
<label > Costos por  caja medidor para agua</label>
</center>
<display:table name="${Cajamedidor}" id="Cajamedidor" requestURI="/dashboard" class="table">
	<display:column title="Tipo de caja medidor" property="nombrecajamedidor" class="active"/>
	<display:column title="Precio" property="preciocajamedidor" class="warning" />
</display:table>
<center>
<label > Costos por cajas registradoras para alcantarillado</label>
</center>
<display:table name="${CajaRegistradora}" id="CajaRegistradora" requestURI="/dashboard" class="table">
	<display:column title="Tipo Caja" property="nombrecajaregistradora" class="active"/>
	<display:column title="Precio" property="preciocajaregistradora" class="warning"/>
</display:table>
<center>
<label > Costos por camas de apoyo</label>
</center>
<display:table name="${Camaapoyo}" id="Camaapoyo" requestURI="/dashboard"  class="table">
	<display:column title="Servicio" property="serviciocama" class="active"/>
	<display:column title="Precio" property="preciocama" class="warning"/>
</display:table>

<center>
<label > Costos por eliminacion de material excedente</label>
</center>
<display:table name="${Eliminacionmaterialexedente}" id="Eliminacionmaterialexedente" requestURI="/dashboard" class="table">
	<display:column title="Servicio" property="tiposervicioeliminacion" class="active"/>
	<display:column title="Precio" property="costoeliminacion" class="warning"/>
</display:table>
<center>
<br>
<br>
<br>
<br>
<br>
<br>
<label >Costos por Tipo de empalme a red</label>
</center>
<display:table name="${Empalmealared}" id="Empalmealared" requestURI="/dashboard"  class="table">
	<display:column title="Nombre Diametro" property="nombrediametro" class="active"/>
	<display:column title="Tipo de red" property="tipoempalme" class="warning"/>
	<display:column title="Servicio" property="tiposervicioempalme" class="active"/>
	<display:column title="Precio" property="precioempalme" class="warning"/>
</display:table>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>

<center>
<label >Costos por excavaciones</label>
</center>
<display:table name="${listexcavacion}" id="Excavacion" requestURI="/dashboard" class="table">
	<display:column title="ServicicioExcavacion" property="servicicioexcavacion" class="active"/>
	<display:column title="PrecioExcavacion" property="precioexcavacion" class="warning"/>
</display:table>
<center>
<label >Costos por pruebas</label>
</center>
<display:table name="${Pruebahidrahulica}" id="Pruebahidrahulica" requestURI="/dashboard" class="table">
	<display:column title="Servicio" property="nombreservicioprueba" class="active"/>
	<display:column title="Precio" property="costoprueba" class="warning"/>
</display:table>
<center>
<label >Costos por rellenos</label>
</center>
<display:table name="${Relleno}" id="Relleno" requestURI="/dashboard" class="table">
	<display:column title="Servicio" property="tiposerviciorelleno" class="active"/>
	<display:column title="Precio" property="costorelleno" class="warning"/>
</display:table>
<center>
<label >Costos por reposiciones de pistas</label>
</center>
<display:table name="${Reposicion}" id="Reposicion" requestURI="/dashboard" class="table">
	<display:column title="Nombre" property="nombrereposicion" class="warning"/>
	<display:column title="Servicio" property="tiposervicioreposicion" class="active"/>
	<display:column title="Precio" property="costoreposicion" class="warning"/>
</display:table>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>

<center>
<label >Costos por roturas de pistas</label>
</center>
	<display:table name="${Rotura}" id="Rotura" requestURI="/dashboard" class="table">
			<display:column title="Nombre" property="nombrerotura" class="warning" />
			<display:column title="Servicio" property="tiposerviciorotura" class="active" />
			<display:column title="Precio" property="costorotura" class="warning"/>
	</display:table>
<center>
<label >Costos por tendido</label>
</center>
<display:table name="${Tendido}" id="Tendido" requestURI="/dashboard" class="table">
	<display:column title="Nombre" property="nombretendido" class="active" />
	<display:column title="Servicio" property="tiposerviciotendido" class="warning" />
	<display:column title="Precio" property="costotendido" class="active" />
</display:table>
<center>
<label >Costos por vereda</label>
</center>
<display:table name="${Vereda}" id="Vereda" requestURI="/dashboard" class="table">
	<display:column title="Nombre" property="nombrevere" class="active" />
	<display:column title="Servicio" property="tiposerviciovere" class="warning"/>
	<display:column title="Precio" property="costovere" class="active" />
</display:table>

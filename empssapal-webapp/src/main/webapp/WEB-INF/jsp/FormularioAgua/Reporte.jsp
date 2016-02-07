<%@ include file="/WEB-INF/jsp/include/taglibs.jsp"%>
<script src="../../bootstrap/js/jspdf.debug.js"></script>
<center>
<label>EMPSSAPAL-sicuani  "AÑO DE LA CONSOLIDACION DEL MAR DE GRAU"</label>
</center>
<label>===========================================================================================================================================</label>
<label>REPORTE DE PRE SUPUESTO DE INSTALACION DE AGUA</label>
<br>	
	<table border="8">
		<label>TITULAR           : </label>
		<tr>${FormularioAgua.interesado}</tr>
		<br>
		<label>FECHA INSTALACION : </label>
		<tr>${FormularioAgua.fecha}</tr>
		<br>
		<label>DISTANCIA         : </label>
		<tr>${FormularioAgua.distancia}</tr>
	
	</table >
<center>	
	<table border="4">
		<tr>
			<td>CONCEPTO DE:</td>
			<td>UNIDAD DE MEDIDA</td>
			<td>PRECIO UNITARIO</td>
			<td>PRECIO TOTAL</td>
		</tr>
		<tr >
			<td>Vereda</td>
			<td>Unidad</td>
			<td>${vereda.costovere}</td>
			<td>${VeredaPrecioXdistancia}</td>
		</tr>
		
		<tr >
			<td>Costo por Pista (incluye rotura y reposicion de pista)</td>
			<td>Metros</td>
			<td>${pistas.costopista}</td>
			<td>${pistatotal}</td>
		</tr>
		
		<tr>
			<td>Costo por Excavacion</td>
			<td>Metros</td>
			<td>${excavacion.precioexcavacion}</td>
			<td>${excavaciontotal}</td>
		</tr>
		
		<tr>
			<td>Costo por Cama de apoyo</td>
			<td>Metros</td>
			<td> ${camaapoyo.preciocama}</td>
			<td>${camaapoyototal}</td>
			
		</tr>
		<tr>
			<td>Costo por diametros tendido tuberia</td>
			<td>Metros</td>
			<td>${tendido.costotendido}</td>
			<td>${tendidototal}</td>
		</tr>
		<tr>
			<td>Costo por caja medidor</td>
			<td>Unidad</td>
			<td>${cajamedidor.preciocajamedidor}</td>
			<td>${totalcajamedidor}</td>
		</tr>
		<tr>
			<td>Costo por empalme a red</td>
			<td>Unidad</td>
			<td>${empalmeared.precioempalme}</td>
			<td>${totalempalmeared}</td>
		</tr>
		<tr>
			<td>Costo por relleno y compactacion</td>
			<td>Metros</td>
			<td>${relleno.costorelleno}</td>
			<td>${totalrelleno}</td>
		</tr>
		<tr>
			<td>Costo por eliminacion de material excedente</td>
			<td>Metros</td>
			<td>${eliminacion.costoeliminacion}</td>
			<td>${totaleliminacion}</td>
		</tr>
		<tr>
			<td>Costo por Prueba hidrahulica</td>
			<td>Metros</td>
			<td>${prueba.costoprueba}</td>
			<td>${totalprueba}</td>
		</tr>
		<tr>
			<td></td>
			<td></td>
			<td>COSTO TOTAL :</td>
			<td>${total}</td>
		</tr>
	</table>


</center>
<br>
<center><button type="button" class="btn btn-primary" onclick="window.print()">Descargar</button></center>







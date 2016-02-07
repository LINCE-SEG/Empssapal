<%@ include file="/WEB-INF/jsp/include/taglibs.jsp"%>
<script src="../../bootstrap/js/jspdf.debug.js"></script>

<center>
	<label>EMPSSAPAL-SICUANI  "AÑO DE LA CONSOLIDACION DEL MAR DE GRAU"</label>
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
		<tr>${FormularioAgua.distancia} - Metros</tr>
	
	</table >
<center>	
	<table border="4">
		<tr>
			<td>CONCEPTO DE:</td>
			<td>UNIDAD DE MEDIDA</td>
			<td>PRECIO UNITARIO</td>
			<td>C.U</td>
			<td>PRECIO TOTAL</td>
		</tr>
		<tr >
			<td>Vereda</td>
			<td>Unidad</td>
			<td>${vereda.costovere}</td>
			<td>1</td>
			<td>${VeredaPrecioXdistancia}</td>
		</tr>
		
		<tr >
			<td>Costo por Pista (incluye rotura y reposicion de pista)</td>
			<td>Metros Cuadrados</td>
			<td>${pistas.costopista}</td>
			<td>${Medida}</td>
			<td>${pistatotal}</td>
		</tr>
		
		<tr>
			<td>Costo por Excavacion</td>
			<td>Metros Lineales </td>
			<td>${excavacion.precioexcavacion}</td>
			<td>${FormularioAgua.distancia}</td>
			<td>${excavaciontotal}</td>
		</tr>
		
		<tr>
			<td>Costo por Cama de apoyo</td>
			<td>Metros Lineales </td>
			<td>${camaapoyo.preciocama}</td>
			<td>${FormularioAgua.distancia}</td>
			<td>${camaapoyototal}</td>
			
		</tr>
		<tr>
			<td>Costo por diametros tendido tuberia</td>
			<td>Metros Lineales </td>
			<td>${tendido.costotendido}</td>
			<td>${FormularioAgua.distancia}</td>
			<td>${tendidototal}</td>
		</tr>
		<tr>
			<td>Costo por caja medidor</td>
			<td>Unidad</td>
			<td>${cajamedidor.preciocajamedidor}</td>
			<td>1</td>
			<td>${totalcajamedidor}</td>
		</tr>
		<tr>
			<td>Costo por empalme a red</td>
			<td>Unidad</td>
			<td>${empalmeared.precioempalme}</td>
			<td>1</td>
			<td>${totalempalmeared}</td>
		</tr>
		<tr>
			<td>Costo por relleno y compactacion</td>
			<td>Metros Lineales </td>
			<td>${relleno.costorelleno}</td>
			<td>${FormularioAgua.distancia}</td>
			<td>${totalrelleno}</td>
		</tr>
		<tr>
			<td>Costo por eliminacion de material excedente</td>
			<td>Metros Lineales </td>
			<td>${eliminacion.costoeliminacion}</td>
			<td>${FormularioAgua.distancia}</td>
			<td>${totaleliminacion}</td>
		</tr>
		<tr>
			<td>Costo por Prueba hidrahulica</td>
			<td>Metros Lineales </td>
			<td>${prueba.costoprueba}</td>
			<td>${FormularioAgua.distancia}</td>
			<td>${totalprueba}</td>
		</tr>
		<tr>
			<td></td>
			<td></td>
			<td></td>
			<td>VALOR VENTA :</td>
			<td>${total}</td>
			<td></td>
		</tr>
		
		<tr>
			<td></td>
			<td></td>
			<td></td>
			<td>IGV :</td>
			<td>${igv}</td>
		</tr>
		
		<tr>
			<td></td>
			<td></td>
			<td></td>
			<td>TOTAL A PAGAR :</td>
			<td>${importetotal}</td>
			
		</tr>
	</table>


</center>
<br>
<br>
<br>
NOTA:
<br>
El costo por pista incluye la reposicion y rotura de la pista.
<br>
el costo por rotura es de: ${rotura.costorotura} Soles, por metros lineales
<br>
el costo por reposicion es de: ${reposicion.costoreposicion} Soles, por metros lineales

<br>
<br>
<br>
<br>
<br>
<br>
<center>COMPROMISO</center>
<center>
Yo  <tr>${FormularioAgua.interesado}</tr>  en señal de conformidad con las caracteristicas de la instalacion del servicio.
</center>

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
<br>
<br>
<br>
<br>
<center>
===========================
<br><tr>${FormularioAgua.interesado}</tr><br>
<tr>TITULAR</tr>
<br></center>

<br>
<center><button type="button" class="btn btn-primary" onclick="window.print()">Descargar</button></center>
<br>




<%@ include file="/WEB-INF/jsp/include/taglibs.jsp"%>
<script src="../../bootstrap/js/jspdf.debug.js"></script>
<center>
<label>EMPSSAPAL-SICUANI  "AÑO DE LA CONSOLIDACION DEL MAR DE GRAU"</label>
</center>
<label>===========================================================================================================================================</label>
<label>REPORTE DE PRE SUPUESTO DE INSTALACION DE ALCANTARILLADO</label>
<br>	
	<table border="8">
	
		<label>TITULAR           : </label>
		<tr>${FormularioAlcantarillado.interesado}</tr>
		<br>
		<label>FECHA INSTALACION : </label>
		<tr>${FormularioAlcantarillado.fecha}</tr>
		<br>
		<label>DISTANCIA         : </label>
		<tr>${FormularioAlcantarillado.distancia} - Metros</tr>
	
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
			<td>Metros</td>
			<td>${pistas.costopista}</td>
			<td>${Medida}</td>
			<td>${pistatotal}</td>
		</tr>
		
		<tr>
			<td>Costo por Excavacion</td>
			<td>Metros</td>
			<td>${excavacion.precioexcavacion}</td>
			<td>${FormularioAlcantarillado.distancia}</td>
			<td>${excavaciontotal}</td>
		</tr>
		
		<tr>
			<td>Costo por Cama de apoyo</td>
			<td>Metros</td>
			<td> ${camaapoyo.preciocama}</td>
			<td>${FormularioAlcantarillado.distancia}</td>
			<td>${camaapoyototal}</td>
			
		</tr>
		<tr>
			<td>Costo por diametros tendido tuberia</td>
			<td>Metros</td>
			<td>${tendido.costotendido}</td>
			<td>${FormularioAlcantarillado.distancia}</td>
			<td>${tendidototal}</td>
		</tr>
		<tr>
			<td>Costo por caja Registradora</td>
			<td>Unidad</td>
			<td>${cajaregistradora.preciocajaregistradora}</td>
			<td>${FormularioAlcantarillado.distancia}</td>
			<td>${totalcajaregistradora}</td>
		</tr>
		<tr>
			<td>Costo por empalme a red</td>
			<td>Unidad</td>
			<td>${empalmeared.precioempalme}</td>
			<td>${FormularioAlcantarillado.distancia}</td>
			<td>${totalempalmeared}</td>
		</tr>
		<tr>
			<td>Costo por relleno y compactacion</td>
			<td>Metros</td>
			<td>${relleno.costorelleno}</td>
			<td>${FormularioAlcantarillado.distancia}</td>
			<td>${totalrelleno}</td>
		</tr>
		<tr>
			<td>Costo por eliminacion de material excedente</td>
			<td>Metros</td>
			<td>${eliminacion.costoeliminacion}</td>
			<td>${FormularioAlcantarillado.distancia}</td>
			<td>${totaleliminacion}</td>
		</tr>
		<tr>
			<td>Costo por Prueba hidrahulica</td>
			<td>Metros</td>
			<td>${prueba.costoprueba}</td>
			<td>${FormularioAlcantarillado.distancia}</td>
			<td>${totalprueba}</td>
		</tr>
		<tr>
			<td></td>
			<td></td>
			<td></td>
			<td>VALOR VENTA :</td>
			<td>${total}</td>
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
Yo  <tr>${FormularioAlcantarillado.interesado}</tr>  en señal de conformidad con las caracteristicas de la instalacion del servicio.
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
<br><tr>${FormularioAlcantarillado.interesado}</tr><br>
<tr>TITULAR</tr>
<br></center><br>
<center><button type="button" class="btn btn-primary" onclick="window.print()">Descargar</button></center>
<br>




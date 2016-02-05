<%@ include file="/WEB-INF/jsp/include/taglibs.jsp"%>
<script src="../../bootstrap/js/jspdf.debug.js"></script>
<center>
<label>EMPSSAPAL  "AÑO DE LA CONSOLIDACION PERU"</label>
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
		<tr>
		<input  value="${FormularioAgua.distancia}"   type="text" id="valor2" onload="pistatotales();" disabled></input>	
		</tr>
	
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
			<td>
			
<!-- 			Quitamos el for porque del controlador solo se envia solo Objetos NO LISTA DE OBJETOS es mucha camba y hace que el server sea lento-->
<%-- 					<c:forEach items="${Veredas}" var="i"> --%>
<%-- 					      <p><input  value="${i.costovere}"  disabled></input></p>	 --%>
<%-- 				    </c:forEach> --%>

					      <p><input  value="${vereda.costovere}"  disabled></input></p>	

		    </td>
			<td>

<!-- 			Quitamos el for -->
<%-- 					<c:forEach items="${Veredas}" var="i"> --%>
<%-- 					      <p><input  value="${i.costovere}"  disabled></input></p>	 --%>
<%-- 				    </c:forEach> --%>

					      <p><input  value="${VeredaPrecioXdistancia}"  disabled></input></p>	
		   
			</td>
		</tr>
		<tr >
			<td>Costo por Pista (incluye rotura y reposicion de pista)</td>
			<td>Metros</td>
			<td>
					<c:forEach items="${pistas}" var="i">
					      <p><input  value="${i.costopista}" type="text" id="valor1" onload="pistatotales();" disabled></input></p>	
				    </c:forEach>
		    </td>
			<td>
					<p><input type="text" id="totalpista"  value="0" disabled></input></p>	
			</td>
		</tr>
		<tr>
			<td>Costo por Excavacion</td>
			<td>Metros</td>
			<td>
				 <c:forEach items="${excavacion}" var="i">
					      <p><input  value="${i.precioexcavacion}" disabled></input></p>	
				 </c:forEach>
			</td>
			<td>precio unitario por cantidad</td>
		</tr>
		<tr>
			<td>Costo por Cama de apoyo</td>
			<td>Metros</td>
			<td>
				 <c:forEach items="${camaapoyo}" var="i">
					      <p><input  value="${i.preciocama}" disabled></input></p>	
				 </c:forEach>
			</td>
			<td>precio unitario por cantidad</td>
		</tr>
		<tr>
			<td>Costo por diametros tendido tuberia</td>
			<td>Metros</td>
			<td>
				 <c:forEach items="${tendido}" var="i">
					      <p><input  value="${i.costotendido}" disabled></input></p>	
				 </c:forEach>
			</td>
			<td>precio unitario por cantidad</td>
		</tr>
		<tr>
			<td>Costo por caja medidor</td>
			<td>Unidad</td>
			<td>
				 <c:forEach items="${cajamedidor}" var="i">
					      <p><input  value="${i.preciocajamedidor}" disabled></input></p>	
				 </c:forEach>
			</td>
			<td>
				 <c:forEach items="${cajamedidor}" var="i">
					      <p><input  value="${i.preciocajamedidor}" disabled></input></p>	
				 </c:forEach>
			</td>
		</tr>
		<tr>
			<td>Costo por empalme a red</td>
			<td>Unidad</td>
			<td>
					 <c:forEach items="${empalmeared}" var="i">
						      <p><input value="${i.precioempalme}" disabled></input></p>	
					 </c:forEach>
			</td>
			<td>
					 <c:forEach items="${empalmeared}" var="i">
						      <p><input value="${i.precioempalme}" disabled></input></p>	
					 </c:forEach>
			</td>
		</tr>
		<tr>
			<td>Costo por relleno y compactacion</td>
			<td>Metros</td>
			<td>
			 		 <c:forEach items="${relleno}" var="i">
						      <p><input  value="${i.costorelleno}" disabled></input></p>	
					 </c:forEach>
			</td>
			<td>precio unitario por cantidad</td>
		</tr>
		<tr>
			<td>Costo por eliminacion de material excedente</td>
			<td>Metros</td>
			<td>
			 		 <c:forEach items="${eliminacion}" var="i">
						      <p><input  value="${i.costoeliminacion}" disabled></input></p>	
					 </c:forEach>
			</td>
			<td>precio unitario por cantidad</td>
		</tr>
		<tr>
			<td>Costo por Prueba hidrahulica</td>
			<td>Metros</td>
			<td>
			 		 <c:forEach items="${prueba}" var="i">
						      <p><input  value="${i.costoprueba}" disabled></input></p>	
					 </c:forEach>
			</td>
			<td>precio unitario por cantidad</td>
		</tr>
		<tr>
			<td></td>
			<td></td>
			<td>COSTO TOTAL :</td>
			<td>23121</td>
		</tr>
	</table>


</center>
<br>
<center><button type="button" class="btn btn-primary" onclick="window.print()">Descargar</button></center>







    <script type="text/javascript">
		function pistatotales(){
			var valor1=verificar("valor1");
			var valor2=verificar("valor2");
			document.getElementById("totalpista").value=parseFloat(valor1)*parseFloat(valor2);
         }
		
		

    function verificar(id)
    {
        var obj=document.getElementById(id);
        if(obj.value=="")
            value="0";
        else
            value=obj.value;
        if(validate_importe(value,1))
        {
            // marcamos como erroneo

            obj.style.borderColor="#808080";
            return value;
        }else{
            // marcamos como erroneo

            obj.style.borderColor="#f00";
            return 0;
        }
    }
    function validate_importe(value,decimal)
    {
        if(decimal==undefined)
            decimal=0;
 
        if(decimal==1)
        {
            // Permite decimales tanto por . como por ,

            var patron=new RegExp("^[0-9]+((,|\.)[0-9]{1,2})?$");
        }else{
            // Numero entero normal

            var patron=new RegExp("^([0-9])*$")
        }
 
        if(value && value.search(patron)==0)
        {
            return true;
        }
        return false;
    }
     
    </script>  


<%@ include file="/WEB-INF/jsp/include/taglibs.jsp"%>
<div class="col-md-12">

	<div class="col-md-12">

		<form:form modelAttribute="FormularioAgua" action="guardar20">
			<h2>Formulario de 20</h2>
			
			<div class="col-md-6">
				<div class="panel panel-primary">
					<div class="panel-heading">
						<h3 class="panel-title">Datos Instalacion</h3>
					</div>
					<div class="panel-body">
						<div class="form-group">
							<label for="codresolucion">Titular</label>
							<form:input path="interesado" class="form-control"
								placeholder="Titular" autofocus="autofocus" required="required" />
						</div>
						<div class="form-group">
							<label for="exampleInputEmail1">Fecha Consultada</label>
							<form:input path="fecha" class="form-control"
								placeholder="Fecha" type="date" autofocus="autofocus" required="required" />
						</div>
						<div class="form-group">
							<label for="exampleInputEmail1">Distancia</label>
							<form:input path="distancia" class="form-control"
								placeholder="Distancia" type="number" autofocus="autofocus" required="required" />
						</div>
					</div>
				</div>

			</div>
			<div class="col-md-6">
				<div class="panel panel-primary">
					<div class="panel-heading">
						<h3 class="panel-title">Tipo de instalacion</h3>
					</div>
					<div class="panel-body">
						<div class="form-group">
										<label for="exampleInputEmail1">Vereda</label> 
										<form:select path="vereda.id"  cssClass="form-control"
			 								items="${veredas}" itemLabel="nombrevere" itemValue="id"> 
			 							</form:select> 
						</div>
			
						<div class="form-group">
										<label for="exampleInputEmail1">Tipo de Pista</label> 
										<form:select path="pista.id" cssClass="form-control"
			 								items="${pistas}" itemLabel="nombrepista" itemValue="id"> 
			 							</form:select> 
						</div>
						<div class="form-group">
										<label for="exampleInputEmail1">Tipo de empalme a red</label> 
										<form:select path="empalmered.id" cssClass="form-control"
			 								items="${empalmeres}" itemLabel="tipoempalme" itemValue="id"> 
			 							</form:select> 
						</div>
						
					</div>
				</div>
			</div>
	
		<div class="col-md-6">
				<div class="panel panel-primary">
					<div class="panel-heading">
						<h3 class="panel-title">Datos internos</h3>
					</div>
					<div class="panel-body">
						<div class="form-group">
										<label for="exampleInputEmail1">Diametro de agua</label> 
										<form:input path="diametroagua.id" class="form-control"
										placeholder="Distancia" value="2" disabled="disabled" autofocus="autofocus" required="required" />
						</div>
						<div class="form-group">
										<label for="exampleInputEmail1">Eliminacion</label> 
										<form:input path="eliminacionexedente.id" class="form-control"
										placeholder="Eliminacion" value="1" disabled="disabled" autofocus="autofocus" required="required" />
						</div>
						<div class="form-group">
										<label for="exampleInputEmail1">Relleno</label> 
										<form:input path="relleno.id" class="form-control"
										placeholder="Relleno" value="1" disabled="disabled" autofocus="autofocus" required="required" />
						</div>
						<div class="form-group">
										<label for="exampleInputEmail1">Cama apoyo</label> 
										<form:input path="camaapoyo.id" class="form-control"
										placeholder="Cama de apoyo" value="1" disabled="disabled" autofocus="autofocus" required="required" />
						</div>
						<div class="form-group">
										<label for="exampleInputEmail1">Prueba</label> 
										<form:input path="pruebahidraulica.id" class="form-control"
										placeholder="Prueba" value="1" disabled="disabled" autofocus="autofocus" required="required" />
						</div>
						<div class="form-group">
										<label for="exampleInputEmail1">Excavacion</label> 
										<form:input path="excavacion.id" class="form-control"
										placeholder="Excavacion" value="1" disabled="disabled" autofocus="autofocus" required="required" />
						</div>
						
					</div>
				</div>
			</div>
	
	

		
	
			<div>
				<button type="submit" class="btn btn-primary col-md-6">Siguiente</button>
				<form:hidden path="id" />
			</div>

		
</form:form>
	</div>

</div>
	

<%-- <%@ include file="/WEB-INF/jsp/include/taglibs.jsp"%> --%>
<!-- <div class="col-md-6"> -->
<!-- 		<h2>Formulario de 20</h2> -->
<!-- 		<div class="form-group"> -->
<!-- 			<label for="exampleInputEmail1">Titular</label> -->
<!-- 			<input type="text" name="interesado" value="" placeholder="Nombre y Apellidos"><br><br> -->
<!-- 			<input type="date" name="fecha" value=""><br><br> -->
<!-- 			<label for="exampleInputEmail1">Distancia</label> -->
<!-- 			<input type="number" name="distancia" placeholder="Distancia"> -->
<!-- 			<br> -->
<!-- 			<div class="form-group"> -->
<!-- 							<label for="exampleInputEmail1">Vereda</label>  -->
<%-- 							<form:select path="veredas" cssClass="form-control" --%>
<%--  								items="${veredas}" itemLabel="nombrevere" itemValue="id">  --%>
<%--  							</form:select>  --%>
<!-- 			</div> -->
			
<!-- 			<div class="form-group"> -->
<!-- 							<label for="exampleInputEmail1">Tipo de Pista</label>  -->
<%-- 							<form:select path="pistas" cssClass="form-control" --%>
<%--  								items="${pistas}" itemLabel="nombrepista" itemValue="id">  --%>
<%--  							</form:select>  --%>
<!-- 			</div> -->
<!-- 			<div class="form-group"> -->
<!-- 							<label for="exampleInputEmail1">Tipo de empalme a red</label>  -->
<%-- 							<form:select path="empalmeres" cssClass="form-control" --%>
<%--  								items="${empalmeres}" itemLabel="tipoempalme" itemValue="id">  --%>
<%--  							</form:select>  --%>
<!-- 			</div>	 -->
<!-- 			<br> -->
<!-- 			<input type="text" name="diametroagua" value="1" disabled="disabled"><br><br> -->
<!-- 			<input type="text" name="eliminacionexedente" value="1" disabled="disabled"><br><br> -->
<!-- 			<input type="text" name="relleno" value="1" disabled="disabled"><br><br> -->
<!-- 			<input type="text" name="camaapoyo" value="1" disabled="disabled"><br><br> -->
<!-- 			<input type="text" name="pruebahidraulica" value="1" disabled="disabled"><br><br> -->
<!-- 			<input type="text" name="excavacion" value="1" disabled="disabled"><br><br> -->
			
			
<!-- 		</div> -->
<!-- 		<button type="submit" class="btn btn-primary">Siguiente</button> -->

<%-- 	<form:form modelAttribute="Agua" action="guardar"> --%>
	
<%-- 	</form:form> --%>
	

<!-- </div> -->





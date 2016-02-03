
<%@ include file="/WEB-INF/jsp/include/taglibs.jsp"%>
<div class="col-md-12">

	<div class="col-md-12">

		<form:form modelAttribute="FormularioAlcantarillado" action="guardar200">
			<h2>Formulario de 200</h2>
			
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
										<form:select path="tipopista.id" cssClass="form-control"
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
										<label for="exampleInputEmail1">Diametro de Alcantarillado</label> 
										<form:input path="diametroalcantarilado.id" class="form-control"
										placeholder="Distancia" value="3" disabled="disabled" autofocus="autofocus" required="required" />
						</div>
						<div class="form-group">
										<label for="exampleInputEmail1">Eliminacion</label> 
										<form:input path="eliminacionexcedente.id" class="form-control"
										placeholder="Eliminacion" value="2" disabled="disabled" autofocus="autofocus" required="required" />
						</div>
						<div class="form-group">
										<label for="exampleInputEmail1">Relleno</label> 
										<form:input path="relleno.id" class="form-control"
										placeholder="Relleno" value="2" disabled="disabled" autofocus="autofocus" required="required" />
						</div>
						<div class="form-group">
										<label for="exampleInputEmail1">Cama apoyo</label> 
										<form:input path="camaapoyo.id" class="form-control"
										placeholder="Cama de apoyo" value="2" disabled="disabled" autofocus="autofocus" required="required" />
						</div>
						<div class="form-group">
										<label for="exampleInputEmail1">Prueba</label> 
										<form:input path="pruebahidrahulica.id" class="form-control"
										placeholder="Prueba" value="2" disabled="disabled" autofocus="autofocus" required="required" />
						</div>
						<div class="form-group">
										<label for="exampleInputEmail1">Excavacion</label> 
										<form:input path="excavacion.id" class="form-control"
										placeholder="Excavacion" value="2" disabled="disabled" autofocus="autofocus" required="required" />
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
<%@ include file="/WEB-INF/jsp/include/taglibs.jsp"%>

<div class="col-md-6">
	<br>
	<br>
	<form:form modelAttribute="Empalmealared" action="actualizar">
		<h2>Actualizar el precio</h2>
		<div class="form-group">
			<label for="exampleInputEmail1">Tipo de diametro</label>
			 <div class="input-group input-sm">
                        <span class="input-group-addon"><i class="fa fa-cube"></i></span>
			
			<form:input path="nombrediametro" class="form-control" placeholder="nombre"
				autofocus="autofocus" />
			 </div>
			 <div class="input-group input-sm">
                        <span class="input-group-addon"><i class="fa fa-cube"></i></span>
			<label for="exampleInputEmail1">Tipo de empalme</label>
			<form:input path="tipoempalme" class="form-control" placeholder="precio"
				autofocus="autofocus"/>
			</div>
			<label for="exampleInputEmail1">Tipo de servicio</label>
			 <div class="input-group input-sm">
                        <span class="input-group-addon"><i class="fa fa-cube"></i></span>
			<form:input path="tiposervicioempalme" class="form-control" placeholder="precio"
				autofocus="autofocus"/>	
			</div>
			<label for="exampleInputEmail1">Precio</label>
			            <div class="input-group input-sm">
                        <span class="input-group-addon"><i class="fa fa-dollar"></i></span>
			<form:input path="precioempalme" class="form-control" placeholder="precio"
				autofocus="autofocus" type="number" step="0.01" min="0"/>		
		</div></div>
		<button type="submit" class="btn btn-primary">
		<i class="fa  fa-save"></i>                        
		Guardar cambios</button>
		<button type="reset" class="btn btn-primary">
		<i  class="fa fa-refresh"></i>
		Cancelar cambios</button>
		<form:hidden path="id" />
	</form:form>
</div>
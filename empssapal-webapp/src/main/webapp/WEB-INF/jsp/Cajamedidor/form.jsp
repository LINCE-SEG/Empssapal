<%@ include file="/WEB-INF/jsp/include/taglibs.jsp"%>
<!--   <div id="container"> -->
<div class="col-md-6">
	<br>
	<br>
	<form:form modelAttribute="Cajamedidor" action="actualizar">
			<label for="disabledTextInput"  >Tipo de la caja agua</label>
	                <div class="input-group input-sm">
                        <span class="input-group-addon"><i class="fa fa-cube"></i></span>
			<form:input path="nombrecajamedidor"  class="form-control" placeholder="nombre"
 				autofocus="autofocus" disabled="disabled"  /> 
                    </div>
            <label for="exampleInputEmail1">Precio</label>
                    <div class="input-group input-sm">
                        <span class="input-group-addon"><i class="fa fa-dollar"></i></span>
			<form:input path="preciocajamedidor" class="form-control" placeholder="precio"
 				autofocus="autofocus"/>
                    </div>
    
		<button type="submit" class="btn btn-primary">
		<i class="fa  fa-save"></i>                        
		Guardar cambios</button>
		<button type="reset" class="btn btn-primary">
		<i  class="fa fa-refresh"></i>
		Cancelar cambios</button>
		<form:hidden path="id" />
	</form:form>
<!-- </div> -->
</div>
<%@ include file="/WEB-INF/jsp/include/taglibs.jsp"%>
<div class="col-md-6">
	<br>
	<br>
	<form:form modelAttribute="Pista" action="Sumatoria">
		<h2>Suma Automatica Pista</h2>
		<div class="form-group">
							<label for="exampleInputEmail1">Rotura</label> 
							<form:select path="veredas" cssClass="form-control"
 								items="${veredas}" itemLabel="costorotura" itemValue="id"> 
 							</form:select> 
		</div>
		<div class="form-group">
							<label for="exampleInputEmail1">Reposicion</label> 
							<form:select path="veredas" cssClass="form-control"
 								items="${veredas}" itemLabel="costoreposicion" itemValue="id"> 
 							</form:select> 
		</div>
		<button type="submit" class="btn btn-primary">
		<i class="fa  fa-save"></i>                        
		Actualizar</button>
	
	</form:form>
</div>
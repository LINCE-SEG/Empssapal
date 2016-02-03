<%@ include file="/WEB-INF/jsp/include/taglibs.jsp"%>
<c:set var="authentication" value="${sessionScope['SPRING_SECURITY_CONTEXT'].authentication}" />
<c:set var="user" value="${authentication.details}" />
	<div class="navbar navbar-fixed-top" role="navigation" >
<nav class="navbar  navbar-inverse navbar-default"  >
  <div class="container-fluid" >
  
  <div class="navbar-header">
      <a class="navbar-brand" href="<%=request.getContextPath()%>/home/dashboard.html">SISTEMA DE PRESUPUESTOS</a>
    </div>
    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1"  >
	<ul class="nav navbar-nav">
       
        <li class="dropdown">
          <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Mantenimiento Precios
           <span class="caret"></span></a>
          <ul class="dropdown-menu">
        <li <c:if test="${menuHeader eq 'CajaRegistradora'}"> class="active"</c:if>><a href="<%=request.getContextPath() %>/CajaRegistradora/dashboard.html"><i class="fa fa-indent"></i> Caja Registradora</a></li>
        <li <c:if test="${menuHeader eq 'Cajamedidor'}"> class="active"</c:if>><a href="<%=request.getContextPath() %>/Cajamedidor/dashboard.html"><i class="fa fa-indent"></i> Caja medidor</a></li>
        <li <c:if test="${menuHeader eq 'CajaRegistradora'}"> class="active"</c:if>><a href="<%=request.getContextPath() %>/CajaRegistradora/dashboard.html"><i class="fa fa-indent"></i> Caja Registradora</a></li>
        <li <c:if test="${menuHeader eq 'Camaapoyo'}"> class="active"</c:if>><a href="<%=request.getContextPath() %>/Camaapoyo/dashboard.html"><i class="fa fa-indent"></i> Cama apoyo</a></li>
        <li <c:if test="${menuHeader eq 'Eliminacionmaterialexedente'}"> class="active"</c:if>><a href="<%=request.getContextPath() %>/Eliminacionmaterialexedente/dashboard.html"><i class="fa fa-indent"></i> Eliminacion exedente</a></li>
        <li <c:if test="${menuHeader eq 'Empalmealared'}"> class="active"</c:if>><a href="<%=request.getContextPath() %>/Empalmealared/dashboard.html"><i class="fa fa-indent"></i> Empalme de red</a></li>
        <li <c:if test="${menuHeader eq 'Excavacion'}"> class="active"</c:if>><a href="<%=request.getContextPath() %>/Excavacion/dashboard.html"><i class="fa fa-indent"></i> Excavacion</a></li>
        <li <c:if test="${menuHeader eq 'Pruebahidrahulica'}"> class="active"</c:if>><a href="<%=request.getContextPath() %>/Pruebahidrahulica/dashboard.html"><i class="fa fa-indent"></i> Pruebas</a></li>
        <li <c:if test="${menuHeader eq 'Relleno'}"> class="active"</c:if>><a href="<%=request.getContextPath() %>/Relleno/dashboard.html"><i class="fa fa-indent"></i> Relleno</a></li>
        <li <c:if test="${menuHeader eq 'Reposicion'}"> class="active"</c:if>><a href="<%=request.getContextPath() %>/Reposicion/dashboard.html"><i class="fa fa-indent"></i> Reposicion</a></li>
        <li <c:if test="${menuHeader eq 'Rotura'}"> class="active"</c:if>><a href="<%=request.getContextPath() %>/Rotura/dashboard.html"><i class="fa fa-indent"></i> Rotura</a></li>
        <li <c:if test="${menuHeader eq 'Vereda'}"> class="active"</c:if>><a href="<%=request.getContextPath() %>/Vereda/dashboard.html"><i class="fa fa-indent"></i> Vereda</a></li>
           
          </ul>
        </li>
        <li class="dropdown">
          <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Presupuesto de instalacion de agua
           <span class="caret"></span></a>
          <ul class="dropdown-menu">
       			<li <c:if test="${menuHeader eq 'FormularioAgua'}"> class="active"</c:if>><a href="<%=request.getContextPath() %>/FormularioAgua/dashboard15.html"><i class="fa fa-indent"></i> Instalacion de 15</a></li>
       			<li <c:if test="${menuHeader eq 'FormularioAgua'}"> class="active"</c:if>><a href="<%=request.getContextPath() %>/FormularioAgua/dashboard20.html"><i class="fa fa-indent"></i> Instalacion de 20</a></li>
       			<li <c:if test="${menuHeader eq 'FormularioAgua'}"> class="active"</c:if>><a href="<%=request.getContextPath() %>/FormularioAgua/dashboard25.html"><i class="fa fa-indent"></i> Instalacion de 25</a></li>
       			<li <c:if test="${menuHeader eq 'FormularioAgua'}"> class="active"</c:if>><a href="<%=request.getContextPath() %>/FormularioAgua/dashboard38.html"><i class="fa fa-indent"></i> Instalacion de 38</a></li>
       			<li <c:if test="${menuHeader eq 'FormularioAgua'}"> class="active"</c:if>><a href="<%=request.getContextPath() %>/FormularioAgua/Menu.html"><i class="fa fa-indent"></i> Menu</a></li>
       			<li <c:if test="${menuHeader eq 'FormularioAgua'}"> class="active"</c:if>><a href="<%=request.getContextPath() %>/FormularioAgua/Reporte.html"><i class="fa fa-indent"></i> Reporte</a></li>
          </ul>
        </li>
        <li class="dropdown">
          <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Presupuesto de instalacion de alcantarillado
           <span class="caret"></span></a>
          <ul class="dropdown-menu">
       			<li <c:if test="${menuHeader eq 'FormularioAlcantarillado'}"> class="active"</c:if>><a href="<%=request.getContextPath() %>/FormularioAlcantarillado/dashboard6.html"><i class="fa fa-indent"></i> Instalacion de 6</a></li>
       			<li <c:if test="${menuHeader eq 'FormularioAlcantarillado'}"> class="active"</c:if>><a href="<%=request.getContextPath() %>/FormularioAlcantarillado/dashboard160.html"><i class="fa fa-indent"></i> Instalacion de 160</a></li>
       			<li <c:if test="${menuHeader eq 'FormularioAlcantarillado'}"> class="active"</c:if>><a href="<%=request.getContextPath() %>/FormularioAlcantarillado/dashboard200.html"><i class="fa fa-indent"></i> Instalacion de 200</a></li>
           </ul>
        </li>
      </ul>

     <ul class="nav navbar-nav navbar-right">
       
        <li class="dropdown">
          <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Administrador
           <span class="caret"></span></a>
          <ul class="dropdown-menu">
            <li role="separator" class="divider"></li>
            <li><a href="<%=request.getContextPath()%>/logout"><i class="fa fa-sign-out pull-right"></i> Cerrar Seccion</a>
           
          </ul>
        </li>
      </ul>
      
    </div>
  </div>
</nav>
</div>
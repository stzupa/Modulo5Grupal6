<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<div class="container">
	<nav class="navbar navbar-expand-lg bg-light">
		<div class="container-fluid">
			<h4>APR</h4>
			<button class="navbar-toggler" type="button"
				data-bs-toggle="collapse" data-bs-target="#navbarNav"
				aria-controls="navbarNav" aria-expanded="false"
				aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>
			<div class="collapse navbar-collapse" id="navbarNav">
				<ul class="navbar-nav">
					<li class="nav-item"><a class="nav-link" aria-current="page"
						href="${pageContext.request.contextPath}/">Inicio</a></li>
					<li class="nav-item"><a class="nav-link"
						href="${pageContext.request.contextPath}/contacto">Contacto</a></li>
					<li class="nav-item"><a class="nav-link"
						href="${pageContext.request.contextPath}/capacitaciones?op=new">Crear Capacitación</a></li>
					<li class="nav-item"><a class="nav-link"
						href="${pageContext.request.contextPath}/capacitaciones?op=list">Listar Capacitaciones</a></li>
					<li class="nav-item"><a class="nav-link"
						href="${pageContext.request.contextPath}/listarUser">Listar Usuarios</a></li>
					<li class="nav-item"><a class="nav-link"
						href="${pageContext.request.contextPath}/creaUser">Crear Usuario</a></li>
						
					<c:if test="${estado == activo}">
						<li id="opcion" class="nav-item"><a class="nav-link" style="visibility: visible"
							href="${pageContext.request.contextPath}/logout">Loguot</a></li>
					</c:if>
					<c:if test="${estado != activo}">
						<li id="opcion" class="nav-item"><a class="nav-link" style="visibility: hidden"
							href="${pageContext.request.contextPath}/logout">Logout</a></li>
					</c:if>
					
				</ul>				
			</div>
		</div>
	</nav>
</div>
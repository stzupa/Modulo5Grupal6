<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="codHead.jsp" %>
<body>

	<div class="container">
		<header>

			<%@ include file="barraNav.jsp"%>

		</header>
		<br>
		<main>

			<div class="container col-sm-12 col-md-11 col-lg-10 col-xl-9">

				<h3>Crear Usuario</h3>

				<form>
					<div class="col-4">
						<label for="nombre" class="form-label">Nombre Usuario</label> 
						<input type="text" class="form-control"	id="nombre">
					</div>
					<br>
					<div class="col-4">
						<label for="fechaNac" class="form-label">Fecha Nacimiento</label> 
						<input type="text" class="form-control"	id="fechaNac">
					</div>
					<br>
					<div class="col-4">
						<label for="rut" class="form-label">Rut</label> 
						<input type="text" class="form-control"	id="rut">
					</div>
					<br>
					<button type="submit" class="btn btn-primary">Enviar</button>
				</form>

			</div>

		</main>

	</div>

	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-pprn3073KE6tl6bjs2QrFaJGz5/SUsLqktiwsUTF55Jfv3qYSDhgCecCxMW52nD2"
		crossorigin="anonymous"></script>

</body>
</html>
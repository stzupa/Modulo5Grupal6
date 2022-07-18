<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="codHead.jsp" %>
<body>

	<div class="container">
	
		<header>
			<%@ include  file="barraNav.jsp" %>
		</header>
		<br>
		
		<main>
			<div class="container col-sm-12 col-md-11 col-lg-10 col-xl-9">
				<h3>Formulario de contacto</h3>
				<form>
					<div class="col-5">
						<label for="nombre" class="form-label">Nombre</label>
						<input type="text" class="form-control" id="nombre" aria-describedby="nombreCliente">
					</div>
					<br>
					<div class="col-5">
						<label for="exampleInputEmail1" class="form-label">Email</label>
						<input type="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
					</div>
					<br>
					<div class="col-5">
						<label for="telefono" class="form-label">Teléfono</label>
						<input type="text" class="form-control" id="telefono" aria-describedby="telefonoCliente">
					</div>
					<br>
					<div class="col-8">
						<label for="mensaje" class="form-label">Mensaje</label>
						<textarea class="form-control" id="mensaje" rows="3"></textarea>
					</div>
					<div id="emailHelp" class="form-text">Nunca compartiremos tus datos</div>
					<br>
					<button type="submit" class="btn btn-primary">Enviar</button>
				  </form>
			</div>
		</main>
	</div>
	
	<!-- JavaScript Bundle with Popper -->
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.bundle.min.js" integrity="sha384-pprn3073KE6tl6bjs2QrFaJGz5/SUsLqktiwsUTF55Jfv3qYSDhgCecCxMW52nD2" crossorigin="anonymous"></script>
</body>
</html>
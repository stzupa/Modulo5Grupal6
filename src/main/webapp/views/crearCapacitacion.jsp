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

				<h3>Crear Capacitación</h3>
				<form id="miForm" action="${pageContext.request.contextPath}/capacitaciones?op=new" method="post">
				
					<div class="col-4">
						<label for="rutCliente" class="form-label">Rut Cliente</label> 
						<input type="text" class="form-control" id="rutCliente" name="rutCliente">
					</div>
					<br>
					<div class="col-4">
						<label for="diaSemana" class="form-label">Día semana</label>												
						<select id="diaSemana" name="diaSemana" class="form-select" aria-label="Default select example">
							<option></option>
							<option value="Lunes">Lunes</option>
							<option value="Martes">Martes</option>
							<option value="Miercoles">Miercoles</option>
							<option value="Jueves">Jueves</option>
							<option value="Viernes">Viernes</option>
							<option value="Sabado">Sabado</option>
							<option value="Domingo">Domingo</option>
						</select>

					</div>
					<br>
					<div class="col-4">
						<label for="hora" class="form-label">Hora</label> 
						<input type="text" class="form-control"	id="hora" name="hora" placeholder="hh:mm">
					</div>
					<br>
					<div class="col-8">
						<label for="lugar" class="form-label">Lugar</label> 
						<input type="text" class="form-control"	id="lugar" name="lugar">
					</div>
					<br>
					<div class="col-8">
						<label for="duracion" class="form-label">Duración</label> 
						<input type="text" class="form-control"	id="duracion" name="duracion">
					</div>
					<br>
					<div class="col-4">
						<label for="nAsistentes" class="form-label">Cantidad de asistentes</label> 
						<input type="number" class="form-control"	id="nAsistentes" name="nAsistentes"
						placeholder="hasta 1000 asistentes">
					</div>
					<br>
					<div class="row justify-content-between">
					<div class="container col-2"><button class="btn btn-primary" type="submit">Enviar</button></div>
					<div class="container col-2"><button class="btn btn-danger" type="reset">Limpiar</button></div>
				</div>
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
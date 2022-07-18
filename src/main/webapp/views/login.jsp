<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="codHead.jsp" %>
<body>

	<%-- <header>
	
		<%@ include file="barraNav.jsp" %>
		
	</header> --%>
	<br>
	<main>
		<div class="container col-sm-12 col-md-11 col-lg-10 col-xl-9">
			<h3>Login Usuario</h3>
			<form action="${pageContext.request.contextPath}/ingreso" method="post">
				<div class="col-5">
					<label for="usuario" class="form-label">Usuario</label> 
					<input type="text" class="form-control" id="usuario" name="usuario">					
				</div>
				<div class="col-5">
					<label for="pass" class="form-label">Password</label>
					<input type="password" class="form-control"	id="pass" name="pass">
				</div>
				<br>
				<button type="submit" class="btn btn-primary">Ingresar</button>
			</form>
		</div>
	</main>

</body>
</html>
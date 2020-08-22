<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Simulacion 3 - TK</title>
<link rel="stylesheet"
		href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css"
		integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk"
		crossorigin="anonymous">
		<link rel="stylesheet" href="<c:url value="/resources/css/estilo.css"></c:url>">
</head>
<body>
<div class="contenido">
	<h1 class="text-center">Simulación 3</h1>
	<h2 class="text-center">Lista Cursos</h2>

	<table class="table table-hover table-sm text-center">
		<thead class="thead-dark">
		<tr>
			<th>idCurso</th>
			<th>Nombre</th>
			<th>N Alumnos</th>
			<th>Lista</th>
		</tr>
		</thead>		
		<tbody>
		<c:forEach items="${cursos}" var="c">
					<tr>
						<td><c:out value="${c.getIdcurso()}" /></td>
						<td><c:out value="${c.getNombre()}" /></td>
						<td><c:out value="${c.getNumalum()}" /></td>
						<td><a href="lista/${c.getIdcurso()}">Lista</a></td>
					</tr>


		</c:forEach>
		</tbody>
	</table>
	</div>
	
</body>
</html>
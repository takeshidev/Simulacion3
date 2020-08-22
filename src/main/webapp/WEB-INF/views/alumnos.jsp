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
	<h2 class="text-center">Lista Alumnos</h2>

	<table class="table table-hover table-sm text-center">
		<thead class="thead-dark">
			<tr>
				<th>idAlumno</th>
				<th>Nombre</th>
				<th>idCurso</th>
				<th>Curso</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${alumnos}" var="a">
				<tr>
					<td><c:out value="${a.getIdalumno()}" /></td>
					<td><c:out value="${a.getNombre()}" /></td>
					<td><c:out value="${a.getIdcurso()}" /></td>
					<td><c:out value="${a.getCurso()}" /></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
		<div class="text-center">
			<a class="btn btn-primary text-center"
				href="${pageContext.request.contextPath}/" role="button">Volver</a>
		</div>
	</div>
</body>
</html>
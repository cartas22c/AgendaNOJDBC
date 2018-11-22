<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Persona</title>
</head>
<body>
	<h1>Hola soy el home</h1>
	<table>
		<thead>
			<tr>
				<th>ID</th>
				<th>DNI</th>
				<th>NOMBRE</th>
			</tr>
		</thead>

		<tbody>

			<c:forEach items="${listado}" var="persona">
				<tr>

					<td><c:out
							value="${persona.id}" /></td>
					<td><c:out
							value="${persona.dni}" /></td>
					<td><c:out
							value="${persona.nombre}" /></td>
				</tr>
			</c:forEach>

		</tbody>
	</table>
</body>
</html>
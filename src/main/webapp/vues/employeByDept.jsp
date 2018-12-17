<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Employes</title>
<link href="<c:url value="/resources/static/css/bootstrap.css" />" rel="stylesheet">
</head>
<body>
	<div class="container mt-5">
	<div class="row">
		<div class="col-md-3">
			<div class="list-group">
			  <a href="/Gestion_des_projets/departements" class="list-group-item list-group-item-action">Liste des departements</a>
			  <a href="/Gestion_des_projets/addprojet" class="list-group-item list-group-item-action">Ajouter un projet</a>
			  <a href="/Gestion_des_projets/addEmploye" class="list-group-item list-group-item-action">Ajouter un employe</a>
			</div>
		</div>
		<div class="col-md-9">
		<h2 class="text-center m-3">Liste des employes</h2>
		<h6>Département : ${dept.nom } </h6>
		<table class="table ">
			<thead class="thead-dark">
				<tr >
					<th scope="col">id</th>
					<th scope="col">Nom</th>
					<th scope="col">Fonction</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${listE }" var="emp">
				<tr>
					<td>${emp.num }</td><td>${emp.nom }</td><td>${emp.fonction }</td>
				</tr>
				</c:forEach>
			</tbody>
		</table>
		</div>
	</div>
		
	</div>
</body>
</html>
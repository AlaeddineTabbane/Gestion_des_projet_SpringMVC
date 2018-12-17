<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
        <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Liste des projets</title>
<link href="<c:url value="/resources/static/css/bootstrap.css" />" rel="stylesheet">
</head>
<body>
<div class="container mt-5">
	<div class="row">
		<div class="col-md-3">
			<div class="list-group">
			  <a href="/Gestion_des_projets/departements" class="list-group-item list-group-item-action">Liste des departements</a>
			  <a href="/Gestion_des_projets/projets" class="list-group-item list-group-item-action">Liste des projets</a>
			  <a href="/Gestion_des_projets/employes" class="list-group-item list-group-item-action disabled">Liste des employes</a>
			  <a href="/Gestion_des_projets/adddepartement" class="list-group-item list-group-item-action">Ajouter un departement</a>
			  <a href="/Gestion_des_projets/addprojet" class="list-group-item list-group-item-action">Ajouter un projet</a>
			</div>
		</div>
		<div class="col-md-9">
		<h2 class="text-center">Liste des projet</h2>
		<table class="table ">
			<thead class="thead-dark">
				<tr >
					<th scope="col">id</th><th scope="col">Titre</th><th scope="col">Etat</th><th scope="col"></th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${listP }" var="proj">
				<tr>
					<td>${proj.num }</td><td>${proj.titre }</td>
					<td>${proj.etat }</td>
					<td><a href="">Liste des employés</a>
				</tr>
				</c:forEach>
			</tbody>
		</table>
		</div>
	</div>
		
	</div>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="form"   uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Demaptements</title>
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
		<h2 class="text-center">Ajouter un projet</h2>
		<form:form action="saveProjet" method="POST" modelAttribute="proj">
		  <div class="form-group row">
		    <label class="col-sm-2 col-form-label">Titre</label>
		    <div class="col-sm-10">
		      <form:input type="text" path="titre" class="form-control"  placeholder="titre" />
		    </div>
		  </div>
		  <div class="form-group row">
		    <label class="col-sm-2 col-form-label">Etat</label>
		    <div class="col-sm-10">
		      <form:select class="form-control" path="etat" >
		      	<form:option value="1">Nom lancé</form:option>
		      	<form:option value="2">Active</form:option>
		      	<form:option value="3">Achevé</form:option>
		      </form:select>
		    </div>
		  </div>
		  <div class="form-group row">
		    <label class="col-sm-2 col-form-label">Département</label>
		    <div class="col-sm-10">
				<form:select class="form-control"  path="dept" items="${listD }" itemValue="num" itemLabel="nom" />
		    </div>
		  </div>
		  <button type="submit" class="btn btn-primary">Enregistrer</button>
		</form:form>
		</div>
	</div>
		
	</div>
</body>
</html>
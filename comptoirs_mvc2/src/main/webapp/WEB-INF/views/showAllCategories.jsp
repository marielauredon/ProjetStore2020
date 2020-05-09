<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>

<head>
	<title>Affiche toutes les catégories</title>
        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/CSS/showAllCategories.css">
             <img src="../Images/epicerie_logo.png" alt=""/>
           
</head>

<body>
	<h1>Liste des catégories</h1>
	<table border='1'>
		<tr><th>Code</th><th>Libellé</th><th>Description</th></tr>
		<%-- Pour chaque catégorie, une ligne dans la table HTML --%>
		<c:forEach var="categorie" items="${categories}">
			<tr>
				<td>${categorie.code}</td>
				<%-- Le libellé ou la description peuvent contenir des caractères spéciaux HTML ! --%>
				<td>${mvc.encoders.html(categorie.libelle)}</td>
				<td>${mvc.encoders.html(categorie.description)}</td>
			</tr>
		</c:forEach>
	</table>
	<hr>
        <a href="${pageContext.request.contextPath}/"><button>Retour au menu</button></a>
	<hr>
	<h3>Code source</h3>
	<ul>
            <li><a href="https://bitbucket.org/rbastide/comptoirs_mvc/src/test/src/main/java/controller/CategorieController.java"  target="_blank"><button>Le contrôleur</button></a></li>
            <li><a href="https://bitbucket.org/rbastide/comptoirs_mvc/src/test/src/main/webapp/WEB-INF/views/showAllCategories.jsp"  target="_blank"><button>La vue </button></a></li>
	</ul>
</body>

</html>
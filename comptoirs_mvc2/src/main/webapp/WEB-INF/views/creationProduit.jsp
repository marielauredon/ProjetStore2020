<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>

	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
                 <img src="https://drive.google.com/uc?id=1TbXuzACXN3wfbFzLaNm2TeukEMnJ3Tf0" alt="Logo de l'épicerie" id="logo" />
		<title>Ajout d'un nouveau produit</title>
                 <style>
            form, html, input, head,h,ul,p{
                text-align: center;
                list-style-type: none; 
            }
            html,form,head{
               background: gray;  
            }
        </style>
	</head>

	<body>
		<h3>Nouveau produit</h3>
		<form method='POST'> 	<%-- L'action par défaut est de revenir à l'URL du contrôleur --%>
			Nom du produit : <input name="nom"><br>
			Prix unitaire :  <input name="prixUnitaire" type="number" min="0.00" max="10000.00" step="0.01" /><br>
			<%-- Une liste de choix pour le paramètre 'code' --%>
			Catégorie : <select name='codeCategorie'>
				<%-- On parcourt la liste des catégories en mettant une option pour chaque catégorie --%>
				<c:forEach var="categorie" items="${categories}">
					<option value='${categorie.code}'>${categorie.libelle}</option>
				</c:forEach>
			</select><br>
			<input type='submit'>
		</form>
		<hr>
		<a href="${pageContext.request.contextPath}/">Retour au menu</a>
</html>
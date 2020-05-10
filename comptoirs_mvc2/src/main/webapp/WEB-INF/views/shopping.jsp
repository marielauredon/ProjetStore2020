<%-- 
    Document   : shopping
    Created on : 2 mai 2020, 04:19:47
    Author     : marie
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Shopping</title>
        <img src="../Images/epicerie_logo.png" alt=""/>
        <link href="../CSS/shopping.css" rel="stylesheet" type="text/css"/>
    </head>
<body>
    <h1>Faites vos achats ! </h1>
    <h2>1) Choississez une catégorie de produit à afficher : </h2>
    <form> 	<%-- L'action par défaut est de revenir à l'URL du contrôleur --%>
        <%-- Une liste de choix pour le paramètre 'code' --%>
        <select name='code' onchange='this.form.submit()'>
            <%-- On parcourt la liste des catégories en mettant une option pour chaque catégorie --%>
            <c:forEach var="categorie" items="${categories}">
                <%-- la valeur de l'option c'est le code de la catégorie --%>
                <option value='${categorie.code}' 
                        <%--On détermine quelle et l'option sélectionnée dans la liste --%>
                        <c:if test="${categorie.code eq selected.code}">
                            selected
                        </c:if>
                        > <%-- le texte affiché pour l'opton c'est le libellé de la catégorie --%>
                    ${categorie.libelle}
                </option>
            </c:forEach>
        </select>
        <input type='submit'>
    </form>
    <%-- On montre la liste des produits dans la catégorie sélectionnée sous la forme d'une table HTML --%>		

    <h2>2) Choisir un produit à ajouter au panier : </h2>
    <form>
        <select name="produit" onchange='this.form.submit()'>
            <c:forEach var="produit" items="${selected.produitCollection}">
                <option value='${produit.reference}'>${produit.nom}</option>
            </c:forEach>
        </select>
        <p>Quantité :</p><input name="quantité" type='number'/>
        <input type='submit' value='Ajouter au panier'/>
    </form>

    <div>
        <p>Mon panier</p>
        <table border='1'>
            <tr><th>Nom du produit</th><th>Quantité</th></tr>
        </table>
    </div>  
    
        <a href="shopping"><button>Mettre à jour le panier</button></a>    
        <a href="espaceClient"><button>Retour</button></a>
</body>
</html>

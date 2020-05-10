<%-- 
    Document   : détailsCommande
    Created on : 8 mai 2020, 10:19:42
    Author     : marie
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Détails des commandes</title>
    <img src="../Images/epicerie_logo.png" alt=""/>
    </head>
    <body>
        <h1>Détails des commandes</h1>
            <c:forEach var="commande" items="${leclient.commandeCollection}">
                <h2>Détail de la Commande n°${commande.numero}</h2>
                <table border='1'>
                    <tr><th>Nom du produit</th><th>Quantité</th></tr>
                    <c:forEach var="ligne" items="${commande.ligneCollection}">
                        <tr>
                        <td>${ligne.produit1.nom}</td>
                        <td>${ligne.quantite}</td>                       
                        <tr>
                    </c:forEach>
                </table>
            </c:forEach>
                <a href="bondecommande"><button>Retour</button></a>   
    </body>
    <style>
        html,img{
            background: silver;
            text-align: center;
        }
    </style>
</html>

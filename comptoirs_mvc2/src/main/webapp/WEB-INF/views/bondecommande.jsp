<<<<<<< HEAD

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Mes Bons De Commande</title>
    <img src="../Images/epicerie_logo.png" alt=""/>
    <link href="../CSS/bondecommande.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <h1>Bons de commande</h1>        
        <table border='1'>
            <tr><th>Numéro</th><th>Date de saisie</th></tr>
            <c:forEach var="commande" items="${leclient.commandeCollection}">
                <tr>
                    <td>${commande.numero}</td>
                    <td>${commande.saisieLe}</td>
                </tr>
            </c:forEach>
        </p
    </body>
</html>

=======
<%-- 
    Document   : bondecommande
    Created on : 25 avr. 2020, 22:10:20
    Author     : marie
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <img src="../Images/epicerie_logo.png" alt="Logo de l'épicerie" id="logo" />
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Mes Bons De Commande</title>
        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/CSS/bondecommandeCSS.css">
    </head>
    <body>
        <h1>Bons de commande</h1>        
        <table border='1'>
            <tr><th>Numéro</th><th>Date de saisie</th></tr>
            <c:forEach var="commande" items="${leclient.commandeCollection}">
                <tr>
                    <td>${commande.numero}</td>
                    <td>${commande.saisieLe}</td>
                </tr>
            </c:forEach>
        </table>
        <a href="détailsCommande">Détails des commandes</a>
        <a href="espaceClient">Retour</a>
    </body>
</html>
>>>>>>> 30047a8f21d5e705ccf9d5871a9ba1b3f3974628

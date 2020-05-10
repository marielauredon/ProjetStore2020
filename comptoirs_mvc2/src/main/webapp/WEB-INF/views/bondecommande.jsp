
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Mes Bons De Commande</title>
        <img src="../Images/epicerie_logo.png" alt=""/>
        <link href="../CSS/bondecommandeCSS.css" rel="stylesheet" type="text/css"/>
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
    </body>
    <a href="détailsCommande"><button>Détail des commandes</button></a>
    <a href="espaceClient"><button>Retour</button></a>
</html>



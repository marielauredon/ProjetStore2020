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
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Mes Bons De Commande</title>
    </head>
    <body>
        <h1>Bons de commande</h1>        
        <table border='1'>
            <tr><th>Numéro</th><th>Date de saisie</th></tr>
            <c:forEach var="commande" items="${leclient.commandeCollection}">
                <tr>
                    <td>${commande.numero}</td>
                    <td>${commande.saisieLe}</td>
                    <td><input name="référence" value="Entrez référence"/><input type="submit" value="Détails"/></td>
                </tr>
            </c:forEach>
        </p>
    </body>
</html>

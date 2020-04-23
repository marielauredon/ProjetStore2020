<%-- 
    Document   : espaceClient
    Created on : 3 mars 2020, 20:27:56
    Author     : marie
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Espace Client</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>
    <body>
        <ul>
            <li><a href="mesdonnees">Modifier mes données</a></li>
            <li><a href="mvc/service/unitesVendues/bondecommande" target="_blank">Afficher mon bon de commande</a></li>
        </ul>
    <a href="${pageContext.request.contextPath}/">Retour au menu</a>
    </body>
</html>

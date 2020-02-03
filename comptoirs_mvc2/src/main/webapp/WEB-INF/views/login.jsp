<%-- 
    Document   : login
    Created on : 3 févr. 2020, 09:22:16
    Author     : matte
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Connexion</title>
    </head>
    <body>
        <h1>Connexion</h1>
        <form method='POST'>
            Nom : <input name="nom"></br>
            Code: <input name="code"></br>
            <input type='submit'>
        </form>
        <hr>
        <a href="${pageContext.request.contextPath}/">Retour au menu</a>
    </body>
</html>

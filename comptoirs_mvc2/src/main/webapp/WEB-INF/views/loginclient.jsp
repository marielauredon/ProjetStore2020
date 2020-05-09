<%-- 
    Document   : loginclient
    Created on : 8 mars 2020, 19:38:43
    Author     : marie
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Client</title>
    <img src="../Images/epicerie_logo.png" alt=""/>
    <link href="../CSS/loginclient.css" rel="stylesheet" type="text/css"/>
</head>
    <body>
        <form method="POST">
            Code : <input name="code" type="password">
        </form>
        <input type="submit" value="Connexion">
        <a href="${pageContext.request.contextPath}/"> <button>Retour au menu </button></a>
    </body>
</html>

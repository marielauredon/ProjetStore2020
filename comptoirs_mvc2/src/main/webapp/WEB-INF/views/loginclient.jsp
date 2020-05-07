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
        <img src="https://drive.google.com/uc?id=1TbXuzACXN3wfbFzLaNm2TeukEMnJ3Tf0" alt="Logo de l'épicerie" id="logo" />
    </head>
    <body>
        <form method="POST">
            Code : <input name="code" type="password">
        </form>
        <input type="submit" value="Connexion">
        <a href="${pageContext.request.contextPath}/">Retour au menu</a>
    </body>
</html>

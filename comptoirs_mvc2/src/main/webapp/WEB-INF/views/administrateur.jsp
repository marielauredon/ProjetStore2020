<%-- 
    Document   : commande
    Created on : 3 mars 2020, 15:12:19
    Author     : marie
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Espace Administrateur</title>
          <img src="https://drive.google.com/uc?id=1TbXuzACXN3wfbFzLaNm2TeukEMnJ3Tf0" alt="Logo de l'épicerie" id="logo" />
        <style>
            body{
                font-family: arial;
                background: silver;
            }
        </style>
    </head>
    <body>
        <center>
        <h1>Espace Administrateur</h1>
        </center>
        <table border="1">
            <tr><th>Référence du produit</th><th>Nombre commandés</th></tr>
            <tr><td></td><td></td></tr>
        </table>
        <a href="${pageContext.request.contextPath}/">Retour au menu</a>
    </body>


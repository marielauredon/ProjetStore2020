
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Mes Bons De Commande</title>
        <img src="https://drive.google.com/uc?id=1TbXuzACXN3wfbFzLaNm2TeukEMnJ3Tf0" alt="Logo de l'épicerie" id="logo" />
         <style>
            form, html, input, head,p,h,ul{
                text-align: center;
                list-style-type: none; 
            }
            html,form,head{
               background:silver;  
            }
        </style>
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


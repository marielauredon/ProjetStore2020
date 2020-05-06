<%-- 
    Document   : bondecommande
    Created on : 25 avr. 2020, 22:10:20
    Author     : marie
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
               background: gray;  
            }
        </style>
</head>
    <body>
        <h1>Bons de commande</h1>
        <p>${bondecommande}</p>
    </body>
</html>

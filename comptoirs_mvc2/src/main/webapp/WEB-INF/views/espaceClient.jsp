<%-- 
    Document   : espaceClient
    Created on : 3 mars 2020, 20:27:56
    Author     : marie
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>      
<<<<<<< HEAD
=======
        <title>Espace Client</title>
>>>>>>> 30047a8f21d5e705ccf9d5871a9ba1b3f3974628
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Espace Client</title>
        <link href="../CSS/espaceclientCSS.css" rel="stylesheet" type="text/css"/>
        <img src="../Images/epicerie_logo.png" alt=""/>
        
    </head>
    
    <body>
        <img src="../Images/epicerie_logo.png" alt="Logo de l'épicerie" id="logo" />
        <ul>
            <li><a href="mesdonnees"><button>Modifier mes données</button></a></li><br>
            <li><a href="bondecommande"><button>Afficher mon bon de commande</button></a></li><br>
            <li><a href="shopping"><button>Shopping</button></a></li>
        </ul>
        <a href="${pageContext.request.contextPath}/"><button>retour au menu</button></a>
    </body>
</html>

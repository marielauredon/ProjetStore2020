
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>

    <head>
    
        <title>Connexion</title>
        <img src="../Images/epicerie_logo.png" alt="Logo de l'épicerie" id="logo" />
        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/CSS/loginCSS.css">
    </head>
    
        <h1></h1>
        <form method="POST">
            Nom : <input name="nom"></br>
            <ul> <%-- On montre les erreurs de saisie éventuelles --%>
                <c:forEach var="error" items="${validationErrors.getErrors('nom')}">
                    <li><span style="color: red;">${mvc.encoders.html(error.message)}</span></li>
                </c:forEach>
            </ul>
                Code : <input name="code" type="password"></br>        
            <ul> <%-- On montre les erreurs de saisie éventuelles --%>
                <c:forEach var="error" items="${validationErrors.getErrors('code')}">
                    <li><span style="color: red;">${mvc.encoders.html(error.message)}</span></li>
                </c:forEach>
            </ul>
            <input type="submit" value="Connexion">
        </form>
        <c:if test="${not empty databaseErrorMessage}">
            <span style="color: red;">${databaseErrorMessage}</span>
        </c:if>
        <hr>
        <a href="${pageContext.request.contextPath}/">Retour au menu</a>
    </body>
</html>

<%-- 
    Document   : login
    Created on : 12 mars 2020, 19:18:00
    Author     : marie
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <title>Connexion</title>
    </head>
    <body>
        <h1>Connexion</h1>
        <form method="POST" action="login/login">
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
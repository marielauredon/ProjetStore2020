<%-- 
    Document   : DonneeClient
    Created on : 10 févr. 2020, 15:47:25
    Author     : marie
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Données du client</title>
    </head>
    <body>
        <h1>Les informations personnelles du client ${client.contact}</h1>
        <form method="POST">
            <input type="hidden" name="code" value="${client.code}">
            Société: <input name="societe" value="${client.societe}"></br>
            <br> <%-- On montre les erreurs de saisie éventuelles --%>
                <c:forEach var="error" items="${validationErrors.getErrors('société')}">
                    <li><span style="color: red;">${mvc.encoders.html(error.message)}</span></li>
                    </c:forEach>
            </br>
            Contact: <input name="contact" value="${client.contact}"></br>
            <br> <%-- On montre les erreurs de saisie éventuelles --%>
                <c:forEach var="error" items="${validationErrors.getErrors('contact')}">
                    <li><span style="color: red;">${mvc.encoders.html(error.message)}</span></li>
                    </c:forEach>
            </br>
            Fonction: <input name="fonction" value="${client.societe}"></br>
            <br> <%-- On montre les erreurs de saisie éventuelles --%>
                <c:forEach var="error" items="${validationErrors.getErrors('fonction')}">
                    <li><span style="color: red;">${mvc.encoders.html(error.message)}</span></li>
                    </c:forEach>
            </br>
            Adresse: <input name="adresse" ${client.adresse}></br>
            <br> <%-- On montre les erreurs de saisie éventuelles --%>
                <c:forEach var="error" items="${validationErrors.getErrors('adresse')}">
                    <li><span style="color: red;">${mvc.encoders.html(error.message)}</span></li>
                    </c:forEach>
            </br>
            Ville: <input name="ville" value="${client.ville}"></br>
            <br> <%-- On montre les erreurs de saisie éventuelles --%>
                <c:forEach var="error" items="${validationErrors.getErrors('ville')}">
                    <li><span style="color: red;">${mvc.encoders.html(error.message)}</span></li>
                    </c:forEach>
            </br>
            Région: <input name="région" value="${client.region}"></br>
            <br> <%-- On montre les erreurs de saisie éventuelles --%>
                <c:forEach var="error" items="${validationErrors.getErrors('région')}">
                    <li><span style="color: red;">${mvc.encoders.html(error.message)}</span></li>
                    </c:forEach>
            </br>
            Code Postal: <input name="code postal" value="${client.codePostal}"></br>
            <br> <%-- On montre les erreurs de saisie éventuelles --%>
                <c:forEach var="error" items="${validationErrors.getErrors('code postal')}">
                    <li><span style="color: red;">${mvc.encoders.html(error.message)}</span></li>
                    </c:forEach>
            </br>
            Pays: <input code="pays"></br>
            <br> <%-- On montre les erreurs de saisie éventuelles --%>
                <c:forEach var="error" items="${validationErrors.getErrors('pays')}">
                    <li><span style="color: red;">${mvc.encoders.html(error.message)}</span></li>
                    </c:forEach>
            </br>
            Téléphone: <input code="téléphone"></br>
            <br> <%-- On montre les erreurs de saisie éventuelles --%>
                <c:forEach var="error" items="${validationErrors.getErrors('téléphone')}">
                    <li><span style="color: red;">${mvc.encoders.html(error.message)}</span></li>
                    </c:forEach>
            </br>
            Fax: <input code="fax"></br>
            <br> <%-- On montre les erreurs de saisie éventuelles --%>
                <c:forEach var="error" items="${validationErrors.getErrors('fax')}">
                    <li><span style="color: red;">${mvc.encoders.html(error.message)}</span></li>
                    </c:forEach>
            </br>
            <input type="submit" value="Envoyer">
        </form>
        <c:if test="${not empty databaseErrorMessage}">
            <span style="color: red;">${databaseErrorMessage}</span>
        </c:if>
        <hr>
        <a href="${pageContext.request.contextPath}/">Retour au menu</a>
    </body>
</html>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>

    <head>
    
        <title>Connexion</title>
        <img src="https://drive.google.com/uc?id=1TbXuzACXN3wfbFzLaNm2TeukEMnJ3Tf0" alt="Logo de l'épicerie" id="logo" />
        <style>
     #container {
        margin-top: 20%;
        border-left: 20%;
        background: silver;
        }
     form, body,ul, a {
        list-style-type: none;
        text-decoration: none;
        text-align: center;
        background: silver;
        }
      input{
        text-align: center;  
        }
      body{
        margin: 100px;
        padding: 20px;
}
        </style>
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
                <%
                        String codeClient = request.getParameter( "code" );
                        session.setAttribute( "theCode", codeClient );
                %>
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

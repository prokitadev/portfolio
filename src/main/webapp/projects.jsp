<%--
  Created by IntelliJ IDEA.
  User: piotr
  Date: 11.05.2019
  Time: 11:26
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="pl.prokita.portfolio.mongo.model.*" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <%@include file="includes.jsp" %>

</head>
<body>
</form>

<div class="jumbotron">
        <%! private int counter = 0; %>
        <c:forEach var="project" items="${projects}">
             <% if (counter%3 == 0) {out.print("<div class=\"row\">");} %>

                <div class="col">
                    <div class="card" style="width: 18rem;">
                        <div class="card-body">
                            <h5 class="card-title"><c:out value="${project.name}"/></h5>
                            <p class="card-text"><c:out value="${project.description}"/></p>
                            <p><c:out value="Projekt od: ${project.startdate}"/></p>
                            <a href="#" class="btn btn-primary">Go somewhere</a>
                        </div>
                    </div>
                </div>
            <% if (counter%3 == 2) {out.print("</div>");} %>

            <% counter++; %>

        </c:forEach>
        <% if (counter%3 != 0) {out.print("</div>");} %>
        <% counter = 0; %>


</div>
<%@include file="footer.jsp" %>

</body>
</html>
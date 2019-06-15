<%--
  Created by IntelliJ IDEA.
  User: piotr
  Date: 11.05.2019
  Time: 11:26
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page isELIgnored="false" %>
<html>
<head>
    <%@include file="includes.jsp" %>

</head>
<body>

<div class="jumbotron">
    <h2 class="display-4">About me</h2>
    <p class="lead">Born and live in Kraków, Poland.</p>
    <hr class="my-4">


    <table class="table">
        <thead class="thead-dark">
        <tr>
            <th scope="col">#</th>
            <th scope="col">Skill</th>
            <th scope="col">Rate</th>
            <th scope="col">Commercial Experience</th>
        </tr>
        </thead>
        <tbody>
        <tr>
            <th></th>
            <th>Languages</th>
        </tr>
        <c:forEach var="types" items="${ratings}">
            <c:if test="${types.skillId.type.name = 'Language'}">
                <tr>
                    <th scope="row"><c:out value="${rating.skillId.id}"/></th>
                    <td><c:out value="${rating.skillId.name}"/></td>
                    <td>
                        <c:forEach var="stars" begin="1" end="${rating.rateId.rate}">
                            <i class="fas fa-file-code"></i>
                        </c:forEach>
                        <c:forEach var="stars" begin="${rating.rateId.rate}" end="4">
                            <i class="far fa-file-code"></i>
                        </c:forEach>
                    </td>
                    <td><c:out value="${rating.skillId.commercial}"/></td>
                </tr>
            </c:if>
        </c:forEach>

        </tbody>
    </table>

</div>
<%@include file="footer.jsp" %>

</body>
</html>

<%--
  Created by IntelliJ IDEA.
  User: piotr
  Date: 11.05.2019
  Time: 11:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <%@include file="includes.jsp"%>

</head>
<body>
<div class="jumbotron">
    <h2 class="display-4">Contact</h2>
    <p class="lead">This is a simple way to contact me.</p>
    <hr class="my-4">
    <div class="container">
        <div class="row">
            <div class="col">
                <div class="card" style="width: 18rem;">
                    <i class="fab fa-linkedin-in"></i>
                    <div class="card-body">
                        <a href="#" class="btn btn-primary btn-primary-ct">linkedin</a>
                    </div>
                </div>
            </div>
            <div class="col">
                <div class="card" style="width: 18rem;">
                    <i class="fab fa-facebook-f"></i>
                    <div class="card-body">
                        <a href="#" class="btn btn-primary btn-primary-ct">facebook</a>
                    </div>
                </div>
            </div>
            <div class="col">
                <div class="card" style="width: 18rem;">
                    <i class="fab fa-stack-overflow"></i>
                    <div class="card-body">
                        <a href="#" class="btn btn-primary btn-primary-ct">stackoverflow</a>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>

<%@include file="footer.jsp"%>

</body>
</html>
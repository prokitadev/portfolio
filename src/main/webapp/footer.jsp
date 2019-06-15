<%@ page import="java.time.Year" %>
<%@ page isELIgnored="false" %>
<%--
  Created by IntelliJ IDEA.
  User: piotr
  Date: 11.05.2019
  Time: 11:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
</head>
<body>
<hr>
<%! Year year = Year.now(); %>

<p class="foot">&copy; Piotr Rokita <%= year %></p>
</body>
</html>

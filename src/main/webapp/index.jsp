<%@ page import="java.time.LocalDate" %>
<%@ page import="java.time.Duration" %>
<%@ page import="java.time.Period" %>
<%@ page isELIgnored="false" %>
<html>
<head>
 <%@include file="includes.jsp"%>

</head>
<body>
<%! long counterTime = Period.between(LocalDate.of(2018, 10, 27), LocalDate.now()).toTotalMonths(); %>

<div class="jumbotron">
 <h1 class="display-4">Hello world!</h1>
 <p class="lead">My adventure with Java starts <%= counterTime %> moths ago.</p>
 <hr class="my-4">
 <div class="btn-group" role="group" aria-label="Basic example">
  <button type="button" class="btn btn-secondary button-1">Languages: </button>
  <button type="button" class="btn btn-secondary">Java</button>
  <button type="button" class="btn btn-secondary">SQL</button>
  <button type="button" class="btn btn-secondary">JavaScript</button>
  <button type="button" class="btn btn-secondary button-3">polski</button>
  <button type="button" class="btn btn-secondary button-3">english</button>
 </div>

</div>



<%@include file="footer.jsp"%>

</body>
</html>

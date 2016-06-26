<%--
  Created by IntelliJ IDEA.
  User: GrupoUTP
  Date: 25/06/2016
  Time: 21:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:useBean id="service" class="pe.com.laurente.models.ServiceBean" scope="session"/>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="showEmployee.jsp" method="post">
    <div class="form-group">
        <label for="criteria">Code for Search</label>
        <p></p>
        <select name="criteria" id="criteria" class="combo-box">



            <c:forEach var="employee" items="${service.employeesForNum}">
                <option value="<c:out value="${employee.firstname}"/>"></option>
            </c:forEach>
        </select>

    </div>
    <button type="submit" class="btn btn-default">Submit</button>
</form>
</body>
</html>

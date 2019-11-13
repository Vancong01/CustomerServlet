<%--
  Created by IntelliJ IDEA.
  User: laptop
  Date: 13/11/2019
  Time: 1:39 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>


  <c:forEach items="${danh_sach_khach_hang}" var="customer">

    <h2><c:out value="${customer.getName()}"></c:out></h2>
    <h2><c:out value="${customer.getDate()}"></c:out></h2>
      <h2><c:out value="${customer.getAddress()}"></c:out></h2>
      <h2><c:out value="${customer.getImage()}"></c:out></h2>

  </c:forEach>

  </body>
</html>

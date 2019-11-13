<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Danh sách sản phẩm</title>
    <style>
        table, tr, td {
            border: 1px solid grey;
        }
    </style>
</head>
<body>

<table>

    <tr>
        <td>Tên</td>
        <td>Ngày Sinh</td>
        <td>Địa chỉ</td>
        <td>Hình Ảnh</td>
    </tr>

    <c:forEach items="${danh_sach_khach_hang}" var="customer">

        <tr>
            <td>${customer.getName()}</td>
            <td>${customer.getDate()}</td>
            <td>${customer.getAddress()}</td>
            <td>
                <img src="${customer.getImage()}" height="50" width="50" />
            </td>

        </tr>


    </c:forEach>
</table>

</body>
</html>
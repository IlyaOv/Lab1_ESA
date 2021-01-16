<%--
  Created by IntelliJ IDEA.
  User: Ilya
  Date: 04.11.2020
  Time: 15:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Adress</title>
    <style type="text/css">
        TABLE {
            width: 600px;
            border: 4px double black;
            border-collapse: collapse;
        }
        TD, TH {
            border: 1px solid black;
        }
    </style>
</head>
<body>
<div align="center">
    <table>
        <thead style="background: #C0C0C0">
        <tr>
            <td>ID</td>
            <td>Street name</td>
            <td>House number</td>
            <td>Letter</td>
            <td>Parts</td>
        </tr>
        </thead>
        <tbody style="background: #FFE4C4">
        <c:forEach items="${adressList}" var="house">
            <tr>
                <td>${house.house_id}</td>
                <td>${house.street_id.name}</td>
                <td>${house.number}</td>
                <td>${house.liter}</td>
                <td>${house.korpus}</td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>
</body>
</html>

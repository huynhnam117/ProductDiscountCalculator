<%--
  Created by IntelliJ IDEA.
  User: vannam
  Date: 26/09/2022
  Time: 15:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Product Discount Calculator</title>
  </head>
  <body>
  <form action="/convert" method="post"></form>
  <div>
    <h1>Product Discount Calculato</h1>
    <p>Product Description</p>
    <input type="text" name="Product Description">
    <p>List Price</p>
    <input type="text" name="List Price">
    <p>Discount Percent</p>
    <input type="text" name="Discount Percent">
    <br>
    <button type="submit" name="Calculate Discount">Calculate Discount</button>
  </div>

  </body>
</html>

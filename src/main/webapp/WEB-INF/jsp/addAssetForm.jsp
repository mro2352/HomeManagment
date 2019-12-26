<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Add Asset Form</title>
</head>
<body>

    <form action="/">
        Asset Type:<br>
        <input type="text" id="assetType"><br>
        Amount of Asset:<br>
        <input type="text" id="amountOfAsset"><br>
        Price Paid:<br>
        <input type="text" id="pricePaid"><br>
        <br>
        <input type="submit" value="Submit">
    </form>
</body>
</html>
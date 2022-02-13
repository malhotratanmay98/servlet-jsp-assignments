<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add new Product</title>
</head>
<body>

<form action="ProductController" method="post">
    <table>
        <tr>
            <td>Enter name:</td>
            <td><input type="text" name="pname" id="nameId" /></td>
            <td><label id="nameMsg"></label></td>
        </tr>

        <tr>
            <td>Enter price:</td>
            <td><input type="text" name="price" id="priceId" /></td>
            <td><label id="priceMsg"></label></td>
        </tr>


        <tr>
            <td>Enter quantity:</td>
            <td><input type="text" name="quantity" id="quantityId" /></td>
            <td><label id="quantityMsg"></label></td>
        </tr>


        <tr>
            <td>Enter manufacture date:</td>
            <td><input type="text" name="manufactured" id="mfDateId" /></td>
            <td><label id="mfDateMsg"></label></td>
        </tr>
        
        <tr>
            <td>Enter inspected date:</td>
            <td><input type="text" name="inspected" id="inspDateId" /></td>
            <td><label id="inspDateMsg"></label></td>
        </tr>

        <tr>
            <td><input type="submit" onclick="return validate();" /></td>
        </tr>
    </table>


</form>


</body>
</html>
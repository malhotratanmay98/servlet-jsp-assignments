<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
</head>
<body>

<form action="myServlet" method="post">

<p>Enter User-name: <input type="text" name="username" />  </p>
<p>Enter Password: <input type="text" name="password" />  </p>

<input type="submit" name="login" value="login"/>

</form>

</body>
</html>
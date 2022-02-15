<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add new Trainee</title>
<script src="validate.js"></script>
</head>
<body>

	<form action="TraineeController" method="post">

		<table>

			<tr>

				<td>Enter Trainee Name:</td>
				<td><input type="text" name="tname" id="nameId" /></td>
				<td><label id="nameMsg"></label></td>


			</tr>

			<tr>
				<td>Enter Branch:</td>
				<td><input type="text" name="branch" id="branchId" /></td>
				<td><label id="branchMsg"></label></td>
			</tr>


			<tr>
				<td>Enter Percentage:</td>
				<td><input type="text" name="percentage" id="percentageId" /></td>
				<td><label id="percentageMsg"></label></td>
			</tr>

			<tr>
				<td><input type="submit" onclick="return validate();" /></td>
			</tr>


		</table>


	</form>


</body>
</html>
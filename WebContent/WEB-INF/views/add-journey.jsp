<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Journey</title>
</head>
<body>
	<form:form commandName="journey">
		<table>
			<tr>
				<td>Source :</td>
				<td><form:input path="source" /></td>
				<td><span style="color: red;"><form:errors path="source" /></span></td>
			</tr>
			<tr>
				<td>Destination :</td>
				<td><form:input path="destination" /></td>
				<td><span style="color: red;"><form:errors
							path="destination" /></span></td>
			</tr>
			<tr>
				<td>Journey Date :</td>
				<td><form:input path="journeyDate" /></td>
				<td><span style="color: red;"><form:errors
							path="journeyDate" /></span></td>
			</tr>
			<tr>
				<td>Amount :</td>
				<td><form:input path="amount" /></td>
				<td><span style="color: red;"><form:errors path="amount" /></span></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="Add" /></td>
			</tr>
		</table>
	</form:form>
</body>
</html>
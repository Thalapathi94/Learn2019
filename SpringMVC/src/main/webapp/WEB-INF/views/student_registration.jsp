<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
	<title>Student Registration</title>
</head>
<body>
	<form:form action="processForm" modelAttribute="student">
		First name: <form:input path="firstName" />
		<br><br>
		Last name: <form:input path="lastName" />
		<br><br>
		Sex:
		<form:select path="sex">
			<form:options items="${student.options}" />
		</form:select>
		<br><br>
		Email Id: <form:input path="email" />
		<br><br>
		Password: <form:input path="password" />
		<br><br>
		<input type="submit" value="Submit" />
	</form:form>


</body>

</html>




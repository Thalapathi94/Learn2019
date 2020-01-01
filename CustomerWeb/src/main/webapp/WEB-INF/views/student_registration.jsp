<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
	<title>Student Registration</title>
	<style>
		.error {color:red}
	</style>
</head>
<body>
	<form:form action="processForm" modelAttribute="student">
		First name: <form:input path="firstName" />
		<br><br>
		Last name: <form:input path="lastName" />
		<form:errors path="lastName" cssClass="error" />
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




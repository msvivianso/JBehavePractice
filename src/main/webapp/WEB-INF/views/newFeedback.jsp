<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form:form id="feedbackForm" modelAttribute="feedbackInfo">
		<table>
			<tr>
				<td>
					Your Name:
				</td>
				<td>
					<form:input path="giver"/>
				</td>
			</tr>
			<tr>
				<td>
					Name of Person To Receive Feedback:
				</td>
				<td>
					<form:input path="receiver"/>
				</td>
			</tr>
			<tr>
				<td>
					Feedback:
				</td>
				<td>
					<form:input path="feedback"/>
				</td>
			</tr>
			<tr>
				<td colspan="2">
					 <input id="submit" type="submit" value="Submit" />
				</td>
			</tr>
		</table>
	</form:form>
</body>
</html>
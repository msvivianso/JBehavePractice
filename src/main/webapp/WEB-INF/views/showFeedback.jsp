<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Submitted Feedback:
</h1>
	<div id="result">
		<h2>
            <dl>
                <c:forEach var="feedback" items="${listOfFeedback}">
                    <dt>Feedback for <c:out value="${feedback.receiver}"/> written by <c:out value="${feedback.giver}"/></dt>
                    <dd>- <c:out value="${feedback.feedback}"/></dd>
                </c:forEach>
            </dl>
		</h2>
	</div>
</body>
</html>

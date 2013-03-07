<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Confirmation d'enregistrement du Clip ${clipName } </title>
<link rel="stylesheet" href="resources/css/base.css">
</head>
<body>

	<form:form name="displayClipForm" method='post' modelAttribute='clip' 
							action='/springdisplaytemplate/clipDisplay'>

		<h4>Le Clip  ${clipName} a été sauvegardé avec succès</h4>
		<p>${clipDurationInSeconds }</p>
		<p>${clipOrderNumber } , ${nextClipUri }</p>
		<p>${nextClipUri }</p>
		
		<form:input type="hidden" path="clipName" value="${clipName }" />
		<input type="submit" value="Afficher le Clip" />
		
	</form:form>

</body>
</html>
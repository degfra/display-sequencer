<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Fin du Clip ${clipName }</title>
</head>
<body>
	<form:form id="ReturnToClipsListForm" method="get" modelAttribute="clip" 
					action="/springdisplaytemplate/clipsList" >
		<h3>L'affichage du Clip : ${clipName } (durée ${clipDurationInSeconds } secondes) est terminé.</h3>
		<br><br>
		<input type="submit" value="Retour à la liste de Clips" />
	
	</form:form>

</body>
</html>
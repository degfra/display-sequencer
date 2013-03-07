<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Choix d'un Clip pour affichage</title>
</head>
<body>

	<form:form id="clipChoiceForm" method="post" modelAttribute="clip" 
					action="/springdisplaytemplate/runClip" >
			
		<h3>Choisissez un Clip : </h3>
				
		<table>
			<c:forEach var="name" items="${clipNames }">
				<tr>
					<td>	
						${name}
						
						<form:radiobutton path="clipName" value="${name}" />
						
					</td>
				<tr>  
				</c:forEach>
			</table>
			
			<form:label path="clipDurationInSeconds" >Durée du Clip en secondes</form:label>
						<form:input path="clipDurationInSeconds"  size="5" />
						
						<form:label path="isLoop" >En boucle ?</form:label>
						<form:radiobutton path="isLoop" value="yes" />
						<form:label path="isLoop" >Oui</form:label>
						<form:radiobutton path="isLoop" value="No" />
						<form:label path="isLoop" >Non</form:label>
				
			<br><br>
			<input type="submit" value="Afficher le Clip choisi" />
			<form:input type="hidden" path="nextClipUri" value="${nextClipUri }" />
	</form:form>

</body>
</html>
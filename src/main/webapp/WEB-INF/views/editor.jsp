<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Éditeur de modèle</title>
<script type="text/javascript" src="resources/js/appendCode.js"></script>
</head>
<body>
	<script type="text/javascript" src="resources/js/jscolor/jscolor.js"></script>

	<h3>Éditeur de modèle</h3>
	
	<c:choose> 
		<c:when test="${baseTemplateChosen == 0}">
			<form:form id="baseTemplateChoiceForm" method="post" modelAttribute="template">
			
				<h4>Choisissez un modèle de base : </h4>
				
				<table>
					<c:forEach var="uri" items="${baseTemplateUris }">
					  <tr>
						<td>	
							<form:radiobutton path="baseTemplateUri" value="${uri}" />
						</td>
						<td>${uri}</td>
						<td><a href="#"> __Aperçu</a></td>
					  <tr>  
					</c:forEach>
				</table>
				
				<br>
				<input type="submit" />
			</form:form>
		</c:when>
		<c:when test="${baseTemplateChosen == 1}">
			
		Le modèle de base choisi est : ${baseTemplateUri}<br>
		<a href="/springdisplaytemplate/editor">Choisir un autre modèle de base</a></a>
			
			<form:form id="templateConfigForm" method="post" modelAttribute="template">
			
			<h3>Configuration du modèle de base : ${baseTemplateUri}
			<input type="button"  value ="Aperçu" /></h3>
			
			<form:hidden path="headerTagsAndAttributes" id="headerEditCode" value="${headerTagsAndAttributes }"/>
			<script>
				var headerEditCode = ${headerTagsAndAttributes };
			</script>			
			<div id="content">
			<a href="javascript:insertcode()">Configurer l'entête</a></div>
			<br>
			<form:label path="baseTemplateUri">Couleur du fond : </form:label>
			<form:input path="baseTemplateUri" class="color" value="#cccccc" />
			
			<!-- TODO : Expose Attributes of all containers (header, footer, main, etc.) -->
			
			<!-- TODO : Preview Button) -->
				
			</form:form>	
			
			
		</c:when>
		<c:when test="${baseTemplateChosen == 2}">
			<h4>Aucun modèle choisi :</h4>
			<p><a href="/springdisplaytemplate/editor">Choisir un modèle de base</a></a></p>
		</c:when>
		<c:otherwise>	
		</c:otherwise>
	</c:choose>

</body>
</html>
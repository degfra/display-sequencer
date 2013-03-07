<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" %>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>�diteur de mod�le</title>
</head>
<body>

	<h3>�diteur de mod�le</h3>
	
 
<!--  	<c:choose> 
		<c:when test="${availableBaseTemplatesUrisList.size() > 0}">  -->
			<form:form  method="post" modelAttribute="template"> 
				<h4>Mod�les disponibles : choisissez un mod�le</h4>
				<table>
					<c:forEach var="uri" items="${uris}" >
						<tr>
							<td><form:radiobutton path="baseTemplateUri" value="${uri}" /></td>
							<td>${uri}</td>
							<td><a href="#"> __Aper�u</a></td>
						</tr>
					</c:forEach>
				</table>
				<br>
				<input type="submit" />
			</form:form> 
<!--		</c:when>
		<c:otherwise>
		    <form:form id="clipConfigurationForm" method="post" modelAttribute="template">
			    <h4>Mod�le choisi : ${baseTemplateUri}</h4>
			    <table>
				    <c:forEach items="${displayTags }" var="tagName">
				        <tr>
				             <td>${tagName + " : " }</td>
				        </tr>
				        <c:forEach items="displayTags" var="" >
				             <td>${tagName + " : " }</td>
				        </c:forEach>
					    <tr>
						    <td>${tagName + " : " }</td>
						    <td><form:input
								path="${clipEditMap.keySet().iterator().next() }"
								value="${clipEditMap.values().Iterator().next() }" /></td>
					    </tr>
				    </c:forEach>
			    </table>
			    <br>
			    <input type="submit" />
			</form:form>
		</c:otherwise>
	</c:choose>  
 -->
</body>
</html>
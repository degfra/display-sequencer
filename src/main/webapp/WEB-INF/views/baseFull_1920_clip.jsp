<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://ckeditor.com" prefix="ckeditor" %>
<%@page import="com.ckeditor.CKEditorConfig"%>

<!DOCTYPE html>
<!--[if lt IE 7 ]><html class="ie ie6" lang="en"> <![endif]-->
<!--[if IE 7 ]><html class="ie ie7" lang="en"> <![endif]-->
<!--[if IE 8 ]><html class="ie ie8" lang="en"> <![endif]-->
<!--[if (gte IE 9)|!(IE)]><!--> 	

<html lang="en"> <!--<![endif]-->
<head>

	<!-- Basic Page Needs
  ================================================== -->
	<meta charset="utf-8" />
	<title>Full Clip ${clipName }</title>
	<!--[if lt IE 9]>
		<script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
	<![endif]-->
	
	<!-- Mobile Specific Metas
  ================================================== -->
	<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1" />
	
	<!-- JS
  ================================================== -->
   <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.7.1/jquery.min.js"></script>
	<script src="resources/js/modernizr.js"></script>
	<script src="resources/js/ckeditor/ckeditor.js"></script>
	<script type="text/javascript" src="resources/js/clipTimer.js"></script>
	
	<script>
	function countDown() {
		if (count <= 0) {
			document.clipForm.submit();
		} else {
			count--;
			//document.getElementById("timer").innerHTML = " Il reste : " + count
					+ " secondes. ";
			setTimeout("countDown()", 1000);
		}
	}
</script>
	
	<!-- CSS
  ================================================== -->
	<link rel="stylesheet" href="resources/css/animate.min.css">
	<link rel="stylesheet" href="resources/css/base.css">
	<link rel="stylesheet" href="resources/css/skeleton_2sidebars_1920.css">
	<link rel="stylesheet" href="resources/css/layout_full_1920.css">
	
	
</head>
<body scroll="no" style="overflow: hidden" leftmargin="0" topmargin="0"
	rightmargin="0" bottommargin="0" marginwidth="0" marginheight="0">
<!-- 	<body>    -->

	<!-- Primary Page Layout
	================================================== -->
	
	<form:form name='clipSaveForm' method='post' modelAttribute='clip' 
							action='/springdisplaytemplate/saveClip'>
	
	<div class="container" style="${clipBackgroundColor };">
	
		<div id="header" class="sixteen columns" 
						style="${clipBackgroundColor };">
		
			${headerHTMLCode }
	
		</div>
	
		<div id="main" class="sixteen columns" align="center" style="${clipBackgroundColor };">
			
			${mainHTMLCode }
			
		</div>
	
		<div id="footer" class="sixteen columns" style="${clipBackgroundColor };">
		
			${footerHTMLCode }	

		</div>
		
	<form:label path='clipName' style=' position: relative; left: 102%; top: -15%;' >Saisir le nom du Clip :</form:label>
	<form:input type='text' path='clipName' style=' position: relative; left: 102%; top: -14%'/>
	<input type='submit' value='Sauvegarder le Clip' style=' position: relative; left: 102%; top: -13%;'/>
	<!---->	
	</div><!--container-->
	
	<form:input path="clipDurationInSeconds" id="clipDuration" type="hidden" value="${clipDurationInSeconds }" />
	<form:input type="hidden" path="clipOrderNumber" value="${clipOrderNumber }" />
	<form:input type="hidden" path="nextClipUri" value="${nextClipUri }" />
	
	
	
	</form:form>
	
	<script type="text/javascript">
		var count = document.clipForm.clipDuration.value;
		countDown();
	</script>
	
	
	</script>
		
	<!-- JS
	================================================== -->
	<script src="//ajax.googleapis.com/ajax/libs/jquery/1.5.1/jquery.js"></script>
	<script>window.jQuery || document.write("<script src='javascripts/jquery-1.5.1.min.js'>\x3C/script>")</script>
	<script src="resources/css/js/app.js"></script>
	
<!-- End Document
================================================== -->
</body>
</html>
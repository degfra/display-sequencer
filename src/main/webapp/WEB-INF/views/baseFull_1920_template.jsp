<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://ckeditor.com" prefix="ckeditor" %>
<%@page import="java.util.Map"%>
<%@page import="java.util.HashMap"%>
<%@page import="com.ckeditor.CKEditorConfig"%>



<!DOCTYPE html>
<!--[if lt IE 7 ]><html class="ie ie6" lang="en"> <![endif]-->
<!--[if IE 7 ]><html class="ie ie7" lang="en"> <![endif]-->
<!--[if IE 8 ]><html class="ie ie8" lang="en"> <![endif]-->
<!--[if (gte IE 9)|!(IE)]><!--> 	<html lang="en"> <!--<![endif]-->
<head>

	<!-- Basic Page Needs
  ================================================== -->
	<meta charset="utf-8" />
	<title>Sidebars Base Template</title>
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
	<script src="resources/js/jscolor/jscolor.js"></script>
	
	<script type="text/javascript">
		function previewClip() {
			
			window.open("/springdisplaytemplate/clipEditPreview");
			window.focus();
			
		}
	</script>
	
	<!-- CSS
  ================================================== -->
	<link rel="stylesheet" href="resources/css/animate.min.css">
	<link rel="stylesheet" href="resources/css/base.css">
	<link rel="stylesheet" href="resources/css/skeleton_2sidebars_1920.css">
	<link rel="stylesheet" href="resources/css/layout_full_1920.css">
	
	
</head>
<!-- <body scroll="no" style="overflow: hidden" leftmargin="0" topmargin="0"
	rightmargin="0" bottommargin="0" marginwidth="0" marginheight="0">  -->
	<body>

	<!-- Primary Page Layout
	================================================== -->
	
	<!-- This <div> holds alert messages to be display in the sample page. -->
	<div id="alerts">
		<noscript>
			<p>
				<strong>CKEditor requires JavaScript to run</strong>. In a browser with no JavaScript
				support, like yours, you should still see the contents (HTML data) and you should
				be able to edit it normally, without a rich editor interface.
			</p>
		</noscript>
	</div>
	<div id="sharedToolbar" >
	</div>
	
	<form:form name="templateConfigForm" method="post" modelAttribute="template" 
							action="/springdisplaytemplate/templateEditing">
	
	<div class="container">
	
		<div id="header" class="sixteen columns" >
		
		<form:textarea path="headerEditor" cols="80" id="headerEditor" name="headerEditor" rows="10" ></form:textarea>

		</div>
		
		<div id="main" class="sixteen columns" align="center">
			
			<form:textarea path="mainEditor" cols="80" id="mainEditor" name="mainEditor" rows="10"></form:textarea>
			
		</div>
		
		<div id="footer" class="sixteen columns">
		
			<form:textarea path="footerEditor" cols="80" id="footerEditor" name="footerEditor" rows="10"></form:textarea>		

		</div>
		
	</div><!-- container -->
	
	<input type="submit" value="1. Appliquer les changements" style=" position: absolute; left: 970px; top: 120px;"/>
	<input type="button" value="2. Aperçu du Clip" 
						style=" position: absolute; left: 970px; top: 160px;"
						onClick="javascript: previewClip()"/>
	<form:label  path="backgroundColor" style=" position: absolute; left: 970px; top: 230px; font-size: 100%;" >Choisir la couleur de fond :</form:label>
	<form:input path="backgroundColor" class="color" value="${backgroundColor}"
				style=" position: absolute; left: 970px; top: 250px;" />
	
	</form:form>
	
	<div style=" font-size: 100%; position: absolute; left: 970px; top: 300px;" >
	
		<strong>Typographie : style CSS de bloc obligatoire</strong><br>
			font-size: 100%;  <br><br>
		<strong>Typographie : exemples de remplacement de la taille</strong><br>
			font-size: 140%;  <br>
			font-size: 70%;  <br><br>
		
		<strong>Effets d'animation : <br>(class CSS à configurer en dernier)</strong><br>
			animated fadeInLeftBig <br>
			animated fadeInRightBig <br>
			animated bounceInLeft <br>
			animated bounceInRight <br>
			animated bounceInDown <br>
			animated bounceOutDown <br>
			animated fadeIn <br>
			animated rollIn <br>
			animated rollOut <br>
			animated rotateInDownLeft <br>
			animated rotateOutDownRight <br>
			animated tada <br>
			animated pulse <br>
			animated wobble <br> <br>

		<strong>Durée et délai d'animation : <br>(Style : en secondes)</strong><br>
			-moz-animation-duration: 3s; <br>
			animation-delay: 1.5s; <br><br>
			
		<strong>Vidéos : <br>
			Bouton Source : coller le code embed Youtube
			et appondre à l'Url l'attribut :</strong><br>
			?&amp;autoplay=1 <strong> et supprimer le tag p</strong>
		
	</div>
	
	<div id="sharedPath" />
	
	<script type="text/javascript">
	//<![CDATA[

		// Create all editor instances at the end of the page, so we are sure
		// that the "bottomSpace" div is available in the DOM (IE issue).

		CKEDITOR.replace( 'headerEditor',
			{
				sharedSpaces :
				{
					top : 'sharedToolbar',
					bottom : 'sharedPath'
				},

				// Removes the maximize plugin as it's not usable
				// in a shared toolbar.
				// Removes the resizer as it's not usable in a
				// shared elements path.
				removePlugins : 'maximize,resize',
				height : '20'
			} );

		CKEDITOR.replace( 'mainEditor',
			{
				sharedSpaces :
				{
					top : 'sharedToolbar',
					bottom : 'sharedPath',
				},

				// Removes the maximize plugin as it's not usable
				// in a shared toolbar.
				removePlugins : 'maximize',
				height : '605'
			} );
		
		CKEDITOR.replace( 'footerEditor',
				{
					sharedSpaces :
					{
						top : 'sharedToolbar',
						bottom : 'sharedPath',
					},

					// Removes the maximize plugin as it's not usable
					// in a shared toolbar.
					removePlugins : 'maximize',
					height : '20'
				} );
	//]]>
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
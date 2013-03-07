<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://ckeditor.com" prefix="ckeditor" %>
    
<!DOCTYPE html>
<!--[if lt IE 7 ]><html class="ie ie6" lang="en"> <![endif]-->
<!--[if IE 7 ]><html class="ie ie7" lang="en"> <![endif]-->
<!--[if IE 8 ]><html class="ie ie8" lang="en"> <![endif]-->
<!--[if (gte IE 9)|!(IE)]><!--> 	<html lang="en"> <!--<![endif]-->
<head>

	<!-- Basic Page Needs
  ================================================== -->
	<meta charset="utf-8" />
	<title>RightSidebar</title>
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
	
	<!-- CSS
  ================================================== -->
	<link rel="stylesheet" href="resources/css/animate.min.css">
	<link rel="stylesheet" href="resources/css/base.css">
	<link rel="stylesheet" href="resources/css/skeleton_1sidebar_1920.css">
	<link rel="stylesheet" href="resources/css/layout_rightsidebar_1920.css">
	
	<!-- Favicons
	================================================== -->
	<link rel="shortcut icon" href="images/favicon.ico">
	<link rel="apple-touch-icon" href="images/apple-touch-icon.png">
	<link rel="apple-touch-icon" sizes="72x72" href="images/apple-touch-icon-72x72.png" />
	<link rel="apple-touch-icon" sizes="114x114" href="images/apple-touch-icon-114x114.png" />
	
</head>
<!-- <body scroll="no" style="overflow: hidden" leftmargin="0" topmargin="0"
	rightmargin="0" bottommargin="0" marginwidth="0" marginheight="0">  -->
	<body>
	
	<script type="text/javascript">
	
			function setCKCode(){
				//var mainData = CKEDITOR.instances.editable.getData();
				return mainData;
			}
	
			function submitEditCode() {
				//document.getElementById('headerCKCode').value = mainData;
				//document.forms["headerHtmlForm"].headerCKCode.value = mainData;
				//document.getElementById('headerHtmlForm').submit();
				document.forms["headerHtmlForm"].submit();
			}
	</script>

	<!-- Primary Page Layout
	================================================== -->
	<form:form name="headerHtmlForm" method="post" modelAttribute="template" 
							action="/springdisplaytemplate/templateEditing">
	
	<div class="container" contenteditable="true">
	
		<div id="header" class="sixteen columns" >
			<p>Entête</p>
		</div>
		
		<div id="main" class="twelve columns" >
		
			<h5 class="animated fadeInLeftBig" style=" -moz-animation-duration: 1s;">
						Zone principale</h5>
						
			<div class="three columns" style=" position: relative; top: 10%;">
				<p class="animated fadeInLeftBig" 
						style=" -moz-animation-duration: 3s; animation-delay: 1.5s;
						position: relative; left: 5%; 
						width: 100%;  max-height: 150px; border: 1px solid blue; background-color: silver; padding: 1%;" align="justify">
							Main Main Main Main Main Main Main Main Main Main Main Main Main Main Main 
							</p>
			</div>
						
			<div class="three columns" style=" position: relative; top: 10%;">
				<p class="animated fadeInLeftBig" 
						style=" -moz-animation-duration: 3s; animation-delay: 4s;
						position: relative; left: 5%; 
						width: 100%; border: 1px solid blue; background-color: silver; padding: 1%;" align="justify">
							Main Main Main Main Main Main Main Main Main Main Main Main Main Main Main 
							</p>
			</div>
			
			<div class="three columns" style=" position: relative; top: 10%;">
				<p class="animated fadeInLeftBig" 
						style=" -moz-animation-duration: 3s; animation-delay: 6s;
						position: relative; left: 5%; 
						width: 100%; border: 1px solid blue; background-color: silver; padding: 1%;" align="justify">
							Main Main Main Main Main Main Main Main Main Main Main Main Main Main Main 
							</p>
			</div>				
			
		</div>
		
		<div id="rightsidebar" class="four columns" >
			<p style="margin-left: 10px" align="left">Colonne de droite</p>
		</div>
		
		<div id="footer" class="sixteen columns" >
			<p>Pied de page</p>
		</div>
		
	</div><!-- container -->
	
	<form:hidden path="headerEditCode" id="headerEditCode" />
	
	<script type="text/javascript">
	CKEDITOR.disableAutoInline = false;

	var editor = CKEDITOR.inline( 'editable', {
	    on: {
	        instanceReady: function() {
	            periodicData();
	        }
	    }
	} );

	var periodicData = ( function(){
	    var data, oldData;

	    return function() {
	        if ( ( data = CKEDITOR.instances.editable.getData() ) !== oldData ) {
	            oldData = data;
	            console.log( data );
	            alert("CK Data : " + data);
	            document.forms["headerHtmlForm"].headerEditCode.value = data;
	        }

	        setTimeout( periodicData, 500 );
	    };
	})();
	</script>
			
	<input type="button" onclick="javascript: submitEditCode()" 
				value="Sauvegarder les changements" />
			
	</form:form>
	
		
	<!-- JS
	================================================== -->
	<script src="//ajax.googleapis.com/ajax/libs/jquery/1.5.1/jquery.js"></script>
	<script>window.jQuery || document.write("<script src='javascripts/jquery-1.5.1.min.js'>\x3C/script>")</script>
	<script src="resources/css/js/app.js"></script>
	
<!-- End Document
================================================== -->
</body>
</html>
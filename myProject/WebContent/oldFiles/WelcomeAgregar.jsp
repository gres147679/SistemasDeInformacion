<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<link rel="stylesheet" type="text/css" href="estilo.css"/>
<html>
<head>
<title>Bienvenida profesor</title>
</head>
<body>

<div class="container_3">
	<div class="grid_3"><div class="banner"></div><div class="blue_bar">Bienvenido, <%= session.getAttribute( "username" ) %> </div></div>
	    <div class="grid_1">
	    	<p></p>
	    	
		    <s:url id="url" action="modMaterial"></s:url>
			<s:a href="%{url}">Agregar material de apoyo</s:a><br/><br/>
			
		    <s:url id="url" action="modTitulo"></s:url>
			<s:a href="%{url}">Agregar títulos académicos</s:a><br/><br/>
	    	
		    <s:url id="url" action="listTitulo"></s:url>
			<s:a href="%{url}">Mostar/Modificar títulos académicos</s:a><br/><br/>
			
			<s:url id="url" action="listMaterialApoyo"></s:url>
			<s:a href="%{url}">Mostrar/Modificar material de apoyo</s:a><br/><br/>
			
			<s:url id="url" action="listMateria"></s:url>
			<s:a href="%{url}">Mostrar/Modificar materias modificadas</s:a><br/><br/>
			
			<s:url id="url" action="logout"></s:url>
			<s:a href="%{url}">Cerrar sesión</s:a>
		</div>
		<div class="grid_2">
		    <h5>Elija una opcion del menu a su izquierda. En esta sección usted podrá modificar su información académica
		    almacenada en el sistema, o agregarla si es usuario nuevo.</h5>
	    </div>

    </div>
</body>
</html>
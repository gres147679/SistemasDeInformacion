<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<link rel="stylesheet" type="text/css" href="estilo.css"/>
<html>
<head>
<title>Agregar titulos del profesor</title>
</head>
<body>
<div class="container_3">
	<div class="grid_3"><div class="banner"></div><div class="blue_bar">Bienvenido, <%= session.getAttribute( "username" ) %> </div></div>
		<div class="grid_2">
			<h4>La informacion no fue agregada. Debe rellenar todos los campos</h4>
			<s:url id="url" action="verPlanilla"></s:url>
			<s:a href="%{url}">Volver al menu principal</s:a><br/><br/>
		</div>
	</div>
</body>
</html>
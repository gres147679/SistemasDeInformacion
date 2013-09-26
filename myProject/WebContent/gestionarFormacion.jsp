<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="/struts-tags" prefix="s"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration Page</title>
<s:head />
<style type="text/css">
@import url(style.css);
</style>
</head>
<body>
<s:actionerror/>
<s:form action="saveOrUpdateTitulo">
	<s:push value="titulo">
		<s:hidden name="id" />
		<s:textfield key="titulo.formacion"/>
		<s:textfield key="titulo.institucion"/>
		<s:radio key="titulo.tipoformacion" list="#{'1':'Titulo','2':'Curso'}" value="1" />
		<s:hidden name="nombreusuario" value="%{#session.username}" />
		<s:submit />
	</s:push>
</s:form>

<s:if test="tituloList.size() > 0">
	<div class="content">
	<table class="tituloTable" cellpadding="5px">
		<tr class="even">
			<th>Titulo</th>
			<th>Instituci�n</th>
			<th>Tipo</th>
			<th>Editar</th>
			<th>Borrar</th>
		</tr>
		<s:iterator value="tituloList" status="tituloStatus">
			<tr
				class="<s:if test="#tituloStatus.odd == true ">odd</s:if><s:else>even</s:else>">
				<td><s:property value="formacion" /></td>
				<td><s:property value="institucion" /></td>
				<td><s:property value="tipoformacion" /></td>
				<td><s:url id="editURL" action="editTitulo">
					<s:param name="id" value="%{id}"></s:param>
				</s:url> <s:a href="%{editURL}">Editar</s:a></td>
				<td><s:url id="deleteURL" action="deleteTitulo">
					<s:param name="id" value="%{id}"></s:param>
				</s:url> <s:a href="%{deleteURL}">Borrar</s:a></td>
			</tr>
		</s:iterator>
	</table>
	</div>
</s:if>

<s:url id="url" action="login">
</s:url>
<s:a href="%{url}">Volver al menu anterior</s:a>

</body>
</html>
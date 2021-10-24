
<!--
*********************************************
The form for entering / showing the info
*********************************************
-->

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%
	String contextPath = request.getContextPath();
	String name = "Timmm";
%>



<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <meta http-equiv="X-UA-Compatible" content="IE=edge"/>
    <meta name="viewport" content="width=device-width, initial-scale=1"/>
    <title>Hello</title>
</head>
<body>

<a href="<%= contextPath %>/Welcome.do">Welcome</a> </a> <br>
<a href="<%= contextPath %>/Hello.do">EN</a> </a>

<h1><bean:message key="title.welcome" arg0="<%= name %>" /></h1>

<p><bean:message key="label.booklist" />

<p><bean:write name="helloWorldForm" property="message" />

<br><br>


</body>
</html>
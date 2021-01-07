<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1><%= "Java EE!" %>
</h1>
<br/>
<a href="hello-servlet">Hello Servlet</a>
<br/>
<a href="param.html">ParamFromRequest</a>
<br/>
<a href="forwarding1">Forwarding №1 - servlet to page</a>
<br/>
<a href="forwarding2">Forwarding №2 - servlet to servlet</a>
<br/>
<a href="redirect">Redirect id = null</a>
<br/>
<a href="redirect?id=2">Redirect id = 2</a>
<br/>
<a href="exc-servlet">Exception</a>
<br/>
<a href="set">SetCookieServlet</a>
<br/>
<a href="get">GetCookieServlet</a>
<br/>
<a href="createSessionData.html">Session Data CREATE/UPDATE</a>
<br/>
<a href="deleteSessionData.html">Session Data DELETE</a>
<br/>
<a href="sessiondata">Session Data READ</a>
</body>
</html>
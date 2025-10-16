<!-- error.jsp -->
<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<html>
<head><title>Login Error</title></head>
<body>
    <h2>Login Failed</h2>
    <p style="color:red;">
        <%= request.getAttribute("errorMsg") != null ? request.getAttribute("errorMsg") : "" %>
    </p>
    <a href="login.jsp">Try Again</a>
</body>
</html>

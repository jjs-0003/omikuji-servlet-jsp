<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>おみくじだよ！</title>
    </head>
    <body>
        <center>
        <p>おみくじ</p><br>
        <h1><%=request.getAttribute("result") %></h1><br>
        <%=request.getAttribute("message") %>
        </center>
    </body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%out.print("Good morning"); %>
	<%! String name="Abhi"; %>
	<%! int age=24; %>
	<%= "Name is : "+ name %>
	<%= "Age is  : "+ age %>
</body>
</html>
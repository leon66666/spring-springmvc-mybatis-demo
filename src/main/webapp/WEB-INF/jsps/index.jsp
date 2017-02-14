<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib uri="http://www.opensymphony.com/oscache" prefix="oscache" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

现在时间：<%=new Date() %><br>

<!--缓存时间4秒  -->
<oscache:cache time="4">
4秒缓存时间：<%=new Date() %><br>
</oscache:cache>

<!--设置缓存的作用域为session，默认是application作用域  -->
<oscache:cache scope="session">
session作用域缓存时间(不同的浏览器不同的缓存,不同的url不同的缓存)：<%=new Date() %><br>
</oscache:cache>

<!--设置缓存的key，不同的访问url缓存也会相同-->
<oscache:cache key="zhongqiu">
设置缓存的key，不同的访问url缓存也会相同：<%=new Date() %><br>
</oscache:cache>
</body>
</html>
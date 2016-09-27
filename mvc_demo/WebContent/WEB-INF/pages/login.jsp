<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%
	//得到上下文路径
	String path = request.getContextPath();
	
%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登陆页面</title>
</head>
<body>
	<form action="<%=path %>>/controller">
		<input type="hidden" name="action" value="login">
		用户名：<input type="text" name="name"><br>
                  密码：<input  type="password" name="password"><p>
        <input type="reset" value="重填">
        <input type="submit" value="登录">
	</form>
</body>
</html>
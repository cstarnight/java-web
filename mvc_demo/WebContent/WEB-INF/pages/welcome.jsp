<%@ page contentType="text/html;charset=UTF-8" %>
<jsp:useBean id="user" scope="session" type="org.web.forget.bean.UserBean"/>

欢迎<jsp:getProperty name="user" property="name"/>!
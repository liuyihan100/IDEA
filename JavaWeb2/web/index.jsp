<%--
  Created by IntelliJ IDEA.
  User: 帅帅小晗
  Date: 2020/7/24
  Time: 9:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page import="com.gui.dao.Dao" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
    <%
      String name = request.getParameter("name");
      String password = request.getParameter("password");
      boolean result = Dao.check(name,password);
      if(result == true){
          out.print("登陆成功");
      }else{
          out.print("登陆失败");
      }
    %>
  </body>
</html>

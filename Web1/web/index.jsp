<%@ page import="javax.naming.InitialContext" %><%--
  Created by IntelliJ IDEA.
  User: 帅帅小晗
  Date: 2020/6/9
  Time: 23:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>first code</title>
  </head>
  <body>
      hello,world。。。
      <a href="Servlet">hello</a><br/>
        <%
            InitialContext context = new InitialContext();
            String value = (String) context.lookup("java:comp/env/sql");
            out.print(value);
        %>

  </body>
</html>

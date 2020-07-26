<%@ page import="com.gui.bean.Employee" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<script>
    var request = new XMLHttpRequest();
    request.open("GET","Servlet1",true);
</script>
<html>
<body>
    <form action="Servlet1">
        <input name="id"/><br/><br/>
        <input name="name"/><br/><br/>
        <input type="submit" value="提交">
    </form>

    <form action="Servlet2" method="post" enctype="multipart/form-data">
        <input name="id"><br/>
        <input type="file" name="picture"/><br/>
        <input type="submit" value="提交"/>
    </form>

    <c:if test="${3 > 1}">
        true
    </c:if>

    <c:set var="name" value="shuai" scope="request" />
    ${requestScope.name}<br/>

    <%
        session.setAttribute("em",new Employee(100,"shazi"));
    %>

</body>
</html>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript" src="${pageContext.servletContext.contextPath }/js/JQuery-1.12.4.js"></script>
    <script>
        $(function () {
            $('#but').click(function () {
                $.ajax({
                    url:"json",
                    type:"post",
                    data:"json",
                    success:function(msg) {
                        var tb = "<table>";
                        tb += "<tr><th>ID</th><th>LASTNAME</th>"
                        for(i in msg){
                            tb += "<tr><th>" + msg[i].employee_id + "</th><th>" + msg[i].last_name + "</th></tr>";
                        }
                        $("body").append(tb);
                    }
                })
            })
        })
    </script>
</head>
<body>
    <input type="button" value="查询" id="but"/>
</body>
</html>

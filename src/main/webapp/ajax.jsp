<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="https://cdn.bootcdn.net/ajax/libs/jquery/3.6.0/jquery.js"></script>
    <script>
        var userList = new Array()
        userList.push({name:"张三",age:"25",location:"北京"});
        userList.push({name:"李四",age:"24",location:"南京"});

        $.ajax({
            type:"POST",
            url:"${pageContext.request.contextPath}/save2",
            data:JSON.stringify(userList),
            contentType:"application/json;charset=UTF-8"
        })
    </script>
</head>
<body>

</body>
</html>

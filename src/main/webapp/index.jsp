<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<body>
<h2>Hello World!</h2>
</body>
    <form action="${pageContext.request.contextPath}/save1" method="post">
        姓名：<input name="name" type="text">
        年龄：<input name="age" type="text">
        住址：<input name="location" type="text">
        <input type="submit" value="提交">
        <input type="reset" value="重置">
    </form>
</html>

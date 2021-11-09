
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="${pageContext.request.contextPath}/save6" method="post" enctype="multipart/form-data">
        选择上传的文件1:<input type="file" name="uploadFile1"><br/>
        选择上传的文件2:<input type="file" name="uploadFile2"><br/>
        <input type="submit" value="上传">
    </form>
</body>
</html>

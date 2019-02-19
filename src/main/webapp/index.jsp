

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<head>
    <meta charset="utf-8" />
</head>
<body>
<form method="get" action="/l">
    user:<input name="username" type="text"><br/>
    pass:<input type="password" name="password"><br/>
    <input type="submit" value="确定">
</form>
<br/>
<form method="get" action="/s">
    tokens:<input name="tokens" type="text"><br/>

    <input type="submit" value="确定">
</form>
<a href="views/register.jsp">众筹</a>
<h2>Hello World!</h2>
</body>
</html>

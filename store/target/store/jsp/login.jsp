<%--
  Created by IntelliJ IDEA.
  User: NFYX
  Date: 2019/1/3
  Time: 12:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link href="/css/style.css" type="text/css" rel="stylesheet">
</head>
<body>
<div class="nav">

</div>
<div class="form-contain">
    <div class="container-center">
        <form class="container" action="/login" method="post">
            <label class="label-name" for="name">name:</label>
            <input id="name" class="input-name" type="text" name="name">
            <label for="pass" class="label-pass">password:</label>
            <input id="pass" class="input-pass" type="password" name="password">
            <input class="input-submit" type="submit" value="提交">
        </form>
    </div>
</div>
<div class="foot">

</div>
</body>
</html>

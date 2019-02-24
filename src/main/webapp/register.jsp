<%@ page language="java" contentType="text/html; charset=utf-8"
         pageEncoding="utf-8" %>


<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <title>注 册</title>
    <link type="text/css" rel="stylesheet" href="css/style.css"/>
    <script src="/js/jquery-1.8.3.js"></script>
</head>
<body>
<div id="header" class="wrap">
    <img src="images/logo.gif"/>
</div>
<div id="navbar" class="wrap">
    <div class="search">
        <!--
            <form method="get" action="index.html">
                <input type="text" name="keywords" class="input-text" /><input type="submit" name="submit" class="input-button" value="" />
            </form>
        -->
    </div>
</div>
<div id="register" class="box">
    <h2>新用户注册</h2>
    <div class="content">
        <form method="post" onsubmit="return checkForm()" action="/user/register">
            <dl>
                <dt>用户名：</dt>
                <dd><input id="username" type="text" class="input-text" name="vuUserName" value=""/></dd>
                <dt>密码：</dt>
                <dd><input id="password" type="password" class="input-text" name="vuPassword" value=""/></dd>
                <dt>确认密码：</dt>
                <dd><input id="confirmPassword" type="password" class="input-text" name="confirmPassword" value=""/>
                </dd>
                <dt></dt>
                <dd><input type="submit" class="input-button" name="submit" value=""/></dd>
            </dl>
        </form>

    </div>
</div>
<div id="footer" class="wrap">
    百知 &copy; 版权所有
</div>
<script>
    function checkForm() {
        if ($("#username").val() == null || $("#username").val() == "") {
            alert("用户名不能为空");
            return false;
        }
        if ($("#password").val() == null || $("#password").val() == "") {
            alert("密码不能为空");
            return false;
        }
        if ($("#password").val() != $("#confirmPassword").val()) {
            alert("两次密码不一样");
            return false;
        }
        return true;
    }

</script>
</body>
</html>

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

    <html>
    <head lang="en">
        <meta charset="UTF-8">
        <title>登录界面</title>
        <script src="js/jquery-3.3.1.js"></script>
        <script src="js/login.js"></script>
        <link href="css/style.css" rel="stylesheet" type="text/css" />
    </head>

    <body>
        <div id="loginpanelwrap">
            <div class="loginheader">
                <div class="logintitle">登录</div>
            </div>
            <form action = "./loginCheck.html" method="post">
                <div class="loginform">
                   <div class="loginform_row">
                        <label>用户名:</label>
                        <input type="text" class="loginform_input" name="userName" />
                    </div>
                    <div class="loginform_row">
                        <label>密码:</label>
                        <input type="password" class="loginform_input" name="password" />
                    </div>
                    <div class="loginform_row">
                        <span class = "returnInfo"></span>
                        <input type="submit" class="loginform_submit" value="登录" />
                        <input type="reset" value="重置" />
                    </div>
                    <div class="clear"></div>
                </div>
            </form>
        </div>
		
		  <%String s = session.getId(); //获取session ID号  %>
    <p>你的session对象ID是：</p>
<%=s %>
    </body>
</html>

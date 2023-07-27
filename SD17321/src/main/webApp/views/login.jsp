
<%@ page pageEncoding="UTF-8" language="java" %>

<html lang="en">
<head>
    <title>Login</title>
    <link rel="stylesheet" href="css/login.css">

    <link rel="stylesheet" href="css/bootstrap.min.css" />
</head>
<body>
<div class="center">

    <h5 id="title">Login Now</h5>

    <form action="/login" method="POST">

        <div class="row container input">
            <div class="col-12">
                <p><input type="text" placeholder=" Email/Username" id="username" name="email"></p>
            </div>
            <div class="col-12">
                <p><input type="password" placeholder=" Password" id="password" name="password"></p>

            </div>
        </div>
        <div class="check_box">
            <input type="checkbox" name="remember" class="remember"/>
            <label class="text-remember">Ghi nhớ đăng nhập</label>
        </div>
        <div class="d-flex text">

            <div  class="mr-auto p-2 link a">
                Forgot Password?
                <a href="#" class="text-link">Click here</a>
            </div>
            <div  class="p-2 link b">
                New User?
                <a href="#" class="text-link">Register here</a>
            </div>

        </div>
        <div>
            <p><button class="btn btn-light"  id="button-login">LOGIN</button></p>

        </div>
    </form>
</div>
</body>
</html>
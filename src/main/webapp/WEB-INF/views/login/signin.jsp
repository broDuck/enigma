<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="../conf/header.jsp"%>
<title>Login</title>

<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/custom/css/signin.css" />
</head>
<body>
<div class="container">
    <div class="signinForm">
        <h2 class="form-signin-heading">Enigma Login</h2>
        <label for="inputEmail" class="sr-only">Email address</label>
        <input type="email" id="inputEmail" class="form-control" placeholder="Email address" required autofocus>
        <label for="inputPassword" class="sr-only">Password</label>
        <input type="password" id="inputPassword" class="form-control" placeholder="Password" required>
        <div class="checkbox">
            <label>
                <input type="checkbox" value="remember-me"> Remember me
            </label>
        </div>
        <button class="btn btn-lg btn-primary btn-block" id="signin">Sign in</button>
    </div>
</div>

<script src="${pageContext.request.contextPath}/resources/custom/js/signin.js"></script>
</body>
</html>
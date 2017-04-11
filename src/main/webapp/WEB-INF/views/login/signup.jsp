<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="../conf/header.jsp"%>

<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/custom/css/signup.css" />
<title>회원가입</title>
</head>

<body>
<div id="container" class="contents">
    <div class="signupForm">
        <h2 class="form-signup-heading">Enigma 회원가입</h2>
        <label for="inputEmail" class="sr-only">Email address</label>
        <input type="email" id="inputEmail" class="form-control" placeholder="Email address" required autofocus>
        <label for="inputPassword" class="sr-only">Password</label>
        <input type="password" id="inputPassword" class="form-control" placeholder="Password" required>
        <label for="inputNickName" class="sr-only">NickName</label>
        <input type="text" id="inputNickName" class="form-control" placeholder="NickName" required>
        <label for="inputAge" class="sr-only">나이</label>
        <input type="number" id="inputAge" class="form-control" placeholder="나이" required>
        <div class="checkSex">
            <span class="radioTitle">성별</span>
            <input type="radio" class="radioSex" name="sex" value="male" checked>남
            <input type="radio" class="radioSex" name="sex" value="female">여
        </div>

        <button class="btn btn-primary btn-block" id="signup">Sign Up</button>
    </div>
</div>

<script src="${pageContext.request.contextPath}/resources/custom/js/signup.js"></script>
</body>

</html>
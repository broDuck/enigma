<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="../conf/header.jsp"%>
<title>투표 만들기</title>

<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/custom/css/createVote.css" />
</head>
<body>
<div class="container">
    <span>투표 제목<input id="inputVoteName" class="form-control" type="text" placeholder="제목을 입력하세요"></span>
    <span>투표 내용<input id="inputVoteContent" class="form-control" type="text" placeholder="내용을 입력하세요"></span>

    <ul class="nav nav-tabs select-vote-kind">
        <li role="presentation" id="OX" class="active"><a href="#">O/X</a> </li>
        <li role="presentation" id="likeHate" class=""><a href="#">좋아요/싫어요</a> </li>
        <li role="presentation" id="objective" class=""><a href="#">객관식</a> </li>
        <li role="presentation" id="image" class=""><a href="#">이미지</a> </li>
    </ul>
    <div id="voteKindTemplate">

    </div>
</div>

<script src="${pageContext.request.contextPath}/resources/custom/js/createVote.js"></script>
</body>
</html>
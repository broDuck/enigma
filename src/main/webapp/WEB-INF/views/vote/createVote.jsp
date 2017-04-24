<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="../conf/header.jsp"%>
<title>투표 만들기</title>

<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/custom/css/createVote.css" />
</head>
<body>
<div class="container">
    <div class="inputSpan">
        <span class="inputSpan">투표 제목<input id="inputVoteName" class="form-control" type="text" placeholder="제목을 입력하세요"></span>
    </div>
    <div class="inputSpan">
        <span class="inputSpan">투표 내용<input id="inputVoteContent" class="form-control" type="text" placeholder="내용을 입력하세요"></span>
    </div>
    <div class="inputSpan">
        <ul class="nav nav-tabs selectVoteKind">
            <li role="presentation" id="OX" class="active"><a href="#">O/X</a> </li>
            <li role="presentation" id="likeHate" class=""><a href="#">좋아요/싫어요</a> </li>
            <li role="presentation" id="objective" class=""><a href="#">객관식</a> </li>
            <li role="presentation" id="image" class=""><a href="#">이미지</a> </li>
        </ul>
    </div>
    <div id="voteKindTemplate" class="row">

    </div>

    <div class="row inputSpan">
        <ul class="nav nav-tabs selectVotePeriod">
            <li role="presentation" id="period" class="active"><a href="#">기간제</a> </li>
            <li role="presentation" id="count" class=""><a href="#">목표 투표수</a> </li>
        </ul>
    </div>

    <div id="votePeriodTemplate" class="row">

    </div>

    <div class="row inputSpan">
        <div class="btn-group">
            <button id="categoryBtn" type="button" class="btn btn-default dropdown-toggle" data-toggle="dropdown" aria-expanded="false">카테고리 선택<span class="caret"></span></button>

            <ul id="categoryList" class="dropdown-menu" role="menu">
                <li><a href="#">글쎄?</a></li>
            </ul>
        </div>
    </div>

    <div class="row inputSpan">
        <div>
            <span>공개설정</span>
        </div>
        <input type="checkbox" name="openSetting" value="age"> 연령대 공개
        <input type="checkbox" name="openSetting" value="sex"> 성별 공개
        <input type="checkbox" name="openSetting" value="private"> 비공개
    </div>

    <div class="row inputSpan">
        <div class="col-sm-12">
            <button class="btn btn-primary btn-lg" id="createButton">투표 만들기</button>
        </div>
    </div>
</div>

<script src="${pageContext.request.contextPath}/resources/custom/js/createVote.js"></script>
</body>
</html>
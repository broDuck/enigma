<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="../conf/header.jsp" %>
<title>Enigma</title>

<link href="${pageContext.request.contextPath}/resources/custom/css/readVote.css" rel="stylesheet">
<link href="${pageContext.request.contextPath}/resources/custom/css/voteResult.css" rel="stylesheet"></head>
<body>
<div class="wrapper">
    <div class="box">
        <div class="row row-offcanvas row-offcanvas-left">


            <!-- main right col -->
            <div class="column col-sm-12 col-xs-12" id="main">

                <!-- top nav -->
                <div class="navbar navbar-blue navbar-static-top">
                    <div class="navbar-header">
                        <button class="navbar-toggle" type="button" data-toggle="collapse"
                                data-target=".navbar-collapse">
                            <span class="sr-only">Toggle</span>
                            <span class="icon-bar"></span>
                            <span class="icon-bar"></span>
                            <span class="icon-bar"></span>
                        </button>
                        <a href="/" class="navbar-brand logo">Enigma</a>
                    </div>
                    <nav class="collapse navbar-collapse" role="navigation">
                        <form class="navbar-form navbar-left">
                            <div class="input-group input-group-sm" style="max-width:360px;">
                                <input type="text" class="form-control" placeholder="Search" name="srch-term"
                                       id="srch-term">
                                <div class="input-group-btn">
                                    <button class="btn btn-default" type="submit"><i
                                            class="glyphicon glyphicon-search"></i></button>
                                </div>
                            </div>
                        </form>
                        <ul class="nav navbar-nav">
                            <li>
                                <a href="/vote/createVote" role="button" data-toggle="modal"><i
                                        class="glyphicon glyphicon-plus"></i> 투표 만들기</a>
                            </li>
                            <li>
                                <a href="#"><span class="badge">알림</span></a>
                            </li>
                        </ul>
                        <ul class="nav navbar-nav navbar-right">
                            <li class="dropdown">
                                <a href="#" class="dropdown-toggle" data-toggle="dropdown"><i
                                        class="glyphicon glyphicon-user"></i></a>
                                <ul class="dropdown-menu">
                                    <li><a href="">More</a></li>
                                    <li><a href="">More</a></li>
                                    <li><a href="">More</a></li>
                                    <li><a href="">More</a></li>
                                    <li><a href="">More</a></li>
                                </ul>
                            </li>
                        </ul>
                        <button class="btn btn-danger navbar-right" id="signout">Sign out</button>
                    </nav>
                </div>
                <!-- /top nav -->

                <div class="padding">
                    <div class="full col-sm-12">

                        <!-- content -->
                        <div class="row">

                            <!-- main col right -->
                            <div class="col-sm-12" id="voteList">
                                <div class="panel panel-default">
                                    <div class="panel-heading">
                                        <h4>제목?</h4>
                                    </div>
                                    <div class="panel-body">
                                        <h4>소제목? 주제?</h4>
                                        <div class="row">
                                            <div class="col-sm-3">
                                                <img src="${pageContext.request.contextPath}/resources/custom/img/dahyun.PNG"
                                                     class="img-thumbnail img-vote">
                                                <p>다현다현다현다현다현다현다현다현</p>
                                            </div>
                                            <div class="col-sm-3">
                                                <img src="${pageContext.request.contextPath}/resources/custom/img/dahyun.PNG"
                                                     class="img-thumbnail img-vote">
                                                <p style="text-align: center">다현</p>
                                            </div>
                                            <div class="col-sm-3">
                                                <img src="${pageContext.request.contextPath}/resources/custom/img/dahyun.PNG"
                                                     class="img-thumbnail img-vote">
                                                <p style="text-align: center">다현</p>
                                            </div>
                                            <div class="col-sm-3">
                                                <img src="${pageContext.request.contextPath}/resources/custom/img/dahyun.PNG"
                                                     class="img-thumbnail img-vote">
                                                <p style="text-align: center">다현</p>
                                            </div>
                                            <div class="col-sm-3">
                                                <img src="${pageContext.request.contextPath}/resources/custom/img/dahyun.PNG"
                                                     class="img-thumbnail img-vote">
                                                <p style="text-align: center">다현</p>
                                            </div>
                                            <div class="col-sm-3">
                                                <img src="${pageContext.request.contextPath}/resources/custom/img/dahyun.PNG"
                                                     class="img-thumbnail img-vote">
                                                <p style="text-align: center">다현</p>
                                            </div>
                                            <div class="col-sm-3">
                                                <img src="${pageContext.request.contextPath}/resources/custom/img/dahyun.PNG"
                                                     class="img-thumbnail img-vote">
                                                <p style="text-align: center">다현</p>
                                            </div>
                                            <div class="clearfix"></div>
                                            <hr>
                                            내용내용내용내용내용내용내용내용내용내용내용
                                        </div>
                                    </div>
                                </div><!--/row-->
                            </div><!-- /col-9 -->
                        </div><!-- /padding -->
                    </div>
                    <!-- /main -->

                </div>
            </div>
        </div>

        <!--투표만들기-->
        <div id="createVoteModal" class="modal fade" tabindex="-1" role="dialog" aria-hidden="true">
            <div class="modal-dialog">
                <div class="modal-content">
                    <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
                        투표 만들기
                    </div>
                    <div class="modal-body">
                        <form class="form center-block">
                            <div class="create-vote">
                                <input class="form-control" type="text" placeholder="투표 제목">
                                <input class="form-control" type="text" placeholder="투표 주제">
                            </div>
                        </form>
                    </div>
                    <div class="modal-footer">

                    </div>
                </div>
            </div>
        </div>

        <div id="voteResultModal" class="modal fade" tabindex="-1" role="dialog" aria-hidden="true">
            <div class="modal-dialog">
                <div class="modal-content">
                    <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
                        투표 결과
                    </div>
                    <div class="modal-body">
                        <div id="dashboard"></div>
                    </div>
                </div>

            </div>
        </div>
        <!-- script references -->
        <script src="${pageContext.request.contextPath}/resources/custom/js/readVote.js"></script>
        <script src="${pageContext.request.contextPath}/resources/custom/js/voteResult.js"></script>
</body>
</html>
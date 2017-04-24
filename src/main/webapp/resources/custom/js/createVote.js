/**
 * Created by ydh0624 on 2017-04-16.
 */

var CreateVote = {
    categoryList: []

    , init: function () {
        CreateVote.addEventListener();
        CreateVote.drawVoteKind('OX');
        CreateVote.drawVotePeriod('period');
        CreateVote.readData();
    }
    , readData: function () {
        $.ajax({
            url: '/vote/readCategoryList.json'
            , data: {

            }
        }).done(function (data) {
            let rs = data.rs;

            if (rs.isSuccess) {
                if (rs.categoryList != null) {
                    CreateVote.categoryList = rs.categoryList;
                    CreateVote.drawCategory();
                }
            } else {
                alert(rs.resultMessage);
            }
        })
    }
    
    , drawCategory: function () {
        for (let i = 0; i < CreateVote.categoryList.length; i++) {
            $("#categoryList").append('<li class="selectCategory" data-sn="' + CreateVote.categoryList[i].categorySn + '"><a href="#">' + CreateVote.categoryList[i].categoryName + '</a></li>')
        }

        $("#categoryList").children(".selectCategory").on("click", function () {
            console.log(this);
            $("#categoryList").children(".active").removeClass('active');
            $(this).addClass("active");
            console.log($(this).text());
            $("#categoryBtn").html($(this).text());
        });
    }
    
    , addEventListener: function () {
        $(".selectVoteKind").children("[role=presentation]").on("click", function () {
            $(".selectVoteKind").children(".active").removeClass("active");
            $(this).addClass("active");

            CreateVote.drawVoteKind($(this).attr('id'));
        });

        $(".selectVotePeriod").children("[role=presentation]").on("click", function () {
            $(".selectVotePeriod").children(".active").removeClass("active");
            $(this).addClass("active");

            CreateVote.drawVotePeriod($(this).attr('id'));
        });
        
        $("#createButton").on("click", function () {
            CreateVote.createVote();
        })

    }
    
    , createVote: function () {


        let voteName = $("#inputVoteName").val();
        let voteContent = $("#inputVoteContent").val();
        let voteItemList = CreateVote.getVoteItemList();

        let rq = {
            voteName: voteName
            , voteContent: voteContent
            , voteItemList: voteItemList
        };

        console.log(rq);

    }
    , getVoteItemList: function() {
        let voteItemList = [];

        let id = $(".selectVoteKind").children('.active').attr('id');

        if (id == 'OX') {
            let voteItem1 = {
                voteItemName: $("#OItemName").val()
                , photo: '/resources/custom/img/oClipArt.png'
            };

            let voteItem2 = {
                voteItemName: $("XItemName").val()
                , photo: '/resources/custom/img/xClipArt.png'
            };

            voteItemList.push(voteItem1, voteItem2);

        } else if (id == 'likeHate') {
            let voteItem1 = {
                voteItemName: $("#OItemName").val()
                , photo: '/resources/custom/img/like.png'
            };

            let voteItem2 = {
                voteItemName: $("XItemName").val()
                , photo: '/resources/custom/img/hate.png'
            };

            voteItemList.push(voteItem1, voteItem2);
        } else if (id == 'objective') {

        } else if (id == 'image') {

        }

        return voteItemList;

    }

    , drawVoteKind: function (id) {
        var voteKindHtml = '';

        if (id == 'OX') {
            voteKindHtml += '<div class="row">';
            voteKindHtml += '<div class="col-sm-4">';
            voteKindHtml += '<img src="/resources/custom/img/oClipArt.png" class="img-thumbnail" style="width: 300px; height: 300px;">';
            voteKindHtml += '<input class="form-control" id="OItemName" type="text" placeholder="항목 입력" style="width: 300px;">';
            voteKindHtml += '</div>';
            voteKindHtml += '<div class="col-sm-4">';
            voteKindHtml += '<img src="/resources/custom/img/xClipArt.png" class="img-thumbnail" style="width: 300px; height: 300px;">';
            voteKindHtml += '<input class="form-control" id="XItemName" type="text" placeholder="항목 입력" style="width: 300px;">';
            voteKindHtml += '</div>';
            voteKindHtml += '</div>';
        } else if (id == 'likeHate') {
            voteKindHtml += '<div class="row">';
            voteKindHtml += '<div class="col-sm-4">';
            voteKindHtml += '<img src="/resources/custom/img/like.png" class="img-thumbnail" style="width: 300px; height: 300px;">';
            voteKindHtml += '<input class="form-control" id="likeItemName" type="text" placeholder="항목 입력" style="width: 300px;">';
            voteKindHtml += '</div>';
            voteKindHtml += '<div class="col-sm-4">';
            voteKindHtml += '<img src="/resources/custom/img/hate.png" class="img-thumbnail" style="width: 300px; height: 300px;">';
            voteKindHtml += '<input class="form-control" id="hateItemName" type="text" placeholder="항목 입력" style="width: 300px;">';
            voteKindHtml += '</div>';
            voteKindHtml += '</div>';
        } else if (id == 'objective') {
            voteKindHtml += '<button class="btn btn-primary" id="addObjectiveItem">항목 추가</button>';
            voteKindHtml += '<div id="objectiveItemList">';
            voteKindHtml += '<div class="input-group col-sm-6"><input class="form-control objectiveItemName" type="text" placeholder="항목 입력"></div>';
            voteKindHtml += '<div class="input-group col-sm-6"><input class="form-control objectiveItemName" type="text" placeholder="항목 입력"></div>';
            voteKindHtml += '<div class="input-group col-sm-6"><input class="form-control objectiveItemName" type="text" placeholder="항목 입력"></div>';
            voteKindHtml += '<div class="input-group col-sm-6"><input class="form-control objectiveItemName" type="text" placeholder="항목 입력"></div>';
            voteKindHtml += '</div>';
        } else if (id == 'image') {
            voteKindHtml += '<button class="btn btn-primary" id="addImageItem">항목 추가</button>';
            voteKindHtml += '<div id="imageItemList">';
            voteKindHtml += '<div class="col-sm-3">';
            voteKindHtml += '<img src="/resources/custom/img/imageUpload.png" class="img-thumbnail">';
            voteKindHtml += '<input class="form-control" type="text" placeholder="항목 입력" style="width: auto">';
            voteKindHtml += '</div>';
            voteKindHtml += '<div class="col-sm-3">';
            voteKindHtml += '<img src="/resources/custom/img/imageUpload.png" class="img-thumbnail">';
            voteKindHtml += '<input class="form-control" type="text" placeholder="항목 입력" style="width: auto">';
            voteKindHtml += '</div>';
            voteKindHtml += '</div>';
        }

        $("#voteKindTemplate").html(voteKindHtml);

        $("#addObjectiveItem").on("click", function () {
            $("#objectiveItemList").append('<div class="input-group col-sm-6"><input class="form-control objectiveItemName" type="text" placeholder="항목 입력"></div>');
        });

        $("#addImageItem").on("click", function () {
            var temp = '<div class="col-sm-3">';
            temp += '<img src="/resources/custom/img/imageUpload.png" class="img-thumbnail">';
            temp += '<input class="form-control" type="text" placeholder="항목 입력" style="width: auto">';
            temp += '</div>';

            $("#imageItemList").append(temp);
        })
    }
    
    , drawVotePeriod: function (id) {
        let votePeriodHtml = '';

        if (id == 'period') {
            votePeriodHtml += '<div class="row">';
            votePeriodHtml += '시작일 <input type="date" id="startDate">';
            votePeriodHtml += '종료일 <input type="date" id="endDate">';
            votePeriodHtml += '</div>';
        } else if (id == 'count') {
            votePeriodHtml += '<div class="row">';
            votePeriodHtml += '목표 투표수 <input type="number" id="voeTargetCount"> 명';
            votePeriodHtml += '</div>';
        }

        $("#votePeriodTemplate").html(votePeriodHtml);
    }
};

CreateVote.init();
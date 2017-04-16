/**
 * Created by ydh0624 on 2017-04-16.
 */

var CreateVote = {
    init: function () {
        CreateVote.addEventListner();
        CreateVote.drawVoteKind('OX');
    }
    , addEventListner: function () {
        $("[role=presentation]").on("click", function () {
            $(".active").removeClass("active");
            $(this).addClass("active");

            CreateVote.drawVoteKind($(this).attr('id'));
        });

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
};

CreateVote.init();
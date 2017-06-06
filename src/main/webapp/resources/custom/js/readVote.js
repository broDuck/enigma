
$(document).ready(function(){/* off-canvas sidebar toggle */

$('[data-toggle=offcanvas]').click(function() {
  	$(this).toggleClass('visible-xs text-center');
    $(this).find('i').toggleClass('glyphicon-chevron-right glyphicon-chevron-left');
    $('.row-offcanvas').toggleClass('active');
    $('#lg-menu').toggleClass('hidden-xs').toggleClass('visible-xs');
    $('#xs-menu').toggleClass('visible-xs').toggleClass('hidden-xs');
    $('#btnShow').toggle();
});
});

var ReadVote = {
    voteList: []
    , selectVoteSn: 0
    , selectVoteItemSn: 0
    , init : function () {
        ReadVote.readVoteList();
        ReadVote.attachEvent();
    }
    , attachEvent: function () {
        $("#signout").on("click", function () {
            ReadVote.signout();
        });
    }
    , readVoteList: function () {
        var rq = {};

        $.ajax({
            url: '/vote/readVoteList.json'
            , data: {
                rq: JSON.stringify(rq)
            }
        }).done(function (data) {
            rs = data.rs;
            if (rs.isSuccess) {
                ReadVote.voteList = rs.voteList;
                ReadVote.drawVote();
                console.log(ReadVote.voteList);
            } else {
                alert(rs.resultMessage);
            }
        });
    }
    , drawVote: function () {
        var result = "";

        for (var i = 0; i < ReadVote.voteList.length; i++) {
            var vote = ReadVote.voteList[i];

            var voteHtml = '<div class="panel panel-default vote" data-sn="' + vote.voteSn + '">';
            voteHtml += '<div class="panel-heading">';
            voteHtml += '<h4>' + vote.voteName + '</h4>';
            voteHtml += '<div class="clearfix"></div>';
            voteHtml += '<hr>' + vote.content + '<hr>';
            voteHtml += '<div class="row">';


            for (var j = 0; j < vote.voteItemList.length; j++) {
                var voteItem = vote.voteItemList[j];


                if (voteItem.photo !== null) {
                    voteHtml += '<div class="col-sm-3 voteItemArea">';
                    voteHtml += '<img src="' + voteItem.photo + '" class="img-thumbnail img-vote">';
                } else {
                    voteHtml += '<div class="row voteItemArea">';
                }

                voteHtml += '<input type="radio" class="voteItem" name="voteItem" value="' + voteItem.voteItemSn + '">' + voteItem.voteItemName;

                voteHtml += '</div>';
            }

            voteHtml += '</div></div>';

            voteHtml += '<button class="btn btn-primary voteClick">투표하기</button>';
            voteHtml += '</div>';

            result += voteHtml;
        }

        $("#voteList").html(result);

        $(".voteItemArea").on("click", function () {
            $(this).children('.voteItem').attr('checked', 'checked');
        });

        $(".voteClick").on("click", function () {
            ReadVote.selectVoteSn = $(".voteItem:checked").parents(".vote").attr("data-sn");
            ReadVote.selectVoteItemSn = $(".voteItem:checked").val();

            if (ReadVote.selectVoteItemSn == 'undefined') {
                alert('항목을 선택해주세요.');
            } else {
                $.ajax({
                    url: '/vote/vote.json'
                    , data: {
                        rq: JSON.stringify({
                            voteSn: ReadVote.selectVoteSn
                            , voteItemSn: ReadVote.selectVoteItemSn
                        })
                    }
                }).done(function (data) {
                    var rs = data.rs;

                    alert(rs.resultMessage);
                });
            }
        });
    }
    , signout: function () {
        $.ajax({
            url: '/login/signoutProcess.json'
        }).done(function (data) {
            if (data.rs.isSuccess) {
                location.href = "/login/signin";
            }
        })
    }
};

ReadVote.init();
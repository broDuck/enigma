
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
            voteHtml += '<span class="navbar-right">' + vote.categoryName;
            voteHtml += '<button class="btn btn-sm btn-primary resultButton" data-sn="' + vote.voteSn + '" data-toggle="modal" data-target="#voteResultModal">결과보기</button></span>';

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

        $(".resultButton").on("click", function () {
            console.log($(this).attr('data-sn'));

            $.ajax({
                url: '/vote/readVoteResult.json'
                , data: {
                    rq: JSON.stringify({
                        voteSn: $(this).attr('data-sn')
                    })
                }
            }).done(function (data) {
                var rs = data.rs;

                if (rs.isSuccess) {
                    freqData = [];

                    var list = rs.resultList;

                    console.log(rs);

                    for (var i = 0; i < list.length; i++) {
                        var detail = list[i].rankList;

                        detail.sort(function (a, b) {
                            return b - a;
                        });

                        var first = detail[0] == 'undefined' ? 0 : detail[0].voteCount;
                        var second = detail[1] == 'undefined' ? 0 : detail[1].voteCount;
                        var third = detail[2] == 'undefined' ? 0 : detail[2].voteCount;

                        var fName = {
                            "first": "1위"
                            , "second": "2위"
                            , "third": "3위"
                        };

                        var obj = {
                            State: list[i].voteItemName
                            , freq: {
                                first: first
                                , second: second
                                , third: third
                            }
                            , freqName: {
                                'first': detail[0].detailName
                                , 'second': detail[1].detailName
                                , 'third': detail[2].detailName
                            }
                        };

                        freqData.push(obj);
                    }

                    $("#dashboard").html("");
                    dashboard('#dashboard', freqData, fName);
                } else {
                    alert(rs.resultMessage);
                }
            });
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
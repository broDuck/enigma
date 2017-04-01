/**
 * 로그인 js
 * Created by ydh0624 on 2017-04-01.
 */

var Signin = {
    init: function () {
        Signin.attachEvent();
    }
    , attachEvent: function () {
        $("#signin").on("click", function () {
            Signin.signinProcess();
        });
    }
    , signinProcess: function () {
        var email = $("#inputEmail").val();
        var password = $("#inputPassword").val();

        $.ajax({
            url: '/login/signinProcess.json'
            , data: {
                rq: JSON.stringify({
                    email: email
                    , password: password
                })
            }
        }).done(function (data) {
            console.log(data.rs);
        });
    }
};

Signin.init();

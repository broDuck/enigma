/**
 * Created by broduck on 2017. 4. 6..
 */
var Signup = {
    init: function () {
        Signup.attachEvent();
    }
    , attachEvent: function () {
        $("#signup").on("click", function () {
            Signup.signupProcess();
        });
    }
    , signupProcess: function () {
        var maleYn = false;
        var value = $("[name=sex]:checked").val();
        maleYn = value === "male";

        $.ajax({
            url: '/login/signupProcess.json'
            , data: {
                email: $("#inputEmail").val()
                , password: $("#inputPassword").val()
                , age: $("#inputAge").val()
                , maleYn: maleYn
            }
        }).done(function (data) {
            var rs = data.rs;
            if (rs.isSuccess) {
                alert("Good");
            } else {
                alert(rs.resultMessage);
            }
        });
    }
};

Signup.init();
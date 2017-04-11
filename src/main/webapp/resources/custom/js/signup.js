/**
 * Created by broduck on 2017. 4. 6..
 */
let Signup = {
    init: function () {
        Signup.attachEvent();
    }
    , attachEvent: function () {
        $("#signup").on("click", function () {
            Signup.signupProcess();
        });
    }
    , signupProcess: function () {
        let maleYn = false;
        let value = $("[name=sex]:checked").val();
        maleYn = value === "male";

        $.ajax({
            url: '/login/signupProcess.json'
            , data: {
                email: $("#inputEmail").val()
                , password: $("#inputPassword").val()
                , age: $("#inputAge").val()
                , nickName: $("#inputNickName").val()
                , maleYn: maleYn
            }
        }).done(function (data) {
            let rs = data.rs;
            if (rs.isSuccess) {
                alert("Good");
            } else {
                alert(rs.resultMessage);
            }
        });
    }
};

Signup.init();
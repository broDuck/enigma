/**
 * Created by broduck on 2017-05-10.
 */

var Util = {
    ajax: function (url, rq) {
        url += ".json";

        $.ajax({
            url: url
            , data: {
                rq: JSON.stringify(rq)
            }
        }).done(function (data) {
            var rs = data.rs;
            if (rs.isSuccess) {
                return rs;
            } else {
                alert(rs.resultMessage);
            }
        });

        return false;
    }  
};


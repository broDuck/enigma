package com.broduck.enigma.common;

import com.broduck.enigma.model.LoginInfo;

/**
 * Broduck 최상위 컨트롤러 Rq
 * Created by ydh0624 on 2017-03-27.
 */
public class BroduckControllerRq {
    protected static final String RQ_KEY = "rq";

    protected LoginInfo loginInfo;
    protected int loginSn;

    public LoginInfo getLoginInfo() {
        return loginInfo;
    }

    public void setLoginInfo(LoginInfo loginInfo) {
        this.loginInfo = loginInfo;
    }

    public int getLoginSn() {
        return loginSn;
    }

    public void setLoginSn(int loginSn) {
        this.loginSn = loginSn;
    }
}

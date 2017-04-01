package com.broduck.enigma.controller.rqrs;

/**
 * 로그인 프로세스 rq
 * Created by ydh0624 on 2017-04-01.
 */
public class SigninProcessRq extends EnigmaControllerRq {
    private String email;
    private String password;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

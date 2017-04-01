package com.broduck.enigma.controller.rqrs;

import com.broduck.enigma.common.BroduckControllerRs;

/**
 * enigma 컨트롤러 rs
 * Created by ydh0624 on 2017-03-28.
 */
public class EnigmaControllerRs extends BroduckControllerRs {
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

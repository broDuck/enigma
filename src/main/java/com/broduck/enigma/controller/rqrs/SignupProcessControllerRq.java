package com.broduck.enigma.controller.rqrs;

/**
 * 회원가입 rq
 * Created by broduck on 2017. 4. 6..
 */
public class SignupProcessControllerRq extends EnigmaControllerRq {
    private String email;
    private String password;
    private Integer age;
    private Boolean maleYn;

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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Boolean getMaleYn() {
        return maleYn;
    }

    public void setMaleYn(Boolean maleYn) {
        this.maleYn = maleYn;
    }
}

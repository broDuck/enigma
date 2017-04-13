package com.broduck.enigma.model;

import java.io.Serializable;

/**
 * 로그인 정보
 * Created by ydh0624 on 2017-03-28.
 */
public class LoginInfo implements Serializable {
    private static final long serialVersionUID = 42L;

    private String email;
    private Integer memberSn;
    private Integer age;
    private Boolean maleYn;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getMemberSn() {
        return memberSn;
    }

    public void setMemberSn(Integer memberSn) {
        this.memberSn = memberSn;
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

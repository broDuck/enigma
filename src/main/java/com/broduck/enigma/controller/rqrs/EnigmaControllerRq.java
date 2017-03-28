package com.broduck.enigma.controller.rqrs;

import com.broduck.enigma.common.BroduckControllerRq;

/**
 * enigma 컨트롤러 rq
 * Created by ydh0624 on 2017-03-28.
 */
public class EnigmaControllerRq extends BroduckControllerRq {
    private String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}

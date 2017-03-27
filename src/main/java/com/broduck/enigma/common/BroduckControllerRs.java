package com.broduck.enigma.common;

/**
 * BroduckController Rs
 * Created by ydh0624 on 2017-03-27.
 */
public class BroduckControllerRs {
    public static final String RS_KEY = "rs";

    private boolean isSuccess = false;

    private String resultMessage;

    public void setIsSuccess(boolean success) {
        isSuccess = success;
    }

    public void setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
    }
}

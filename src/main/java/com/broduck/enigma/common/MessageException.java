package com.broduck.enigma.common;

/**
 * 메시지 예외 정의
 * Created by broduck on 2017. 4. 6..
 */
public class MessageException extends Exception {
    private String message;

    public MessageException(String message) {
        this.message = message;
    }

    public String getMessage() {
        return this.message;
    }
}

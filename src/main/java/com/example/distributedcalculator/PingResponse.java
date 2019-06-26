package com.example.distributedcalculator;

public class PingResponse {
    private String message;

    public PingResponse(String message) {
        this.message = message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}

package com.company;

public class FailedTransaction extends Exception {
    String errorMessage;
    public FailedTransaction(String message) {
        errorMessage = message;
    }
    public String getMessage() {
        return errorMessage;
    }
}
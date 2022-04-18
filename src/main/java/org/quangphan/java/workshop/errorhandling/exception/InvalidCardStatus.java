package org.quangphan.java.workshop.errorhandling.exception;

public class InvalidCardStatus extends RuntimeException {

    @Override
    public String getMessage() {
        return "Invalid card status";
    }
}

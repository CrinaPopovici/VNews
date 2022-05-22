package org.loose.fis.sre.exceptions;

public class IncorrectCodeException extends Exception{
    private String username;

    public IncorrectCodeException(String username) {

        super(String.format("The code is incorrect ",username));
        this.username = username;

    }

    public String getUsername() {
        return username;
    }
}

package org.loose.fis.sre.exceptions;

public class IncorrectPasswordException extends Exception {

    private String username;

    public IncorrectPasswordException(String username) {
        super(String.format("Incorrect password for '%s'!", username));
        this.username = username;
    }

    public String getUsername() {
        return username;
    }
}

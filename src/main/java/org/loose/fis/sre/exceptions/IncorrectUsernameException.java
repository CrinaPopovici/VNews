package org.loose.fis.sre.exceptions;

public class IncorrectUsernameException extends Exception {

    private String username;

    public IncorrectUsernameException(String username) {
        super(String.format("Account with this username '%s' does not exists!", username));
        this.username = username;
    }

    public String getUsername() {
        return username;
    }
}

package org.loose.fis.sre.exceptions;

public class UsernameAlreadyExistsException extends Exception {

    private String username;

    public UsernameAlreadyExistsException(String username) {
        super(String.format("Account with this username '%s' already exists!", username));
        this.username = username;
    }

    public String getUsername() {
        return username;
    }
}

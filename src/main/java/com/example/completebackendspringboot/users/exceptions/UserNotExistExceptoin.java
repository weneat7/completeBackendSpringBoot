package com.example.completebackendspringboot.users.exceptions;

public class UserNotExistExceptoin extends Exception {
    public UserNotExistExceptoin(String noUsersFound) {
        super(noUsersFound);
    }
}

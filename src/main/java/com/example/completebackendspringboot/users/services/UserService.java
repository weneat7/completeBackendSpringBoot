package com.example.completebackendspringboot.users.services;

import com.example.completebackendspringboot.users.exceptions.UserNotExistExceptoin;
import com.example.completebackendspringboot.users.models.User;

import java.util.List;

public interface UserService {
    public User get(Long id) throws UserNotExistExceptoin;

    public List<User> getAll() throws UserNotExistExceptoin;

    public User create(User user);

    public User update(Long id,User user) throws UserNotExistExceptoin;

    public User replace(Long id,User user) throws UserNotExistExceptoin;

    public User delete(Long id);
}

package com.example.completebackendspringboot.users.services;

import com.example.completebackendspringboot.users.exceptions.UserNotExistExceptoin;
import com.example.completebackendspringboot.users.models.User;
import com.example.completebackendspringboot.users.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class selfUserService implements UserService{
    private UserRepository userRepository;

    @Autowired
    public selfUserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @Override
    public User get(Long id) throws UserNotExistExceptoin {
        return null;
    }

    @Override
    public List<User> getAll() throws UserNotExistExceptoin {
        return null;
    }

    @Override
    public User create(User user) {
        return null;
    }

    @Override
    public User update(Long id, User user) throws UserNotExistExceptoin {
        return null;
    }

    @Override
    public User replace(Long id, User user) throws UserNotExistExceptoin {
        return null;
    }

    @Override
    public User delete(Long id) {
        return null;
    }
}

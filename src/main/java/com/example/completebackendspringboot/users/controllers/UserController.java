package com.example.completebackendspringboot.users.controllers;

import com.example.completebackendspringboot.users.exceptions.UserNotExistExceptoin;
import com.example.completebackendspringboot.users.models.User;
import com.example.completebackendspringboot.users.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/{id}")
    public User getSingleUser(@PathVariable("id") Long id) throws UserNotExistExceptoin {
    return userService.get(id);
    }

    @GetMapping("/")
    public List<User> getAllUsers() throws UserNotExistExceptoin {
      return userService.getAll();
    }

    @PostMapping("/")
    public User createUser(@RequestBody User user){
    return userService.create(user);
    }

    @PatchMapping("/{id}")
    public User updateUser(@PathVariable("id") Long id,@RequestBody User user) {
        return userService.update(id,user);
    }

    @PutMapping("/{id}")
    public User replaceUser(@PathVariable("id") Long id,@RequestBody User user) {
        return userService.replace(id,user);
    }

    @DeleteMapping("/{id}")
    public User deleteUser(@PathVariable("id") Long id) {
        return userService.delete(id);
    }


}

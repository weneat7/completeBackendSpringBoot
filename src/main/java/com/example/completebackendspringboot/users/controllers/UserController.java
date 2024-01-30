package com.example.completebackendspringboot.users.controllers;

import com.example.completebackendspringboot.users.exceptions.UserNotExistExceptoin;
import com.example.completebackendspringboot.users.models.User;
import com.example.completebackendspringboot.users.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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

    @GetMapping("/{id}")        //Done
    public ResponseEntity<User> getSingleUser(@PathVariable("id") Long id) throws UserNotExistExceptoin {
    User user =  userService.get(id);
    return new ResponseEntity<>(user, HttpStatus.OK);
    }

    @GetMapping("/")    //Done
    public ResponseEntity<List<User>> getAllUsers() throws UserNotExistExceptoin {
      List<User>users = userService.getAll();
      return new ResponseEntity<>(users,HttpStatus.OK);
    }

    @PostMapping("/create")    //TODO : Bug in fakestoreapi returning null values only
    public ResponseEntity<User> createUser(@RequestBody User user){
        return new ResponseEntity<>(userService.create(user),HttpStatus.CREATED);
    }

    @PatchMapping("/update/{id}")   //TODO : Not working in fakestoreapi
    public ResponseEntity<User> updateUser(@PathVariable("id") Long id,@RequestBody User user) throws UserNotExistExceptoin {
        return new ResponseEntity<>(userService.update(id,user),HttpStatus.OK);
    }

    @PutMapping("/rep/{id}")        //Done
    public ResponseEntity<User> replaceUser(@PathVariable("id") Long id,@RequestBody User user) throws UserNotExistExceptoin {
        return new ResponseEntity<>(userService.replace(id,user),HttpStatus.OK);
    }

    @DeleteMapping("/del/{id}")     //Done
    public ResponseEntity<User> deleteUser(@PathVariable("id") Long id) {
        return new ResponseEntity<>(userService.delete(id),HttpStatus.OK);
    }


}

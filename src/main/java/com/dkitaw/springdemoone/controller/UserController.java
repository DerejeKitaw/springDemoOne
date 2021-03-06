package com.dkitaw.springdemoone.controller;

import java.util.List;

import com.dkitaw.springdemoone.model.User;
import com.dkitaw.springdemoone.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
private UserService userService;

@Autowired
public UserController(UserService userService){
this.userService= userService;
}

@RequestMapping("/list")
public List<User> userList(){
  return userService.userList();
}
@RequestMapping("/list/{userId}")
public User getUser(@PathVariable String userId){
  return userService.getUser(userId);
}
@RequestMapping("/add")
public User addUser(@RequestBody User user){
  return userService.addUser(user);
}

}
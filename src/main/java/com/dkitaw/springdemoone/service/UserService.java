package com.dkitaw.springdemoone.service;

import java.util.List;

import com.dkitaw.springdemoone.model.User;

public interface UserService {
List<User> userList();
User getUser(String userId);
User addUser(User user);
String deleteUser(Long id);
}
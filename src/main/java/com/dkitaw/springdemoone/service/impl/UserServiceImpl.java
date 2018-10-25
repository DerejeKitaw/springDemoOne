package com.dkitaw.springdemoone.service.impl;

import java.util.List;

import com.dkitaw.springdemoone.model.User;
import com.dkitaw.springdemoone.repository.UserRepository;
import com.dkitaw.springdemoone.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public  class UserServiceImpl implements UserService{
private UserRepository userRepository;

@Autowired
  public UserServiceImpl(UserRepository userRepository) {
    this.userRepository = userRepository;
  }

  @Override
public List<User> userList() {
	return userRepository.findAll();
}


}
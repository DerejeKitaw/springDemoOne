package com.dkitaw.springdemoone.service.impl;

import java.util.List;

import com.dkitaw.springdemoone.model.User;
import com.dkitaw.springdemoone.repository.UserRepository;
import com.dkitaw.springdemoone.service.UserService;
import com.dkitaw.springdemoone.shared.Utils;

import org.modelmapper.ModelMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public  class UserServiceImpl implements UserService{
private UserRepository userRepository;
private Utils utils;

@Autowired
  public UserServiceImpl(UserRepository userRepository,Utils utils) {
    this.userRepository = userRepository;
    this.utils=utils;
  }

@Override
public List<User> userList() {
	return userRepository.findAll();
}

@Override
public User getUser(String userId) {
  User user = userRepository.findByUserId(userId);
  if (user == null)
      try {
        throw new Exception();
      } catch (Exception e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      }
  User returnValue = new User();
  BeanUtils.copyProperties(user, returnValue);
  return returnValue;
}

  @Override
  public User addUser(User user) {
    if (userRepository.findByUserName(user.getUserName()) != null)
    throw new RuntimeException("Record alredy exists");
    ModelMapper modelMapper = new ModelMapper();
    User userEntity = modelMapper.map(user, User.class);

    String publicUserId = utils.generateUserId(30);
    userEntity.setUserId(publicUserId);

    User storedUserDetails = userRepository.save(userEntity);

    User returnValue = modelMapper.map(storedUserDetails, User.class);
    return returnValue;
  }

  @Override
  public String deleteUser(Long id) {
    ///userRepository.delete(id);
    return "{'message':'User deleted'}";
  }


}
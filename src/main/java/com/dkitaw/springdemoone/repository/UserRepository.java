package com.dkitaw.springdemoone.repository;

import com.dkitaw.springdemoone.model.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public  interface UserRepository extends JpaRepository<User, Long>{
  User findByUserId(String userId);
  User findByUserName(String userName);
}
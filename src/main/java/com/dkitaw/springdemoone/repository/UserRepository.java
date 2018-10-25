package com.dkitaw.springdemoone.repository;

import com.dkitaw.springdemoone.model.User;

import org.springframework.data.jpa.repository.JpaRepository;

public  interface UserRepository extends JpaRepository<User, Long>{

}
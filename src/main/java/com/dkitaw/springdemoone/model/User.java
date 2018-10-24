package com.dkitaw.springdemoone.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.data.jpa.domain.AbstractPersistable;

@Entity(name="users")
public class User  implements Serializable{

  private static final long serialVersionUID = 2618053764090934295L;
  @Id
  @GeneratedValue(strategy=GenerationType.IDENTITY)
  private long id;

  private String userId;
  private String userName;
  private String password;
  
  public long getId() {
    return this.id;
  }

  public void setId(long id) {
    this.id = id;
  }
  public String getUserId() {
    return this.userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public String getUserName() {
    return this.userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public String getPassword() {
    return this.password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

}
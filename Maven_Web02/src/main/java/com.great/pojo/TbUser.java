package com.great.pojo;


public class TbUser {

  private long userId;
  private String username;
  private String password;
  private String email;
  private String phone;
  private long userStatus;


  public long getUserId() {
    return userId;
  }

  public void setUserId(long userId) {
    this.userId = userId;
  }


  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }


  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }


  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }


  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }


  public long getUserStatus() {
    return userStatus;
  }

  public void setUserStatus(long userStatus) {
    this.userStatus = userStatus;
  }

}

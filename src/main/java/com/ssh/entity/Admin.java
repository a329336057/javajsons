package com.ssh.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "admin")

public class Admin {

  @Id
  @GeneratedValue
  private Integer id;
  @Column(name = "username")
  private String username;
  @Column(name="password")
  private String password;
  @Column(name = "eamll")
  private String eamll;
  @Column(name="nickname")
  private String nickname;


  public Integer getId() {
    return id;
  }


  public void setId(Integer id) {
    this.id = id;
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


  public String getEamll() {
    return eamll;
  }

  public void setEamll(String eamll) {
    this.eamll = eamll;
  }


  public String getNickname() {
    return nickname;
  }

  public void setNickname(String nickname) {
    this.nickname = nickname;
  }

}

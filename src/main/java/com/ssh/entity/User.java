package com.ssh.entity;


import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name="User")
public class User  implements Serializable {
  @Id
@GeneratedValue
  private long userId;
@Column(name="userName")
  private String userName;
  @Column(name="userPass")
  private String userPass;
  @Column(name="userNickname")
  private String userNickname;
  @Column(name="userEmail")
  private String userEmail;
  @Column(name="userUrl")
  private String userUrl;
  @Column(name="userAvatar")
  private String userAvatar;
  @Column(name="userLastLoginIp")
  private String userLastLoginIp;
  @Column(name="userRegisterTime")
  private java.sql.Timestamp userRegisterTime;
  @Column(name="userLastLoginTime")
  private java.sql.Timestamp userLastLoginTime;
  @Column(name="userStatus")
  private long userStatus;


}

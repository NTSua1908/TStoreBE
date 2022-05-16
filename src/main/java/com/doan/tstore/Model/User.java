package com.doan.tstore.Model;
import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
// import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "user")

public class User {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;

  @Column(length = 40)
  private String name;

  @Column(length = 30)
  private String email;

  @JsonIgnore
  private String password;
  
  private String avatar;

  @ManyToOne
  @JoinColumn(name = "userType", nullable = false, referencedColumnName = "id")
  @JsonManagedReference
  private UserType userType;

  @OneToMany(mappedBy = "user")
  @JsonBackReference
  private List<Bill> lstBills;

  

  public User() {
  }

  public User(long id, String name, String email, String password, String avatar, UserType userType) {
    this.id = id;
    this.name = name;
    this.email = email;
    this.password = password;
    this.avatar = avatar;
    this.userType = userType;
  }

  public long getId() {
    return this.id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getEmail() {
    return this.email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getPassword() {
    return this.password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getAvatar() {
    return this.avatar;
  }

  public void setAvatar(String avatar) {
    this.avatar = avatar;
  }

  public UserType getUserType() {
    return this.userType;
  }

  public void setUserType(UserType userType) {
    this.userType = userType;
  }


  public List<Bill> getLstBills() {
    return this.lstBills;
  }

  public void setLstBills(List<Bill> lstBills) {
    this.lstBills = lstBills;
  }

}

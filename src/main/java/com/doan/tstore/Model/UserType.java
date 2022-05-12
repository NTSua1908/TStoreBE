package com.doan.tstore.Model;
import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "userType")
public class UserType {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;
  @Column(length = 20)
  private String name;
   
  @OneToMany(mappedBy = "userType")
  @JsonBackReference
  private List<User> users;


  public UserType() {
  }

  public UserType(long id, String name, List<User> users) {
    this.id = id;
    this.name = name;
    this.users = users;
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

  public List<User> getUsers() {
    return this.users;
  }

  public void setUsers(List<User> users) {
    this.users = users;
  }

}

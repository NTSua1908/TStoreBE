package com.doan.tstore.Controller;


import java.util.List;

import com.doan.tstore.Model.User;
import com.doan.tstore.Model.Projection.UserProjection;
// import com.doan.tstore.Model.Projection.UserProjection;
import com.doan.tstore.Repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/v1/")
public class UserController {

  @Autowired
  private UserRepository repository;

  // @GetMapping("/user")
  // public List<UserProjection> getAll() {
  //   return repository.findJoined();
  // }

  @GetMapping("/user")
  public List<User> getAll() {
    return repository.findAll();
  }
}
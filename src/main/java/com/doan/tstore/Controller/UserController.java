package com.doan.tstore.Controller;


import java.lang.module.ResolutionException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.doan.tstore.Model.User;
import com.doan.tstore.Model.Projection.UserProjection;
// import com.doan.tstore.Model.Projection.UserProjection;
import com.doan.tstore.Repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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

  @PutMapping("/user/{id}")
  public User updateUserById(@PathVariable Long id, @RequestBody User user) {
    user.setId(id);
    return repository.save(user);
  }

  @DeleteMapping("/user/{id}")
  public ResponseEntity<Map<String, Boolean>> deleteUser(@PathVariable Long id) {
    User user = repository.findById(id).orElseThrow(() -> new ResolutionException("Id not found"));

    repository.delete(user);
    Map<String, Boolean> resp = new HashMap<>();
    resp.put("deleted", Boolean.TRUE);
    return ResponseEntity.ok(resp);
  }

}
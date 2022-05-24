package com.doan.tstore.Controller;

import java.util.List;

import com.doan.tstore.Model.Flatform;
import com.doan.tstore.Repository.FlatformRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin("http://localhost:3000")
@RestController
@RequestMapping("/api/v1/admin")
public class FlatformController {
  @Autowired
  private FlatformRepository repository;

  @GetMapping("/flatform")
  public List<Flatform> getAll() {
    return repository.findAll();
  }
}

package com.doan.tstore.Controller;

import java.util.List;

import com.doan.tstore.Model.Provider;
import com.doan.tstore.Repository.ProviderRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/v1/")
public class ProviderController {

  @Autowired
  private ProviderRepository repository;

  @GetMapping("/provider")
  public List<Provider> getAll() {
    return repository.findAll();
  }
}

package com.doan.tstore.Controller;

import java.util.List;

import com.doan.tstore.Model.GameType;
import com.doan.tstore.Repository.GameTypeRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin("http://localhost:3000")
@RestController
@RequestMapping("/api/v1/")
public class GameTypeController {

  @Autowired
  private GameTypeRepository repository;

  @GetMapping("/gametype")
  public List<GameType> getAll() {
    return repository.findAll();
  }
}

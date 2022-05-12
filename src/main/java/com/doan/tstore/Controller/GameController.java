package com.doan.tstore.Controller;

import java.lang.module.ResolutionException;
import java.util.List;

import com.doan.tstore.Model.Game;
import com.doan.tstore.Repository.GameRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/v1/")
public class GameController {
  
  @Autowired
  private GameRepository repository;

  @GetMapping("/game")
  public List<Game> getAll() {
    return repository.findAll();
  }

  @GetMapping("/game/{id}")
  public ResponseEntity<Game> getEmployeeById(@PathVariable Long id) {
    Game game = repository.findById(id).orElseThrow(() -> new ResolutionException("Id not found"));
    return ResponseEntity.ok(game);
  }

  @PostMapping("/game")
    public Game createEmployee(@RequestBody Game game) {
        return repository.save(game);
    }
}

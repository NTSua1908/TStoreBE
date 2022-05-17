package com.doan.tstore.Controller;

import java.lang.module.ResolutionException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.doan.Convertor.GameConvertor;
import com.doan.tstore.Model.Game;
import com.doan.tstore.Model.Image;
import com.doan.tstore.Model.Entity.GameEntity;
import com.doan.tstore.Repository.GameRepository;
import com.doan.tstore.Repository.ImageRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/v1/")
public class GameController {
  
  @Autowired
  private GameRepository gameRepository;

  @Autowired
  private ImageRepository imageRepository;

  // @Autowired
  private GameConvertor gameConvertor;

  @GetMapping("/game")
  public List<Game> getAll() {
    return gameRepository.findAll();
  }

  @GetMapping("/game/{id}")
  public ResponseEntity<Game> getGameById(@PathVariable Long id) {
    Game game = gameRepository.findById(id).orElseThrow(() -> new ResolutionException("Id not found"));
    return ResponseEntity.ok(game);
  }

  @PostMapping("/game")
  public GameEntity createGame(@RequestBody GameEntity gameEntity) {
    gameConvertor = new GameConvertor();
    Game game = gameConvertor.toGame(gameEntity);
    game = gameRepository.save(game);
    gameRepository.flush();
    // System.out.println(game.getId());

    for (String image : gameEntity.getImages()) {
      Image img = new Image();
      img.setImage(image);
      Game gameImg = new Game();
      gameImg.setId(game.getId());
      img.setGame(gameImg);

      imageRepository.save(img);
    }

    return gameEntity;
  }
  
  @PutMapping("/game/{id}")
  public Game updateGameById(@PathVariable Long id, @RequestBody Game game) {
    game.setId(id);
    return gameRepository.save(game);
  }

  @DeleteMapping("/game/{id}")
  public ResponseEntity<Map<String, Boolean>> deleteGame(@PathVariable Long id) {
    Game game = gameRepository.findById(id).orElseThrow(() -> new ResolutionException("Id not found"));

    gameRepository.delete(game);
    Map<String, Boolean> resp = new HashMap<>();
    resp.put("deleted", Boolean.TRUE);
    return ResponseEntity.ok(resp);
  }
}

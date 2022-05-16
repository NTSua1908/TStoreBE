package com.doan.Convertor;

import com.doan.tstore.Model.Flatform;
import com.doan.tstore.Model.Game;
import com.doan.tstore.Model.GameType;
import com.doan.tstore.Model.Provider;
import com.doan.tstore.Model.Entity.GameEntity;

// import org.springframework.stereotype.Component;

// @Component
public class GameConvertor {
  
  public Game toGame(GameEntity gameEntity) {
    Game game = new Game();
    game.setName(gameEntity.getName());
    game.setThumbnailHorizontal(gameEntity.getThumbnailHorizontal());
    game.setThumbnailVertical(gameEntity.getThumbnailVertical());
    game.setTrailer(gameEntity.getTrailer());
    game.setBanner(gameEntity.getBanner());
    game.setPrice(gameEntity.getPrice());
    game.setQuantity(gameEntity.getQuantity());
    game.setDiscount(gameEntity.getDiscount());
    game.setDeveloper(gameEntity.getDeveloper());
    game.setPublisher(gameEntity.getPublisher());

    Provider provider = new Provider();
    provider.setId(gameEntity.getProviderId());
    game.setProvider(provider);

    Flatform flatform = new Flatform();
    flatform.setId(gameEntity.getFlatformId());
    game.setFlatform(flatform);

    game.setReleaseDate(gameEntity.getReleaseDate());
    game.setExpirationDate(gameEntity.getExpirationDate());
    game.setPositiveReview(gameEntity.getPositiveReview());
    game.setNegativeReview(gameEntity.getNegativeReview());
    game.setOverallReview(gameEntity.getOverallReview());
    game.setDescription(gameEntity.getDescription());
    game.setContent(gameEntity.getContent());
    for (long type_id : gameEntity.getType()) {
      GameType type = new GameType();
      type.setId(type_id);
      game.getTypes().add(type);
    }
    
    return game;
  }
}
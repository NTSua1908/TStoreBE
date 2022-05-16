package com.doan.Convertor;

import com.doan.tstore.Model.Game;
import com.doan.tstore.Model.Image;
import com.doan.tstore.Model.Entity.ImageEntity;

public class ImageConvertor {
  public Image toImage(ImageEntity imageEntity) {
    Image image = new Image();
    image.setImage(imageEntity.getImage());
    Game game = new Game();
    game.setId(imageEntity.getGameId());
    image.setGame(game);

    return image;
  }
}

package com.doan.tstore.Model.Entity;

public class ImageEntity {
  private String image;
  private long gameId;


  public ImageEntity() {
  }

  public ImageEntity(String image, long gameId) {
    this.image = image;
    this.gameId = gameId;
  }

  public String getImage() {
    return this.image;
  }

  public void setImage(String image) {
    this.image = image;
  }

  public long getGameId() {
    return this.gameId;
  }

  public void setGameId(long gameId) {
    this.gameId = gameId;
  }
}

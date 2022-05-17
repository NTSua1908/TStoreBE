package com.doan.tstore.Model.Entity;

public class HistoryEntity {
  private long id;
  private String name;
  private String img;
  private double discount;
  private double price;


  public HistoryEntity() {
  }

  public HistoryEntity(long id, String name, String img, double discount, double price) {
    this.id = id;
    this.name = name;
    this.img = img;
    this.discount = discount;
    this.price = price;
  }

  public long getId() {
    return this.id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getImg() {
    return this.img;
  }

  public void setImg(String img) {
    this.img = img;
  }

  public double getDiscount() {
    return this.discount;
  }

  public void setDiscount(double discount) {
    this.discount = discount;
  }

  public double getPrice() {
    return this.price;
  }

  public void setPrice(double price) {
    this.price = price;
  }
}

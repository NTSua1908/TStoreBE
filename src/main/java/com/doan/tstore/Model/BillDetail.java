package com.doan.tstore.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "billdetail")
public class BillDetail {
  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;

  @ManyToOne
  @JoinColumn(name = "billId", nullable = false, referencedColumnName = "id")
  @JsonBackReference
  private Bill bill;

  @ManyToOne
  @JoinColumn(name = "gameId", nullable = false, referencedColumnName = "id")
  @JsonManagedReference
  private Game game;

  private double price;


  public BillDetail() {
  }

  public BillDetail(long id, Bill bill, Game game, double price) {
    this.id = id;
    this.bill = bill;
    this.game = game;
    this.price = price;
  }

  public long getId() {
    return this.id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public Bill getBill() {
    return this.bill;
  }

  public void setBill(Bill bill) {
    this.bill = bill;
  }

  public Game getGame() {
    return this.game;
  }

  public void setGame(Game game) {
    this.game = game;
  }

  public double getPrice() {
    return this.price;
  }

  public void setPrice(double price) {
    this.price = price;
  }
}

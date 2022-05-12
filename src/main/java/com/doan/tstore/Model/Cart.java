package com.doan.tstore.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "cart")
public class Cart {
  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;

  private long user_id;

  @ManyToOne
  @JoinColumn(name = "gameId", nullable = false, referencedColumnName = "id")
  @JsonManagedReference
  private Game game;


  public Cart() {
  }

  public Cart(long id, long user_id, Game game) {
    this.id = id;
    this.user_id = user_id;
    this.game = game;
  }

  public long getId() {
    return this.id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public long getUser_id() {
    return this.user_id;
  }

  public void setUser_id(long user_id) {
    this.user_id = user_id;
  }

  public Game getGame() {
    return this.game;
  }

  public void setGame(Game game) {
    this.game = game;
  }
}

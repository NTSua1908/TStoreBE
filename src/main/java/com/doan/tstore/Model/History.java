package com.doan.tstore.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "history")
public class History {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;

  @ManyToOne
  @JoinColumn(name = "gameId", nullable = false, referencedColumnName = "id")
  @JsonManagedReference
  private Game game;

  @ManyToOne
  @JoinColumn(name = "userId", nullable = false, referencedColumnName = "id")
  // @JsonIgnore
  private User user;


  public History() {
  }

  public History(long id, Game game, User user) {
    this.id = id;
    this.game = game;
    this.user = user;
  }

  public long getId() {
    return this.id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public Game getGame() {
    return this.game;
  }

  public void setGame(Game game) {
    this.game = game;
  }

  public User getUser() {
    return this.user;
  }

  public void setUser(User user) {
    this.user = user;
  }

}

package com.doan.tstore.Model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "flatform")
public class Flatform {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;
  private String name;

  @OneToMany(mappedBy = "flatform")
  @JsonBackReference
  private List<Game> games;


  public Flatform() {
  }

  public Flatform(long id, String name, List<Game> games) {
    this.id = id;
    this.name = name;
    this.games = games;
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

  public List<Game> getGames() {
    return this.games;
  }

  public void setGames(List<Game> games) {
    this.games = games;
  }
}

package com.doan.tstore.Repository;

import com.doan.tstore.Model.Game;

import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {
  
}

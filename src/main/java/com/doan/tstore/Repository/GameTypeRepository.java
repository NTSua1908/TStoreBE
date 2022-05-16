package com.doan.tstore.Repository;

import com.doan.tstore.Model.GameType;

import org.springframework.data.jpa.repository.JpaRepository;

public interface GameTypeRepository extends JpaRepository<GameType, Long> {
  
}

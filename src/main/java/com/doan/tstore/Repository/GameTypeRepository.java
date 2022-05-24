package com.doan.tstore.Repository;

import com.doan.tstore.Model.GameType;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GameTypeRepository extends JpaRepository<GameType, Long> {
  
}

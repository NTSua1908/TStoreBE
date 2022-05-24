package com.doan.tstore.Repository;

import java.util.List;

import com.doan.tstore.Model.History;
import com.doan.tstore.Model.Projection.HistoryProjection;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface HistoryRepository extends JpaRepository<History, Long>{
  List<History> findByUser_id(long id);

  @Query("SELECT g.name as name, g.thumbnailVertical as img, g.price as price, " +
  " g.discount as discount, g.id as id " +
  " FROM History h join User u ON h.user.id = u.id " + 
  " join Game g on h.game.id = g.id " + 
  " WHERE u.id = :userId")
  List<HistoryProjection> getHistoryByUserId(@Param("userId") Long userId);
}

package com.doan.tstore.Repository;

import com.doan.tstore.Model.Flatform;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FlatformRepository extends JpaRepository<Flatform, Long>{
  
}

package com.doan.tstore.Repository;

import com.doan.tstore.Model.UserType;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserTypeRepository extends JpaRepository<UserType, Long>{
  
}

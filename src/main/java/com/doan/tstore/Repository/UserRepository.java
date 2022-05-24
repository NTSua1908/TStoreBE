package com.doan.tstore.Repository;

import java.util.List;

import com.doan.tstore.Model.User;
import com.doan.tstore.Model.Projection.UserProjection;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
  @Query( "SELECT u.id as id, u.name as name," + 
  " u.email as email, u.avatar as avatar, t.name as type " +
  " FROM User u join UserType t ON u.userType = t.id")
  public List<UserProjection> findJoined();

  User findOneByEmail(String email);
}


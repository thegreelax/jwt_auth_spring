package com.jwtauth.JWT.Auth.repository;

import com.jwtauth.JWT.Auth.model.DAOUser;
import com.jwtauth.JWT.Auth.model.DTOUser;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<DAOUser, Integer> {
    @Query("SELECT u FROM DAOUser u where u.username = :username")
    DAOUser findByUsername(@Param("username") String username);
}

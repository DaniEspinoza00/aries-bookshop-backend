package com.example.demo.Users.User;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface UserRepository extends JpaRepository <User,Integer>{
    Optional<User> findByUsername(String username);

    @Modifying
    @Query("update User u set u.username=:username, u.firstname=:firstname, u.lastname=:lastname, u.country=:country where u.id = :id")
    void updateUser(@Param("id") Integer id,
                    @Param("username") String username,
                    @Param("firstname") String firstname,
                    @Param("lastname") String lastname,
                    @Param("country") String country);
}

package com.cristian.chat.chat_springboot.persistence.repositories;

import com.cristian.chat.chat_springboot.persistence.entities.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
    @Query(value = "SELECT * FROM user WHERE username = :username", nativeQuery = true)
    Optional<UserEntity> findByUsername(String username);

    @Query("SELECT u.username FROM UserEntity u")
    List<String> getAllUsernames();
}


package com.example.completebackendspringboot.users.repositories;

import com.example.completebackendspringboot.users.exceptions.UserNotExistExceptoin;
import com.example.completebackendspringboot.users.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    @Override
    Optional<User> findById(Long id) ;

    List<User> getAll() ;

}

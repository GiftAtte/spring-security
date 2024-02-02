package com.royalbrains.springsecurity.entities.repositories;

import com.royalbrains.springsecurity.entities.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {
}

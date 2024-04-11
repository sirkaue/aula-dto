package com.sirkaue.auladto.repositories;

import com.sirkaue.auladto.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}

package com.sequoia.bond.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.sequoia.bond.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {}
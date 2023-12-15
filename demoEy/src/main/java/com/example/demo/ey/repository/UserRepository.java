package com.example.demo.ey.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.ey.models.User;

public interface UserRepository extends JpaRepository<User, String> {
	Optional<User> findByEmail(String email);

	Boolean existsByEmail(String email);

	Optional<User> findByToken(String token);
}

package com.example.demo.ey.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.ey.models.Phones;

public interface PhonesRepository extends JpaRepository<Phones, String> {

}

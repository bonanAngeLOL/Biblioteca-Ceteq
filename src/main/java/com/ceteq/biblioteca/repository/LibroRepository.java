package com.ceteq.biblioteca.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ceteq.biblioteca.model.LibroModel;

public interface LibroRepository extends JpaRepository<LibroModel, Integer> {

}

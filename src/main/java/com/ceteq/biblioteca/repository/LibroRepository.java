package com.ceteq.biblioteca.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ceteq.biblioteca.model.LibroModel;

@Repository
public interface LibroRepository extends JpaRepository<LibroModel, Integer> {

}
